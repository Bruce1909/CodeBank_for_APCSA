/**
 * MOD3A1_Err.java
 * 
 * This program demonstrates common errors when data encapsulation is not properly implemented
 * as described in MOD-3.A.1: Data encapsulation is a technique in which the implementation
 * details of a class are kept hidden from the user.
 */
public class MOD3A1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors in data encapsulation (MOD-3.A.1):\n");
        
        // Create an instance of BankAccountWithErrors with non-encapsulated data
        BankAccountWithErrors account = new BankAccountWithErrors("John Doe", 1000.0);
        
        // ERROR 1: Directly accessing internal data
        System.out.println("ERROR 1: Directly accessing internal data:");
        System.out.println("Owner: " + account.ownerName);  // Direct access to internal data
        System.out.println("Balance: $" + account.balance);  // Direct access to internal data
        
        // ERROR 2: Directly modifying internal data without validation
        System.out.println("\nERROR 2: Directly modifying internal data without validation:");
        account.balance = -500.0;  // Setting an invalid negative balance
        System.out.println("Balance after invalid modification: $" + account.balance);
        
        // ERROR 3: No control over data integrity
        System.out.println("\nERROR 3: No control over data integrity:");
        account.ownerName = "";  // Setting an empty name
        System.out.println("Owner after invalid modification: '" + account.ownerName + "'");
        
        // Create another instance to demonstrate problems with non-encapsulated implementation
        BankAccountWithErrors anotherAccount = new BankAccountWithErrors("Jane Smith", 2000.0);
        
        // ERROR 4: External code depends on internal implementation
        System.out.println("\nERROR 4: External code depends on internal implementation:");
        // If the internal implementation changes, this code will break
        anotherAccount.transactionHistory.add("Initial deposit: $2000.0");  // Direct manipulation of internal data structure
        System.out.println("Manipulated internal data structure directly");
        
        System.out.println("\n--- Problems with Poor Encapsulation ---");
        System.out.println("1. Internal data can be accessed directly");
        System.out.println("2. Internal data can be modified without validation");
        System.out.println("3. Data integrity cannot be maintained");
        System.out.println("4. Changes to internal implementation will break client code");
        System.out.println("5. Business rules cannot be enforced");
    }
}

/**
 * Class that demonstrates poor data encapsulation
 */
class BankAccountWithErrors {
    // ERROR: Public instance variables expose implementation details
    public String ownerName;
    public double balance;
    public java.util.ArrayList<String> transactionHistory;
    
    // Constructor
    public BankAccountWithErrors(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.transactionHistory = new java.util.ArrayList<>();
    }
    
    // Methods that don't properly encapsulate data
    public void deposit(double amount) {
        // No validation
        balance += amount;
        transactionHistory.add("Deposit: $" + amount);
    }
    
    public void withdraw(double amount) {
        // No validation
        balance -= amount;
        transactionHistory.add("Withdrawal: $" + amount);
    }
    
    // ERROR: Internal implementation details exposed
    public void printTransactionHistory() {
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
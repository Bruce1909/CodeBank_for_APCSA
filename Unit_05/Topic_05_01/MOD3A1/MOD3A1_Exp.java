/**
 * MOD3A1_Exp.java
 * 
 * This program demonstrates data encapsulation as described in MOD-3.A.1:
 * Data encapsulation is a technique in which the implementation details of a class
 * are kept hidden from the user.
 */
public class MOD3A1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating data encapsulation (MOD-3.A.1):\n");
        
        // Create an instance of BankAccount with encapsulated data
        BankAccount account = new BankAccount("John Doe", 1000.0);
        
        // Access data through public methods
        System.out.println("Account Information:");
        System.out.println("Owner: " + account.getOwnerName());
        System.out.println("Balance: $" + account.getBalance());
        
        // Modify data through public methods
        System.out.println("\nDepositing $500...");
        account.deposit(500.0);
        System.out.println("New Balance: $" + account.getBalance());
        
        System.out.println("\nWithdrawing $200...");
        account.withdraw(200.0);
        System.out.println("New Balance: $" + account.getBalance());
        
        // Cannot access private data directly
        System.out.println("\nAttempting to access private data directly (commented out):");
        // System.out.println(account.ownerName);  // Error: ownerName has private access
        // System.out.println(account.balance);    // Error: balance has private access
        // account.balance = -1000;               // Error: balance has private access
        
        System.out.println("\n--- Key Points about Data Encapsulation ---");
        System.out.println("1. Implementation details are hidden from the user");
        System.out.println("2. Data is accessed through public methods");
        System.out.println("3. Data integrity is maintained (e.g., balance cannot be negative)");
        System.out.println("4. Internal implementation can change without affecting client code");
    }
}

/**
 * Class that demonstrates data encapsulation
 */
class BankAccount {
    // Private instance variables - hidden implementation details
    private String ownerName;
    private double balance;
    
    // Constructor
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = (initialBalance > 0) ? initialBalance : 0;
    }
    
    // Public accessor method (getter)
    public String getOwnerName() {
        return ownerName;
    }
    
    // Public accessor method (getter)
    public double getBalance() {
        return balance;
    }
    
    // Public mutator method (setter with validation)
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    // Public methods to modify data with business rules
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    // Private helper method - internal implementation detail
    private void updateAccountStatus() {
        // Implementation details hidden from users
        System.out.println("This method is private and not accessible from outside");
    }
}
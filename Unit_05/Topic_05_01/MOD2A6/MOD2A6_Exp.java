/**
 * MOD2A6_Exp.java
 * 
 * This program demonstrates the correct usage of public and private methods
 * as described in MOD-2.A.6: Access to behaviors can be internal or external to the class.
 * Therefore, methods can be designated as either public or private.
 */
public class MOD2A6_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating public and private methods (MOD-2.A.6):\n");
        
        // Create an instance of BankAccount
        BankAccount account = new BankAccount("John Smith", 1000.00);
        
        // Access public methods (external behaviors)
        System.out.println("Accessing public methods (external behaviors):");
        account.displayAccountInfo();
        
        // Deposit and withdraw using public methods
        System.out.println("\nPerforming transactions using public methods:");
        account.deposit(500.00);
        account.withdraw(200.00);
        account.displayAccountInfo();
        
        // Cannot access private methods directly
        System.out.println("\nAttempting to access private methods directly (commented out):");
        // account.updateTransactionLog("Direct update"); // Error: private method
        // account.calculateInterest();                   // Error: private method
        
        // Public methods can call private methods internally
        System.out.println("\nCalling a public method that uses private methods internally:");
        account.applyMonthlyInterest();
        account.displayAccountInfo();
        
        System.out.println("\n--- Key Points about Public and Private Methods ---");
        System.out.println("1. Public methods provide the external interface of a class");
        System.out.println("2. Private methods implement internal functionality");
        System.out.println("3. Public methods can call private methods");
        System.out.println("4. Private methods cannot be called from outside the class");
        System.out.println("5. Methods should be private unless they need to be accessed externally");
    }
}

/**
 * Class that demonstrates proper use of public and private methods
 */
class BankAccount {
    // Private instance variables
    private String ownerName;
    private double balance;
    private String[] transactionLog;
    private int transactionCount;
    private static final double INTEREST_RATE = 0.03; // 3% annual interest
    
    // Public constructor
    public BankAccount(String ownerName, double initialDeposit) {
        this.ownerName = ownerName;
        this.balance = initialDeposit;
        this.transactionLog = new String[100]; // Space for 100 transactions
        this.transactionCount = 0;
        
        // Call private method from constructor
        updateTransactionLog("Initial deposit: $" + initialDeposit);
        System.out.println("Bank account created for " + ownerName);
    }
    
    // Public method - external behavior
    public void displayAccountInfo() {
        System.out.println("\nAccount Information:");
        System.out.println("Owner: " + ownerName);
        System.out.println("Current Balance: $" + String.format("%.2f", balance));
        displayRecentTransactions(3); // Call private method with parameter
    }
    
    // Public method - external behavior
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            updateTransactionLog("Deposit: $" + String.format("%.2f", amount));
            System.out.println("Deposited $" + String.format("%.2f", amount));
        } else {
            System.out.println("Error: Deposit amount must be positive");
        }
    }
    
    // Public method - external behavior
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                updateTransactionLog("Withdrawal: $" + String.format("%.2f", amount));
                System.out.println("Withdrew $" + String.format("%.2f", amount));
            } else {
                System.out.println("Error: Insufficient funds");
            }
        } else {
            System.out.println("Error: Withdrawal amount must be positive");
        }
    }
    
    // Public method that uses private methods internally
    public void applyMonthlyInterest() {
        double interest = calculateInterest();
        balance += interest;
        updateTransactionLog("Interest applied: $" + String.format("%.2f", interest));
        System.out.println("Monthly interest applied: $" + String.format("%.2f", interest));
    }
    
    // Private method - internal behavior
    private double calculateInterest() {
        // Calculate monthly interest (annual rate / 12)
        return balance * (INTEREST_RATE / 12);
    }
    
    // Private method - internal behavior
    private void updateTransactionLog(String transaction) {
        if (transactionCount < transactionLog.length) {
            transactionLog[transactionCount] = transaction;
            transactionCount++;
        } else {
            // Shift transactions to make room for new one
            for (int i = 0; i < transactionLog.length - 1; i++) {
                transactionLog[i] = transactionLog[i + 1];
            }
            transactionLog[transactionLog.length - 1] = transaction;
        }
    }
    
    // Private method - internal behavior
    private void displayRecentTransactions(int count) {
        System.out.println("Recent Transactions:");
        if (transactionCount == 0) {
            System.out.println("No transactions yet");
            return;
        }
        
        int start = Math.max(0, transactionCount - count);
        for (int i = start; i < transactionCount; i++) {
            System.out.println("- " + transactionLog[i]);
        }
    }
}
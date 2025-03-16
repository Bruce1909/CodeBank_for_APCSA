/**
 * MOD2A6_Err.java
 * 
 * This program demonstrates common errors related to public and private methods
 * as described in MOD-2.A.6: Access to behaviors can be internal or external to the class.
 * Therefore, methods can be designated as either public or private.
 */
public class MOD2A6_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with public and private methods (MOD-2.A.6):\n");
        
        // Create an instance of BankAccountWithErrors
        BankAccountWithErrors account = new BankAccountWithErrors("Jane Doe", 1500.00);
        
        // ERROR 1: Accessing methods that should be private
        System.out.println("Error 1: Accessing methods that should be private:");
        // These methods expose internal implementation details
        account.calculateInterest(); // Should be private
        account.updateTransactionLog("Direct external update"); // Should be private
        
        // ERROR 2: Internal implementation details exposed through public methods
        System.out.println("\nError 2: Internal implementation details exposed:");
        System.out.println("Interest calculation formula exposed: " + account.getInterestRate());
        account.setInterestRate(0.05); // Should not be allowed to change this externally
        System.out.println("Interest rate changed externally to: " + account.getInterestRate());
        
        // ERROR 3: Public methods not validating input
        System.out.println("\nError 3: Public methods not validating input:");
        account.deposit(-200.00); // Should validate that amount is positive
        account.withdraw(2000.00); // Should validate that there are sufficient funds
        account.displayAccountInfo();
        
        // Create an instance of AccountManager to demonstrate improper method access
        System.out.println("\nDemonstrating improper method access from another class (AccountManager):");
        AccountManager manager = new AccountManager();
        manager.demonstrateImproperAccess(account);
        
        System.out.println("\n--- Common Errors with Public and Private Methods ---");
        System.out.println("1. Making internal implementation methods public");
        System.out.println("2. Exposing internal details that should be hidden");
        System.out.println("3. Not validating input in public methods");
        System.out.println("4. Allowing external classes to modify internal state directly");
        System.out.println("5. Not using private methods for internal operations");
    }
}

/**
 * Class that demonstrates errors in method access control
 */
class BankAccountWithErrors {
    // Private instance variables
    private String ownerName;
    private double balance;
    private String[] transactionLog;
    private int transactionCount;
    private double interestRate = 0.03; // 3% annual interest
    
    // Public constructor
    public BankAccountWithErrors(String ownerName, double initialDeposit) {
        this.ownerName = ownerName;
        this.balance = initialDeposit;
        this.transactionLog = new String[100];
        this.transactionCount = 0;
        updateTransactionLog("Initial deposit: $" + initialDeposit);
        System.out.println("Bank account created for " + ownerName);
    }
    
    // Public method - external behavior
    public void displayAccountInfo() {
        System.out.println("\nAccount Information:");
        System.out.println("Owner: " + ownerName);
        System.out.println("Current Balance: $" + String.format("%.2f", balance));
        displayRecentTransactions(3);
    }
    
    // ERROR: Method that should be private is public
    public void displayRecentTransactions(int count) {
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
    
    // Public method - external behavior, but missing validation
    public void deposit(double amount) {
        // ERROR: No validation of input
        balance += amount; // This allows negative deposits
        updateTransactionLog("Deposit: $" + String.format("%.2f", amount));
        System.out.println("Deposited $" + String.format("%.2f", amount));
    }
    
    // Public method - external behavior, but missing validation
    public void withdraw(double amount) {
        // ERROR: No validation of input
        balance -= amount; // This allows withdrawing more than the balance
        updateTransactionLog("Withdrawal: $" + String.format("%.2f", amount));
        System.out.println("Withdrew $" + String.format("%.2f", amount));
    }
    
    // ERROR: Method that should be private is public
    public double calculateInterest() {
        // This internal calculation should not be directly accessible
        return balance * (interestRate / 12);
    }
    
    // ERROR: Method that should be private is public
    public void updateTransactionLog(String transaction) {
        // This internal operation should not be directly accessible
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
    
    // ERROR: Exposing internal details through getters and setters
    public double getInterestRate() {
        return interestRate;
    }
    
    // ERROR: Allowing external modification of what should be a constant
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }
}

/**
 * Class that demonstrates improper access to another class's methods
 */
class AccountManager {
    public void demonstrateImproperAccess(BankAccountWithErrors account) {
        // ERROR: Accessing methods that should be private
        System.out.println("AccountManager improperly accessing internal methods:");
        
        // Directly calling what should be private methods
        account.updateTransactionLog("Unauthorized transaction by AccountManager");
        double interest = account.calculateInterest();
        System.out.println("Calculated interest directly: $" + String.format("%.2f", interest));
        
        // Modifying internal state through exposed methods
        System.out.println("\nAccountManager improperly modifying internal state:");
        account.setInterestRate(0.10); // 10% - should not be allowed
        System.out.println("Changed interest rate to: " + account.getInterestRate());
        
        // Bypassing validation that should exist
        System.out.println("\nAccountManager bypassing validation:");
        account.deposit(-500.00); // Should be rejected as invalid
        account.withdraw(5000.00); // Should be rejected if insufficient funds
        
        System.out.println("\nThis demonstrates how improper method access control");
        System.out.println("allows external classes to manipulate internal operations.");
    }
}
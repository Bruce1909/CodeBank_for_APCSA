/**
 * MOD3B12_Exp.java
 * 
 * This program demonstrates MOD-3.B.12: A subclass is usually designed to have modified
 * (overridden) or additional methods or instance variables.
 */
public class MOD3B12_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating subclasses with modified and additional features (MOD-3.B.12):\n");
        
        // Create instances of different account types
        BankAccount basicAccount = new BankAccount("John Doe", "A12345", 1000.0);
        SavingsAccount savingsAccount = new SavingsAccount("Jane Smith", "S67890", 2000.0, 0.03);
        CheckingAccount checkingAccount = new CheckingAccount("Bob Johnson", "C54321", 1500.0, 500.0);
        
        // Demonstrate basic account functionality
        System.out.println("Basic Bank Account:");
        basicAccount.displayInfo();
        basicAccount.deposit(500.0);
        basicAccount.withdraw(200.0);
        basicAccount.displayInfo();
        System.out.println();
        
        // Demonstrate savings account with additional interest rate feature
        System.out.println("Savings Account (with additional interest rate):");
        savingsAccount.displayInfo();
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.addInterest(); // Additional method not in BankAccount
        savingsAccount.displayInfo();
        System.out.println();
        
        // Demonstrate checking account with modified withdraw method and overdraft feature
        System.out.println("Checking Account (with modified withdraw and overdraft):");
        checkingAccount.displayInfo();
        checkingAccount.deposit(100.0);
        System.out.println("Withdrawing $1700 (exceeds balance but within overdraft limit):");
        checkingAccount.withdraw(1700.0); // Modified withdraw method allows overdraft
        checkingAccount.displayInfo();
        System.out.println();
        
        System.out.println("\n--- Key Points about Subclass Design ---");
        System.out.println("1. Subclasses often add new instance variables (e.g., interestRate in SavingsAccount)");
        System.out.println("2. Subclasses often add new methods (e.g., addInterest() in SavingsAccount)");
        System.out.println("3. Subclasses often override methods to modify behavior (e.g., withdraw() in CheckingAccount)");
        System.out.println("4. Subclasses inherit and can use all public methods from the superclass");
        System.out.println("5. This design approach follows the 'is-a' relationship while adding specialization");
    }
}

/**
 * Base BankAccount class
 */
class BankAccount {
    private String ownerName;
    private String accountNumber;
    protected double balance; // Protected to allow direct access in subclasses
    
    public BankAccount(String ownerName, String accountNumber, double initialBalance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
    
    public void displayInfo() {
        System.out.println("Account Owner: " + ownerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
    
    // Getters
    public String getOwnerName() {
        return ownerName;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
}

/**
 * SavingsAccount subclass with additional instance variable and method
 */
class SavingsAccount extends BankAccount {
    // Additional instance variable
    private double interestRate;
    
    public SavingsAccount(String ownerName, String accountNumber, double initialBalance, double interestRate) {
        super(ownerName, accountNumber, initialBalance);
        this.interestRate = interestRate;
    }
    
    // Additional method not in the superclass
    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: $" + interest);
        System.out.println("New balance after interest: $" + balance);
    }
    
    // Override method to include additional information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
    
    // Getter for the additional instance variable
    public double getInterestRate() {
        return interestRate;
    }
    
    // Setter for the additional instance variable
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

/**
 * CheckingAccount subclass with modified method and additional instance variable
 */
class CheckingAccount extends BankAccount {
    // Additional instance variable
    private double overdraftLimit;
    
    public CheckingAccount(String ownerName, String accountNumber, double initialBalance, double overdraftLimit) {
        super(ownerName, accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
    
    // Modified (overridden) method with different behavior
    @Override
    public void withdraw(double amount) {
        // Allow withdrawals up to balance + overdraftLimit
        if (amount > 0 && amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            
            if (balance < 0) {
                System.out.println("Account overdrawn by: $" + Math.abs(balance));
            }
            
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Amount exceeds overdraft limit or is invalid.");
        }
    }
    
    // Override method to include additional information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
        
        if (balance < 0) {
            System.out.println("Account is overdrawn!");
        }
    }
    
    // Getter for the additional instance variable
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    
    // Setter for the additional instance variable
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
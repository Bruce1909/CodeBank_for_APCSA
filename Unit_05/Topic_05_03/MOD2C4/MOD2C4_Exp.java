/**
 * MOD2C4_Exp.java
 * This program demonstrates postconditions in Java methods (MOD-2.C.4).
 * A postcondition is a condition that must always be true after the execution
 * of a section of program code. Postconditions describe the outcome of the
 * execution in terms of what is being returned or the state of an object.
 * 
 * @author AP CSA
 */
public class MOD2C4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating postconditions in Java methods:\n");
        
        // Example 1: Absolute value method with postcondition
        System.out.println("Example 1: Absolute value method with postcondition");
        System.out.println("Postcondition: The return value is always non-negative");
        
        int number1 = 5;
        System.out.println("Calling absoluteValue(" + number1 + ")");
        System.out.println("Result: " + absoluteValue(number1));
        
        int number2 = -10;
        System.out.println("Calling absoluteValue(" + number2 + ")");
        System.out.println("Result: " + absoluteValue(number2));
        System.out.println("The postcondition is satisfied: the result is non-negative\n");
        
        // Example 2: Array sorting method with postcondition
        System.out.println("Example 2: Array sorting method with postcondition");
        System.out.println("Postcondition: The array elements are arranged in ascending order");
        
        int[] array = {5, 2, 8, 1, 9};
        System.out.println("Original array: " + arrayToString(array));
        sortArray(array);
        System.out.println("After sorting: " + arrayToString(array));
        System.out.println("The postcondition is satisfied: the array is sorted\n");
        
        // Example 3: Account withdrawal method with postcondition
        System.out.println("Example 3: Account withdrawal method with postcondition");
        System.out.println("Postcondition: The account balance is reduced by the withdrawal amount");
        System.out.println("                AND the balance remains non-negative");
        
        BankAccount account = new BankAccount("John", 1000.0);
        System.out.println("Initial account: " + account);
        
        double withdrawAmount = 300.0;
        System.out.println("Withdrawing $" + withdrawAmount);
        boolean success = account.withdraw(withdrawAmount);
        System.out.println("Withdrawal successful: " + success);
        System.out.println("Updated account: " + account);
        System.out.println("The postcondition is satisfied: balance reduced and remains non-negative\n");
        
        System.out.println("Key points about postconditions:");
        System.out.println("- Postconditions describe what must be true after a method executes");
        System.out.println("- They specify the expected outcome or state changes");
        System.out.println("- Postconditions are guaranteed when preconditions are met");
        System.out.println("- They help verify that a method works correctly");
        System.out.println("- Postconditions should be documented in method comments");
    }
    
    /**
     * Returns the absolute value of a number.
     * 
     * Postcondition: The return value is always non-negative (>= 0)
     * 
     * @param number the input number
     * @return the absolute value of the input number
     */
    public static int absoluteValue(int number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
        // Postcondition: The returned value is always >= 0
    }
    
    /**
     * Sorts an array in ascending order.
     * 
     * Postcondition: The array elements are arranged in ascending order
     *                (array[i] <= array[i+1] for all valid i)
     * 
     * @param array the array to be sorted
     */
    public static void sortArray(int[] array) {
        // Simple bubble sort implementation
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // Postcondition: array is sorted in ascending order
    }
    
    /**
     * Converts an array to a string representation.
     * 
     * @param array the array to convert
     * @return a string representation of the array
     */
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

/**
 * A simple bank account class to demonstrate postconditions.
 */
class BankAccount {
    private String owner;
    private double balance;
    
    /**
     * Creates a new bank account.
     * 
     * @param owner the account owner's name
     * @param initialBalance the initial account balance
     */
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }
    
    /**
     * Withdraws money from the account.
     * 
     * Precondition: amount > 0
     * Postcondition: If amount <= balance, then balance is reduced by amount
     *                AND the method returns true
     *                If amount > balance, then balance remains unchanged
     *                AND the method returns false
     * 
     * @param amount the amount to withdraw
     * @return true if the withdrawal was successful, false otherwise
     */
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false; // Invalid amount
        }
        
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false; // Insufficient funds
        }
        // Postcondition: balance is reduced by amount if amount <= original balance
        //                balance remains unchanged if amount > original balance
    }
    
    /**
     * Returns a string representation of the account.
     * 
     * @return a string representation of the account
     */
    @Override
    public String toString() {
        return owner + "'s account, balance: $" + balance;
    }
}
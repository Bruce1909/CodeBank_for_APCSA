/**
 * MOD-2.F.2 Error Example
 * 
 * This program demonstrates common errors when implementing non-void methods
 * with parameters, such as not using parameters or not returning a value.
 */
public class MOD2F2_Err {
    private double balance;
    
    public MOD2F2_Err(double initialBalance) {
        this.balance = initialBalance;
    }
    
    /**
     * ERROR: This method declares a return type but doesn't return a value in all code paths.
     * The compiler will generate an error for this method.
     * 
     * @param amount The amount to deposit
     * @return Should return the new balance but doesn't in all cases
     */
    public double depositIncomplete(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            // ERROR: Missing return statement in this branch
            // The method must return a value of type double in all code paths
        } else {
            balance += amount;
            return balance;
        }
        // Compiler error: missing return statement
    }
    
    /**
     * ERROR: This method ignores its parameter and doesn't use it in the computation.
     * This is a logical error, not a compilation error.
     * 
     * @param rate The interest rate (ignored)
     * @return A fixed interest amount regardless of the rate parameter
     */
    public double calculateInterestIgnoringParameter(double rate) {
        // ERROR: Parameter 'rate' is ignored
        // Always uses a fixed 0.05 rate regardless of the parameter value
        double interestAmount = balance * 0.05;
        
        return interestAmount; // Returns a value but ignores the parameter
    }
    
    /**
     * ERROR: This method has a type mismatch in the return statement.
     * The compiler will generate an error for this method.
     * 
     * @param years Number of years for the investment
     * @param rate Annual interest rate (as a decimal)
     * @return Should return a double but tries to return a string
     */
    public double calculateFutureValueTypeError(int years, double rate) {
        double futureValue = balance * Math.pow(1 + rate, years);
        
        // ERROR: Type mismatch - cannot convert from String to double
        return "$" + futureValue; // Compilation error here
    }
    
    public static void main(String[] args) {
        MOD2F2_Err account = new MOD2F2_Err(1000.0);
        
        // The following lines would cause compilation errors
        // double newBalance = account.depositIncomplete(500.0);
        // double futureValue = account.calculateFutureValueTypeError(10, 0.05);
        
        // This would compile but has a logical error (ignoring the parameter)
        double interestAmount = account.calculateInterestIgnoringParameter(0.10);
        System.out.println("Interest earned (should be at 10% but actually uses 5%): $" + interestAmount);
        
        System.out.println("This program contains methods with errors that demonstrate");
        System.out.println("common mistakes when implementing non-void methods with parameters.");
    }
}
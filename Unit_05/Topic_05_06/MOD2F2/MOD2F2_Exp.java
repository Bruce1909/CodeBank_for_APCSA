/**
 * MOD-2.F.2 Example
 * 
 * This program demonstrates how non-void methods with parameters receive values
 * through parameters, use those values, and return a computed value of the specified type.
 */
public class MOD2F2_Exp {
    private double balance;
    
    public MOD2F2_Exp(double initialBalance) {
        this.balance = initialBalance;
    }
    
    /**
     * This method receives a deposit amount as a parameter,
     * adds it to the balance, and returns the new balance.
     * 
     * @param amount The amount to deposit
     * @return The new balance after deposit
     */
    public double deposit(double amount) {
        // Validate the parameter
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return balance; // Return unchanged balance
        }
        
        // Use the parameter value to compute a new balance
        balance += amount;
        
        // Return the computed value of the specified type (double)
        return balance;
    }
    
    /**
     * This method calculates interest based on a rate parameter
     * and returns the interest amount without changing the balance.
     * 
     * @param rate The interest rate (as a decimal)
     * @return The calculated interest amount
     */
    public double calculateInterest(double rate) {
        // Use the parameter to compute a value
        double interestAmount = balance * rate;
        
        // Return the computed value without modifying the object's state
        return interestAmount;
    }
    
    /**
     * This method demonstrates receiving multiple parameters,
     * using them in a calculation, and returning a result.
     * 
     * @param years Number of years for the investment
     * @param rate Annual interest rate (as a decimal)
     * @return The future value of the investment
     */
    public double calculateFutureValue(int years, double rate) {
        // Use multiple parameters in a computation
        double futureValue = balance * Math.pow(1 + rate, years);
        
        // Return the computed value
        return futureValue;
    }
    
    public static void main(String[] args) {
        MOD2F2_Exp account = new MOD2F2_Exp(1000.0);
        
        // Demonstrate receiving a parameter, using it, and returning a value
        double newBalance = account.deposit(500.0);
        System.out.println("New balance after deposit: $" + newBalance);
        
        // Demonstrate calculating and returning a value without changing state
        double interestAmount = account.calculateInterest(0.05);
        System.out.println("Interest earned at 5%: $" + interestAmount);
        
        // Demonstrate using multiple parameters and returning a computed value
        double futureValue = account.calculateFutureValue(10, 0.05);
        System.out.println("Future value after 10 years at 5%: $" + futureValue);
    }
}
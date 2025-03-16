/**
 * CON-2.O.3: Each recursive call has its own set of local variables, including the formal parameters.
 *
 * This example demonstrates how each recursive call maintains its own separate set of
 * local variables and parameters, creating a new stack frame for each call.
 */
public class CON2O3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how each recursive call has its own local variables:\n");
        
        // Call the recursive method to calculate the sum of numbers from 1 to 5
        int result = sumNumbers(5);
        System.out.println("\nFinal result: Sum of numbers from 1 to 5 = " + result);
        
        // Call the recursive method with local variables
        System.out.println("\nDemonstrating local variables in recursion:");
        countDown(3);
        
        System.out.println("\n--- Key Points about Local Variables in Recursive Methods ---");
        System.out.println("1. Each recursive call creates a new stack frame with its own set of local variables");
        System.out.println("2. Parameters in each recursive call are independent of other calls");
        System.out.println("3. Local variables declared inside the method are also independent for each call");
        System.out.println("4. When a recursive call returns, its local variables are discarded");
        System.out.println("5. The calling method's variables remain intact when the recursive call returns");
    }
    
    /**
     * A recursive method that calculates the sum of numbers from 1 to n.
     * Demonstrates how each call has its own parameter 'n'.
     * 
     * @param n The upper bound of the sum
     * @return The sum of numbers from 1 to n
     */
    public static int sumNumbers(int n) {
        // Print the current value of n to show it's unique to this call
        System.out.println("Entering sumNumbers with n = " + n);
        
        // Base case
        if (n <= 0) {
            System.out.println("Base case reached with n = " + n + ", returning 0");
            return 0;
        }
        
        // Create a local variable for this specific call
        int currentValue = n;
        System.out.println("Local variable currentValue = " + currentValue + " in call with n = " + n);
        
        // Make a recursive call - this will create a new set of variables
        int recursiveResult = sumNumbers(n - 1);
        
        // After the recursive call returns, our local variables are still intact
        System.out.println("Returned to call with n = " + n + " and currentValue = " + currentValue);
        
        // Calculate the result for this call
        int result = currentValue + recursiveResult;
        System.out.println("Calculated result for n = " + n + ": " + currentValue + " + " + recursiveResult + " = " + result);
        
        return result;
    }
    
    /**
     * A recursive method that counts down from n to 1.
     * Demonstrates how each call has its own local variables.
     * 
     * @param n The starting number for countdown
     */
    public static void countDown(int n) {
        // Create a local variable specific to this call
        String indent = "  ".repeat(3 - n); // Visual indentation to show call depth
        String message = "Countdown: " + n;
        
        System.out.println(indent + "Entering countDown with n = " + n);
        System.out.println(indent + "Local message for this call: \"" + message + "\"");
        
        // Base case
        if (n <= 0) {
            System.out.println(indent + "Base case reached, returning");
            return;
        }
        
        // Make a recursive call - this will create a new set of variables
        System.out.println(indent + "Making recursive call with n - 1 = " + (n - 1));
        countDown(n - 1);
        
        // After the recursive call returns, our local variables are still intact
        System.out.println(indent + "Returned to call with n = " + n);
        System.out.println(indent + "Local message is still: \"" + message + "\"");
        System.out.println(indent + "Exiting countDown with n = " + n);
    }
}
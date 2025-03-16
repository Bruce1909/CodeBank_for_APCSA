/**
 * CON-2.O.1: A recursive method is a method that calls itself.
 *
 * This example demonstrates a basic recursive method that calculates factorial.
 * The factorial of a non-negative integer n is the product of all positive
 * integers less than or equal to n.
 */
public class CON2O1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating a recursive method (factorial):\n");
        
        // Calculate factorials for numbers 0 through 5
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
        
        System.out.println("\n--- Key Points about Recursive Methods ---");
        System.out.println("1. A recursive method is a method that calls itself");
        System.out.println("2. Each recursive call works with a smaller version of the original problem");
        System.out.println("3. The method must have a base case to stop the recursion");
        System.out.println("4. For factorial, the base case is when n = 0 or n = 1");
    }
    
    /**
     * A recursive method to calculate factorial.
     * 
     * @param n The number to calculate factorial for
     * @return The factorial of n
     */
    public static int factorial(int n) {
        // Print the current call to visualize the recursion
        System.out.println("Calling factorial(" + n + ")");
        
        // Base case: factorial of 0 or 1 is 1
        if (n <= 1) {
            System.out.println("Base case reached: factorial(" + n + ") = 1");
            return 1;
        }
        
        // Recursive case: n! = n * (n-1)!
        // The method calls itself with a smaller value
        int result = n * factorial(n - 1);
        
        System.out.println("Calculated: factorial(" + n + ") = " + result);
        return result;
    }
}
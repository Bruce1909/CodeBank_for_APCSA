/**
 * CON-2.O.4: Parameter values capture the progress of a recursive process, much like 
 * loop control variable values capture the progress of a loop.
 *
 * This example demonstrates how parameters in recursive methods track the progress
 * of the recursion, similar to how loop counters track iterations in loops.
 */
public class CON2O4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how parameters track recursive progress:\n");
        
        // Example 1: Recursive countdown compared to iterative countdown
        System.out.println("Example 1: Countdown from 5 to 1");
        System.out.println("\nRecursive countdown:");
        countdownRecursive(5);
        
        System.out.println("\nEquivalent iterative countdown:");
        countdownIterative(5);
        
        // Example 2: Recursive sum compared to iterative sum
        System.out.println("\nExample 2: Sum of numbers from 1 to 5");
        System.out.println("\nRecursive sum:");
        int recursiveSum = sumRecursive(5);
        System.out.println("Sum of numbers from 1 to 5 (recursive): " + recursiveSum);
        
        System.out.println("\nEquivalent iterative sum:");
        int iterativeSum = sumIterative(5);
        System.out.println("Sum of numbers from 1 to 5 (iterative): " + iterativeSum);
        
        // Example 3: Fibonacci sequence with parameter tracking
        System.out.println("\nExample 3: Fibonacci sequence");
        System.out.println("\nCalculating the 7th Fibonacci number recursively:");
        int fib = fibonacci(7, 1);
        System.out.println("The 7th Fibonacci number is: " + fib);
        
        System.out.println("\n--- Key Points about Parameter Values in Recursion ---");
        System.out.println("1. Parameters in recursive methods track the progress of the recursion");
        System.out.println("2. Each recursive call modifies the parameter values to approach the base case");
        System.out.println("3. This is similar to how loop control variables change with each iteration");
        System.out.println("4. The parameter values show the current 'state' of the recursive process");
        System.out.println("5. Tracking these values helps understand the recursion's progress");
    }
    
    /**
     * A recursive method that counts down from n to 1.
     * The parameter n tracks the progress of the recursion.
     * 
     * @param n The current number in the countdown
     */
    public static void countdownRecursive(int n) {
        // Print the current value of n to show the progress
        System.out.println("Recursive call with n = " + n);
        
        // Base case
        if (n <= 0) {
            System.out.println("Base case reached, stopping recursion");
            return;
        }
        
        // Recursive call with a modified parameter to approach the base case
        countdownRecursive(n - 1);
    }
    
    /**
     * An iterative method that counts down from n to 1.
     * The loop control variable i tracks the progress of the loop.
     * 
     * @param n The starting number for the countdown
     */
    public static void countdownIterative(int n) {
        // Loop from n down to 1
        for (int i = n; i > 0; i--) {
            System.out.println("Loop iteration with i = " + i);
        }
        System.out.println("Loop finished");
    }
    
    /**
     * A recursive method that calculates the sum of numbers from 1 to n.
     * The parameter n tracks the progress of the recursion.
     * 
     * @param n The upper bound of the sum
     * @return The sum of numbers from 1 to n
     */
    public static int sumRecursive(int n) {
        // Print the current value of n to show the progress
        System.out.println("Recursive call with n = " + n);
        
        // Base case
        if (n <= 0) {
            System.out.println("Base case reached, returning 0");
            return 0;
        }
        
        // Recursive call with a modified parameter to approach the base case
        int result = n + sumRecursive(n - 1);
        System.out.println("Returning sum for n = " + n + ": " + result);
        return result;
    }
    
    /**
     * An iterative method that calculates the sum of numbers from 1 to n.
     * The loop control variable i tracks the progress of the loop.
     * 
     * @param n The upper bound of the sum
     * @return The sum of numbers from 1 to n
     */
    public static int sumIterative(int n) {
        int sum = 0;
        
        // Loop from 1 up to n
        for (int i = 1; i <= n; i++) {
            System.out.println("Loop iteration with i = " + i + ", current sum = " + sum);
            sum += i;
        }
        
        System.out.println("Loop finished, final sum = " + sum);
        return sum;
    }
    
    /**
     * A recursive method that calculates the nth Fibonacci number.
     * The parameters n and depth track the progress of the recursion.
     * 
     * @param n The Fibonacci number to calculate
     * @param depth The current depth of recursion (for visualization)
     * @return The nth Fibonacci number
     */
    public static int fibonacci(int n, int depth) {
        // Create indentation based on recursion depth for better visualization
        String indent = "  ".repeat(depth);
        System.out.println(indent + "Computing fibonacci(" + n + ") at depth " + depth);
        
        // Base cases
        if (n <= 0) {
            System.out.println(indent + "Base case: fibonacci(0) = 0");
            return 0;
        } else if (n == 1) {
            System.out.println(indent + "Base case: fibonacci(1) = 1");
            return 1;
        }
        
        // Recursive calls with modified parameters to approach the base cases
        System.out.println(indent + "Making recursive calls for fibonacci(" + (n-1) + ") and fibonacci(" + (n-2) + ")");
        int result1 = fibonacci(n - 1, depth + 1);
        int result2 = fibonacci(n - 2, depth + 1);
        
        int result = result1 + result2;
        System.out.println(indent + "fibonacci(" + n + ") = fibonacci(" + (n-1) + ") + fibonacci(" + (n-2) + ") = " + result1 + " + " + result2 + " = " + result);
        return result;
    }
}
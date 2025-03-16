/**
 * CON-2.O.5: Any recursive solution can be replicated through the use of an iterative approach.
 *
 * This example demonstrates how common recursive algorithms can be rewritten using
 * iterative approaches. We'll implement both recursive and iterative versions of
 * factorial and Fibonacci calculations for comparison.
 */
public class CON2O5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating recursive solutions and their iterative equivalents:\n");
        
        // Example 1: Factorial calculation
        System.out.println("Example 1: Factorial Calculation");
        int n = 5;
        
        System.out.println("\nRecursive factorial:");
        int recursiveFactorial = factorialRecursive(n);
        System.out.println(n + "! = " + recursiveFactorial);
        
        System.out.println("\nIterative factorial:");
        int iterativeFactorial = factorialIterative(n);
        System.out.println(n + "! = " + iterativeFactorial);
        
        // Example 2: Fibonacci calculation
        System.out.println("\nExample 2: Fibonacci Calculation");
        n = 7;
        
        System.out.println("\nRecursive Fibonacci:");
        int recursiveFib = fibonacciRecursive(n);
        System.out.println("Fibonacci(" + n + ") = " + recursiveFib);
        
        System.out.println("\nIterative Fibonacci:");
        int iterativeFib = fibonacciIterative(n);
        System.out.println("Fibonacci(" + n + ") = " + iterativeFib);
        
        // Example 3: Binary search
        System.out.println("\nExample 3: Binary Search");
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        
        System.out.println("\nRecursive binary search:");
        int recursiveIndex = binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        System.out.println("Found " + target + " at index: " + recursiveIndex);
        
        System.out.println("\nIterative binary search:");
        int iterativeIndex = binarySearchIterative(sortedArray, target);
        System.out.println("Found " + target + " at index: " + iterativeIndex);
        
        System.out.println("\n--- Key Points about Recursive and Iterative Approaches ---");
        System.out.println("1. Any recursive solution can be rewritten as an iterative solution");
        System.out.println("2. Recursive solutions are often more elegant and easier to understand");
        System.out.println("3. Iterative solutions may be more efficient (no function call overhead)");
        System.out.println("4. Iterative solutions often use explicit data structures (like stacks) to");
        System.out.println("   manage what recursion handles implicitly through the call stack");
        System.out.println("5. The choice between recursive and iterative depends on readability,");
        System.out.println("   performance requirements, and the nature of the problem");
    }
    
    /**
     * A recursive method to calculate factorial.
     * 
     * @param n The number to calculate factorial for
     * @return The factorial of n
     */
    public static int factorialRecursive(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        }
        
        // Recursive case
        return n * factorialRecursive(n - 1);
    }
    
    /**
     * An iterative method to calculate factorial.
     * 
     * @param n The number to calculate factorial for
     * @return The factorial of n
     */
    public static int factorialIterative(int n) {
        int result = 1;
        
        // Iterate from 1 to n, multiplying the result by each number
        for (int i = 1; i <= n; i++) {
            System.out.println("Iteration " + i + ": result = " + result + " * " + i);
            result *= i;
        }
        
        return result;
    }
    
    /**
     * A recursive method to calculate the nth Fibonacci number.
     * 
     * @param n The position in the Fibonacci sequence
     * @return The nth Fibonacci number
     */
    public static int fibonacciRecursive(int n) {
        // Base cases
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        // Recursive case
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    
    /**
     * An iterative method to calculate the nth Fibonacci number.
     * 
     * @param n The position in the Fibonacci sequence
     * @return The nth Fibonacci number
     */
    public static int fibonacciIterative(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        int fib1 = 0; // F(0)
        int fib2 = 1; // F(1)
        int result = 0;
        
        // Iterate from 2 to n, calculating each Fibonacci number
        for (int i = 2; i <= n; i++) {
            result = fib1 + fib2;
            System.out.println("Iteration " + i + ": F(" + i + ") = F(" + (i-2) + ") + F(" + (i-1) + ") = " + fib1 + " + " + fib2 + " = " + result);
            
            // Update values for the next iteration
            fib1 = fib2;
            fib2 = result;
        }
        
        return result;
    }
    
    /**
     * A recursive binary search method.
     * 
     * @param arr The sorted array to search in
     * @param target The value to search for
     * @param left The left boundary of the search range
     * @param right The right boundary of the search range
     * @return The index of the target if found, -1 otherwise
     */
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        // Base case: Element not found
        if (left > right) {
            return -1;
        }
        
        // Calculate the middle index
        int mid = left + (right - left) / 2;
        System.out.println("Recursive search: Checking index " + mid + " (value: " + arr[mid] + ")");
        
        // Base case: Element found
        if (arr[mid] == target) {
            return mid;
        }
        
        // Recursive cases
        if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, left, mid - 1);
        } else {
            return binarySearchRecursive(arr, target, mid + 1, right);
        }
    }
    
    /**
     * An iterative binary search method.
     * 
     * @param arr The sorted array to search in
     * @param target The value to search for
     * @return The index of the target if found, -1 otherwise
     */
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        // Continue searching while the search range is valid
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Iterative search: Checking index " + mid + " (value: " + arr[mid] + ")");
            
            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            
            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        
        // Element not found
        return -1;
    }
}
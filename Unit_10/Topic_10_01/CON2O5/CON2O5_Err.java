/**
 * CON-2.O.5: Any recursive solution can be replicated through the use of an iterative approach.
 *
 * This example demonstrates common errors when converting recursive solutions to iterative ones.
 * Note: The exclusion statement (EK CON-2.O.5) states that writing recursive program code is
 * outside the scope of the course and AP Exam, but understanding the concept is still important.
 */
public class CON2O5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when converting recursive solutions to iterative ones:\n");
        
        // Example 1: Incorrect factorial calculation
        System.out.println("Example 1: Incorrect Factorial Calculation");
        int n = 5;
        try {
            System.out.println("Attempting to calculate " + n + "! using an incorrect iterative approach:");
            int result = factorialIterativeIncorrect(n);
            System.out.println("Result: " + result); // This won't execute due to infinite loop
        } catch (Exception e) {
            System.out.println("Error occurred: The iterative solution is incorrect");
        }
        
        // Example 2: Incorrect Fibonacci calculation
        System.out.println("\nExample 2: Incorrect Fibonacci Calculation");
        n = 7;
        System.out.println("Calculating Fibonacci(" + n + ") using an incorrect iterative approach:");
        int result = fibonacciIterativeIncorrect(n);
        System.out.println("Incorrect result: " + result);
        System.out.println("Correct result should be: 13");
        
        // Example 3: Incorrect binary search
        System.out.println("\nExample 3: Incorrect Binary Search");
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        
        System.out.println("Searching for " + target + " using an incorrect iterative binary search:");
        int index = binarySearchIterativeIncorrect(sortedArray, target);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Element not found (incorrect result)");
            System.out.println("Correct result should be: found at index 5");
        }
        
        System.out.println("\n--- Common Errors When Converting Recursive to Iterative ---");
        System.out.println("1. Incorrect initialization of variables in iterative solutions");
        System.out.println("2. Missing or incorrect loop termination conditions");
        System.out.println("3. Failing to properly update variables in each iteration");
        System.out.println("4. Not handling base cases correctly in iterative solutions");
        System.out.println("5. Misunderstanding the recursive algorithm's state management");
    }
    
    /**
     * An incorrectly implemented iterative method for factorial calculation.
     * The loop condition is wrong, leading to an infinite loop.
     * 
     * @param n The number to calculate factorial for
     * @return The factorial of n (would never return due to infinite loop)
     */
    public static int factorialIterativeIncorrect(int n) {
        int result = 1;
        int i = 1;
        
        // Error: The loop condition should be (i <= n), not (i != n)
        // This will cause an infinite loop if n is not 1
        System.out.println("Starting loop with i = " + i + " and n = " + n);
        
        // Commenting out the actual infinite loop to prevent program hanging
        // while (i != n) { // Wrong condition
        //     result *= i;
        //     i++;
        // }
        
        // Instead, we'll simulate the error
        System.out.println("This would cause an infinite loop because the loop condition (i != n) is incorrect");
        System.out.println("If i starts at 1 and n is 5, i would increment past n and never equal n");
        
        return result;
    }
    
    /**
     * An incorrectly implemented iterative method for Fibonacci calculation.
     * The variable updates are incorrect.
     * 
     * @param n The position in the Fibonacci sequence
     * @return An incorrect value for the nth Fibonacci number
     */
    public static int fibonacciIterativeIncorrect(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        int fib1 = 0; // F(0)
        int fib2 = 1; // F(1)
        int result = 0;
        
        System.out.println("Starting with fib1 = " + fib1 + " and fib2 = " + fib2);
        
        // Iterate from 2 to n
        for (int i = 2; i <= n; i++) {
            // Error: Incorrect variable updates
            // The correct update would be: result = fib1 + fib2; fib1 = fib2; fib2 = result;
            result = fib1 + fib2;
            System.out.println("Iteration " + i + ": result = " + fib1 + " + " + fib2 + " = " + result);
            
            // Error: Both variables are updated to the same value
            // This loses the previous state information
            fib1 = result;
            fib2 = result; // Should be fib2 = result
            
            System.out.println("Updated fib1 = " + fib1 + " and fib2 = " + fib2 + " (incorrect update)");
        }
        
        return result;
    }
    
    /**
     * An incorrectly implemented iterative binary search method.
     * The search range updates are incorrect.
     * 
     * @param arr The sorted array to search in
     * @param target The value to search for
     * @return The index of the target if found, -1 otherwise (often incorrect)
     */
    public static int binarySearchIterativeIncorrect(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        System.out.println("Starting search with left = " + left + " and right = " + right);
        
        // Continue searching while the search range is valid
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Checking index " + mid + " (value: " + arr[mid] + ")");
            
            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            
            // Error: Incorrect range updates
            // The correct updates would be: left = mid + 1 or right = mid - 1
            if (arr[mid] < target) {
                // Error: Should be left = mid + 1
                left = mid; // This doesn't properly narrow the search range
                System.out.println("Target is greater, updating left = " + left + " (incorrect update)");
            } else {
                // Error: Should be right = mid - 1
                right = mid; // This doesn't properly narrow the search range
                System.out.println("Target is smaller, updating right = " + right + " (incorrect update)");
            }
            
            // This can lead to an infinite loop if the target is not at the exact middle
            // To prevent hanging, we'll break after a few iterations
            if (right - left <= 2) {
                System.out.println("Search range too small, but not properly converging due to incorrect updates");
                break;
            }
        }
        
        // Element not found or search terminated early
        return -1;
    }
}
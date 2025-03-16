/**
 * CON-2.O.4: Parameter values capture the progress of a recursive process, much like 
 * loop control variable values capture the progress of a loop.
 *
 * This example demonstrates common errors related to parameter tracking in recursive methods.
 */
public class CON2O4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with parameter tracking in recursive methods:\n");
        
        System.out.println("Example 1: Incorrect parameter modification (commented out to prevent crash)");
        // Uncommenting the next line would cause a StackOverflowError
        // System.out.println("Result: " + factorialIncorrectParameterModification(5));
        
        System.out.println("\nExample 2: Missing parameter tracking");
        try {
            System.out.println("Attempting to find an element in an array without proper parameter tracking:");
            int[] array = {3, 7, 12, 19, 25, 36};
            int result = findElementMissingTracking(array, 19, 0);
            System.out.println("Result: " + result);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError occurred: The recursion never terminates");
        }
        
        System.out.println("\n--- Common Errors with Parameter Tracking in Recursive Methods ---");
        System.out.println("1. Incorrect parameter modification: Not properly changing parameters to approach base case");
        System.out.println("2. Missing parameter tracking: Not using parameters to track progress");
        System.out.println("3. Redundant parameters: Using more parameters than necessary, causing confusion");
        System.out.println("4. Inconsistent parameter updates: Modifying parameters in inconsistent ways");
    }
    
    /**
     * A recursive method with incorrect parameter modification.
     * The parameter doesn't properly approach the base case.
     * 
     * @param n The number to calculate factorial for
     * @return The factorial of n
     */
    public static int factorialIncorrectParameterModification(int n) {
        System.out.println("Calling factorial with n = " + n);
        
        // Base case
        if (n <= 1) {
            return 1;
        }
        
        // Error: Parameter is not properly modified to approach the base case
        // Instead of decreasing n, it's increased, moving away from the base case
        return n * factorialIncorrectParameterModification(n + 1); // Should be (n-1)
    }
    
    /**
     * A recursive method that attempts to find an element in an array
     * but has errors in parameter tracking.
     * 
     * @param arr The array to search in
     * @param target The value to search for
     * @param index The current index being checked
     * @return The index of the target if found, -1 otherwise
     */
    public static int findElementMissingTracking(int[] arr, int target, int index) {
        System.out.println("Searching at index " + index);
        
        // Base case: Element found
        if (arr[index] == target) {
            return index;
        }
        
        // Error: Missing base case for when we reach the end of the array
        // Without this check, the recursion will continue beyond the array bounds
        
        // Error: Parameter is not properly tracked
        // The recursive call doesn't update the index parameter, so it stays at the same value
        return findElementMissingTracking(arr, target, index); // Should be (index + 1)
    }
}
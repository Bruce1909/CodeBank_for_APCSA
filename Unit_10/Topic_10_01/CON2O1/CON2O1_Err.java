/**
 * CON-2.O.1: A recursive method is a method that calls itself.
 *
 * This example demonstrates common errors in recursive methods:
 * 1. Missing base case - leads to infinite recursion and StackOverflowError
 * 2. Incorrect recursive call - doesn't properly reduce the problem size
 */
public class CON2O1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors in recursive methods:\n");
        
        System.out.println("Example 1: Missing base case (commented out to prevent crash)");
        // Uncommenting the next line would cause a StackOverflowError
        // System.out.println("Result: " + factorialMissingBaseCase(5));
        
        System.out.println("\nExample 2: Incorrect recursive call");
        try {
            System.out.println("Result: " + factorialIncorrectRecursion(5));
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError occurred: The recursion never terminates");
        }
        
        System.out.println("\n--- Common Errors in Recursive Methods ---");
        System.out.println("1. Missing base case: The recursion never stops, causing StackOverflowError");
        System.out.println("2. Incorrect recursive call: Not properly reducing the problem size");
        System.out.println("3. Base case that never gets reached due to logical errors");
        System.out.println("4. Recursive call that doesn't make progress toward the base case");
    }
    
    /**
     * A recursive method with a missing base case.
     * This will cause infinite recursion and StackOverflowError.
     */
    public static int factorialMissingBaseCase(int n) {
        System.out.println("Calling factorialMissingBaseCase(" + n + ")");
        
        // Error: No base case to stop the recursion
        // The method will keep calling itself indefinitely
        return n * factorialMissingBaseCase(n - 1);
    }
    
    /**
     * A recursive method with an incorrect recursive call.
     * The problem size doesn't decrease, leading to infinite recursion.
     */
    public static int factorialIncorrectRecursion(int n) {
        System.out.println("Calling factorialIncorrectRecursion(" + n + ")");
        
        // Base case exists but may never be reached
        if (n <= 1) {
            return 1;
        }
        
        // Error: The recursive call doesn't reduce the problem size
        // It will keep calling with the same value of n
        return n * factorialIncorrectRecursion(n); // Should be (n-1)
    }
}
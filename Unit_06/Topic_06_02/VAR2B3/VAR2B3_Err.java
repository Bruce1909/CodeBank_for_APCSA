/**
 * VAR-2.B.3: Since the indices for an array start at 0 and end at the number of elements − 1,
 * "off by one" errors are easy to make when traversing an array, resulting in an
 * ArrayIndexOutOfBoundsException being thrown.
 *
 * This example demonstrates common "off by one" errors when traversing arrays.
 */
public class VAR2B3_Err {
    public static void main(String[] args) {
        // Create an array of integers
        int[] scores = {85, 92, 78, 95, 88};
        
        System.out.println("Demonstrating common 'off by one' errors when traversing arrays:\n");
        
        // Error 1: Using <= instead of < in the loop condition
        System.out.println("Error 1: Using <= instead of < in the loop condition");
        System.out.print("Attempting to access elements with i <= scores.length: ");
        try {
            for (int i = 0; i <= scores.length; i++) { // Error: should be i < scores.length
                System.out.print(scores[i] + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
            System.out.println("This error occurs because we tried to access scores[" + scores.length + "], which doesn't exist.");
        }
        
        // Error 2: Starting from index 1 instead of 0
        System.out.println("\nError 2: Starting from index 1 instead of 0");
        System.out.println("Attempting to process all elements but starting from index 1:");
        try {
            System.out.print("Elements: ");
            for (int i = 1; i < scores.length; i++) { // Error: missing the first element
                System.out.print(scores[i] + " ");
            }
            System.out.println("\nNotice that 85 (the first element) is missing!");
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        }
        
        // Error 3: Incorrect calculation for the last element
        System.out.println("\nError 3: Incorrect calculation for the last element");
        System.out.print("Attempting to access the last element using scores[scores.length]: ");
        try {
            // This will cause an ArrayIndexOutOfBoundsException
            System.out.println(scores[scores.length]); // Error: should be scores[scores.length - 1]
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
            System.out.println("The correct way to access the last element is scores[scores.length - 1].");
        }
        
        // Error 4: Off-by-one error in reverse traversal
        System.out.println("\nError 4: Off-by-one error in reverse traversal");
        System.out.print("Attempting to traverse array in reverse with incorrect bounds: ");
        try {
            for (int i = scores.length; i >= 0; i--) { // Error: should start at scores.length - 1
                System.out.print(scores[i] + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
            System.out.println("The correct loop should be: for (int i = scores.length - 1; i >= 0; i--)");
        }
        
        // Error 5: Off-by-one error when copying arrays
        System.out.println("\nError 5: Off-by-one error when copying arrays");
        try {
            int[] newScores = new int[scores.length];
            System.out.println("Attempting to copy array with incorrect loop bounds:");
            for (int i = 0; i <= scores.length; i++) { // Error: should be i < scores.length
                newScores[i] = scores[i];
                System.out.print(newScores[i] + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        // Summary
        System.out.println("\nSummary of common 'off by one' errors:");
        System.out.println("1. Using i <= array.length instead of i < array.length");
        System.out.println("2. Starting from index 1 instead of 0 (missing the first element)");
        System.out.println("3. Accessing array[array.length] instead of array[array.length - 1]");
        System.out.println("4. In reverse traversal, starting at length instead of length - 1");
        System.out.println("5. Forgetting that valid indices are 0 through length - 1");
    }
}
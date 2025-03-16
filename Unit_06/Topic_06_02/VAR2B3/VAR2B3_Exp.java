/**
 * VAR-2.B.3: Since the indices for an array start at 0 and end at the number of elements − 1,
 * "off by one" errors are easy to make when traversing an array, resulting in an
 * ArrayIndexOutOfBoundsException being thrown.
 *
 * This example demonstrates how to properly handle array indices to avoid "off by one" errors.
 */
public class VAR2B3_Exp {
    public static void main(String[] args) {
        // Create an array of integers
        int[] scores = {85, 92, 78, 95, 88};
        
        System.out.println("Demonstrating how to avoid 'off by one' errors when traversing arrays:\n");
        
        // Example 1: Correctly accessing the first and last elements
        System.out.println("Example 1: Correctly accessing the first and last elements");
        System.out.println("First element (index 0): " + scores[0]);
        System.out.println("Last element (index " + (scores.length - 1) + "): " + scores[scores.length - 1]);
        
        // Example 2: Correctly traversing the entire array
        System.out.println("\nExample 2: Correctly traversing the entire array");
        System.out.print("All elements: ");
        for (int i = 0; i < scores.length; i++) { // Correct condition: i < length
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        
        // Example 3: Safely accessing elements with bounds checking
        System.out.println("\nExample 3: Safely accessing elements with bounds checking");
        int index = 4; // Try with different values (0-4 are valid, others are invalid)
        if (index >= 0 && index < scores.length) {
            System.out.println("Element at index " + index + ": " + scores[index]);
        } else {
            System.out.println("Index " + index + " is out of bounds (valid range: 0-" + (scores.length - 1) + ")");
        }
        
        // Example 4: Using a helper method to safely access elements
        System.out.println("\nExample 4: Using a helper method to safely access elements");
        System.out.println("Element at index 2: " + safeGetElement(scores, 2));
        System.out.println("Element at index 5: " + safeGetElement(scores, 5)); // Out of bounds
        System.out.println("Element at index -1: " + safeGetElement(scores, -1)); // Out of bounds
        
        // Example 5: Correctly processing array in reverse order
        System.out.println("\nExample 5: Correctly processing array in reverse order");
        System.out.print("Elements in reverse order: ");
        for (int i = scores.length - 1; i >= 0; i--) { // Correct condition for reverse traversal
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        
        // Summary
        System.out.println("\nSummary of techniques to avoid 'off by one' errors:");
        System.out.println("1. Remember that array indices start at 0, not 1");
        System.out.println("2. Use 'i < array.length' as the loop condition, not 'i <= array.length'");
        System.out.println("3. Access the last element with 'array[array.length - 1]', not 'array[array.length]'");
        System.out.println("4. Always validate indices before accessing array elements");
        System.out.println("5. For reverse traversal, start at 'length - 1' and go down to 0");
    }
    
    // Helper method to safely access array elements
    private static String safeGetElement(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            return String.valueOf(array[index]);
        } else {
            return "Error: Index " + index + " is out of bounds (valid range: 0-" + (array.length - 1) + ")";
        }
    }
}
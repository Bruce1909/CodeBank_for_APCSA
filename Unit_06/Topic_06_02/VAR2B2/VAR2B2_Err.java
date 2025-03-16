/**
 * VAR-2.B.2: Traversing an array with an indexed for loop or while loop requires
 * elements to be accessed using their indices.
 *
 * This example demonstrates common errors when accessing array elements using indices.
 */
public class VAR2B2_Err {
    public static void main(String[] args) {
        // Create an array of strings
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        
        System.out.println("Demonstrating common errors when accessing array elements using indices:\n");
        
        // Error 1: Using a variable as an index without checking bounds
        System.out.println("Error 1: Using a variable as an index without checking bounds");
        int userIndex = 5; // Simulating a user input or calculated index that is out of bounds
        System.out.print("Attempting to access fruits[" + userIndex + "]: ");
        try {
            // This will cause an ArrayIndexOutOfBoundsException
            System.out.println(fruits[userIndex]);
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        }
        
        // Error 2: Forgetting that array indices are zero-based
        System.out.println("\nError 2: Forgetting that array indices are zero-based");
        System.out.println("Attempting to access the 'first' element using index 1 instead of 0:");
        try {
            // This will access the second element, not the first
            System.out.println("The 'first' element (incorrectly using index 1): " + fruits[1]);
            System.out.println("Notice that we got 'Banana' instead of 'Apple'!");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        // Error 3: Using the array length as an index
        System.out.println("\nError 3: Using the array length as an index");
        System.out.print("Attempting to access fruits[fruits.length]: ");
        try {
            // This will cause an ArrayIndexOutOfBoundsException
            System.out.println(fruits[fruits.length]);
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        }
        
        // Error 4: Incorrect index calculation
        System.out.println("\nError 4: Incorrect index calculation");
        System.out.print("Attempting to access the last element using incorrect calculation: ");
        try {
            // This will cause an ArrayIndexOutOfBoundsException
            System.out.println(fruits[fruits.length - 0]); // Should be fruits.length - 1
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        }
        
        // Error 5: Modifying an array using an invalid index
        System.out.println("\nError 5: Modifying an array using an invalid index");
        System.out.println("Attempting to modify an element at a negative index:");
        try {
            // This will cause an ArrayIndexOutOfBoundsException
            fruits[-1] = "Invalid Fruit";
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        // Summary
        System.out.println("\nSummary of common errors when using indices for array traversal:");
        System.out.println("1. Using an index that is out of bounds (< 0 or >= length)");
        System.out.println("2. Forgetting that array indices start at 0, not 1");
        System.out.println("3. Using the array length directly as an index");
        System.out.println("4. Incorrect calculation of indices (e.g., off-by-one errors)");
        System.out.println("5. Not validating user input or calculated indices before use");
    }
}
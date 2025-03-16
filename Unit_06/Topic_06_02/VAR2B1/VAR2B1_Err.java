/**
 * VAR-2.B.1: Iteration statements can be used to access all the elements in an array.
 * This is called traversing the array.
 *
 * This example demonstrates common errors when traversing arrays using iteration statements.
 */
public class VAR2B1_Err {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Demonstrating common errors when traversing arrays:\n");
        
        // Error 1: Incorrect loop condition (missing elements)
        System.out.println("Error 1: Incorrect loop condition (missing the last element)");
        System.out.print("Attempted to print all elements, but using i < numbers.length - 1: ");
        try {
            for (int i = 0; i < numbers.length - 1; i++) { // Incorrect: will miss the last element
                System.out.print(numbers[i] + " ");
            }
            System.out.println("\nNotice that 50 (the last element) is missing!");
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        }
        
        // Error 2: Incorrect starting index
        System.out.println("\nError 2: Incorrect starting index");
        System.out.print("Attempted to print all elements, but starting from index 1: ");
        try {
            for (int i = 1; i < numbers.length; i++) { // Incorrect: will miss the first element
                System.out.print(numbers[i] + " ");
            }
            System.out.println("\nNotice that 10 (the first element) is missing!");
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        }
        
        // Error 3: Incorrect loop condition (accessing beyond array bounds)
        System.out.println("\nError 3: Incorrect loop condition (accessing beyond array bounds)");
        System.out.print("Attempted to access element at index 5: ");
        try {
            for (int i = 0; i <= numbers.length; i++) { // Incorrect: will try to access beyond the array bounds
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        }
        
        // Error 4: Incorrect increment in while loop
        System.out.println("\nError 4: Incorrect increment in while loop");
        System.out.print("Attempted to print all elements, but forgot to increment the index: ");
        try {
            int index = 0;
            // Uncommenting the following code would result in an infinite loop
            // while (index < numbers.length) {
            //     System.out.print(numbers[index] + " ");
            //     // Missing index++ here would cause an infinite loop
            // }
            System.out.println("\nThis would cause an infinite loop! (code is commented out)");
        } catch (Exception e) {
            System.out.println("\nException: " + e.getMessage());
        }
        
        // Summary
        System.out.println("\nSummary of common errors when traversing arrays:");
        System.out.println("1. Using i < length - 1 instead of i < length (misses the last element)");
        System.out.println("2. Starting from index 1 instead of 0 (misses the first element)");
        System.out.println("3. Using i <= length instead of i < length (causes ArrayIndexOutOfBoundsException)");
        System.out.println("4. Forgetting to increment the index in a while loop (causes infinite loop)");
    }
}
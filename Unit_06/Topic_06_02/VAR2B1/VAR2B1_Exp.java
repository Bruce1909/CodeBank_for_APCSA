/**
 * VAR-2.B.1: Iteration statements can be used to access all the elements in an array.
 * This is called traversing the array.
 *
 * This example demonstrates different ways to traverse an array using iteration statements.
 */
public class VAR2B1_Exp {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Demonstrating array traversal using iteration statements:\n");
        
        // Example 1: Using a for loop to traverse the array
        System.out.println("Example 1: Using a standard for loop");
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Example 2: Using a while loop to traverse the array
        System.out.println("\nExample 2: Using a while loop");
        System.out.print("Array elements: ");
        int index = 0;
        while (index < numbers.length) {
            System.out.print(numbers[index] + " ");
            index++;
        }
        System.out.println();
        
        // Example 3: Using a do-while loop to traverse the array
        System.out.println("\nExample 3: Using a do-while loop");
        System.out.print("Array elements: ");
        index = 0;
        do {
            System.out.print(numbers[index] + " ");
            index++;
        } while (index < numbers.length);
        System.out.println();
        
        // Example 4: Using an enhanced for loop (for-each loop)
        System.out.println("\nExample 4: Using an enhanced for loop (for-each loop)");
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Summary
        System.out.println("\nSummary of array traversal methods:");
        System.out.println("1. Standard for loop: Provides access to both index and element value");
        System.out.println("2. While loop: Useful when the termination condition is complex");
        System.out.println("3. Do-while loop: Guarantees at least one iteration");
        System.out.println("4. Enhanced for loop: Simplest syntax when only element values are needed");
    }
}
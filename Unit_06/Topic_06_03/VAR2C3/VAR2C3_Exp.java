/**
 * VAR-2.C.3 Example
 * Assigning a new value to the enhanced `for` loop variable does not change the value stored in the array.
 * 
 * This program demonstrates how modifying the enhanced for loop variable
 * only affects the local copy, not the original array element.
 */
public class VAR2C3_Exp {
    public static void main(String[] args) {
        // Create a 1D array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Original array values:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("\nAttempting to modify values through the loop variable:");
        for (int num : numbers) {
            // Modifying the loop variable (which is just a copy)
            num = num * 2;
            System.out.println("Loop variable value (modified copy): " + num);
        }
        
        System.out.println("\nArray values after attempted modification:");
        for (int num : numbers) {
            System.out.print(num + " "); // Original values remain unchanged
        }
        System.out.println();
        
        // Example with objects to further illustrate the concept
        System.out.println("\nExample with String objects:");
        String[] names = {"Alice", "Bob", "Charlie"};
        
        System.out.println("Original strings:");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        
        System.out.println("\nAttempting to reassign loop variable:");
        for (String name : names) {
            // Reassigning the loop variable doesn't affect the array
            name = "Modified " + name;
            System.out.println("Loop variable now: " + name);
        }
        
        System.out.println("\nArray values after attempted modification:");
        for (String name : names) {
            System.out.print(name + " "); // Original values remain unchanged
        }
        System.out.println();
    }
}
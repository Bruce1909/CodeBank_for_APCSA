/**
 * VAR-2.B.2: Traversing an array with an indexed for loop or while loop requires
 * elements to be accessed using their indices.
 *
 * This example demonstrates how to properly access array elements using their indices
 * during array traversal.
 */
public class VAR2B2_Exp {
    public static void main(String[] args) {
        // Create an array of strings
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        
        System.out.println("Demonstrating array traversal using indices:\n");
        
        // Example 1: Using indices in a for loop
        System.out.println("Example 1: Using indices in a for loop");
        System.out.println("Printing each fruit with its index:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Index " + i + ": " + fruits[i]);
        }
        
        // Example 2: Using indices in a while loop
        System.out.println("\nExample 2: Using indices in a while loop");
        System.out.println("Printing each fruit with its index:");
        int index = 0;
        while (index < fruits.length) {
            System.out.println("Index " + index + ": " + fruits[index]);
            index++;
        }
        
        // Example 3: Accessing specific elements by index
        System.out.println("\nExample 3: Accessing specific elements by index");
        System.out.println("First element (index 0): " + fruits[0]);
        System.out.println("Last element (index " + (fruits.length - 1) + "): " + fruits[fruits.length - 1]);
        
        // Example 4: Modifying array elements using indices
        System.out.println("\nExample 4: Modifying array elements using indices");
        System.out.println("Original array:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        
        // Modify elements
        fruits[1] = "Blueberry";  // Change "Banana" to "Blueberry"
        fruits[3] = "Dragon Fruit";  // Change "Date" to "Dragon Fruit"
        
        System.out.println("\n\nModified array:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        // Summary
        System.out.println("\nSummary of using indices for array traversal:");
        System.out.println("1. Indices start at 0 and end at length-1");
        System.out.println("2. Indices allow both reading and modifying array elements");
        System.out.println("3. Indices provide position information during traversal");
        System.out.println("4. Indices allow accessing specific elements directly");
    }
}
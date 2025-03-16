/**
 * VAR-2.C.2 Example
 * For each iteration of the enhanced `for` loop, the enhanced `for` loop variable 
 * is assigned a copy of an element without using its index.
 * 
 * This program demonstrates how enhanced for loop variables get copies of array elements
 * without using array indices.
 */
public class VAR2C2_Exp {
    public static void main(String[] args) {
        // Create a 1D array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Traversing array using enhanced for loop (no indices needed):");
        
        // Enhanced for loop automatically gets each element without using indices
        for (int num : numbers) {
            System.out.println("Current element: " + num);
        }
        
        // Compare with traditional indexed for loop
        System.out.println("\nTraditional for loop using indices for comparison:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Example with objects to show copies are made
        System.out.println("\nExample with String objects:");
        String[] names = {"Alice", "Bob", "Charlie"};
        
        for (String name : names) {
            // Each iteration, 'name' gets a copy of the element
            System.out.println("Processing: " + name);
            // We can work with the copy directly without knowing its position
            System.out.println("Uppercase version: " + name.toUpperCase());
        }
    }
}
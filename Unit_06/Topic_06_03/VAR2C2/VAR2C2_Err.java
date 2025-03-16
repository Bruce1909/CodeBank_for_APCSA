/**
 * VAR-2.C.2 Error Example
 * For each iteration of the enhanced `for` loop, the enhanced `for` loop variable 
 * is assigned a copy of an element without using its index.
 * 
 * This program demonstrates common errors related to trying to access indices in enhanced for loops.
 */
public class VAR2C2_Err {
    public static void main(String[] args) {
        // Create a 1D array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Error example 1: Trying to access index in enhanced for loop");
        
        // ERROR: Enhanced for loops don't provide access to the index
        // This code won't compile if uncommented
        /* Uncomment to see error
        for (int num : numbers) {
            // There is no 'i' or index variable in an enhanced for loop
            System.out.println("Element at index " + i + ": " + num); // Error: i cannot be resolved to a variable
        }
        */
        
        // ERROR: Trying to modify the array using the loop variable
        System.out.println("\nError example 2: Trying to modify array elements");
        
        // Print original array
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Attempt to modify array elements (which won't work)
        for (int num : numbers) {
            // This only modifies the local copy, not the array element
            num = num * 2;
            System.out.println("Modified copy: " + num);
        }
        
        // Print array after attempted modification
        System.out.println("\nArray after attempted modification (unchanged):");
        for (int num : numbers) {
            System.out.print(num + " "); // Will still show original values
        }
        System.out.println();
        
        // Correct way to modify array elements (using indexed for loop)
        System.out.println("\nCorrect way to modify array elements (using indexed for loop):");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        
        // Print modified array
        System.out.println("Array after proper modification:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
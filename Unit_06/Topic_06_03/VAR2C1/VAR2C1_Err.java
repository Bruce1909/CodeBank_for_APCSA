/**
 * VAR-2.C.1 Error Example
 * An enhanced `for` loop header includes a variable, referred to as the enhanced `for` loop variable.
 * 
 * This program demonstrates common errors when declaring enhanced for loop variables.
 */
public class VAR2C1_Err {
    public static void main(String[] args) {
        // Create a 1D array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Error example 1: Type mismatch in enhanced for loop variable");
        
        // ERROR: Type mismatch - using double for an int array
        // The loop variable should match the type of elements in the array
        // This will cause a compilation error
        /* Uncomment to see error
        for (double num : numbers) { // Type mismatch: cannot convert from int to double
            System.out.println("Current element: " + num);
        }
        */
        
        // Create a 2D array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        System.out.println("Error example 2: Incorrect type for 2D array traversal");
        
        // ERROR: Using int instead of int[] for the outer loop of a 2D array
        // This will cause a compilation error
        /* Uncomment to see error
        for (int row : matrix) { // Type mismatch: cannot convert from int[] to int
            System.out.println("Row: " + row);
        }
        */
        
        // Correct way to traverse a 2D array with enhanced for loops
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
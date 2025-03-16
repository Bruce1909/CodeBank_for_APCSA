/**
 * VAR-2.G.1 Error Example
 * Nested iteration statements are used to traverse and access all elements in a 2D array.
 * Since 2D arrays are stored as arrays of arrays, the way 2D arrays are traversed using
 * for loops and enhanced for loops is similar to 1D array objects.
 * 
 * This program demonstrates common errors when traversing 2D arrays using nested loops.
 */
public class VAR2G1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when traversing 2D arrays using nested loops:\n");
        
        // Create and initialize a 2D array
        int[][] matrix = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34}
        };
        
        // Print the original 2D array
        System.out.println("Original 2D array:");
        printMatrix(matrix);
        
        // ERROR 1: Incorrect loop bounds in nested for loops
        System.out.println("\nERROR 1: Incorrect loop bounds in nested for loops");
        try {
            System.out.println("Attempting to traverse with incorrect loop bounds:");
            System.out.print("Incorrect traversal: ");
            
            // This loop uses incorrect bounds for the inner loop
            // It should use matrix[row].length instead of matrix.length
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix.length; col++) { // Incorrect: using row count for column bound
                    // This will cause an error when col >= matrix[row].length
                    System.out.print(matrix[row][col] + " ");
                }
            }
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we used incorrect loop bounds");
            System.out.println("Should use matrix[row].length for the inner loop bound, not matrix.length");
        }
        
        // ERROR 2: Forgetting to initialize the 2D array before traversing
        System.out.println("\nERROR 2: Forgetting to initialize the 2D array before traversing");
        try {
            System.out.println("Attempting to traverse an uninitialized 2D array:");
            
            // Declare but don't initialize all elements of the 2D array
            int[][] uninitializedArray = new int[3][];
            // Only initialize the first row
            uninitializedArray[0] = new int[]{1, 2, 3, 4};
            
            System.out.println("Traversing with nested for loops:");
            for (int row = 0; row < uninitializedArray.length; row++) {
                for (int col = 0; col < uninitializedArray[row].length; col++) {
                    System.out.print(uninitializedArray[row][col] + " ");
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we tried to access a row that wasn't initialized");
            System.out.println("Always initialize all elements of a 2D array before traversing");
        }
        
        // ERROR 3: Incorrect use of enhanced for loops
        System.out.println("\nERROR 3: Incorrect use of enhanced for loops");
        try {
            System.out.println("Attempting to modify array elements using enhanced for loops:");
            
            System.out.println("Before attempted modification:");
            printMatrix(matrix);
            
            System.out.println("\nAttempting to double each element using enhanced for loops:");
            // Enhanced for loops create a copy of each element
            // Modifying the copy doesn't affect the original array
            for (int[] row : matrix) {
                for (int element : row) {
                    element *= 2; // This doesn't modify the original array!
                }
            }
            
            System.out.println("After attempted modification:");
            printMatrix(matrix);
            System.out.println("Notice that the array remains unchanged!");
            System.out.println("Enhanced for loops cannot be used to modify array elements directly");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ERROR 4: Confusing row and column indices
        System.out.println("\nERROR 4: Confusing row and column indices");
        try {
            System.out.println("Attempting to access with swapped row and column indices:");
            
            // This loop correctly iterates through rows and columns
            // But incorrectly swaps indices when accessing the array
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    // Incorrectly swapping indices during access
                    if (col < matrix.length) { // Check to prevent immediate error
                        System.out.print(matrix[col][row] + " "); // Swapped indices!
                    } else {
                        System.out.print("X "); // Placeholder to show where error would occur
                    }
                }
                System.out.println();
            }
            System.out.println("The above output is incorrect due to swapped indices");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we swapped row and column indices");
        }
        
        // ERROR 5: Misunderstanding enhanced for loop variable types
        System.out.println("\nERROR 5: Misunderstanding enhanced for loop variable types");
        try {
            System.out.println("Attempting to use incorrect variable types in enhanced for loops:");
            
            // This code won't compile - shown for educational purposes
            // The outer loop variable must be an array type (int[])
            // The inner loop variable must be the element type (int)
            /*
            for (int row : matrix) { // Error: matrix contains int[] elements, not int
                for (int[] element : row) { // Error: row contains int elements, not int[]
                    System.out.print(element + " ");
                }
            }
            */
            
            System.out.println("The commented code above would not compile");
            System.out.println("Outer loop variable must be int[] (row type)");
            System.out.println("Inner loop variable must be int (element type)");
            
            // Correct version for comparison
            System.out.println("\nCorrect enhanced for loop usage:");
            for (int[] row : matrix) { // Correct: matrix contains int[] elements
                for (int element : row) { // Correct: row contains int elements
                    System.out.print(element + " ");
                }
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Helper method to print a 2D array
    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
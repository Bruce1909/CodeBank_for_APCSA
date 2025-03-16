/**
 * VAR-2.G.1 Example
 * Nested iteration statements are used to traverse and access all elements in a 2D array.
 * Since 2D arrays are stored as arrays of arrays, the way 2D arrays are traversed using
 * for loops and enhanced for loops is similar to 1D array objects.
 * 
 * This program demonstrates how to correctly traverse 2D arrays using nested for loops
 * and nested enhanced for loops.
 */
public class VAR2G1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating traversal of 2D arrays using nested loops:\n");
        
        // Create and initialize a 2D array
        int[][] matrix = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34}
        };
        
        // Print the original 2D array
        System.out.println("Original 2D array:");
        printMatrix(matrix);
        
        // EXAMPLE 1: Traversing a 2D array using nested for loops
        System.out.println("\nEXAMPLE 1: Traversing a 2D array using nested for loops");
        System.out.print("Elements accessed using nested for loops: ");
        
        // Outer loop iterates through each row
        for (int row = 0; row < matrix.length; row++) {
            // Inner loop iterates through each column in the current row
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
        }
        System.out.println();
        
        // EXAMPLE 2: Traversing a 2D array using nested enhanced for loops
        System.out.println("\nEXAMPLE 2: Traversing a 2D array using nested enhanced for loops");
        System.out.print("Elements accessed using nested enhanced for loops: ");
        
        // Outer enhanced for loop iterates through each row (which is a 1D array)
        for (int[] row : matrix) {
            // Inner enhanced for loop iterates through each element in the current row
            for (int element : row) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
        
        // EXAMPLE 3: Comparing traditional for loops and enhanced for loops
        System.out.println("\nEXAMPLE 3: Comparing traditional for loops and enhanced for loops");
        
        System.out.println("\nDetailed traversal using nested for loops:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("matrix[" + row + "][" + col + "] = " + matrix[row][col]);
            }
        }
        
        System.out.println("\nDetailed traversal using nested enhanced for loops:");
        int rowIndex = 0;
        for (int[] row : matrix) {
            int colIndex = 0;
            for (int element : row) {
                System.out.println("matrix[" + rowIndex + "][" + colIndex + "] = " + element);
                colIndex++;
            }
            rowIndex++;
        }
        
        // EXAMPLE 4: Modifying elements during traversal
        System.out.println("\nEXAMPLE 4: Modifying elements during traversal");
        
        // Using traditional for loops to modify elements (multiply each by 2)
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] *= 2; // Multiply each element by 2
            }
        }
        
        System.out.println("\nArray after modification (each element multiplied by 2):");
        printMatrix(matrix);
        
        // EXAMPLE 5: Advantages of each loop type
        System.out.println("\nEXAMPLE 5: Advantages of each loop type");
        System.out.println("Traditional for loops advantages:");
        System.out.println("- Allow access to indices (row and column numbers)");
        System.out.println("- Allow modification of array elements");
        System.out.println("- Allow more complex traversal patterns");
        
        System.out.println("\nEnhanced for loops advantages:");
        System.out.println("- Cleaner, more concise syntax");
        System.out.println("- Less prone to off-by-one errors");
        System.out.println("- No need to manage indices manually");
        System.out.println("- Intention to traverse the entire array is clear");
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
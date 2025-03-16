/**
 * VAR-2.G.2 Example
 * Nested iteration statements can be written to traverse the 2D array in "row-major order" 
 * or "column-major order."
 * 
 * This program demonstrates how to traverse 2D arrays in both row-major and column-major order
 * using nested for loops.
 */
public class VAR2G2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating row-major and column-major traversal of 2D arrays:\n");
        
        // Create and initialize a 2D array
        int[][] matrix = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34}
        };
        
        // Print the original 2D array
        System.out.println("Original 2D array:");
        printMatrix(matrix);
        
        // EXAMPLE 1: Row-major traversal (standard in Java)
        System.out.println("\nEXAMPLE 1: Row-major traversal (across each row)");
        System.out.println("This is the standard way to traverse arrays in Java");
        System.out.print("Elements in row-major order: ");
        
        // Outer loop iterates through rows, inner loop through columns
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
        }
        System.out.println();
        
        // EXAMPLE 2: Column-major traversal
        System.out.println("\nEXAMPLE 2: Column-major traversal (down each column)");
        System.out.print("Elements in column-major order: ");
        
        // Outer loop iterates through columns, inner loop through rows
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                System.out.print(matrix[row][col] + " ");
            }
        }
        System.out.println();
        
        // EXAMPLE 3: Detailed comparison of traversal orders
        System.out.println("\nEXAMPLE 3: Detailed comparison of traversal orders");
        
        System.out.println("\nRow-major traversal (detailed):");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("Visiting matrix[" + row + "][" + col + "] = " + matrix[row][col]);
            }
        }
        
        System.out.println("\nColumn-major traversal (detailed):");
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                System.out.println("Visiting matrix[" + row + "][" + col + "] = " + matrix[row][col]);
            }
        }
        
        // EXAMPLE 4: Practical applications of different traversal orders
        System.out.println("\nEXAMPLE 4: Practical applications of different traversal orders");
        
        // Row-major traversal for calculating row sums
        System.out.println("\nUsing row-major traversal to calculate row sums:");
        for (int row = 0; row < matrix.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                rowSum += matrix[row][col];
            }
            System.out.println("Sum of row " + row + ": " + rowSum);
        }
        
        // Column-major traversal for calculating column sums
        System.out.println("\nUsing column-major traversal to calculate column sums:");
        for (int col = 0; col < matrix[0].length; col++) {
            int colSum = 0;
            for (int row = 0; row < matrix.length; row++) {
                colSum += matrix[row][col];
            }
            System.out.println("Sum of column " + col + ": " + colSum);
        }
        
        // EXAMPLE 5: Performance considerations
        System.out.println("\nEXAMPLE 5: Performance considerations");
        System.out.println("In Java, 2D arrays are stored in row-major order in memory.");
        System.out.println("This means row-major traversal is generally more efficient");
        System.out.println("because it accesses memory in sequential order.");
        System.out.println("Column-major traversal may be less efficient due to cache misses.");
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
/**
 * VAR-2.F.5 Example
 * "Row-major order" refers to an ordering of 2D array elements where traversal occurs across each row,
 * while "column-major order" traversal occurs down each column.
 * 
 * This program demonstrates row-major and column-major traversal of 2D arrays.
 */
public class VAR2F5_Exp {
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
        
        // Row-major traversal (standard in Java)
        System.out.println("\nRow-major traversal (across each row):");
        System.out.println("This is the standard way to traverse arrays in Java");
        System.out.print("Elements in row-major order: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
        }
        System.out.println();
        
        // Column-major traversal
        System.out.println("\nColumn-major traversal (down each column):");
        System.out.print("Elements in column-major order: ");
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                System.out.print(matrix[row][col] + " ");
            }
        }
        System.out.println();
        
        // Comparing row-major and column-major traversal with detailed output
        System.out.println("\nDetailed comparison of row-major and column-major traversal:");
        
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
        
        // Practical applications of row-major and column-major traversal
        System.out.println("\nPractical applications of row-major and column-major traversal:");
        
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
        
        // Performance considerations
        System.out.println("\nPerformance considerations:");
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
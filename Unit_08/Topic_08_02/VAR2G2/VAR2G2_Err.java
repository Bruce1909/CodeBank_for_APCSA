/**
 * VAR-2.G.2 Error Example
 * Nested iteration statements can be written to traverse the 2D array in "row-major order" 
 * or "column-major order."
 * 
 * This program demonstrates common errors when traversing 2D arrays in row-major and column-major order.
 */
public class VAR2G2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when traversing 2D arrays in different orders:\n");
        
        // Create and initialize a 2D array
        int[][] matrix = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34}
        };
        
        // Print the original 2D array
        System.out.println("Original 2D array:");
        printMatrix(matrix);
        
        // ERROR 1: Confusing row-major and column-major traversal
        System.out.println("\nERROR 1: Confusing row-major and column-major traversal");
        try {
            System.out.println("Attempting to print elements in row-major order but using column-major logic:");
            System.out.print("Confused traversal: ");
            
            // This is intended to be row-major but is actually mixing both approaches incorrectly
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[0].length; col++) {
                    // Incorrectly accessing elements by swapping indices
                    System.out.print(matrix[col][row] + " "); // Should be matrix[row][col]
                }
            }
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we confused row-major and column-major traversal");
            System.out.println("When row index exceeds the number of rows, an exception occurs");
        }
        
        // ERROR 2: Incorrect bounds for column-major traversal
        System.out.println("\nERROR 2: Incorrect bounds for column-major traversal");
        try {
            System.out.println("Attempting column-major traversal with incorrect bounds:");
            System.out.print("Incorrect column-major traversal: ");
            
            // Using incorrect bounds for column-major traversal
            // Using matrix.length for column bound instead of matrix[0].length
            for (int col = 0; col < matrix.length; col++) { // Incorrect: should be matrix[0].length
                for (int row = 0; row < matrix.length; row++) {
                    if (col < matrix[0].length) { // Safety check to prevent immediate error
                        System.out.print(matrix[row][col] + " ");
                    } else {
                        System.out.print("X "); // Placeholder for out-of-bounds elements
                    }
                }
            }
            System.out.println();
            System.out.println("The above traversal uses incorrect bounds for column-major order");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we used incorrect loop bounds");
        }
        
        // ERROR 3: Inconsistent traversal order in calculations
        System.out.println("\nERROR 3: Inconsistent traversal order in calculations");
        try {
            System.out.println("Attempting to calculate row sums using column-major traversal:");
            
            // This is an inefficient and error-prone way to calculate row sums
            // Row sums should use row-major traversal for clarity and efficiency
            int[] rowSums = new int[matrix.length];
            
            // Using column-major traversal for row sums (confusing and inefficient)
            for (int col = 0; col < matrix[0].length; col++) {
                for (int row = 0; row < matrix.length; row++) {
                    rowSums[row] += matrix[row][col];
                }
            }
            
            System.out.println("Row sums calculated using column-major traversal:");
            for (int i = 0; i < rowSums.length; i++) {
                System.out.println("Sum of row " + i + ": " + rowSums[i]);
            }
            
            System.out.println("\nWhile this works, it's confusing and inefficient.");
            System.out.println("Row operations should use row-major traversal for clarity.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ERROR 4: Attempting column-major traversal with enhanced for loops
        System.out.println("\nERROR 4: Attempting column-major traversal with enhanced for loops");
        try {
            System.out.println("Enhanced for loops can only traverse in row-major order:");
            System.out.println("There is no direct way to do column-major traversal with enhanced for loops.");
            
            // This is the only way enhanced for loops can traverse a 2D array
            System.out.print("Enhanced for loop traversal (always row-major): ");
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
            }
            System.out.println();
            
            System.out.println("\nAttempting to simulate column-major traversal with enhanced for loops");
            System.out.println("would require extracting each column into a separate array first,");
            System.out.println("which is inefficient and defeats the purpose of enhanced for loops.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ERROR 5: Performance misconceptions
        System.out.println("\nERROR 5: Performance misconceptions");
        System.out.println("Common misconception: All traversal orders are equally efficient");
        System.out.println("Reality: In Java, 2D arrays are stored in row-major order in memory");
        System.out.println("This means row-major traversal is generally more efficient");
        System.out.println("because it accesses memory in sequential order.");
        System.out.println("Column-major traversal may cause cache misses, reducing performance.");
        System.out.println("This is especially important for large arrays.");
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
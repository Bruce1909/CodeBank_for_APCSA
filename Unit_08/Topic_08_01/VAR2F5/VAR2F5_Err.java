/**
 * VAR-2.F.5 Error Example
 * "Row-major order" refers to an ordering of 2D array elements where traversal occurs across each row,
 * while "column-major order" traversal occurs down each column.
 * 
 * This program demonstrates common errors when traversing 2D arrays in row-major and column-major order.
 */
public class VAR2F5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when traversing 2D arrays:\n");
        
        // Create and initialize a 2D array
        int[][] matrix = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34}
        };
        
        // Print the original 2D array
        System.out.println("Original 2D array:");
        printMatrix(matrix);
        
        // ERROR 1: Mixing row-major and column-major traversal incorrectly
        System.out.println("\nERROR 1: Mixing row-major and column-major traversal incorrectly");
        try {
            System.out.println("Attempting to mix traversal styles in a confusing way:");
            System.out.print("Confused traversal: ");
            
            // This loop starts with row-major indexing but uses column-major logic
            // It's confusing and error-prone
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[0].length; col++) {
                    // Incorrectly swapping indices during access
                    // This will cause an error when col >= matrix.length
                    if (col < matrix.length) {
                        System.out.print(matrix[col][row] + " "); // Swapped indices
                    } else {
                        System.out.print("Error: Index out of bounds would occur here");
                    }
                }
            }
            System.out.println();
            System.out.println("The above traversal is confusing and error-prone");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we mixed row and column indices incorrectly");
        }
        
        // ERROR 2: Incorrect loop bounds for column-major traversal
        System.out.println("\nERROR 2: Incorrect loop bounds for column-major traversal");
        try {
            System.out.println("Attempting column-major traversal with incorrect bounds:");
            System.out.print("Incorrect column-major traversal: ");
            
            // This loop uses matrix.length for the column bound, which is incorrect
            // It should use matrix[0].length instead
            for (int col = 0; col < matrix.length; col++) { // Incorrect: using row count for column bound
                for (int row = 0; row < matrix.length; row++) {
                    if (col < matrix[0].length) {
                        System.out.print(matrix[row][col] + " ");
                    } else {
                        System.out.print("Error: Index out of bounds would occur here ");
                    }
                }
            }
            System.out.println();
            System.out.println("The above traversal uses incorrect bounds for column-major order");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we used incorrect loop bounds");
        }
        
        // ERROR 3: Forgetting that 2D arrays might have different column lengths per row
        // Note: Non-rectangular arrays are outside the scope of the AP Exam
        System.out.println("\nERROR 3: Forgetting that 2D arrays might have different column lengths per row");
        System.out.println("(Note: Non-rectangular arrays are outside the scope of the AP Exam)");
        try {
            System.out.println("Creating a jagged array (different column lengths per row):");
            int[][] jaggedArray = new int[3][];
            jaggedArray[0] = new int[]{1, 2};
            jaggedArray[1] = new int[]{3, 4, 5, 6};
            jaggedArray[2] = new int[]{7};
            
            System.out.println("Jagged array contents:");
            printMatrix(jaggedArray);
            
            System.out.println("\nAttempting column-major traversal on a jagged array:");
            System.out.print("Column-major traversal on jagged array: ");
            
            // This assumes all rows have the same number of columns
            // For a jagged array, we need to check each row's length
            int maxCols = 0;
            for (int i = 0; i < jaggedArray.length; i++) {
                if (jaggedArray[i].length > maxCols) {
                    maxCols = jaggedArray[i].length;
                }
            }
            
            for (int col = 0; col < maxCols; col++) {
                for (int row = 0; row < jaggedArray.length; row++) {
                    try {
                        if (col < jaggedArray[row].length) {
                            System.out.print(jaggedArray[row][col] + " ");
                        } else {
                            System.out.print("X "); // Placeholder for missing elements
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.print("Error! ");
                    }
                }
            }
            System.out.println();
            System.out.println("Column-major traversal on jagged arrays requires special handling");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ERROR 4: Performance issues with column-major traversal
        System.out.println("\nERROR 4: Performance issues with column-major traversal");
        System.out.println("Java stores 2D arrays in row-major order in memory");
        System.out.println("Column-major traversal can be less efficient due to cache misses");
        System.out.println("This is not a syntax error but a performance consideration");
        
        // Demonstrate with a larger array (commented out to avoid long output)
        System.out.println("\nFor large arrays, the performance difference can be significant");
        System.out.println("Row-major traversal accesses memory sequentially");
        System.out.println("Column-major traversal jumps through memory, causing cache misses");
        
        // ERROR 5: Confusing enhanced for loop traversal order
        System.out.println("\nERROR 5: Confusing enhanced for loop traversal order");
        System.out.println("Enhanced for loops always traverse in row-major order for 2D arrays");
        System.out.println("Attempting to use enhanced for loops:");
        
        System.out.print("Enhanced for loop traversal: ");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
        
        System.out.println("\nThere is no direct way to do column-major traversal with enhanced for loops");
        System.out.println("Attempting to do so would require extracting columns first, which is inefficient");
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
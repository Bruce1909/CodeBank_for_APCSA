/**
 * VAR-2.G.3 Error Example
 * The outer loop of a nested enhanced for loop used to traverse a 2D array traverses the rows.
 * Therefore, the enhanced for loop variable must be the type of each row, which is a 1D array.
 * The inner loop traverses a single row. Therefore, the inner enhanced for loop variable must be
 * the same type as the elements stored in the 1D array.
 * 
 * This program demonstrates common errors when using nested enhanced for loops with 2D arrays.
 */
public class VAR2G3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with nested enhanced for loops for 2D arrays:\n");
        
        // Create and initialize a 2D array
        int[][] matrix = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34}
        };
        
        // Print the original 2D array
        System.out.println("Original 2D array:");
        printMatrix(matrix);
        
        // ERROR 1: Incorrect variable type in outer enhanced for loop
        System.out.println("\nERROR 1: Incorrect variable type in outer enhanced for loop");
        System.out.println("The following code would not compile:");
        System.out.println("// Outer loop variable should be int[] (row type), not int");
        System.out.println("for (int row : matrix) { // Error: matrix contains int[] elements, not int");
        System.out.println("    // Loop body");
        System.out.println("}");
        System.out.println("\nThis error occurs because the outer loop variable must match the type");
        System.out.println("of elements in the 2D array, which are 1D arrays (int[]), not integers.");
        
        // ERROR 2: Incorrect variable type in inner enhanced for loop
        System.out.println("\nERROR 2: Incorrect variable type in inner enhanced for loop");
        System.out.println("The following code would not compile:");
        System.out.println("for (int[] row : matrix) { // Correct: matrix contains int[] elements");
        System.out.println("    for (int[] element : row) { // Error: row contains int elements, not int[]");
        System.out.println("        // Loop body");
        System.out.println("    }");
        System.out.println("}");
        System.out.println("\nThis error occurs because the inner loop variable must match the type");
        System.out.println("of elements in each row, which are integers (int), not arrays.");
        
        // ERROR 3: Attempting to modify array elements with enhanced for loops
        System.out.println("\nERROR 3: Attempting to modify array elements with enhanced for loops");
        try {
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
            System.out.println("because they work with copies of the elements, not references.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ERROR 4: Attempting to access indices with enhanced for loops
        System.out.println("\nERROR 4: Attempting to access indices with enhanced for loops");
        System.out.println("Enhanced for loops do not provide direct access to array indices.");
        System.out.println("The following approach is required to track indices:");
        
        int rowIndex = 0;
        for (int[] row : matrix) {
            int colIndex = 0;
            for (int element : row) {
                System.out.println("Element at position [" + rowIndex + "][" + colIndex + "] = " + element);
                colIndex++; // Must manually track column index
            }
            rowIndex++; // Must manually track row index
        }
        
        System.out.println("\nThis requires additional variables to track indices,");
        System.out.println("which can be error-prone and defeats some of the simplicity");
        System.out.println("advantages of enhanced for loops.");
        
        // ERROR 5: Attempting column-major traversal with enhanced for loops
        System.out.println("\nERROR 5: Attempting column-major traversal with enhanced for loops");
        System.out.println("Enhanced for loops can only traverse 2D arrays in row-major order.");
        System.out.println("There is no direct way to do column-major traversal with enhanced for loops.");
        System.out.println("The following would be required to simulate column-major traversal:");
        
        // Create temporary arrays to hold each column
        System.out.println("\n// Create temporary arrays to hold each column");
        System.out.println("int[][] columns = new int[matrix[0].length][matrix.length];");
        System.out.println("// Copy data from matrix to columns (transposing)");
        System.out.println("for (int row = 0; row < matrix.length; row++) {");
        System.out.println("    for (int col = 0; col < matrix[0].length; col++) {");
        System.out.println("        columns[col][row] = matrix[row][col];");
        System.out.println("    }");
        System.out.println("}");
        System.out.println("// Now use enhanced for loops on the transposed matrix");
        System.out.println("for (int[] col : columns) {");
        System.out.println("    for (int element : col) {");
        System.out.println("        // Process element");
        System.out.println("    }");
        System.out.println("}");
        
        System.out.println("\nThis approach is inefficient and defeats the purpose of enhanced for loops.");
        System.out.println("Traditional nested for loops are better for column-major traversal.");
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
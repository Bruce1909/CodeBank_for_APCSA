/**
 * VAR-2.F.1 Error Example
 * 2D arrays are stored as arrays of arrays. Therefore, the way 2D arrays are created
 * and indexed is similar to 1D array objects.
 * 
 * This program demonstrates common errors when working with 2D arrays.
 */
public class VAR2F1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with 2D arrays:\n");
        
        // ERROR 1: Forgetting that 2D arrays are arrays of arrays
        System.out.println("ERROR 1: Forgetting that 2D arrays are arrays of arrays");
        try {
            System.out.println("Attempting to create a 2D array with incorrect initialization:");
            // This will cause a compile-time error, commented out for demonstration
            // int[][] matrix = new int[3, 3]; // Incorrect: using comma instead of separate brackets
            
            // Correct way:
            int[][] matrix = new int[3][3];
            System.out.println("Correct way: int[][] matrix = new int[3][3];");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ERROR 2: Array index out of bounds
        System.out.println("\nERROR 2: Array index out of bounds");
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        System.out.println("matrix1 has " + matrix1.length + " rows and " + matrix1[0].length + " columns");
        
        try {
            System.out.println("Attempting to access matrix1[2][0] (row index out of bounds):");
            int value = matrix1[2][0]; // Row index out of bounds
            System.out.println("This line won't execute");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we tried to access a row that doesn't exist");
        }
        
        try {
            System.out.println("\nAttempting to access matrix1[0][3] (column index out of bounds):");
            int value = matrix1[0][3]; // Column index out of bounds
            System.out.println("This line won't execute");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we tried to access a column that doesn't exist");
        }
        
        // ERROR 3: Forgetting to initialize the second dimension
        System.out.println("\nERROR 3: Forgetting to initialize the second dimension");
        try {
            System.out.println("Creating a 2D array with only the first dimension initialized:");
            int[][] matrix2 = new int[2][]; // Only first dimension initialized
            System.out.println("matrix2 has " + matrix2.length + " rows");
            
            // This is valid - we can initialize each row separately
            matrix2[0] = new int[3];
            System.out.println("Successfully initialized matrix2[0] with length " + matrix2[0].length);
            
            // But trying to access the second row before initializing it will cause an error
            System.out.println("Attempting to access matrix2[1][0] before initializing the row:");
            int value = matrix2[1][0]; // NullPointerException - row not initialized
            System.out.println("This line won't execute");
        } catch (NullPointerException e) {
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we tried to access a row that was declared but not initialized");
        }
        
        // ERROR 4: Confusing rows and columns
        System.out.println("\nERROR 4: Confusing rows and columns");
        int[][] matrix3 = new int[2][4]; // 2 rows, 4 columns
        System.out.println("matrix3 has " + matrix3.length + " rows and " + matrix3[0].length + " columns");
        
        try {
            System.out.println("Attempting to iterate with row and column indices swapped:");
            // This loop has the row and column bounds confused
            // It tries to iterate through 4 rows (but there are only 2)
            for (int i = 0; i < matrix3[0].length; i++) { // Incorrect: using column length for row iteration
                for (int j = 0; j < matrix3.length; j++) { // Incorrect: using row length for column iteration
                    matrix3[i][j] = i * j;
                    System.out.println("Setting matrix3[" + i + "][" + j + "] = " + (i * j));
                }
            }
            System.out.println("This loop will cause an error when i reaches 2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we confused rows and columns in our loop bounds");
        }
        
        // ERROR 5: Assuming all rows have the same length (only relevant for non-rectangular arrays)
        System.out.println("\nERROR 5: Assuming all rows have the same length");
        System.out.println("(Note: Non-rectangular arrays are outside the scope of the AP Exam)");
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[1];
        
        System.out.println("Created a jagged array with rows of different lengths:");
        System.out.println("Row 0 length: " + jaggedArray[0].length);
        System.out.println("Row 1 length: " + jaggedArray[1].length);
        System.out.println("Row 2 length: " + jaggedArray[2].length);
        
        try {
            System.out.println("\nAttempting to access jaggedArray[2][1] (beyond the length of row 2):");
            int value = jaggedArray[2][1]; // Index out of bounds for row 2
            System.out.println("This line won't execute");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we assumed all rows have the same length");
        }
    }
}
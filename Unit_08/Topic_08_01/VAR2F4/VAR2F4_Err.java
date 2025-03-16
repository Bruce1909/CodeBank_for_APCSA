/**
 * VAR-2.F.4 Error Example
 * The square brackets [row][col] are used to access and modify an element in a 2D array.
 * 
 * This program demonstrates common errors when accessing and modifying elements in a 2D array.
 */
public class VAR2F4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when accessing and modifying elements in a 2D array:\n");
        
        // Create and initialize a 2D array
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        
        // Print the original 2D array
        System.out.println("Original 2D array:");
        printMatrix(matrix);
        
        // ERROR 1: Array index out of bounds
        System.out.println("\nERROR 1: Array index out of bounds");
        try {
            System.out.println("Attempting to access an element outside the array bounds:");
            int element = matrix[3][1]; // Row index out of bounds (only 0-2 are valid)
            System.out.println("This line won't execute");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we tried to access row 3, which doesn't exist");
        }
        
        try {
            System.out.println("\nAttempting to access an element with negative index:");
            int element = matrix[1][-1]; // Negative column index is invalid
            System.out.println("This line won't execute");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we tried to use a negative index");
        }
        
        // ERROR 2: Using non-integer indices
        System.out.println("\nERROR 2: Using non-integer indices");
        System.out.println("Attempting to use non-integer values as indices:");
        // This would cause a compile-time error, commented out for demonstration
        // double rowIndex = 1.5;
        // int element = matrix[rowIndex][2]; // Error: incompatible types
        
        System.out.println("The above code would cause a compile-time error");
        System.out.println("Array indices must be integer values");
        
        // ERROR 3: Forgetting that arrays are zero-indexed
        System.out.println("\nERROR 3: Forgetting that arrays are zero-indexed");
        System.out.println("matrix has " + matrix.length + " rows and " + matrix[0].length + " columns");
        System.out.println("Valid row indices are 0 to " + (matrix.length - 1));
        System.out.println("Valid column indices are 0 to " + (matrix[0].length - 1));
        
        try {
            System.out.println("\nAttempting to access the 'third' element using index 3:");
            // Common mistake: thinking the third element is at index 3
            int element = matrix[1][3]; // Column index out of bounds (only 0-2 are valid)
            System.out.println("This line won't execute");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we forgot arrays are zero-indexed");
            System.out.println("The third element is at index 2, not 3");
        }
        
        // ERROR 4: Modifying an array element with incompatible type
        System.out.println("\nERROR 4: Modifying an array element with incompatible type");
        System.out.println("Attempting to assign a double value to an int array element:");
        // This would cause a compile-time error, commented out for demonstration
        // matrix[0][0] = 10.5; // Error: incompatible types
        
        System.out.println("The above code would cause a compile-time error");
        System.out.println("Cannot assign a double value to an int array element without casting");
        
        // Correct way with casting (but potential loss of precision)
        matrix[0][0] = (int) 10.5;
        System.out.println("Correct way with casting: matrix[0][0] = (int) 10.5; // Result: " + matrix[0][0]);
        
        // ERROR 5: Using string concatenation instead of addition
        System.out.println("\nERROR 5: Using string concatenation instead of addition");
        try {
            System.out.println("Attempting to use string concatenation to calculate an index:");
            String rowStr = "1";
            String colStr = "2";
            // Common mistake: string concatenation instead of numeric addition
            int element = matrix[Integer.parseInt(rowStr + colStr)][0]; // Tries to access row 12, not row 3
            System.out.println("This line won't execute");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we concatenated strings instead of adding numbers");
            System.out.println("'1' + '2' as strings = '12', not 3");
        }
        
        // Correct way to add numeric values from strings
        String rowStr = "1";
        String colStr = "2";
        int rowIndex = Integer.parseInt(rowStr);
        int colIndex = Integer.parseInt(colStr);
        int element = matrix[rowIndex][colIndex];
        System.out.println("Correct way: matrix[" + rowIndex + "][" + colIndex + "] = " + element);
    }
    
    // Helper method to print a 2D array
    public static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
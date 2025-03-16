/**
 * VAR-2.F.1 Example
 * 2D arrays are stored as arrays of arrays. Therefore, the way 2D arrays are created
 * and indexed is similar to 1D array objects.
 * 
 * This program demonstrates how to create, initialize, and access elements in a 2D array.
 */
public class VAR2F1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating 2D arrays as arrays of arrays:\n");
        
        // Method 1: Declare and initialize a 2D array in one statement
        System.out.println("Method 1: Declare and initialize a 2D array in one statement");
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Print the 2D array
        System.out.println("matrix1 contents:");
        printMatrix(matrix1);
        
        // Method 2: Create an empty 2D array and then populate it
        System.out.println("\nMethod 2: Create an empty 2D array and then populate it");
        int[][] matrix2 = new int[3][3]; // 3 rows, 3 columns
        
        // Populate the 2D array
        int value = 1;
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = value++;
            }
        }
        
        // Print the 2D array
        System.out.println("matrix2 contents:");
        printMatrix(matrix2);
        
        // Method 3: Create a 2D array with arrays of different lengths
        // Note: This is outside the scope of the AP Exam (non-rectangular arrays)
        // but included for completeness
        System.out.println("\nMethod 3: Create a 2D array with arrays of different lengths");
        System.out.println("(Note: Non-rectangular arrays are outside the scope of the AP Exam)");
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[3];
        
        // Populate the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (i + 1) * 10 + j;
            }
        }
        
        // Print the jagged array
        System.out.println("jaggedArray contents:");
        printMatrix(jaggedArray);
        
        // Demonstrate that a 2D array is an array of arrays
        System.out.println("\nDemonstrating that a 2D array is an array of arrays:");
        int[] firstRow = matrix1[0]; // Get the first row (which is a 1D array)
        System.out.print("First row of matrix1: ");
        for (int num : firstRow) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Access individual elements
        System.out.println("\nAccessing individual elements:");
        System.out.println("matrix1[1][2] = " + matrix1[1][2]); // Row 1, Column 2 (value: 6)
        System.out.println("matrix2[2][0] = " + matrix2[2][0]); // Row 2, Column 0 (value: 7)
        
        // Modify an element
        System.out.println("\nModifying an element:");
        System.out.println("Before: matrix1[0][0] = " + matrix1[0][0]);
        matrix1[0][0] = 99;
        System.out.println("After: matrix1[0][0] = " + matrix1[0][0]);
        
        // Print the updated matrix
        System.out.println("\nUpdated matrix1:");
        printMatrix(matrix1);
    }
    
    // Helper method to print a 2D array
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
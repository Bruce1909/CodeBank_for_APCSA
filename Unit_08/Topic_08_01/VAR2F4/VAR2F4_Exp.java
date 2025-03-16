/**
 * VAR-2.F.4 Example
 * The square brackets [row][col] are used to access and modify an element in a 2D array.
 * 
 * This program demonstrates how to use square brackets to access and modify elements in a 2D array.
 */
public class VAR2F4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how to access and modify elements in a 2D array:\n");
        
        // Create and initialize a 2D array
        int[][] matrix = {
            {10, 20, 30, 40},
            {50, 60, 70, 80},
            {90, 100, 110, 120}
        };
        
        // Print the original 2D array
        System.out.println("Original 2D array:");
        printMatrix(matrix);
        
        // Accessing elements using square brackets
        System.out.println("\nAccessing elements using square brackets:");
        int element1 = matrix[0][0]; // First row, first column
        int element2 = matrix[1][2]; // Second row, third column
        int element3 = matrix[2][3]; // Third row, fourth column
        
        System.out.println("Element at matrix[0][0]: " + element1);
        System.out.println("Element at matrix[1][2]: " + element2);
        System.out.println("Element at matrix[2][3]: " + element3);
        
        // Modifying elements using square brackets
        System.out.println("\nModifying elements using square brackets:");
        System.out.println("Before modification: matrix[0][1] = " + matrix[0][1]);
        matrix[0][1] = 25; // Modify first row, second column
        System.out.println("After modification: matrix[0][1] = " + matrix[0][1]);
        
        System.out.println("Before modification: matrix[2][0] = " + matrix[2][0]);
        matrix[2][0] = 95; // Modify third row, first column
        System.out.println("After modification: matrix[2][0] = " + matrix[2][0]);
        
        // Print the modified 2D array
        System.out.println("\nModified 2D array:");
        printMatrix(matrix);
        
        // Using variables as indices
        System.out.println("\nUsing variables as indices:");
        int row = 1;
        int col = 3;
        System.out.println("Value at matrix[" + row + "][" + col + "] = " + matrix[row][col]);
        
        // Modifying elements using variable indices
        matrix[row][col] = 85;
        System.out.println("After modification: matrix[" + row + "][" + col + "] = " + matrix[row][col]);
        
        // Using expressions as indices
        System.out.println("\nUsing expressions as indices:");
        int rowOffset = 1;
        int colOffset = 2;
        System.out.println("Value at matrix[1 + " + rowOffset + "][2 - " + colOffset + "] = " + 
                          matrix[1 + rowOffset][2 - colOffset]);
        
        // Accessing elements in a loop
        System.out.println("\nAccessing elements in nested loops:");
        int sum = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sum += matrix[r][c];
                System.out.println("Added matrix[" + r + "][" + c + "] = " + matrix[r][c] + ", Sum = " + sum);
            }
        }
        System.out.println("Total sum of all elements: " + sum);
        
        // Modifying elements in a loop
        System.out.println("\nModifying elements in nested loops:");
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                // Double each element
                matrix[r][c] *= 2;
            }
        }
        
        // Print the final 2D array
        System.out.println("Final 2D array (all elements doubled):");
        printMatrix(matrix);
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
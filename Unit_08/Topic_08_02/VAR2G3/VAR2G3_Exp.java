/**
 * VAR-2.G.3 Example
 * The outer loop of a nested enhanced for loop used to traverse a 2D array traverses the rows.
 * Therefore, the enhanced for loop variable must be the type of each row, which is a 1D array.
 * The inner loop traverses a single row. Therefore, the inner enhanced for loop variable must be
 * the same type as the elements stored in the 1D array.
 * 
 * This program demonstrates the correct use of nested enhanced for loops to traverse 2D arrays.
 */
public class VAR2G3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating correct use of nested enhanced for loops for 2D arrays:\n");
        
        // Create and initialize a 2D array
        int[][] matrix = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34}
        };
        
        // Print the original 2D array
        System.out.println("Original 2D array:");
        printMatrix(matrix);
        
        // EXAMPLE 1: Basic traversal with nested enhanced for loops
        System.out.println("\nEXAMPLE 1: Basic traversal with nested enhanced for loops");
        System.out.print("Elements accessed using nested enhanced for loops: ");
        
        // Outer enhanced for loop variable is a 1D array (row)
        for (int[] row : matrix) {
            // Inner enhanced for loop variable is an element (int)
            for (int element : row) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
        
        // EXAMPLE 2: Understanding the variable types in nested enhanced for loops
        System.out.println("\nEXAMPLE 2: Understanding the variable types in nested enhanced for loops");
        System.out.println("Outer loop variable type: int[] (1D array)");
        System.out.println("Inner loop variable type: int (element type)");
        
        System.out.println("\nDetailed traversal with type information:");
        int rowIndex = 0;
        for (int[] row : matrix) { // row is a 1D array of integers
            System.out.println("Row " + rowIndex + " (type: int[]) contains " + row.length + " elements");
            
            int colIndex = 0;
            for (int element : row) { // element is an integer
                System.out.println("  Element at position [" + rowIndex + "][" + colIndex + "] (type: int): " + element);
                colIndex++;
            }
            rowIndex++;
        }
        
        // EXAMPLE 3: Demonstrating that enhanced for loops always traverse in row-major order
        System.out.println("\nEXAMPLE 3: Enhanced for loops always traverse in row-major order");
        System.out.println("There is no direct way to do column-major traversal with enhanced for loops");
        
        System.out.print("Enhanced for loop traversal (always row-major): ");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
        
        // EXAMPLE 4: Using enhanced for loops with different element types
        System.out.println("\nEXAMPLE 4: Using enhanced for loops with different element types");
        
        // Create a 2D array of strings
        String[][] words = {
            {"apple", "banana", "cherry"},
            {"dog", "elephant", "fox"},
            {"green", "blue", "red"}
        };
        
        System.out.println("2D array of strings:");
        for (String[] row : words) { // Outer loop variable is String[] (row type)
            for (String word : row) { // Inner loop variable is String (element type)
                System.out.print(word + "\t");
            }
            System.out.println();
        }
        
        // EXAMPLE 5: Limitations of enhanced for loops
        System.out.println("\nEXAMPLE 5: Limitations of enhanced for loops");
        System.out.println("Enhanced for loops cannot be used to:");
        System.out.println("- Modify array elements directly");
        System.out.println("- Access array indices");
        System.out.println("- Traverse in column-major order");
        System.out.println("- Skip elements or traverse in reverse");
        
        System.out.println("\nFor these operations, traditional for loops are required.");
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
/**
 * VAR-2.F.2 Error Example
 * For the purposes of the exam, when accessing the element at arr[first][second],
 * the first index is used for rows, the second index is used for columns.
 * 
 * This program demonstrates common errors related to row and column indexing in 2D arrays.
 */
public class VAR2F2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with row and column indexing in 2D arrays:\n");
        
        // Create a 2D array with 3 rows and 4 columns
        int[][] grid = new int[3][4];
        
        // Fill the array with values
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = row * 10 + col;
            }
        }
        
        // Print the 2D array in a grid format
        System.out.println("The 2D array grid contents:");
        printGrid(grid);
        
        // ERROR 1: Confusing row and column indices
        System.out.println("\nERROR 1: Confusing row and column indices");
        try {
            System.out.println("Attempting to access grid[col][row] instead of grid[row][col]:");
            // Intentionally swap row and column indices
            int value = grid[2][3]; // This is correct: row 2, column 3
            System.out.println("Correct access: grid[2][3] = " + value);
            
            System.out.println("\nNow let's swap the indices (thinking of them as x,y coordinates):");
            // Many students mistakenly think of 2D arrays as (x,y) coordinates
            // where x is column and y is row, but in Java it's [row][column]
            value = grid[3][2]; // This will cause an error: row 3 doesn't exist
            System.out.println("This line won't execute");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we confused row and column indices");
            System.out.println("Remember: In Java 2D arrays, the first index is for rows, the second for columns");
        }
        
        // ERROR 2: Inconsistent mental model when iterating
        System.out.println("\nERROR 2: Inconsistent mental model when iterating");
        try {
            System.out.println("Attempting to iterate with inconsistent row/column understanding:");
            // This loop has the correct bounds but incorrect variable names
            // which can lead to confusion and logical errors
            for (int col = 0; col < grid.length; col++) { // Incorrect naming: this is actually the row index
                for (int row = 0; row < grid[col].length; row++) { // Incorrect naming: this is actually the column index
                    // The access will work but the mental model is wrong
                    System.out.println("Accessing grid[" + col + "][" + row + "] = " + grid[col][row]);
                    
                    // This can lead to logical errors when processing the data
                    if (col == 2 && row == 3) {
                        System.out.println("Found the element at 'column' 2, 'row' 3");
                        System.out.println("But this is actually the element at row 2, column 3!");
                    }
                }
            }
            System.out.println("The loop completed without errors, but our mental model was wrong");
            System.out.println("This can lead to logical errors in more complex programs");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // ERROR 3: Incorrect visualization of the 2D array
        System.out.println("\nERROR 3: Incorrect visualization of the 2D array");
        System.out.println("Attempting to print the 2D array with rows and columns swapped:");
        
        // This will print the transpose of the matrix (rows as columns and vice versa)
        System.out.println("Incorrect visualization (transposed):");
        for (int col = 0; col < grid[0].length; col++) { // Iterate through columns first
            for (int row = 0; row < grid.length; row++) { // Then through rows
                System.out.print(grid[row][col] + "\t"); // Note the swapped indices here
            }
            System.out.println();
        }
        
        System.out.println("\nCorrect visualization (original):");
        printGrid(grid);
        System.out.println("Notice how the two visualizations are different (transposed)");
        
        // ERROR 4: Misunderstanding row-major vs column-major order
        System.out.println("\nERROR 4: Misunderstanding row-major vs column-major order");
        System.out.println("Java uses row-major order for 2D arrays");
        
        // Demonstrate row-major traversal (correct for Java)
        System.out.println("\nCorrect row-major traversal (standard in Java):");
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print("grid[" + row + "][" + col + "] = " + grid[row][col] + "  ");
            }
            System.out.println();
        }
        
        // Demonstrate column-major traversal (not standard in Java)
        System.out.println("\nColumn-major traversal (not standard in Java):");
        for (int col = 0; col < grid[0].length; col++) {
            for (int row = 0; row < grid.length; row++) {
                System.out.print("grid[" + row + "][" + col + "] = " + grid[row][col] + "  ");
            }
            System.out.println();
        }
        
        System.out.println("\nNotice the different order of element access between the two traversals");
        System.out.println("Using the wrong traversal order can lead to inefficient memory access patterns");
    }
    
    // Helper method to print a 2D array in a grid format
    public static void printGrid(int[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
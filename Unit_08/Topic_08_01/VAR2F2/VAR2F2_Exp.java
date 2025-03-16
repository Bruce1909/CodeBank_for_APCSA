/**
 * VAR-2.F.2 Example
 * For the purposes of the exam, when accessing the element at arr[first][second],
 * the first index is used for rows, the second index is used for columns.
 * 
 * This program demonstrates how to properly use row and column indices in a 2D array.
 */
public class VAR2F2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating row and column indexing in 2D arrays:\n");
        
        // Create a 2D array with 3 rows and 4 columns
        int[][] grid = new int[3][4];
        
        // Fill the array with values based on row and column indices
        System.out.println("Filling the 2D array with values based on row and column indices:");
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                // Set each element to (row * 10 + col)
                grid[row][col] = row * 10 + col;
                System.out.println("Setting grid[" + row + "][" + col + "] = " + grid[row][col]);
            }
        }
        
        // Print the 2D array in a grid format to visualize rows and columns
        System.out.println("\nThe 2D array grid contents:");
        printGrid(grid);
        
        // Access specific elements using row and column indices
        System.out.println("\nAccessing specific elements using row and column indices:");
        System.out.println("Element at row 1, column 2: grid[1][2] = " + grid[1][2]);
        System.out.println("Element at row 2, column 3: grid[2][3] = " + grid[2][3]);
        System.out.println("Element at row 0, column 0: grid[0][0] = " + grid[0][0]);
        
        // Modify specific elements using row and column indices
        System.out.println("\nModifying specific elements using row and column indices:");
        grid[0][1] = 99; // Modify element at row 0, column 1
        System.out.println("Modified element at row 0, column 1: grid[0][1] = " + grid[0][1]);
        
        grid[2][2] = 88; // Modify element at row 2, column 2
        System.out.println("Modified element at row 2, column 2: grid[2][2] = " + grid[2][2]);
        
        // Print the updated 2D array
        System.out.println("\nThe updated 2D array grid contents:");
        printGrid(grid);
        
        // Demonstrate row and column operations
        System.out.println("\nDemonstrating row and column operations:");
        
        // Sum of elements in row 1
        int rowSum = 0;
        for (int col = 0; col < grid[1].length; col++) {
            rowSum += grid[1][col];
        }
        System.out.println("Sum of elements in row 1: " + rowSum);
        
        // Sum of elements in column 2
        int colSum = 0;
        for (int row = 0; row < grid.length; row++) {
            colSum += grid[row][2];
        }
        System.out.println("Sum of elements in column 2: " + colSum);
        
        // Create a 2D array with named rows and columns for clarity
        System.out.println("\nCreating a 2D array with named rows and columns for clarity:");
        String[] studentNames = {"Alice", "Bob", "Charlie"};
        String[] subjects = {"Math", "Science", "English", "History"};
        
        int[][] grades = new int[studentNames.length][subjects.length];
        
        // Fill with sample grades
        grades[0][0] = 95; // Alice's Math grade
        grades[0][1] = 88; // Alice's Science grade
        grades[1][2] = 92; // Bob's English grade
        grades[2][3] = 78; // Charlie's History grade
        
        // Print the grades with student names and subjects
        System.out.println("Student grades:");
        System.out.print("\t");
        for (String subject : subjects) {
            System.out.print(subject + "\t");
        }
        System.out.println();
        
        for (int row = 0; row < grades.length; row++) {
            System.out.print(studentNames[row] + "\t");
            for (int col = 0; col < grades[row].length; col++) {
                System.out.print(grades[row][col] + "\t");
            }
            System.out.println();
        }
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
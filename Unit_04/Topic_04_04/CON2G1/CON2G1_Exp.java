/**
 * This program demonstrates nested iteration statements (CON-2.G.1)
 * Nested iteration statements are iteration statements that appear in the body of another iteration statement.
 */
public class CON2G1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating nested iteration statements (CON-2.G.1):\n");
        
        // Example 1: Nested for loops to create a multiplication table
        System.out.println("Example 1: Multiplication Table (5x5)");
        System.out.println("This demonstrates a nested for loop structure:");
        
        // Outer loop iterates through rows (i)
        for (int i = 1; i <= 5; i++) {
            // Inner loop iterates through columns (j)
            for (int j = 1; j <= 5; j++) {
                // Print the product with formatting
                System.out.printf("%4d", i * j);
            }
            // Move to the next line after each row is complete
            System.out.println();
        }
        System.out.println();
        
        // Example 2: Nested while loops to create a pattern
        System.out.println("Example 2: Triangle Pattern");
        System.out.println("This demonstrates a nested while loop structure:");
        
        int row = 1;
        // Outer while loop for rows
        while (row <= 5) {
            int col = 1;
            // Inner while loop for columns
            while (col <= row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
        System.out.println();
        
        // Example 3: Mixing different loop types
        System.out.println("Example 3: Mixed Loop Types");
        System.out.println("This demonstrates mixing for and while loops:");
        
        // Outer for loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration: " + i);
            
            int j = 1;
            // Inner while loop
            while (j <= 3) {
                System.out.println("  Inner loop iteration: " + j);
                j++;
            }
            System.out.println();
        }
        
        // Summary
        System.out.println("--- Key Points about Nested Iteration Statements ---");
        System.out.println("1. Nested iteration statements are loops inside other loops");
        System.out.println("2. They can be used to work with multi-dimensional data structures");
        System.out.println("3. Different types of loops can be nested (for inside while, while inside for, etc.)");
        System.out.println("4. Each iteration of the outer loop triggers a complete execution of the inner loop");
        System.out.println("5. Variables in the outer loop are accessible in the inner loop");
    }
}
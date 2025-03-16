/**
 * This program demonstrates the completion order of nested iteration statements (CON-2.G.2)
 * When a loop is nested inside another loop, the inner loop must complete all its iterations
 * before the outer loop can continue.
 */
public class CON2G2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating nested iteration completion order (CON-2.G.2):\n");
        
        // Example 1: Visualizing nested loop execution order
        System.out.println("Example 1: Visualizing Nested Loop Execution Order");
        System.out.println("This demonstrates how inner loops complete before outer loops continue:");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop - iteration " + i + " begins");
            
            for (int j = 1; j <= 4; j++) {
                System.out.println("  Inner loop - iteration " + j + " of outer loop iteration " + i);
            }
            
            System.out.println("Outer loop - iteration " + i + " completes\n");
        }
        
        // Example 2: Practical application with a matrix
        System.out.println("Example 2: Processing a Matrix");
        System.out.println("This demonstrates processing a 2D array row by row:");
        
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matrix contents:");
        for (int row = 0; row < matrix.length; row++) {
            System.out.print("Row " + row + ": ");
            
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            
            System.out.println("(Row " + row + " complete)");
        }
        System.out.println();
        
        // Example 3: Nested loops with different iteration counts
        System.out.println("Example 3: Nested Loops with Different Iteration Counts");
        System.out.println("This demonstrates how inner loop iterations depend on the outer loop variable:");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration " + i + " begins");
            System.out.println("  Inner loop will run " + i + " times");
            
            for (int j = 1; j <= i; j++) {
                System.out.println("  Inner loop iteration " + j);
            }
            
            System.out.println("Outer loop iteration " + i + " completes\n");
        }
        
        // Summary
        System.out.println("--- Key Points about Nested Iteration Completion Order ---");
        System.out.println("1. The inner loop must complete ALL its iterations before the outer loop continues");
        System.out.println("2. For each single iteration of the outer loop, the inner loop executes completely");
        System.out.println("3. The number of inner loop iterations can depend on the outer loop variables");
        System.out.println("4. The total number of iterations is the product of all loop iteration counts");
        System.out.println("5. Understanding this execution order is crucial for correctly processing multi-dimensional data");
    }
}
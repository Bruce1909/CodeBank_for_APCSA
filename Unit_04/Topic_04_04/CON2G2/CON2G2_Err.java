/**
 * This program demonstrates common errors related to nested iteration completion order (CON-2.G.2)
 * It shows mistakes that can occur when not understanding that inner loops must complete
 * all iterations before the outer loop continues.
 */
public class CON2G2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with nested iteration completion order (CON-2.G.2):\n");
        
        // Example 1: Error - Attempting to break out of inner loop prematurely
        System.out.println("Example 1: Error - Attempting to break out of inner loop prematurely");
        System.out.println("This demonstrates a misunderstanding of nested loop execution order:");
        
        System.out.println("Incorrect approach (trying to optimize by breaking early):");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop - iteration " + i + " begins");
            
            for (int j = 1; j <= 5; j++) {
                System.out.println("  Inner loop - iteration " + j);
                
                // ERROR: Breaking out of inner loop when j equals i
                // This misunderstands that inner loop should complete all iterations
                if (j == i) {
                    System.out.println("  Breaking inner loop early at j = " + j);
                    break; // This prevents the inner loop from completing all iterations
                }
            }
            
            System.out.println("Outer loop - iteration " + i + " completes\n");
        }
        
        System.out.println("The correct approach would let the inner loop complete all iterations.");
        System.out.println();
        
        // Example 2: Error - Modifying outer loop variable inside inner loop
        System.out.println("Example 2: Error - Modifying outer loop variable inside inner loop");
        System.out.println("This demonstrates how changing the outer loop variable affects execution order:");
        
        System.out.println("Expected: Each outer iteration should complete its inner loop");
        System.out.println("Actual output with error:");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop - iteration " + i + " begins");
            
            for (int j = 1; j <= 3; j++) {
                System.out.println("  Inner loop - iteration " + j);
                
                // ERROR: Modifying outer loop variable inside inner loop
                if (j == 2) {
                    i++; // This disrupts the normal completion order
                    System.out.println("  ERROR: Incremented outer variable i to " + i);
                }
            }
            
            System.out.println("Outer loop - iteration " + i + " completes\n");
        }
        
        System.out.println("The correct approach would never modify the outer loop variable inside the inner loop.");
        System.out.println();
        
        // Example 3: Error - Incorrect understanding of nested loop execution count
        System.out.println("Example 3: Error - Incorrect understanding of nested loop execution count");
        System.out.println("This demonstrates a misunderstanding of how many times the inner loop executes:");
        
        int totalIterations = 0;
        // Incorrect comment suggesting wrong execution count
        System.out.println("INCORRECT COMMENT: This nested loop will execute 3 + 3 = 6 times");
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                totalIterations++;
                System.out.println("  Iteration: " + totalIterations + " (i = " + i + ", j = " + j + ")");
            }
        }
        
        System.out.println("Total iterations: " + totalIterations);
        System.out.println("CORRECT: The nested loop executes 3 × 3 = 9 times (not 3 + 3 = 6)");
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors with Nested Iteration Completion Order ---");
        System.out.println("1. Breaking out of inner loops prematurely, preventing complete execution");
        System.out.println("2. Modifying outer loop variables from within inner loops");
        System.out.println("3. Misunderstanding the total number of iterations (product, not sum)");
        System.out.println("4. Assuming inner and outer loops execute in parallel");
        System.out.println("5. Incorrectly nesting loops when processing multi-dimensional data");
    }
}
/**
 * This program demonstrates common errors with nested iteration statements (CON-2.G.1)
 * It shows mistakes that can occur when implementing nested loops.
 */
public class CON2G1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with nested iteration statements (CON-2.G.1):\n");
        
        // Example 1: Error - Using the same variable for both loops
        System.out.println("Example 1: Error - Using the same variable for both loops");
        System.out.println("This will cause unexpected behavior:");
        
        System.out.println("Expected output: A 5x5 grid of numbers");
        System.out.println("Actual output:");
        
        // ERROR: Using the same variable 'i' for both loops
        // The inner loop modifies 'i', affecting the outer loop
        for (int i = 1; i <= 5; i++) {
            // Inner loop incorrectly uses the same variable 'i'
            for (int i = 1; i <= 5; i++) { // This causes a compilation error - variable 'i' is already defined
                System.out.printf("%4d", i * i);
            }
            System.out.println();
        }
        
        // Corrected version with commented code
        System.out.println("\nCorrected version would use different variables:");
        System.out.println("for (int i = 1; i <= 5; i++) {\n  for (int j = 1; j <= 5; j++) {\n    // code\n  }\n}");
        System.out.println();
        
        // Example 2: Error - Infinite loop due to missing increment
        System.out.println("Example 2: Error - Infinite loop due to missing increment");
        System.out.println("This code would cause an infinite loop (commented out to prevent hanging):");
        
        System.out.println("int row = 1;\nwhile (row <= 5) {\n  int col = 1;\n  while (col <= row) {\n    System.out.print(\"* \");\n    // Missing col++ here would cause infinite loop\n  }\n  System.out.println();\n  row++;\n}");
        
        // Example 3: Error - Incorrect loop nesting
        System.out.println("\nExample 3: Error - Incorrect loop nesting");
        System.out.println("This demonstrates incorrect placement of println causing wrong output:");
        
        // Incorrect placement of println inside inner loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
                // ERROR: println is inside the inner loop, causing each value to be on a new line
                System.out.println();
            }
        }
        
        System.out.println("\nCorrect placement would be:");
        System.out.println("for (int i = 1; i <= 3; i++) {\n  for (int j = 1; j <= 3; j++) {\n    System.out.print(i * j + \" \");\n  }\n  System.out.println(); // println should be here\n}");
        
        // Example 4: Error - Incorrect loop bounds
        System.out.println("\nExample 4: Error - Incorrect loop bounds");
        System.out.println("This demonstrates off-by-one errors in nested loops:");
        
        // ERROR: Off-by-one error in loop bounds
        for (int i = 0; i < 3; i++) { // Starting from 0 instead of 1
            for (int j = 0; j < 3; j++) { // Starting from 0 instead of 1
                System.out.printf("%4d", (i+1) * (j+1)); // Need to add 1 to get correct values
            }
            System.out.println();
        }
        
        // Summary
        System.out.println("\n--- Common Errors with Nested Iteration Statements ---");
        System.out.println("1. Using the same variable name in both inner and outer loops");
        System.out.println("2. Forgetting to increment loop counters, causing infinite loops");
        System.out.println("3. Incorrect placement of statements inside or outside loops");
        System.out.println("4. Off-by-one errors in loop bounds");
        System.out.println("5. Modifying loop variables inside the loop body in unexpected ways");
    }
}
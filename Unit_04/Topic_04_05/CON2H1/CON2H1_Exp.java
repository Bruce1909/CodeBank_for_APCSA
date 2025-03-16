/**
 * This program demonstrates statement execution counting (CON-2.H.1)
 * A statement execution count indicates the number of times a statement is executed by the program.
 */
public class CON2H1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating statement execution counting (CON-2.H.1):\n");
        
        // Example 1: Simple loop statement execution count
        System.out.println("Example 1: Simple Loop Statement Execution Count");
        System.out.println("Counting executions of statements in a basic for loop:");
        
        int count = 0; // This statement executes once
        
        // The loop condition is checked 6 times (5 true + 1 false)
        for (int i = 0; i < 5; i++) {
            count++; // This statement executes 5 times
            System.out.println("  Iteration " + i + ": count = " + count); // This executes 5 times
        }
        
        System.out.println("\nStatement execution analysis:");
        System.out.println("1. Initialization (count = 0): 1 time");
        System.out.println("2. Loop condition (i < 5): 6 times");
        System.out.println("3. count++ statement: 5 times");
        System.out.println("4. println statement: 5 times");
        System.out.println();
        
        // Example 2: Nested loop statement execution count
        System.out.println("Example 2: Nested Loop Statement Execution Count");
        System.out.println("Counting executions in nested loops:");
        
        int total = 0; // This statement executes once
        
        // Outer loop condition is checked 4 times (3 true + 1 false)
        for (int i = 0; i < 3; i++) {
            // Inner loop condition is checked 12 times (9 true + 3 false)
            for (int j = 0; j < 3; j++) {
                total++; // This statement executes 9 times (3 × 3)
                System.out.println("  Position (" + i + "," + j + "): total = " + total);
            }
        }
        
        System.out.println("\nNested loop execution analysis:");
        System.out.println("1. Initialization (total = 0): 1 time");
        System.out.println("2. Outer loop condition: 4 times");
        System.out.println("3. Inner loop condition: 12 times");
        System.out.println("4. total++ statement: 9 times");
        System.out.println();
        
        // Example 3: Conditional statement execution count
        System.out.println("Example 3: Conditional Statement Execution Count");
        System.out.println("Counting executions with conditions:");
        
        int evenCount = 0; // Executes once
        
        // Loop condition checked 6 times (5 true + 1 false)
        for (int i = 1; i <= 5; i++) {
            System.out.println("  Checking number: " + i); // Executes 5 times
            
            // if condition checked 5 times
            if (i % 2 == 0) {
                evenCount++; // Executes only 2 times (when i is 2 and 4)
                System.out.println("    Found even number: " + i);
            }
        }
        
        System.out.println("\nConditional execution analysis:");
        System.out.println("1. Initialization (evenCount = 0): 1 time");
        System.out.println("2. Loop condition: 6 times");
        System.out.println("3. First println: 5 times");
        System.out.println("4. if condition: 5 times");
        System.out.println("5. evenCount++ and second println: 2 times");
        
        // Summary
        System.out.println("\n--- Key Points about Statement Execution Counting ---");
        System.out.println("1. Each statement's execution count can be determined by analyzing the program flow");
        System.out.println("2. Loop conditions are checked one more time than the loop body executes");
        System.out.println("3. In nested loops, inner loop statements execute outer × inner times");
        System.out.println("4. Conditional statements may execute fewer times than they're checked");
        System.out.println("5. Understanding execution counts helps in analyzing program efficiency");
    }
}
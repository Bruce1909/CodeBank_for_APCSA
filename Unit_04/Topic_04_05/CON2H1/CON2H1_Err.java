/**
 * This program demonstrates common errors in statement execution counting (CON-2.H.1)
 * It shows mistakes in calculating how many times statements are executed.
 */
public class CON2H1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors in statement execution counting (CON-2.H.1):\n");
        
        // Example 1: Error in loop condition execution count
        System.out.println("Example 1: Error in Loop Condition Execution Count");
        System.out.println("Common misconception: Loop condition is checked same number of times as loop body executes");
        
        int count = 0;
        System.out.println("INCORRECT analysis before loop:");
        System.out.println("- Loop will run 5 times, so condition will be checked 5 times"); // ERROR: It's checked 6 times
        
        for (int i = 0; i < 5; i++) {
            count++;
        }
        
        System.out.println("\nCorrect analysis:");
        System.out.println("- Loop runs 5 times, but condition is checked 6 times (5 true + 1 false)");
        System.out.println();
        
        // Example 2: Error in nested loop execution count
        System.out.println("Example 2: Error in Nested Loop Execution Count");
        System.out.println("Common misconception: Adding instead of multiplying iterations");
        
        int total = 0;
        System.out.println("INCORRECT analysis before nested loops:");
        System.out.println("- Outer loop runs 3 times, inner loop runs 4 times");
        System.out.println("- Total iterations will be 3 + 4 = 7"); // ERROR: Should be 3 × 4 = 12
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                total++;
            }
        }
        
        System.out.println("\nActual result: " + total + " iterations");
        System.out.println("Correct analysis: 3 × 4 = 12 iterations");
        System.out.println();
        
        // Example 3: Error in conditional statement execution count
        System.out.println("Example 3: Error in Conditional Statement Execution Count");
        System.out.println("Common misconception: Confusing condition checks with body executions");
        
        int evenCount = 0;
        System.out.println("INCORRECT analysis before loop with condition:");
        System.out.println("- Loop runs 5 times with an if condition");
        System.out.println("- if statement will execute 5 times"); // ERROR: Condition checked 5 times but body executes less
        
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }
        
        System.out.println("\nActual results:");
        System.out.println("- if condition checked 5 times");
        System.out.println("- if body executed only " + evenCount + " times");
        System.out.println();
        
        // Example 4: Error in break statement impact on execution count
        System.out.println("Example 4: Error in Break Statement Impact");
        System.out.println("Common misconception: Not considering break statement's effect on execution count");
        
        int searchCount = 0;
        System.out.println("INCORRECT analysis before search loop:");
        System.out.println("- Loop will always execute 10 times"); // ERROR: break can reduce execution count
        
        for (int i = 1; i <= 10; i++) {
            searchCount++;
            if (i == 5) {
                break;
            }
        }
        
        System.out.println("\nActual results:");
        System.out.println("- Loop executed only " + searchCount + " times due to break");
        
        // Summary
        System.out.println("\n--- Common Errors in Statement Execution Counting ---");
        System.out.println("1. Forgetting that loop conditions are checked one extra time");
        System.out.println("2. Adding instead of multiplying nested loop iterations");
        System.out.println("3. Confusing condition checks with condition body executions");
        System.out.println("4. Not considering control flow statements (break, continue) impact");
        System.out.println("5. Assuming all statements in a loop execute the same number of times");
    }
}
/**
 * This program demonstrates when the increment statement is executed in a for loop
 * as described in CON-2.E.3:
 * - In each iteration of a for loop, the increment statement is executed after the entire loop body is executed
 * - The increment happens before the Boolean expression is evaluated again
 */
public class CON2E3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating for loop increment execution (CON-2.E.3):\n");
        
        // Example 1: Basic for loop showing increment execution order
        System.out.println("Example 1: Basic for loop showing increment execution order");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Start of loop body: i = " + i);
            System.out.println("End of loop body: i = " + i);
            System.out.println("After this, the increment i++ will execute, making i = " + (i + 1));
            System.out.println("Then the Boolean expression i <= 3 will be evaluated again");
            System.out.println("---");
        }
        System.out.println("Loop ended because the Boolean expression evaluated to false");
        System.out.println();
        
        // Example 2: Demonstrating with a break statement
        System.out.println("Example 2: Demonstrating with a break statement");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Start of loop body: i = " + i);
            
            if (i == 3) {
                System.out.println("Breaking out of the loop at i = " + i);
                System.out.println("The increment statement will NOT execute when using break");
                break;
            }
            
            System.out.println("End of loop body: i = " + i);
            System.out.println("After this, the increment i++ will execute, making i = " + (i + 1));
            System.out.println("---");
        }
        System.out.println();
        
        // Example 3: Demonstrating with a continue statement
        System.out.println("Example 3: Demonstrating with a continue statement");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Start of loop body: i = " + i);
            
            if (i == 3) {
                System.out.println("Using continue at i = " + i);
                System.out.println("The increment statement WILL execute when using continue");
                System.out.println("---");
                continue;
            }
            
            System.out.println("End of loop body: i = " + i);
            System.out.println("After this, the increment i++ will execute, making i = " + (i + 1));
            System.out.println("---");
        }
        System.out.println();
        
        // Example 4: Demonstrating with print statements
        System.out.println("Example 4: Demonstrating with print statements");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Before loop body: i = " + i);
            System.out.println("Executing loop body...");
            System.out.println("After loop body, before increment: i = " + i);
            // The increment happens here, between iterations
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about For Loop Increment (CON-2.E.3) ---");
        System.out.println("1. The increment statement executes after the entire loop body completes");
        System.out.println("2. The increment happens before the Boolean expression is evaluated again");
        System.out.println("3. If a break statement is encountered, the increment statement is not executed");
        System.out.println("4. If a continue statement is encountered, the increment statement is still executed");
        System.out.println("5. The execution order is: initialization (once) → Boolean check → body → increment → Boolean check → ...");
    }
}
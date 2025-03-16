/**
 * CON2A1_Exp.java
 * 
 * This program demonstrates how conditional statements interrupt the sequential execution of statements.
 * Knowledge Point: CON-2.A.1 - Conditional statements interrupt the sequential execution of statements.
 */
public class CON2A1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how conditional statements interrupt sequential execution:\n");
        
        // Example 1: Basic sequential execution
        System.out.println("Example 1: Sequential execution without conditionals");
        System.out.println("Statement 1 executes");
        System.out.println("Statement 2 executes");
        System.out.println("Statement 3 executes");
        System.out.println();
        
        // Example 2: Conditional statement interrupting sequential execution
        System.out.println("Example 2: Conditional statement interrupting sequential execution");
        System.out.println("Statement 1 executes");
        
        boolean condition = true;
        if (condition) {
            System.out.println("Condition is true - this statement executes");
            System.out.println("Another statement in the conditional block executes");
        }
        
        System.out.println("Statement 3 executes after the conditional block");
        System.out.println();
        
        // Example 3: Conditional statement skipping code
        System.out.println("Example 3: Conditional statement skipping code");
        System.out.println("Statement 1 executes");
        
        boolean skipCondition = false;
        if (skipCondition) {
            System.out.println("This statement is skipped because the condition is false");
            System.out.println("This statement is also skipped");
        }
        
        System.out.println("Statement 3 executes after the conditional block");
        System.out.println();
        
        // Example 4: Multiple conditional paths
        System.out.println("Example 4: Multiple conditional paths");
        int number = 7;
        
        System.out.println("Statement 1 executes");
        
        if (number > 10) {
            System.out.println("This code block is skipped (number <= 10)");
        } else if (number > 5) {
            System.out.println("This code block executes (number > 5)");
        } else {
            System.out.println("This code block is skipped (number <= 5)");
        }
        
        System.out.println("Statement 3 executes after all conditional checks");
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Conditional Statements and Execution Flow ---");
        System.out.println("1. Without conditionals, statements execute in sequence from top to bottom");
        System.out.println("2. Conditional statements can interrupt this sequential flow");
        System.out.println("3. When a condition is true, the code inside its block executes");
        System.out.println("4. When a condition is false, the code inside its block is skipped");
        System.out.println("5. After a conditional block, execution continues with the next statement");
    }
}
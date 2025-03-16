/**
 * CON2A1_Err.java
 * 
 * This program demonstrates common errors related to conditional statements interrupting sequential execution.
 * Knowledge Point: CON-2.A.1 - Conditional statements interrupt the sequential execution of statements.
 */
public class CON2A1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with conditional statements and sequential execution:\n");
        
        // Example 1: Missing curly braces for multi-line if blocks
        System.out.println("Example 1: Missing curly braces for multi-line if blocks");
        boolean condition1 = true;
        
        System.out.println("Before if statement");
        
        // Error 1: Missing curly braces - only the first statement is part of the if block
        if (condition1)
            System.out.println("This statement is part of the if block");
            System.out.println("This statement ALWAYS executes regardless of the condition"); // Not part of if block!
        
        System.out.println("Correct version with curly braces:");
        if (condition1) {
            System.out.println("This statement is part of the if block");
            System.out.println("This statement is also part of the if block");
        }
        System.out.println();
        
        // Example 2: Misunderstanding the flow of execution
        System.out.println("Example 2: Misunderstanding the flow of execution");
        int x = 5;
        
        // Error 2: Expecting if-else to work like a switch statement
        System.out.println("Testing value of x = " + x);
        if (x > 0) {
            System.out.println("x is positive"); // This executes
        } 
        if (x > 3) {
            System.out.println("x is greater than 3"); // This also executes
        } 
        if (x > 10) {
            System.out.println("x is greater than 10"); // This doesn't execute
        }
        
        System.out.println("\nCorrect approach using else-if for mutually exclusive conditions:");
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else if (x > 3) {
            System.out.println("x is greater than 3 but not greater than 10");
        } else if (x > 0) {
            System.out.println("x is positive but not greater than 3");
        }
        System.out.println();
        
        // Example 3: Forgetting that conditional statements can be nested
        System.out.println("Example 3: Forgetting that conditional statements can be nested");
        boolean isRaining = true;
        boolean hasUmbrella = false;
        
        // Error 3: Using multiple if statements instead of nesting
        if (isRaining) {
            System.out.println("It's raining");
        }
        if (hasUmbrella) { // This is evaluated regardless of whether it's raining
            System.out.println("You have an umbrella");
        }
        
        System.out.println("\nCorrect approach using nested if statements:");
        if (isRaining) {
            System.out.println("It's raining");
            if (hasUmbrella) {
                System.out.println("You have an umbrella");
            } else {
                System.out.println("You don't have an umbrella");
            }
        }
        System.out.println();
        
        // Example 4: Misplacing semicolons
        System.out.println("Example 4: Misplacing semicolons");
        boolean shouldExecute = true;
        
        // Error 4: Semicolon after if statement
        if (shouldExecute); { // Semicolon terminates the if statement!
            System.out.println("This code ALWAYS executes regardless of the condition");
        }
        
        System.out.println("\nCorrect version without the semicolon:");
        if (shouldExecute) {
            System.out.println("This code only executes when the condition is true");
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Common Errors with Conditional Statements ---");
        System.out.println("1. Always use curly braces for multi-line if blocks");
        System.out.println("2. Remember that separate if statements are evaluated independently");
        System.out.println("3. Use if-else-if for mutually exclusive conditions");
        System.out.println("4. Use nested if statements when conditions are dependent");
        System.out.println("5. Never place a semicolon immediately after an if condition");
    }
}
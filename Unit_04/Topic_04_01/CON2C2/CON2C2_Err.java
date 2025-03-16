/**
 * CON2C2_Err.java
 * 
 * This program demonstrates common errors related to Boolean expression evaluation in while loops.
 * Knowledge Point: CON-2.C.2 - In loops, the Boolean expression is evaluated before each iteration
 * of the loop body, including the first. When the expression evaluates to true, the loop body is executed.
 * This continues until the expression evaluates to false, whereupon the iteration ceases.
 */
public class CON2C2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with Boolean expression evaluation in while loops:\n");
        
        // Example 1: Modifying the condition variable before checking it
        System.out.println("Example 1: Modifying the condition variable before checking it");
        int count = 1;
        
        System.out.println("Initial count value: " + count);
        System.out.println("Intended loop condition: count <= 5");
        
        System.out.println("\nIncorrect approach (commented out to prevent unexpected behavior):");
        System.out.println("while (count++ <= 5) { // Error: count is incremented before the condition is checked");
        System.out.println("    System.out.println(\"Iteration: count = \" + count);");
        System.out.println("}");
        
        System.out.println("\nCorrect approach:");
        count = 1; // Reset count
        while (count <= 5) {
            System.out.println("Iteration: count = " + count);
            count++; // Increment after using the value
        }
        System.out.println();
        
        // Example 2: Misunderstanding when the condition is evaluated
        System.out.println("Example 2: Misunderstanding when the condition is evaluated");
        int target = 10;
        count = 1;
        
        System.out.println("Initial count: " + count + ", target: " + target);
        System.out.println("\nIncorrect understanding (thinking condition is checked after each statement):");
        System.out.println("while (count < target) {");
        System.out.println("    System.out.println(\"Processing count = \" + count);");
        System.out.println("    count = target; // Setting count equal to target");
        System.out.println("    System.out.println(\"This will still execute even though count = target now\");");
        System.out.println("}");
        
        System.out.println("\nActual behavior demonstration:");
        count = 1;
        while (count < target) {
            System.out.println("Processing count = " + count);
            count = target; // Setting count equal to target
            System.out.println("This will still execute even though count = target now");
            // The condition is only checked again after the entire loop body executes
        }
        
        System.out.println("\nThe condition is only checked before each full iteration, not during the loop body");
        System.out.println();
        
        // Example 3: Forgetting that the condition is checked before the first iteration
        System.out.println("Example 3: Forgetting that the condition is checked before the first iteration");
        boolean shouldRun = false;
        
        System.out.println("Initial shouldRun value: " + shouldRun);
        System.out.println("\nIncorrect expectation (thinking the loop will run at least once):");
        System.out.println("while (shouldRun) {");
        System.out.println("    System.out.println(\"This will never execute because shouldRun is false initially\");");
        System.out.println("    shouldRun = true; // Never gets a chance to execute");
        System.out.println("}");
        
        System.out.println("\nActual behavior demonstration:");
        while (shouldRun) {
            System.out.println("This will never execute because shouldRun is false initially");
            shouldRun = true; // Never gets a chance to execute
        }
        System.out.println("The loop body was skipped entirely because the condition was false initially");
        
        System.out.println("\nIf you need at least one execution, use a do-while loop instead:");
        shouldRun = false;
        do {
            System.out.println("This executes once before checking the condition");
            shouldRun = true;
        } while (shouldRun == false); // Condition is checked after the first execution
        System.out.println();
        
        // Example 4: Complex condition evaluation errors
        System.out.println("Example 4: Complex condition evaluation errors");
        int a = 5;
        int b = 10;
        
        System.out.println("Initial values: a = " + a + ", b = " + b);
        System.out.println("\nIncorrect complex condition (using assignment instead of comparison):");
        System.out.println("while (a < 10 && b = 5) { // Error: using = (assignment) instead of == (comparison)");
        System.out.println("    // This would cause a compilation error");
        System.out.println("}");
        
        System.out.println("\nAnother error: short-circuit evaluation misunderstanding");
        System.out.println("while (a > 10 && b++ < 15) {");
        System.out.println("    // b won't be incremented if a > 10 is false due to short-circuit evaluation");
        System.out.println("}");
        
        System.out.println("\nDemonstration of short-circuit evaluation:");
        a = 5; // Reset a
        b = 10; // Reset b
        while (a > 10 && b++ < 15) {
            System.out.println("This won't execute");
        }
        System.out.println("After loop: b = " + b + " (notice b wasn't incremented because a > 10 was false)");
        
        a = 15; // Make first condition true
        b = 10; // Reset b
        while (a > 10 && b++ < 15) {
            System.out.println("Now this executes because both conditions are true");
            break; // Exit after one iteration for demonstration
        }
        System.out.println("After loop: b = " + b + " (notice b was incremented because a > 10 was true)");
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors with Boolean Expression Evaluation in While Loops ---");
        System.out.println("1. Modifying variables within the condition expression (e.g., count++)");
        System.out.println("2. Assuming the condition is checked after each statement in the loop body");
        System.out.println("3. Forgetting that the condition is checked before the first iteration");
        System.out.println("4. Using assignment (=) instead of comparison (==) in conditions");
        System.out.println("5. Misunderstanding short-circuit evaluation in complex conditions");
    }
}
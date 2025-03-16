/**
 * CON2C2_Exp.java
 * 
 * This program demonstrates how Boolean expressions are evaluated in while loops.
 * Knowledge Point: CON-2.C.2 - In loops, the Boolean expression is evaluated before each iteration
 * of the loop body, including the first. When the expression evaluates to true, the loop body is executed.
 * This continues until the expression evaluates to false, whereupon the iteration ceases.
 */
public class CON2C2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Boolean expression evaluation in while loops:\n");
        
        // Example 1: Basic while loop showing condition evaluation
        System.out.println("Example 1: Basic while loop with condition evaluation");
        int count = 1;
        
        System.out.println("Initial count value: " + count);
        System.out.println("Loop condition: count <= 5");
        System.out.println("\nLoop execution:");
        
        while (count <= 5) {
            System.out.println("Before iteration " + count + ": Condition (count <= 5) evaluated to true");
            System.out.println("Executing loop body for count = " + count);
            count++;
            System.out.println("After increment: count = " + count);
            System.out.println("Next, condition will be checked again\n");
        }
        
        System.out.println("After final iteration: Condition (count <= 5) evaluated to false");
        System.out.println("Final count value: " + count);
        System.out.println("Loop terminated because condition became false\n");
        
        // Example 2: Demonstrating condition evaluation with changing variables
        System.out.println("Example 2: Condition with changing variables");
        int sum = 0;
        int num = 1;
        
        System.out.println("Initial values: sum = " + sum + ", num = " + num);
        System.out.println("Loop condition: sum < 10");
        System.out.println("\nLoop execution:");
        
        while (sum < 10) {
            System.out.println("Condition check: (sum < 10) is " + (sum < 10) + " because sum = " + sum);
            System.out.println("Adding " + num + " to sum");
            sum += num;
            num++;
            System.out.println("After iteration: sum = " + sum + ", num = " + num + "\n");
        }
        
        System.out.println("Final condition check: (sum < 10) is " + (sum < 10) + " because sum = " + sum);
        System.out.println("Loop terminated because sum is no longer less than 10\n");
        
        // Example 3: Demonstrating condition evaluation with a complex condition
        System.out.println("Example 3: Complex condition evaluation");
        int x = 5;
        int y = 10;
        
        System.out.println("Initial values: x = " + x + ", y = " + y);
        System.out.println("Loop condition: (x < 10 && y > 5)");
        System.out.println("\nLoop execution:");
        
        while (x < 10 && y > 5) {
            System.out.println("Condition evaluation:");
            System.out.println("  x < 10 is " + (x < 10) + " (x = " + x + ")");
            System.out.println("  y > 5 is " + (y > 5) + " (y = " + y + ")");
            System.out.println("  Combined: (x < 10 && y > 5) is " + (x < 10 && y > 5));
            
            System.out.println("Executing loop body");
            x++;
            y--;
            System.out.println("After iteration: x = " + x + ", y = " + y + "\n");
        }
        
        System.out.println("Final condition evaluation:");
        System.out.println("  x < 10 is " + (x < 10) + " (x = " + x + ")");
        System.out.println("  y > 5 is " + (y > 5) + " (y = " + y + ")");
        System.out.println("  Combined: (x < 10 && y > 5) is " + (x < 10 && y > 5));
        System.out.println("Loop terminated because the combined condition became false\n");
        
        // Summary
        System.out.println("--- Key Points about Boolean Expression Evaluation in While Loops ---");
        System.out.println("1. The Boolean condition is evaluated BEFORE each iteration of the loop");
        System.out.println("2. This includes the first iteration - the condition must be true to enter the loop");
        System.out.println("3. After each iteration, the condition is evaluated again");
        System.out.println("4. When the condition evaluates to false, the loop terminates");
        System.out.println("5. The loop body never executes if the condition is false initially");
        System.out.println("6. Complex conditions (using && or ||) follow standard Boolean evaluation rules");
    }
}
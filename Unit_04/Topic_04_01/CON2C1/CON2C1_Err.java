/**
 * CON2C1_Err.java
 * 
 * This program demonstrates common errors related to iteration statements and flow control in while loops.
 * Knowledge Point: CON-2.C.1 - Iteration statements change the flow of control by repeating
 * a set of statements zero or more times until a condition is met.
 */
public class CON2C1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with while loops and flow control:\n");
        
        // Example 1: Forgetting to update the loop control variable
        System.out.println("Example 1: Forgetting to update the loop control variable");
        int count = 1;
        System.out.println("Before the loop, count = " + count);
        
        System.out.println("\nIncorrect while loop (commented out to prevent infinite loop):");
        System.out.println("while (count <= 5) {");
        System.out.println("    System.out.println(\"Iteration: count = \" + count);");
        System.out.println("    // Missing count++ here would cause an infinite loop");
        System.out.println("}");
        
        System.out.println("\nCorrect version:");
        while (count <= 5) {
            System.out.println("Iteration: count = " + count);
            count++; // This is essential to prevent an infinite loop
        }
        System.out.println();
        
        // Example 2: Incorrect condition leading to unexpected iterations
        System.out.println("Example 2: Incorrect condition leading to unexpected iterations");
        int target = 5;
        count = 1;
        
        System.out.println("Incorrect condition (using < instead of <=):");
        System.out.println("Target value: " + target);
        System.out.println("Starting count: " + count);
        
        // Error: Using < instead of <= means we'll stop one iteration too early
        System.out.println("\nLoop with count < target:");
        while (count < target) {
            System.out.println("Iteration: count = " + count);
            count++;
        }
        System.out.println("Final count = " + count + " (Notice we never process count = 5)");
        
        // Reset and show correct version
        count = 1;
        System.out.println("\nCorrect version with count <= target:");
        while (count <= target) {
            System.out.println("Iteration: count = " + count);
            count++;
        }
        System.out.println("Final count = " + count);
        System.out.println();
        
        // Example 3: Updating the control variable incorrectly
        System.out.println("Example 3: Updating the control variable incorrectly");
        count = 10;
        
        System.out.println("Incorrect loop that should count down from 10 to 1:");
        System.out.println("Starting count: " + count);
        
        // Error: Incrementing instead of decrementing
        System.out.println("\nIncorrect loop (commented out to prevent infinite loop):");
        System.out.println("while (count > 0) {");
        System.out.println("    System.out.println(\"Iteration: count = \" + count);");
        System.out.println("    count++; // Error: This increments instead of decrements");
        System.out.println("}");
        
        System.out.println("\nCorrect version:");
        while (count > 0) {
            System.out.println("Iteration: count = " + count);
            count--; // Correct: Decrement to eventually reach the termination condition
        }
        System.out.println("Final count = " + count);
        System.out.println();
        
        // Example 4: Misplacing statements inside/outside the loop
        System.out.println("Example 4: Misplacing statements inside/outside the loop");
        int sum = 0;
        
        System.out.println("Incorrect placement of initialization inside the loop:");
        // Reset count for this example
        count = 1;
        
        while (count <= 3) {
            int value = 10; // Error: Reinitializing value in each iteration
            System.out.println("Iteration " + count + ": value = " + value);
            sum += value;
            count++;
        }
        System.out.println("Sum = " + sum + " (Notice sum is 30 because value is reset to 10 each time)");
        
        // Reset and show correct version with accumulating value
        sum = 0;
        count = 1;
        int value = 10; // Correct: Initialize outside the loop
        
        System.out.println("\nCorrect version with value initialized outside and updated inside:");
        while (count <= 3) {
            System.out.println("Iteration " + count + ": value = " + value);
            sum += value;
            value += 5; // Value changes between iterations
            count++;
        }
        System.out.println("Sum = " + sum + " (Notice sum is 45 because value accumulates)");
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors with While Loops and Flow Control ---");
        System.out.println("1. Forgetting to update the loop control variable (causes infinite loops)");
        System.out.println("2. Using incorrect comparison operators in the condition");
        System.out.println("3. Updating the control variable in the wrong direction");
        System.out.println("4. Misplacing variable initializations inside/outside the loop");
        System.out.println("5. Not considering all possible paths through the loop");
    }
}
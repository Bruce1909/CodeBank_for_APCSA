/**
 * CON2C1_Exp.java
 * 
 * This program demonstrates how iteration statements change the flow of control
 * by repeating a set of statements until a condition is met.
 * Knowledge Point: CON-2.C.1 - Iteration statements change the flow of control by repeating
 * a set of statements zero or more times until a condition is met.
 */
public class CON2C1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how iteration statements change flow of control:\n");
        
        // Example 1: Basic while loop that counts from 1 to 5
        System.out.println("Example 1: Basic while loop counting from 1 to 5");
        int count = 1;
        System.out.println("Before the loop, count = " + count);
        
        System.out.println("\nEntering the while loop:");
        while (count <= 5) {
            System.out.println("Iteration: count = " + count);
            count++;
        }
        
        System.out.println("\nAfter the loop, count = " + count);
        System.out.println("The loop terminated when the condition (count <= 5) became false.");
        System.out.println();
        
        // Example 2: While loop with a more complex condition
        System.out.println("Example 2: While loop with a more complex condition");
        int sum = 0;
        int number = 1;
        
        System.out.println("Before the loop, sum = " + sum + ", number = " + number);
        System.out.println("\nEntering the while loop that adds numbers until sum exceeds 10:");
        
        while (sum <= 10) {
            System.out.println("Iteration: Adding " + number + " to sum " + sum);
            sum += number;
            number++;
            System.out.println("After addition: sum = " + sum + ", number = " + number);
        }
        
        System.out.println("\nAfter the loop, sum = " + sum + ", number = " + number);
        System.out.println("The loop terminated when the condition (sum <= 10) became false.");
        System.out.println();
        
        // Example 3: While loop with a boolean flag
        System.out.println("Example 3: While loop with a boolean flag");
        boolean continueProcessing = true;
        int processCount = 0;
        
        System.out.println("Before the loop, continueProcessing = " + continueProcessing);
        System.out.println("\nEntering the while loop that continues until the flag is set to false:");
        
        while (continueProcessing) {
            processCount++;
            System.out.println("Processing iteration " + processCount);
            
            // Set the flag to false after 3 iterations
            if (processCount >= 3) {
                System.out.println("Setting continueProcessing to false");
                continueProcessing = false;
            }
        }
        
        System.out.println("\nAfter the loop, processCount = " + processCount);
        System.out.println("The loop terminated when the condition (continueProcessing) became false.");
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Iteration Statements and Flow Control ---");
        System.out.println("1. Iteration statements (like while loops) repeat a set of statements");
        System.out.println("2. The repetition continues until a specified condition is no longer met");
        System.out.println("3. The condition is checked before each iteration");
        System.out.println("4. The flow of control follows the loop body repeatedly while the condition is true");
        System.out.println("5. Once the condition becomes false, the flow continues with the statement after the loop");
    }
}
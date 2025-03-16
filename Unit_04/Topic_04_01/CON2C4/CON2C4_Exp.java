/**
 * CON2C4_Exp.java
 * 
 * This program demonstrates that if the Boolean expression in a while loop evaluates to false initially,
 * the loop body is not executed at all.
 * Knowledge Point: CON-2.C.4 - If the Boolean expression evaluates to false initially, the loop body is not executed at all.
 */
public class CON2C4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how while loops behave when the condition is initially false:\n");
        
        // Example 1: Basic while loop with initially false condition
        System.out.println("Example 1: Basic while loop with initially false condition");
        int count = 10;
        
        System.out.println("Initial count value: " + count);
        System.out.println("Loop condition: count < 5");
        System.out.println("Since 10 is not less than 5, the condition is false initially");
        
        System.out.println("\nLoop execution:");
        while (count < 5) {
            System.out.println("This line will never be executed");
            count++;
        }
        
        System.out.println("After the loop: count = " + count);
        System.out.println("Notice the loop body was never executed because the condition was false initially");
        System.out.println();
        
        // Example 2: Comparing while loop with do-while loop
        System.out.println("Example 2: Comparing while loop with do-while loop");
        boolean condition = false;
        
        System.out.println("Initial condition value: " + condition);
        
        System.out.println("\nWhile loop execution (condition checked before first iteration):");
        while (condition) {
            System.out.println("This line will never be executed in the while loop");
            condition = true; // This line never executes
        }
        System.out.println("The while loop body was skipped entirely");
        
        // Reset condition for do-while example
        condition = false;
        
        System.out.println("\nDo-while loop execution (condition checked after first iteration):");
        do {
            System.out.println("This line WILL be executed in the do-while loop, even though condition is false");
            // We don't change condition here, so it remains false
        } while (condition);
        
        System.out.println("The do-while loop body executed once, then terminated");
        System.out.println();
        
        // Example 3: Function that may or may not process items
        System.out.println("Example 3: Function that may or may not process items");
        
        // Case 1: Empty array - loop won't execute
        int[] emptyArray = {};
        System.out.println("Processing an empty array:");
        processArray(emptyArray);
        
        // Case 2: Non-empty array - loop will execute
        int[] nonEmptyArray = {1, 2, 3};
        System.out.println("\nProcessing a non-empty array:");
        processArray(nonEmptyArray);
        
        // Summary
        System.out.println("\n--- Key Points about Initially False Conditions in While Loops ---");
        System.out.println("1. The condition is evaluated BEFORE the first iteration of a while loop");
        System.out.println("2. If the condition is false initially, the loop body is completely skipped");
        System.out.println("3. This is different from a do-while loop, which always executes at least once");
        System.out.println("4. This behavior is useful for avoiding processing empty collections");
        System.out.println("5. Always consider the initial state of your condition variables");
    }
    
    // Helper method for Example 3
    private static void processArray(int[] array) {
        int index = 0;
        
        System.out.println("Array length: " + array.length);
        System.out.println("Initial index: " + index);
        System.out.println("Loop condition: index < array.length");
        
        // If array is empty, this loop won't execute at all
        while (index < array.length) {
            System.out.println("Processing element at index " + index + ": " + array[index]);
            index++;
        }
        
        if (index == 0) {
            System.out.println("No elements were processed (loop body never executed)");
        } else {
            System.out.println("Processed " + index + " elements");
        }
    }
}
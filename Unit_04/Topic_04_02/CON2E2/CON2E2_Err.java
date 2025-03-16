/**
 * This program demonstrates common errors related to the initialization statement in a for loop
 * as described in CON-2.E.2:
 * - The initialization statement is only executed once before the first Boolean expression evaluation
 * - The variable being initialized is referred to as a loop control variable
 */
public class CON2E2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors in for loop initialization (CON-2.E.2):\n");
        
        // Error 1: Attempting to reinitialize the loop control variable inside the loop
        System.out.println("Error 1: Attempting to reinitialize the loop control variable");
        System.out.println("This code will not work as expected:");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Before attempted reinitialization: i = " + i);
            // The following line is conceptually incorrect - initialization only happens once
            // i = 1; // Uncommenting this would reset i in each iteration, potentially causing an infinite loop
            System.out.println("After loop body executes: i = " + i);
        }
        System.out.println();
        
        // Error 2: Scope error - trying to access loop control variable outside the loop
        System.out.println("Error 2: Scope error - accessing loop control variable outside the loop");
        System.out.println("This code will not compile:");
        System.out.println("for (int j = 1; j <= 5; j++) { ... }\nSystem.out.println(j); // Error: j cannot be resolved");
        
        // Demonstration of correct approach
        System.out.println("\nCorrect approach - declare the variable before the loop:");
        int j = 0;
        for (j = 1; j <= 3; j++) {
            System.out.println("Inside loop: j = " + j);
        }
        System.out.println("After loop: j = " + j); // This works because j was declared outside the loop
        System.out.println();
        
        // Error 3: Modifying the loop control variable inside the loop body
        System.out.println("Error 3: Modifying the loop control variable inside the loop body");
        System.out.println("This can lead to unexpected behavior:");
        
        for (int k = 1; k <= 5; k++) {
            System.out.println("Before modification: k = " + k);
            if (k == 3) {
                k = 5; // Skips iterations by modifying the loop control variable
                System.out.println("Modified k to 5, skipping iterations");
            }
            System.out.println("After potential modification: k = " + k);
        }
        System.out.println();
        
        // Error 4: Initializing with the wrong value
        System.out.println("Error 4: Initializing with the wrong value");
        System.out.println("This can lead to incorrect number of iterations:");
        
        System.out.println("\nIncorrect (starts at 0 instead of 1):");
        for (int m = 0; m < 5; m++) {
            System.out.println("Iteration " + (m+1) + ", but m = " + m);
        }
        
        System.out.println("\nCorrect (starts at 1):");
        for (int m = 1; m <= 5; m++) {
            System.out.println("Iteration " + m + ", m = " + m);
        }
        System.out.println();
        
        // Error 5: Initializing multiple variables but using the wrong one
        System.out.println("Error 5: Initializing multiple variables but using the wrong one");
        
        for (int p = 1, q = 10; p <= 3; p++) {
            // The error would be to use q as the loop control condition instead of p
            System.out.println("p = " + p + ", q = " + q);
            q--; // Modifying q doesn't affect the loop termination condition
        }
        System.out.println("If we had used 'q' in the Boolean condition instead of 'p', the behavior would be different");
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors in For Loop Initialization (CON-2.E.2) ---");
        System.out.println("1. Attempting to reinitialize the loop control variable inside the loop");
        System.out.println("2. Trying to access the loop control variable outside its scope");
        System.out.println("3. Modifying the loop control variable inside the loop body can lead to unexpected behavior");
        System.out.println("4. Initializing with the wrong value can lead to incorrect number of iterations");
        System.out.println("5. When initializing multiple variables, using the wrong one for loop control");
    }
}
/**
 * This program demonstrates the initialization statement in a for loop
 * as described in CON-2.E.2:
 * - The initialization statement is only executed once before the first Boolean expression evaluation
 * - The variable being initialized is referred to as a loop control variable
 */
public class CON2E2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating for loop initialization (CON-2.E.2):\n");
        
        // Example 1: Basic for loop with initialization
        System.out.println("Example 1: Basic for loop with initialization");
        System.out.println("The initialization 'int i = 1' is executed only once:");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Loop iteration: i = " + i);
        }
        // Note: i is not accessible here because its scope is limited to the for loop
        System.out.println();
        
        // Example 2: Demonstrating that initialization happens only once
        System.out.println("Example 2: Proving initialization happens only once");
        
        int counter = 0;
        System.out.println("Before loop: counter = " + counter);
        
        for (int j = 1; j <= 3; j++) {
            // This would print "Initializing" only once if we could put code in the initialization part
            if (j == 1) {
                System.out.println("First iteration - initialization has already happened");
            }
            System.out.println("Loop body: j = " + j);
        }
        System.out.println();
        
        // Example 3: Multiple loop control variables
        System.out.println("Example 3: Multiple loop control variables in initialization");
        
        for (int a = 1, b = 10; a <= 5; a++) {
            System.out.println("a = " + a + ", b = " + b);
            b--; // Modifying the second loop control variable in the body
        }
        System.out.println();
        
        // Example 4: Using an existing variable as loop control variable
        System.out.println("Example 4: Using an existing variable as loop control variable");
        
        int k = 0;
        System.out.println("Before loop: k = " + k);
        
        for (k = 1; k <= 3; k++) {
            System.out.println("Loop body: k = " + k);
        }
        
        System.out.println("After loop: k = " + k); // k is still accessible and has been modified
        System.out.println();
        
        // Example 5: Demonstrating scope of loop control variable
        System.out.println("Example 5: Scope of loop control variable");
        
        for (int m = 1; m <= 3; m++) {
            System.out.println("Inside loop: m = " + m);
        }
        
        // Uncommenting the line below would cause a compilation error
        // System.out.println("After loop: m = " + m); // Error: m cannot be resolved to a variable
        System.out.println("Cannot access 'm' here because it's out of scope");
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about For Loop Initialization (CON-2.E.2) ---");
        System.out.println("1. The initialization statement executes only once before the loop begins");
        System.out.println("2. The variable initialized in the for loop header is called a loop control variable");
        System.out.println("3. When declared in the for loop header, the loop control variable's scope is limited to the loop");
        System.out.println("4. You can initialize multiple variables in the initialization statement");
        System.out.println("5. You can also use an existing variable as a loop control variable");
    }
}
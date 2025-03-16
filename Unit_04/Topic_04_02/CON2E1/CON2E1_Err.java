/**
 * This program demonstrates common errors related to the three parts of a for loop header
 * as described in CON-2.E.1:
 * - Initialization
 * - Boolean expression
 * - Increment/decrement
 */
public class CON2E1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors in for loop headers (CON-2.E.1):\n");
        
        // Error 1: Missing initialization
        System.out.println("Error 1: Missing initialization");
        System.out.println("This code will not compile:");
        System.out.println("for (; i <= 5; i++) { ... }");
        System.out.println("Error: Variable 'i' might not have been initialized");
        
        // Correct version
        System.out.println("\nCorrect version:");
        System.out.println("int i = 1;\nfor (; i <= 5; i++) { ... }");
        System.out.println("OR: for (int i = 1; i <= 5; i++) { ... }");
        System.out.println();
        
        // Error 2: Missing Boolean expression
        System.out.println("Error 2: Missing Boolean expression");
        System.out.println("This creates an infinite loop if not handled properly:");
        System.out.println("for (int i = 1;; i++) { ... }");
        
        // Demonstration with safety exit
        System.out.println("\nDemonstration with safety exit:");
        int count = 0;
        for (int i = 1;; i++) {
            System.out.println("Iteration " + i);
            count++;
            if (count >= 5) {
                System.out.println("Manually breaking out of the loop");
                break; // Safety exit to prevent infinite loop
            }
        }
        System.out.println();
        
        // Error 3: Missing increment/decrement
        System.out.println("Error 3: Missing increment/decrement");
        System.out.println("This creates an infinite loop if the loop variable isn't modified in the body:");
        System.out.println("for (int i = 1; i <= 5;) { ... }");
        
        // Demonstration with increment in the body
        System.out.println("\nDemonstration with increment in the body:");
        for (int i = 1; i <= 5;) {
            System.out.println("Current value: " + i);
            i++; // Increment inside the loop body instead of the header
        }
        System.out.println();
        
        // Error 4: Incorrect Boolean expression
        System.out.println("Error 4: Incorrect Boolean expression");
        System.out.println("Using wrong comparison operator can cause off-by-one errors:");
        
        System.out.println("\nIncorrect (prints 1 to 6 instead of 1 to 5):");
        for (int i = 1; i < 7; i++) {
            System.out.println("Value: " + i);
        }
        
        System.out.println("\nCorrect (prints 1 to 5):");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value: " + i);
        }
        System.out.println();
        
        // Error 5: Incorrect increment/decrement
        System.out.println("Error 5: Incorrect increment/decrement");
        System.out.println("Using wrong increment can cause unexpected behavior:");
        
        System.out.println("\nIncorrect (skips even numbers):");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Value: " + i); // Only prints odd numbers
        }
        
        System.out.println("\nCorrect (prints all numbers from 1 to 10):");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Value: " + i);
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors in For Loop Headers (CON-2.E.1) ---");
        System.out.println("1. Missing initialization: Variable might not be initialized");
        System.out.println("2. Missing Boolean expression: Creates an infinite loop");
        System.out.println("3. Missing increment/decrement: Creates an infinite loop unless modified in the body");
        System.out.println("4. Incorrect Boolean expression: Can cause off-by-one errors");
        System.out.println("5. Incorrect increment/decrement: Can cause unexpected iteration patterns");
    }
}
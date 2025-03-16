/**
 * This program demonstrates common errors related to the increment statement execution in a for loop
 * as described in CON-2.E.3:
 * - In each iteration of a for loop, the increment statement is executed after the entire loop body is executed
 * - The increment happens before the Boolean expression is evaluated again
 */
public class CON2E3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors in for loop increment execution (CON-2.E.3):\n");
        
        // Error 1: Misunderstanding when the increment happens
        System.out.println("Error 1: Misunderstanding when the increment happens");
        System.out.println("Common misconception: The increment happens at the beginning of each iteration");
        
        System.out.println("\nIncorrect mental model:");
        System.out.println("for (int i = 1; i <= 3; i++) {\n    // i is already incremented here (WRONG!)\n    System.out.println(i);\n}");
        
        System.out.println("\nCorrect execution order demonstration:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop body executing with i = " + i + " (not yet incremented)");
            System.out.println("After this line, i will be incremented to " + (i + 1));
        }
        System.out.println();
        
        // Error 2: Relying on increment for loop body logic
        System.out.println("Error 2: Relying on increment for loop body logic");
        System.out.println("This code has a logical error because it assumes the increment happens before the body:");
        
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            // Incorrect: Assuming i is already incremented
            System.out.println("Adding i = " + i + " to sum");
            sum += i;
            // The correct value to add would be (i-1) if we wanted to sum 0 to 4
        }
        System.out.println("Sum = " + sum + " (This adds 1+2+3+4+5=15, not 0+1+2+3+4=10)");
        System.out.println();
        
        // Error 3: Modifying the loop variable and expecting the increment to still work normally
        System.out.println("Error 3: Modifying the loop variable and expecting normal increment behavior");
        
        System.out.println("\nPotentially confusing code:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Before modification: i = " + i);
            if (i == 3) {
                i++; // Manually incrementing inside the loop body
                System.out.println("Modified i to " + i + " inside the loop body");
            }
            System.out.println("After potential modification: i = " + i);
            System.out.println("After this iteration, i will be incremented again to " + (i + 1));
            System.out.println("---");
        }
        System.out.println("This causes i to jump from 3 to 5, skipping the value 4 entirely");
        System.out.println();
        
        // Error 4: Misunderstanding continue statement's effect on increment
        System.out.println("Error 4: Misunderstanding continue statement's effect on increment");
        System.out.println("Some incorrectly believe that continue skips the increment:");
        
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Found i = " + i + ", using continue");
                System.out.println("The increment WILL still happen after continue");
                continue;
            }
            System.out.println("Processing i = " + i);
        }
        System.out.println("Notice that i=4 is processed after i=3, showing the increment still occurred");
        System.out.println();
        
        // Error 5: Confusing break and continue behavior with increment
        System.out.println("Error 5: Confusing break and continue behavior with increment");
        
        System.out.println("\nWith break (increment does NOT execute):");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            if (i == 3) {
                System.out.println("Breaking at i = 3");
                break;
            }
        }
        
        System.out.println("\nWith continue (increment DOES execute):");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Continuing at i = 3");
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors in For Loop Increment Execution (CON-2.E.3) ---");
        System.out.println("1. Misunderstanding when the increment happens (after the loop body, not before)");
        System.out.println("2. Relying on increment for loop body logic can lead to off-by-one errors");
        System.out.println("3. Modifying the loop variable inside the body can lead to unexpected increment behavior");
        System.out.println("4. Misunderstanding that continue still allows the increment to execute");
        System.out.println("5. Confusing how break and continue affect the increment statement execution");
    }
}
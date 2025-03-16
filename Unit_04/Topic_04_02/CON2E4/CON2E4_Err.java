/**
 * This program demonstrates common errors when converting between for loops and while loops
 * as described in CON-2.E.4
 */
public class CON2E4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors in for/while loop conversion (CON-2.E.4):\n");
        
        // Error 1: Forgetting to initialize the loop control variable when converting for to while
        System.out.println("Error 1: Forgetting to initialize the loop control variable");
        System.out.println("Original for loop:");
        System.out.println("for (int i = 1; i <= 5; i++) { ... }");
        
        System.out.println("\nIncorrect while loop conversion (missing initialization):");
        System.out.println("// int i = 1; <-- Missing initialization\nwhile (i <= 5) {\n    // loop body\n    i++;\n}");
        
        System.out.println("\nCorrect while loop conversion:");
        int i = 1; // Proper initialization before the loop
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println();
        
        // Error 2: Forgetting the increment in while loop
        System.out.println("Error 2: Forgetting the increment in while loop");
        System.out.println("Original for loop:");
        System.out.println("for (int j = 1; j <= 3; j++) { ... }");
        
        System.out.println("\nIncorrect while loop conversion (missing increment):");
        System.out.println("int j = 1;\nwhile (j <= 3) {\n    // loop body\n    // j++; <-- Missing increment\n}");
        
        System.out.println("\nThis would cause an infinite loop. Demonstration with safety exit:");
        int j = 1;
        int safetyCounter = 0;
        while (j <= 3) {
            System.out.println("j = " + j + " (not incrementing)");
            safetyCounter++;
            if (safetyCounter >= 3) {
                System.out.println("Safety exit to prevent infinite loop");
                break;
            }
            // j++ is missing here, causing the infinite loop
        }
        System.out.println();
        
        // Error 3: Placing the increment in the wrong location in while loop
        System.out.println("Error 3: Placing the increment in the wrong location");
        System.out.println("Original for loop with continue:");
        System.out.println("for (int k = 1; k <= 5; k++) {\n    if (k == 3) continue;\n    // process k\n}");
        
        System.out.println("\nIncorrect while loop conversion (increment before continue):");
        int k = 1;
        while (k <= 5) {
            System.out.println("Processing k = " + k);
            if (k == 3) {
                k++; // Increment before continue - this works but is not equivalent to the for loop
                System.out.println("Continuing with k = " + k + " (increment before continue)");
                continue;
            }
            k++;
        }
        
        System.out.println("\nCorrect while loop conversion (increment after continue):");
        System.out.println("int k = 1;\nwhile (k <= 5) {\n    if (k == 3) {\n        k++;\n        continue;\n    }\n    // process k\n    k++;\n}");
        System.out.println();
        
        // Error 4: Incorrect conversion of complex for loop to while loop
        System.out.println("Error 4: Incorrect conversion of complex for loop");
        System.out.println("Original for loop with multiple variables:");
        System.out.println("for (int a = 1, b = 10; a <= 3; a++, b--) { ... }");
        
        System.out.println("\nIncorrect while loop conversion (missing second increment):");
        System.out.println("int a = 1, b = 10;\nwhile (a <= 3) {\n    // loop body\n    a++; // Missing b-- here\n}");
        
        System.out.println("\nCorrect while loop conversion:");
        int a = 1, b = 10;
        while (a <= 3) {
            System.out.println("a = " + a + ", b = " + b);
            a++;
            b--; // Don't forget this second increment/decrement
        }
        System.out.println();
        
        // Error 5: Incorrect conversion from while to for loop
        System.out.println("Error 5: Incorrect conversion from while to for loop");
        System.out.println("Original while loop with condition update inside:");
        System.out.println("int[] data = {1, 2, 3, 4, -1};\nint index = 0;\nint value = data[index];\nwhile (value != -1) {\n    // process value\n    index++;\n    value = data[index];\n}");
        
        System.out.println("\nIncorrect for loop conversion (condition update in wrong place):");
        System.out.println("for (int idx = 0, val = data[idx]; val != -1; idx++) {\n    // process val\n    // val = data[idx]; <-- Missing update or in wrong place\n}");
        
        System.out.println("\nCorrect for loop conversion:");
        int[] data = {1, 2, 3, 4, -1};
        for (int idx = 0, val = data[idx]; val != -1; val = data[++idx]) {
            System.out.println("Processing val = " + val);
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors in For/While Loop Conversion (CON-2.E.4) ---");
        System.out.println("1. Forgetting to initialize the loop control variable when converting for to while");
        System.out.println("2. Forgetting the increment statement in the while loop body");
        System.out.println("3. Placing the increment in the wrong location, especially with continue/break");
        System.out.println("4. Not handling multiple variables correctly in complex loop conversions");
        System.out.println("5. Incorrect placement of condition updates when converting while to for");
    }
}
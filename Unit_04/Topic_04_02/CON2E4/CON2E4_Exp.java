/**
 * This program demonstrates how a for loop can be rewritten as an equivalent while loop
 * and vice versa as described in CON-2.E.4
 */
public class CON2E4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating for loop and while loop equivalence (CON-2.E.4):\n");
        
        // Example 1: Basic for loop and its while loop equivalent
        System.out.println("Example 1: Basic for loop and its while loop equivalent");
        
        System.out.println("Using for loop to count from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop: i = " + i);
        }
        
        System.out.println("\nEquivalent while loop to count from 1 to 5:");
        int j = 1; // Initialization (from for loop header)
        while (j <= 5) { // Boolean expression (from for loop header)
            System.out.println("While loop: j = " + j);
            j++; // Increment (from for loop header)
        }
        System.out.println();
        
        // Example 2: For loop with complex initialization and increment
        System.out.println("Example 2: For loop with complex initialization and increment");
        
        System.out.println("Using for loop with multiple variables:");
        for (int a = 1, b = 10; a <= 5; a++, b--) {
            System.out.println("For loop: a = " + a + ", b = " + b);
        }
        
        System.out.println("\nEquivalent while loop with multiple variables:");
        int c = 1, d = 10; // Initialization of multiple variables
        while (c <= 5) { // Boolean expression
            System.out.println("While loop: c = " + c + ", d = " + d);
            c++; // First increment
            d--; // Second increment (actually a decrement)
        }
        System.out.println();
        
        // Example 3: While loop and its for loop equivalent
        System.out.println("Example 3: While loop and its for loop equivalent");
        
        System.out.println("Using while loop to process user input (simulated):");
        int[] simulatedInput = {5, 10, 15, 20, -1}; // -1 represents end of input
        int index = 0;
        int input = simulatedInput[index++];
        
        int sum = 0;
        while (input != -1) {
            System.out.println("While loop: Processing input " + input);
            sum += input;
            input = simulatedInput[index++];
        }
        System.out.println("Sum of inputs: " + sum);
        
        System.out.println("\nEquivalent for loop to process user input (simulated):");
        int[] simulatedInput2 = {5, 10, 15, 20, -1};
        int sum2 = 0;
        
        for (int idx = 0, val = simulatedInput2[0]; val != -1; val = simulatedInput2[++idx]) {
            System.out.println("For loop: Processing input " + val);
            sum2 += val;
        }
        System.out.println("Sum of inputs: " + sum2);
        System.out.println();
        
        // Example 4: For loop with break and its while equivalent
        System.out.println("Example 4: For loop with break and its while equivalent");
        
        System.out.println("Using for loop with break:");
        for (int k = 1; k <= 10; k++) {
            System.out.println("For loop: k = " + k);
            if (k == 5) {
                System.out.println("Breaking out of for loop at k = 5");
                break;
            }
        }
        
        System.out.println("\nEquivalent while loop with break:");
        int m = 1;
        while (m <= 10) {
            System.out.println("While loop: m = " + m);
            if (m == 5) {
                System.out.println("Breaking out of while loop at m = 5");
                break;
            }
            m++;
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about For and While Loop Equivalence (CON-2.E.4) ---");
        System.out.println("1. Any for loop can be rewritten as a while loop and vice versa");
        System.out.println("2. To convert a for loop to a while loop:");
        System.out.println("   - Place the initialization before the while loop");
        System.out.println("   - Use the Boolean expression from the for loop as the while condition");
        System.out.println("   - Place the increment at the end of the while loop body");
        System.out.println("3. To convert a while loop to a for loop:");
        System.out.println("   - Move any initialization before the loop to the for loop header");
        System.out.println("   - Use the while condition as the Boolean expression in the for loop");
        System.out.println("   - Move any updates to the loop control variable to the increment part of the for loop");
        System.out.println("4. When using break or continue, be careful about the placement of the increment statement");
    }
}
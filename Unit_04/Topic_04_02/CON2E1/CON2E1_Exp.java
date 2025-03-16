/**
 * This program demonstrates the three parts of a for loop header as described in CON-2.E.1:
 * - Initialization
 * - Boolean expression
 * - Increment/decrement
 */
public class CON2E1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating the three parts of a for loop header (CON-2.E.1):\n");
        
        // Example 1: Basic for loop with increment
        System.out.println("Example 1: Basic for loop with increment");
        System.out.println("Counting from 1 to 5:");
        
        // The three parts of the for loop header:
        // 1. Initialization: int i = 1
        // 2. Boolean expression: i <= 5
        // 3. Increment: i++
        for (int i = 1; i <= 5; i++) {
            System.out.println("Current value: " + i);
        }
        System.out.println();
        
        // Example 2: For loop with decrement
        System.out.println("Example 2: For loop with decrement");
        System.out.println("Counting down from 10 to 1:");
        
        // The three parts of the for loop header:
        // 1. Initialization: int i = 10
        // 2. Boolean expression: i >= 1
        // 3. Decrement: i--
        for (int i = 10; i >= 1; i--) {
            System.out.println("Current value: " + i);
        }
        System.out.println();
        
        // Example 3: For loop with custom increment
        System.out.println("Example 3: For loop with custom increment");
        System.out.println("Counting by 2s from 0 to 10:");
        
        // The three parts of the for loop header:
        // 1. Initialization: int i = 0
        // 2. Boolean expression: i <= 10
        // 3. Custom increment: i += 2
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Current value: " + i);
        }
        System.out.println();
        
        // Example 4: Multiple variables in for loop header
        System.out.println("Example 4: Multiple variables in for loop header");
        System.out.println("Two counters moving in opposite directions:");
        
        // The three parts with multiple variables:
        // 1. Initialization: int i = 1, j = 10
        // 2. Boolean expression: i <= 10
        // 3. Increment/Decrement: i++, j--
        for (int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about For Loop Headers (CON-2.E.1) ---");
        System.out.println("1. Initialization: Executed once before the loop begins");
        System.out.println("2. Boolean expression: Evaluated before each iteration");
        System.out.println("3. Increment/Decrement: Executed after each iteration");
        System.out.println("4. The increment statement can also be a decrement statement");
        System.out.println("5. Multiple variables can be initialized and updated in the header");
    }
}
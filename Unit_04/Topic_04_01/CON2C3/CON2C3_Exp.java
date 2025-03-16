/**
 * CON2C3_Exp.java
 * 
 * This program demonstrates infinite loops in Java where the Boolean expression always evaluates to true.
 * Knowledge Point: CON-2.C.3 - A loop is an infinite loop when the Boolean expression always evaluates to true.
 */
public class CON2C3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating infinite loops (with controlled termination):\n");
        
        // Example 1: Infinite loop with a literal true condition
        System.out.println("Example 1: Infinite loop with literal true condition");
        System.out.println("Loop condition: while(true)");
        System.out.println("This creates an infinite loop that must be terminated manually");
        
        System.out.println("\nControlled demonstration (with break statement):");
        int iteration = 1;
        
        System.out.println("Entering infinite loop with manual break after 5 iterations");
        while (true) { // This condition is always true
            System.out.println("Iteration " + iteration + " of infinite loop");
            
            // For demonstration purposes, we'll break after 5 iterations
            if (iteration >= 5) {
                System.out.println("Breaking out of the infinite loop manually");
                break; // This is necessary to avoid a truly infinite loop
            }
            
            iteration++;
        }
        System.out.println("Loop terminated via break statement\n");
        
        // Example 2: Infinite loop with a condition that never changes
        System.out.println("Example 2: Infinite loop with a condition that never changes");
        boolean alwaysTrue = true;
        iteration = 1;
        
        System.out.println("Loop condition: while(alwaysTrue) where alwaysTrue is never changed");
        System.out.println("\nControlled demonstration (with break statement):");
        
        while (alwaysTrue) { // This condition never changes
            System.out.println("Iteration " + iteration + " of infinite loop with unchanging condition");
            
            // For demonstration purposes, we'll break after 3 iterations
            if (iteration >= 3) {
                System.out.println("Breaking out of the infinite loop manually");
                break;
            }
            
            iteration++;
        }
        System.out.println("Loop terminated via break statement\n");
        
        // Example 3: Infinite loop with a condition that resets itself
        System.out.println("Example 3: Infinite loop with a condition that resets itself");
        int counter = 1;
        iteration = 1;
        
        System.out.println("Loop condition: while(counter <= 3) where counter is reset to 1 each iteration");
        System.out.println("\nControlled demonstration (with break statement):");
        
        while (counter <= 3) { // This would normally terminate, but counter is reset
            System.out.println("Iteration " + iteration + ": counter = " + counter);
            counter++;
            System.out.println("After increment: counter = " + counter);
            
            // This resets the counter, making the loop infinite
            if (counter > 3) {
                System.out.println("Resetting counter to 1 (making the loop infinite)");
                counter = 1;
            }
            
            // For demonstration purposes, we'll break after 7 iterations
            if (iteration >= 7) {
                System.out.println("Breaking out of the infinite loop manually");
                break;
            }
            
            iteration++;
        }
        System.out.println("Loop terminated via break statement\n");
        
        // Summary
        System.out.println("--- Key Points about Infinite Loops ---");
        System.out.println("1. An infinite loop occurs when the Boolean condition always evaluates to true");
        System.out.println("2. This can happen with literal 'true', unchanging variables, or self-resetting conditions");
        System.out.println("3. Infinite loops can be useful in certain scenarios (e.g., game loops, server programs)");
        System.out.println("4. In most cases, infinite loops need a way to terminate (break, return, System.exit)");
        System.out.println("5. Unintentional infinite loops are a common programming error");
        System.out.println("6. Always ensure there's a way for your loop condition to eventually become false");
    }
}
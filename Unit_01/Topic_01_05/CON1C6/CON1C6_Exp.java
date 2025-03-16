/**
 * CON1C6_Exp.java
 * 
 * This program demonstrates integer overflow in Java.
 * Knowledge Point: CON-1.C.6 - If an expression would evaluate to an int value outside of the allowed range, an integer overflow occurs. This could result in an incorrect value within the allowed range.
 */
public class CON1C6_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Integer Overflow in Java:\n");
        
        // Example 1: Basic integer overflow
        System.out.println("Example 1: Basic integer overflow");
        int maxInt = Integer.MAX_VALUE;
        int overflowResult = maxInt + 1;
        
        System.out.println("Integer.MAX_VALUE = " + maxInt);
        System.out.println("Integer.MAX_VALUE + 1 = " + overflowResult);
        System.out.println("Note: The result wraps around to Integer.MIN_VALUE");
        System.out.println();
        
        // Example 2: Visualizing the overflow cycle
        System.out.println("Example 2: Visualizing the overflow cycle");
        System.out.println("Starting at MAX_VALUE and adding:");
        for (int i = 0; i < 5; i++) {
            System.out.println("MAX_VALUE + " + i + " = " + (maxInt + i));
        }
        System.out.println();
        
        // Example 3: Integer underflow
        System.out.println("Example 3: Integer underflow");
        int minInt = Integer.MIN_VALUE;
        int underflowResult = minInt - 1;
        
        System.out.println("Integer.MIN_VALUE = " + minInt);
        System.out.println("Integer.MIN_VALUE - 1 = " + underflowResult);
        System.out.println("Note: The result wraps around to Integer.MAX_VALUE");
        System.out.println();
        
        // Example 4: Overflow in multiplication
        System.out.println("Example 4: Overflow in multiplication");
        int largePositive = 1000000000;  // 1 billion
        int multiplicationResult = largePositive * 3;
        
        System.out.println("1,000,000,000 * 3 = " + multiplicationResult + " (incorrect due to overflow)");
        System.out.println("Expected result: 3,000,000,000 (which is outside the int range)");
        System.out.println("Using long: " + (long) largePositive * 3);
        System.out.println();
        
        // Example 5: Detecting potential overflow
        System.out.println("Example 5: Detecting potential overflow");
        int a = 2000000000;  // 2 billion
        int b = 1000000000;  // 1 billion
        
        // Check if addition might overflow
        if (a > Integer.MAX_VALUE - b) {
            System.out.println("Addition would overflow: " + a + " + " + b);
            System.out.println("Using long instead: " + ((long) a + b));
        } else {
            System.out.println("Safe to add: " + (a + b));
        }
        
        // Check if multiplication might overflow
        if (a > Integer.MAX_VALUE / b && b > 0) {
            System.out.println("Multiplication would overflow: " + a + " * " + b);
            System.out.println("Using long instead: " + ((long) a * b));
        } else {
            System.out.println("Safe to multiply: " + (a * b));
        }
        System.out.println();
        
        // Example 6: Practical implications of overflow
        System.out.println("Example 6: Practical implications of overflow");
        int counter = Integer.MAX_VALUE;
        System.out.println("Counter at MAX_VALUE: " + counter);
        counter++;
        System.out.println("Counter after increment: " + counter);
        System.out.println("Is counter positive? " + (counter > 0));
        System.out.println("This could cause logical errors in programs expecting positive values");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Integer Overflow ---");
        System.out.println("1. If an expression would evaluate to an int value outside of the allowed range, an integer overflow occurs (CON-1.C.6)");
        System.out.println("2. Overflow results in an incorrect value within the allowed range");
        System.out.println("3. When exceeding MAX_VALUE, the result wraps around to MIN_VALUE");
        System.out.println("4. When going below MIN_VALUE, the result wraps around to MAX_VALUE");
        System.out.println("5. Java does not automatically detect or prevent integer overflow");
        System.out.println("6. For calculations that might overflow, use long or check bounds before performing operations");
        System.out.println("7. Overflow can lead to logical errors in programs if not handled properly");
    }
}
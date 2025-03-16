/**
 * CON1C6_Err.java
 * 
 * This program demonstrates common errors related to integer overflow in Java.
 * Knowledge Point: CON-1.C.6 - If an expression would evaluate to an int value outside of the allowed range, an integer overflow occurs. This could result in an incorrect value within the allowed range.
 */
public class CON1C6_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Integer Overflow in Java:\n");
        
        // Example 1: Not recognizing overflow
        System.out.println("Example 1: Not recognizing overflow");
        
        // Error 1: Assuming Java will handle large values automatically
        int largeValue1 = 2000000000;  // 2 billion
        int largeValue2 = 1000000000;  // 1 billion
        int sum = largeValue1 + largeValue2;
        
        System.out.println("int largeValue1 = " + largeValue1);
        System.out.println("int largeValue2 = " + largeValue2);
        System.out.println("int sum = largeValue1 + largeValue2 = " + sum);
        System.out.println("Error: Expected 3,000,000,000 but got " + sum + " due to overflow");
        System.out.println("Correction: long sum = (long) largeValue1 + largeValue2 = " + ((long) largeValue1 + largeValue2));
        System.out.println();
        
        // Example 2: Incorrect comparison after overflow
        System.out.println("Example 2: Incorrect comparison after overflow");
        
        // Error 2: Not accounting for overflow in comparisons
        int maxInt = Integer.MAX_VALUE;
        int overflowedValue = maxInt + 1;
        
        System.out.println("int maxInt = Integer.MAX_VALUE = " + maxInt);
        System.out.println("int overflowedValue = maxInt + 1 = " + overflowedValue);
        
        // Incorrect logic due to overflow
        if (overflowedValue > maxInt) {
            System.out.println("This line will not execute because overflowedValue is not greater than maxInt after overflow");
        } else {
            System.out.println("Error: After overflow, overflowedValue appears smaller than maxInt");
            System.out.println("This can lead to logical errors in programs");
        }
        System.out.println();
        
        // Example 3: Overflow in loops
        System.out.println("Example 3: Overflow in loops");
        
        // Error 3: Infinite loop due to overflow
        System.out.println("The following code would create an infinite loop due to overflow:");
        System.out.println("for (int i = 1; i > 0; i++) { ... }");
        System.out.println("Error: When i reaches Integer.MAX_VALUE and increments, it becomes negative, so i > 0 becomes false");
        System.out.println("Correction: Use a different loop condition or a long counter");
        
        // Demonstration with a limited number of iterations
        System.out.println("\nDemonstrating with a few iterations near MAX_VALUE:");
        int counter = Integer.MAX_VALUE - 3;
        for (int i = 0; i < 6; i++) {
            System.out.println("counter = " + counter + ", counter > 0: " + (counter > 0));
            counter++;
        }
        System.out.println();
        
        // Example 4: Misunderstanding overflow behavior
        System.out.println("Example 4: Misunderstanding overflow behavior");
        
        // Error 4: Expecting exceptions or warnings for overflow
        System.out.println("Error: Some programmers expect Java to throw an exception or warning for integer overflow");
        System.out.println("Fact: Java silently allows overflow without any runtime error or warning");
        System.out.println("This can lead to hard-to-detect bugs if not carefully managed");
        System.out.println();
        
        // Example 5: Incorrect overflow detection
        System.out.println("Example 5: Incorrect overflow detection");
        
        // Error 5: Incorrect method to check for potential overflow
        int a = 2000000000;
        int b = 1000000000;
        
        // Incorrect check (this will already overflow)
        boolean incorrectCheck = (a + b > Integer.MAX_VALUE);  // This check itself causes overflow
        
        System.out.println("int a = " + a + ", int b = " + b);
        System.out.println("boolean incorrectCheck = (a + b > Integer.MAX_VALUE) = " + incorrectCheck);
        System.out.println("Error: This check itself causes overflow and always returns false");
        System.out.println("Correction: Check if a > Integer.MAX_VALUE - b instead");
        System.out.println("Correct check result: " + (a > Integer.MAX_VALUE - b));
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Integer Overflow Errors ---");
        System.out.println("1. Java does not prevent or warn about integer overflow");
        System.out.println("2. Overflow can lead to incorrect calculations and logical errors");
        System.out.println("3. After overflow, comparisons may produce unexpected results");
        System.out.println("4. Overflow in loop counters can cause infinite loops or premature termination");
        System.out.println("5. To check for potential overflow, use proper bounds checking before performing operations");
        System.out.println("6. For calculations that might overflow, use long or BigInteger instead of int");
    }
}
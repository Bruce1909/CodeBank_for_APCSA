/**
 * CON1A5_Err.java
 * 
 * This program demonstrates common errors related to arithmetic operations with double values.
 * Knowledge Point: CON-1.A.5 - An arithmetic operation that uses a double value will evaluate to a double value.
 */
public class CON1A5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with double Arithmetic Operations:\n");
        
        // Example 1: Precision errors
        System.out.println("Example 1: Precision errors");
        
        // Error 1: Expecting exact representation of decimal values
        double d1 = 0.1;
        double d2 = 0.2;
        double sum = d1 + d2;  // Not exactly 0.3 due to binary representation
        
        System.out.println("0.1 + 0.2 = " + sum + " (not exactly 0.3 due to binary representation)");
        System.out.println("Direct comparison: (0.1 + 0.2 == 0.3) is " + (sum == 0.3) + " (often unexpected)");
        
        // Error 2: Comparing floating-point values directly
        double calculation = 1.0 / 3.0 * 3.0;  // Should be 1.0 mathematically
        System.out.println("1.0 / 3.0 * 3.0 = " + calculation + " (not exactly 1.0 due to precision)");
        System.out.println("Direct comparison: (1.0 / 3.0 * 3.0 == 1.0) is " + (calculation == 1.0) + " (often unexpected)");
        System.out.println();
        
        // Example 2: Type conversion errors
        System.out.println("Example 2: Type conversion errors");
        
        // Error 3: Losing precision when converting double to int
        double d3 = 3.99;
        int i1 = (int) d3;  // Truncates to 3, not rounds to 4
        System.out.println("Casting double to int: (int) 3.99 = " + i1 + " (truncates decimal part, often unexpected)");
        
        // Error 4: Assigning double to int without casting
        // int i2 = 3.5;  // Error: Cannot convert from double to int without casting
        System.out.println("Error 4: int i2 = 3.5; // Cannot convert from double to int without casting");
        System.out.println();
        
        // Example 3: Special value errors
        System.out.println("Example 3: Special value errors");
        
        // Error 5: Not checking for Infinity
        double inf = 1.0 / 0.0;  // Results in Infinity
        double negInf = -1.0 / 0.0;  // Results in -Infinity
        
        System.out.println("1.0 / 0.0 = " + inf + " (produces Infinity, not an exception)");
        System.out.println("-1.0 / 0.0 = " + negInf + " (produces -Infinity, not an exception)");
        
        // Error 6: Not checking for NaN
        double nan = 0.0 / 0.0;  // Results in NaN
        System.out.println("0.0 / 0.0 = " + nan + " (produces NaN, not an exception)");
        
        // Error 7: Comparing with NaN
        System.out.println("Comparing with NaN: (NaN == NaN) is " + (nan == nan) + " (always false, often unexpected)");
        System.out.println();
        
        // Example 4: Mixed type operation errors
        System.out.println("Example 4: Mixed type operation errors");
        
        // Error 8: Unexpected order of operations with mixed types
        int a = 10;
        int b = 3;
        double result1 = a / b * 1.0;  // Integer division happens first, then conversion to double
        double result2 = a * 1.0 / b;  // Conversion to double happens first, then division
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a / b * 1.0 = " + result1 + " (int division happens first, often unexpected)");
        System.out.println("a * 1.0 / b = " + result2 + " (double conversion happens first, preserves decimal)");
        System.out.println();
        
        // Example 5: Rounding errors
        System.out.println("Example 5: Rounding errors");
        
        // Error 9: Incorrect rounding technique
        double d4 = 2.5;
        int rounded1 = (int) d4;  // Truncates to 2, not rounds to 3
        int rounded2 = (int) (d4 + 0.5);  // Common rounding technique, but has issues with negative numbers
        
        System.out.println("Truncating 2.5: (int) 2.5 = " + rounded1 + " (truncates, not rounds)");
        System.out.println("Rounding 2.5: (int) (2.5 + 0.5) = " + rounded2 + " (works for positive numbers)");
        
        // Error 10: Rounding negative numbers incorrectly
        double d5 = -2.5;
        int rounded3 = (int) (d5 + 0.5);  // Incorrect for negative numbers
        System.out.println("Incorrect rounding for -2.5: (int) (-2.5 + 0.5) = " + rounded3 + " (should be -2)");
        System.out.println();
        
        // Example 6: Accumulation errors
        System.out.println("Example 6: Accumulation errors");
        
        // Error 11: Accumulating floating-point errors
        double accumulator = 0.0;
        for (int i = 0; i < 10; i++) {
            accumulator += 0.1;  // Adding 0.1 ten times should be 1.0 mathematically
        }
        System.out.println("Adding 0.1 ten times = " + accumulator + " (not exactly 1.0 due to accumulated errors)");
        System.out.println("Direct comparison: (sum == 1.0) is " + (accumulator == 1.0) + " (often unexpected)");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about double Arithmetic Operation Errors ---");
        System.out.println("1. Double values have limited precision due to binary representation");
        System.out.println("2. Direct comparison of double values can be problematic (use epsilon comparison instead)");
        System.out.println("3. Casting from double to int truncates the decimal part (doesn't round)");
        System.out.println("4. Double division by zero produces Infinity or NaN, not an exception");
        System.out.println("5. NaN is not equal to any value, including itself");
        System.out.println("6. Order of operations matters with mixed int and double operations");
        System.out.println("7. Accumulated floating-point operations can lead to increasing errors");
        System.out.println("8. Rounding techniques need to handle both positive and negative numbers correctly");
    }
}
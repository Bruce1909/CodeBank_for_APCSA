/**
 * CON1A2_Err.java
 * 
 * This program demonstrates common errors related to arithmetic expressions of type int and double in Java.
 * Knowledge Point: CON-1.A.2 - Arithmetic expressions include expressions of type int and double.
 */
public class CON1A2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Arithmetic Expressions:\n");
        
        // Example 1: Type mismatch errors
        System.out.println("Example 1: Type mismatch errors");
        
        // Error 1: Assigning double to int without casting
        // int result1 = 10.5;      // Error: Incompatible types, double cannot be assigned to int without casting
        System.out.println("Error 1: int result1 = 10.5; // Cannot assign double to int without casting");
        
        // Error 2: Assigning expression result to wrong type
        // int result2 = 10 / 3.0;  // Error: Expression evaluates to double, cannot be assigned to int without casting
        System.out.println("Error 2: int result2 = 10 / 3.0; // Expression evaluates to double, cannot be assigned to int");
        System.out.println();
        
        // Example 2: Division errors
        System.out.println("Example 2: Division errors");
        
        // Error 3: Integer division truncation (not an error but a common mistake)
        int a = 10;
        int b = 3;
        int division = a / b;  // Result is 3, not 3.33...
        System.out.println("Integer division: 10 / 3 = " + division + " (truncates decimal part, not an error but often unexpected)");
        
        // Error 4: Division by zero
        // int divByZero = 10 / 0;  // Error: ArithmeticException - Division by zero
        System.out.println("Error 4: int divByZero = 10 / 0; // ArithmeticException: Division by zero");
        
        // Error 5: Floating-point division by zero (not an error but produces Infinity)
        double doubleDivByZero = 10.0 / 0.0;  // Results in Infinity, not an exception
        System.out.println("Floating-point division by zero: 10.0 / 0.0 = " + doubleDivByZero + " (produces Infinity, not an error but often unexpected)");
        System.out.println();
        
        // Example 3: Modulus errors
        System.out.println("Example 3: Modulus errors");
        
        // Error 6: Modulus by zero
        // int modByZero = 10 % 0;  // Error: ArithmeticException - Division by zero
        System.out.println("Error 6: int modByZero = 10 % 0; // ArithmeticException: Division by zero");
        
        // Error 7: Misunderstanding modulus with negative numbers
        int modNegative = -10 % 3;  // Result is -1, not 2
        System.out.println("Modulus with negative numbers: -10 % 3 = " + modNegative + " (often misunderstood, not an error)");
        System.out.println();
        
        // Example 4: Overflow errors
        System.out.println("Example 4: Overflow errors");
        
        // Error 8: Integer overflow
        int maxInt = Integer.MAX_VALUE;
        int overflow = maxInt + 1;  // Overflows to negative number
        System.out.println("Integer overflow: Integer.MAX_VALUE + 1 = " + overflow + " (wraps around to negative, not an error but often unexpected)");
        
        // Error 9: Underflow
        int minInt = Integer.MIN_VALUE;
        int underflow = minInt - 1;  // Underflows to positive number
        System.out.println("Integer underflow: Integer.MIN_VALUE - 1 = " + underflow + " (wraps around to positive, not an error but often unexpected)");
        System.out.println();
        
        // Example 5: Floating-point precision errors
        System.out.println("Example 5: Floating-point precision errors");
        
        // Error 10: Floating-point precision
        double d1 = 0.1;
        double d2 = 0.2;
        double sum = d1 + d2;  // Result is not exactly 0.3 due to binary representation
        System.out.println("Floating-point precision: 0.1 + 0.2 = " + sum + " (not exactly 0.3, not an error but often unexpected)");
        
        // Error 11: Comparing floating-point values directly
        if (sum != 0.3) {
            System.out.println("Error 11: if (0.1 + 0.2 != 0.3) // Direct comparison of floating-point values can be problematic");
        }
        System.out.println();
        
        // Example 6: Type promotion errors
        System.out.println("Example 6: Type promotion errors");
        
        // Error 12: Unexpected type promotion
        byte byte1 = 10;
        byte byte2 = 20;
        // byte byteSum = byte1 + byte2;  // Error: int cannot be assigned to byte without casting
        System.out.println("Error 12: byte byteSum = byte1 + byte2; // Arithmetic operations on bytes promote to int");
        
        // Error 13: Loss of precision in casting
        double largeDouble = 1234.56789;
        int truncated = (int) largeDouble;  // Truncates decimal part
        System.out.println("Casting double to int: (int) 1234.56789 = " + truncated + " (truncates decimal part, not an error but often unexpected)");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Arithmetic Expression Errors ---");
        System.out.println("1. Type compatibility is crucial - double cannot be assigned to int without casting");
        System.out.println("2. Integer division truncates the decimal part (10/3 = 3, not 3.33...)");
        System.out.println("3. Division or modulus by zero causes ArithmeticException for integers");
        System.out.println("4. Floating-point division by zero results in Infinity, not an exception");
        System.out.println("5. Integer arithmetic can overflow/underflow without error indication");
        System.out.println("6. Floating-point arithmetic has precision limitations (0.1 + 0.2 ≠ 0.3 exactly)");
        System.out.println("7. Arithmetic operations on bytes and shorts promote to int");
        System.out.println("8. Casting from double to int truncates the decimal part");
    }
}
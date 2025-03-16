/**
 * CON1A4_Exp.java
 * 
 * This program demonstrates that arithmetic operations using two int values evaluate to an int value.
 * Knowledge Point: CON-1.A.4 - An arithmetic operation that uses two int values will evaluate to an int value.
 */
public class CON1A4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Arithmetic Operations with int Values:\n");
        
        // Example 1: Basic arithmetic operations with int values
        System.out.println("Example 1: Basic arithmetic operations with int values");
        int a = 10;
        int b = 3;
        
        int sum = a + b;        // Addition of two ints
        int difference = a - b;  // Subtraction of two ints
        int product = a * b;     // Multiplication of two ints
        int quotient = a / b;    // Division of two ints
        int remainder = a % b;   // Modulus of two ints
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + sum + " (int result)");
        System.out.println("a - b = " + difference + " (int result)");
        System.out.println("a * b = " + product + " (int result)");
        System.out.println("a / b = " + quotient + " (int result, decimal part is truncated)");
        System.out.println("a % b = " + remainder + " (int result)");
        System.out.println();
        
        // Example 2: Integer division truncation
        System.out.println("Example 2: Integer division truncation");
        int c = 7;
        int d = 2;
        
        int intDivision = c / d;  // Integer division truncates the decimal part
        
        System.out.println("c = " + c + ", d = " + d);
        System.out.println("c / d = " + intDivision + " (int result, decimal part is truncated)");
        System.out.println("The mathematical result would be 3.5, but int division gives " + intDivision);
        System.out.println();
        
        // Example 3: Complex expressions with int values
        System.out.println("Example 3: Complex expressions with int values");
        int e = 5;
        int f = 2;
        
        int expression1 = a + b * c;          // Result is an int
        int expression2 = (a + b) * c / d;    // Result is an int
        int expression3 = a * b + c * d - e / f; // Result is an int
        
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e + ", f = " + f);
        System.out.println("a + b * c = " + expression1 + " (int result)");
        System.out.println("(a + b) * c / d = " + expression2 + " (int result)");
        System.out.println("a * b + c * d - e / f = " + expression3 + " (int result)");
        System.out.println();
        
        // Example 4: Integer overflow
        System.out.println("Example 4: Integer overflow");
        int maxInt = Integer.MAX_VALUE;  // 2,147,483,647
        int overflowResult = maxInt + 1;  // Overflows to negative number, but still an int
        
        System.out.println("Integer.MAX_VALUE = " + maxInt);
        System.out.println("Integer.MAX_VALUE + 1 = " + overflowResult + " (still an int, but overflows to negative)");
        System.out.println();
        
        // Example 5: Integer underflow
        System.out.println("Example 5: Integer underflow");
        int minInt = Integer.MIN_VALUE;  // -2,147,483,648
        int underflowResult = minInt - 1;  // Underflows to positive number, but still an int
        
        System.out.println("Integer.MIN_VALUE = " + minInt);
        System.out.println("Integer.MIN_VALUE - 1 = " + underflowResult + " (still an int, but underflows to positive)");
        System.out.println();
        
        // Example 6: Type promotion within expressions
        System.out.println("Example 6: Type promotion within expressions");
        byte byte1 = 10;
        byte byte2 = 20;
        short short1 = 30;
        short short2 = 40;
        
        // When bytes and shorts are used in arithmetic operations, they are promoted to int
        int byteResult = byte1 + byte2;    // Result is an int
        int shortResult = short1 + short2;  // Result is an int
        int mixedResult = byte1 + short1;   // Result is an int
        
        System.out.println("byte1 = " + byte1 + ", byte2 = " + byte2);
        System.out.println("byte1 + byte2 = " + byteResult + " (result is an int, not a byte)");
        System.out.println("short1 = " + short1 + ", short2 = " + short2);
        System.out.println("short1 + short2 = " + shortResult + " (result is an int, not a short)");
        System.out.println("byte1 + short1 = " + mixedResult + " (result is an int)");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about int Arithmetic Operations ---");
        System.out.println("1. An arithmetic operation that uses two int values will evaluate to an int value (CON-1.A.4)");
        System.out.println("2. Integer division truncates the decimal part (7/2 = 3, not 3.5)");
        System.out.println("3. All arithmetic operations (+, -, *, /, %) with int operands produce int results");
        System.out.println("4. Integer arithmetic can overflow or underflow but still produces int results");
        System.out.println("5. Bytes and shorts are promoted to int in arithmetic operations");
        System.out.println("6. Complex expressions with int values always evaluate to int values");
    }
}
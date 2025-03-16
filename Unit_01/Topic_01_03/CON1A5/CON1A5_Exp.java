/**
 * CON1A5_Exp.java
 * 
 * This program demonstrates that arithmetic operations using a double value will evaluate to a double value.
 * Knowledge Point: CON-1.A.5 - An arithmetic operation that uses a double value will evaluate to a double value.
 */
public class CON1A5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Arithmetic Operations with double Values:\n");
        
        // Example 1: Basic arithmetic operations with double values
        System.out.println("Example 1: Basic arithmetic operations with double values");
        double a = 10.5;
        double b = 3.25;
        
        double sum = a + b;        // Addition of two doubles
        double difference = a - b;  // Subtraction of two doubles
        double product = a * b;     // Multiplication of two doubles
        double quotient = a / b;    // Division of two doubles
        double remainder = a % b;   // Modulus of two doubles
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + sum + " (double result)");
        System.out.println("a - b = " + difference + " (double result)");
        System.out.println("a * b = " + product + " (double result)");
        System.out.println("a / b = " + quotient + " (double result, preserves decimal part)");
        System.out.println("a % b = " + remainder + " (double result)");
        System.out.println();
        
        // Example 2: Mixed int and double operations
        System.out.println("Example 2: Mixed int and double operations");
        int c = 7;
        double d = 2.0;
        
        double mixedSum = c + d;        // int + double -> double
        double mixedDifference = c - d;  // int - double -> double
        double mixedProduct = c * d;     // int * double -> double
        double mixedQuotient = c / d;    // int / double -> double
        double mixedRemainder = c % d;   // int % double -> double
        
        System.out.println("c = " + c + " (int), d = " + d + " (double)");
        System.out.println("c + d = " + mixedSum + " (double result)");
        System.out.println("c - d = " + mixedDifference + " (double result)");
        System.out.println("c * d = " + mixedProduct + " (double result)");
        System.out.println("c / d = " + mixedQuotient + " (double result, preserves decimal part)");
        System.out.println("c % d = " + mixedRemainder + " (double result)");
        System.out.println();
        
        // Example 3: Complex expressions with double values
        System.out.println("Example 3: Complex expressions with double values");
        double e = 5.5;
        double f = 2.5;
        
        double expression1 = a + b * c;          // Result is a double
        double expression2 = (a + b) * c / d;    // Result is a double
        double expression3 = a * b + c * d - e / f; // Result is a double
        
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e + ", f = " + f);
        System.out.println("a + b * c = " + expression1 + " (double result)");
        System.out.println("(a + b) * c / d = " + expression2 + " (double result)");
        System.out.println("a * b + c * d - e / f = " + expression3 + " (double result)");
        System.out.println();
        
        // Example 4: Special cases with double arithmetic
        System.out.println("Example 4: Special cases with double arithmetic");
        
        // Division by zero with doubles
        double divByZero = 10.0 / 0.0;  // Results in Infinity, not an exception
        System.out.println("10.0 / 0.0 = " + divByZero + " (double division by zero results in Infinity)");
        
        // Negative division by zero
        double negDivByZero = -10.0 / 0.0;  // Results in -Infinity
        System.out.println("-10.0 / 0.0 = " + negDivByZero + " (negative double division by zero results in -Infinity)");
        
        // Zero divided by zero
        double zeroDivByZero = 0.0 / 0.0;  // Results in NaN (Not a Number)
        System.out.println("0.0 / 0.0 = " + zeroDivByZero + " (zero divided by zero results in NaN)");
        System.out.println();
        
        // Example 5: Type promotion from other numeric types
        System.out.println("Example 5: Type promotion from other numeric types");
        byte byteVal = 10;
        short shortVal = 20;
        int intVal = 30;
        float floatVal = 40.5f;
        
        // All these operations result in double because one operand is double
        double byteDouble = byteVal + 1.0;    // byte + double -> double
        double shortDouble = shortVal * 2.5;  // short * double -> double
        double intDouble = intVal / 2.5;      // int / double -> double
        double floatDouble = floatVal + 1.5;  // float + double -> double
        
        System.out.println("byteVal + 1.0 = " + byteDouble + " (double result)");
        System.out.println("shortVal * 2.5 = " + shortDouble + " (double result)");
        System.out.println("intVal / 2.5 = " + intDouble + " (double result)");
        System.out.println("floatVal + 1.5 = " + floatDouble + " (double result)");
        System.out.println();
        
        // Example 6: Double precision and representation
        System.out.println("Example 6: Double precision and representation");
        double precise1 = 0.1;
        double precise2 = 0.2;
        double preciseSum = precise1 + precise2;  // Not exactly 0.3 due to binary representation
        
        System.out.println("0.1 + 0.2 = " + preciseSum + " (not exactly 0.3 due to binary representation)");
        System.out.println("This is not an error but a characteristic of floating-point arithmetic");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about double Arithmetic Operations ---");
        System.out.println("1. An arithmetic operation that uses a double value will evaluate to a double value (CON-1.A.5)");
        System.out.println("2. When an int and a double are used in an operation, the result is a double");
        System.out.println("3. Double division preserves the decimal part (unlike int division)");
        System.out.println("4. Double division by zero results in Infinity or NaN, not an exception");
        System.out.println("5. All numeric types (byte, short, int, float) are promoted to double when used with a double");
        System.out.println("6. Double arithmetic has limited precision due to binary representation");
    }
}
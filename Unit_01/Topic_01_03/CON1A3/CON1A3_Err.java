/**
 * CON1A3_Err.java
 * 
 * This program demonstrates common errors related to arithmetic operators in Java.
 * Knowledge Point: CON-1.A.3 - The arithmetic operators consist of +, -, *, /, and %.
 */
public class CON1A3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Arithmetic Operators:\n");
        
        // Example 1: Addition operator (+) errors
        System.out.println("Example 1: Addition operator (+) errors");
        
        // Error 1: Unexpected string concatenation
        // int result1 = 5 + "10";    // Error: Cannot convert String to int
        System.out.println("Error 1: int result1 = 5 + \"10\"; // Cannot convert String to int");
        
        // Error 2: Operator precedence confusion
        String s1 = "Result: " + 5 + 3;  // Evaluates to "Result: 53" not "Result: 8"
        System.out.println("Unexpected concatenation: \"Result: \" + 5 + 3 = " + s1 + " (not \"Result: 8\")");
        System.out.println();
        
        // Example 2: Subtraction operator (-) errors
        System.out.println("Example 2: Subtraction operator (-) errors");
        
        // Error 3: Cannot use subtraction with strings
        // String s2 = "Hello" - "H";  // Error: Cannot apply - operator to strings
        System.out.println("Error 3: String s2 = \"Hello\" - \"H\"; // Cannot apply - operator to strings");
        
        // Error 4: Unary minus confusion
        int x = 5;
        int y = -x++;  // This negates x, then increments x
        System.out.println("Unary minus with postfix: -x++ where x=5 gives y=" + y + " and x=" + x + " (often misunderstood)");
        System.out.println();
        
        // Example 3: Multiplication operator (*) errors
        System.out.println("Example 3: Multiplication operator (*) errors");
        
        // Error 5: Cannot multiply strings
        // String s3 = "Hello" * 3;  // Error: Cannot apply * operator to string
        System.out.println("Error 5: String s3 = \"Hello\" * 3; // Cannot multiply strings");
        
        // Error 6: Overflow without warning
        int large1 = 1000000;
        int large2 = 1000000;
        int product = large1 * large2;  // Overflows without warning
        System.out.println("Overflow: 1000000 * 1000000 = " + product + " (incorrect result due to overflow)");
        System.out.println();
        
        // Example 4: Division operator (/) errors
        System.out.println("Example 4: Division operator (/) errors");
        
        // Error 7: Division by zero with integers
        try {
            // int divByZero = 10 / 0;  // Error: ArithmeticException - Division by zero
            System.out.println("Error 7: int divByZero = 10 / 0; // ArithmeticException: Division by zero");
        } catch (ArithmeticException e) {
            // This catch block is just to prevent the program from crashing
        }
        
        // Error 8: Unexpected integer division
        int a = 5;
        int b = 2;
        int c = a / b;  // Result is 2, not 2.5
        System.out.println("Integer division: 5 / 2 = " + c + " (truncates decimal part, often unexpected)");
        System.out.println();
        
        // Example 5: Modulus operator (%) errors
        System.out.println("Example 5: Modulus operator (%) errors");
        
        // Error 9: Modulus by zero
        try {
            // int modByZero = 10 % 0;  // Error: ArithmeticException - Division by zero
            System.out.println("Error 9: int modByZero = 10 % 0; // ArithmeticException: Division by zero");
        } catch (ArithmeticException e) {
            // This catch block is just to prevent the program from crashing
        }
        
        // Error 10: Confusion with negative numbers in modulus
        int mod1 = -10 % 3;  // Result is -1, not 1
        int mod2 = 10 % -3;  // Result is 1, not -1
        System.out.println("Modulus with negative numbers: -10 % 3 = " + mod1 + " (sign follows first operand)");
        System.out.println("Modulus with negative numbers: 10 % -3 = " + mod2 + " (sign of divisor doesn't affect result sign)");
        System.out.println();
        
        // Example 6: Operator precedence errors
        System.out.println("Example 6: Operator precedence errors");
        
        // Error 11: Misunderstanding operator precedence
        int result1 = 2 + 3 * 4;    // Result is 14, not 20
        int result2 = 2 + 3 - 4 * 5; // Result is -15, not 5
        System.out.println("Precedence error: 2 + 3 * 4 = " + result1 + " (not 20, * has higher precedence than +)");
        System.out.println("Precedence error: 2 + 3 - 4 * 5 = " + result2 + " (not 5, * has higher precedence than + and -)");
        System.out.println();
        
        // Example 7: Type-related errors
        System.out.println("Example 7: Type-related errors");
        
        // Error 12: Char arithmetic confusion
        char ch1 = 'A';
        char ch2 = 'B';
        // char ch3 = ch1 + ch2;  // Error: int cannot be converted to char without casting
        System.out.println("Error 12: char ch3 = ch1 + ch2; // Arithmetic on chars produces int");
        
        // Error 13: Byte/short arithmetic promotion
        byte byte1 = 10;
        byte byte2 = 20;
        // byte byte3 = byte1 + byte2;  // Error: int cannot be converted to byte without casting
        System.out.println("Error 13: byte byte3 = byte1 + byte2; // Arithmetic on bytes produces int");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Arithmetic Operator Errors ---");
        System.out.println("1. The + operator performs string concatenation when one operand is a string");
        System.out.println("2. The -, *, /, % operators cannot be applied to strings");
        System.out.println("3. Integer division (/) truncates the decimal part");
        System.out.println("4. Division or modulus by zero causes ArithmeticException for integers");
        System.out.println("5. Modulus with negative numbers follows specific rules (sign follows dividend)");
        System.out.println("6. Operator precedence must be carefully considered (*, /, % before +, -)");
        System.out.println("7. Arithmetic operations on char, byte, and short promote to int");
        System.out.println("8. Integer arithmetic can overflow without warning");
    }
}
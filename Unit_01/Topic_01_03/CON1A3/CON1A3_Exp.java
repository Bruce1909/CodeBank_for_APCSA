/**
 * CON1A3_Exp.java
 * 
 * This program demonstrates the arithmetic operators in Java.
 * Knowledge Point: CON-1.A.3 - The arithmetic operators consist of +, -, *, /, and %.
 */
public class CON1A3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Arithmetic Operators in Java:\n");
        
        // Example 1: Addition operator (+)
        System.out.println("Example 1: Addition operator (+)");
        int sum1 = 5 + 3;           // Adding two integers
        double sum2 = 2.5 + 3.7;    // Adding two doubles
        String concat = "Hello" + " World";  // String concatenation with +
        
        System.out.println("5 + 3 = " + sum1);
        System.out.println("2.5 + 3.7 = " + sum2);
        System.out.println("\"Hello\" + \" World\" = " + concat);
        System.out.println("10 + \"20\" = " + (10 + "20") + " (number + string becomes string concatenation)");
        System.out.println();
        
        // Example 2: Subtraction operator (-)
        System.out.println("Example 2: Subtraction operator (-)");
        int diff1 = 10 - 4;         // Subtracting two integers
        double diff2 = 7.5 - 2.5;   // Subtracting two doubles
        int negative = -5;          // Unary minus (negation)
        
        System.out.println("10 - 4 = " + diff1);
        System.out.println("7.5 - 2.5 = " + diff2);
        System.out.println("-5 (unary minus) = " + negative);
        System.out.println();
        
        // Example 3: Multiplication operator (*)
        System.out.println("Example 3: Multiplication operator (*)");
        int product1 = 6 * 4;        // Multiplying two integers
        double product2 = 2.5 * 3.0; // Multiplying two doubles
        
        System.out.println("6 * 4 = " + product1);
        System.out.println("2.5 * 3.0 = " + product2);
        System.out.println();
        
        // Example 4: Division operator (/)
        System.out.println("Example 4: Division operator (/)");
        int quotient1 = 20 / 4;      // Integer division
        int quotient2 = 9 / 2;       // Integer division with truncation
        double quotient3 = 9.0 / 2;  // Double division
        
        System.out.println("20 / 4 = " + quotient1 + " (integer division)");
        System.out.println("9 / 2 = " + quotient2 + " (integer division truncates the decimal part)");
        System.out.println("9.0 / 2 = " + quotient3 + " (floating-point division preserves the decimal part)");
        System.out.println();
        
        // Example 5: Modulus operator (%)
        System.out.println("Example 5: Modulus operator (%)");
        int remainder1 = 10 % 3;     // Remainder of integer division
        int remainder2 = 10 % 2;     // Remainder when divisible
        double remainder3 = 10.5 % 3.2; // Modulus with doubles
        
        System.out.println("10 % 3 = " + remainder1 + " (remainder of division)");
        System.out.println("10 % 2 = " + remainder2 + " (remainder is 0 when divisible)");
        System.out.println("10.5 % 3.2 = " + remainder3 + " (modulus works with doubles too)");
        System.out.println();
        
        // Example 6: Combining arithmetic operators
        System.out.println("Example 6: Combining arithmetic operators");
        int combined1 = 2 + 3 * 4;    // Multiplication has higher precedence
        int combined2 = (2 + 3) * 4;  // Parentheses change precedence
        
        System.out.println("2 + 3 * 4 = " + combined1 + " (multiplication before addition)");
        System.out.println("(2 + 3) * 4 = " + combined2 + " (parentheses change precedence)");
        System.out.println();
        
        // Example 7: Special cases
        System.out.println("Example 7: Special cases");
        System.out.println("Division by zero for floating-point: 5.0 / 0.0 = " + (5.0 / 0.0) + " (results in Infinity)");
        System.out.println("Modulus with negative numbers: -7 % 3 = " + (-7 % 3) + " (sign of result matches dividend)");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Arithmetic Operators ---");
        System.out.println("1. The arithmetic operators consist of +, -, *, /, and % (CON-1.A.3)");
        System.out.println("2. The + operator performs addition with numbers and concatenation with strings");
        System.out.println("3. The - operator performs subtraction and can also be used as unary negation");
        System.out.println("4. The * operator performs multiplication");
        System.out.println("5. The / operator performs division (integer division truncates the decimal part)");
        System.out.println("6. The % operator returns the remainder of division");
        System.out.println("7. Operators follow precedence rules (*, /, % before +, -)");
        System.out.println("8. Parentheses can be used to change the order of operations");
    }
}
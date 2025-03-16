/**
 * CON1A2_Exp.java
 * 
 * This program demonstrates arithmetic expressions of type int and double in Java.
 * Knowledge Point: CON-1.A.2 - Arithmetic expressions include expressions of type int and double.
 */
public class CON1A2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Arithmetic Expressions of type int and double:\n");
        
        // Example 1: Basic int arithmetic expressions
        System.out.println("Example 1: Basic int arithmetic expressions");
        int a = 10;
        int b = 3;
        
        int sum = a + b;        // Addition
        int difference = a - b;  // Subtraction
        int product = a * b;     // Multiplication
        int quotient = a / b;    // Division (integer division)
        int remainder = a % b;   // Modulus (remainder)
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + product);
        System.out.println("a / b = " + quotient + " (integer division truncates the decimal part)");
        System.out.println("a % b = " + remainder + " (remainder of division)");
        System.out.println();
        
        // Example 2: Basic double arithmetic expressions
        System.out.println("Example 2: Basic double arithmetic expressions");
        double x = 10.5;
        double y = 3.25;
        
        double doubleSum = x + y;        // Addition
        double doubleDifference = x - y;  // Subtraction
        double doubleProduct = x * y;     // Multiplication
        double doubleQuotient = x / y;    // Division (floating-point division)
        double doubleRemainder = x % y;   // Modulus (remainder)
        
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x + y = " + doubleSum);
        System.out.println("x - y = " + doubleDifference);
        System.out.println("x * y = " + doubleProduct);
        System.out.println("x / y = " + doubleQuotient + " (floating-point division preserves the decimal part)");
        System.out.println("x % y = " + doubleRemainder + " (remainder of division)");
        System.out.println();
        
        // Example 3: Complex int expressions
        System.out.println("Example 3: Complex int expressions");
        int c = 5;
        int d = 2;
        
        int complexExpression1 = a + b * c;           // Multiplication has higher precedence
        int complexExpression2 = (a + b) * c;         // Parentheses change precedence
        int complexExpression3 = a + b - c * d / 2;   // Multiple operations with different precedence
        
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        System.out.println("a + b * c = " + complexExpression1 + " (multiplication before addition)");
        System.out.println("(a + b) * c = " + complexExpression2 + " (parentheses change precedence)");
        System.out.println("a + b - c * d / 2 = " + complexExpression3 + " (follows operator precedence)");
        System.out.println();
        
        // Example 4: Complex double expressions
        System.out.println("Example 4: Complex double expressions");
        double z = 2.5;
        
        double complexDoubleExpr1 = x + y * z;           // Multiplication has higher precedence
        double complexDoubleExpr2 = (x + y) * z;         // Parentheses change precedence
        double complexDoubleExpr3 = x + y - z * 2 / 0.5; // Multiple operations with different precedence
        
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        System.out.println("x + y * z = " + complexDoubleExpr1 + " (multiplication before addition)");
        System.out.println("(x + y) * z = " + complexDoubleExpr2 + " (parentheses change precedence)");
        System.out.println("x + y - z * 2 / 0.5 = " + complexDoubleExpr3 + " (follows operator precedence)");
        System.out.println();
        
        // Example 5: Mixed int and double expressions (type promotion)
        System.out.println("Example 5: Mixed int and double expressions (type promotion)");
        
        double mixedExpr1 = a + x;      // int + double -> double
        double mixedExpr2 = b * y;      // int * double -> double
        double mixedExpr3 = c / z;      // int / double -> double
        double mixedExpr4 = d % y;      // int % double -> double
        
        System.out.println("a = " + a + " (int), x = " + x + " (double)");
        System.out.println("a + x = " + mixedExpr1 + " (result is double)");
        System.out.println("b = " + b + " (int), y = " + y + " (double)");
        System.out.println("b * y = " + mixedExpr2 + " (result is double)");
        System.out.println("c = " + c + " (int), z = " + z + " (double)");
        System.out.println("c / z = " + mixedExpr3 + " (result is double)");
        System.out.println("d = " + d + " (int), y = " + y + " (double)");
        System.out.println("d % y = " + mixedExpr4 + " (result is double)");
        System.out.println();
        
        // Example 6: Expressions with literals
        System.out.println("Example 6: Expressions with literals");
        
        int literalIntExpr = 5 + 3 * 2;          // Using int literals
        double literalDoubleExpr = 5.5 + 3.5 * 2; // Using double literals
        double mixedLiteralExpr = 5 + 3.5;        // Mixed int and double literals
        
        System.out.println("5 + 3 * 2 = " + literalIntExpr + " (using int literals)");
        System.out.println("5.5 + 3.5 * 2 = " + literalDoubleExpr + " (using double literals)");
        System.out.println("5 + 3.5 = " + mixedLiteralExpr + " (mixed int and double literals)");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Arithmetic Expressions ---");
        System.out.println("1. Arithmetic expressions include expressions of type int and double (CON-1.A.2)");
        System.out.println("2. int expressions perform integer arithmetic (division truncates decimal part)");
        System.out.println("3. double expressions perform floating-point arithmetic (preserves decimal part)");
        System.out.println("4. Expressions follow operator precedence rules");
        System.out.println("5. Parentheses can be used to change the order of evaluation");
        System.out.println("6. When int and double are used in the same expression, the result is promoted to double");
    }
}
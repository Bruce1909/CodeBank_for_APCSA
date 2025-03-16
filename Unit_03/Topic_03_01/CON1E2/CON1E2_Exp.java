/**
 * CON1E2_Exp.java
 * 
 * This program demonstrates comparing arithmetic expression values using relational operators.
 * Knowledge Point: CON-1.E.2 - Arithmetic expression values can be compared using relational operators (i.e., <, >, <=, >=).
 */
public class CON1E2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Comparison of Arithmetic Expressions:\n");
        
        // Example 1: Basic comparisons with integers
        System.out.println("Example 1: Basic comparisons with integers");
        int a = 10;
        int b = 5;
        
        boolean isGreater = a > b;       // Greater than
        boolean isLess = a < b;          // Less than
        boolean isGreaterEqual = a >= b;  // Greater than or equal to
        boolean isLessEqual = a <= b;     // Less than or equal to
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a > b: " + isGreater);       // true
        System.out.println("a < b: " + isLess);          // false
        System.out.println("a >= b: " + isGreaterEqual); // true
        System.out.println("a <= b: " + isLessEqual);    // false
        System.out.println();
        
        // Example 2: Comparing arithmetic expressions
        System.out.println("Example 2: Comparing arithmetic expressions");
        int c = 7;
        int d = 3;
        
        boolean expr1 = (a + b) > (c + d);  // Comparing sum expressions
        boolean expr2 = (a * b) < (c * d);  // Comparing product expressions
        boolean expr3 = (a / b) >= (c / d); // Comparing division expressions
        boolean expr4 = (a % b) <= (c % d); // Comparing remainder expressions
        
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        System.out.println("(a + b) > (c + d): " + expr1 + " (" + (a + b) + " > " + (c + d) + ")");
        System.out.println("(a * b) < (c * d): " + expr2 + " (" + (a * b) + " < " + (c * d) + ")");
        System.out.println("(a / b) >= (c / d): " + expr3 + " (" + (a / b) + " >= " + (c / d) + ")");
        System.out.println("(a % b) <= (c % d): " + expr4 + " (" + (a % b) + " <= " + (c % d) + ")");
        System.out.println();
        
        // Example 3: Comparing floating-point values
        System.out.println("Example 3: Comparing floating-point values");
        double x = 3.14;
        double y = 2.71;
        
        boolean doubleGreater = x > y;
        boolean doubleLess = x < y;
        boolean doubleGreaterEqual = x >= y;
        boolean doubleLessEqual = x <= y;
        
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x > y: " + doubleGreater);       // true
        System.out.println("x < y: " + doubleLess);          // false
        System.out.println("x >= y: " + doubleGreaterEqual); // true
        System.out.println("x <= y: " + doubleLessEqual);    // false
        System.out.println();
        
        // Example 4: Comparing mixed type expressions
        System.out.println("Example 4: Comparing mixed type expressions");
        int i = 5;
        double d1 = 5.0;
        double d2 = 5.00001;
        
        boolean mixedEqual = i == d1;      // int compared with double
        boolean mixedNotEqual = i != d2;    // int compared with double
        boolean mixedLess = i < d2;         // int compared with double
        boolean mixedGreater = i > d1;      // int compared with double
        
        System.out.println("i = " + i + ", d1 = " + d1 + ", d2 = " + d2);
        System.out.println("i == d1: " + mixedEqual + " (automatic type conversion)");
        System.out.println("i != d2: " + mixedNotEqual + " (automatic type conversion)");
        System.out.println("i < d2: " + mixedLess + " (automatic type conversion)");
        System.out.println("i > d1: " + mixedGreater + " (automatic type conversion)");
        System.out.println();
        
        // Example 5: Comparing complex expressions
        System.out.println("Example 5: Comparing complex expressions");
        boolean complex1 = (a * b + c) > (d * (a + b));
        boolean complex2 = Math.sqrt(a * a + b * b) <= a + b;
        boolean complex3 = (a % 2 == 0) && (b % 2 != 0);
        
        System.out.println("(a * b + c) > (d * (a + b)): " + complex1);
        System.out.println("Math.sqrt(a * a + b * b) <= a + b: " + complex2);
        System.out.println("(a % 2 == 0) && (b % 2 != 0): " + complex3);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Comparing Arithmetic Expressions ---");
        System.out.println("1. Arithmetic expression values can be compared using <, >, <=, and >= (CON-1.E.2)");
        System.out.println("2. Expressions are evaluated first, then the results are compared");
        System.out.println("3. Mixed type expressions undergo automatic type conversion before comparison");
        System.out.println("4. Relational operators have lower precedence than arithmetic operators");
        System.out.println("5. Parentheses can be used to control the order of evaluation");
    }
}
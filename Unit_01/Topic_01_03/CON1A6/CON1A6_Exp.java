/**
 * CON1A6_Exp.java
 * 
 * This program demonstrates how operators can be used to construct compound expressions in Java.
 * Knowledge Point: CON-1.A.6 - Operators can be used to construct compound expressions.
 */
public class CON1A6_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Compound Expressions in Java:\n");
        
        // Example 1: Basic compound expressions with arithmetic operators
        System.out.println("Example 1: Basic compound expressions with arithmetic operators");
        int a = 5;
        int b = 3;
        int c = 2;
        
        int result1 = a + b * c;        // Multiplication has higher precedence than addition
        int result2 = (a + b) * c;      // Parentheses change the order of operations
        int result3 = a + b - c * a / b; // Multiple operations with different precedence
        
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("a + b * c = " + result1 + " (multiplication before addition)");
        System.out.println("(a + b) * c = " + result2 + " (parentheses change precedence)");
        System.out.println("a + b - c * a / b = " + result3 + " (follows operator precedence rules)");
        System.out.println();
        
        // Example 2: Compound expressions with mixed data types
        System.out.println("Example 2: Compound expressions with mixed data types");
        double d = 2.5;
        
        double mixedResult1 = a + b * d;      // int and double operations
        double mixedResult2 = (a + d) * b / c; // Multiple operations with type promotion
        
        System.out.println("d = " + d);
        System.out.println("a + b * d = " + mixedResult1 + " (multiplication before addition, result is double)");
        System.out.println("(a + d) * b / c = " + mixedResult2 + " (follows precedence, result is double)");
        System.out.println();
        
        // Example 3: Compound expressions with assignment operators
        System.out.println("Example 3: Compound expressions with assignment operators");
        int x = 10;
        
        x += 5;      // Equivalent to x = x + 5
        System.out.println("After x += 5, x = " + x);
        
        x -= 3;      // Equivalent to x = x - 3
        System.out.println("After x -= 3, x = " + x);
        
        x *= 2;      // Equivalent to x = x * 2
        System.out.println("After x *= 2, x = " + x);
        
        x /= 4;      // Equivalent to x = x / 4
        System.out.println("After x /= 4, x = " + x);
        
        x %= 3;      // Equivalent to x = x % 3
        System.out.println("After x %= 3, x = " + x);
        System.out.println();
        
        // Example 4: Compound expressions with increment/decrement operators
        System.out.println("Example 4: Compound expressions with increment/decrement operators");
        int i = 5;
        int j = 5;
        
        int preIncrement = ++i;  // Increment i before using its value
        int postIncrement = j++; // Use j's value, then increment j
        
        System.out.println("Original i = 5, j = 5");
        System.out.println("preIncrement = ++i results in preIncrement = " + preIncrement + " and i = " + i);
        System.out.println("postIncrement = j++ results in postIncrement = " + postIncrement + " and j = " + j);
        
        // Using increment/decrement in compound expressions
        int k = 10;
        int result4 = k++ + 5;  // Use k (10), then increment k to 11, so result4 = 15
        System.out.println("k = 10, result4 = k++ + 5 results in result4 = " + result4 + " and k = " + k);
        
        int m = 10;
        int result5 = ++m + 5;  // Increment m to 11, then use m, so result5 = 16
        System.out.println("m = 10, result5 = ++m + 5 results in result5 = " + result5 + " and m = " + m);
        System.out.println();
        
        // Example 5: Compound expressions with relational and logical operators
        System.out.println("Example 5: Compound expressions with relational and logical operators");
        int p = 5;
        int q = 10;
        int r = 15;
        
        boolean condition1 = p < q && q < r;  // Logical AND
        boolean condition2 = p > q || q < r;  // Logical OR
        boolean condition3 = !(p > q);        // Logical NOT
        boolean condition4 = p < q && (q > r || r > p);  // Complex condition
        
        System.out.println("p = " + p + ", q = " + q + ", r = " + r);
        System.out.println("p < q && q < r = " + condition1);
        System.out.println("p > q || q < r = " + condition2);
        System.out.println("!(p > q) = " + condition3);
        System.out.println("p < q && (q > r || r > p) = " + condition4);
        System.out.println();
        
        // Example 6: Compound expressions with conditional (ternary) operator
        System.out.println("Example 6: Compound expressions with conditional (ternary) operator");
        int value = 15;
        
        String result6 = (value > 10) ? "Greater than 10" : "Not greater than 10";
        System.out.println("value = " + value);
        System.out.println("(value > 10) ? \"Greater than 10\" : \"Not greater than 10\" = " + result6);
        
        // Nested ternary operator
        String result7 = (value > 20) ? "Greater than 20" : 
                         (value > 10) ? "Between 11 and 20" : "10 or less";
        System.out.println("Nested ternary result = " + result7);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Compound Expressions ---");
        System.out.println("1. Operators can be used to construct compound expressions (CON-1.A.6)");
        System.out.println("2. Compound expressions combine multiple operations in a single expression");
        System.out.println("3. Operator precedence determines the order of evaluation");
        System.out.println("4. Parentheses can be used to override the default precedence");
        System.out.println("5. Compound expressions can involve different types of operators (arithmetic, relational, logical)");
        System.out.println("6. Assignment operators (+=, -=, *=, /=, %=) provide shorthand for common operations");
        System.out.println("7. Increment/decrement operators (++, --) can be used in compound expressions");
        System.out.println("8. The conditional operator (? :) allows for compact if-else expressions");
    }
}
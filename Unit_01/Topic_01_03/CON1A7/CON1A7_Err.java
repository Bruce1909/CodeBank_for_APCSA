/**
 * CON1A7_Err.java
 * 
 * This program demonstrates common errors related to operator precedence in Java.
 * Knowledge Point: CON-1.A.7 - During evaluation, operands are associated with operators according to operator precedence to determine how they are grouped.
 */
public class CON1A7_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Operator Precedence:\n");
        
        // Example 1: Basic precedence errors
        System.out.println("Example 1: Basic precedence errors");
        
        // Error 1: Assuming left-to-right evaluation regardless of operator precedence
        int result1 = 2 + 3 * 4;  // Result is 14, not 20
        System.out.println("2 + 3 * 4 = " + result1 + " (not 20, * has higher precedence than +)");
        
        // Error 2: Complex expression precedence confusion
        int result2 = 10 - 4 + 2 * 3;  // Result is 12, not 24
        System.out.println("10 - 4 + 2 * 3 = " + result2 + " (not 24, * has higher precedence than + and -)");
        System.out.println();
        
        // Example 2: Missing parentheses errors
        System.out.println("Example 2: Missing parentheses errors");
        
        // Error 3: Missing necessary parentheses
        int a = 5;
        int b = 3;
        int c = 2;
        
        int result3 = a + b / c * a;  // Result is 10, not 8
        System.out.println("a + b / c * a = " + result3 + " (not 8, / and * have higher precedence than +)");
        System.out.println("Evaluation: a + (b / c) * a = 5 + (3 / 2) * 5 = 5 + 1 * 5 = 5 + 5 = 10");
        
        // Error 4: Incorrect parentheses placement
        int result4 = (a + b) / c * a;  // Result is 20, not 10
        System.out.println("(a + b) / c * a = " + result4 + " (not 10, parentheses change the grouping)");
        System.out.println("Evaluation: ((a + b) / c) * a = ((5 + 3) / 2) * 5 = (8 / 2) * 5 = 4 * 5 = 20");
        System.out.println();
        
        // Example 3: Assignment operator precedence errors
        System.out.println("Example 3: Assignment operator precedence errors");
        
        // Error 5: Misunderstanding assignment precedence
        int x = 10;
        int y = 5;
        int z = 2;
        
        // x = y += z;  // This is equivalent to x = (y += z), not (x = y) += z
        x = y += z;  // y becomes 7, then x becomes 7
        System.out.println("After x = y += z (where x=10, y=5, z=2): x = " + x + ", y = " + y);
        System.out.println("Assignment is right-associative: x = (y += z), not (x = y) += z");
        
        // Error 6: Assuming higher precedence for assignment
        int p = 10;
        // p = p + 2 * 3 = 4;  // Error: Cannot use assignment in the middle of an expression
        System.out.println("Error 6: p = p + 2 * 3 = 4; // Cannot use assignment in the middle of an expression");
        System.out.println();
        
        // Example 4: Increment/decrement operator precedence errors
        System.out.println("Example 4: Increment/decrement operator precedence errors");
        
        // Error 7: Misunderstanding increment/decrement precedence
        int i = 5;
        int j = 10;
        
        int result5 = i++ + j;  // Uses i (5), then increments i to 6
        System.out.println("i = 5, j = 10, i++ + j = " + result5 + " (not 16, post-increment happens after evaluation)");
        System.out.println("After evaluation, i = " + i);
        
        // Error 8: Confusing pre and post increment in expressions
        i = 5;  // Reset i
        int result6 = ++i + i++;  // Pre-increment i to 6, use 6 in sum, post-increment i to 7
        System.out.println("i = 5, ++i + i++ = " + result6 + " (not 11, pre-increment happens before evaluation)");
        System.out.println("After evaluation, i = " + i);
        System.out.println();
        
        // Example 5: Logical operator precedence errors
        System.out.println("Example 5: Logical operator precedence errors");
        
        // Error 9: Misunderstanding logical operator precedence
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        
        boolean result7 = b1 || b2 && b3;  // Result is true, not false
        System.out.println("b1 || b2 && b3 (where b1=true, b2=false, b3=true) = " + result7);
        System.out.println("Evaluation: b1 || (b2 && b3) = true || (false && true) = true || false = true");
        System.out.println("&& has higher precedence than ||, not evaluated left to right");
        
        // Error 10: Missing parentheses in logical expressions
        boolean result8 = b1 || b2 && !b3;  // Result is true, not false
        System.out.println("b1 || b2 && !b3 (where b1=true, b2=false, b3=true) = " + result8);
        System.out.println("Evaluation: b1 || (b2 && (!b3)) = true || (false && false) = true || false = true");
        System.out.println("! has higher precedence than &&, which has higher precedence than ||");
        System.out.println();
        
        // Example 6: Mixed operator type precedence errors
        System.out.println("Example 6: Mixed operator type precedence errors");
        
        // Error 11: Mixing arithmetic and relational operators without parentheses
        int m = 5;
        int n = 3;
        int o = 2;
        
        boolean result9 = m + n > o + m;  // Arithmetic operations before relational operations
        System.out.println("m + n > o + m (where m=5, n=3, o=2) = " + result9);
        System.out.println("Evaluation: (m + n) > (o + m) = (5 + 3) > (2 + 5) = 8 > 7 = true");
        System.out.println("Arithmetic operators have higher precedence than relational operators");
        
        // Error 12: Mixing relational and logical operators without parentheses
        boolean result10 = m > n && n > o || m < o;  // Relational before logical AND, then logical OR
        System.out.println("m > n && n > o || m < o (where m=5, n=3, o=2) = " + result10);
        System.out.println("Evaluation: ((m > n) && (n > o)) || (m < o) = ((5 > 3) && (3 > 2)) || (5 < 2) = (true && true) || false = true || false = true");
        System.out.println("Relational operators have higher precedence than logical operators");
        System.out.println();
        
        // Example 7: Conditional operator precedence errors
        System.out.println("Example 7: Conditional operator precedence errors");
        
        // Error 13: Misunderstanding conditional operator precedence
        int q = 5;
        int r = 10;
        
        int result11 = q > r ? q : r + 2;  // Conditional operator has lower precedence than +
        System.out.println("q > r ? q : r + 2 (where q=5, r=10) = " + result11);
        System.out.println("Evaluation: q > r ? q : (r + 2) = 5 > 10 ? 5 : (10 + 2) = false ? 5 : 12 = 12");
        
        // Error 14: Nested conditional operators without parentheses
        int s = 15;
        int result12 = q > r ? q : r > s ? r : s;  // Confusing nesting without parentheses
        System.out.println("q > r ? q : r > s ? r : s (where q=5, r=10, s=15) = " + result12);
        System.out.println("Evaluation is ambiguous without parentheses");
        System.out.println("Should be: q > r ? q : (r > s ? r : s) = 5 > 10 ? 5 : (10 > 15 ? 10 : 15) = false ? 5 : 15 = 15");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Operator Precedence Errors ---");
        System.out.println("1. Operators are not simply evaluated left to right; precedence determines grouping");
        System.out.println("2. Multiplication (*), division (/), and modulus (%) have higher precedence than addition (+) and subtraction (-)");
        System.out.println("3. Arithmetic operators have higher precedence than relational operators");
        System.out.println("4. Relational operators have higher precedence than logical operators");
        System.out.println("5. Logical AND (&&) has higher precedence than logical OR (||)");
        System.out.println("6. Assignment operators have very low precedence and are right-associative");
        System.out.println("7. Unary operators (!, ++, --, +, -) have higher precedence than binary operators");
        System.out.println("8. When in doubt, use parentheses to explicitly specify the intended grouping");
        System.out.println("9. Nested conditional operators (? :) can be confusing without parentheses");
    }
}
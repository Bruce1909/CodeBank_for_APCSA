/**
 * CON1A7_Exp.java
 * 
 * This program demonstrates how operands are associated with operators according to operator precedence.
 * Knowledge Point: CON-1.A.7 - During evaluation, operands are associated with operators according to operator precedence to determine how they are grouped.
 */
public class CON1A7_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Operator Precedence in Java:\n");
        
        // Example 1: Basic arithmetic operator precedence
        System.out.println("Example 1: Basic arithmetic operator precedence");
        int result1 = 2 + 3 * 4;        // Multiplication before addition
        int result2 = 2 + (3 * 4);      // Same as above, explicitly showing precedence
        int result3 = (2 + 3) * 4;      // Parentheses override precedence
        
        System.out.println("2 + 3 * 4 = " + result1 + " (multiplication before addition)");
        System.out.println("2 + (3 * 4) = " + result2 + " (same as above, explicitly showing precedence)");
        System.out.println("(2 + 3) * 4 = " + result3 + " (parentheses override precedence)");
        System.out.println();
        
        // Example 2: Precedence among arithmetic operators
        System.out.println("Example 2: Precedence among arithmetic operators");
        int result4 = 10 + 20 - 5;       // Left to right for same precedence (+ and -)
        int result5 = 10 * 20 / 5;       // Left to right for same precedence (* and /)
        int result6 = 10 + 20 * 5 - 15 / 3;  // * and / before + and -
        
        System.out.println("10 + 20 - 5 = " + result4 + " (left to right for + and -)");
        System.out.println("10 * 20 / 5 = " + result5 + " (left to right for * and /)");
        System.out.println("10 + 20 * 5 - 15 / 3 = " + result6 + " (* and / before + and -)");
        System.out.println();
        
        // Example 3: Precedence with modulus operator
        System.out.println("Example 3: Precedence with modulus operator");
        int result7 = 10 + 20 % 6;       // Modulus before addition
        int result8 = 10 * 20 % 6;       // Left to right for * and % (same precedence)
        int result9 = 10 % 20 * 6;       // Left to right for % and * (same precedence)
        
        System.out.println("10 + 20 % 6 = " + result7 + " (modulus before addition)");
        System.out.println("10 * 20 % 6 = " + result8 + " (left to right for * and %)");
        System.out.println("10 % 20 * 6 = " + result9 + " (left to right for % and *)");
        System.out.println();
        
        // Example 4: Precedence with unary operators
        System.out.println("Example 4: Precedence with unary operators");
        int a = 5;
        int result10 = -a * 2;          // Unary minus before multiplication
        int result11 = -(a * 2);        // Same as above, explicitly showing precedence
        int result12 = (-a) * 2;        // Same as above, explicitly showing precedence
        
        System.out.println("a = " + a);
        System.out.println("-a * 2 = " + result10 + " (unary minus before multiplication)");
        System.out.println("-(a * 2) = " + result11 + " (different grouping, same result)");
        System.out.println("(-a) * 2 = " + result12 + " (explicitly showing precedence)");
        System.out.println();
        
        // Example 5: Precedence with increment/decrement operators
        System.out.println("Example 5: Precedence with increment/decrement operators");
        int b = 5;
        int c = 5;
        int result13 = b++ + 10;        // Post-increment after addition
        int result14 = ++c + 10;        // Pre-increment before addition
        
        System.out.println("Original b = 5, c = 5");
        System.out.println("b++ + 10 = " + result13 + " (post-increment after addition, b becomes " + b + ")");
        System.out.println("++c + 10 = " + result14 + " (pre-increment before addition, c becomes " + c + ")");
        System.out.println();
        
        // Example 6: Precedence with assignment operators
        System.out.println("Example 6: Precedence with assignment operators");
        int d = 10;
        int e = 5;
        d = e = 7;  // Assignment is right-associative
        
        System.out.println("After d = e = 7, d = " + d + " and e = " + e + " (assignment is right-associative)");
        
        int f = 10;
        f += 5 * 2;  // Multiplication before addition assignment
        System.out.println("f = 10, after f += 5 * 2, f = " + f + " (multiplication before addition assignment)");
        System.out.println();
        
        // Example 7: Precedence with relational and logical operators
        System.out.println("Example 7: Precedence with relational and logical operators");
        int g = 5;
        int h = 10;
        int i = 15;
        
        boolean result15 = g < h && h < i;  // Relational operators before logical AND
        boolean result16 = g < h && h > i;  // Relational operators before logical AND
        boolean result17 = g < h || h > i;  // Relational operators before logical OR
        boolean result18 = !(g < h);       // NOT has higher precedence than relational operators
        
        System.out.println("g = " + g + ", h = " + h + ", i = " + i);
        System.out.println("g < h && h < i = " + result15 + " (relational operators before logical AND)");
        System.out.println("g < h && h > i = " + result16 + " (relational operators before logical AND)");
        System.out.println("g < h || h > i = " + result17 + " (relational operators before logical OR)");
        System.out.println("!(g < h) = " + result18 + " (NOT has higher precedence than relational operators)");
        System.out.println();
        
        // Example 8: Complex precedence examples
        System.out.println("Example 8: Complex precedence examples");
        int j = 2;
        int k = 3;
        int l = 4;
        
        int result19 = j + k * l - j * k + l / j;  // Following operator precedence rules
        // Evaluation: j + (k * l) - (j * k) + (l / j) = 2 + 12 - 6 + 2 = 10
        
        System.out.println("j = " + j + ", k = " + k + ", l = " + l);
        System.out.println("j + k * l - j * k + l / j = " + result19);
        System.out.println("Evaluation: j + (k * l) - (j * k) + (l / j) = 2 + 12 - 6 + 2 = 10");
        
        boolean result20 = j < k && k < l || j > l && k > j;  // Relational before logical AND, then logical OR
        // Evaluation: (j < k && k < l) || (j > l && k > j) = (true && true) || (false && true) = true || false = true
        
        System.out.println("j < k && k < l || j > l && k > j = " + result20);
        System.out.println("Evaluation: (j < k && k < l) || (j > l && k > j) = (true && true) || (false && true) = true || false = true");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Operator Precedence ---");
        System.out.println("1. During evaluation, operands are associated with operators according to operator precedence (CON-1.A.7)");
        System.out.println("2. Operator precedence determines the order in which operations are performed");
        System.out.println("3. Parentheses can be used to override the default precedence");
        System.out.println("4. Operators with higher precedence are evaluated before operators with lower precedence");
        System.out.println("5. For operators with the same precedence, evaluation is typically left to right");
        System.out.println("6. Assignment operators are right-associative (evaluated right to left)");
        System.out.println("7. Unary operators (like -, ++, --) have higher precedence than binary operators");
        System.out.println("8. Arithmetic operators (*, /, %) have higher precedence than arithmetic operators (+, -)");
        System.out.println("9. Arithmetic operators have higher precedence than relational operators (<, >, <=, >=, ==, !=)");
        System.out.println("10. Relational operators have higher precedence than logical operators (&&, ||)");
    }
}
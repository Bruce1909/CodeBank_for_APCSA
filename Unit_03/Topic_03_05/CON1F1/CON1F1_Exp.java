/**
 * CON1F1_Exp.java
 * 
 * This program demonstrates the logical operators in Java and their evaluation order.
 * Knowledge Point: CON-1.F.1 - Logical operators !(not), &&(and), and ||(or) are used with Boolean values.
 * This represents the order these operators will be evaluated.
 */
public class CON1F1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Logical Operators and Their Evaluation Order:\n");
        
        // Example 1: Basic logical operators
        System.out.println("Example 1: Basic logical operators");
        boolean a = true;
        boolean b = false;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("!a = " + !a + " (NOT operator)");
        System.out.println("!b = " + !b + " (NOT operator)");
        System.out.println("a && b = " + (a && b) + " (AND operator)");
        System.out.println("a || b = " + (a || b) + " (OR operator)");
        System.out.println();
        
        // Example 2: Combining logical operators
        System.out.println("Example 2: Combining logical operators");
        boolean c = true;
        boolean d = false;
        
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("!c && d = " + (!c && d) + " (NOT has higher precedence than AND)");
        System.out.println("c || !d = " + (c || !d) + " (NOT has higher precedence than OR)");
        System.out.println("!(c && d) = " + (!(c && d)) + " (Parentheses evaluated before NOT)");
        System.out.println();
        
        // Example 3: Operator precedence
        System.out.println("Example 3: Operator precedence");
        boolean p = true;
        boolean q = true;
        boolean r = false;
        
        System.out.println("p = " + p + ", q = " + q + ", r = " + r);
        
        // NOT has highest precedence, then AND, then OR
        boolean result1 = p || q && r;      // Equivalent to: p || (q && r)
        boolean result2 = (p || q) && r;    // Parentheses change precedence
        boolean result3 = !p || q && r;     // Equivalent to: (!p) || (q && r)
        boolean result4 = !(p || q) && r;   // Equivalent to: (!(p || q)) && r
        
        System.out.println("p || q && r = " + result1 + " (AND has higher precedence than OR)");
        System.out.println("(p || q) && r = " + result2 + " (Parentheses change precedence)");
        System.out.println("!p || q && r = " + result3 + " (NOT has highest precedence)");
        System.out.println("!(p || q) && r = " + result4 + " (Parentheses evaluated before NOT)");
        System.out.println();
        
        // Example 4: Truth tables for logical operators
        System.out.println("Example 4: Truth tables for logical operators");
        System.out.println("NOT (!) Truth Table:");
        System.out.println("!true = " + !true);
        System.out.println("!false = " + !false);
        System.out.println();
        
        System.out.println("AND (&&) Truth Table:");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));
        System.out.println();
        
        System.out.println("OR (||) Truth Table:");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Logical Operators ---");
        System.out.println("1. Logical operators !(not), &&(and), and ||(or) are used with Boolean values (CON-1.F.1)");
        System.out.println("2. The order of precedence is: ! (highest), && (middle), || (lowest)");
        System.out.println("3. The NOT operator (!) inverts a Boolean value");
        System.out.println("4. The AND operator (&&) returns true only if both operands are true");
        System.out.println("5. The OR operator (||) returns true if at least one operand is true");
        System.out.println("6. Parentheses can be used to change the order of evaluation");
    }
}
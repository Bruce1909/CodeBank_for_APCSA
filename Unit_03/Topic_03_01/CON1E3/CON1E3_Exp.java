/**
 * CON1E3_Exp.java
 * 
 * This program demonstrates how expressions involving relational operators evaluate to Boolean values.
 * Knowledge Point: CON-1.E.3 - An expression involving relational operators evaluates to a Boolean value.
 */
public class CON1E3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Boolean Evaluation of Relational Operators:\n");
        
        // Example 1: Basic relational expressions evaluating to boolean
        System.out.println("Example 1: Basic relational expressions evaluating to boolean");
        int a = 5;
        int b = 10;
        
        boolean result1 = a < b;      // Less than
        boolean result2 = a > b;      // Greater than
        boolean result3 = a == b;     // Equal to
        boolean result4 = a != b;     // Not equal to
        boolean result5 = a <= b;     // Less than or equal to
        boolean result6 = a >= b;     // Greater than or equal to
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a < b evaluates to: " + result1);   // true
        System.out.println("a > b evaluates to: " + result2);   // false
        System.out.println("a == b evaluates to: " + result3);  // false
        System.out.println("a != b evaluates to: " + result4);  // true
        System.out.println("a <= b evaluates to: " + result5);  // true
        System.out.println("a >= b evaluates to: " + result6);  // false
        System.out.println();
        
        // Example 2: Using relational expressions directly in if statements
        System.out.println("Example 2: Using relational expressions directly in if statements");
        
        if (a < b) {
            System.out.println("a is less than b");  // This will execute
        }
        
        if (a > b) {
            System.out.println("a is greater than b");  // This won't execute
        } else {
            System.out.println("a is not greater than b");  // This will execute
        }
        System.out.println();
        
        // Example 3: Using relational expressions in logical operations
        System.out.println("Example 3: Using relational expressions in logical operations");
        int c = 15;
        
        boolean andResult = (a < b) && (b < c);  // true AND true
        boolean orResult = (a > b) || (b < c);   // false OR true
        boolean notResult = !(a < b);            // NOT true
        
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("(a < b) && (b < c) evaluates to: " + andResult);  // true
        System.out.println("(a > b) || (b < c) evaluates to: " + orResult);   // true
        System.out.println("!(a < b) evaluates to: " + notResult);            // false
        System.out.println();
        
        // Example 4: Using relational expressions in conditional (ternary) operator
        System.out.println("Example 4: Using relational expressions in conditional operator");
        
        String message = (a < b) ? "a is less than b" : "a is not less than b";
        int max = (a > b) ? a : b;
        
        System.out.println("Conditional message: " + message);
        System.out.println("Maximum value: " + max);
        System.out.println();
        
        // Example 5: Using relational expressions in loops
        System.out.println("Example 5: Using relational expressions in loops");
        
        System.out.println("While loop using relational expression as condition:");
        int count = 1;
        while (count <= 5) {
            System.out.println("  Count: " + count);
            count++;
        }
        
        System.out.println("\nFor loop using relational expression as condition:");
        for (int i = 5; i > 0; i--) {
            System.out.println("  i: " + i);
        }
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Boolean Evaluation of Relational Operators ---");
        System.out.println("1. An expression involving relational operators evaluates to a Boolean value (CON-1.E.3)");
        System.out.println("2. Relational expressions can be used directly in if statements, loops, and conditional expressions");
        System.out.println("3. Relational expressions can be combined with logical operators (&&, ||, !)");
        System.out.println("4. The result of a relational expression can be stored in a boolean variable");
        System.out.println("5. Relational expressions are fundamental for controlling program flow");
    }
}
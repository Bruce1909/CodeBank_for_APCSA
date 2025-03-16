/**
 * CON1F1_Err.java
 * 
 * This program demonstrates common errors related to logical operators in Java.
 * Knowledge Point: CON-1.F.1 - Logical operators !(not), &&(and), and ||(or) are used with Boolean values.
 * This represents the order these operators will be evaluated.
 */
public class CON1F1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Logical Operators:\n");
        
        // Example 1: Using logical operators with non-boolean values
        System.out.println("Example 1: Using logical operators with non-boolean values");
        
        // Error 1: Using ! with non-boolean values
        // int num = 5;
        // boolean result = !num;  // Error: ! operator can only be applied to boolean
        System.out.println("Error 1: !num - The ! operator can only be applied to boolean values");
        
        // Error 2: Using && with non-boolean values
        // int a = 5;
        // int b = 10;
        // boolean result = a && b;  // Error: && operator can only be applied to boolean
        System.out.println("Error 2: a && b - The && operator can only be applied to boolean values");
        
        // Error 3: Using || with non-boolean values
        // String str1 = "hello";
        // String str2 = "world";
        // boolean result = str1 || str2;  // Error: || operator can only be applied to boolean
        System.out.println("Error 3: str1 || str2 - The || operator can only be applied to boolean values");
        System.out.println();
        
        // Example 2: Confusing logical operators with bitwise operators
        System.out.println("Example 2: Confusing logical operators with bitwise operators");
        
        // Error 4: Confusing & (bitwise AND) with && (logical AND)
        boolean x = true;
        boolean y = false;
        boolean result1 = x & y;  // This is bitwise AND, not logical AND
        boolean result2 = x && y; // This is logical AND
        
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x & y = " + result1 + " (bitwise AND - works but not short-circuited)");
        System.out.println("x && y = " + result2 + " (logical AND - short-circuited)");
        System.out.println("Error 4: Using & instead of && - both work with booleans but & doesn't short-circuit");
        
        // Error 5: Confusing | (bitwise OR) with || (logical OR)
        boolean result3 = x | y;  // This is bitwise OR, not logical OR
        boolean result4 = x || y; // This is logical OR
        
        System.out.println("x | y = " + result3 + " (bitwise OR - works but not short-circuited)");
        System.out.println("x || y = " + result4 + " (logical OR - short-circuited)");
        System.out.println("Error 5: Using | instead of || - both work with booleans but | doesn't short-circuit");
        System.out.println();
        
        // Example 3: Incorrect operator precedence
        System.out.println("Example 3: Incorrect operator precedence");
        
        boolean p = true;
        boolean q = false;
        boolean r = true;
        
        System.out.println("p = " + p + ", q = " + q + ", r = " + r);
        
        // Error 6: Assuming OR has higher precedence than AND
        boolean incorrectAssumption = p || q && r;  // This evaluates as: p || (q && r)
        boolean whatWasExpected = (p || q) && r;    // This is different
        
        System.out.println("p || q && r = " + incorrectAssumption);
        System.out.println("(p || q) && r = " + whatWasExpected);
        System.out.println("Error 6: Assuming OR has higher precedence than AND - AND actually has higher precedence");
        
        // Error 7: Forgetting that NOT has highest precedence
        boolean incorrectAssumption2 = !p || q;  // This evaluates as: (!p) || q
        boolean whatWasExpected2 = !(p || q);    // This is different
        
        System.out.println("!p || q = " + incorrectAssumption2);
        System.out.println("!(p || q) = " + whatWasExpected2);
        System.out.println("Error 7: Forgetting that NOT has highest precedence - use parentheses to clarify");
        System.out.println();
        
        // Example 4: Redundant or contradictory logical expressions
        System.out.println("Example 4: Redundant or contradictory logical expressions");
        
        // Error 8: Redundant expressions
        boolean redundant1 = p && true;    // Always same as p
        boolean redundant2 = q || false;   // Always same as q
        
        System.out.println("p && true = " + redundant1 + " (redundant - always same as p)");
        System.out.println("q || false = " + redundant2 + " (redundant - always same as q)");
        System.out.println("Error 8: Using redundant expressions - simplify your code");
        
        // Error 9: Contradictory expressions
        boolean contradiction1 = p && false;  // Always false
        boolean contradiction2 = q || true;   // Always true
        
        System.out.println("p && false = " + contradiction1 + " (contradiction - always false)");
        System.out.println("q || true = " + contradiction2 + " (contradiction - always true)");
        System.out.println("Error 9: Using contradictory expressions - these have constant results");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Logical Operator Errors ---");
        System.out.println("1. Logical operators !(not), &&(and), and ||(or) can only be used with Boolean values");
        System.out.println("2. Don't confuse logical operators (&&, ||) with bitwise operators (&, |)");
        System.out.println("3. Remember the precedence order: ! (highest), && (middle), || (lowest)");
        System.out.println("4. Use parentheses when in doubt about operator precedence");
        System.out.println("5. Avoid redundant or contradictory logical expressions");
    }
}
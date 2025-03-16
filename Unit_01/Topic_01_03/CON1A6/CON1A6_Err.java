/**
 * CON1A6_Err.java
 * 
 * This program demonstrates common errors related to compound expressions in Java.
 * Knowledge Point: CON-1.A.6 - Operators can be used to construct compound expressions.
 */
public class CON1A6_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Compound Expressions:\n");
        
        // Example 1: Operator precedence errors
        System.out.println("Example 1: Operator precedence errors");
        
        // Error 1: Misunderstanding operator precedence
        int a = 5;
        int b = 3;
        int c = 2;
        
        int result1 = a + b * c;  // Result is 11, not 16
        System.out.println("a + b * c = " + result1 + " (not 16, * has higher precedence than +)");
        
        // Error 2: Complex precedence confusion
        int result2 = a + b - c * a + b / c;  // Result is 3, not 5
        System.out.println("a + b - c * a + b / c = " + result2 + " (not 5, * and / have higher precedence)");
        System.out.println();
        
        // Example 2: Parentheses errors
        System.out.println("Example 2: Parentheses errors");
        
        // Error 3: Missing or misplaced parentheses
        // int result3 = (a + b * c;  // Error: Missing closing parenthesis
        System.out.println("Error 3: int result3 = (a + b * c; // Missing closing parenthesis");
        
        // Error 4: Unbalanced parentheses
        // int result4 = ((a + b) * c));  // Error: Unbalanced parentheses
        System.out.println("Error 4: int result4 = ((a + b) * c)); // Unbalanced parentheses");
        System.out.println();
        
        // Example 3: Assignment operator errors
        System.out.println("Example 3: Assignment operator errors");
        
        // Error 5: Using = instead of == for comparison
        int x = 10;
        // if (x = 5) {  // This assigns 5 to x, not compares x to 5
        //     System.out.println("This will always execute because (x = 5) evaluates to 5, which is non-zero");
        // }
        System.out.println("After if (x = 5), x = " + x + " (x was assigned 5, not compared to 5)");
        
        // Error 6: Confusing compound assignment operators
        int y = 10;
        // y =+ 5;  // This assigns +5 to y, not adds 5 to y
        y =+ 5;  // Equivalent to y = +5, not y += 5
        System.out.println("y =+ 5 results in y = " + y + " (assigns +5 to y, not adds 5 to y)");
        System.out.println();
        
        // Example 4: Increment/decrement operator errors
        System.out.println("Example 4: Increment/decrement operator errors");
        
        // Error 7: Confusing pre and post increment
        int i = 5;
        int j = 5;
        System.out.println("i = " + i + ", j = " + j);
        
        int preResult = ++i;  // i is incremented to 6, then assigned to preResult
        int postResult = j++; // j (5) is assigned to postResult, then j is incremented to 6
        
        System.out.println("preResult = ++i results in preResult = " + preResult + " and i = " + i);
        System.out.println("postResult = j++ results in postResult = " + postResult + " and j = " + j);
        System.out.println("These are not errors but are often confused");
        
        // Error 8: Multiple increments in same expression
        int k = 5;
        int result5 = k++ + k++;  // Undefined behavior in Java
        System.out.println("k = 5, result5 = k++ + k++ results in result5 = " + result5 + " and k = " + k);
        System.out.println("This is not recommended as it leads to confusing code");
        System.out.println();
        
        // Example 5: Type-related errors in compound expressions
        System.out.println("Example 5: Type-related errors in compound expressions");
        
        // Error 9: Type mismatch in compound expressions
        double d = 2.5;
        // int result6 = a + b * d;  // Error: Cannot convert from double to int without casting
        System.out.println("Error 9: int result6 = a + b * d; // Cannot convert from double to int without casting");
        
        // Error 10: Unexpected type promotion
        byte byte1 = 10;
        byte byte2 = 20;
        // byte byteResult = byte1 + byte2;  // Error: Cannot convert from int to byte without casting
        System.out.println("Error 10: byte byteResult = byte1 + byte2; // Cannot convert from int to byte without casting");
        System.out.println();
        
        // Example 6: Logical operator errors
        System.out.println("Example 6: Logical operator errors");
        
        // Error 11: Using & or | instead of && or ||
        boolean bool1 = true;
        boolean bool2 = false;
        
        if (bool1 & bool2) {  // Bitwise AND, not short-circuit logical AND
            System.out.println("This won't execute");
        }
        System.out.println("bool1 & bool2 = " + (bool1 & bool2) + " (bitwise AND, not logical AND)");
        
        // Error 12: Short-circuit evaluation misunderstanding
        int divisor = 0;
        // if (divisor != 0 && 10 / divisor > 2) {  // Safe due to short-circuit evaluation
        //     System.out.println("This is safe");
        // }
        
        // if (10 / divisor > 2 && divisor != 0) {  // Error: ArithmeticException - Division by zero
        //     System.out.println("This will cause an exception");
        // }
        System.out.println("Error 12: if (10 / divisor > 2 && divisor != 0) // ArithmeticException: Division by zero");
        System.out.println("Order matters in short-circuit evaluation");
        System.out.println();
        
        // Example 7: Conditional operator errors
        System.out.println("Example 7: Conditional operator errors");
        
        // Error 13: Missing colon in conditional operator
        // String result7 = (a > b) ? "a is greater" "b is greater or equal";  // Error: Missing colon
        System.out.println("Error 13: String result7 = (a > b) ? \"a is greater\" \"b is greater or equal\"; // Missing colon");
        
        // Error 14: Type mismatch in conditional operator branches
        // int result8 = (a > b) ? "a is greater" : 10;  // Error: Incompatible types
        System.out.println("Error 14: int result8 = (a > b) ? \"a is greater\" : 10; // Incompatible types");
        
        // Error 15: Overly complex nested conditional operators
        String result9 = (a > b) ? ((a > c) ? "a > b and a > c" : "a > b but a <= c") : 
                         ((b > c) ? "a <= b and b > c" : "a <= b and b <= c");
        System.out.println("Nested conditional: " + result9);
        System.out.println("This is not an error but can be hard to read and maintain");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Compound Expression Errors ---");
        System.out.println("1. Operator precedence must be carefully considered in compound expressions");
        System.out.println("2. Parentheses must be balanced and properly placed");
        System.out.println("3. Assignment (=) vs. equality comparison (==) is a common error");
        System.out.println("4. Compound assignment operators (+=, -=) are different from (=+, =-)");
        System.out.println("5. Pre-increment (++i) and post-increment (i++) behave differently in expressions");
        System.out.println("6. Multiple increments in the same expression can lead to confusing code");
        System.out.println("7. Type promotion in compound expressions can lead to type mismatch errors");
        System.out.println("8. Bitwise operators (&, |) vs. logical operators (&&, ||) have different behaviors");
        System.out.println("9. Short-circuit evaluation order matters for preventing exceptions");
        System.out.println("10. Conditional operator requires both ? and : and compatible branch types");
    }
}
/**
 * CON1B2_Err.java
 * 
 * This program demonstrates common errors related to expression evaluation in Java.
 * Knowledge Point: CON-1.B.2 - During execution, expressions are evaluated to produce a single value.
 */
public class CON1B2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Expression Evaluation:\n");
        
        // Example 1: Operator precedence errors
        System.out.println("Example 1: Operator precedence errors");
        
        // Error 1: Misunderstanding operator precedence
        int a = 10, b = 5, c = 2;
        int result = a + b * c;  // This is not an error, but often misunderstood
        
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("a + b * c = " + result);
        System.out.println("Common misconception: (a + b) * c = " + ((a + b) * c));
        System.out.println("Correct understanding: a + (b * c) = " + (a + (b * c)));
        System.out.println();
        
        // Example 2: Division and integer truncation
        System.out.println("Example 2: Division and integer truncation");
        
        // Error 2: Integer division truncation
        int division1 = 5 / 2;  // Result is 2, not 2.5 (truncated)
        
        System.out.println("5 / 2 = " + division1 + " (integer division truncates the decimal part)");
        System.out.println("To get 2.5, use: 5.0 / 2 = " + (5.0 / 2));
        System.out.println();
        
        // Example 3: String concatenation confusion
        System.out.println("Example 3: String concatenation confusion");
        
        // Error 3: Unexpected string concatenation results
        String result1 = 1 + 2 + " is three";  // Evaluates to "3 is three"
        String result2 = "The sum is " + 1 + 2;  // Evaluates to "The sum is 12"
        
        System.out.println("1 + 2 + \" is three\" = \"" + result1 + "\"");
        System.out.println("\"The sum is \" + 1 + 2 = \"" + result2 + "\"");
        System.out.println("To get \"The sum is 3\", use: \"The sum is \" + (1 + 2) = \"" + ("The sum is " + (1 + 2)) + "\"");
        System.out.println();
        
        // Example 4: Unintended type conversion
        System.out.println("Example 4: Unintended type conversion");
        
        // Error 4: Unexpected type conversion
        int i = 5;
        double d = 2.0;
        double result3 = i / 2 + d;  // i/2 is evaluated as integer division first
        
        System.out.println("i = " + i + ", d = " + d);
        System.out.println("i / 2 + d = " + result3 + " (i/2 is evaluated as integer division first)");
        System.out.println("Expected: 4.5, Actual: " + result3);
        System.out.println("To get 4.5, use: i / 2.0 + d = " + (i / 2.0 + d));
        System.out.println();
        
        // Example 5: Boolean expression short-circuit evaluation misunderstanding
        System.out.println("Example 5: Boolean expression short-circuit evaluation");
        
        // Error 5: Not understanding short-circuit evaluation
        boolean isValid = false;
        
        // The following would cause a NullPointerException if not for short-circuit evaluation
        String str = null;
        if (isValid && str.length() > 0) {  // str.length() is not evaluated due to short-circuit
            System.out.println("This won't execute");
        }
        
        System.out.println("isValid = " + isValid + ", str = null");
        System.out.println("if (isValid && str.length() > 0) doesn't throw NullPointerException");
        System.out.println("This is because && uses short-circuit evaluation");
        System.out.println();
        
        // Example 6: Unintended assignment in expressions
        System.out.println("Example 6: Unintended assignment in expressions");
        
        // Error 6: Using assignment instead of equality check
        int x = 10;
        // if (x = 5) {  // This assigns 5 to x and then evaluates to true (non-zero)
        //     System.out.println("This will always execute if x becomes non-zero");
        // }
        
        System.out.println("x = " + x);
        System.out.println("Error: if (x = 5) - Uses assignment instead of equality check");
        System.out.println("Correct: if (x == 5) - Uses equality operator for comparison");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Expression Evaluation Errors ---");
        System.out.println("1. Be aware of operator precedence rules to avoid unexpected results");
        System.out.println("2. Integer division truncates the decimal part");
        System.out.println("3. String concatenation evaluates from left to right");
        System.out.println("4. Be careful with mixed type expressions and implicit type conversions");
        System.out.println("5. Boolean expressions use short-circuit evaluation");
        System.out.println("6. Don't confuse assignment (=) with equality check (==) in expressions");
    }
}
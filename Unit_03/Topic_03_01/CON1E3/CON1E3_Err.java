/**
 * CON1E3_Err.java
 * 
 * This program demonstrates common errors when using expressions involving relational operators.
 * Knowledge Point: CON-1.E.3 - An expression involving relational operators evaluates to a Boolean value.
 */
public class CON1E3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Boolean Evaluation of Relational Operators:\n");
        
        // Example 1: Errors with non-boolean expressions in conditional statements
        System.out.println("Example 1: Errors with non-boolean expressions in conditional statements");
        
        // Error 1: Using non-boolean expressions in if statements
        int a = 5;
        
        // The following would be a compilation error in Java
        // if (a) {  // Error: incompatible types: int cannot be converted to boolean
        //     System.out.println("a is non-zero");
        // }
        
        System.out.println("Error 1: Using non-boolean expressions in if statements");
        System.out.println("  - if (a) is a compilation error in Java");
        System.out.println("  - Unlike C/C++, Java requires explicit boolean expressions");
        System.out.println("  - Correct way: if (a != 0) or if (a > 0)");
        System.out.println();
        
        // Example 2: Errors with assignment in conditional expressions
        System.out.println("Example 2: Errors with assignment in conditional expressions");
        
        // Error 2: Using assignment (=) instead of equality (==)
        int b = 10;
        boolean result = false;
        
        // The following would assign 20 to b and then evaluate to true (in some languages)
        // if (b = 20) {  // Error in Java for primitive types
        //     System.out.println("b is 20");
        // }
        
        // This error is more subtle with boolean variables
        if ((result = true)) {  // This is valid but likely not what was intended
            System.out.println("Error 2: Using assignment in conditional expressions");
            System.out.println("  - Original value of result: false");
            System.out.println("  - Current value of result: " + result + " (changed due to assignment)");
            System.out.println("  - if (result = true) assigns true to result, then evaluates to true");
            System.out.println("  - Likely intended: if (result == true) or simply if (result)");
        }
        System.out.println();
        
        // Example 3: Errors with operator precedence
        System.out.println("Example 3: Errors with operator precedence");
        
        // Error 3: Misunderstanding operator precedence
        int x = 5;
        int y = 10;
        int z = 15;
        
        // The following expression doesn't check if y is between x and z
        // boolean incorrectCheck = x < y < z;  // This is parsed as (x < y) < z, which is (true) < z
        
        System.out.println("Error 3: Misunderstanding operator precedence");
        System.out.println("  - x = " + x + ", y = " + y + ", z = " + z);
        System.out.println("  - x < y < z is parsed as (x < y) < z, which is (true) < z");
        System.out.println("  - This compiles but doesn't work as expected because true is converted to 1 for comparison");
        // System.out.println("  - Result of x < y < z: " + incorrectCheck);
        System.out.println("  - Correct way to check if y is between x and z: x < y && y < z");
        System.out.println();
        
        // Example 4: Errors with short-circuit evaluation
        System.out.println("Example 4: Errors with short-circuit evaluation");
        
        // Error 4: Not understanding short-circuit evaluation
        int divisor = 0;
        
        // The following would cause a division by zero error if not for short-circuit evaluation
        if (divisor != 0 && 10 / divisor > 2) {
            System.out.println("Result is greater than 2");
        } else {
            System.out.println("Error 4: Not understanding short-circuit evaluation");
            System.out.println("  - divisor = " + divisor);
            System.out.println("  - if (divisor != 0 && 10 / divisor > 2) works because of short-circuit evaluation");
            System.out.println("  - The second part is not evaluated when the first part is false");
            System.out.println("  - Reversing the order would cause a division by zero: if (10 / divisor > 2 && divisor != 0)");
        }
        System.out.println();
        
        // Example 5: Errors with comparing floating-point values
        System.out.println("Example 5: Errors with comparing floating-point values");
        
        // Error 5: Direct comparison of floating-point calculations
        double calculation = 0.1 + 0.2;  // 0.30000000000000004 in binary floating-point
        double expected = 0.3;
        
        if (calculation == expected) {
            System.out.println("Calculation equals expected");
        } else {
            System.out.println("Error 5: Direct comparison of floating-point calculations");
            System.out.println("  - calculation = 0.1 + 0.2 = " + calculation);
            System.out.println("  - expected = 0.3 = " + expected);
            System.out.println("  - calculation == expected is false due to floating-point precision");
            System.out.println("  - Better approach: Math.abs(calculation - expected) < epsilon");
            
            // Demonstrate the correct approach
            double epsilon = 0.0000001;
            boolean closeEnough = Math.abs(calculation - expected) < epsilon;
            System.out.println("  - Using epsilon comparison: " + closeEnough);
        }
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Boolean Evaluation Errors ---");
        System.out.println("1. Java requires explicit boolean expressions in conditional statements");
        System.out.println("2. Be careful not to use assignment (=) when equality comparison (==) is intended");
        System.out.println("3. Understand operator precedence and use parentheses when in doubt");
        System.out.println("4. Be aware of short-circuit evaluation in logical expressions");
        System.out.println("5. Use appropriate techniques for comparing floating-point values");
    }
}
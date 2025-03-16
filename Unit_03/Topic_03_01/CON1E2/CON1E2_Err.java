/**
 * CON1E2_Err.java
 * 
 * This program demonstrates common errors when comparing arithmetic expression values using relational operators.
 * Knowledge Point: CON-1.E.2 - Arithmetic expression values can be compared using relational operators (i.e., <, >, <=, >=).
 */
public class CON1E2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Comparing Arithmetic Expressions:\n");
        
        // Example 1: Errors with operator precedence
        System.out.println("Example 1: Errors with operator precedence");
        
        // Error 1: Misunderstanding operator precedence
        int a = 5;
        int b = 3;
        int c = 10;
        
        // The following expression doesn't check if a is between 1 and 10
        // It evaluates as: (a > 1) && (a < 10), which is correct
        boolean correctRange = a > 1 && a < 10;  // true
        
        // This is INCORRECT and doesn't check if a is between 1 and 10
        // It evaluates as: a > (1 && a) < 10, which is a syntax error
        // boolean incorrectRange = 1 < a < 10;  // Syntax error
        
        System.out.println("Error 1: Misunderstanding operator precedence");
        System.out.println("  - a = " + a);
        System.out.println("  - Correct way to check range: a > 1 && a < 10: " + correctRange);
        System.out.println("  - Incorrect way (syntax error): 1 < a < 10");
        System.out.println("  - Java doesn't support chained comparisons like in mathematics");
        System.out.println();
        
        // Example 2: Errors with floating-point comparison
        System.out.println("Example 2: Errors with floating-point comparison");
        
        // Error 2: Direct comparison of floating-point values
        double x = 0.1 + 0.2;  // Should be 0.3 but is actually 0.30000000000000004 due to binary representation
        double y = 0.3;
        
        // The following comparison might not work as expected
        if (x == y) {
            System.out.println("x equals y"); // This won't execute
        } else {
            System.out.println("Error 2: Direct comparison of floating-point values");
            System.out.println("  - x = 0.1 + 0.2 = " + x + " (not exactly 0.3 due to binary representation)");
            System.out.println("  - y = 0.3 = " + y);
            System.out.println("  - x == y is false even though mathematically they should be equal");
            System.out.println("  - Use an epsilon/tolerance for floating-point comparisons: Math.abs(x - y) < 0.0001");
        }
        System.out.println();
        
        // Example 3: Errors with assignment in conditions
        System.out.println("Example 3: Errors with assignment in conditions");
        
        // Error 3: Using assignment (=) instead of equality (==)
        int value = 5;
        
        // The following condition uses assignment instead of comparison
        // This assigns 10 to value and then evaluates value as a boolean
        // if (value = 10) {  // This would be a compilation error in Java for primitive types
        //     System.out.println("Value is 10");
        // }
        
        System.out.println("Error 3: Using assignment (=) instead of equality (==)");
        System.out.println("  - Original value: " + value);
        System.out.println("  - if (value = 10) is a compilation error for primitive types in Java");
        System.out.println("  - Use if (value == 10) for comparison");
        System.out.println();
        
        // Example 4: Errors with NaN comparisons
        System.out.println("Example 4: Errors with NaN comparisons");
        
        // Error 4: Comparing with NaN using relational operators
        double nan = Double.NaN;
        double number = 5.0;
        
        boolean nanGreater = nan > number;
        boolean nanLess = nan < number;
        boolean nanEqual = nan == number;
        boolean nanEqualToItself = nan == nan;
        
        System.out.println("Error 4: Comparing with NaN using relational operators");
        System.out.println("  - NaN > 5.0: " + nanGreater + " (always false)");
        System.out.println("  - NaN < 5.0: " + nanLess + " (always false)");
        System.out.println("  - NaN == 5.0: " + nanEqual + " (always false)");
        System.out.println("  - NaN == NaN: " + nanEqualToItself + " (always false)");
        System.out.println("  - Use Double.isNaN(x) to check if a value is NaN: " + Double.isNaN(nan));
        System.out.println();
        
        // Example 5: Errors with overflow in comparisons
        System.out.println("Example 5: Errors with overflow in comparisons");
        
        // Error 5: Overflow leading to unexpected comparison results
        int maxInt = Integer.MAX_VALUE;
        int overflowResult = maxInt + 1;  // This overflows to Integer.MIN_VALUE
        
        System.out.println("Error 5: Overflow leading to unexpected comparison results");
        System.out.println("  - Integer.MAX_VALUE: " + maxInt);
        System.out.println("  - Integer.MAX_VALUE + 1: " + overflowResult + " (overflows to negative)");
        System.out.println("  - (Integer.MAX_VALUE + 1) < 0: " + (overflowResult < 0) + " (true due to overflow)");
        System.out.println("  - Use long for larger ranges or check for potential overflow");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Comparing Arithmetic Expressions Errors ---");
        System.out.println("1. Java doesn't support chained comparisons (like 1 < x < 10)");
        System.out.println("2. Floating-point comparisons should use a tolerance/epsilon due to precision issues");
        System.out.println("3. Don't confuse assignment (=) with equality comparison (==)");
        System.out.println("4. NaN doesn't compare equal to any value, including itself");
        System.out.println("5. Be aware of integer overflow which can lead to unexpected comparison results");
    }
}
/**
 * CON1A8_Err.java
 * 
 * This program demonstrates common errors related to integer division by zero in Java.
 * Knowledge Point: CON-1.A.8 - An attempt to divide an integer by zero will result in an ArithmeticException to occur.
 */
public class CON1A8_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Integer Division by Zero:\n");
        
        // Example 1: Uncaught ArithmeticException
        System.out.println("Example 1: Uncaught ArithmeticException");
        
        // Error 1: Dividing by zero without exception handling
        // int result1 = 10 / 0;  // Error: ArithmeticException - Division by zero
        System.out.println("Error 1: int result1 = 10 / 0; // ArithmeticException: / by zero");
        System.out.println("This would crash the program if not commented out");
        System.out.println();
        
        // Example 2: Variable division errors
        System.out.println("Example 2: Variable division errors");
        
        // Error 2: Not checking for zero before division
        int a = 10;
        int b = 0;
        System.out.println("a = " + a + ", b = " + b);
        
        // int result2 = a / b;  // Error: ArithmeticException - Division by zero
        System.out.println("Error 2: int result2 = a / b; // ArithmeticException: / by zero");
        System.out.println("Always check if the divisor is zero before performing division");
        System.out.println();
        
        // Example 3: Modulus by zero errors
        System.out.println("Example 3: Modulus by zero errors");
        
        // Error 3: Attempting modulus by zero
        // int result3 = 10 % 0;  // Error: ArithmeticException - Division by zero
        System.out.println("Error 3: int result3 = 10 % 0; // ArithmeticException: / by zero");
        System.out.println("Modulus by zero also causes an ArithmeticException");
        System.out.println();
        
        // Example 4: Confusion with floating-point division
        System.out.println("Example 4: Confusion with floating-point division");
        
        // Error 4: Assuming integer division behaves like floating-point division
        double result4 = 10.0 / 0.0;  // Results in Infinity, not an exception
        System.out.println("Double division by zero: 10.0 / 0.0 = " + result4);
        System.out.println("Error 4: Assuming integer division behaves the same way (it doesn't)");
        
        // Error 5: Mixing integer and floating-point division
        double result5 = 10 / 0.0;  // Integer 10 is promoted to double, results in Infinity
        System.out.println("Mixed division by zero: 10 / 0.0 = " + result5);
        System.out.println("This works because 10 is promoted to double before division");
        
        // But this would fail:
        // int result6 = 10 / (int)0.0;  // Error: ArithmeticException - Division by zero
        System.out.println("Error 5: int result6 = 10 / (int)0.0; // ArithmeticException: / by zero");
        System.out.println();
        
        // Example 5: Division in complex expressions
        System.out.println("Example 5: Division in complex expressions");
        
        // Error 6: Hidden division by zero in expressions
        int c = 5;
        int d = 0;
        // int result7 = c * 2 / d + 10;  // Error: ArithmeticException - Division by zero
        System.out.println("Error 6: int result7 = c * 2 / d + 10; // ArithmeticException: / by zero");
        System.out.println("Division by zero in a complex expression still causes an exception");
        System.out.println();
        
        // Example 6: Logical errors in division
        System.out.println("Example 6: Logical errors in division");
        
        // Error 7: Incorrect conditional check
        int numerator = 10;
        int denominator = 0;
        
        // This condition is incorrect (reversed logic)
        if (denominator == 0) {
            // The following line would still cause an exception if not commented
            // int result8 = numerator / denominator;  // Error: ArithmeticException
            System.out.println("Error 7: Incorrect conditional check that still allows division by zero");
        } else {
            System.out.println("Safe division");
        }
        
        // Correct approach
        if (denominator != 0) {
            // Safe to divide
            System.out.println("Safe to divide: numerator / denominator");
        } else {
            System.out.println("Cannot divide by zero - avoiding the operation");
        }
        System.out.println();
        
        // Example 7: Exception handling errors
        System.out.println("Example 7: Exception handling errors");
        
        // Error 8: Catching the wrong exception type
        try {
            // The following line would cause ArithmeticException if not commented
            // int result9 = 10 / 0;
            System.out.println("Error 8: Catching the wrong exception type");
        } catch (NullPointerException e) {  // Wrong exception type
            System.out.println("This catch block will not execute for ArithmeticException");
        }
        // The correct approach would be to catch ArithmeticException
        
        // Error 9: Ignoring the exception
        try {
            // The following line would cause ArithmeticException if not commented
            // int result10 = 10 / 0;
            System.out.println("Error 9: Empty catch block that ignores the exception");
        } catch (ArithmeticException e) {
            // Empty catch block - ignoring the exception is generally bad practice
            // Should at least log the error or handle it appropriately
        }
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Integer Division by Zero Errors ---");
        System.out.println("1. Integer division by zero always causes an ArithmeticException");
        System.out.println("2. Integer modulus by zero also causes an ArithmeticException");
        System.out.println("3. Floating-point division by zero results in Infinity, not an exception");
        System.out.println("4. Always check for zero before performing integer division");
        System.out.println("5. Use try-catch blocks with the correct exception type (ArithmeticException)");
        System.out.println("6. Don't ignore exceptions - handle them appropriately");
        System.out.println("7. Be careful with complex expressions that might involve division by zero");
    }
}
/**
 * CON1A8_Exp.java
 * 
 * This program demonstrates that an attempt to divide an integer by zero will result in an ArithmeticException.
 * Knowledge Point: CON-1.A.8 - An attempt to divide an integer by zero will result in an ArithmeticException to occur.
 */
public class CON1A8_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating ArithmeticException with Integer Division by Zero:\n");
        
        // Example 1: Basic integer division by zero
        System.out.println("Example 1: Basic integer division by zero");
        try {
            System.out.println("Attempting to divide 10 by 0...");
            int result = 10 / 0;  // This will cause an ArithmeticException
            System.out.println("This line will not be executed");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            System.out.println("This demonstrates that integer division by zero causes an ArithmeticException");
        }
        System.out.println();
        
        // Example 2: Integer division by zero in expressions
        System.out.println("Example 2: Integer division by zero in expressions");
        try {
            int a = 5;
            int b = 0;
            System.out.println("a = " + a + ", b = " + b);
            System.out.println("Attempting to calculate a / b...");
            int result = a / b;  // This will cause an ArithmeticException
            System.out.println("This line will not be executed");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            System.out.println("This demonstrates that integer division by zero in variables also causes an exception");
        }
        System.out.println();
        
        // Example 3: Integer modulus by zero
        System.out.println("Example 3: Integer modulus by zero");
        try {
            System.out.println("Attempting to calculate 10 % 0...");
            int result = 10 % 0;  // This will also cause an ArithmeticException
            System.out.println("This line will not be executed");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            System.out.println("This demonstrates that integer modulus by zero also causes an ArithmeticException");
        }
        System.out.println();
        
        // Example 4: Contrast with floating-point division by zero
        System.out.println("Example 4: Contrast with floating-point division by zero");
        System.out.println("Attempting to divide 10.0 by 0.0 (double)...");
        double doubleResult = 10.0 / 0.0;  // This will NOT cause an exception, but will result in Infinity
        System.out.println("Result of 10.0 / 0.0 = " + doubleResult);
        System.out.println("Note that floating-point division by zero does NOT cause an ArithmeticException");
        System.out.println();
        
        // Example 5: Division by zero in complex expressions
        System.out.println("Example 5: Division by zero in complex expressions");
        try {
            int c = 10;
            int d = 5;
            int e = 0;
            System.out.println("c = " + c + ", d = " + d + ", e = " + e);
            System.out.println("Attempting to calculate c * d / e...");
            int result = c * d / e;  // This will cause an ArithmeticException
            System.out.println("This line will not be executed");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            System.out.println("This demonstrates that division by zero in complex expressions also causes an exception");
        }
        System.out.println();
        
        // Example 6: Preventing division by zero with conditional checks
        System.out.println("Example 6: Preventing division by zero with conditional checks");
        int numerator = 10;
        int denominator = 0;
        
        System.out.println("numerator = " + numerator + ", denominator = " + denominator);
        
        // Safe way to handle potential division by zero
        if (denominator != 0) {
            int safeResult = numerator / denominator;
            System.out.println("Result of division: " + safeResult);
        } else {
            System.out.println("Cannot divide by zero. Avoiding the operation.");
        }
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Integer Division by Zero ---");
        System.out.println("1. An attempt to divide an integer by zero will result in an ArithmeticException (CON-1.A.8)");
        System.out.println("2. Integer modulus (%) by zero also causes an ArithmeticException");
        System.out.println("3. Floating-point division by zero does NOT cause an exception (results in Infinity)");
        System.out.println("4. ArithmeticException is a runtime exception, not a compile-time error");
        System.out.println("5. Division by zero can be prevented with conditional checks");
        System.out.println("6. Try-catch blocks can be used to handle ArithmeticException");
    }
}
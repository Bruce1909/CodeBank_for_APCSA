/**
 * CON1C3_Err.java
 * 
 * This program demonstrates common errors related to automatic casting of int to double.
 * Knowledge Point: CON-1.C.3 - Some programming code causes int values to be automatically cast (widened) to double values.
 */
public class CON1C3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Automatic Casting of int to double:\n");
        
        // Example 1: Misunderstanding when automatic casting occurs
        System.out.println("Example 1: Misunderstanding when automatic casting occurs");
        
        // Error 1: Expecting automatic casting in integer division
        int a = 5;
        int b = 2;
        double result = a / b;  // Integer division happens first, then assignment to double
        
        System.out.println("int a = " + a + ", int b = " + b);
        System.out.println("double result = a / b; // Result: " + result);
        System.out.println("Error: Expected 2.5, but got 2.0 because integer division occurs before assignment");
        System.out.println("Correction: double result = (double) a / b; // Result: " + ((double) a / b));
        System.out.println();
        
        // Example 2: Confusion about automatic casting in expressions
        System.out.println("Example 2: Confusion about automatic casting in expressions");
        
        // Error 2: Misunderstanding order of operations and casting
        int c = 10;
        int d = 4;
        double expression1 = c / d * 2.5;  // Integer division happens first
        double expression2 = c / (d * 2.5);  // d is cast to double for multiplication
        double expression3 = c * 2.5 / d;  // c is cast to double for multiplication
        
        System.out.println("int c = " + c + ", int d = " + d);
        System.out.println("double expression1 = c / d * 2.5; // Result: " + expression1);
        System.out.println("Error: c / d performs integer division first (2), then multiplies by 2.5");
        System.out.println("double expression2 = c / (d * 2.5); // Result: " + expression2);
        System.out.println("Note: d is automatically cast to double for multiplication with 2.5");
        System.out.println("double expression3 = c * 2.5 / d; // Result: " + expression3);
        System.out.println("Note: c is automatically cast to double for multiplication with 2.5");
        System.out.println();
        
        // Example 3: Confusion with method overloading
        System.out.println("Example 3: Confusion with method overloading");
        
        // Error 3: Expecting automatic casting to resolve method overloading
        int value = 42;
        // printValue(value);  // This would call the int version, not the double version
        System.out.println("int value = " + value);
        System.out.println("printValue(value); // This would call the int version, not automatically cast to double");
        System.out.println("Error: Automatic casting doesn't occur for method overloading resolution");
        System.out.println("Correction: printValue((double) value); // Explicitly cast to call the double version");
        System.out.println();
        
        // Example 4: Confusion about automatic casting with compound assignment
        System.out.println("Example 4: Confusion about automatic casting with compound assignment");
        
        // Error 4: Misunderstanding compound assignment operators
        int e = 10;
        // e += 2.5;  // This would cause a compilation error
        System.out.println("int e = " + e);
        System.out.println("e += 2.5;  // This would cause a compilation error");
        System.out.println("Error: Compound assignment doesn't automatically cast the result back to the variable's type");
        System.out.println("Correction: e = (int) (e + 2.5); // Explicitly cast the result");
        System.out.println();
        
        // Example 5: Confusion about automatic casting with return values
        System.out.println("Example 5: Confusion about automatic casting with return values");
        
        // Error 5: Expecting automatic narrowing conversion
        double doubleValue = 3.75;
        // int intValue = returnDouble();  // This would cause a compilation error
        System.out.println("double doubleValue = 3.75;");
        System.out.println("int intValue = returnDouble();  // This would cause a compilation error");
        System.out.println("Error: Automatic casting only works for widening conversions (int to double), not narrowing (double to int)");
        System.out.println("Correction: int intValue = (int) returnDouble(); // Explicitly cast the return value");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Automatic Casting Errors ---");
        System.out.println("1. Automatic casting of int to double occurs in specific situations, not always");
        System.out.println("2. Integer division (int / int) is performed before any automatic casting to double");
        System.out.println("3. Automatic casting follows the order of operations in expressions");
        System.out.println("4. Method overloading resolution doesn't use automatic casting to select methods");
        System.out.println("5. Compound assignment operators don't automatically cast the result to the variable's type");
        System.out.println("6. Automatic casting only works for widening conversions (int to double), not narrowing (double to int)");
    }
    
    // Method overloading example
    public static void printValue(int value) {
        System.out.println("Int version: " + value);
    }
    
    public static void printValue(double value) {
        System.out.println("Double version: " + value);
    }
    
    // Method that returns a double
    public static double returnDouble() {
        return 3.75;
    }
}
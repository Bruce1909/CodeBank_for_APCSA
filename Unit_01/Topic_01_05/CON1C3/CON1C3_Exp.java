/**
 * CON1C3_Exp.java
 * 
 * This program demonstrates how int values are automatically cast (widened) to double values.
 * Knowledge Point: CON-1.C.3 - Some programming code causes int values to be automatically cast (widened) to double values.
 */
public class CON1C3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Automatic Casting of int to double:\n");
        
        // Example 1: Assignment of int to double variable
        System.out.println("Example 1: Assignment of int to double variable");
        int intValue = 42;
        double doubleValue = intValue;  // Automatic casting (widening)
        
        System.out.println("int intValue = " + intValue);
        System.out.println("double doubleValue = intValue; // Result: " + doubleValue);
        System.out.println("Note: No explicit cast is needed when assigning an int to a double variable");
        System.out.println();
        
        // Example 2: Mixed-type arithmetic operations
        System.out.println("Example 2: Mixed-type arithmetic operations");
        int a = 5;
        double b = 2.5;
        double result = a + b;  // a is automatically cast to double before addition
        
        System.out.println("int a = " + a);
        System.out.println("double b = " + b);
        System.out.println("double result = a + b; // Result: " + result);
        System.out.println("Note: When an int and a double are used in an arithmetic operation, the int is automatically cast to double");
        System.out.println();
        
        // Example 3: Method parameters
        System.out.println("Example 3: Method parameters");
        int c = 10;
        System.out.println("int c = " + c);
        System.out.println("Calling printDouble(c): ");
        printDouble(c);  // c is automatically cast to double when passed to the method
        System.out.println();
        
        // Example 4: Return values
        System.out.println("Example 4: Return values");
        int d = 7;
        double returnedValue = getDoubleValue(d);  // Return value is automatically cast
        
        System.out.println("int d = " + d);
        System.out.println("double returnedValue = getDoubleValue(d); // Result: " + returnedValue);
        System.out.println("Note: The int value is automatically cast to double when returned from the method");
        System.out.println();
        
        // Example 5: Mathematical functions
        System.out.println("Example 5: Mathematical functions");
        int angle = 45;
        double sinValue = Math.sin(angle);  // angle is automatically cast to double
        
        System.out.println("int angle = " + angle);
        System.out.println("double sinValue = Math.sin(angle); // Result: " + sinValue);
        System.out.println("Note: The int value is automatically cast to double when passed to Math.sin()");
        System.out.println();
        
        // Example 6: Division with mixed types
        System.out.println("Example 6: Division with mixed types");
        int numerator = 10;
        double denominator = 4.0;
        double quotient = numerator / denominator;  // numerator is automatically cast
        
        System.out.println("int numerator = " + numerator);
        System.out.println("double denominator = " + denominator);
        System.out.println("double quotient = numerator / denominator; // Result: " + quotient);
        System.out.println("Note: When dividing an int by a double, the int is automatically cast to double");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Automatic Casting of int to double ---");
        System.out.println("1. Some programming code causes int values to be automatically cast (widened) to double values (CON-1.C.3)");
        System.out.println("2. Automatic casting occurs when assigning an int to a double variable");
        System.out.println("3. In mixed-type arithmetic operations, int values are automatically cast to double");
        System.out.println("4. When passing an int to a method that expects a double parameter, automatic casting occurs");
        System.out.println("5. When using an int with mathematical functions that expect double, automatic casting occurs");
        System.out.println("6. No explicit cast is needed for widening conversions (int to double)");
    }
    
    // Method that takes a double parameter
    public static void printDouble(double value) {
        System.out.println("Received value in printDouble method: " + value);
    }
    
    // Method that returns a double value
    public static double getDoubleValue(int value) {
        return value;  // int is automatically cast to double when returned
    }
}
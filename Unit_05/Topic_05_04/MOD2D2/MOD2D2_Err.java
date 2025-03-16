/**
 * MOD2D2_Err.java
 * This program demonstrates common errors related to non-void methods (MOD-2.D.2).
 * 
 * @author AP CSA
 */
public class MOD2D2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to non-void methods:\n");
        
        // ERROR 1: Missing return statement in a non-void method
        System.out.println("ERROR 1: Missing return statement in a non-void method");
        System.out.println("The following method would cause a compilation error if uncommented:");
        /*
        public int missingReturn() {
            int x = 5;
            // No return statement - compilation error
        }
        */
        System.out.println("Non-void methods must have a return statement that returns a value\n");
        
        // ERROR 2: Return type mismatch
        System.out.println("ERROR 2: Return type mismatch");
        CalculatorWithErrors calculator = new CalculatorWithErrors();
        
        try {
            System.out.println("Calling a method with incorrect return type:");
            int result = calculator.addWithTypeError(5, 3);
            System.out.println("Result: " + result); // This line won't execute
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("The method tries to return a double when an int is expected\n");
        }
        
        // ERROR 3: Not using the return value
        System.out.println("ERROR 3: Not using the return value");
        System.out.println("Calling add(5, 3) but ignoring the return value:");
        calculator.add(5, 3); // Return value is ignored
        System.out.println("The return value was calculated but not used\n");
        
        // ERROR 4: Conditional return statements missing paths
        System.out.println("ERROR 4: Conditional return statements missing paths");
        try {
            System.out.println("Calling a method with missing return paths:");
            String message = calculator.getIncompleteMessage(0);
            System.out.println("Message: " + message); // This might not execute
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("The method might not return a value for all code paths\n");
        }
        
        // ERROR 5: Confusing void and non-void methods
        System.out.println("ERROR 5: Confusing void and non-void methods");
        System.out.println("The following line would cause a compilation error if uncommented:");
        // int value = calculator.printMessage(); // Error: void cannot be converted to int
        System.out.println("Void methods don't return values and can't be used in expressions\n");
        
        System.out.println("Key points about non-void method errors:");
        System.out.println("- Non-void methods must return a value of the declared type");
        System.out.println("- All code paths in a non-void method must return a value");
        System.out.println("- Return values should be used appropriately");
        System.out.println("- Void methods cannot be used where a value is expected");
        System.out.println("- The return type in the method header must match the actual returned value");
    }
}

/**
 * A calculator class with errors related to non-void methods.
 */
class CalculatorWithErrors {
    /**
     * Correctly adds two integers and returns the sum.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b; // Correct return statement
    }
    
    /**
     * ERROR: Return type mismatch.
     * The method header declares an int return type,
     * but the method tries to return a double.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return should be an int, but tries to return a double
     */
    public int addWithTypeError(int a, int b) {
        double result = a + b;
        // This would cause a compilation error if not cast to int
        // return result; // Error: incompatible types: double cannot be converted to int
        
        // For demonstration purposes, we'll throw an exception instead
        throw new RuntimeException("Method tried to return a double when int was expected");
    }
    
    /**
     * ERROR: Missing return paths.
     * This method doesn't return a value for all possible code paths.
     * 
     * @param value a test value
     * @return a message based on the value
     */
    public String getIncompleteMessage(int value) {
        if (value > 0) {
            return "Positive value";
        } else if (value < 0) {
            return "Negative value";
        }
        // Missing return statement for value == 0
        // This would cause a compilation error
        
        // For demonstration purposes, we'll throw an exception
        throw new RuntimeException("Method missing return statement for value == 0");
    }
    
    /**
     * A void method that doesn't return a value.
     */
    public void printMessage() {
        System.out.println("This is a void method that doesn't return a value");
        // No return statement needed for void methods
    }
    
    /**
     * ERROR: Attempting to return a value from a void method.
     * This would cause a compilation error if uncommented.
     */
    public void printMessageWithError() {
        System.out.println("This is a void method");
        // return "Error"; // Error: incompatible types: unexpected return value
    }
}
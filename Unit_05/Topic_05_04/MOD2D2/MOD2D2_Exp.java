/**
 * MOD2D2_Exp.java
 * This program demonstrates non-void methods that return a single value (MOD-2.D.2).
 * 
 * @author AP CSA
 */
public class MOD2D2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating non-void methods in Java:\n");
        
        // Example 1: Non-void method returning an int
        System.out.println("Example 1: Non-void method returning an int");
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 3);
        System.out.println("5 + 3 = " + sum);
        System.out.println("Method header: public int add(int a, int b)");
        System.out.println("Return type: int\n");
        
        // Example 2: Non-void method returning a double
        System.out.println("Example 2: Non-void method returning a double");
        double average = calculator.calculateAverage(10, 20, 30);
        System.out.println("Average of 10, 20, 30 = " + average);
        System.out.println("Method header: public double calculateAverage(int a, int b, int c)");
        System.out.println("Return type: double\n");
        
        // Example 3: Non-void method returning a boolean
        System.out.println("Example 3: Non-void method returning a boolean");
        boolean isEven = calculator.isEven(42);
        System.out.println("Is 42 even? " + isEven);
        System.out.println("Method header: public boolean isEven(int number)");
        System.out.println("Return type: boolean\n");
        
        // Example 4: Non-void method returning a String
        System.out.println("Example 4: Non-void method returning a String");
        String message = calculator.getStatusMessage();
        System.out.println("Status message: " + message);
        System.out.println("Method header: public String getStatusMessage()");
        System.out.println("Return type: String\n");
        
        System.out.println("Key points about non-void methods:");
        System.out.println("- Non-void methods must specify a return type in the method header");
        System.out.println("- The return type replaces the 'void' keyword in the method header");
        System.out.println("- Non-void methods must return a value compatible with the declared return type");
        System.out.println("- The returned value can be used in expressions or stored in variables");
        System.out.println("- Return types can be primitive data types or reference types");
    }
}

/**
 * A calculator class with various non-void methods.
 */
class Calculator {
    private boolean ready = true;
    
    /**
     * Adds two integers and returns the sum.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b; // Returns an int value
    }
    
    /**
     * Calculates the average of three integers.
     * 
     * @param a the first integer
     * @param b the second integer
     * @param c the third integer
     * @return the average as a double
     */
    public double calculateAverage(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0; // Returns a double value
    }
    
    /**
     * Checks if a number is even.
     * 
     * @param number the number to check
     * @return true if the number is even, false otherwise
     */
    public boolean isEven(int number) {
        return number % 2 == 0; // Returns a boolean value
    }
    
    /**
     * Returns a status message.
     * 
     * @return a status message as a String
     */
    public String getStatusMessage() {
        if (ready) {
            return "Calculator is ready"; // Returns a String value
        } else {
            return "Calculator is not ready";
        }
    }
}
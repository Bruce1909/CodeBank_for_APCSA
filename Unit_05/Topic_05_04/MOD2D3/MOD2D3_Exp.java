/**
 * MOD2D3_Exp.java
 * This program demonstrates how non-void methods return a copy of a value (MOD-2.D.3).
 * This is referred to as "return by value."
 * 
 * @author AP CSA
 */
public class MOD2D3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating return by value in Java:\n");
        
        // Example 1: Returning a primitive value
        System.out.println("Example 1: Returning a primitive value");
        NumberProcessor processor = new NumberProcessor();
        
        int number = 10;
        System.out.println("Original number: " + number);
        
        int result = processor.doubleValue(number);
        System.out.println("Result from doubleValue(): " + result);
        System.out.println("Original number after method call: " + number);
        System.out.println("The original value is unchanged because a copy was returned\n");
        
        // Example 2: Returning a calculated value
        System.out.println("Example 2: Returning a calculated value");
        double celsius = 25.0;
        System.out.println("Temperature in Celsius: " + celsius);
        
        double fahrenheit = processor.celsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println("The method returned a new value calculated from the input\n");
        
        // Example 3: Returning a copy of an instance variable
        System.out.println("Example 3: Returning a copy of an instance variable");
        System.out.println("Counter initial value: " + processor.getCounter());
        
        int counterValue = processor.getCounter();
        counterValue = 100; // Modifying the local copy
        
        System.out.println("Modified local copy: " + counterValue);
        System.out.println("Counter value in object: " + processor.getCounter());
        System.out.println("The instance variable is unchanged because a copy was returned\n");
        
        System.out.println("Key points about return by value:");
        System.out.println("- Java returns a copy of the value, not the original value itself");
        System.out.println("- Changes to the returned copy do not affect the original value");
        System.out.println("- This applies to all primitive data types (int, double, boolean, etc.)");
        System.out.println("- The returned value can be used in expressions or stored in variables");
        System.out.println("- Return by value helps maintain encapsulation and data integrity");
    }
}

/**
 * A class that demonstrates returning values from methods.
 */
class NumberProcessor {
    private int counter = 1;
    
    /**
     * Returns twice the value of the input number.
     * Demonstrates returning a calculated primitive value.
     * 
     * @param value the input value
     * @return twice the input value
     */
    public int doubleValue(int value) {
        return value * 2; // Returns a copy of the calculated value
    }
    
    /**
     * Converts a temperature from Celsius to Fahrenheit.
     * Demonstrates returning a calculated double value.
     * 
     * @param celsius the temperature in Celsius
     * @return the temperature in Fahrenheit
     */
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9/5 + 32; // Returns a copy of the calculated value
    }
    
    /**
     * Returns the current counter value.
     * Demonstrates returning a copy of an instance variable.
     * 
     * @return a copy of the counter value
     */
    public int getCounter() {
        return counter; // Returns a copy of the counter value, not the counter itself
    }
}
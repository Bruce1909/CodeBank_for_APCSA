/**
 * CON1D2_Exp.java
 * 
 * This program demonstrates that the Math class contains only static methods.
 * Knowledge Point: CON-1.D.2 - The Math class contains only static methods.
 */
public class CON1D2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating that Math class contains only static methods:\n");
        
        // Example 1: Using Math methods without creating an instance
        System.out.println("Example 1: Using Math methods without creating an instance");
        double number = 25.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Math.sqrt(" + number + ") = " + squareRoot);
        System.out.println("Notice that we call Math.sqrt() directly on the class, not on an instance");
        System.out.println();
        
        // Example 2: Examining the Math class structure
        System.out.println("Example 2: Examining the Math class structure");
        System.out.println("The Math class has a private constructor to prevent instantiation");
        System.out.println("All methods in Math class are declared as 'public static'");
        System.out.println("This means they belong to the class itself, not to instances of the class");
        System.out.println();
        
        // Example 3: Using multiple Math methods
        System.out.println("Example 3: Using multiple Math methods");
        double value = -15.7;
        System.out.println("Original value: " + value);
        System.out.println("Math.abs(value): " + Math.abs(value));
        System.out.println("Math.ceil(value): " + Math.ceil(value));
        System.out.println("Math.floor(value): " + Math.floor(value));
        System.out.println("Math.round(value): " + Math.round(value));
        System.out.println("All these methods are static and called directly on the Math class");
        System.out.println();
        
        // Example 4: Static constants in Math class
        System.out.println("Example 4: Static constants in Math class");
        System.out.println("Math.PI = " + Math.PI);
        System.out.println("Math.E = " + Math.E);
        System.out.println("These constants are also static and accessed directly through the class");
        System.out.println();
        
        // Example 5: Comparing with instance methods
        System.out.println("Example 5: Comparing with instance methods");
        String text = "Hello";
        System.out.println("String instance method: text.length() = " + text.length());
        System.out.println("Math static method: Math.abs(-10) = " + Math.abs(-10));
        System.out.println("The difference is that instance methods are called on objects,");
        System.out.println("while static methods are called on the class itself.");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Math Class Static Methods ---");
        System.out.println("1. The Math class contains only static methods (CON-1.D.2)");
        System.out.println("2. Static methods are called directly on the class, not on instances");
        System.out.println("3. You cannot create instances of the Math class (it has a private constructor)");
        System.out.println("4. The Math class also contains static constants like PI and E");
        System.out.println("5. Static methods belong to the class itself, not to objects of the class");
    }
}
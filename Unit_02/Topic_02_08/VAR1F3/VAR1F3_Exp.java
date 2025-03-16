/**
 * VAR1F3_Exp - Double Methods and Constructors Example
 * 
 * This program demonstrates VAR-1.F.3:
 * The Double methods and constructors that are part of the Java Quick Reference.
 */
public class VAR1F3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.F.3: Double methods and constructors\n");
        
        // Example 1: Double constructor
        System.out.println("Example 1: Double constructor");
        // Note: Double constructors are deprecated in newer Java versions
        // but are still part of the AP exam Java Quick Reference
        Double num1 = new Double(3.14159);  // Constructs a new Double object
        System.out.println("Double constructed with value 3.14159: " + num1);
        
        // You can also create Double objects from String representations
        Double num2 = new Double("2.71828");  // Constructs Double from String
        System.out.println("Double constructed from String \"2.71828\": " + num2);
        System.out.println();
        
        // Example 2: doubleValue() method
        System.out.println("Example 2: doubleValue() method");
        double primitiveDouble = num1.doubleValue();  // Converts Double to double
        System.out.println("Original Double object: " + num1);
        System.out.println("Primitive double from doubleValue(): " + primitiveDouble);
        
        // Demonstrating that doubleValue() returns a primitive
        System.out.println("num1 is an object: " + (num1 instanceof Object));
        System.out.println("primitiveDouble is a primitive, not an object");
        System.out.println();
        
        // Example 3: Alternative ways to create Double objects
        System.out.println("Example 3: Alternative ways to create Double objects");
        
        // Using valueOf method (preferred in modern Java)
        Double num3 = Double.valueOf(1.618);
        System.out.println("Double created with valueOf(1.618): " + num3);
        
        // Using autoboxing (simplest way in modern Java)
        Double num4 = 9.81;  // Autoboxing: primitive double to Double
        System.out.println("Double created with autoboxing: " + num4);
        System.out.println();
        
        // Example 4: Practical uses of Double methods
        System.out.println("Example 4: Practical uses of Double methods");
        
        // Using doubleValue() for arithmetic operations
        double result = primitiveDouble * 2;
        System.out.println("Arithmetic with primitive: " + primitiveDouble + " * 2 = " + result);
        
        // Other useful Double methods (not in AP exam reference but good to know)
        System.out.println("\nOther useful Double methods:");
        System.out.println("Double.parseDouble(\"123.456\"): " + Double.parseDouble("123.456"));
        System.out.println("Double.toString(3.14159): " + Double.toString(3.14159));
        System.out.println("Double.isNaN(0.0/0.0): " + Double.isNaN(0.0/0.0));
        System.out.println("Double.isInfinite(1.0/0.0): " + Double.isInfinite(1.0/0.0));
        
        // Special Double values
        System.out.println("\nSpecial Double values:");
        System.out.println("Double.NaN: " + Double.NaN);
        System.out.println("Double.POSITIVE_INFINITY: " + Double.POSITIVE_INFINITY);
        System.out.println("Double.NEGATIVE_INFINITY: " + Double.NEGATIVE_INFINITY);
        
        // Summary
        System.out.println("\n--- Key Points about Double Methods and Constructors ---");
        System.out.println("1. Double(double value) - Constructor that creates a Double object");
        System.out.println("2. doubleValue() - Converts a Double object to a primitive double");
        System.out.println("3. These methods are part of the AP exam Java Quick Reference");
        System.out.println("4. Modern Java prefers valueOf() or autoboxing over constructors");
    }
}
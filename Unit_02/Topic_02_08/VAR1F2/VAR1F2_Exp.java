/**
 * VAR1F2_Exp - Integer Methods and Constructors Example
 * 
 * This program demonstrates VAR-1.F.2:
 * The Integer methods and constructors that are part of the Java Quick Reference.
 */
public class VAR1F2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.F.2: Integer methods and constructors\n");
        
        // Example 1: Integer constructor
        System.out.println("Example 1: Integer constructor");
        // Note: Integer constructors are deprecated in newer Java versions
        // but are still part of the AP exam Java Quick Reference
        Integer num1 = new Integer(42);  // Constructs a new Integer object
        System.out.println("Integer constructed with value 42: " + num1);
        
        // You can also create Integer objects from String representations
        Integer num2 = new Integer("100");  // Constructs Integer from String
        System.out.println("Integer constructed from String \"100\": " + num2);
        System.out.println();
        
        // Example 2: Integer.MIN_VALUE constant
        System.out.println("Example 2: Integer.MIN_VALUE constant");
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("This is the minimum value that can be represented by an int or Integer: -2^31");
        
        // Demonstrating use of MIN_VALUE
        if (num1 > Integer.MIN_VALUE) {
            System.out.println(num1 + " is greater than the minimum possible Integer value");
        }
        System.out.println();
        
        // Example 3: Integer.MAX_VALUE constant
        System.out.println("Example 3: Integer.MAX_VALUE constant");
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("This is the maximum value that can be represented by an int or Integer: 2^31 - 1");
        
        // Demonstrating use of MAX_VALUE
        if (num2 < Integer.MAX_VALUE) {
            System.out.println(num2 + " is less than the maximum possible Integer value");
        }
        System.out.println();
        
        // Example 4: intValue() method
        System.out.println("Example 4: intValue() method");
        int primitiveInt = num1.intValue();  // Converts Integer to int
        System.out.println("Original Integer object: " + num1);
        System.out.println("Primitive int from intValue(): " + primitiveInt);
        
        // Demonstrating that intValue() returns a primitive
        System.out.println("num1 is an object: " + (num1 instanceof Object));
        System.out.println("primitiveInt is a primitive, not an object");
        System.out.println();
        
        // Example 5: Practical uses of these methods and constants
        System.out.println("Example 5: Practical uses of these methods and constants");
        
        // Using intValue() for arithmetic operations
        int result = primitiveInt * 2;
        System.out.println("Arithmetic with primitive: " + primitiveInt + " * 2 = " + result);
        
        // Checking for overflow
        System.out.println("\nChecking for potential overflow:");
        int largeValue = Integer.MAX_VALUE;
        System.out.println("Current value: " + largeValue);
        
        // This will cause overflow
        System.out.println("After adding 1: " + (largeValue + 1));
        System.out.println("This demonstrates overflow - the result wraps around to a negative number");
        System.out.println("because it exceeds Integer.MAX_VALUE");
        
        // Summary
        System.out.println("\n--- Key Points about Integer Methods and Constants ---");
        System.out.println("1. Integer(int value) - Constructor that creates an Integer object");
        System.out.println("2. Integer.MIN_VALUE - The minimum value for an int/Integer: " + Integer.MIN_VALUE);
        System.out.println("3. Integer.MAX_VALUE - The maximum value for an int/Integer: " + Integer.MAX_VALUE);
        System.out.println("4. intValue() - Converts an Integer object to a primitive int");
    }
}
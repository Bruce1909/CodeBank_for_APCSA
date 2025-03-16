/**
 * VAR1F3_Err - Double Methods and Constructors Error Example
 * 
 * This program demonstrates common errors related to VAR-1.F.3:
 * The Double methods and constructors that are part of the Java Quick Reference.
 */
public class VAR1F3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to VAR-1.F.3\n");
        
        // ERROR 1: Misunderstanding Double constructor deprecation
        System.out.println("ERROR 1: Misunderstanding Double constructor deprecation");
        System.out.println("Double constructors are deprecated in newer Java versions");
        System.out.println("but are still part of the AP exam Java Quick Reference");
        
        // Showing the deprecated constructor (still valid for AP exam)
        Double num1 = new Double(3.14);
        System.out.println("Using deprecated constructor: " + num1);
        
        // Better modern alternatives
        System.out.println("Modern alternatives:");
        System.out.println("- Double.valueOf(3.14): " + Double.valueOf(3.14));
        System.out.println("- Autoboxing: Double num = 3.14");
        System.out.println();
        
        // ERROR 2: Confusion with parsing String to Double
        System.out.println("ERROR 2: Confusion with parsing String to Double");
        
        try {
            // This will throw NumberFormatException
            Double invalidDouble = new Double("3.14.15");  // Invalid format
            System.out.println("This won't print: " + invalidDouble);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Cannot parse '3.14.15' to a Double");
            System.out.println("Correct format example: new Double(\"3.14\")");
        }
        System.out.println();
        
        // ERROR 3: Misusing doubleValue() method
        System.out.println("ERROR 3: Misusing doubleValue() method");
        
        // Unnecessary use of doubleValue()
        Double num2 = new Double(2.718);
        double primitiveDouble = num2.doubleValue();  // Explicit unboxing
        double result = primitiveDouble + 1.0;
        
        System.out.println("Unnecessarily verbose code:");
        System.out.println("Double num2 = new Double(2.718);");
        System.out.println("double primitiveDouble = num2.doubleValue();  // Explicit unboxing");
        System.out.println("double result = primitiveDouble + 1.0;");
        
        System.out.println("\nMore concise with automatic unboxing:");
        System.out.println("Double num2 = 2.718;  // Using autoboxing");
        System.out.println("double result = num2 + 1.0;  // Automatic unboxing");
        System.out.println();
        
        // ERROR 4: NullPointerException with doubleValue()
        System.out.println("ERROR 4: NullPointerException with doubleValue()");
        
        Double nullDouble = null;
        try {
            // This will throw NullPointerException
            double value = nullDouble.doubleValue();
            System.out.println("Value: " + value);  // This line won't execute
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot call doubleValue() on null Double");
        }
        System.out.println();
        
        // ERROR 5: Confusion with special Double values
        System.out.println("ERROR 5: Confusion with special Double values");
        
        double infinity = 1.0 / 0.0;
        double nan = 0.0 / 0.0;
        
        System.out.println("Division by zero with doubles doesn't throw exceptions:");
        System.out.println("1.0 / 0.0 = " + infinity + " (POSITIVE_INFINITY)");
        System.out.println("0.0 / 0.0 = " + nan + " (NaN - Not a Number)");
        
        // Common mistake with NaN comparison
        System.out.println("\nCommon mistake with NaN comparison:");
        System.out.println("nan == nan: " + (nan == nan) + " (Always false!)");
        System.out.println("Correct way: Double.isNaN(nan): " + Double.isNaN(nan));
        
        // Summary
        System.out.println("\n--- Common Errors with Double Methods and Constructors ---");
        System.out.println("1. Not knowing that Double constructors are deprecated but still in AP exam");
        System.out.println("2. Trying to parse invalid String formats to Double");
        System.out.println("3. Using doubleValue() unnecessarily when automatic unboxing would work");
        System.out.println("4. Calling methods on null Double objects");
        System.out.println("5. Incorrect handling of special values like NaN and INFINITY");
    }
}
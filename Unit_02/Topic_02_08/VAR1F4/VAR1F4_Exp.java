/**
 * VAR1F4_Exp - Autoboxing Example
 * 
 * This program demonstrates VAR-1.F.4:
 * Autoboxing is the automatic conversion that the Java compiler makes between
 * primitive types and their corresponding object wrapper classes.
 */
public class VAR1F4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.F.4: Autoboxing\n");
        
        // Example 1: Basic autoboxing with Integer
        System.out.println("Example 1: Basic autoboxing with Integer");
        
        // Without autoboxing (old way)
        Integer num1 = new Integer(42);  // Explicitly creating Integer object
        System.out.println("Without autoboxing: Integer num1 = new Integer(42); // num1 = " + num1);
        
        // With autoboxing (modern way)
        Integer num2 = 42;  // Primitive int automatically converted to Integer
        System.out.println("With autoboxing: Integer num2 = 42; // num2 = " + num2);
        System.out.println();
        
        // Example 2: Basic autoboxing with Double
        System.out.println("Example 2: Basic autoboxing with Double");
        
        // Without autoboxing (old way)
        Double dbl1 = new Double(3.14);  // Explicitly creating Double object
        System.out.println("Without autoboxing: Double dbl1 = new Double(3.14); // dbl1 = " + dbl1);
        
        // With autoboxing (modern way)
        Double dbl2 = 3.14;  // Primitive double automatically converted to Double
        System.out.println("With autoboxing: Double dbl2 = 3.14; // dbl2 = " + dbl2);
        System.out.println();
        
        // Example 3: Autoboxing in expressions
        System.out.println("Example 3: Autoboxing in expressions");
        
        // Primitive values in expressions with wrapper objects
        Integer sum = 10 + num2;  // 10 is autoboxed, then addition occurs, then result is autoboxed
        System.out.println("Integer sum = 10 + num2; // sum = " + sum);
        
        Double product = 2.5 * dbl2;  // 2.5 is autoboxed, then multiplication occurs, then result is autoboxed
        System.out.println("Double product = 2.5 * dbl2; // product = " + product);
        System.out.println();
        
        // Example 4: Autoboxing with other primitive types
        System.out.println("Example 4: Autoboxing with other primitive types");
        
        // Boolean autoboxing
        Boolean flag = true;  // Primitive boolean to Boolean
        System.out.println("Boolean flag = true; // flag = " + flag);
        
        // Character autoboxing
        Character ch = 'A';  // Primitive char to Character
        System.out.println("Character ch = 'A'; // ch = " + ch);
        
        // Byte autoboxing
        Byte b = 127;  // Primitive byte to Byte
        System.out.println("Byte b = 127; // b = " + b);
        
        // Short autoboxing
        Short s = 32000;  // Primitive short to Short
        System.out.println("Short s = 32000; // s = " + s);
        
        // Long autoboxing
        Long l = 9999999999L;  // Primitive long to Long
        System.out.println("Long l = 9999999999L; // l = " + l);
        
        // Float autoboxing
        Float f = 3.14f;  // Primitive float to Float
        System.out.println("Float f = 3.14f; // f = " + f);
        System.out.println();
        
        // Example 5: Behind the scenes
        System.out.println("Example 5: Behind the scenes");
        System.out.println("When you write: Integer num = 42;");
        System.out.println("The compiler actually does: Integer num = Integer.valueOf(42);");
        System.out.println("This is more efficient than using the constructor.");
        System.out.println();
        
        // Example 6: Autoboxing in method calls
        System.out.println("Example 6: Autoboxing in method calls");
        printInteger(100);  // 100 is autoboxed to Integer
        printDouble(2.718);  // 2.718 is autoboxed to Double
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Autoboxing ---");
        System.out.println("1. Autoboxing is the automatic conversion from primitive types to wrapper classes");
        System.out.println("2. It makes code cleaner and more readable");
        System.out.println("3. It works with all primitive types and their corresponding wrappers");
        System.out.println("4. Behind the scenes, autoboxing uses valueOf() methods, not constructors");
        System.out.println("5. Autoboxing occurs in assignments, method arguments, and expressions");
    }
    
    // Method that takes an Integer parameter
    public static void printInteger(Integer num) {
        System.out.println("Received Integer: " + num);
    }
    
    // Method that takes a Double parameter
    public static void printDouble(Double num) {
        System.out.println("Received Double: " + num);
    }
}
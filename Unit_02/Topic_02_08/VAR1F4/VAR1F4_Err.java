/**
 * VAR1F4_Err - Autoboxing Error Example
 * 
 * This program demonstrates common errors related to VAR-1.F.4:
 * Autoboxing is the automatic conversion that the Java compiler makes between
 * primitive types and their corresponding object wrapper classes.
 */
public class VAR1F4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to VAR-1.F.4\n");
        
        // ERROR 1: NullPointerException with autoboxing and unboxing
        System.out.println("ERROR 1: NullPointerException with autoboxing and unboxing");
        
        Integer nullInteger = null;
        try {
            // This will throw NullPointerException during unboxing
            int value = nullInteger;  // Trying to unbox null
            System.out.println("This won't print: " + value);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot unbox null to primitive");
            System.out.println("Always check for null before unboxing: if (nullInteger != null) {...}");
        }
        System.out.println();
        
        // ERROR 2: Performance issues with excessive autoboxing
        System.out.println("ERROR 2: Performance issues with excessive autoboxing");
        
        System.out.println("Inefficient code with unnecessary autoboxing/unboxing:");
        System.out.println("for (int i = 0; i < 1000000; i++) {");
        System.out.println("    Integer boxed = i;  // Autoboxing");
        System.out.println("    int unboxed = boxed;  // Unboxing");
        System.out.println("    // Do something with unboxed");
        System.out.println("}");
        
        System.out.println("\nMore efficient without wrapper objects:");
        System.out.println("for (int i = 0; i < 1000000; i++) {");
        System.out.println("    // Do something with i directly");
        System.out.println("}");
        System.out.println();
        
        // ERROR 3: Confusion with == operator and autoboxing
        System.out.println("ERROR 3: Confusion with == operator and autoboxing");
        
        Integer a = 127;
        Integer b = 127;
        System.out.println("Integer a = 127;");
        System.out.println("Integer b = 127;");
        System.out.println("a == b: " + (a == b) + " (true because of Integer caching for small values)");
        
        Integer c = 200;
        Integer d = 200;
        System.out.println("\nInteger c = 200;");
        System.out.println("Integer d = 200;");
        System.out.println("c == d: " + (c == d) + " (false because values outside cache range -128 to 127)");
        
        System.out.println("\nCorrect way to compare Integer objects:");
        System.out.println("c.equals(d): " + c.equals(d) + " (always compares by value)");
        System.out.println();
        
        // ERROR 4: Autoboxing with wrong primitive type
        System.out.println("ERROR 4: Autoboxing with wrong primitive type");
        
        // This works but is not ideal - implicit widening conversion before autoboxing
        Integer intObj = 'A';  // char -> int -> Integer
        System.out.println("Integer intObj = 'A'; // intObj = " + intObj + " (ASCII value of 'A')");
        
        // This doesn't compile - no implicit narrowing conversion before autoboxing
        // Byte byteObj = 1000; // Error: incompatible types: int cannot be converted to Byte
        System.out.println("Byte byteObj = 1000; // Compilation error: int cannot be converted to Byte");
        System.out.println("Correct: Byte byteObj = (byte)100; // Explicit cast needed");
        System.out.println();
        
        // ERROR 5: Misunderstanding autoboxing in collections
        System.out.println("ERROR 5: Misunderstanding autoboxing in collections");
        
        // Common mistake: trying to use primitive types with generic collections
        System.out.println("Common mistake: ArrayList<int> numbers = new ArrayList<>(); // Won't compile");
        System.out.println("Correct: ArrayList<Integer> numbers = new ArrayList<>();");
        
        // Summary
        System.out.println("\n--- Common Errors with Autoboxing ---");
        System.out.println("1. NullPointerException when unboxing null wrapper objects");
        System.out.println("2. Performance overhead with excessive autoboxing/unboxing");
        System.out.println("3. Confusion with == operator and object identity vs. equality");
        System.out.println("4. Type conversion issues with autoboxing different primitive types");
        System.out.println("5. Trying to use primitive types where wrapper classes are required");
    }
}
/**
 * This program demonstrates VAR-1.B.2: Data types can be categorized as either primitive or reference.
 * It shows the differences between primitive and reference data types in Java.
 */
public class VAR1B2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Primitive vs Reference Data Types:\n");
        
        // SECTION 1: Primitive Data Types
        System.out.println("SECTION 1: Primitive Data Types");
        System.out.println("Primitive types store actual values directly in memory");
        System.out.println("Java has 8 primitive types: byte, short, int, long, float, double, char, boolean\n");
        
        // Examples of primitive types
        byte byteValue = 127;
        short shortValue = 32000;
        int intValue = 2000000000;
        long longValue = 9000000000L; // Note the 'L' suffix for long literals
        float floatValue = 3.14f;     // Note the 'f' suffix for float literals
        double doubleValue = 3.14159265359;
        char charValue = 'A';
        boolean booleanValue = true;
        
        System.out.println("Examples of primitive types:");
        System.out.println("byte: " + byteValue + " (8-bit integer, range -128 to 127)");
        System.out.println("short: " + shortValue + " (16-bit integer, range -32,768 to 32,767)");
        System.out.println("int: " + intValue + " (32-bit integer, range about -2 billion to 2 billion)");
        System.out.println("long: " + longValue + " (64-bit integer, much larger range)");
        System.out.println("float: " + floatValue + " (32-bit floating point)");
        System.out.println("double: " + doubleValue + " (64-bit floating point, more precision)");
        System.out.println("char: '" + charValue + "' (16-bit Unicode character)");
        System.out.println("boolean: " + booleanValue + " (true or false)\n");
        
        // SECTION 2: Reference Data Types
        System.out.println("SECTION 2: Reference Data Types");
        System.out.println("Reference types store addresses (references) to objects in memory");
        System.out.println("Examples include: String, arrays, and all other objects\n");
        
        // Examples of reference types
        String stringValue = "Hello, World!";
        int[] arrayValue = {1, 2, 3, 4, 5};
        Integer wrapperValue = 42; // Wrapper class (reference type) for int
        
        System.out.println("Examples of reference types:");
        System.out.println("String: \"" + stringValue + "\"");
        System.out.print("Array: {");
        for (int i = 0; i < arrayValue.length; i++) {
            System.out.print(arrayValue[i]);
            if (i < arrayValue.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        System.out.println("Integer (wrapper): " + wrapperValue + "\n");
        
        // SECTION 3: Key Differences
        System.out.println("SECTION 3: Key Differences Between Primitive and Reference Types");
        
        // Difference 1: Assignment behavior
        System.out.println("Difference 1: Assignment Behavior");
        
        // Primitive assignment (copy of value)
        int a = 5;
        int b = a; // b gets a copy of a's value
        b = 10;    // changing b doesn't affect a
        
        System.out.println("Primitive assignment creates a copy of the value:");
        System.out.println("a = " + a + ", b = " + b + " (changing b didn't affect a)\n");
        
        // Reference assignment (copy of reference)
        int[] array1 = {1, 2, 3};
        int[] array2 = array1; // array2 references the same array as array1
        array2[0] = 99;        // modifying through array2 affects the shared array
        
        System.out.println("Reference assignment creates a copy of the reference (address):");
        System.out.print("array1 = {");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i < array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        System.out.println("Changing array2 affected array1 because they reference the same array\n");
        
        // Difference 2: Default values
        System.out.println("Difference 2: Default Values");
        System.out.println("Primitive types have default values when declared as instance variables:");
        System.out.println("- Numeric types (byte, short, int, long, float, double): 0 or 0.0");
        System.out.println("- char: '\\u0000' (null character)");
        System.out.println("- boolean: false");
        
        System.out.println("\nReference types have a default value of null when declared as instance variables\n");
        
        // Difference 3: Memory usage
        System.out.println("Difference 3: Memory Usage");
        System.out.println("Primitive types:");
        System.out.println("- Use a fixed amount of memory based on their type");
        System.out.println("- Stored directly on the stack when declared as local variables");
        
        System.out.println("\nReference types:");
        System.out.println("- The reference is stored on the stack (when local)");
        System.out.println("- The actual object is stored on the heap");
        System.out.println("- Memory usage varies based on the object's size\n");
        
        // Summary
        System.out.println("Summary:");
        System.out.println("1. Primitive types store actual values; reference types store addresses");
        System.out.println("2. Primitive assignment copies values; reference assignment copies addresses");
        System.out.println("3. Primitive types have type-specific default values; reference types default to null");
        System.out.println("4. Primitive types use fixed memory; reference types have variable memory usage");
        System.out.println("5. Understanding these differences helps in selecting the appropriate type");
        System.out.println("   for a particular specification");
    }
}
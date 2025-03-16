/**
 * VAR1F6_Err - Unboxing Error Example
 * 
 * This program demonstrates common errors related to VAR-1.F.6:
 * Unboxing is the automatic conversion that the Java compiler makes from the wrapper class 
 * to the primitive type. This includes converting an Integer to an int and a Double to a double.
 */
public class VAR1F6_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to VAR-1.F.6\n");
        
        // ERROR 1: NullPointerException with unboxing
        System.out.println("ERROR 1: NullPointerException with unboxing");
        
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
        
        // ERROR 2: Unboxing in compound assignments
        System.out.println("ERROR 2: Unboxing in compound assignments");
        
        Integer count = 10;
        try {
            // Reassign count to null to demonstrate the error
            count = null;
            
            // This will throw NullPointerException
            // count is unboxed, incremented, then autoboxed back
            count++;  // Equivalent to: count = count + 1;
            System.out.println("This won't print: " + count);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot unbox null in count++");
            System.out.println("Behind the scenes: count = Integer.valueOf(count.intValue() + 1);");
        }
        System.out.println();
        
        // ERROR 3: Confusion with widening conversions after unboxing
        System.out.println("ERROR 3: Confusion with widening conversions after unboxing");
        
        Integer intObj = 42;
        
        // This works: Integer → int → long (unboxing followed by widening)
        long longValue = intObj;  // First unboxes to int, then widens to long
        System.out.println("long longValue = intObj;  // Works: unbox to int, then widen to long");
        System.out.println("longValue = " + longValue);
        
        // This doesn't work directly: Integer → byte (narrowing conversion not implicit)
        // byte byteValue = intObj;  // Error: possible loss of precision
        System.out.println("\nbyte byteValue = intObj;  // Compilation error: possible loss of precision");
        System.out.println("Correct: byte byteValue = intObj.byteValue(); or byte byteValue = (byte)(int)intObj;");
        System.out.println();
        
        // ERROR 4: Performance issues with repeated boxing/unboxing
        System.out.println("ERROR 4: Performance issues with repeated boxing/unboxing");
        
        System.out.println("Inefficient code with unnecessary boxing/unboxing:");
        System.out.println("Integer sum = 0;  // Autoboxing");
        System.out.println("for (int i = 1; i <= 1000; i++) {");
        System.out.println("    sum += i;  // Unbox sum, add i, box result back to Integer");
        System.out.println("}");
        
        System.out.println("\nMore efficient code:");
        System.out.println("int sum = 0;  // No boxing");
        System.out.println("for (int i = 1; i <= 1000; i++) {");
        System.out.println("    sum += i;  // All operations on primitives");
        System.out.println("}");
        System.out.println("Integer boxedResult = sum;  // Box only once at the end if needed");
        System.out.println();
        
        // ERROR 5: Confusion with == operator after unboxing
        System.out.println("ERROR 5: Confusion with == operator after unboxing");
        
        Integer a = 127;
        Integer b = 127;
        int c = 127;
        
        System.out.println("Integer a = 127;");
        System.out.println("Integer b = 127;");
        System.out.println("int c = 127;");
        
        // Comparing Integer objects with ==
        System.out.println("\nComparing with == operator:");
        System.out.println("a == b: " + (a == b) + " (true because of Integer caching for small values)");
        
        // Comparing Integer with int using ==
        System.out.println("a == c: " + (a == c) + " (true because a is unboxed before comparison)");
        
        // Now with larger values outside the cache range
        Integer d = 200;
        Integer e = 200;
        int f = 200;
        
        System.out.println("\nInteger d = 200;");
        System.out.println("Integer e = 200;");
        System.out.println("int f = 200;");
        
        System.out.println("d == e: " + (d == e) + " (false because values outside cache range)");
        System.out.println("d == f: " + (d == f) + " (true because d is unboxed before comparison)");
        System.out.println("This shows that == behaves differently depending on whether unboxing occurs");
        
        // Summary
        System.out.println("\n--- Common Errors with Unboxing ---");
        System.out.println("1. NullPointerException when unboxing null wrapper objects");
        System.out.println("2. Unexpected NullPointerException in compound assignments");
        System.out.println("3. Confusion with type conversions after unboxing");
        System.out.println("4. Performance overhead with repeated boxing/unboxing");
        System.out.println("5. Inconsistent behavior with == operator and unboxing");
    }
}
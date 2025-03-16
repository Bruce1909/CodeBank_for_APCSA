/**
 * VAR1F7_Err - Unboxing Application Error Example
 * 
 * This program demonstrates common errors related to VAR-1.F.7:
 * The Java compiler applies unboxing when a wrapper class object is:
 * - Passed as a parameter to a method that expects a value of the corresponding primitive type.
 * - Assigned to a variable of the corresponding primitive type.
 */
public class VAR1F7_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to VAR-1.F.7\n");
        
        // ERROR 1: NullPointerException when unboxing null wrapper objects
        System.out.println("ERROR 1: NullPointerException when unboxing null wrapper objects");
        
        Integer nullInteger = null;
        try {
            // This will throw NullPointerException during unboxing
            int primitiveInt = nullInteger;  // Trying to unbox null
            System.out.println("This won't print: " + primitiveInt);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot unbox null to primitive");
            System.out.println("Always check for null before unboxing: if (nullInteger != null) {...}");
        }
        System.out.println();
        
        // ERROR 2: NullPointerException when passing null wrapper to methods expecting primitives
        System.out.println("ERROR 2: NullPointerException when passing null wrapper to methods");
        
        Double nullDouble = null;
        try {
            // This will throw NullPointerException during unboxing
            double result = calculateDouble(nullDouble);  // Trying to unbox null
            System.out.println("This won't print: " + result);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot unbox null parameter");
            System.out.println("Always check for null before passing to methods: if (nullDouble != null) {...}");
        }
        System.out.println();
        
        // ERROR 3: Confusion with unboxing and widening/narrowing conversions
        System.out.println("ERROR 3: Confusion with unboxing and widening/narrowing conversions");
        
        Integer intObj = 42;
        
        // This works - unboxing followed by widening conversion
        long longVal = intObj;  // intObj unboxed to int, then widened to long
        System.out.println("long longVal = intObj;  // Works: unbox to int, then widen to long");
        System.out.println("longVal = " + longVal);
        
        // This doesn't work directly - no implicit narrowing after unboxing
        // byte byteVal = intObj;  // Error: possible loss of precision
        System.out.println("\nbyte byteVal = intObj;  // Compilation error: possible loss of precision");
        
        // Correct approaches
        System.out.println("Correct approaches:");
        System.out.println("byte byteVal = intObj.byteValue();  // Explicit conversion method");
        System.out.println("byte byteVal = (byte)(int)intObj;  // Explicit cast after unboxing");
        System.out.println();
        
        // ERROR 4: Unexpected behavior with compound assignments
        System.out.println("ERROR 4: Unexpected behavior with compound assignments");
        
        Integer count = 10;
        
        // This involves unboxing, incrementing, and re-boxing
        count++;  // Equivalent to: count = Integer.valueOf(count.intValue() + 1);
        System.out.println("count++ actually does: count = Integer.valueOf(count.intValue() + 1)");
        System.out.println("count = " + count);
        
        // If count were null, this would throw NullPointerException
        System.out.println("\nIf count were null, count++ would throw NullPointerException");
        System.out.println();
        
        // ERROR 5: Performance issues with repeated unboxing
        System.out.println("ERROR 5: Performance issues with repeated unboxing");
        
        System.out.println("Inefficient code with repeated unboxing:");
        System.out.println("Integer sum = Integer.valueOf(0);");
        System.out.println("for (Integer i = 1; i <= 100; i++) {  // Unboxing in condition and increment");
        System.out.println("    sum += i;  // Unboxing for both sum and i, then re-boxing");
        System.out.println("}");
        
        System.out.println("\nMore efficient code:");
        System.out.println("int sum = 0;");
        System.out.println("for (int i = 1; i <= 100; i++) {  // All primitives");
        System.out.println("    sum += i;  // No boxing/unboxing");
        System.out.println("}");
        System.out.println("Integer result = sum;  // Single boxing at the end if needed");
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors with Unboxing Applications ---");
        System.out.println("1. NullPointerException when unboxing null wrapper objects");
        System.out.println("2. NullPointerException when passing null wrappers to methods expecting primitives");
        System.out.println("3. Confusion with widening/narrowing conversions after unboxing");
        System.out.println("4. Unexpected behavior with compound assignments and unboxing");
        System.out.println("5. Performance overhead with repeated unboxing operations");
    }
    
    // Method that expects a primitive double parameter
    public static double calculateDouble(double value) {
        return value * 2;
    }
}
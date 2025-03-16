/**
 * VAR1F5_Err - Autoboxing Application Error Example
 * 
 * This program demonstrates common errors related to VAR-1.F.5:
 * The Java compiler applies autoboxing when a primitive value is:
 * - Passed as a parameter to a method that expects an object of the corresponding wrapper class.
 * - Assigned to a variable of the corresponding wrapper class.
 */
public class VAR1F5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to VAR-1.F.5\n");
        
        // ERROR 1: NullPointerException when using autoboxed values in expressions
        System.out.println("ERROR 1: NullPointerException when using autoboxed values in expressions");
        
        Integer nullInteger = null;
        try {
            // This will throw NullPointerException during unboxing
            int result = nullInteger + 5;  // Trying to unbox null for addition
            System.out.println("This won't print: " + result);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot unbox null for arithmetic");
            System.out.println("Always check for null: if (nullInteger != null) {...}");
        }
        System.out.println();
        
        // ERROR 2: Confusion with method overloading and autoboxing
        System.out.println("ERROR 2: Confusion with method overloading and autoboxing");
        
        // Calling overloaded methods
        System.out.println("Calling process(10): ");
        process(10);  // Calls process(int) not process(Integer)
        
        System.out.println("\nCalling process(new Integer(10)): ");
        process(new Integer(10));  // Calls process(Integer)
        
        System.out.println("\nAutoboxing doesn't happen when there's already a matching primitive method");
        System.out.println("Java chooses the most specific method that matches the argument");
        System.out.println();
        
        // ERROR 3: Unexpected behavior with null assignments
        System.out.println("ERROR 3: Unexpected behavior with null assignments");
        
        // This compiles because null can be assigned to any reference type
        Integer a = null;
        System.out.println("Integer a = null; // This is valid");
        
        // This doesn't compile - can't assign null to primitive
        // int b = null; // Error: incompatible types: <null> cannot be converted to int
        System.out.println("int b = null; // Compilation error: null cannot be converted to int");
        System.out.println();
        
        // ERROR 4: Autoboxing in collections with generics
        System.out.println("ERROR 4: Autoboxing in collections with generics");
        
        // Creating a list of Integers
        java.util.List<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(10);  // Autoboxing works
        
        // Common mistake: forgetting that autoboxing doesn't work with arrays
        System.out.println("Common mistake with arrays:");
        System.out.println("Integer[] array = {1, 2, 3}; // This works with autoboxing");
        
        // But array elements aren't automatically initialized with autoboxing
        Integer[] array = new Integer[3];
        // array[0] = 1; // This would work with autoboxing
        
        try {
            // This will throw NullPointerException
            int value = array[0] + 1;  // array[0] is null
            System.out.println("This won't print: " + value);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: array elements are initialized to null");
            System.out.println("Unlike primitive arrays which get default values (0, 0.0, false)");
        }
        System.out.println();
        
        // ERROR 5: Performance issues with excessive autoboxing
        System.out.println("ERROR 5: Performance issues with excessive autoboxing");
        
        System.out.println("Inefficient code with unnecessary autoboxing/unboxing:");
        System.out.println("Integer sum = 0;  // Autoboxing 0");
        System.out.println("for (int i = 1; i <= 100; i++) {");
        System.out.println("    sum = sum + i;  // Unbox sum, add i, autobox result");
        System.out.println("}");
        
        System.out.println("\nMore efficient code:");
        System.out.println("int sum = 0;  // No boxing needed");
        System.out.println("for (int i = 1; i <= 100; i++) {");
        System.out.println("    sum += i;  // Simple primitive addition");
        System.out.println("}");
        System.out.println("Integer boxedSum = sum;  // Single autoboxing at the end if needed");
        
        // Summary
        System.out.println("\n--- Common Errors with Autoboxing Applications ---");
        System.out.println("1. NullPointerException when unboxing null in expressions");
        System.out.println("2. Confusion with method overloading resolution");
        System.out.println("3. Misunderstanding null assignment restrictions");
        System.out.println("4. Forgetting that array elements aren't automatically initialized");
        System.out.println("5. Performance overhead with excessive autoboxing/unboxing");
    }
    
    // Overloaded methods to demonstrate method resolution with autoboxing
    public static void process(int primitive) {
        System.out.println("Called process(int) with value: " + primitive);
        System.out.println("This method takes a primitive int");
    }
    
    public static void process(Integer wrapper) {
        System.out.println("Called process(Integer) with value: " + wrapper);
        System.out.println("This method takes an Integer object");
    }
}
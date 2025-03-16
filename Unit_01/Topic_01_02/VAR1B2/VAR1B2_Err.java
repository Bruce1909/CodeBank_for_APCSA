/**
 * This program demonstrates common errors related to VAR-1.B.2: Data types can be categorized as either primitive or reference.
 * It shows mistakes that can occur when working with primitive and reference data types.
 */
public class VAR1B2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Primitive and Reference Types:\n");
        
        // ERROR 1: Confusing primitive and reference equality comparison
        System.out.println("ERROR 1: Confusing primitive and reference equality comparison");
        
        // Primitive comparison (compares values)
        int num1 = 100;
        int num2 = 100;
        System.out.println("Primitive comparison: num1 == num2 is " + (num1 == num2) + " (correct, compares values)");
        
        // Reference comparison (compares references, not content)
        Integer boxedNum1 = new Integer(100); // Using constructor for demonstration (deprecated in newer Java)
        Integer boxedNum2 = new Integer(100);
        System.out.println("Reference comparison: boxedNum1 == boxedNum2 is " + (boxedNum1 == boxedNum2) + " (incorrect, compares references)");
        System.out.println("Correct approach: boxedNum1.equals(boxedNum2) is " + boxedNum1.equals(boxedNum2) + " (compares values)");
        
        // Integer caching can cause confusion
        Integer cachedNum1 = 127; // Values from -128 to 127 are cached
        Integer cachedNum2 = 127;
        System.out.println("\nInteger caching (127): cachedNum1 == cachedNum2 is " + (cachedNum1 == cachedNum2) + " (true due to caching)");
        
        Integer uncachedNum1 = 200; // Outside cache range
        Integer uncachedNum2 = 200;
        System.out.println("Integer caching (200): uncachedNum1 == uncachedNum2 is " + (uncachedNum1 == uncachedNum2) + " (false, different objects)");
        System.out.println("This inconsistent behavior is a common source of bugs");
        System.out.println();
        
        // ERROR 2: Forgetting that reference assignment copies references, not values
        System.out.println("ERROR 2: Forgetting that reference assignment copies references, not values");
        
        // Array example (reference type)
        int[] originalArray = {1, 2, 3};
        int[] referenceToOriginal = originalArray; // Not a copy of the array, just a reference to it
        
        System.out.print("Original array: {");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i]);
            if (i < originalArray.length - 1) System.out.print(", ");
        }
        System.out.println("}");
        
        // Modifying through the reference
        referenceToOriginal[0] = 99;
        
        System.out.print("After modifying through reference: {");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i]);
            if (i < originalArray.length - 1) System.out.print(", ");
        }
        System.out.println("}");
        
        System.out.println("Common mistake: Thinking referenceToOriginal is a copy of originalArray");
        System.out.println("To create a true copy, you need to clone the array or copy elements manually");
        
        // Creating a true copy
        int[] trueCopy = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            trueCopy[i] = originalArray[i];
        }
        
        // Modifying the copy doesn't affect original
        trueCopy[0] = 42;
        
        System.out.print("Original array after modifying true copy: {");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i]);
            if (i < originalArray.length - 1) System.out.print(", ");
        }
        System.out.println("}");
        System.out.println();
        
        // ERROR 3: NullPointerException with reference types
        System.out.println("ERROR 3: NullPointerException with reference types");
        
        String nullString = null; // Reference with no object
        System.out.println("nullString = " + nullString);
        
        try {
            // Attempting to call a method on a null reference
            System.out.println("Attempting to call length() on null reference...");
            int length = nullString.length(); // This will cause a NullPointerException
            System.out.println("This line won't execute");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
            System.out.println("This happens because nullString doesn't reference any object");
        }
        
        System.out.println("Always check for null before using reference variables");
        System.out.println();
        
        // ERROR 4: Autoboxing and unboxing confusion
        System.out.println("ERROR 4: Autoboxing and unboxing confusion");
        
        Integer boxedValue = 42; // Autoboxing: int to Integer
        int primitiveValue = boxedValue; // Unboxing: Integer to int
        
        System.out.println("Autoboxing and unboxing usually work transparently:");
        System.out.println("boxedValue = " + boxedValue + " (Integer)");
        System.out.println("primitiveValue = " + primitiveValue + " (int)");
        
        // But can cause NullPointerException
        Integer nullInteger = null;
        try {
            System.out.println("Attempting to unbox null Integer...");
            int willCrash = nullInteger; // This will cause a NullPointerException during unboxing
            System.out.println("This line won't execute");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot unbox null Integer to int");
        }
        System.out.println();
        
        // ERROR 5: Misunderstanding default values
        System.out.println("ERROR 5: Misunderstanding default values");
        System.out.println("Common mistake: Assuming local variables have default values");
        System.out.println("Local variables must be initialized before use");
        
        // Uncommenting the following would cause a compilation error
        // int uninitializedLocal;
        // System.out.println(uninitializedLocal); // Error: variable might not have been initialized
        
        System.out.println("Only instance and class variables get default values automatically");
        System.out.println();
        
        // Summary
        System.out.println("Summary of Common Errors with Primitive and Reference Types:");
        System.out.println("1. Using == to compare reference types (compares references, not content)");
        System.out.println("2. Being confused by Integer caching behavior (-128 to 127)");
        System.out.println("3. Forgetting that reference assignment copies references, not values");
        System.out.println("4. Not checking for null before using reference variables");
        System.out.println("5. NullPointerException during unboxing of null wrapper objects");
        System.out.println("6. Assuming local variables have default values (they don't)");
        System.out.println("7. Not understanding the memory model differences between primitive and reference types");
    }
}
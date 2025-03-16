/**
 * CON1E1_Err.java
 * 
 * This program demonstrates common errors when comparing primitive values and reference values using relational operators.
 * Knowledge Point: CON-1.E.1 - Primitive values and reference values can be compared using relational operators (i.e., == and !=).
 */
public class CON1E1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Comparing Values:\n");
        
        // Example 1: Errors when comparing reference types with ==
        System.out.println("Example 1: Errors when comparing reference types with ==");
        
        // Error 1: Using == to compare String content
        String str1 = "Hello";
        String str2 = new String("Hello");  // Creates a new object in memory
        
        // The following comparison checks references, not content
        if (str1 == str2) {
            System.out.println("Strings are equal"); // This won't execute
        } else {
            System.out.println("Error 1: Using == with Strings compares references, not content");
            System.out.println("  - str1 = \"" + str1 + "\", str2 = new String(\"Hello\")");
            System.out.println("  - str1 == str2 is false even though the content is the same");
            System.out.println("  - Use str1.equals(str2) instead to compare content: " + str1.equals(str2));
        }
        System.out.println();
        
        // Example 2: Errors when comparing custom objects
        System.out.println("Example 2: Errors when comparing custom objects");
        
        // Error 2: Using == with custom objects without proper equals() method
        Person person1 = new Person("John", 25);
        Person person2 = new Person("John", 25);  // Same data but different object
        
        // The following comparison checks references, not content
        if (person1 == person2) {
            System.out.println("Persons are equal"); // This won't execute
        } else {
            System.out.println("Error 2: Using == with custom objects compares references, not content");
            System.out.println("  - person1 and person2 have the same name and age");
            System.out.println("  - person1 == person2 is false because they are different objects");
            System.out.println("  - Custom classes should override equals() method for content comparison");
        }
        System.out.println();
        
        // Example 3: Errors with null comparisons
        System.out.println("Example 3: Errors with null comparisons");
        
        // Error 3: Calling methods on potentially null references
        String nullString = null;
        
        // The following line would cause a NullPointerException if uncommented
        // System.out.println("Length: " + nullString.length());
        
        System.out.println("Error 3: Calling methods on null references causes NullPointerException");
        System.out.println("  - Always check if reference is null before calling methods");
        System.out.println("  - Correct way: if (nullString != null) { nullString.length(); }");
        System.out.println();
        
        // Example 4: Errors with array comparisons
        System.out.println("Example 4: Errors with array comparisons");
        
        // Error 4: Using == to compare array contents
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        
        // The following comparison checks references, not content
        if (array1 == array2) {
            System.out.println("Arrays are equal"); // This won't execute
        } else {
            System.out.println("Error 4: Using == with arrays compares references, not content");
            System.out.println("  - array1 and array2 contain the same values: {1, 2, 3}");
            System.out.println("  - array1 == array2 is false because they are different array objects");
            System.out.println("  - Use Arrays.equals(array1, array2) instead: " + java.util.Arrays.equals(array1, array2));
        }
        System.out.println();
        
        // Example 5: Errors with wrapper classes
        System.out.println("Example 5: Errors with wrapper classes");
        
        // Error 5: Using == with wrapper classes outside cache range
        Integer int1 = 200;
        Integer int2 = 200;
        
        // The following comparison might not work as expected
        if (int1 == int2) {
            System.out.println("Integers are equal"); // This might not execute
        } else {
            System.out.println("Error 5: Using == with wrapper classes outside cache range");
            System.out.println("  - Integer objects with values outside -128 to 127 may be different objects");
            System.out.println("  - int1 == int2 might be false even though the values are both 200");
            System.out.println("  - Use int1.equals(int2) instead: " + int1.equals(int2));
            System.out.println("  - Or use int1.intValue() == int2.intValue() to compare primitive values");
        }
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Comparing Values Errors ---");
        System.out.println("1. Don't use == to compare the content of reference types (use equals() instead)");
        System.out.println("2. == and != compare references (memory addresses) for reference types");
        System.out.println("3. Always check for null before calling methods on reference variables");
        System.out.println("4. Use Arrays.equals() to compare array contents, not ==");
        System.out.println("5. Be careful with wrapper classes and == operator (use equals() instead)");
    }
    
    // Helper class for demonstration
    static class Person {
        private String name;
        private int age;
        
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        // Note: equals() method is not overridden
    }
}
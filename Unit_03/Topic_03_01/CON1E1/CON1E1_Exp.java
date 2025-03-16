/**
 * CON1E1_Exp.java
 * 
 * This program demonstrates comparing primitive values and reference values using relational operators.
 * Knowledge Point: CON-1.E.1 - Primitive values and reference values can be compared using relational operators (i.e., == and !=).
 */
public class CON1E1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Comparison of Primitive and Reference Values:\n");
        
        // Example 1: Comparing primitive values
        System.out.println("Example 1: Comparing primitive values");
        int num1 = 5;
        int num2 = 5;
        int num3 = 10;
        
        boolean primitiveEqual = (num1 == num2);      // Comparing if values are equal
        boolean primitiveNotEqual = (num1 != num3);   // Comparing if values are not equal
        
        System.out.println("num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3);
        System.out.println("num1 == num2: " + primitiveEqual);      // true
        System.out.println("num1 != num3: " + primitiveNotEqual);   // true
        System.out.println();
        
        // Example 2: Comparing different primitive types
        System.out.println("Example 2: Comparing different primitive types");
        int intValue = 100;
        double doubleValue = 100.0;
        char charValue = 'd';
        char charValue2 = 100;  // ASCII value 100 is 'd'
        
        boolean intDoubleEqual = (intValue == doubleValue);  // Comparing int with double
        boolean charIntEqual = (charValue2 == intValue);     // Comparing char with int
        
        System.out.println("intValue = " + intValue + ", doubleValue = " + doubleValue);
        System.out.println("charValue = '" + charValue + "', charValue2 = '" + charValue2 + "' (ASCII 100)");
        System.out.println("intValue == doubleValue: " + intDoubleEqual);  // true (automatic type conversion)
        System.out.println("charValue2 == intValue: " + charIntEqual);     // true (char is compared as its numeric value)
        System.out.println();
        
        // Example 3: Comparing reference values (String objects)
        System.out.println("Example 3: Comparing reference values (String objects)");
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");  // Creates a new object in memory
        
        boolean refEqual1 = (str1 == str2);   // Comparing references (string literals are interned)
        boolean refEqual2 = (str1 == str3);   // Comparing references (different objects)
        boolean valueEqual = str1.equals(str3); // Comparing actual string values
        
        System.out.println("str1 = \"" + str1 + "\", str2 = \"" + str2 + "\", str3 = new String(\"Hello\");");
        System.out.println("str1 == str2: " + refEqual1 + " (same reference due to string interning)");
        System.out.println("str1 == str3: " + refEqual2 + " (different references in memory)");
        System.out.println("str1.equals(str3): " + valueEqual + " (same content)");
        System.out.println();
        
        // Example 4: Comparing reference values (arrays)
        System.out.println("Example 4: Comparing reference values (arrays)");
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = array1;  // array3 references the same array as array1
        
        boolean arrayEqual1 = (array1 == array2);  // Different array objects
        boolean arrayEqual2 = (array1 == array3);  // Same array object
        
        System.out.println("array1 and array2 contain the same values: {1, 2, 3}");
        System.out.println("array3 references the same array as array1");
        System.out.println("array1 == array2: " + arrayEqual1 + " (different array objects)");
        System.out.println("array1 == array3: " + arrayEqual2 + " (same array object)");
        System.out.println();
        
        // Example 5: Comparing with null
        System.out.println("Example 5: Comparing with null");
        String nullString = null;
        boolean isNull = (nullString == null);
        boolean isNotNull = (str1 != null);
        
        System.out.println("nullString = null, str1 = \"" + str1 + "\"");
        System.out.println("nullString == null: " + isNull);   // true
        System.out.println("str1 != null: " + isNotNull);      // true
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Comparing Values ---");
        System.out.println("1. Primitive values and reference values can be compared using == and != (CON-1.E.1)");
        System.out.println("2. For primitive types, == compares the actual values");
        System.out.println("3. For reference types, == compares the memory references (not the content)");
        System.out.println("4. To compare the content of objects, use methods like equals() instead of ==");
        System.out.println("5. String literals are interned, so identical string literals share the same reference");
        System.out.println("6. null is a special literal that can be compared with reference variables using == and !=");
    }
}
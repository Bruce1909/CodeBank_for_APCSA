/**
 * VAR1E2_Exp.java
 * 
 * This program demonstrates the immutability of String objects.
 * 
 * Knowledge Point: VAR-1.E.2
 * - String objects are immutable, meaning that String methods do not change the String object.
 */
public class VAR1E2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating String Immutability:\n");
        
        // Example 1: Basic demonstration of String immutability
        System.out.println("Example 1: Basic demonstration of String immutability");
        String original = "Hello";
        System.out.println("Original string: \"" + original + "\"");
        
        // Calling methods on the String doesn't change it
        original.toUpperCase();
        original.concat(" World");
        original.replace('H', 'J');
        
        System.out.println("After calling methods: \"" + original + "\" (unchanged)");
        System.out.println("String methods return new String objects instead of modifying the original");
        System.out.println();
        
        // Example 2: Capturing the results of String methods
        System.out.println("Example 2: Capturing the results of String methods");
        String str = "Java";
        System.out.println("Original string: \"" + str + "\"");
        
        // Assign the results to new variables
        String upperCase = str.toUpperCase();
        String concatenated = str.concat(" Programming");
        String replaced = str.replace('J', 'L');
        
        System.out.println("Original after methods: \"" + str + "\" (unchanged)");
        System.out.println("toUpperCase() result: \"" + upperCase + "\"");
        System.out.println("concat() result: \"" + concatenated + "\"");
        System.out.println("replace() result: \"" + replaced + "\"");
        System.out.println();
        
        // Example 3: Reassigning the original variable
        System.out.println("Example 3: Reassigning the original variable");
        String message = "Hello";
        System.out.println("Original string: \"" + message + "\"");
        
        // Reassign the original variable to the result
        message = message.toUpperCase();
        System.out.println("After reassignment: \"" + message + "\"");
        
        message = message.concat(" WORLD");
        System.out.println("After another reassignment: \"" + message + "\"");
        System.out.println("The variable now references a new String object");
        System.out.println();
        
        // Example 4: Demonstrating immutability with string operations
        System.out.println("Example 4: Demonstrating immutability with string operations");
        String s1 = "Hello";
        String s2 = s1;
        
        System.out.println("s1: \"" + s1 + "\"");
        System.out.println("s2: \"" + s2 + "\" (references the same String as s1)");
        
        // Reassign s1
        s1 = s1 + " World";
        
        System.out.println("After s1 = s1 + \" World\":");
        System.out.println("s1: \"" + s1 + "\" (now references a new String)");
        System.out.println("s2: \"" + s2 + "\" (still references the original String)");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about String Immutability ---");
        System.out.println("1. String objects cannot be changed after creation");
        System.out.println("2. String methods always return new String objects");
        System.out.println("3. To update a String variable, you must reassign it");
        System.out.println("4. String concatenation creates new String objects");
        System.out.println("5. Immutability makes Strings thread-safe and secure");
    }
}
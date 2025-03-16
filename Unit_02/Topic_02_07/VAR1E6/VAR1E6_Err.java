/**
 * VAR1E6_Err.java
 * 
 * This program demonstrates common errors when working with String methods, APIs, and packages.
 * 
 * Knowledge Points: VAR-1.E.6, VAR-1.E.7, VAR-1.E.8, VAR-1.E.9
 * - Errors related to String methods usage
 * - Mistakes in API understanding and documentation
 * - Issues with package imports
 */
public class VAR1E6_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with String methods and APIs:\n");
        
        // ERROR 1: Misunderstanding method behavior due to lack of API documentation
        System.out.println("ERROR 1: Misunderstanding method behavior due to lack of API documentation");
        String text = "Hello, Java!";
        
        // Incorrect assumption about substring behavior
        System.out.println("Original string: \"" + text + "\"");
        System.out.println("Calling substring(7, 11): " + text.substring(7, 11));
        System.out.println("Many programmers incorrectly assume substring(7, 11) includes index 11");
        System.out.println("But API documentation clarifies it only goes up to index 10 (11-1)");
        System.out.println();
        
        // ERROR 2: Incorrect method parameter usage
        System.out.println("ERROR 2: Incorrect method parameter usage");
        String sentence = "Java programming";
        
        try {
            // Incorrect parameter order (from > to)
            System.out.println("Attempting substring(10, 5): ");
            String result = sentence.substring(10, 5); // This will throw an exception
            System.out.println(result); // This line won't execute
        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass().getName());
            System.out.println("Reason: 'from' index (10) is larger than 'to' index (5)");
            System.out.println("Proper API documentation would show that 'from' must be <= 'to'");
        }
        System.out.println();
        
        // ERROR 3: Not checking method return values
        System.out.println("ERROR 3: Not checking method return values");
        String searchText = "Hello, World!";
        
        // Incorrect assumption about indexOf return value
        int index = searchText.indexOf("Java");
        System.out.println("Searching for 'Java' in '" + searchText + "'");
        
        // This code doesn't check if the substring was found
        System.out.println("Incorrect code that doesn't check return value:");
        System.out.println("Found 'Java' at index: " + index);
        
        // Correct approach: check the return value
        System.out.println("Correct approach (check if indexOf returned -1):");
        if (index != -1) {
            System.out.println("Found 'Java' at index: " + index);
        } else {
            System.out.println("'Java' not found in the string");
        }
        System.out.println();
        
        // ERROR 4: Confusing similar method names
        System.out.println("ERROR 4: Confusing similar method names");
        String str1 = "apple";
        String str2 = "APPLE";
        
        // Confusion between equals() and equalsIgnoreCase()
        System.out.println("str1: \"" + str1 + "\", str2: \"" + str2 + "\"");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("This returns false because equals() is case-sensitive");
        System.out.println("To compare ignoring case, use: str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
        System.out.println();
        
        // ERROR 5: Misunderstanding compareTo() return values
        System.out.println("ERROR 5: Misunderstanding compareTo() return values");
        String a = "apple";
        String b = "banana";
        
        int compareResult = a.compareTo(b);
        System.out.println("a.compareTo(b): " + compareResult);
        System.out.println("Common misinterpretation: thinking the result is always -1, 0, or 1");
        System.out.println("Actual behavior: returns a negative integer, zero, or positive integer");
        System.out.println("The value represents the difference between character values");
        System.out.println();
        
        // ERROR 6: Forgetting that java.lang is imported by default
        System.out.println("ERROR 6: Forgetting that java.lang is imported by default");
        System.out.println("Uncommenting the following line would be unnecessary:");
        // import java.lang.String; // Unnecessary import - java.lang is imported by default
        System.out.println("The String class is in java.lang package which is imported by default");
        System.out.println();
        
        // ERROR 7: StringIndexOutOfBoundsException
        System.out.println("ERROR 7: StringIndexOutOfBoundsException");
        String shortText = "Java";
        
        try {
            // Attempting to access an index beyond the string length
            char c = shortText.charAt(10);
            System.out.println(c); // This line won't execute
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception: StringIndexOutOfBoundsException");
            System.out.println("Reason: Tried to access index 10 in a string of length " + shortText.length());
            System.out.println("Valid indices for '" + shortText + "' are 0 to " + (shortText.length() - 1));
        }
        System.out.println();
        
        // ERROR 8: Not understanding toString() implicit calls
        System.out.println("ERROR 8: Not understanding toString() implicit calls");
        Object obj = new Object();
        String objString = "Object: " + obj;
        System.out.println("When concatenating an object with a string: " + objString);
        System.out.println("Java implicitly calls the object's toString() method");
        System.out.println("For custom classes, override toString() for meaningful output");
        System.out.println();
        
        // Summary of common errors
        System.out.println("--- Common Errors with String Methods and APIs ---");
        System.out.println("1. Misunderstanding method behavior due to not reading API documentation");
        System.out.println("2. Using incorrect parameters with methods");
        System.out.println("3. Not checking return values from methods like indexOf()");
        System.out.println("4. Confusing similar method names (equals vs equalsIgnoreCase)");
        System.out.println("5. Misinterpreting compareTo() return values");
        System.out.println("6. Unnecessarily importing java.lang classes");
        System.out.println("7. Accessing string indices outside valid range");
        System.out.println("8. Not understanding implicit toString() calls in string concatenation");
    }
}
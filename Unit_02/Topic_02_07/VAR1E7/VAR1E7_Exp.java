/**
 * VAR1E7_Exp.java
 * 
 * This program demonstrates the importance of API documentation for understanding
 * class attributes and behaviors.
 * 
 * Knowledge Point: VAR-1.E.7
 * - Documentation for APIs and libraries are essential to understanding the attributes
 *   and behaviors of an object of a class.
 */
public class VAR1E7_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating the Importance of API Documentation:\n");
        
        // Example 1: Using String methods with documentation knowledge
        System.out.println("Example 1: Using String methods with documentation knowledge");
        String text = "Java Programming";
        System.out.println("Original string: \"" + text + "\"");
        
        // Using substring with knowledge from documentation
        System.out.println("\nSubstring method (from API documentation):");
        System.out.println("substring(int beginIndex, int endIndex) returns a new string that is a substring of this string.");
        System.out.println("The substring begins at beginIndex and extends to the character at index endIndex - 1.");
        System.out.println("Thus the length of the substring is endIndex - beginIndex.");
        
        String sub = text.substring(0, 4);
        System.out.println("text.substring(0, 4): \"" + sub + "\"");
        System.out.println("This returns characters from index 0 to 3 (4-1) as documented");
        System.out.println();
        
        // Example 2: Understanding method behavior through documentation
        System.out.println("Example 2: Understanding method behavior through documentation");
        String searchStr = "Hello, World!";
        
        System.out.println("\nindexOf method (from API documentation):");
        System.out.println("indexOf(String str) returns the index of the first occurrence of str,");
        System.out.println("or -1 if str is not found.");
        
        int index = searchStr.indexOf("World");
        System.out.println("searchStr.indexOf(\"World\"): " + index);
        
        int notFoundIndex = searchStr.indexOf("Java");
        System.out.println("searchStr.indexOf(\"Java\"): " + notFoundIndex);
        System.out.println("Returns -1 as documented when the substring is not found");
        System.out.println();
        
        // Example 3: Understanding parameter requirements from documentation
        System.out.println("Example 3: Understanding parameter requirements from documentation");
        String str = "Documentation";
        
        System.out.println("\nreplace method (from API documentation):");
        System.out.println("replace(char oldChar, char newChar) returns a new string resulting");
        System.out.println("from replacing all occurrences of oldChar with newChar.");
        
        String replaced = str.replace('o', 'O');
        System.out.println("str.replace('o', 'O'): \"" + replaced + "\"");
        System.out.println("All occurrences of 'o' are replaced with 'O' as documented");
        System.out.println();
        
        // Example 4: Understanding return values from documentation
        System.out.println("Example 4: Understanding return values from documentation");
        String s1 = "apple";
        String s2 = "banana";
        
        System.out.println("\ncompareTo method (from API documentation):");
        System.out.println("compareTo(String anotherString) compares two strings lexicographically.");
        System.out.println("Returns a negative integer if this string precedes the argument string");
        System.out.println("Returns a positive integer if this string follows the argument string");
        System.out.println("Returns zero if the strings are equal");
        
        int compareResult = s1.compareTo(s2);
        System.out.println("s1.compareTo(s2): " + compareResult);
        System.out.println("Returns a negative value because 'apple' comes before 'banana' alphabetically");
        System.out.println();
        
        // Example 5: Understanding exceptions from documentation
        System.out.println("Example 5: Understanding exceptions from documentation");
        String shortStr = "ABC";
        
        System.out.println("\ncharAt method (from API documentation):");
        System.out.println("charAt(int index) returns the char value at the specified index.");
        System.out.println("An index ranges from 0 to length() - 1.");
        System.out.println("Throws IndexOutOfBoundsException if index is negative or not less than length().");
        
        try {
            // This will throw an exception as documented
            char c = shortStr.charAt(5);
            System.out.println(c); // This line won't execute
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getClass().getName());
            System.out.println("This exception was expected based on the documentation");
        }
        System.out.println();
        
        // Example 6: Benefits of good API documentation
        System.out.println("Example 6: Benefits of good API documentation");
        System.out.println("Good API documentation provides:");
        System.out.println("1. Clear explanation of what each method does");
        System.out.println("2. Details about parameter requirements and constraints");
        System.out.println("3. Information about return values and their meaning");
        System.out.println("4. Exceptions that might be thrown and when");
        System.out.println("5. Examples of how to use the methods correctly");
        System.out.println("6. Notes about performance considerations");
        System.out.println("7. Warnings about potential pitfalls");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about API Documentation ---");
        System.out.println("1. API documentation is essential for understanding how to use classes and methods");
        System.out.println("2. Documentation explains parameter requirements, return values, and exceptions");
        System.out.println("3. Without proper documentation, developers might misuse methods or misinterpret results");
        System.out.println("4. Java's official documentation is available at docs.oracle.com");
        System.out.println("5. IDEs often provide quick access to documentation through tooltips and popups");
    }
}
/**
 * VAR1E6_Exp.java
 * 
 * This program demonstrates the use of String class methods, APIs, and packages.
 * 
 * Knowledge Points: VAR-1.E.6, VAR-1.E.7, VAR-1.E.8, VAR-1.E.9
 * - Application Program Interfaces (APIs) and libraries simplify complex programming tasks
 * - Documentation for APIs is essential for understanding class behavior
 * - Classes in APIs are grouped into packages
 * - The String class is part of the java.lang package (available by default)
 */
public class VAR1E6_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating String APIs and Methods:\n");
        
        // Example 1: Using String class from java.lang package
        System.out.println("Example 1: Using String class from java.lang package");
        System.out.println("The String class is part of the java.lang package");
        System.out.println("Classes in java.lang are available by default (no import needed)");
        String text = "Hello, Java API!";
        System.out.println("Created String: " + text);
        System.out.println();
        
        // Example 2: Using String methods from the API
        System.out.println("Example 2: Using String methods from the API");
        System.out.println("Original string: \"" + text + "\"");
        System.out.println("length(): " + text.length() + " characters");
        System.out.println("toUpperCase(): " + text.toUpperCase());
        System.out.println("toLowerCase(): " + text.toLowerCase());
        System.out.println("charAt(7): " + text.charAt(7));
        System.out.println("substring(7, 11): " + text.substring(7, 11));
        System.out.println("substring(7): " + text.substring(7));
        System.out.println("indexOf(\"Java\"): " + text.indexOf("Java"));
        System.out.println("contains(\"API\"): " + text.contains("API"));
        System.out.println("startsWith(\"Hello\"): " + text.startsWith("Hello"));
        System.out.println("endsWith(\"!\")): " + text.endsWith("!"));
        System.out.println();
        
        // Example 3: String comparison methods
        System.out.println("Example 3: String comparison methods");
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "Apple";
        String str4 = "apple";
        
        System.out.println("str1: \"" + str1 + "\"");
        System.out.println("str2: \"" + str2 + "\"");
        System.out.println("str3: \"" + str3 + "\"");
        System.out.println("str4: \"" + str4 + "\"");
        System.out.println();
        
        System.out.println("str1.equals(str4): " + str1.equals(str4));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));
        System.out.println();
        
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2) + " (negative because 'apple' comes before 'banana')");
        System.out.println("str2.compareTo(str1): " + str2.compareTo(str1) + " (positive because 'banana' comes after 'apple')");
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4) + " (zero because they are equal)");
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3) + " (positive because lowercase comes after uppercase in ASCII)");
        System.out.println();
        
        // Example 4: Demonstrating how APIs simplify programming tasks
        System.out.println("Example 4: How APIs simplify programming tasks");
        String sentence = "Java APIs make programming easier and more efficient";
        
        // Without API methods, we would need to write complex code for these operations
        System.out.println("Using API methods to perform complex tasks easily:");
        String[] words = sentence.split(" ");
        System.out.println("Split sentence into " + words.length + " words");
        
        StringBuilder reversed = new StringBuilder(sentence).reverse();
        System.out.println("Reversed: " + reversed);
        
        String replaced = sentence.replace("APIs", "Application Programming Interfaces");
        System.out.println("Replaced: " + replaced);
        System.out.println();
        
        // Example 5: Importance of API documentation
        System.out.println("Example 5: Importance of API documentation");
        System.out.println("API documentation tells us:");
        System.out.println("- What methods are available");
        System.out.println("- What parameters they require");
        System.out.println("- What values they return");
        System.out.println("- Any exceptions they might throw");
        System.out.println("- Best practices for using them");
        System.out.println();
        
        // Example 6: Packages in Java
        System.out.println("Example 6: Packages in Java");
        System.out.println("Common Java packages include:");
        System.out.println("- java.lang: Core classes (String, Math, etc.)");
        System.out.println("- java.util: Utility classes (ArrayList, HashMap, etc.)");
        System.out.println("- java.io: Input/output operations");
        System.out.println("- java.net: Networking capabilities");
        System.out.println("- java.awt and javax.swing: GUI components");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about APIs and Packages ---");
        System.out.println("1. APIs provide pre-written code to simplify complex tasks");
        System.out.println("2. API documentation is essential for understanding how to use classes");
        System.out.println("3. Classes in APIs are organized into packages by functionality");
        System.out.println("4. The String class is in java.lang package (available by default)");
        System.out.println("5. Using APIs saves development time and reduces errors");
    }
}
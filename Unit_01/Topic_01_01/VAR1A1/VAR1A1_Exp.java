/**
 * VAR1A_Exp - String Literals Example
 * 
 * This program demonstrates the correct usage of string literals
 * as specified in VAR-1.A skills list, including:
 * - Creating string literals enclosed in double quotes
 * - Different ways to use string literals in Java
 */
public class VAR1A1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating String Literals:\n");
        
        // Example 1: Basic string literal declaration
        System.out.println("Example 1: Basic string literal");
        String greeting = "Hello, World!";
        System.out.println("The string literal is: " + greeting);
        System.out.println();
        
        // Example 2: String literals with special characters
        System.out.println("Example 2: String literals with special characters");
        String withQuotes = "The student said, \"Java is fun!\"";
        System.out.println(withQuotes);
        
        String withNewlines = "Line 1\nLine 2\nLine 3";
        System.out.println(withNewlines);
        System.out.println();
        
        // Example 3: Empty string literal
        System.out.println("Example 3: Empty string literal");
        String emptyString = "";
        System.out.println("Empty string: '" + emptyString + "'");
        System.out.println("Length of empty string: " + emptyString.length());
        System.out.println();
        
        // Example 4: String literals in expressions
        System.out.println("Example 4: String literals in expressions");
        System.out.println("Hello, " + "World!"); // Concatenation of string literals
        
        String name = "Alice";
        System.out.println("Hello, " + name); // Concatenation with variable
        System.out.println();
        
        // Example 5: String literals as method arguments
        System.out.println("Example 5: String literals as method arguments");
        printMessage("This is a string literal passed to a method");
        System.out.println();
        
        // Example 6: String literals vs. char literals
        System.out.println("Example 6: String literals vs. char literals");
        String singleCharString = "A"; // String literal with one character
        char charLiteral = 'A';        // Char literal (not a string literal)
        
        System.out.println("String literal 'A': " + singleCharString);
        System.out.println("Char literal 'A': " + charLiteral);
        System.out.println("String literal is enclosed in double quotes: \"A\"");
        System.out.println("Char literal is enclosed in single quotes: 'A'");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about String Literals ---");
        System.out.println("1. String literals are enclosed in double quotes (VAR-1.A.1)");
        System.out.println("2. String literals can contain escape sequences like \\n, \\t, and \\\"");
        System.out.println("3. An empty string literal is represented as \"\"");
        System.out.println("4. String literals can be concatenated with the + operator");
        System.out.println("5. String literals can be passed directly to methods");
        System.out.println("6. String literals are different from char literals (which use single quotes)");
    }
    
    // Helper method to demonstrate passing string literals to methods
    public static void printMessage(String message) {
        System.out.println("The message is: " + message);
    }
}
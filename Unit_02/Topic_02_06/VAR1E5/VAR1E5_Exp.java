/**
 * VAR1E5_Exp.java
 * 
 * This program demonstrates escape sequences in Java Strings.
 * 
 * Knowledge Point: VAR-1.E.5
 * - Escape sequences start with a \ and have a special meaning in Java.
 * - Escape sequences used in this course include \", \\, and \n.
 */
public class VAR1E5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Escape Sequences in Java:\n");
        
        // Example 1: Double quote escape sequence (\")
        System.out.println("Example 1: Double quote escape sequence (\\\")");
        String withQuotes = "Alice said, \"Java programming is fun!\"";
        System.out.println("String with quotes: " + withQuotes);
        System.out.println("Without escape sequences, this would cause a compilation error");
        System.out.println();
        
        // Example 2: Backslash escape sequence (\\)
        System.out.println("Example 2: Backslash escape sequence (\\\\)");
        String filePath = "C:\\Program Files\\Java\\jdk-17";
        System.out.println("File path: " + filePath);
        System.out.println("Without escape sequences, the backslashes would be interpreted as escape characters");
        System.out.println();
        
        // Example 3: Newline escape sequence (\n)
        System.out.println("Example 3: Newline escape sequence (\\n)");
        String multiLine = "Line 1\nLine 2\nLine 3";
        System.out.println("Multi-line string:\n" + multiLine);
        System.out.println("The \\n creates a new line in the output");
        System.out.println();
        
        // Example 4: Combining multiple escape sequences
        System.out.println("Example 4: Combining multiple escape sequences");
        String combined = "Path: \"C:\\Documents\\Files\"\nOwner: \"John Doe\"";
        System.out.println("Combined escape sequences:\n" + combined);
        System.out.println();
        
        // Example 5: Escape sequences in string literals vs. string output
        System.out.println("Example 5: Escape sequences in string literals vs. string output");
        System.out.println("In the code, we write: \"Hello\\nWorld\"");
        System.out.println("In the output, we see:\nHello\nWorld");
        System.out.println();
        
        // Example 6: Printing the escape sequences themselves
        System.out.println("Example 6: Printing the escape sequences themselves");
        System.out.println("To include a double quote: use \\\"");
        System.out.println("To include a backslash: use \\\\");
        System.out.println("To include a newline: use \\n");
        System.out.println();
        
        // Example 7: Other common escape sequences (for reference)
        System.out.println("Example 7: Other common escape sequences (for reference)");
        System.out.println("Tab character (\\t): "+ "Item1\tItem2\tItem3");
        System.out.println("Carriage return (\\r): Not commonly used in Java");
        System.out.println("Form feed (\\f): Not commonly used in Java");
        System.out.println("Backspace (\\b): Not commonly used in Java");
        System.out.println("Single quote (\\'): Used in char literals, e.g., char c = '\\'';");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Escape Sequences ---");
        System.out.println("1. Escape sequences allow special characters to be included in strings");
        System.out.println("2. All escape sequences start with a backslash (\\)");
        System.out.println("3. Common escape sequences: \\\" (double quote), \\\\ (backslash), \\n (newline)");
        System.out.println("4. Without escape sequences, special characters would cause compilation errors");
        System.out.println("5. Escape sequences are interpreted when the string is displayed");
    }
}
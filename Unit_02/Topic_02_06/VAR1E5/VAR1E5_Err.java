/**
 * VAR1E5_Err.java
 * 
 * This program demonstrates common errors related to escape sequences in Java Strings.
 * 
 * Knowledge Point: VAR-1.E.5
 * - Escape sequences start with a \ and have a special meaning in Java.
 * - Escape sequences used in this course include \", \\, and \n.
 */
public class VAR1E5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with escape sequences in Java:\n");
        
        // ERROR 1: Missing escape sequences for special characters
        System.out.println("ERROR 1: Missing escape sequences for special characters");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // String quote = "She said, "Java is fun!""; // Error: unclosed string literal
        System.out.println("The compiler sees the second double quote as the end of the string");
        System.out.println("Correct approach: String quote = \"She said, \\\"Java is fun!\\\"\";\n");
        
        // ERROR 2: Incorrect backslash escaping in file paths
        System.out.println("ERROR 2: Incorrect backslash escaping in file paths");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // String path = "C:\Program Files\Java"; // Error: invalid escape sequence
        System.out.println("The backslashes are interpreted as the start of escape sequences");
        System.out.println("Correct approach: String path = \"C:\\\\Program Files\\\\Java\";\n");
        
        // ERROR 3: Misunderstanding newline escape sequence
        System.out.println("ERROR 3: Misunderstanding newline escape sequence");
        // String wrongNewline = "Line 1\Line 2"; // \L is not a valid escape sequence
        // System.out.println("Using invalid escape sequence \\L: " + wrongNewline);
        System.out.println("Java treats \\L as 'L' because \\L is not a valid escape sequence");
        System.out.println("Correct approach: String newline = \"Line 1\\nLine 2\";\n");
        
        // ERROR 4: Confusion between escape sequences and regular characters
        System.out.println("ERROR 4: Confusion between escape sequences and regular characters");
        String confusedEscape = "The symbol \n is used for newlines";
        System.out.println("Intended: The symbol \\n is used for newlines");
        System.out.println("Actual output: " + confusedEscape);
        System.out.println("The \\n was interpreted as a newline rather than the literal characters '\\n'");
        System.out.println("Correct approach: String correct = \"The symbol \\\\n is used for newlines\";\n");
        
        // ERROR 5: Incorrect number of backslashes
        System.out.println("ERROR 5: Incorrect number of backslashes");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // String tooManyBackslashes = "This has too many \\\backslashes"; // Error: illegal escape character
        System.out.println("An odd number of backslashes can create invalid escape sequences");
        System.out.println("Each escape sequence needs exactly one backslash, and each literal backslash needs one escape backslash\n");
        
        // ERROR 6: Forgetting that escape sequences are processed in string literals
        System.out.println("ERROR 6: Forgetting that escape sequences are processed in string literals");
        String regex = "\\d+"; // Represents the regex pattern \d+
        System.out.println("Regex pattern: " + regex);
        System.out.println("When writing a regex for digits (\\d+), you need two backslashes in the string literal");
        System.out.println("One backslash would be interpreted as an escape sequence with 'd'\n");
        
        // ERROR 7: Confusion with escape sequences in print statements
        System.out.println("ERROR 7: Confusion with escape sequences in print statements");
        System.out.println("Common mistake: thinking System.out.println(\"Hello\nWorld\") prints the characters '\\n'");
        System.out.println("Actual behavior: it prints Hello and World on separate lines");
        System.out.println("To print the literal characters '\\n', use: System.out.println(\"Hello\\\\nWorld\");\n");
        
        // ERROR 8: Forgetting to escape backslashes in string concatenation
        System.out.println("ERROR 8: Forgetting to escape backslashes in string concatenation");
        String part1 = "C:";
        String part2 = "\temp"; // \t is interpreted as a tab character
        String fullPath = part1 + part2;
        System.out.println("Concatenated path: " + fullPath);
        System.out.println("Expected: C:\\temp");
        System.out.println("Actual: C:[tab]emp (because \\t is the tab escape sequence)");
        System.out.println("Correct approach: String part2 = \"\\\\temp\";\n");
        
        // Summary of key points
        System.out.println("--- Common Errors with Escape Sequences ---");
        System.out.println("1. Forgetting to escape double quotes in strings");
        System.out.println("2. Forgetting to escape backslashes in file paths");
        System.out.println("3. Using invalid escape sequences (like \\L)");
        System.out.println("4. Confusing literal backslash-n with the newline escape sequence");
        System.out.println("5. Using an incorrect number of backslashes");
        System.out.println("6. Not accounting for escape sequence processing in string literals");
        System.out.println("7. Misunderstanding how escape sequences are displayed in output");
    }
}
/**
 * VAR1A_Err - String Literals Error Demonstration
 * 
 * This program demonstrates common errors and misconceptions when working with
 * string literals as specified in VAR-1.A skills list, including:
 * - Incorrect string literal syntax
 * - Common mistakes with quotes
 * - Confusion between string and char literals
 */
public class VAR1A1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with String Literals:\n");
        
        // ERROR 1: Using single quotes for string literals
        System.out.println("ERROR 1: Using single quotes for string literals");
        
        try {
            System.out.println("Attempting to create a string with single quotes...");
            // Uncommenting the next line would cause a compilation error
            // String singleQuotesString = 'This is not a string literal'; // Error: char vs String
            System.out.println("This would cause a compilation error because string literals must use double quotes");
            System.out.println("Correct usage: String str = \"This is a string literal\";");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 2: Unescaped quotes within string literals
        System.out.println("ERROR 2: Unescaped quotes within string literals");
        
        try {
            System.out.println("Attempting to create a string with unescaped quotes...");
            // Uncommenting the next line would cause a compilation error
            // String unescapedQuotes = "She said, "Java is fun!""; // Error: Unescaped quotes
            System.out.println("This would cause a compilation error because quotes within strings must be escaped");
            System.out.println("Correct usage: String str = \"She said, \\\"Java is fun!\\\"\";\n");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 3: Confusion between char and String literals
        System.out.println("ERROR 3: Confusion between char and String literals");
        
        // This is valid but might be confusing to beginners
        char charA = 'A'; // Correct: char literal uses single quotes
        String stringA = "A"; // Correct: String literal uses double quotes
        
        System.out.println("char charA = 'A'; // This is a char literal (single character in single quotes)");
        System.out.println("String stringA = \"A\"; // This is a string literal (in double quotes)");
        
        // Demonstrating type differences
        System.out.println("charA is a primitive char type with value: " + charA);
        System.out.println("stringA is a String object: " + (stringA instanceof String));
        System.out.println();
        
        // ERROR 4: Multiline string literals without proper syntax
        System.out.println("ERROR 4: Multiline string literals without proper syntax");
        
        try {
            System.out.println("Attempting to create a multiline string without proper syntax...");
            // Uncommenting the next lines would cause a compilation error
            /*
            String multilineError = "This is line 1
            This is line 2
            This is line 3"; // Error: String literal not properly terminated
            */
            System.out.println("This would cause a compilation error because string literals cannot span multiple lines without escape characters");
            System.out.println("Correct usage: String str = \"Line 1\\nLine 2\\nLine 3\";");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 5: Forgetting that string literals are immutable
        System.out.println("ERROR 5: Forgetting that string literals are immutable");
        
        String original = "Hello";
        original.concat(", World!"); // This doesn't modify the original string
        System.out.println("After original.concat(\", World!\"): " + original); // Still prints "Hello"
        
        // Correct way to concatenate
        original = original.concat(", World!"); // Assign the result back to the variable
        System.out.println("After original = original.concat(\", World!\"): " + original); // Now prints "Hello, World!"
        System.out.println();
        
        // Summary of common errors
        System.out.println("--- Common Errors with String Literals ---");
        System.out.println("1. Using single quotes instead of double quotes for string literals");
        System.out.println("2. Not escaping double quotes within string literals");
        System.out.println("3. Confusing char literals (single quotes) with string literals (double quotes)");
        System.out.println("4. Attempting to create multiline string literals without escape sequences");
        System.out.println("5. Forgetting that string literals and String objects are immutable");
    }
}
/**
 * CON1A1_Err.java
 * 
 * This program demonstrates common errors related to literals in Java.
 * Knowledge Point: CON-1.A.1 - A literal is the source code representation of a fixed value.
 */
public class CON1A1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Java Literals:\n");
        
        // Example 1: Integer literal errors
        System.out.println("Example 1: Integer literal errors");
        
        // Error 1: Invalid octal literal (digits must be 0-7)
        // int invalidOctal = 09;        // Error: The digit 9 is not valid in octal
        System.out.println("Error 1: Invalid octal literal - int invalidOctal = 09; // Digits in octal must be 0-7");
        
        // Error 2: Invalid hex literal (missing 0x prefix)
        // int invalidHex = 2A;          // Error: Missing 0x prefix for hexadecimal
        System.out.println("Error 2: Invalid hex literal - int invalidHex = 2A; // Missing 0x prefix");
        
        // Error 3: Invalid binary literal (missing 0b prefix)
        // int invalidBinary = 101010;   // This is treated as decimal, not binary
        System.out.println("Error 3: Invalid binary literal - int invalidBinary = 101010; // Missing 0b prefix");
        System.out.println();
        
        // Example 2: Floating-point literal errors
        System.out.println("Example 2: Floating-point literal errors");
        
        // Error 4: Missing f suffix for float assignment
        // float missingF = 3.14159;    // Error: Double literal cannot be assigned to float without cast
        System.out.println("Error 4: Missing f suffix - float missingF = 3.14159; // Missing f suffix");
        
        // Error 5: Invalid scientific notation
        // double invalidScientific = 1.23e;  // Error: Incomplete exponent
        System.out.println("Error 5: Invalid scientific notation - double invalidScientific = 1.23e; // Incomplete exponent");
        System.out.println();
        
        // Example 3: Character literal errors
        System.out.println("Example 3: Character literal errors");
        
        // Error 6: Empty character literal
        // char emptyChar = '';          // Error: Empty character literal
        System.out.println("Error 6: Empty character literal - char emptyChar = ''; // Cannot be empty");
        
        // Error 7: Multiple characters in character literal
        // char multiChar = 'AB';        // Error: Too many characters
        System.out.println("Error 7: Multiple characters - char multiChar = 'AB'; // Too many characters");
        
        // Error 8: Using double quotes for char
        // char wrongQuotes = "A";       // Error: Cannot use double quotes for char
        System.out.println("Error 8: Wrong quotes - char wrongQuotes = \"A\"; // Cannot use double quotes");
        
        // Error 9: Invalid escape sequence
        // char invalidEscape = '\z';    // Error: Invalid escape sequence
        System.out.println("Error 9: Invalid escape - char invalidEscape = '\\z'; // Invalid escape sequence");
        System.out.println();
        
        // Example 4: String literal errors
        System.out.println("Example 4: String literal errors");
        
        // Error 10: Unclosed string literal
        // String unclosedString = "This string is not closed;  // Error: Unclosed string literal
        System.out.println("Error 10: Unclosed string - String unclosedString = \"This string is not closed; // Missing closing quote");
        
        // Error 11: Invalid line break in string
        // String invalidLineBreak = "This string has a line
        // break in it";                 // Error: String literals cannot span multiple lines
        System.out.println("Error 11: Invalid line break - String literals cannot span multiple lines without escape sequences");
        
        // Error 12: Using single quotes for string
        // String wrongQuotes = 'Hello'; // Error: Cannot use single quotes for string
        System.out.println("Error 12: Wrong quotes - String wrongQuotes = 'Hello'; // Cannot use single quotes");
        System.out.println();
        
        // Example 5: Boolean literal errors
        System.out.println("Example 5: Boolean literal errors");
        
        // Error 13: Capitalized boolean literals
        // boolean invalidTrue = True;    // Error: 'True' is not a boolean literal (case sensitive)
        // boolean invalidFalse = False;  // Error: 'False' is not a boolean literal (case sensitive)
        System.out.println("Error 13: Capitalized booleans - boolean invalidTrue = True; // Must be lowercase");
        
        // Error 14: Quoted boolean literals
        // boolean quotedBool = "true";   // Error: String cannot be assigned to boolean
        System.out.println("Error 14: Quoted booleans - boolean quotedBool = \"true\"; // Cannot use quotes");
        System.out.println();
        
        // Example 6: Null literal errors
        System.out.println("Example 6: Null literal errors");
        
        // Error 15: Assigning null to primitive
        // int nullInt = null;           // Error: Cannot assign null to primitive types
        System.out.println("Error 15: Null to primitive - int nullInt = null; // Cannot assign null to primitives");
        
        // Error 16: Capitalized null
        // String nullString = Null;     // Error: 'Null' is not a literal (case sensitive)
        System.out.println("Error 16: Capitalized null - String nullString = Null; // Must be lowercase");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Literal Errors ---");
        System.out.println("1. Literals must follow specific syntax rules for each type");
        System.out.println("2. Integer literals must use correct prefixes for non-decimal bases (0 for octal, 0x for hex, 0b for binary)");
        System.out.println("3. Float literals must have an 'f' suffix to avoid implicit casting issues");
        System.out.println("4. Character literals must use single quotes and contain exactly one character");
        System.out.println("5. String literals must use double quotes and cannot span multiple lines without escape sequences");
        System.out.println("6. Boolean literals (true/false) and null are case-sensitive and must be lowercase");
        System.out.println("7. null cannot be assigned to primitive types, only to reference types");
    }
}
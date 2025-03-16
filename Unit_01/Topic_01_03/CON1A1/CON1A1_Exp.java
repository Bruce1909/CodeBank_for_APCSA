/**
 * CON1A1_Exp.java
 * 
 * This program demonstrates the concept of literals in Java.
 * Knowledge Point: CON-1.A.1 - A literal is the source code representation of a fixed value.
 */
public class CON1A1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Java Literals:\n");
        
        // Example 1: Integer literals
        System.out.println("Example 1: Integer literals");
        int decimalLiteral = 42;        // Decimal (base 10)
        int octalLiteral = 052;         // Octal (base 8) - starts with 0
        int hexLiteral = 0x2A;          // Hexadecimal (base 16) - starts with 0x
        int binaryLiteral = 0b101010;   // Binary (base 2) - starts with 0b
        
        System.out.println("Decimal literal: " + decimalLiteral);
        System.out.println("Octal literal: " + octalLiteral);
        System.out.println("Hexadecimal literal: " + hexLiteral);
        System.out.println("Binary literal: " + binaryLiteral);
        System.out.println();
        
        // Example 2: Floating-point literals
        System.out.println("Example 2: Floating-point literals");
        double doubleLiteral1 = 3.14159;    // Standard notation
        double doubleLiteral2 = 3.14159e0;   // Scientific notation
        float floatLiteral = 3.14159f;       // Float literal (note the 'f' suffix)
        
        System.out.println("Double literal (standard): " + doubleLiteral1);
        System.out.println("Double literal (scientific): " + doubleLiteral2);
        System.out.println("Float literal: " + floatLiteral);
        System.out.println();
        
        // Example 3: Character literals
        System.out.println("Example 3: Character literals");
        char charLiteral1 = 'A';             // Regular character
        char charLiteral2 = '\u0041';        // Unicode representation of 'A'
        char charLiteral3 = '\n';           // Newline escape sequence
        
        System.out.println("Character literal 'A': " + charLiteral1);
        System.out.println("Unicode character literal '\\u0041': " + charLiteral2);
        System.out.println("Newline character literal: [" + charLiteral3 + "]" + " (newline appears between brackets)");
        System.out.println();
        
        // Example 4: Boolean literals
        System.out.println("Example 4: Boolean literals");
        boolean boolLiteral1 = true;         // true literal
        boolean boolLiteral2 = false;        // false literal
        
        System.out.println("Boolean literal true: " + boolLiteral1);
        System.out.println("Boolean literal false: " + boolLiteral2);
        System.out.println();
        
        // Example 5: String literals
        System.out.println("Example 5: String literals");
        String stringLiteral1 = "Hello, World!";  // Regular string
        String stringLiteral2 = "";              // Empty string
        String stringLiteral3 = "Line 1\nLine 2"; // String with escape sequence
        
        System.out.println("String literal: " + stringLiteral1);
        System.out.println("Empty string literal: [" + stringLiteral2 + "]");
        System.out.println("String literal with newline: " + stringLiteral3);
        System.out.println();
        
        // Example 6: The null literal
        System.out.println("Example 6: The null literal");
        String nullReference = null;          // The null literal
        
        System.out.println("Null literal: " + nullReference);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Literals ---");
        System.out.println("1. A literal is the source code representation of a fixed value (CON-1.A.1)");
        System.out.println("2. Java supports various types of literals: integer, floating-point, character, boolean, string, and null");
        System.out.println("3. Integer literals can be expressed in decimal, octal, hexadecimal, or binary");
        System.out.println("4. Floating-point literals can use standard or scientific notation");
        System.out.println("5. Character literals are enclosed in single quotes");
        System.out.println("6. String literals are enclosed in double quotes");
        System.out.println("7. Boolean literals are either true or false");
        System.out.println("8. The null literal represents a reference that does not refer to any object");
    }
}
/**
 * CON1B4_Err.java
 * 
 * This program demonstrates common errors related to compound assignment operators in Java.
 * Knowledge Point: CON-1.B.4 - Compound assignment operators (+=, −=, *=, /=, %=) 
 * can be used in place of the assignment operator.
 */
public class CON1B4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Compound Assignment Operators:\n");
        
        // Example 1: Order of operations confusion
        System.out.println("Example 1: Order of operations confusion");
        
        int a = 10;
        int b = 5;
        int c = 2;
        
        // Error 1: Misunderstanding how compound assignment works with expressions
        a = 10;  // Reset a
        a += b * c;  // This is equivalent to: a = a + (b * c), not (a + b) * c
        
        System.out.println("a = 10, b = 5, c = 2");
        System.out.println("After a += b * c: " + a);
        System.out.println("Common misconception: Thinking a += b * c is (a + b) * c = (10 + 5) * 2 = 30");
        System.out.println("Correct understanding: a += b * c is a = a + (b * c) = 10 + (5 * 2) = 20");
        System.out.println();
        
        // Example 2: Type conversion issues
        System.out.println("Example 2: Type conversion issues");
        
        int intValue = 10;
        double doubleValue = 2.5;
        
        // Error 2: Not understanding implicit casting in compound assignment
        intValue += doubleValue;  // This works and is equivalent to: intValue = (int)(intValue + doubleValue)
        
        System.out.println("intValue = 10, doubleValue = 2.5");
        System.out.println("After intValue += doubleValue: " + intValue);
        System.out.println("Note: This is not an error, but often misunderstood");
        System.out.println("The compound assignment performs an implicit cast: intValue = (int)(intValue + doubleValue)");
        System.out.println();
        
        // Example 3: Division assignment with integer division
        System.out.println("Example 3: Division assignment with integer division");
        
        // Error 3: Integer division truncation in compound assignment
        int x = 5;
        x /= 2;  // This is equivalent to: x = x / 2 (integer division)
        
        System.out.println("x = 5");
        System.out.println("After x /= 2: " + x);
        System.out.println("Common misconception: Expecting x to be 2.5");
        System.out.println("Correct understanding: Integer division truncates the decimal part, so x = 2");
        System.out.println();
        
        // Example 4: Attempting to use compound assignment with constants
        System.out.println("Example 4: Attempting to use compound assignment with constants");
        
        // Error 4: Using compound assignment with final variables
        final int CONSTANT = 100;
        // CONSTANT += 10;  // Error: Cannot assign a value to final variable
        
        System.out.println("final int CONSTANT = 100;");
        System.out.println("Error: CONSTANT += 10; - Cannot assign a value to final variable");
        System.out.println("Correct understanding: Final variables cannot be modified after initialization");
        System.out.println();
        
        // Example 5: Attempting to use compound assignment with literals
        System.out.println("Example 5: Attempting to use compound assignment with literals");
        
        // Error 5: Using compound assignment with literals
        // 10 += 5;  // Error: Left side of assignment must be a variable
        
        System.out.println("Error: 10 += 5; - Left side of assignment must be a variable");
        System.out.println("Correct understanding: Compound assignment operators can only be used with variables");
        System.out.println();
        
        // Example 6: Attempting to use compound assignment with incompatible types
        System.out.println("Example 6: Attempting to use compound assignment with incompatible types");
        
        String str = "Hello";
        // str %= 2;  // Error: Bad operand types for binary operator '%='
        
        System.out.println("String str = \"Hello\";");
        System.out.println("Error: str %= 2; - Bad operand types for binary operator '%='");
        System.out.println("Correct understanding: Compound operators must be used with compatible types");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Compound Assignment Operator Errors ---");
        System.out.println("1. Compound assignment operators follow the standard order of operations");
        System.out.println("2. Compound assignment includes an implicit cast when needed");
        System.out.println("3. Integer division in compound assignment still truncates the decimal part");
        System.out.println("4. Compound assignment cannot be used with final variables");
        System.out.println("5. The left side of a compound assignment must be a variable");
        System.out.println("6. The operation must be valid for the types involved");
    }
}
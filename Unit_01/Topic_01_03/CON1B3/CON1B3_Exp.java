/**
 * CON1B3_Exp.java
 * 
 * This program demonstrates how the value of an expression has a type based on the evaluation of the expression.
 * Knowledge Point: CON-1.B.3 - The value of an expression has a type based on the evaluation of the expression.
 */
public class CON1B3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Expression Types:\n");
        
        // Example 1: Arithmetic expressions with integers
        System.out.println("Example 1: Arithmetic expressions with integers");
        int a = 10;
        int b = 3;
        int intResult = a + b;  // Expression evaluates to an int
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + intResult + " (type: int)");
        System.out.println("a - b = " + (a - b) + " (type: int)");
        System.out.println("a * b = " + (a * b) + " (type: int)");
        System.out.println("a / b = " + (a / b) + " (type: int)");
        System.out.println("a % b = " + (a % b) + " (type: int)");
        System.out.println();
        
        // Example 2: Arithmetic expressions with mixed types
        System.out.println("Example 2: Arithmetic expressions with mixed types");
        double c = 10.5;
        double doubleResult = a + c;  // Expression evaluates to a double (int is promoted)
        
        System.out.println("a = " + a + " (type: int), c = " + c + " (type: double)");
        System.out.println("a + c = " + doubleResult + " (type: double)");
        System.out.println("a * c = " + (a * c) + " (type: double)");
        System.out.println("c / a = " + (c / a) + " (type: double)");
        System.out.println();
        
        // Example 3: Integer division vs. floating-point division
        System.out.println("Example 3: Integer division vs. floating-point division");
        int intDivision = a / b;  // Integer division (result is int)
        double doubleDivision = (double) a / b;  // Floating-point division (result is double)
        
        System.out.println("a / b = " + intDivision + " (type: int)");
        System.out.println("(double) a / b = " + doubleDivision + " (type: double)");
        System.out.println();
        
        // Example 4: Boolean expressions
        System.out.println("Example 4: Boolean expressions");
        boolean isGreater = a > b;  // Expression evaluates to a boolean
        boolean isEqual = a == b;  // Expression evaluates to a boolean
        boolean logicalResult = isGreater && !isEqual;  // Expression evaluates to a boolean
        
        System.out.println("a > b = " + isGreater + " (type: boolean)");
        System.out.println("a == b = " + isEqual + " (type: boolean)");
        System.out.println("isGreater && !isEqual = " + logicalResult + " (type: boolean)");
        System.out.println();
        
        // Example 5: String concatenation expressions
        System.out.println("Example 5: String concatenation expressions");
        String str1 = "Hello";
        String str2 = "World";
        String strResult = str1 + " " + str2;  // Expression evaluates to a String
        
        System.out.println("str1 = \"" + str1 + "\", str2 = \"" + str2 + "\"");
        System.out.println("str1 + \" \" + str2 = \"" + strResult + "\" (type: String)");
        System.out.println();
        
        // Example 6: Mixed type expressions with String
        System.out.println("Example 6: Mixed type expressions with String");
        String numStr = "The value is: " + a;  // int is converted to String
        String boolStr = "The result is: " + isGreater;  // boolean is converted to String
        
        System.out.println("\"The value is: \" + a = \"" + numStr + "\" (type: String)");
        System.out.println("\"The result is: \" + isGreater = \"" + boolStr + "\" (type: String)");
        System.out.println();
        
        // Example 7: Character expressions
        System.out.println("Example 7: Character expressions");
        char ch1 = 'A';
        char ch2 = 'B';
        int charSum = ch1 + ch2;  // Expression evaluates to an int (chars are promoted)
        
        System.out.println("ch1 = '" + ch1 + "', ch2 = '" + ch2 + "'");
        System.out.println("ch1 + ch2 = " + charSum + " (type: int, ASCII values are added)");
        System.out.println("(char)(ch1 + 1) = '" + (char)(ch1 + 1) + "' (type: char, 'A' + 1 = 'B')");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Expression Types ---");
        System.out.println("1. The value of an expression has a type based on the evaluation of the expression (CON-1.B.3)");
        System.out.println("2. Arithmetic expressions with integers result in integer values");
        System.out.println("3. Arithmetic expressions with mixed types result in the higher precision type");
        System.out.println("4. Comparison and logical expressions result in boolean values");
        System.out.println("5. String concatenation expressions result in String values");
        System.out.println("6. Character expressions in arithmetic operations are promoted to int");
    }
}
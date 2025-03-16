/**
 * CON1B3_Err.java
 * 
 * This program demonstrates common errors related to expression types in Java.
 * Knowledge Point: CON-1.B.3 - The value of an expression has a type based on the evaluation of the expression.
 */
public class CON1B3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Expression Types:\n");
        
        // Example 1: Type mismatch in assignment
        System.out.println("Example 1: Type mismatch in assignment");
        
        // Error 1: Assigning double to int without casting
        // int x = 3.14;  // Error: Possible loss of precision
        
        System.out.println("Error 1: int x = 3.14; - Cannot assign double to int without casting");
        System.out.println("Correct: int x = (int)3.14; - Explicit cast is required");
        System.out.println();
        
        // Example 2: Integer division misconception
        System.out.println("Example 2: Integer division misconception");
        
        int a = 5;
        int b = 2;
        int result1 = a / b;  // Integer division results in 2, not 2.5
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a / b = " + result1 + " (type: int, decimal part is truncated)");
        System.out.println("Common misconception: Expecting 2.5 as the result");
        System.out.println("Correct approach for 2.5: (double)a / b = " + ((double)a / b) + " (type: double)");
        System.out.println();
        
        // Example 3: Char arithmetic confusion
        System.out.println("Example 3: Char arithmetic confusion");
        
        char ch1 = 'A';
        char ch2 = 'B';
        // char sumChar = ch1 + ch2;  // Error: Cannot convert from int to char
        
        System.out.println("ch1 = '" + ch1 + "', ch2 = '" + ch2 + "'");
        System.out.println("Error 3: char sumChar = ch1 + ch2; - Cannot assign int to char without casting");
        System.out.println("This is because char arithmetic operations result in int values");
        System.out.println("Correct: char sumChar = (char)(ch1 + ch2); - Explicit cast is required");
        System.out.println();
        
        // Example 4: Boolean type errors
        System.out.println("Example 4: Boolean type errors");
        
        // Error 4: Using numeric values for boolean
        // boolean flag = 1;  // Error: Incompatible types
        
        System.out.println("Error 4: boolean flag = 1; - Cannot convert from int to boolean");
        System.out.println("Unlike C/C++, Java does not treat non-zero values as true");
        System.out.println("Correct: boolean flag = (1 != 0); - Use a boolean expression");
        System.out.println();
        
        // Example 5: String concatenation confusion
        System.out.println("Example 5: String concatenation confusion");
        
        int num1 = 5;
        int num2 = 10;
        String str1 = num1 + num2 + " is the sum";  // Evaluates to "15 is the sum"
        String str2 = "The sum is " + num1 + num2;  // Evaluates to "The sum is 510"
        
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        System.out.println("num1 + num2 + \" is the sum\" = \"" + str1 + "\"");
        System.out.println("\"The sum is \" + num1 + num2 = \"" + str2 + "\"");
        System.out.println("Error 5: Unexpected string concatenation results");
        System.out.println("Correct for 'The sum is 15': \"The sum is \" + (num1 + num2) = \"" + ("The sum is " + (num1 + num2)) + "\"");
        System.out.println();
        
        // Example 6: Mixed type operations
        System.out.println("Example 6: Mixed type operations");
        
        int i = 10;
        double d = 2.5;
        // int result2 = i * d;  // Error: Cannot convert from double to int
        
        System.out.println("i = " + i + " (type: int), d = " + d + " (type: double)");
        System.out.println("Error 6: int result2 = i * d; - Cannot assign double to int without casting");
        System.out.println("This is because operations between int and double result in double values");
        System.out.println("Correct: int result2 = (int)(i * d); - Explicit cast is required");
        System.out.println();
        
        // Example 7: Compound expression type confusion
        System.out.println("Example 7: Compound expression type confusion");
        
        double result3 = 10 / 4 * 2.5;  // Evaluates to 5.0, not 6.25
        
        System.out.println("10 / 4 * 2.5 = " + result3 + " (type: double)");
        System.out.println("Error 7: Expecting 6.25 as the result");
        System.out.println("This is because 10 / 4 is evaluated as integer division first (2), then multiplied by 2.5");
        System.out.println("Correct for 6.25: 10.0 / 4 * 2.5 = " + (10.0 / 4 * 2.5));
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Expression Type Errors ---");
        System.out.println("1. The type of an expression affects how it's evaluated and what values it can produce");
        System.out.println("2. Integer division always results in an integer (truncates decimal part)");
        System.out.println("3. Char arithmetic operations result in int values");
        System.out.println("4. Boolean expressions must evaluate to true or false, not numeric values");
        System.out.println("5. String concatenation evaluates from left to right and converts other types to String");
        System.out.println("6. Mixed type operations result in the higher precision type");
        System.out.println("7. Expression evaluation order and type conversions can affect the final result");
    }
}
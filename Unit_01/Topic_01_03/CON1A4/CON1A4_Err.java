/**
 * CON1A4_Err.java
 * 
 * This program demonstrates common errors related to arithmetic operations with int values.
 * Knowledge Point: CON-1.A.4 - An arithmetic operation that uses two int values will evaluate to an int value.
 */
public class CON1A4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with int Arithmetic Operations:\n");
        
        // Example 1: Integer division truncation errors
        System.out.println("Example 1: Integer division truncation errors");
        
        // Error 1: Expecting decimal result from integer division
        int a = 7;
        int b = 2;
        int result = a / b;  // Result is 3, not 3.5
        System.out.println("Integer division: 7 / 2 = " + result + " (truncates decimal part, often unexpected)");
        
        // Error 2: Trying to store integer division result in double doesn't preserve decimal
        double doubleResult = a / b;  // Still 3.0, not 3.5
        System.out.println("Storing int division in double: 7 / 2 = " + doubleResult + " (still truncated, often unexpected)");
        
        // Correct way to get decimal result
        double correctResult = (double) a / b;  // Now 3.5
        System.out.println("Correct way: (double) 7 / 2 = " + correctResult + " (casting before division preserves decimal)");
        System.out.println();
        
        // Example 2: Integer overflow errors
        System.out.println("Example 2: Integer overflow errors");
        
        // Error 3: Integer overflow without warning
        int maxInt = Integer.MAX_VALUE;  // 2,147,483,647
        int overflowResult = maxInt + 1;  // Overflows to -2,147,483,648
        System.out.println("Integer.MAX_VALUE = " + maxInt);
        System.out.println("Integer.MAX_VALUE + 1 = " + overflowResult + " (overflows without warning)");
        
        // Error 4: Large multiplication overflow
        int large1 = 100000;
        int large2 = 100000;
        int product = large1 * large2;  // Overflows without warning
        System.out.println("100000 * 100000 = " + product + " (incorrect result due to overflow)");
        
        // Correct way to handle large multiplication
        long correctProduct = (long) large1 * large2;
        System.out.println("Correct way: (long) 100000 * 100000 = " + correctProduct);
        System.out.println();
        
        // Example 3: Type promotion errors
        System.out.println("Example 3: Type promotion errors");
        
        // Error 5: Assuming byte arithmetic stays as byte
        byte byte1 = 10;
        byte byte2 = 20;
        // byte byteSum = byte1 + byte2;  // Error: Cannot convert from int to byte without casting
        System.out.println("Error 5: byte byteSum = byte1 + byte2; // Cannot convert from int to byte without casting");
        
        // Error 6: Assuming short arithmetic stays as short
        short short1 = 100;
        short short2 = 200;
        // short shortSum = short1 + short2;  // Error: Cannot convert from int to short without casting
        System.out.println("Error 6: short shortSum = short1 + short2; // Cannot convert from int to short without casting");
        
        // Correct way to handle byte and short arithmetic
        byte correctByteSum = (byte) (byte1 + byte2);  // Explicit cast back to byte
        System.out.println("Correct way: byte correctByteSum = (byte) (byte1 + byte2); = " + correctByteSum);
        System.out.println();
        
        // Example 4: Assignment errors
        System.out.println("Example 4: Assignment errors");
        
        // Error 7: Trying to assign int expression to non-int without casting
        int c = 5;
        int d = 10;
        // byte byteResult = c + d;  // Error: Cannot convert from int to byte without casting
        System.out.println("Error 7: byte byteResult = c + d; // Cannot convert from int to byte without casting");
        
        // Error 8: Losing precision in casting
        int largeInt = 200;
        byte smallByte = (byte) largeInt;  // Value gets truncated due to byte range (-128 to 127)
        System.out.println("Casting large int to byte: (byte) 200 = " + smallByte + " (value gets truncated)");
        System.out.println();
        
        // Example 5: Expression evaluation errors
        System.out.println("Example 5: Expression evaluation errors");
        
        // Error 9: Expecting double result from mixed int operations
        int e = 10;
        int f = 3;
        int g = 2;
        double mixedResult = e / f * g;  // Result is 6.0, not 6.67
        System.out.println("Mixed int operations: 10 / 3 * 2 = " + mixedResult + " (int division happens first, then stored as double)");
        
        // Correct way to get accurate result
        double correctMixedResult = (double) e / f * g;  // Now 6.666...
        System.out.println("Correct way: (double) 10 / 3 * 2 = " + correctMixedResult);
        System.out.println();
        
        // Example 6: Char arithmetic errors
        System.out.println("Example 6: Char arithmetic errors");
        
        // Error 10: Assuming char arithmetic stays as char
        char char1 = 'A';  // ASCII value 65
        char char2 = 'B';  // ASCII value 66
        // char charSum = char1 + char2;  // Error: Cannot convert from int to char without casting
        System.out.println("Error 10: char charSum = char1 + char2; // Cannot convert from int to char without casting");
        
        // What actually happens with char arithmetic
        int charResult = char1 + char2;  // 65 + 66 = 131
        System.out.println("'A' + 'B' = " + charResult + " (chars are promoted to int for arithmetic)");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about int Arithmetic Operation Errors ---");
        System.out.println("1. Integer division truncates the decimal part (7/2 = 3, not 3.5)");
        System.out.println("2. Storing int division result in a double doesn't recover the truncated decimal part");
        System.out.println("3. Integer arithmetic can overflow or underflow without warning");
        System.out.println("4. Byte and short operands are promoted to int in arithmetic operations");
        System.out.println("5. The result of int arithmetic cannot be directly assigned to byte or short without casting");
        System.out.println("6. Casting large int values to smaller types can result in data loss");
        System.out.println("7. Char operands are also promoted to int in arithmetic operations");
        System.out.println("8. To get decimal results from int division, cast to double before division");
    }
}
/**
 * This program demonstrates common errors related to VAR-1.B.3: The primitive data types used in this course
 * define the set of operations for numbers and Boolean values.
 * It shows mistakes that can occur when using operations on primitive data types.
 */
public class VAR1B3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Operations on Primitive Data Types:\n");
        
        // ERROR 1: Integer division truncation
        System.out.println("ERROR 1: Integer division truncation");
        int a = 5;
        int b = 2;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a / b = " + (a / b) + " (truncated to 2, decimal part is lost)");
        System.out.println("Common mistake: Expecting decimal result from integer division");
        System.out.println("Solution: Cast at least one operand to double");
        System.out.println("(double)a / b = " + ((double)a / b) + " (correct decimal result)");
        System.out.println();
        
        // ERROR 2: Integer overflow
        System.out.println("ERROR 2: Integer overflow");
        int maxInt = Integer.MAX_VALUE; // 2,147,483,647
        System.out.println("Maximum int value: " + maxInt);
        int overflowResult = maxInt + 1;
        System.out.println("maxInt + 1 = " + overflowResult + " (negative due to overflow!)");
        System.out.println("This happens because the result exceeds the range of int type");
        System.out.println("Solution: Use a larger data type like long");
        long largeResult = (long)maxInt + 1;
        System.out.println("(long)maxInt + 1 = " + largeResult + " (correct result)");
        System.out.println();
        
        // ERROR 3: Division by zero
        System.out.println("ERROR 3: Division by zero");
        int numerator = 10;
        int denominator = 0;
        
        try {
            System.out.println("Attempting integer division by zero...");
            // The next line would cause an ArithmeticException
            int result = numerator / denominator;
            System.out.println("This line won't execute");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
            System.out.println("Integer division by zero causes an exception");
        }
        
        System.out.println("\nFloating-point division by zero behavior:");
        double x = 10.0;
        double y = 0.0;
        double result = x / y;
        System.out.println("10.0 / 0.0 = " + result + " (no exception, results in Infinity)");
        
        double negativeResult = -x / y;
        System.out.println("-10.0 / 0.0 = " + negativeResult + " (results in -Infinity)");
        
        double nanResult = 0.0 / 0.0;
        System.out.println("0.0 / 0.0 = " + nanResult + " (results in NaN - Not a Number)");
        System.out.println();
        
        // ERROR 4: Order of operations confusion
        System.out.println("ERROR 4: Order of operations confusion");
        int c = 2;
        int d = 3;
        int e = 4;
        
        System.out.println("c = " + c + ", d = " + d + ", e = " + e);
        System.out.println("c + d * e = " + (c + d * e) + " (multiplication happens before addition)");
        System.out.println("Common mistake: Assuming left-to-right evaluation");
        System.out.println("To force addition first, use parentheses: (c + d) * e = " + ((c + d) * e));
        System.out.println();
        
        // ERROR 5: Unintended integer promotion
        System.out.println("ERROR 5: Unintended integer promotion");
        byte smallValue = 40;
        byte anotherSmall = 50;
        
        // The following line would cause a compilation error if uncommented
        // byte sum = smallValue + anotherSmall; // Error: possible loss of precision
        
        System.out.println("smallValue = " + smallValue + ", anotherSmall = " + anotherSmall);
        System.out.println("Common mistake: Assuming byte + byte = byte");
        System.out.println("In Java, arithmetic operations on byte, short, or char promote to int");
        System.out.println("Solution: Cast the result back to byte");
        byte correctSum = (byte)(smallValue + anotherSmall);
        System.out.println("(byte)(smallValue + anotherSmall) = " + correctSum);
        System.out.println();
        
        // ERROR 6: Floating-point precision issues
        System.out.println("ERROR 6: Floating-point precision issues");
        double value1 = 0.1;
        double value2 = 0.2;
        double sum = value1 + value2;
        
        System.out.println("value1 = " + value1 + ", value2 = " + value2);
        System.out.println("value1 + value2 = " + sum);
        System.out.println("sum == 0.3 is " + (sum == 0.3) + " (unexpected!)");
        System.out.println("This happens because floating-point numbers have limited precision");
        System.out.println("Solution: Use a small epsilon for floating-point comparisons");
        double epsilon = 0.0000001;
        System.out.println("Math.abs(sum - 0.3) < epsilon is " + (Math.abs(sum - 0.3) < epsilon));
        System.out.println();
        
        // ERROR 7: Short-circuit evaluation misunderstanding
        System.out.println("ERROR 7: Short-circuit evaluation misunderstanding");
        boolean flag1 = false;
        boolean flag2 = true;
        
        System.out.println("flag1 = " + flag1 + ", flag2 = " + flag2);
        System.out.println("flag1 && flag2 = " + (flag1 && flag2) + " (flag2 is not evaluated due to short-circuit)");
        System.out.println("flag1 || flag2 = " + (flag1 || flag2) + " (flag2 is evaluated because flag1 is false)");
        
        System.out.println("\nDifference between & and && (bitwise vs logical):");
        int count = 0;
        boolean result1 = flag1 && (++count > 0); // count is not incremented due to short-circuit
        System.out.println("After flag1 && (++count > 0): count = " + count + " (not incremented)");
        
        boolean result2 = flag1 & (++count > 0);  // count is incremented because & evaluates both sides
        System.out.println("After flag1 & (++count > 0): count = " + count + " (incremented)");
        System.out.println();
        
        // ERROR 8: Confusion with compound assignment operators
        System.out.println("ERROR 8: Confusion with compound assignment operators");
        int value = 5;
        System.out.println("Initial value = " + value);
        
        // This is equivalent to value = value + (value * 2)
        value += value * 2;
        System.out.println("After value += value * 2: value = " + value + " (equivalent to value = value + (value * 2))");
        
        // Common mistake: thinking it's (value + value) * 2
        System.out.println("Common mistake: Assuming value += value * 2 is the same as value = (value + value) * 2");
        System.out.println();
        
        // Summary
        System.out.println("Summary of Common Errors with Operations on Primitive Types:");
        System.out.println("1. Integer division truncation (losing decimal part)");
        System.out.println("2. Integer overflow (exceeding the range of the data type)");
        System.out.println("3. Division by zero (ArithmeticException for integers, special values for floating-point)");
        System.out.println("4. Order of operations confusion (not understanding operator precedence)");
        System.out.println("5. Unintended integer promotion (byte/short operations promote to int)");
        System.out.println("6. Floating-point precision issues (limited decimal precision)");
        System.out.println("7. Short-circuit evaluation misunderstanding (difference between & and &&, | and ||)");
        System.out.println("8. Confusion with compound assignment operators (+=, -=, etc.)");
    }
}
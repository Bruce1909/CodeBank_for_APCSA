/**
 * This program demonstrates VAR-1.B.3: The primitive data types used in this course define the set of operations
 * for numbers and Boolean values.
 * It shows the operations available for numeric and Boolean primitive types in Java.
 */
public class VAR1B3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Operations for Primitive Data Types:\n");
        
        // SECTION 1: Operations for Integer Types (byte, short, int, long)
        System.out.println("SECTION 1: Operations for Integer Types");
        int a = 15;
        int b = 4;
        
        System.out.println("Integer values: a = " + a + ", b = " + b);
        System.out.println("Arithmetic operations:");
        System.out.println("  Addition: a + b = " + (a + b));
        System.out.println("  Subtraction: a - b = " + (a - b));
        System.out.println("  Multiplication: a * b = " + (a * b));
        System.out.println("  Division: a / b = " + (a / b) + " (integer division truncates)");
        System.out.println("  Modulus (remainder): a % b = " + (a % b));
        
        System.out.println("\nIncrement and decrement operations:");
        int c = a;
        System.out.println("  c = a = " + c);
        System.out.println("  Prefix increment: ++c = " + (++c) + " (increments then returns)");
        System.out.println("  c is now " + c);
        System.out.println("  Postfix increment: c++ = " + (c++) + " (returns then increments)");
        System.out.println("  c is now " + c);
        System.out.println("  Prefix decrement: --c = " + (--c) + " (decrements then returns)");
        System.out.println("  Postfix decrement: c-- = " + (c--) + " (returns then decrements)");
        System.out.println("  c is now " + c);
        
        System.out.println("\nComparison operations (return boolean):");
        System.out.println("  Equal to: a == b is " + (a == b));
        System.out.println("  Not equal to: a != b is " + (a != b));
        System.out.println("  Greater than: a > b is " + (a > b));
        System.out.println("  Less than: a < b is " + (a < b));
        System.out.println("  Greater than or equal to: a >= b is " + (a >= b));
        System.out.println("  Less than or equal to: a <= b is " + (a <= b));
        
        System.out.println("\nBitwise operations (for integer types):");
        System.out.println("  Bitwise AND: a & b = " + (a & b));
        System.out.println("  Bitwise OR: a | b = " + (a | b));
        System.out.println("  Bitwise XOR: a ^ b = " + (a ^ b));
        System.out.println("  Bitwise complement: ~a = " + (~a));
        System.out.println("  Left shift: a << 1 = " + (a << 1) + " (multiplies by 2)");
        System.out.println("  Right shift: a >> 1 = " + (a >> 1) + " (divides by 2)");
        System.out.println("  Unsigned right shift: a >>> 1 = " + (a >>> 1));
        System.out.println();
        
        // SECTION 2: Operations for Floating-Point Types (float, double)
        System.out.println("SECTION 2: Operations for Floating-Point Types");
        double x = 15.5;
        double y = 4.0;
        
        System.out.println("Floating-point values: x = " + x + ", y = " + y);
        System.out.println("Arithmetic operations:");
        System.out.println("  Addition: x + y = " + (x + y));
        System.out.println("  Subtraction: x - y = " + (x - y));
        System.out.println("  Multiplication: x * y = " + (x * y));
        System.out.println("  Division: x / y = " + (x / y) + " (floating-point division)");
        System.out.println("  Modulus (remainder): x % y = " + (x % y));
        
        System.out.println("\nSpecial floating-point values:");
        System.out.println("  Positive infinity: " + Double.POSITIVE_INFINITY);
        System.out.println("  Negative infinity: " + Double.NEGATIVE_INFINITY);
        System.out.println("  Not a Number (NaN): " + Double.NaN);
        System.out.println("  Division by zero: 5.0 / 0.0 = " + (5.0 / 0.0));
        System.out.println("  0.0 / 0.0 = " + (0.0 / 0.0) + " (NaN)");
        
        System.out.println("\nComparison operations (same as for integers):");
        System.out.println("  Equal to: x == y is " + (x == y));
        System.out.println("  Greater than: x > y is " + (x > y));
        System.out.println();
        
        // SECTION 3: Operations for Boolean Type
        System.out.println("SECTION 3: Operations for Boolean Type");
        boolean p = true;
        boolean q = false;
        
        System.out.println("Boolean values: p = " + p + ", q = " + q);
        System.out.println("Logical operations:");
        System.out.println("  Logical AND: p && q = " + (p && q) + " (short-circuit evaluation)");
        System.out.println("  Logical OR: p || q = " + (p || q) + " (short-circuit evaluation)");
        System.out.println("  Logical NOT: !p = " + (!p) + ", !q = " + (!q));
        
        System.out.println("\nBitwise boolean operations (not short-circuit):");
        System.out.println("  Bitwise AND: p & q = " + (p & q) + " (evaluates both sides)");
        System.out.println("  Bitwise OR: p | q = " + (p | q) + " (evaluates both sides)");
        System.out.println("  Bitwise XOR: p ^ q = " + (p ^ q) + " (true if operands differ)");
        
        System.out.println("\nComparison operations:");
        System.out.println("  Equal to: p == q is " + (p == q));
        System.out.println("  Not equal to: p != q is " + (p != q));
        System.out.println();
        
        // SECTION 4: Compound Assignment Operators (for all numeric types)
        System.out.println("SECTION 4: Compound Assignment Operators");
        int num = 10;
        System.out.println("Starting value: num = " + num);
        
        System.out.println("Compound assignment operations:");
        System.out.println("  Addition: num += 5 (equivalent to num = num + 5)");
        num += 5;
        System.out.println("  num is now " + num);
        
        System.out.println("  Subtraction: num -= 3 (equivalent to num = num - 3)");
        num -= 3;
        System.out.println("  num is now " + num);
        
        System.out.println("  Multiplication: num *= 2 (equivalent to num = num * 2)");
        num *= 2;
        System.out.println("  num is now " + num);
        
        System.out.println("  Division: num /= 4 (equivalent to num = num / 4)");
        num /= 4;
        System.out.println("  num is now " + num);
        
        System.out.println("  Modulus: num %= 3 (equivalent to num = num % 3)");
        num %= 3;
        System.out.println("  num is now " + num);
        System.out.println();
        
        // Summary
        System.out.println("Summary of Operations for Primitive Data Types:");
        System.out.println("1. Numeric types (byte, short, int, long, float, double) support:");
        System.out.println("   - Arithmetic operations: +, -, *, /, %");
        System.out.println("   - Increment/decrement: ++, --");
        System.out.println("   - Comparison operations: ==, !=, >, <, >=, <=");
        System.out.println("   - Compound assignment: +=, -=, *=, /=, %=");
        System.out.println("   - Integer types also support bitwise operations: &, |, ^, ~, <<, >>, >>>");
        System.out.println("2. Boolean type supports:");
        System.out.println("   - Logical operations: &&, ||, !");
        System.out.println("   - Bitwise boolean operations: &, |, ^");
        System.out.println("   - Comparison operations: ==, !=");
        System.out.println("3. Understanding these operations is essential for writing efficient and correct code");
    }
}
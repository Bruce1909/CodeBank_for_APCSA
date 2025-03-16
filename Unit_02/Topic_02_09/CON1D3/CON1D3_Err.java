/**
 * CON1D3_Err.java
 * 
 * This program demonstrates common errors related to the static Math methods in the Java Quick Reference.
 * Knowledge Point: CON-1.D.3 - The following static Math methods—including what they do and when they are used—are part of the Java Quick Reference:
 * - int abs(int x) — Returns the absolute value of an int value
 * - double abs(double x) — Returns the absolute value of a double value
 * - double pow(double base, double exponent) — Returns the value of the first parameter raised to the power of the second parameter
 * - double sqrt(double x) — Returns the positive square root of a double value
 * - double random() — Returns a double value greater than or equal to 0.0 and less than 1.0
 */
public class CON1D3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Static Math Methods:\n");
        
        // Error 1: Integer overflow with Math.abs()
        System.out.println("Error 1: Integer overflow with Math.abs()");
        int minIntValue = Integer.MIN_VALUE; // -2147483648
        int absOfMinInt = Math.abs(minIntValue);
        
        System.out.println("Integer.MIN_VALUE = " + minIntValue);
        System.out.println("Math.abs(Integer.MIN_VALUE) = " + absOfMinInt + " (still negative!)");
        System.out.println("This happens because the positive value exceeds the maximum int value");
        System.out.println("Correct approach: Use long type for large values");
        System.out.println("Math.abs((long)Integer.MIN_VALUE) = " + Math.abs((long)minIntValue));
        System.out.println();
        
        // Error 2: Type confusion with Math.pow()
        System.out.println("Error 2: Type confusion with Math.pow()");
        
        // Math.pow always returns a double, even with integer inputs
        double powResult = Math.pow(2, 3);
        System.out.println("Math.pow(2, 3) = " + powResult + " (type: double)");
        
        // Common error: Assuming integer result for integer inputs
        System.out.println("// int powInt = Math.pow(2, 3); // Error: Cannot convert from double to int");
        System.out.println("Correct approach: Cast the result to int if needed");
        System.out.println("int powInt = (int)Math.pow(2, 3); // = " + (int)Math.pow(2, 3));
        
        // Precision loss when casting to int
        double sqrtOfTwo = Math.pow(2, 0.5); // Square root of 2
        System.out.println("\nMath.pow(2, 0.5) = " + sqrtOfTwo);
        System.out.println("(int)Math.pow(2, 0.5) = " + (int)sqrtOfTwo + " (decimal part is truncated!)");
        System.out.println();
        
        // Error 3: Issues with Math.sqrt()
        System.out.println("Error 3: Issues with Math.sqrt()");
        
        // Attempting to take square root of negative number
        double sqrtNegative = Math.sqrt(-4);
        System.out.println("Math.sqrt(-4) = " + sqrtNegative + " (returns NaN, not an error)");
        System.out.println("NaN stands for 'Not a Number' - Java doesn't throw an exception");
        System.out.println("Always check for NaN when result might be invalid");
        System.out.println("Double.isNaN(Math.sqrt(-4)) = " + Double.isNaN(sqrtNegative));
        
        // Common confusion between sqrt and pow
        System.out.println("\nCommon confusion between sqrt and pow:");
        System.out.println("Math.sqrt(4) = " + Math.sqrt(4));
        System.out.println("Math.pow(4, 0.5) = " + Math.pow(4, 0.5) + " (equivalent to sqrt)");
        System.out.println("Math.pow(4, 1/2) = " + Math.pow(4, 1/2) + " (NOT equivalent! Integer division results in 0)");
        System.out.println("Correct: Math.pow(4, 1.0/2.0) = " + Math.pow(4, 1.0/2.0));
        System.out.println();
        
        // Error 4: Common mistakes with Math.random()
        System.out.println("Error 4: Common mistakes with Math.random()");
        
        // Mistake 1: Incorrect range calculation
        int incorrectDice = (int)(Math.random() * 6); // Gives 0-5, not 1-6
        System.out.println("Incorrect dice roll: (int)(Math.random() * 6) = " + incorrectDice + " (range: 0-5)");
        System.out.println("Correct dice roll: (int)(Math.random() * 6) + 1 = " + ((int)(Math.random() * 6) + 1) + " (range: 1-6)");
        
        // Mistake 2: Assuming Math.random() can return 1.0
        System.out.println("\nMath.random() never returns 1.0");
        System.out.println("Range is [0.0, 1.0) - includes 0.0 but excludes 1.0");
        
        // Mistake 3: Inconsistent rounding behavior
        double randomValue = Math.random() * 10;
        int truncatedRandom = (int)randomValue; // Truncates decimal part
        System.out.println("\nRandom value: " + randomValue);
        System.out.println("Truncated to int: " + truncatedRandom + " (decimal part is lost)");
        System.out.println("For rounding instead of truncating, use Math.round(): " + Math.round(randomValue));
        System.out.println();
        
        // Error 5: Misunderstanding method overloading
        System.out.println("Error 5: Misunderstanding method overloading");
        
        // abs has overloaded versions for different numeric types
        System.out.println("Math.abs(-5) = " + Math.abs(-5) + " (calls int version)");
        System.out.println("Math.abs(-5.0) = " + Math.abs(-5.0) + " (calls double version)");
        System.out.println("Math.abs(-5L) = " + Math.abs(-5L) + " (calls long version)");
        System.out.println("Math.abs(-5.0f) = " + Math.abs(-5.0f) + " (calls float version)");
        
        // But pow and sqrt only accept double parameters
        System.out.println("\n// Math.sqrt(int) doesn't exist, but int is automatically converted to double");
        System.out.println("Math.sqrt(4) = " + Math.sqrt(4) + " (4 is converted to 4.0)");
        System.out.println();
        
        // Summary of common errors
        System.out.println("--- Common Errors with Static Math Methods ---");
        System.out.println("1. Integer overflow with Math.abs(Integer.MIN_VALUE)");
        System.out.println("2. Type confusion with Math.pow() (always returns double)");
        System.out.println("3. Not handling NaN results from Math.sqrt() with negative inputs");
        System.out.println("4. Incorrect range calculations with Math.random()");
        System.out.println("5. Confusion about method overloading in Math class");
        System.out.println("6. Integer division in exponents (1/2 = 0 in integer division)");
        System.out.println("7. Truncating vs. rounding when converting doubles to integers");
    }
}
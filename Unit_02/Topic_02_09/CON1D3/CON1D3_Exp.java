/**
 * CON1D3_Exp.java
 * 
 * This program demonstrates the static Math methods that are part of the Java Quick Reference.
 * Knowledge Point: CON-1.D.3 - The following static Math methods—including what they do and when they are used—are part of the Java Quick Reference:
 * - int abs(int x) — Returns the absolute value of an int value
 * - double abs(double x) — Returns the absolute value of a double value
 * - double pow(double base, double exponent) — Returns the value of the first parameter raised to the power of the second parameter
 * - double sqrt(double x) — Returns the positive square root of a double value
 * - double random() — Returns a double value greater than or equal to 0.0 and less than 1.0
 */
public class CON1D3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Static Math Methods from Java Quick Reference:\n");
        
        // Example 1: Math.abs(int x) method
        System.out.println("Example 1: Math.abs(int x) method");
        int negativeInt = -42;
        int positiveInt = 42;
        
        System.out.println("Math.abs(" + negativeInt + ") = " + Math.abs(negativeInt));
        System.out.println("Math.abs(" + positiveInt + ") = " + Math.abs(positiveInt));
        System.out.println("Math.abs(0) = " + Math.abs(0));
        System.out.println("The abs method returns the absolute (positive) value of its argument");
        System.out.println();
        
        // Example 2: Math.abs(double x) method
        System.out.println("Example 2: Math.abs(double x) method");
        double negativeDouble = -3.14159;
        double positiveDouble = 2.71828;
        
        System.out.println("Math.abs(" + negativeDouble + ") = " + Math.abs(negativeDouble));
        System.out.println("Math.abs(" + positiveDouble + ") = " + Math.abs(positiveDouble));
        System.out.println("Math.abs(-0.0) = " + Math.abs(-0.0));
        System.out.println("The double version of abs works the same way but with floating-point values");
        System.out.println();
        
        // Example 3: Math.pow(double base, double exponent) method
        System.out.println("Example 3: Math.pow(double base, double exponent) method");
        double base1 = 2.0;
        double exponent1 = 3.0;
        
        System.out.println("Math.pow(" + base1 + ", " + exponent1 + ") = " + Math.pow(base1, exponent1));
        System.out.println("Math.pow(10, 2) = " + Math.pow(10, 2) + " (10 squared)");
        System.out.println("Math.pow(5, 0) = " + Math.pow(5, 0) + " (any number to the power of 0 is 1)");
        System.out.println("Math.pow(4, 0.5) = " + Math.pow(4, 0.5) + " (square root of 4)");
        System.out.println("Math.pow(8, 1.0/3.0) = " + Math.pow(8, 1.0/3.0) + " (cube root of 8)");
        System.out.println("Math.pow(2, -1) = " + Math.pow(2, -1) + " (reciprocal of 2)");
        System.out.println("The pow method raises the first argument to the power of the second argument");
        System.out.println();
        
        // Example 4: Math.sqrt(double x) method
        System.out.println("Example 4: Math.sqrt(double x) method");
        double value1 = 25.0;
        double value2 = 2.0;
        
        System.out.println("Math.sqrt(" + value1 + ") = " + Math.sqrt(value1));
        System.out.println("Math.sqrt(" + value2 + ") = " + Math.sqrt(value2) + " (irrational number)");
        System.out.println("Math.sqrt(0) = " + Math.sqrt(0));
        System.out.println("Math.sqrt(1) = " + Math.sqrt(1));
        System.out.println("The sqrt method returns the positive square root of its argument");
        System.out.println();
        
        // Example 5: Math.random() method
        System.out.println("Example 5: Math.random() method");
        
        System.out.println("First random value: " + Math.random());
        System.out.println("Second random value: " + Math.random());
        System.out.println("Third random value: " + Math.random());
        System.out.println("The random method returns a double value between 0.0 (inclusive) and 1.0 (exclusive)");
        System.out.println("Each call to Math.random() generates a new random value");
        System.out.println();
        
        // Example 6: Practical applications of Math methods
        System.out.println("Example 6: Practical applications of Math methods");
        
        // Calculate the hypotenuse of a right triangle
        double a = 3.0;
        double b = 4.0;
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hypotenuse of a right triangle with sides " + a + " and " + b + ": " + hypotenuse);
        
        // Calculate compound interest
        double principal = 1000.0;
        double rate = 0.05; // 5%
        int years = 10;
        double amount = principal * Math.pow(1 + rate, years);
        System.out.println("$" + principal + " invested at " + (rate * 100) + "% for " + years + " years: $" + amount);
        
        // Generate a random integer between 1 and 6 (simulating a die roll)
        int dieRoll = (int)(Math.random() * 6) + 1;
        System.out.println("Random die roll: " + dieRoll);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Static Math Methods ---");
        System.out.println("1. Math.abs(int x) returns the absolute value of an int value");
        System.out.println("2. Math.abs(double x) returns the absolute value of a double value");
        System.out.println("3. Math.pow(double base, double exponent) returns base raised to the power of exponent");
        System.out.println("4. Math.sqrt(double x) returns the positive square root of a double value");
        System.out.println("5. Math.random() returns a double value between 0.0 (inclusive) and 1.0 (exclusive)");
        System.out.println("6. These methods are part of the Java Quick Reference (CON-1.D.3)");
        System.out.println("7. All these methods are static and called directly on the Math class");
    }
}
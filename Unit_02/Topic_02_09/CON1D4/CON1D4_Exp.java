/**
 * CON1D4_Exp.java
 * 
 * This program demonstrates how values returned from Math.random() can be manipulated to produce random integers or doubles in a defined range.
 * Knowledge Point: CON-1.D.4 - The values returned from Math.random can be manipulated to produce a random int or double in a defined range.
 */
public class CON1D4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Math.random() Manipulations:\n");
        
        // Example 1: Basic Math.random() behavior
        System.out.println("Example 1: Basic Math.random() behavior");
        System.out.println("Math.random() = " + Math.random());
        System.out.println("Math.random() = " + Math.random());
        System.out.println("Math.random() = " + Math.random());
        System.out.println("Math.random() always returns a double value between 0.0 (inclusive) and 1.0 (exclusive)");
        System.out.println();
        
        // Example 2: Generating random integers in a range
        System.out.println("Example 2: Generating random integers in a range");
        
        // Random integer between 0 and 9 (inclusive)
        int randomDigit = (int)(Math.random() * 10);
        System.out.println("Random digit (0-9): " + randomDigit);
        System.out.println("Formula: (int)(Math.random() * 10)");
        
        // Random integer between 1 and 6 (inclusive) - simulating a die roll
        int dieRoll = (int)(Math.random() * 6) + 1;
        System.out.println("Random die roll (1-6): " + dieRoll);
        System.out.println("Formula: (int)(Math.random() * 6) + 1");
        
        // Random integer between 10 and 20 (inclusive)
        int randomTens = (int)(Math.random() * 11) + 10;
        System.out.println("Random number (10-20): " + randomTens);
        System.out.println("Formula: (int)(Math.random() * 11) + 10");
        System.out.println();
        
        // Example 3: General formula for random integers in a range
        System.out.println("Example 3: General formula for random integers in a range");
        int min = 5;
        int max = 15;
        int randomInRange = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("Random integer between " + min + " and " + max + ": " + randomInRange);
        System.out.println("General formula: (int)(Math.random() * (max - min + 1)) + min");
        System.out.println();
        
        // Example 4: Generating random doubles in a range
        System.out.println("Example 4: Generating random doubles in a range");
        
        // Random double between 0.0 and 100.0 (exclusive)
        double randomPercent = Math.random() * 100.0;
        System.out.println("Random percentage (0.0-100.0): " + randomPercent);
        System.out.println("Formula: Math.random() * 100.0");
        
        // Random double between -1.0 and 1.0 (exclusive)
        double randomUnit = (Math.random() * 2.0) - 1.0;
        System.out.println("Random unit (-1.0 to 1.0): " + randomUnit);
        System.out.println("Formula: (Math.random() * 2.0) - 1.0");
        
        // Random double between min and max
        double minDouble = 2.5;
        double maxDouble = 7.5;
        double randomDoubleInRange = Math.random() * (maxDouble - minDouble) + minDouble;
        System.out.println("Random double between " + minDouble + " and " + maxDouble + ": " + randomDoubleInRange);
        System.out.println("General formula: Math.random() * (max - min) + min");
        System.out.println();
        
        // Example 5: Practical applications
        System.out.println("Example 5: Practical applications");
        
        // Simulating a coin flip
        boolean coinFlip = Math.random() < 0.5;
        System.out.println("Coin flip (true=heads, false=tails): " + coinFlip);
        
        // Generating random letter (A-Z)
        char randomLetter = (char)((int)(Math.random() * 26) + 'A');
        System.out.println("Random uppercase letter: " + randomLetter);
        
        // Simulating percentage chance (e.g., 30% chance of success)
        boolean success = Math.random() < 0.3;
        System.out.println("30% chance of success: " + (success ? "Success!" : "Failure"));
        System.out.println();
        
        // Example 6: Rounding random values
        System.out.println("Example 6: Rounding random values");
        
        // Random double with 2 decimal places
        double randomRounded = Math.round(Math.random() * 100.0) / 100.0;
        System.out.println("Random value with 2 decimal places: " + randomRounded);
        System.out.println("Formula: Math.round(Math.random() * 100.0) / 100.0");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Math.random() Manipulations ---");
        System.out.println("1. Math.random() returns a double between 0.0 (inclusive) and 1.0 (exclusive)");
        System.out.println("2. For random integers from 0 to n-1: (int)(Math.random() * n)");
        System.out.println("3. For random integers from 1 to n: (int)(Math.random() * n) + 1");
        System.out.println("4. For random integers from min to max: (int)(Math.random() * (max - min + 1)) + min");
        System.out.println("5. For random doubles from min to max: Math.random() * (max - min) + min");
        System.out.println("6. Math.random() can be combined with other operations for various applications");
        System.out.println("7. The values returned from Math.random can be manipulated to produce random values in any range (CON-1.D.4)");
    }
}
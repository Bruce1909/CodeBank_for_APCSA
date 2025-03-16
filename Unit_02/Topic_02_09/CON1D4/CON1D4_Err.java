/**
 * CON1D4_Err.java
 * 
 * This program demonstrates common errors related to manipulating Math.random() to produce random values in defined ranges.
 * Knowledge Point: CON-1.D.4 - The values returned from Math.random can be manipulated to produce a random int or double in a defined range.
 */
public class CON1D4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Math.random() Manipulations:\n");
        
        // Error 1: Incorrect range calculation for integers
        System.out.println("Error 1: Incorrect range calculation for integers");
        
        // Attempting to generate a random number between 1 and 6 (die roll)
        int incorrectDieRoll = (int)(Math.random() * 6); // INCORRECT: Gives 0-5, not 1-6
        System.out.println("Incorrect die roll: (int)(Math.random() * 6) = " + incorrectDieRoll);
        System.out.println("This formula gives numbers from 0 to 5, not 1 to 6");
        
        // Correct approach
        int correctDieRoll = (int)(Math.random() * 6) + 1;
        System.out.println("Correct die roll: (int)(Math.random() * 6) + 1 = " + correctDieRoll);
        System.out.println();
        
        // Error 2: Incorrect calculation of range width
        System.out.println("Error 2: Incorrect calculation of range width");
        
        int min = 10;
        int max = 20;
        
        // Incorrect: Using (max - min) instead of (max - min + 1)
        int incorrectRange = (int)(Math.random() * (max - min)) + min; // INCORRECT: Gives 10-19, not 10-20
        System.out.println("Incorrect range (10-20): (int)(Math.random() * (max - min)) + min = " + incorrectRange);
        System.out.println("This formula gives numbers from " + min + " to " + (max - 1) + ", not " + min + " to " + max);
        
        // Correct approach
        int correctRange = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("Correct range (10-20): (int)(Math.random() * (max - min + 1)) + min = " + correctRange);
        System.out.println();
        
        // Error 3: Forgetting to cast to int
        System.out.println("Error 3: Forgetting to cast to int");
        
        // Incorrect: Forgetting to cast to int
        double notAnInt = Math.random() * 10; // INCORRECT: Gives a double, not an int
        System.out.println("Not an integer: Math.random() * 10 = " + notAnInt);
        System.out.println("This gives a double value, not an integer");
        
        // Correct approach
        int properInt = (int)(Math.random() * 10);
        System.out.println("Proper integer: (int)(Math.random() * 10) = " + properInt);
        System.out.println();
        
        // Error 4: Incorrect order of operations
        System.out.println("Error 4: Incorrect order of operations");
        
        // Incorrect: Casting to int after adding the minimum
        int incorrectOrder = (int)(Math.random() * 6 + 1); // This works but is less clear
        System.out.println("Less clear order: (int)(Math.random() * 6 + 1) = " + incorrectOrder);
        
        // Even worse: Incorrect parentheses placement
        int veryIncorrect = (int)Math.random() * 6 + 1; // INCORRECT: Gives 0 or 1 most of the time
        System.out.println("Incorrect parentheses: (int)Math.random() * 6 + 1 = " + veryIncorrect);
        System.out.println("This first casts Math.random() to int (giving 0), then multiplies by 6");
        
        // Correct approach with clear order of operations
        int correctOrder = (int)(Math.random() * 6) + 1;
        System.out.println("Correct order: (int)(Math.random() * 6) + 1 = " + correctOrder);
        System.out.println();
        
        // Error 5: Misunderstanding double ranges
        System.out.println("Error 5: Misunderstanding double ranges");
        
        double minDouble = 2.5;
        double maxDouble = 7.5;
        
        // Incorrect: Adding +1 for double ranges (like we do for integers)
        double incorrectDouble = Math.random() * (maxDouble - minDouble + 1) + minDouble; // INCORRECT
        System.out.println("Incorrect double range: Math.random() * (max - min + 1) + min = " + incorrectDouble);
        System.out.println("This formula gives numbers from " + minDouble + " to " + (maxDouble + 1) + ", not " + minDouble + " to " + maxDouble);
        
        // Correct approach for doubles
        double correctDouble = Math.random() * (maxDouble - minDouble) + minDouble;
        System.out.println("Correct double range: Math.random() * (max - min) + min = " + correctDouble);
        System.out.println();
        
        // Error 6: Assuming Math.random() can return exactly 1.0
        System.out.println("Error 6: Assuming Math.random() can return exactly 1.0");
        
        System.out.println("Math.random() returns values in the range [0.0, 1.0)");
        System.out.println("This means it includes 0.0 but excludes 1.0");
        System.out.println("When scaling to a range, the maximum value is also excluded");
        System.out.println("For integers, we add 1 to the range to include the maximum value");
        System.out.println();
        
        // Error 7: Inconsistent rounding vs. truncation
        System.out.println("Error 7: Inconsistent rounding vs. truncation");
        
        double randomValue = Math.random() * 10;
        System.out.println("Random value: " + randomValue);
        
        // Truncation (casting to int)
        int truncated = (int)randomValue;
        System.out.println("Truncated (casting): (int)value = " + truncated + " (decimal part is discarded)");
        
        // Rounding
        int rounded = (int)Math.round(randomValue);
        System.out.println("Rounded: (int)Math.round(value) = " + rounded + " (rounded to nearest integer)");
        System.out.println("Be consistent with your approach - don't mix truncation and rounding");
        System.out.println();
        
        // Summary of common errors
        System.out.println("--- Common Errors with Math.random() Manipulations ---");
        System.out.println("1. Forgetting to add the minimum value: (int)(Math.random() * range)");
        System.out.println("2. Incorrect range calculation: Using (max - min) instead of (max - min + 1) for integers");
        System.out.println("3. Forgetting to cast to int when integer results are needed");
        System.out.println("4. Incorrect order of operations: (int)Math.random() * range vs. (int)(Math.random() * range)");
        System.out.println("5. Using the integer formula for double ranges (adding +1 unnecessarily)");
        System.out.println("6. Assuming Math.random() can return exactly 1.0 (it can't)");
        System.out.println("7. Mixing truncation and rounding inconsistently");
    }
}
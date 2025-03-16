/**
 * CON1C4_Err.java
 * 
 * This program demonstrates common errors related to rounding double values to the nearest integer.
 * Knowledge Point: CON-1.C.4 - Values of type double can be rounded to the nearest integer by (int)(x + 0.5) or (int)(x – 0.5) for negative numbers.
 */
public class CON1C4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors when Rounding double Values to the Nearest Integer:\n");
        
        // Example 1: Using the same formula for both positive and negative numbers
        System.out.println("Example 1: Using the same formula for both positive and negative numbers");
        
        // Error 1: Using (int)(x + 0.5) for negative numbers
        double negativeValue = -3.7;
        int incorrectRounded = (int)(negativeValue + 0.5);  // Incorrect for negative numbers
        int correctRounded = (int)(negativeValue - 0.5);    // Correct for negative numbers
        
        System.out.println("double negativeValue = " + negativeValue);
        System.out.println("int incorrectRounded = (int)(negativeValue + 0.5); // Result: " + incorrectRounded);
        System.out.println("Error: Adding 0.5 to a negative number before casting doesn't round correctly");
        System.out.println("Correction: int correctRounded = (int)(negativeValue - 0.5); // Result: " + correctRounded);
        System.out.println();
        
        // Example 2: Forgetting to check the sign of the number
        System.out.println("Example 2: Forgetting to check the sign of the number");
        
        // Error 2: Not checking if the number is positive or negative
        double[] mixedValues = {2.7, -2.7};
        
        System.out.println("Using the same formula for all numbers without checking sign:");
        for (double value : mixedValues) {
            int rounded = (int)(value + 0.5);  // Only correct for positive numbers
            System.out.println(value + " incorrectly rounds to " + rounded + " (using (int)(x + 0.5) for all)");
        }
        
        System.out.println("\nCorrection - Check sign before rounding:");
        for (double value : mixedValues) {
            int rounded;
            if (value >= 0) {
                rounded = (int)(value + 0.5);  // For positive numbers
            } else {
                rounded = (int)(value - 0.5);  // For negative numbers
            }
            System.out.println(value + " correctly rounds to " + rounded + " (using sign-specific formula)");
        }
        System.out.println();
        
        // Example 3: Confusion with Math.round() vs manual rounding
        System.out.println("Example 3: Confusion with Math.round() vs manual rounding");
        
        // Error 3: Not understanding the difference between Math.round() and manual rounding
        double value = 3.5;
        long mathRounded = Math.round(value);      // Returns long
        int manualRounded = (int)(value + 0.5);   // Returns int
        
        System.out.println("double value = " + value);
        System.out.println("long mathRounded = Math.round(value); // Result: " + mathRounded);
        System.out.println("int manualRounded = (int)(value + 0.5); // Result: " + manualRounded);
        System.out.println("Error: Some might not realize Math.round() returns long, not int");
        System.out.println("Correction: int mathRoundedAsInt = (int) Math.round(value); // Cast to int if needed");
        System.out.println();
        
        // Example 4: Incorrect order of operations
        System.out.println("Example 4: Incorrect order of operations");
        
        // Error 4: Incorrect placement of parentheses
        double price = 9.7;
        // int incorrectOrder = (int) price + 0.5;  // Cast happens first, then addition
        int correctOrder = (int) (price + 0.5);  // Addition happens first, then cast
        
        System.out.println("double price = " + price);
        // System.out.println("int incorrectOrder = (int) price + 0.5; // Result: " + incorrectOrder);
        System.out.println("Error: This casts price to int (9) first, then adds 0.5, resulting in 9.5 which is truncated to 9");
        System.out.println("Correction: int correctOrder = (int) (price + 0.5); // Result: " + correctOrder);
        System.out.println();
        
        // Example 5: Confusion about rounding to different decimal places
        System.out.println("Example 5: Confusion about rounding to different decimal places");
        
        // Error 5: Trying to use the same technique for rounding to decimal places
        double amount = 3.14159;
        // int roundedToTwoDecimals = (int)(amount * 100 + 0.5) / 100;  // This doesn't work as expected
        
        System.out.println("double amount = " + amount);
        System.out.println("int roundedToTwoDecimals = (int)(amount * 100 + 0.5) / 100;  // This doesn't work");
        System.out.println("Error: This performs integer division after casting, resulting in 3 (not 3.14)");
        System.out.println("Correction: double roundedToTwoDecimals = (int)(amount * 100 + 0.5) / 100.0; // Result: " + ((int)(amount * 100 + 0.5) / 100.0));
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Rounding Errors ---");
        System.out.println("1. Use (int)(x + 0.5) for positive numbers and (int)(x - 0.5) for negative numbers");
        System.out.println("2. Always check the sign of the number before applying the appropriate rounding formula");
        System.out.println("3. Remember that Math.round() returns a long, not an int");
        System.out.println("4. Be careful with the order of operations - parentheses matter");
        System.out.println("5. For rounding to decimal places, use a different approach (multiply, round, then divide by a double)");
    }
}
/**
 * CON1C2_Err.java
 * 
 * This program demonstrates common errors related to truncation when casting double to int.
 * Knowledge Point: CON-1.C.2 - Casting a double value to an int causes the digits to the right of the decimal point to be truncated.
 */
public class CON1C2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Truncation when Casting double to int:\n");
        
        // Example 1: Confusing truncation with rounding
        System.out.println("Example 1: Confusing truncation with rounding");
        
        // Error 1: Expecting rounding behavior
        double price = 9.99;
        int dollars = (int) price;
        
        System.out.println("double price = " + price);
        System.out.println("int dollars = (int) price; // Result: " + dollars);
        System.out.println("Error: Expected 10 (if rounding), but got 9 because casting truncates");
        System.out.println("Correction for rounding: int dollars = (int) (price + 0.5); // Result: " + (int) (price + 0.5));
        System.out.println();
        
        // Example 2: Misunderstanding truncation with negative numbers
        System.out.println("Example 2: Misunderstanding truncation with negative numbers");
        
        // Error 2: Expecting different behavior with negative numbers
        double negativeValue = -7.8;
        int truncatedNegative = (int) negativeValue;
        
        System.out.println("double negativeValue = " + negativeValue);
        System.out.println("int truncatedNegative = (int) negativeValue; // Result: " + truncatedNegative);
        System.out.println("Error: Some might expect -7 (if rounding toward zero) or -8 (if rounding away from zero)");
        System.out.println("Fact: Casting always truncates, so -7.8 becomes -7 (decimal portion is removed)");
        System.out.println();
        
        // Example 3: Incorrect rounding implementation
        System.out.println("Example 3: Incorrect rounding implementation");
        
        // Error 3: Incorrect rounding for negative numbers
        double negPrice = -4.7;
        int incorrectRound = (int) (negPrice + 0.5);  // This doesn't work for negative numbers
        int correctRound = (int) (negPrice - 0.5);    // Correct for negative numbers
        
        System.out.println("double negPrice = " + negPrice);
        System.out.println("int incorrectRound = (int) (negPrice + 0.5); // Result: " + incorrectRound);
        System.out.println("Error: Adding 0.5 before casting doesn't round negative numbers correctly");
        System.out.println("Correction: int correctRound = (int) (negPrice - 0.5); // Result: " + correctRound);
        System.out.println();
        
        // Example 4: Forgetting that truncation happens in expressions
        System.out.println("Example 4: Forgetting that truncation happens in expressions");
        
        // Error 4: Unexpected truncation in complex expressions
        double a = 9.7;
        double b = 4.3;
        int result = (int) a + (int) b;  // Truncation happens before addition
        int expectedResult = (int) (a + b);  // Addition happens before truncation
        
        System.out.println("double a = " + a + ", double b = " + b);
        System.out.println("int result = (int) a + (int) b; // Result: " + result);
        System.out.println("Error: This gives 9 + 4 = 13, not 14 (which would be (int) (9.7 + 4.3))");
        System.out.println("Correction: int expectedResult = (int) (a + b); // Result: " + expectedResult);
        System.out.println();
        
        // Example 5: Confusion with Math.floor() vs casting
        System.out.println("Example 5: Confusion with Math.floor() vs casting");
        
        // Error 5: Not understanding the difference between floor and truncation
        double value = -3.3;
        int truncated = (int) value;
        int floored = (int) Math.floor(value);
        
        System.out.println("double value = " + value);
        System.out.println("int truncated = (int) value; // Result: " + truncated);
        System.out.println("int floored = (int) Math.floor(value); // Result: " + floored);
        System.out.println("Error: Some confuse truncation with floor - they're the same for positive numbers but different for negative");
        System.out.println("Fact: For negative numbers, Math.floor() rounds down to the next lower integer");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Truncation Errors ---");
        System.out.println("1. Casting with (int) always truncates (removes decimal portion), it never rounds");
        System.out.println("2. For positive numbers, truncation is the same as flooring (Math.floor())");
        System.out.println("3. For negative numbers, truncation removes the decimal portion (-3.7 becomes -3)");
        System.out.println("4. To round properly, use Math.round() or add 0.5 for positive numbers and subtract 0.5 for negative numbers");
        System.out.println("5. When casting multiple values in an expression, each cast happens separately");
    }
}
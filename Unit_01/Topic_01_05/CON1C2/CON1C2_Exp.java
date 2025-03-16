/**
 * CON1C2_Exp.java
 * 
 * This program demonstrates how casting a double to an int truncates the decimal portion.
 * Knowledge Point: CON-1.C.2 - Casting a double value to an int causes the digits to the right of the decimal point to be truncated.
 */
public class CON1C2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Truncation when Casting double to int:\n");
        
        // Example 1: Basic truncation with positive numbers
        System.out.println("Example 1: Basic truncation with positive numbers");
        double positiveDouble1 = 5.8;
        double positiveDouble2 = 5.2;
        double positiveDouble3 = 5.5;
        
        int truncated1 = (int) positiveDouble1;
        int truncated2 = (int) positiveDouble2;
        int truncated3 = (int) positiveDouble3;
        
        System.out.println("Original double: " + positiveDouble1 + " → After (int) casting: " + truncated1);
        System.out.println("Original double: " + positiveDouble2 + " → After (int) casting: " + truncated2);
        System.out.println("Original double: " + positiveDouble3 + " → After (int) casting: " + truncated3);
        System.out.println("Note: All decimal portions are simply removed, regardless of their value");
        System.out.println();
        
        // Example 2: Truncation with negative numbers
        System.out.println("Example 2: Truncation with negative numbers");
        double negativeDouble1 = -3.7;
        double negativeDouble2 = -3.2;
        double negativeDouble3 = -3.5;
        
        int truncatedNeg1 = (int) negativeDouble1;
        int truncatedNeg2 = (int) negativeDouble2;
        int truncatedNeg3 = (int) negativeDouble3;
        
        System.out.println("Original double: " + negativeDouble1 + " → After (int) casting: " + truncatedNeg1);
        System.out.println("Original double: " + negativeDouble2 + " → After (int) casting: " + truncatedNeg2);
        System.out.println("Original double: " + negativeDouble3 + " → After (int) casting: " + truncatedNeg3);
        System.out.println("Note: With negative numbers, truncation still removes the decimal portion (not rounding toward zero)");
        System.out.println();
        
        // Example 3: Truncation in expressions
        System.out.println("Example 3: Truncation in expressions");
        double result1 = 10.0 / 3.0;  // Equals 3.3333...
        int truncatedResult = (int) result1;
        
        System.out.println("10.0 / 3.0 = " + result1);
        System.out.println("(int) (10.0 / 3.0) = " + truncatedResult);
        System.out.println();
        
        // Example 4: Truncation vs. rounding
        System.out.println("Example 4: Truncation vs. rounding");
        double price = 9.99;
        
        // Truncation with casting
        int truncatedPrice = (int) price;
        
        // Manual rounding using Math.round()
        int roundedPrice = (int) Math.round(price);
        
        // Manual rounding using the 0.5 trick
        int manualRoundedPrice = (int) (price + 0.5);
        
        System.out.println("Original price: $" + price);
        System.out.println("Truncated price (int) price: $" + truncatedPrice);
        System.out.println("Rounded price Math.round(): $" + roundedPrice);
        System.out.println("Manually rounded price (int) (price + 0.5): $" + manualRoundedPrice);
        System.out.println();
        
        // Example 5: Truncation with very small decimal portions
        System.out.println("Example 5: Truncation with very small decimal portions");
        double almostInteger1 = 7.001;
        double almostInteger2 = 7.999;
        
        int truncatedAlmost1 = (int) almostInteger1;
        int truncatedAlmost2 = (int) almostInteger2;
        
        System.out.println("Original double: " + almostInteger1 + " → After (int) casting: " + truncatedAlmost1);
        System.out.println("Original double: " + almostInteger2 + " → After (int) casting: " + truncatedAlmost2);
        System.out.println("Note: Even when the decimal portion is very small or very close to 1, it's still completely removed");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Truncation when Casting double to int ---");
        System.out.println("1. Casting a double value to an int causes the digits to the right of the decimal point to be truncated (CON-1.C.2)");
        System.out.println("2. Truncation simply removes the decimal portion, regardless of its value");
        System.out.println("3. Truncation is not the same as rounding - 9.99 truncates to 9, not 10");
        System.out.println("4. For negative numbers, truncation still removes the decimal portion (e.g., -3.7 becomes -3)");
        System.out.println("5. If rounding is needed, use Math.round() or add 0.5 before casting to int");
    }
}
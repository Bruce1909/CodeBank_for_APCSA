/**
 * CON1C4_Exp.java
 * 
 * This program demonstrates how to round double values to the nearest integer.
 * Knowledge Point: CON-1.C.4 - Values of type double can be rounded to the nearest integer by (int)(x + 0.5) or (int)(x – 0.5) for negative numbers.
 */
public class CON1C4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Rounding double Values to the Nearest Integer:\n");
        
        // Example 1: Rounding positive numbers
        System.out.println("Example 1: Rounding positive numbers");
        double[] positiveValues = {3.2, 3.5, 3.7, 4.0, 4.49, 4.5, 4.99};
        
        System.out.println("Using (int)(x + 0.5) to round positive numbers:");
        for (double value : positiveValues) {
            int rounded = (int)(value + 0.5);  // Add 0.5 and truncate
            System.out.println(value + " rounds to " + rounded);
        }
        System.out.println();
        
        // Example 2: Rounding negative numbers
        System.out.println("Example 2: Rounding negative numbers");
        double[] negativeValues = {-3.2, -3.5, -3.7, -4.0, -4.49, -4.5, -4.99};
        
        System.out.println("Using (int)(x - 0.5) to round negative numbers:");
        for (double value : negativeValues) {
            int rounded = (int)(value - 0.5);  // Subtract 0.5 and truncate
            System.out.println(value + " rounds to " + rounded);
        }
        System.out.println();
        
        // Example 3: Comparing with Math.round()
        System.out.println("Example 3: Comparing with Math.round()");
        double[] testValues = {3.2, 3.5, 3.7, -3.2, -3.5, -3.7};
        
        System.out.println("Comparing manual rounding with Math.round():");
        for (double value : testValues) {
            int manualRounded;
            if (value >= 0) {
                manualRounded = (int)(value + 0.5);  // For positive numbers
            } else {
                manualRounded = (int)(value - 0.5);  // For negative numbers
            }
            long mathRounded = Math.round(value);  // Math.round() returns long
            
            System.out.println(value + " → Manual: " + manualRounded + ", Math.round(): " + mathRounded);
        }
        System.out.println();
        
        // Example 4: Practical application - calculating average
        System.out.println("Example 4: Practical application - calculating average");
        double average = 85.49;
        int roundedAverage = (int)(average + 0.5);  // Round to nearest integer
        
        System.out.println("Student's average score: " + average);
        System.out.println("Rounded for grade report: " + roundedAverage);
        System.out.println();
        
        // Example 5: Implementing a universal rounding function
        System.out.println("Example 5: Implementing a universal rounding function");
        double[] mixedValues = {2.3, 2.5, 2.7, -2.3, -2.5, -2.7};
        
        System.out.println("Using a universal rounding function:");
        for (double value : mixedValues) {
            int rounded = roundToNearestInt(value);
            System.out.println(value + " rounds to " + rounded);
        }
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Rounding double Values ---");
        System.out.println("1. Values of type double can be rounded to the nearest integer by (int)(x + 0.5) or (int)(x – 0.5) for negative numbers (CON-1.C.4)");
        System.out.println("2. For positive numbers, add 0.5 before casting to int");
        System.out.println("3. For negative numbers, subtract 0.5 before casting to int");
        System.out.println("4. This technique works because casting to int truncates the decimal portion");
        System.out.println("5. Java's Math.round() method provides the same functionality but returns a long");
        System.out.println("6. Always check if a number is positive or negative before applying the appropriate rounding formula");
    }
    
    // Universal rounding function that works for both positive and negative numbers
    public static int roundToNearestInt(double value) {
        if (value >= 0) {
            return (int)(value + 0.5);  // For positive numbers
        } else {
            return (int)(value - 0.5);  // For negative numbers
        }
    }
}
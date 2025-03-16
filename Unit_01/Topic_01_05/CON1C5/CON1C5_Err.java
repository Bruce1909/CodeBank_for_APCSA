/**
 * CON1C5_Err.java
 * 
 * This program demonstrates common errors related to integer value ranges in Java.
 * Knowledge Point: CON-1.C.5 - Integer values in Java are represented by values of type int, which are stored using a finite amount (4 bytes) of memory. Therefore, an int value must be in the range from Integer.MIN_VALUE to Integer.MAX_VALUE inclusive.
 */
public class CON1C5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Integer Value Ranges in Java:\n");
        
        // Example 1: Integer overflow
        System.out.println("Example 1: Integer overflow");
        
        // Error 1: Adding to a value near MAX_VALUE
        int nearMax = Integer.MAX_VALUE;
        int overflowResult = nearMax + 1;
        
        System.out.println("int nearMax = Integer.MAX_VALUE = " + nearMax);
        System.out.println("int overflowResult = nearMax + 1 = " + overflowResult);
        System.out.println("Error: Adding 1 to MAX_VALUE causes overflow, resulting in a negative number");
        System.out.println("Correction: Use a larger data type like long: long result = (long) nearMax + 1 = " + ((long) nearMax + 1));
        System.out.println();
        
        // Example 2: Integer underflow
        System.out.println("Example 2: Integer underflow");
        
        // Error 2: Subtracting from a value near MIN_VALUE
        int nearMin = Integer.MIN_VALUE;
        int underflowResult = nearMin - 1;
        
        System.out.println("int nearMin = Integer.MIN_VALUE = " + nearMin);
        System.out.println("int underflowResult = nearMin - 1 = " + underflowResult);
        System.out.println("Error: Subtracting 1 from MIN_VALUE causes underflow, resulting in a positive number");
        System.out.println("Correction: Use a larger data type like long: long result = (long) nearMin - 1 = " + ((long) nearMin - 1));
        System.out.println();
        
        // Example 3: Assigning a value outside the int range
        System.out.println("Example 3: Assigning a value outside the int range");
        
        // Error 3: Trying to assign a value that's too large for int
        // int tooLarge = 3000000000;  // This would cause a compilation error
        System.out.println("int tooLarge = 3000000000;  // This would cause a compilation error");
        System.out.println("Error: The literal 3000000000 is outside the range of int");
        System.out.println("Correction: Use long instead: long largeValue = 3000000000L; // Note the 'L' suffix");
        System.out.println();
        
        // Example 4: Incorrect type for large calculations
        System.out.println("Example 4: Incorrect type for large calculations");
        
        // Error 4: Using int for a calculation that might overflow
        int largeValue1 = 1000000000;  // One billion
        int largeValue2 = 2000000000;  // Two billion
        int incorrectSum = largeValue1 + largeValue2;  // This will overflow
        long correctSum = (long) largeValue1 + largeValue2;  // Cast to long first
        
        System.out.println("int largeValue1 = " + largeValue1);
        System.out.println("int largeValue2 = " + largeValue2);
        System.out.println("int incorrectSum = largeValue1 + largeValue2 = " + incorrectSum);
        System.out.println("Error: The sum exceeds Integer.MAX_VALUE, causing overflow");
        System.out.println("Correction: long correctSum = (long) largeValue1 + largeValue2 = " + correctSum);
        System.out.println();
        
        // Example 5: Confusion with literal types
        System.out.println("Example 5: Confusion with literal types");
        
        // Error 5: Forgetting the 'L' suffix for long literals
        // long withoutSuffix = 3000000000;  // This would cause a compilation error
        long withSuffix = 3000000000L;  // Correct - with 'L' suffix
        
        System.out.println("long withoutSuffix = 3000000000;  // This would cause a compilation error");
        System.out.println("Error: Without the 'L' suffix, Java treats 3000000000 as an int literal, which is too large");
        System.out.println("Correction: long withSuffix = 3000000000L; // Result: " + withSuffix);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Integer Range Errors ---");
        System.out.println("1. Integer overflow occurs when a calculation exceeds Integer.MAX_VALUE");
        System.out.println("2. Integer underflow occurs when a calculation goes below Integer.MIN_VALUE");
        System.out.println("3. Java does not automatically detect or prevent integer overflow/underflow");
        System.out.println("4. For values or calculations that might exceed the int range, use long instead");
        System.out.println("5. Remember to use the 'L' suffix for long literals that exceed the int range");
        System.out.println("6. Be especially careful with calculations involving values near the limits");
    }
}
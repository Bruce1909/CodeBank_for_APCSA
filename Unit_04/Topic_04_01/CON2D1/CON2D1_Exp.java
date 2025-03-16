/**
 * CON2D1_Exp.java
 * 
 * This program demonstrates standard algorithms mentioned in CON-2.D.1:
 * - Identifying if an integer is or is not evenly divisible by another integer
 * - Identifying the individual digits in an integer
 * - Determining the frequency with which a specific criterion is met
 */
public class CON2D1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating standard algorithms from CON-2.D.1:\n");
        
        // Example 1: Identifying if an integer is evenly divisible by another integer
        System.out.println("Example 1: Checking divisibility");
        int num1 = 24;
        int num2 = 4;
        int num3 = 7;
        
        System.out.println(num1 + " is divisible by " + num2 + ": " + isDivisible(num1, num2));
        System.out.println(num1 + " is divisible by " + num3 + ": " + isDivisible(num1, num3));
        System.out.println();
        
        // Example 2: Identifying individual digits in an integer
        System.out.println("Example 2: Identifying individual digits");
        int number = 12345;
        System.out.println("The digits in " + number + " are:");
        identifyDigits(number);
        System.out.println();
        
        // Example 3: Determining frequency with which a specific criterion is met
        System.out.println("Example 3: Determining frequency of a criterion");
        int[] values = {2, 5, 7, 8, 10, 12, 15, 18, 20, 22, 25, 28, 30};
        
        // Count even numbers
        int evenCount = countEvenNumbers(values);
        System.out.println("Number of even values: " + evenCount);
        
        // Count numbers divisible by 5
        int divisibleBy5Count = countDivisibleBy(values, 5);
        System.out.println("Number of values divisible by 5: " + divisibleBy5Count);
        
        // Count numbers greater than 15
        int greaterThan15Count = countGreaterThan(values, 15);
        System.out.println("Number of values greater than 15: " + greaterThan15Count);
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Standard Algorithms in CON-2.D.1 ---");
        System.out.println("1. Checking divisibility: Use the modulo operator (%) to check if a number is divisible by another");
        System.out.println("2. Identifying digits: Use division and modulo operations to extract individual digits");
        System.out.println("3. Determining frequency: Use a counter variable and increment it when a condition is met");
    }
    
    /**
     * Checks if one number is evenly divisible by another
     * @param num The number to check
     * @param divisor The divisor
     * @return true if num is evenly divisible by divisor, false otherwise
     */
    public static boolean isDivisible(int num, int divisor) {
        // A number is evenly divisible by another if the remainder is 0
        return num % divisor == 0;
    }
    
    /**
     * Identifies and prints individual digits in a number
     * @param num The number to process
     */
    public static void identifyDigits(int num) {
        // Method 1: Convert to string and process each character
        String numStr = Integer.toString(num);
        System.out.println("Method 1 (using String conversion):");
        for (int i = 0; i < numStr.length(); i++) {
            System.out.println("Digit at position " + i + ": " + numStr.charAt(i));
        }
        
        // Method 2: Use mathematical operations
        System.out.println("\nMethod 2 (using mathematical operations):");
        int temp = num;
        int position = 0;
        
        // For Method 2, we need to process from right to left
        // First, count the number of digits to know positions
        int digitCount = 0;
        int tempCount = temp;
        while (tempCount > 0) {
            digitCount++;
            tempCount /= 10;
        }
        
        // Now extract each digit
        while (temp > 0) {
            int digit = temp % 10;
            System.out.println("Digit at position " + (digitCount - position - 1) + ": " + digit);
            temp /= 10;
            position++;
        }
    }
    
    /**
     * Counts the number of even values in an array
     * @param arr The array to check
     * @return The count of even numbers
     */
    public static int countEvenNumbers(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value % 2 == 0) { // Check if the number is even
                count++;
            }
        }
        return count;
    }
    
    /**
     * Counts the number of values divisible by a specific number
     * @param arr The array to check
     * @param divisor The divisor
     * @return The count of numbers divisible by the divisor
     */
    public static int countDivisibleBy(int[] arr, int divisor) {
        int count = 0;
        for (int value : arr) {
            if (value % divisor == 0) { // Check if the number is divisible by divisor
                count++;
            }
        }
        return count;
    }
    
    /**
     * Counts the number of values greater than a specific threshold
     * @param arr The array to check
     * @param threshold The threshold value
     * @return The count of numbers greater than the threshold
     */
    public static int countGreaterThan(int[] arr, int threshold) {
        int count = 0;
        for (int value : arr) {
            if (value > threshold) { // Check if the number is greater than threshold
                count++;
            }
        }
        return count;
    }
}
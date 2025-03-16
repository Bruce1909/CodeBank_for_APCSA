/**
 * CON2D1_Err.java
 * 
 * This program demonstrates common errors when implementing standard algorithms mentioned in CON-2.D.1:
 * - Identifying if an integer is or is not evenly divisible by another integer
 * - Identifying the individual digits in an integer
 * - Determining the frequency with which a specific criterion is met
 */
public class CON2D1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors in standard algorithms from CON-2.D.1:\n");
        
        // Example 1: Errors in checking divisibility
        System.out.println("Example 1: Errors in checking divisibility");
        int num1 = 24;
        int num2 = 4;
        int num3 = 0; // Will cause division by zero error
        
        System.out.println("Correct check: " + num1 + " is divisible by " + num2 + ": " + isDivisibleCorrect(num1, num2));
        System.out.println("Error 1: Using division instead of modulo: " + isDivisibleError1(num1, num2));
        
        // Error 2: Not handling division by zero
        System.out.println("\nError 2: Not handling division by zero:");
        try {
            System.out.println(num1 + " is divisible by " + num3 + ": " + isDivisibleError2(num1, num3));
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Correct implementation would check for zero divisor");
        }
        
        // Error 3: Incorrect logic in divisibility check
        System.out.println("\nError 3: Incorrect logic in divisibility check:");
        System.out.println("Correct: " + num1 + " is divisible by " + num2 + ": " + isDivisibleCorrect(num1, num2));
        System.out.println("Incorrect: " + num1 + " is divisible by " + num2 + ": " + isDivisibleError3(num1, num2));
        System.out.println();
        
        // Example 2: Errors in identifying individual digits
        System.out.println("Example 2: Errors in identifying individual digits");
        int number = 12345;
        int negativeNumber = -12345;
        
        System.out.println("\nError 1: Not handling negative numbers:");
        System.out.println("Attempting to identify digits in " + negativeNumber + ":");
        try {
            identifyDigitsError1(negativeNumber);
        } catch (Exception e) {
            System.out.println("Error occurred: The method doesn't handle negative numbers properly");
        }
        
        System.out.println("\nError 2: Off-by-one error in position counting:");
        identifyDigitsError2(number);
        
        System.out.println("\nCorrect implementation:");
        identifyDigitsCorrect(number);
        System.out.println();
        
        // Example 3: Errors in determining frequency
        System.out.println("Example 3: Errors in determining frequency");
        int[] values = {2, 5, 7, 8, 10, 12, 15, 18, 20, 22, 25, 28, 30};
        int[] emptyArray = {};
        
        // Error 1: Not initializing counter
        System.out.println("\nError 1: Not initializing counter properly:");
        try {
            int evenCount = countEvenNumbersError1(values);
            System.out.println("Count of even numbers (incorrect): " + evenCount);
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        
        // Error 2: Not handling empty arrays
        System.out.println("\nError 2: Not handling empty arrays:");
        try {
            int divisibleBy5Count = countDivisibleByError2(emptyArray, 5);
            System.out.println("Count of numbers divisible by 5 in empty array: " + divisibleBy5Count);
        } catch (NullPointerException e) {
            System.out.println("Error occurred: NullPointerException - The method doesn't check if array is null");
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        
        // Error 3: Incorrect condition in frequency counting
        System.out.println("\nError 3: Incorrect condition in frequency counting:");
        int correctCount = countGreaterThanCorrect(values, 15);
        int incorrectCount = countGreaterThanError3(values, 15);
        System.out.println("Correct count of numbers > 15: " + correctCount);
        System.out.println("Incorrect count of numbers > 15: " + incorrectCount);
        System.out.println("The incorrect method uses >= instead of > in the condition");
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors in Standard Algorithms ---");
        System.out.println("1. Divisibility Checking Errors:");
        System.out.println("   - Using division instead of modulo operator");
        System.out.println("   - Not handling division by zero");
        System.out.println("   - Incorrect logic in the condition");
        System.out.println("2. Digit Identification Errors:");
        System.out.println("   - Not handling negative numbers");
        System.out.println("   - Off-by-one errors in position counting");
        System.out.println("   - Incorrect extraction of digits");
        System.out.println("3. Frequency Determination Errors:");
        System.out.println("   - Not initializing counter variables");
        System.out.println("   - Not handling empty or null arrays");
        System.out.println("   - Using incorrect conditions for counting");
    }
    
    // CORRECT IMPLEMENTATIONS
    
    /**
     * Correctly checks if one number is evenly divisible by another
     */
    public static boolean isDivisibleCorrect(int num, int divisor) {
        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero");
            return false;
        }
        // A number is evenly divisible by another if the remainder is 0
        return num % divisor == 0;
    }
    
    /**
     * Correctly identifies and prints individual digits in a number
     */
    public static void identifyDigitsCorrect(int num) {
        // Handle negative numbers
        int absNum = Math.abs(num);
        String numStr = Integer.toString(absNum);
        
        if (num < 0) {
            System.out.println("Note: Processing absolute value of negative number");
        }
        
        for (int i = 0; i < numStr.length(); i++) {
            System.out.println("Digit at position " + i + ": " + numStr.charAt(i));
        }
    }
    
    /**
     * Correctly counts numbers greater than a threshold
     */
    public static int countGreaterThanCorrect(int[] arr, int threshold) {
        // Check for null array
        if (arr == null) {
            System.out.println("Error: Array is null");
            return 0;
        }
        
        int count = 0;
        for (int value : arr) {
            if (value > threshold) { // Correct condition: greater than
                count++;
            }
        }
        return count;
    }
    
    // ERROR IMPLEMENTATIONS
    
    /**
     * Error 1: Using division instead of modulo for divisibility check
     */
    public static boolean isDivisibleError1(int num, int divisor) {
        // ERROR: Using division instead of modulo
        // This will return true for cases like 5/2 = 2 (with remainder 1)
        // because integer division truncates the decimal part
        return (num / divisor) * divisor == num;
    }
    
    /**
     * Error 2: Not handling division by zero
     */
    public static boolean isDivisibleError2(int num, int divisor) {
        // ERROR: No check for division by zero
        return num % divisor == 0; // Will throw ArithmeticException if divisor is 0
    }
    
    /**
     * Error 3: Incorrect logic in divisibility check
     */
    public static boolean isDivisibleError3(int num, int divisor) {
        // ERROR: Incorrect logic - checks if remainder is not zero
        return num % divisor != 0; // This is the opposite of what we want
    }
    
    /**
     * Error 1: Not handling negative numbers in digit identification
     */
    public static void identifyDigitsError1(int num) {
        // ERROR: No handling for negative numbers
        String numStr = Integer.toString(num);
        
        // This will include the negative sign as a digit for negative numbers
        for (int i = 0; i < numStr.length(); i++) {
            System.out.println("Digit at position " + i + ": " + numStr.charAt(i));
        }
    }
    
    /**
     * Error 2: Off-by-one error in position counting
     */
    public static void identifyDigitsError2(int num) {
        String numStr = Integer.toString(num);
        
        // ERROR: Off-by-one error in position counting (starting from 1 instead of 0)
        for (int i = 1; i <= numStr.length(); i++) {
            try {
                System.out.println("Digit at position " + i + ": " + numStr.charAt(i-1));
            } catch (Exception e) {
                System.out.println("Error accessing position " + i);
            }
        }
    }
    
    /**
     * Error 1: Not initializing counter in frequency counting
     */
    public static int countEvenNumbersError1(int[] arr) {
        // ERROR: Counter not initialized
        int count; // Uninitialized variable
        
        for (int value : arr) {
            if (value % 2 == 0) {
                count++; // This will cause a compilation error
            }
        }
        return count; // This will also cause a compilation error
    }
    
    /**
     * Error 2: Not handling null or empty arrays
     */
    public static int countDivisibleByError2(int[] arr, int divisor) {
        // ERROR: No check for null array
        int count = 0;
        
        // This will throw NullPointerException if arr is null
        for (int value : arr) {
            if (value % divisor == 0) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Error 3: Incorrect condition in frequency counting
     */
    public static int countGreaterThanError3(int[] arr, int threshold) {
        int count = 0;
        for (int value : arr) {
            // ERROR: Using >= instead of >
            if (value >= threshold) { // This counts values equal to threshold too
                count++;
            }
        }
        return count;
    }
}
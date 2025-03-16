/**
 * CON2D2_Err.java
 * 
 * This program demonstrates common errors when implementing standard algorithms mentioned in CON-2.D.2:
 * - Determining a minimum or maximum value
 * - Computing a sum, average, or mode
 */
public class CON2D2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors in standard algorithms from CON-2.D.2:\n");
        
        // Example 1: Errors in finding minimum and maximum values
        System.out.println("Example 1: Errors in finding minimum and maximum values");
        int[] numbers = {42, 17, 9, 53, 28, 91, 7, 14, 33};
        int[] emptyArray = {};
        
        System.out.print("Array values: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Error 1: Not handling empty arrays
        System.out.println("\nError 1: Not handling empty arrays:");
        try {
            int min = findMinimumError1(emptyArray);
            System.out.println("Minimum value: " + min);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Correct implementation would check for empty arrays");
        }
        
        // Error 2: Incorrect initialization for finding maximum
        System.out.println("\nError 2: Incorrect initialization for finding maximum:");
        int correctMax = findMaximumCorrect(numbers);
        int incorrectMax = findMaximumError2(numbers);
        System.out.println("Correct maximum: " + correctMax);
        System.out.println("Incorrect maximum (initialized to 0): " + incorrectMax);
        System.out.println("The error occurs when all values are negative");
        
        // Error 3: Off-by-one error in loop bounds
        System.out.println("\nError 3: Off-by-one error in loop bounds:");
        int correctMin = findMinimumCorrect(numbers);
        int incorrectMin = findMinimumError3(numbers);
        System.out.println("Correct minimum: " + correctMin);
        System.out.println("Incorrect minimum (loop starts at index 0): " + incorrectMin);
        System.out.println();
        
        // Example 2: Errors in computing sum and average
        System.out.println("Example 2: Errors in computing sum and average");
        double[] values = {3.5, 2.7, 9.1, 6.3, 8.2, 5.5, 7.0};
        double[] emptyDoubleArray = {};
        
        System.out.print("Array values: ");
        for (double val : values) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        // Error 1: Integer division in average calculation
        System.out.println("\nError 1: Integer division in average calculation:");
        int[] intValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double correctAvg = computeAverageCorrect(intValues);
        double incorrectAvg = computeAverageError1(intValues);
        System.out.println("Correct average: " + correctAvg);
        System.out.println("Incorrect average (integer division): " + incorrectAvg);
        
        // Error 2: Not handling division by zero in average calculation
        System.out.println("\nError 2: Not handling division by zero in average calculation:");
        try {
            double avg = computeAverageError2(emptyDoubleArray);
            System.out.println("Average of empty array: " + avg);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Correct implementation would check for empty arrays");
        }
        
        // Error 3: Overflow in sum calculation
        System.out.println("\nError 3: Potential overflow in sum calculation:");
        System.out.println("When summing very large values, integer overflow can occur");
        System.out.println("Correct implementation would use appropriate data types");
        System.out.println();
        
        // Example 3: Errors in finding the mode
        System.out.println("Example 3: Errors in finding the mode");
        int[] scores = {82, 75, 93, 87, 75, 82, 95, 75, 87, 75, 93, 82, 75};
        int[] negativeValues = {-5, -10, -5, -8, -5, -10, -20};
        
        System.out.print("Array values: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        
        // Error 1: Not handling negative values in mode calculation
        System.out.println("\nError 1: Not handling negative values in mode calculation:");
        try {
            int mode = findModeError1(negativeValues);
            System.out.println("Mode of array with negative values: " + mode);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Correct implementation would handle negative values");
        }
        
        // Error 2: Incorrect handling of ties in mode calculation
        System.out.println("\nError 2: Incorrect handling of ties in mode calculation:");
        int[] tiedValues = {1, 2, 3, 1, 2, 3, 1, 2, 3};
        System.out.print("Array with tied frequencies: ");
        for (int val : tiedValues) {
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("Simple mode implementation may not handle ties correctly");
        System.out.println("Correct implementation would report all modes or handle ties");
        
        // Error 3: Inefficient mode calculation for large range of values
        System.out.println("\nError 3: Inefficient mode calculation for large range of values:");
        System.out.println("Using an array to count frequencies is inefficient for sparse data");
        System.out.println("Correct implementation would use a Map for sparse data");
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors in Standard Algorithms ---");
        System.out.println("1. Minimum/Maximum Finding Errors:");
        System.out.println("   - Not handling empty arrays");
        System.out.println("   - Incorrect initialization of min/max variables");
        System.out.println("   - Off-by-one errors in loop bounds");
        System.out.println("2. Sum and Average Calculation Errors:");
        System.out.println("   - Integer division instead of floating-point division");
        System.out.println("   - Not handling division by zero");
        System.out.println("   - Potential overflow with large values");
        System.out.println("3. Mode Calculation Errors:");
        System.out.println("   - Not handling negative values");
        System.out.println("   - Incorrect handling of ties");
        System.out.println("   - Inefficient implementation for sparse data");
    }
    
    // CORRECT IMPLEMENTATIONS
    
    /**
     * Correctly finds the minimum value in an array
     */
    public static int findMinimumCorrect(int[] arr) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Initialize minimum with the first element
        int min = arr[0];
        
        // Compare each element with the current minimum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        return min;
    }
    
    /**
     * Correctly finds the maximum value in an array
     */
    public static int findMaximumCorrect(int[] arr) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Initialize maximum with the first element
        int max = arr[0];
        
        // Compare each element with the current maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
    
    /**
     * Correctly computes the average of values in an array
     */
    public static double computeAverageCorrect(int[] arr) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Compute sum
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        
        // Use double division to get accurate average
        return (double) sum / arr.length;
    }
    
    // ERROR IMPLEMENTATIONS
    
    /**
     * Error 1: Not handling empty arrays when finding minimum
     */
    public static int findMinimumError1(int[] arr) {
        // ERROR: No check for null or empty array
        int min = arr[0]; // Will throw ArrayIndexOutOfBoundsException if array is empty
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        return min;
    }
    
    /**
     * Error 2: Incorrect initialization when finding maximum
     */
    public static int findMaximumError2(int[] arr) {
        // Check for null array but not empty array
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        
        // ERROR: Initializing max to 0 instead of first element
        // This will fail if all values are negative
        int max = 0;
        
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        
        return max;
    }
    
    /**
     * Error 3: Off-by-one error in loop bounds when finding minimum
     */
    public static int findMinimumError3(int[] arr) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Initialize minimum with the first element
        int min = arr[0];
        
        // ERROR: Starting loop at index 0 instead of 1
        // This compares the first element with itself unnecessarily
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        return min;
    }
    
    /**
     * Error 1: Integer division in average calculation
     */
    public static double computeAverageError1(int[] arr) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Compute sum
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        
        // ERROR: Using integer division instead of floating-point division
        // This will truncate the decimal part
        return sum / arr.length;
    }
    
    /**
     * Error 2: Not handling division by zero in average calculation
     */
    public static double computeAverageError2(double[] arr) {
        // ERROR: No check for empty array
        double sum = 0.0;
        for (double value : arr) {
            sum += value;
        }
        
        // This will throw ArithmeticException if array is empty (division by zero)
        return sum / arr.length;
    }
    
    /**
     * Error 1: Not handling negative values in mode calculation
     */
    public static int findModeError1(int[] arr) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Find the maximum value to determine the size of frequency array
        int max = findMaximumCorrect(arr);
        
        // ERROR: No handling for negative values
        // This will cause ArrayIndexOutOfBoundsException for negative values
        int[] frequency = new int[max + 1];
        
        // Count occurrences of each value
        for (int value : arr) {
            frequency[value]++; // Will throw exception if value is negative
        }
        
        // Find the value with the highest frequency
        int mode = 0;
        int maxFrequency = 0;
        
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mode = i;
            }
        }
        
        return mode;
    }
}
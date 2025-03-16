/**
 * CON2D2_Exp.java
 * 
 * This program demonstrates standard algorithms mentioned in CON-2.D.2:
 * - Determining a minimum or maximum value
 * - Computing a sum, average, or mode
 */
public class CON2D2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating standard algorithms from CON-2.D.2:\n");
        
        // Example 1: Determining minimum and maximum values
        System.out.println("Example 1: Finding minimum and maximum values");
        int[] numbers = {42, 17, 9, 53, 28, 91, 7, 14, 33};
        
        System.out.print("Array values: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int min = findMinimum(numbers);
        int max = findMaximum(numbers);
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println();
        
        // Example 2: Computing sum and average
        System.out.println("Example 2: Computing sum and average");
        double[] values = {3.5, 2.7, 9.1, 6.3, 8.2, 5.5, 7.0};
        
        System.out.print("Array values: ");
        for (double val : values) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        double sum = computeSum(values);
        double average = computeAverage(values);
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println();
        
        // Example 3: Finding the mode
        System.out.println("Example 3: Finding the mode");
        int[] scores = {82, 75, 93, 87, 75, 82, 95, 75, 87, 75, 93, 82, 75};
        
        System.out.print("Array values: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        
        int mode = findMode(scores);
        System.out.println("Mode: " + mode);
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Standard Algorithms in CON-2.D.2 ---");
        System.out.println("1. Finding minimum/maximum: Initialize with first value, then compare each element");
        System.out.println("2. Computing sum: Initialize sum to zero, then add each element");
        System.out.println("3. Computing average: Divide the sum by the number of elements");
        System.out.println("4. Finding mode: Count occurrences of each value and find the most frequent");
    }
    
    /**
     * Finds the minimum value in an array
     * @param arr The array to search
     * @return The minimum value
     */
    public static int findMinimum(int[] arr) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Initialize minimum with the first element
        int min = arr[0];
        
        // Compare each element with the current minimum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update minimum if a smaller value is found
            }
        }
        
        return min;
    }
    
    /**
     * Finds the maximum value in an array
     * @param arr The array to search
     * @return The maximum value
     */
    public static int findMaximum(int[] arr) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Initialize maximum with the first element
        int max = arr[0];
        
        // Compare each element with the current maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update maximum if a larger value is found
            }
        }
        
        return max;
    }
    
    /**
     * Computes the sum of values in an array
     * @param arr The array of values
     * @return The sum of all values
     */
    public static double computeSum(double[] arr) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Initialize sum to zero
        double sum = 0.0;
        
        // Add each element to the sum
        for (double value : arr) {
            sum += value;
        }
        
        return sum;
    }
    
    /**
     * Computes the average of values in an array
     * @param arr The array of values
     * @return The average of all values
     */
    public static double computeAverage(double[] arr) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Compute sum
        double sum = computeSum(arr);
        
        // Divide by number of elements to get average
        return sum / arr.length;
    }
    
    /**
     * Finds the mode (most frequent value) in an array
     * @param arr The array of values
     * @return The mode
     */
    public static int findMode(int[] arr) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Find the maximum value to determine the size of frequency array
        int max = findMaximum(arr);
        
        // Create frequency array (assumes non-negative values)
        int[] frequency = new int[max + 1];
        
        // Count occurrences of each value
        for (int value : arr) {
            frequency[value]++;
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
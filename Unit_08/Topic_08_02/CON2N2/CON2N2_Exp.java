/**
 * CON2N2_Exp - Example program for CON-2.N.2
 * 
 * This program demonstrates how standard 1D array algorithms can be applied to 2D array objects.
 * According to CON-2.N.2, all standard 1D array algorithms can be applied to 2D array objects.
 * 
 * This example shows how to apply common 1D array algorithms to a 2D array:
 * 1. Finding the minimum value
 * 2. Finding the maximum value
 * 3. Calculating the sum of all elements
 * 4. Checking if all elements meet a condition
 */
public class CON2N2_Exp {
    public static void main(String[] args) {
        // Create a 2D array of integers
        int[][] numbers = {
            {12, 5, 8, 21},
            {9, 17, 4, 6},
            {3, 11, 14, 2}
        };
        
        // Apply standard 1D array algorithms to the 2D array
        int min = findMinimum(numbers);
        int max = findMaximum(numbers);
        int sum = calculateSum(numbers);
        boolean allPositive = checkAllPositive(numbers);
        
        // Display the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Are all elements positive? " + allPositive);
    }
    
    /**
     * Finds the minimum value in a 2D array.
     * This applies the standard 1D array algorithm for finding a minimum to a 2D array.
     * 
     * @param arr The 2D array to search
     * @return The minimum value in the array
     */
    public static int findMinimum(int[][] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Initialize minimum with the first element
        int min = arr[0][0];
        
        // Traverse the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                // Update minimum if current element is smaller
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }
        
        return min;
    }
    
    /**
     * Finds the maximum value in a 2D array.
     * This applies the standard 1D array algorithm for finding a maximum to a 2D array.
     * 
     * @param arr The 2D array to search
     * @return The maximum value in the array
     */
    public static int findMaximum(int[][] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Initialize maximum with the first element
        int max = arr[0][0];
        
        // Traverse the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                // Update maximum if current element is larger
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        
        return max;
    }
    
    /**
     * Calculates the sum of all elements in a 2D array.
     * This applies the standard 1D array algorithm for calculating a sum to a 2D array.
     * 
     * @param arr The 2D array to sum
     * @return The sum of all elements in the array
     */
    public static int calculateSum(int[][] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        int sum = 0;
        
        // Traverse the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                // Add each element to the sum
                sum += arr[row][col];
            }
        }
        
        return sum;
    }
    
    /**
     * Checks if all elements in a 2D array are positive.
     * This applies the standard 1D array algorithm for checking a condition to a 2D array.
     * 
     * @param arr The 2D array to check
     * @return true if all elements are positive, false otherwise
     */
    public static boolean checkAllPositive(int[][] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return true; // Vacuously true
        }
        
        // Traverse the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                // If any element is not positive, return false
                if (arr[row][col] <= 0) {
                    return false;
                }
            }
        }
        
        // All elements are positive
        return true;
    }
}
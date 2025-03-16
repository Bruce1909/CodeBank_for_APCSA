/**
 * CON2N2_Err - Error program for CON-2.N.2
 * 
 * This program demonstrates INCORRECT implementations of applying standard 1D array
 * algorithms to 2D array objects. According to CON-2.N.2, all standard 1D array
 * algorithms can be applied to 2D array objects, but they must be implemented correctly.
 * 
 * This example shows common errors when trying to apply 1D array algorithms to 2D arrays:
 * 1. Incorrectly finding the minimum value
 * 2. Incorrectly finding the maximum value
 * 3. Incorrectly calculating the sum of all elements
 * 4. Incorrectly checking if all elements meet a condition
 */
public class CON2N2_Err {
    public static void main(String[] args) {
        // Create a 2D array of integers
        int[][] numbers = {
            {12, 5, 8, 21},
            {9, 17, 4, 6},
            {3, 11, 14, 2}
        };
        
        // Apply incorrect implementations of standard 1D array algorithms to the 2D array
        try {
            int min = findMinimumIncorrect(numbers);
            System.out.println("Incorrect minimum value: " + min);
        } catch (Exception e) {
            System.out.println("Error in findMinimumIncorrect: " + e.getMessage());
        }
        
        try {
            int max = findMaximumIncorrect(numbers);
            System.out.println("Incorrect maximum value: " + max);
        } catch (Exception e) {
            System.out.println("Error in findMaximumIncorrect: " + e.getMessage());
        }
        
        try {
            int sum = calculateSumIncorrect(numbers);
            System.out.println("Incorrect sum of all elements: " + sum);
        } catch (Exception e) {
            System.out.println("Error in calculateSumIncorrect: " + e.getMessage());
        }
        
        try {
            boolean allPositive = checkAllPositiveIncorrect(numbers);
            System.out.println("Incorrect check if all elements are positive: " + allPositive);
        } catch (Exception e) {
            System.out.println("Error in checkAllPositiveIncorrect: " + e.getMessage());
        }
    }
    
    /**
     * INCORRECT implementation of finding the minimum value in a 2D array.
     * ERROR: This method only checks the first element of each row, ignoring the rest.
     * 
     * @param arr The 2D array to search
     * @return An incorrect minimum value
     */
    public static int findMinimumIncorrect(int[][] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Initialize minimum with the first element
        int min = arr[0][0];
        
        // ERROR: Only checking the first element of each row
        for (int row = 0; row < arr.length; row++) {
            // This ignores all elements in the row except the first one
            if (arr[row][0] < min) {
                min = arr[row][0];
            }
        }
        
        return min; // This will return an incorrect minimum value
    }
    
    /**
     * INCORRECT implementation of finding the maximum value in a 2D array.
     * ERROR: This method only checks the first row, ignoring all other rows.
     * 
     * @param arr The 2D array to search
     * @return An incorrect maximum value
     */
    public static int findMaximumIncorrect(int[][] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        // Initialize maximum with the first element
        int max = arr[0][0];
        
        // ERROR: Only checking the first row, ignoring all other rows
        for (int col = 0; col < arr[0].length; col++) {
            if (arr[0][col] > max) {
                max = arr[0][col];
            }
        }
        
        return max; // This will return an incorrect maximum value
    }
    
    /**
     * INCORRECT implementation of calculating the sum of all elements in a 2D array.
     * ERROR: This method assumes all rows have the same length as the first row,
     * which can lead to ArrayIndexOutOfBoundsException if rows have different lengths.
     * 
     * @param arr The 2D array to sum
     * @return An incorrect sum of elements
     */
    public static int calculateSumIncorrect(int[][] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        int sum = 0;
        int rows = arr.length;
        
        // ERROR: Assuming all rows have the same length as the first row
        int cols = arr[0].length;
        
        // ERROR: Using a flattened approach that doesn't respect the 2D structure
        for (int i = 0; i < rows * cols; i++) {
            int row = i / cols;
            int col = i % cols;
            
            // This may cause ArrayIndexOutOfBoundsException if rows have different lengths
            try {
                sum += arr[row][col];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error accessing element at [" + row + "][" + col + "]");
                // Continuing with an incorrect sum
            }
        }
        
        return sum; // This may return an incorrect sum
    }
    
    /**
     * INCORRECT implementation of checking if all elements in a 2D array are positive.
     * ERROR: This method stops checking after finding the first positive element,
     * instead of checking if ALL elements are positive.
     * 
     * @param arr The 2D array to check
     * @return An incorrect result for whether all elements are positive
     */
    public static boolean checkAllPositiveIncorrect(int[][] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return true; // Vacuously true
        }
        
        // ERROR: Logic error - returning true when finding ANY positive element
        // instead of checking if ALL elements are positive
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                // ERROR: Incorrect condition - should return false if any element is NOT positive
                if (arr[row][col] > 0) {
                    return true; // Incorrectly returns true after finding just one positive element
                }
            }
        }
        
        // Incorrectly returns false if no positive elements were found
        return false;
    }
}
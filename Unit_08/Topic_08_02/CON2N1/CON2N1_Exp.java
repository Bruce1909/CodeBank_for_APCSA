/**
 * CON2N1_Exp - Example program for CON-2.N.1
 * 
 * This program demonstrates the correct implementation of sequential/linear search
 * in a 2D array. According to CON-2.N.1, when applying sequential/linear search
 * algorithms to 2D arrays, each row must be accessed, then sequential/linear search
 * is applied to each row of the 2D array.
 */
public class CON2N1_Exp {
    public static void main(String[] args) {
        // Create a 2D array of integers
        int[][] numbers = {
            {12, 5, 8, 21},
            {9, 17, 4, 6},
            {3, 11, 14, 2}
        };
        
        int target = 14;
        
        // Call the search method and display the result
        int[] position = searchIn2DArray(numbers, target);
        
        if (position != null) {
            System.out.println("Found " + target + " at position [" + position[0] + "][" + position[1] + "]");
        } else {
            System.out.println(target + " was not found in the array.");
        }
        
        // Search for a value that doesn't exist
        target = 10;
        position = searchIn2DArray(numbers, target);
        
        if (position != null) {
            System.out.println("Found " + target + " at position [" + position[0] + "][" + position[1] + "]");
        } else {
            System.out.println(target + " was not found in the array.");
        }
    }
    
    /**
     * Performs a sequential/linear search in a 2D array for a target value.
     * This method correctly implements CON-2.N.1 by accessing each row and then
     * applying sequential search to each row.
     * 
     * @param arr The 2D array to search in
     * @param target The value to search for
     * @return An array containing the row and column indices if found, null otherwise
     */
    public static int[] searchIn2DArray(int[][] arr, int target) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        // Iterate through each row of the 2D array
        for (int row = 0; row < arr.length; row++) {
            // Apply sequential/linear search to the current row
            for (int col = 0; col < arr[row].length; col++) {
                // Check if the current element matches the target
                if (arr[row][col] == target) {
                    // Return the position as [row, column]
                    return new int[] {row, col};
                }
            }
        }
        
        // Target was not found in the 2D array
        return null;
    }
}
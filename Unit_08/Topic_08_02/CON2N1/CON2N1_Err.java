/**
 * CON2N1_Err - Error program for CON-2.N.1
 * 
 * This program demonstrates the INCORRECT implementation of sequential/linear search
 * in a 2D array. According to CON-2.N.1, when applying sequential/linear search
 * algorithms to 2D arrays, each row must be accessed, then sequential/linear search
 * is applied to each row of the 2D array.
 * 
 * ERROR: This implementation attempts to search the 2D array as if it were a 1D array
 * without properly accessing each row first, which violates CON-2.N.1.
 */
public class CON2N1_Err {
    public static void main(String[] args) {
        // Create a 2D array of integers
        int[][] numbers = {
            {12, 5, 8, 21},
            {9, 17, 4, 6},
            {3, 11, 14, 2}
        };
        
        int target = 14;
        
        // Call the incorrect search method and display the result
        boolean found = incorrectSearchIn2DArray(numbers, target);
        
        if (found) {
            System.out.println("Found " + target + " in the array.");
            // Note: This implementation doesn't track the position, just whether it was found
        } else {
            System.out.println(target + " was not found in the array.");
        }
        
        // Search for a value that doesn't exist
        target = 10;
        found = incorrectSearchIn2DArray(numbers, target);
        
        if (found) {
            System.out.println("Found " + target + " in the array.");
        } else {
            System.out.println(target + " was not found in the array.");
        }
    }
    
    /**
     * INCORRECT implementation of sequential/linear search in a 2D array.
     * This method violates CON-2.N.1 because it doesn't properly access each row
     * before applying sequential search.
     * 
     * ERROR: This method treats the 2D array incorrectly by attempting to access
     * elements as if the array were flattened, which can lead to ArrayIndexOutOfBoundsException
     * if the rows have different lengths.
     * 
     * @param arr The 2D array to search in
     * @param target The value to search for
     * @return true if the target is found, false otherwise
     */
    public static boolean incorrectSearchIn2DArray(int[][] arr, int target) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return false;
        }
        
        // ERROR: Incorrectly calculating the total number of elements
        // This assumes all rows have the same length as the first row
        int totalElements = arr.length * arr[0].length;
        
        // ERROR: Attempting to search through the 2D array as if it were a 1D array
        // This approach doesn't properly access each row first
        for (int i = 0; i < totalElements; i++) {
            // ERROR: Incorrect calculation of row and column indices
            // This will cause problems if rows have different lengths
            int row = i / arr[0].length;
            int col = i % arr[0].length;
            
            // This may cause ArrayIndexOutOfBoundsException if row >= arr.length
            // or if col >= arr[row].length (when rows have different lengths)
            try {
                if (arr[row][col] == target) {
                    return true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // This catch block hides the error but doesn't fix the underlying issue
                System.out.println("Error accessing element at [" + row + "][" + col + "]");
                return false;
            }
        }
        
        return false;
    }
}
/**
 * This program demonstrates the correct implementation of sequential/linear search
 * algorithm to search for specific information in an array.
 *
 * Knowledge Point:
 * - Sequential/linear search checks each element in order until the desired value
 *   is found or all elements have been checked.
 */
public class CON2K1_Exp {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {4, 8, 15, 16, 23, 42};
        int target = 15;

        // Perform sequential search
        int index = sequentialSearch(numbers, target);

        // Display the result
        if (index != -1) {
            System.out.println("Found " + target + " at index " + index);
        } else {
            System.out.println(target + " was not found in the array");
        }

        // Example with a value that doesn't exist in the array
        target = 10;
        index = sequentialSearch(numbers, target);
        if (index != -1) {
            System.out.println("Found " + target + " at index " + index);
        } else {
            System.out.println(target + " was not found in the array");
        }
    }

    /**
     * Performs a sequential search on an array of integers.
     * @param arr The array to search through
     * @param target The value to search for
     * @return The index of the target if found, -1 otherwise
     */
    public static int sequentialSearch(int[] arr, int target) {
        // Check each element in order
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index when target is found
            }
        }
        return -1; // Return -1 if target is not found
    }
}
/**
 * This program demonstrates common mistakes when implementing sequential/linear search
 * algorithm to search for specific information in an array.
 *
 * Common Mistakes:
 * 1. Not checking all elements (early termination)
 * 2. Not handling the case when the element is not found
 * 3. Incorrect loop condition leading to ArrayIndexOutOfBoundsException
 */
public class CON2K1_Err {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {4, 8, 15, 16, 23, 42};
        int target = 15;

        // Example 1: Incorrect implementation - early termination
        System.out.println("\nExample 1: Early termination bug");
        int index = incorrectSearchEarlyTermination(numbers, target);
        System.out.println("Result (should be 2, but got): " + index);

        // Example 2: Incorrect implementation - no handling for not found case
        System.out.println("\nExample 2: No handling for not found case");
        target = 10; // Value that doesn't exist in the array
        try {
            index = incorrectSearchNoNotFound(numbers, target);
            System.out.println("Result (should throw exception): " + index);
        } catch (IllegalStateException e) {
            System.out.println("Correctly caught exception: " + e.getMessage());
        }

        // Example 3: Incorrect implementation - array bounds error
        System.out.println("\nExample 3: Array bounds error");
        try {
            index = incorrectSearchBounds(numbers, target);
            System.out.println("Result (should throw exception): " + index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Correctly caught array bounds exception");
        }
    }

    /**
     * Incorrect implementation: Early termination bug.
     * Bug: Returns -1 immediately if any element doesn't match,
     * instead of continuing to check remaining elements.
     */
    public static int incorrectSearchEarlyTermination(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            } else {
                return -1; // BUG: Returns too early!
            }
        }
        return -1;
    }

    /**
     * Incorrect implementation: No handling for not found case.
     * Bug: Throws exception when element is not found instead of returning -1.
     */
    public static int incorrectSearchNoNotFound(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        throw new IllegalStateException("Element not found!"); // BUG: Should return -1
    }

    /**
     * Incorrect implementation: Array bounds error.
     * Bug: Loop condition can cause ArrayIndexOutOfBoundsException.
     */
    public static int incorrectSearchBounds(int[] arr, int target) {
        for (int i = 0; i <= arr.length; i++) { // BUG: Should be < not <=
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
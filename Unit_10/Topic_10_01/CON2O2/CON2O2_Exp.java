/**
 * CON-2.O.2: Recursive methods contain at least one base case, which halts the recursion,
 * and at least one recursive call.
 *
 * This example demonstrates a recursive binary search algorithm that clearly shows
 * both the base cases and the recursive call.
 */
public class CON2O2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating recursive binary search with base cases and recursive calls:\n");
        
        // Create a sorted array for binary search
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        
        // Print the array
        System.out.print("Sorted array: [");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]);
            if (i < sortedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Search for various values
        int[] valuesToSearch = {16, 91, 2, 50};
        for (int value : valuesToSearch) {
            int result = binarySearch(sortedArray, value, 0, sortedArray.length - 1);
            if (result != -1) {
                System.out.println("\nValue " + value + " found at index " + result);
            } else {
                System.out.println("\nValue " + value + " not found in the array");
            }
        }
        
        System.out.println("\n--- Key Points about Base Cases and Recursive Calls ---");
        System.out.println("1. Every recursive method needs at least one base case to stop recursion");
        System.out.println("2. Base cases are conditions where the method returns without making a recursive call");
        System.out.println("3. In binary search, base cases are: element found or search range is empty");
        System.out.println("4. Every recursive method needs at least one recursive call");
        System.out.println("5. Recursive calls must work on a smaller subproblem to eventually reach a base case");
    }
    
    /**
     * A recursive binary search method that demonstrates base cases and recursive calls.
     * 
     * @param arr The sorted array to search in
     * @param target The value to search for
     * @param left The left boundary of the search range
     * @param right The right boundary of the search range
     * @return The index of the target if found, -1 otherwise
     */
    public static int binarySearch(int[] arr, int target, int left, int right) {
        // Print the current search range to visualize the recursion
        System.out.println("Searching for " + target + " between indices " + left + " and " + right);
        
        // BASE CASE 1: Element not found (search range is empty)
        if (left > right) {
            System.out.println("Base case reached: Empty search range - element not found");
            return -1;
        }
        
        // Calculate the middle index
        int mid = left + (right - left) / 2;
        System.out.println("Middle index: " + mid + ", Middle value: " + arr[mid]);
        
        // BASE CASE 2: Element found
        if (arr[mid] == target) {
            System.out.println("Base case reached: Element found at index " + mid);
            return mid;
        }
        
        // RECURSIVE CASE 1: Target is in the left half
        if (arr[mid] > target) {
            System.out.println("Recursive call: Search left half (indices " + left + " to " + (mid - 1) + ")");
            return binarySearch(arr, target, left, mid - 1);
        }
        
        // RECURSIVE CASE 2: Target is in the right half
        System.out.println("Recursive call: Search right half (indices " + (mid + 1) + " to " + right + ")");
        return binarySearch(arr, target, mid + 1, right);
    }
}
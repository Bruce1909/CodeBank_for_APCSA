/**
 * CON-2.O.2: Recursive methods contain at least one base case, which halts the recursion,
 * and at least one recursive call.
 *
 * This example demonstrates common errors related to base cases and recursive calls:
 * 1. Unreachable base case - logical error prevents reaching the base case
 * 2. Ineffective base case - base case exists but doesn't properly halt recursion
 */
public class CON2O2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with base cases and recursive calls:\n");
        
        // Create a sorted array for binary search
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        
        System.out.println("Example 1: Unreachable base case (commented out to prevent crash)");
        // Uncommenting the next line would cause a StackOverflowError
        // binarySearchUnreachableBase(sortedArray, 16, 0, sortedArray.length - 1);
        
        System.out.println("\nExample 2: Ineffective base case");
        try {
            int result = binarySearchIneffectiveBase(sortedArray, 16, 0, sortedArray.length - 1);
            System.out.println("Result: " + result); // This line won't execute due to StackOverflowError
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError occurred: The recursion never terminates");
        }
        
        System.out.println("\n--- Common Errors with Base Cases and Recursive Calls ---");
        System.out.println("1. Unreachable base case: Logical error prevents the base case from being reached");
        System.out.println("2. Ineffective base case: Base case exists but doesn't properly halt recursion");
        System.out.println("3. Missing recursive call: Method doesn't make progress toward the base case");
        System.out.println("4. Recursive call with wrong parameters: Doesn't properly reduce the problem size");
    }
    
    /**
     * A recursive binary search with an unreachable base case.
     * The condition to check if the element is found has a logical error.
     */
    public static int binarySearchUnreachableBase(int[] arr, int target, int left, int right) {
        System.out.println("Searching between indices " + left + " and " + right);
        
        // Base case for empty search range works correctly
        if (left > right) {
            return -1;
        }
        
        int mid = left + (right - left) / 2;
        
        // Error: Using != instead of == means the base case for finding the element
        // will never be reached, even when the element is present
        if (arr[mid] != target) { // Should be == to reach base case when element is found
            return mid;
        }
        
        // These recursive calls will continue until the search range is empty
        if (arr[mid] > target) {
            return binarySearchUnreachableBase(arr, target, left, mid - 1);
        } else {
            return binarySearchUnreachableBase(arr, target, mid + 1, right);
        }
    }
    
    /**
     * A recursive binary search with an ineffective base case.
     * The base case exists but doesn't properly halt recursion in all scenarios.
     */
    public static int binarySearchIneffectiveBase(int[] arr, int target, int left, int right) {
        System.out.println("Searching between indices " + left + " and " + right);
        
        // Base case for finding the element works correctly
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        
        // Error: Missing the base case for when the element is not found
        // (when left > right). Without this check, the recursion will continue
        // indefinitely when the element is not in the array.
        
        // These recursive calls will continue even when the search range should be empty
        if (arr[mid] > target) {
            return binarySearchIneffectiveBase(arr, target, left, mid - 1);
        } else {
            return binarySearchIneffectiveBase(arr, target, mid + 1, right);
        }
    }
}
/**
 * CON2P1_Err - Error examples demonstrating common mistakes with binary search
 * 
 * This program demonstrates common errors related to CON-2.P.1:
 * Data must be in sorted order to use the binary search algorithm.
 */
public class CON2P1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with binary search:\n");
        
        // Example 1: Using binary search on an unsorted array
        System.out.println("Example 1: Using binary search on an unsorted array");
        int[] unsortedNumbers = {30, 10, 70, 40, 20, 50, 90, 60, 80, 100};
        
        System.out.println("Unsorted array: ");
        printArray(unsortedNumbers);
        
        int target = 50;
        System.out.println("\nSearching for " + target + " using binary search on unsorted data");
        System.out.println("// Error: This will likely produce incorrect results");
        
        int incorrectIndex = binarySearch(unsortedNumbers, target);
        
        if (incorrectIndex != -1) {
            System.out.println("Found " + target + " at index " + incorrectIndex + " (This result may be incorrect!)");
        } else {
            System.out.println(target + " not found in the array (This result may be incorrect!)");
        }
        
        // Show the correct approach
        System.out.println("\nCorrect approach: Sort the array first");
        java.util.Arrays.sort(unsortedNumbers);
        System.out.println("Sorted array: ");
        printArray(unsortedNumbers);
        
        int correctIndex = binarySearch(unsortedNumbers, target);
        System.out.println("\nAfter sorting, found " + target + " at index " + correctIndex);
        System.out.println();
        
        // Example 2: Using binary search on partially sorted data
        System.out.println("Example 2: Using binary search on partially sorted data");
        int[] partiallySorted = {10, 20, 30, 40, 90, 60, 70, 80, 50, 100};
        
        System.out.println("Partially sorted array: ");
        printArray(partiallySorted);
        
        target = 50;
        System.out.println("\nSearching for " + target + " using binary search on partially sorted data");
        System.out.println("// Error: This will likely produce incorrect results");
        
        incorrectIndex = binarySearch(partiallySorted, target);
        
        if (incorrectIndex != -1) {
            System.out.println("Found " + target + " at index " + incorrectIndex + " (This result may be incorrect!)");
        } else {
            System.out.println(target + " not found in the array (This result may be incorrect!)");
        }
        System.out.println();
        
        // Example 3: Using binary search on a sorted array but with duplicates
        System.out.println("Example 3: Using binary search on a sorted array with duplicates");
        int[] sortedWithDuplicates = {10, 20, 30, 30, 30, 40, 50, 60, 70, 80};
        
        System.out.println("Sorted array with duplicates: ");
        printArray(sortedWithDuplicates);
        
        target = 30;
        System.out.println("\nSearching for " + target + " using binary search");
        System.out.println("// Note: Standard binary search will find one of the duplicates, but not necessarily the first occurrence");
        
        int duplicateIndex = binarySearch(sortedWithDuplicates, target);
        
        if (duplicateIndex != -1) {
            System.out.println("Found " + target + " at index " + duplicateIndex + " (May not be the first occurrence)");
        } else {
            System.out.println(target + " not found in the array");
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors with Binary Search ---");
        System.out.println("1. Using binary search on unsorted data");
        System.out.println("2. Using binary search on partially sorted data");
        System.out.println("3. Forgetting that binary search may return any occurrence of a duplicate value");
        System.out.println("4. Not checking if the array is sorted before applying binary search");
        System.out.println("5. Assuming binary search always works faster than linear search (for very small arrays, linear search might be faster)");
    }
    
    /**
     * Performs binary search on an array of integers
     * Note: This method assumes the array is sorted, which is a requirement for binary search
     * @param arr The array to search in (should be sorted)
     * @param target The value to search for
     * @return The index of the target if found, -1 otherwise
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;
            
            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            
            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        
        // Target not found
        return -1;
    }
    
    /**
     * Utility method to print an array of integers
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
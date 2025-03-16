/**
 * CON2P3_Err - Error examples demonstrating common mistakes when comparing search efficiencies
 * 
 * This program demonstrates common errors related to CON-2.P.3:
 * Binary search can be more efficient than sequential/linear search.
 */
public class CON2P3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when comparing search efficiencies:\n");
        
        // Example 1: Using binary search on an unsorted array
        System.out.println("Example 1: Using binary search on an unsorted array");
        int[] unsortedArray = {70, 30, 50, 90, 10, 40, 80, 60, 20, 100};
        
        System.out.println("Unsorted array: ");
        printArray(unsortedArray);
        System.out.println();
        
        int target = 40;
        System.out.println("Searching for " + target + " using both search algorithms:\n");
        
        // Linear search will work correctly on unsorted array
        int linearIndex = linearSearch(unsortedArray, target);
        System.out.println("Linear search found " + target + " at index " + linearIndex);
        
        // Binary search will likely give incorrect results on unsorted array
        int binaryIndex = binarySearch(unsortedArray, target);
        System.out.println("Binary search found " + target + " at index " + binaryIndex + " (This result may be incorrect!)");
        
        System.out.println("\nError: Binary search requires a sorted array to work correctly");
        System.out.println("Correct approach: Sort the array before using binary search");
        System.out.println();
        
        // Example 2: Not considering the cost of sorting when comparing efficiencies
        System.out.println("Example 2: Not considering the cost of sorting when comparing efficiencies");
        int[] arrayToSort = new int[1000];
        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = (int)(Math.random() * 10000); // Random numbers
        }
        
        System.out.println("Created an unsorted array with " + arrayToSort.length + " random elements");
        
        target = arrayToSort[500]; // Pick a value that exists in the array
        System.out.println("Searching for " + target + ":\n");
        
        // Measure linear search performance on unsorted array
        long startTime = System.nanoTime();
        linearIndex = linearSearch(arrayToSort, target);
        long linearTime = System.nanoTime() - startTime;
        
        // Measure binary search performance INCLUDING sorting time
        startTime = System.nanoTime();
        // First, we need to sort the array
        java.util.Arrays.sort(arrayToSort);
        // Then perform binary search
        binaryIndex = binarySearch(arrayToSort, target);
        long binaryWithSortTime = System.nanoTime() - startTime;
        
        // Print results
        System.out.println("Linear search time (unsorted): " + linearTime + " nanoseconds");
        System.out.println("Binary search time (including sorting): " + binaryWithSortTime + " nanoseconds");
        
        if (binaryWithSortTime > linearTime) {
            System.out.println("Error: Binary search appears slower because we included sorting time");
        }
        
        System.out.println("\nCorrect approach: Consider whether the array is already sorted or needs to be sorted");
        System.out.println("If the array needs to be sorted first, include that cost in your efficiency analysis");
        System.out.println("If you'll be searching the same sorted array multiple times, binary search becomes more efficient");
        System.out.println();
        
        // Example 3: Using binary search for very small arrays
        System.out.println("Example 3: Using binary search for very small arrays");
        int[] tinyArray = {10, 20, 30};
        
        System.out.println("Tiny sorted array: ");
        printArray(tinyArray);
        System.out.println();
        
        target = 20;
        System.out.println("Searching for " + target + " in a tiny array:\n");
        
        // Measure linear search performance
        startTime = System.nanoTime();
        linearIndex = linearSearch(tinyArray, target);
        linearTime = System.nanoTime() - startTime;
        
        // Measure binary search performance
        startTime = System.nanoTime();
        binaryIndex = binarySearch(tinyArray, target);
        long binaryTime = System.nanoTime() - startTime;
        
        // Print results
        System.out.println("Linear search time: " + linearTime + " nanoseconds");
        System.out.println("Binary search time: " + binaryTime + " nanoseconds");
        
        System.out.println("\nError: For very small arrays, linear search might be faster due to less overhead");
        System.out.println("Correct approach: Consider the size of the array when choosing a search algorithm");
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors When Comparing Search Efficiencies ---");
        System.out.println("1. Using binary search on unsorted data (binary search requires sorted data)");
        System.out.println("2. Not considering the cost of sorting when comparing efficiencies");
        System.out.println("3. Using binary search for very small arrays where linear search might be faster");
        System.out.println("4. Forgetting that binary search has O(log n) complexity while linear search has O(n)");
        System.out.println("5. Not considering that binary search requires more complex code than linear search");
    }
    
    /**
     * Performs linear search on an array
     * @param arr The array to search in
     * @param target The value to search for
     * @return The index of the target if found, -1 otherwise
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Performs binary search on an array (assumes the array is sorted)
     * @param arr The array to search in (should be sorted)
     * @param target The value to search for
     * @return The index of the target if found, -1 otherwise
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
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
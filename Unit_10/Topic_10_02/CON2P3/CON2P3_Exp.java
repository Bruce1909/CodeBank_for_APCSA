/**
 * CON2P3_Exp - Example demonstrating binary search efficiency compared to linear search
 * 
 * This program demonstrates CON-2.P.3:
 * Binary search can be more efficient than sequential/linear search.
 */
public class CON2P3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating binary search efficiency compared to sequential/linear search:\n");
        
        // Example 1: Comparing search algorithms on a small array
        System.out.println("Example 1: Comparing search algorithms on a small array");
        int[] smallArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        System.out.println("Sorted array: ");
        printArray(smallArray);
        System.out.println();
        
        int target = 70;
        System.out.println("Searching for " + target + " using both search algorithms:\n");
        
        // Measure linear search performance
        long startTime = System.nanoTime();
        int linearIndex = linearSearch(smallArray, target);
        long linearTime = System.nanoTime() - startTime;
        
        // Measure binary search performance
        startTime = System.nanoTime();
        int binaryIndex = binarySearch(smallArray, target);
        long binaryTime = System.nanoTime() - startTime;
        
        // Print results
        System.out.println("Linear search found " + target + " at index " + linearIndex);
        System.out.println("Binary search found " + target + " at index " + binaryIndex);
        System.out.println("Linear search time: " + linearTime + " nanoseconds");
        System.out.println("Binary search time: " + binaryTime + " nanoseconds");
        System.out.println("For small arrays, the time difference may not be significant.\n");
        
        // Example 2: Comparing search algorithms on a large array
        System.out.println("Example 2: Comparing search algorithms on a large array");
        int[] largeArray = new int[100000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i * 2; // Even numbers from 0 to 199998
        }
        
        System.out.println("Created a sorted array with " + largeArray.length + " elements");
        
        target = 199998; // Last element
        System.out.println("Searching for " + target + " (worst case for linear search):\n");
        
        // Measure linear search performance
        startTime = System.nanoTime();
        linearIndex = linearSearch(largeArray, target);
        linearTime = System.nanoTime() - startTime;
        
        // Measure binary search performance
        startTime = System.nanoTime();
        binaryIndex = binarySearch(largeArray, target);
        binaryTime = System.nanoTime() - startTime;
        
        // Print results
        System.out.println("Linear search found " + target + " at index " + linearIndex);
        System.out.println("Binary search found " + target + " at index " + binaryIndex);
        System.out.println("Linear search time: " + linearTime + " nanoseconds");
        System.out.println("Binary search time: " + binaryTime + " nanoseconds");
        System.out.println("Binary search is significantly faster for large arrays.\n");
        
        // Example 3: Comparing the number of comparisons
        System.out.println("Example 3: Comparing the number of comparisons");
        int[] mediumArray = new int[1000];
        for (int i = 0; i < mediumArray.length; i++) {
            mediumArray[i] = i + 1; // Numbers from 1 to 1000
        }
        
        System.out.println("Created a sorted array with " + mediumArray.length + " elements");
        
        target = 1000; // Last element (worst case for linear search)
        System.out.println("Searching for " + target + " and counting comparisons:\n");
        
        // Count comparisons for linear search
        int linearComparisons = linearSearchWithCounter(mediumArray, target);
        
        // Count comparisons for binary search
        int binaryComparisons = binarySearchWithCounter(mediumArray, target);
        
        // Print results
        System.out.println("Linear search required " + linearComparisons + " comparisons");
        System.out.println("Binary search required " + binaryComparisons + " comparisons");
        System.out.println("Binary search is more efficient in terms of comparisons.\n");
        
        // Summary
        System.out.println("--- Key Points about Search Algorithm Efficiency ---");
        System.out.println("1. Linear search has O(n) time complexity - proportional to the size of the array");
        System.out.println("2. Binary search has O(log n) time complexity - much more efficient for large arrays");
        System.out.println("3. For small arrays, the difference may not be noticeable");
        System.out.println("4. Binary search requires the array to be sorted first");
        System.out.println("5. If the array is already sorted, binary search is almost always preferable");
        System.out.println("6. If the array needs to be sorted first, consider the sorting cost in your efficiency analysis");
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
     * Performs binary search on a sorted array
     * @param arr The sorted array to search in
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
     * Performs linear search and counts the number of comparisons
     * @param arr The array to search in
     * @param target The value to search for
     * @return The number of comparisons made
     */
    public static int linearSearchWithCounter(int[] arr, int target) {
        int comparisons = 0;
        
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == target) {
                System.out.println("Linear search found " + target + " at index " + i);
                return comparisons;
            }
        }
        
        System.out.println("Linear search did not find " + target);
        return comparisons;
    }
    
    /**
     * Performs binary search and counts the number of comparisons
     * @param arr The sorted array to search in
     * @param target The value to search for
     * @return The number of comparisons made
     */
    public static int binarySearchWithCounter(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int comparisons = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            comparisons++;
            if (arr[mid] == target) {
                System.out.println("Binary search found " + target + " at index " + mid);
                return comparisons;
            }
            
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println("Binary search did not find " + target);
        return comparisons;
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
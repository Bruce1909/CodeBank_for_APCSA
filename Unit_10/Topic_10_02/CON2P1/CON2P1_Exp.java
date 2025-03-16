/**
 * CON2P1_Exp - Example demonstrating binary search on sorted data
 * 
 * This program demonstrates CON-2.P.1:
 * Data must be in sorted order to use the binary search algorithm.
 */
public class CON2P1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating binary search on sorted data:\n");
        
        // Example 1: Binary search on a sorted array of integers
        System.out.println("Example 1: Binary search on a sorted array of integers");
        int[] sortedNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        System.out.println("Sorted array: ");
        printArray(sortedNumbers);
        
        int target = 50;
        int index = binarySearch(sortedNumbers, target);
        
        if (index != -1) {
            System.out.println("\nFound " + target + " at index " + index);
        } else {
            System.out.println("\n" + target + " not found in the array");
        }
        System.out.println();
        
        // Example 2: Binary search on a sorted array of strings
        System.out.println("Example 2: Binary search on a sorted array of strings");
        String[] sortedNames = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah"};
        
        System.out.println("Sorted array of names: ");
        printArray(sortedNames);
        
        String targetName = "Eve";
        int nameIndex = binarySearch(sortedNames, targetName);
        
        if (nameIndex != -1) {
            System.out.println("\nFound '" + targetName + "' at index " + nameIndex);
        } else {
            System.out.println("\n'" + targetName + "' not found in the array");
        }
        System.out.println();
        
        // Example 3: Using Java's built-in binary search
        System.out.println("Example 3: Using Java's built-in binary search");
        int builtInIndex = java.util.Arrays.binarySearch(sortedNumbers, target);
        System.out.println("Using Arrays.binarySearch() to find " + target + ": index = " + builtInIndex);
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Binary Search and Sorted Data ---");
        System.out.println("1. Binary search REQUIRES data to be sorted first");
        System.out.println("2. Binary search is efficient with O(log n) time complexity");
        System.out.println("3. Binary search works by repeatedly dividing the search interval in half");
        System.out.println("4. Java provides built-in binary search methods in the Arrays and Collections classes");
        System.out.println("5. If data is not sorted, binary search will produce incorrect results");
    }
    
    /**
     * Performs binary search on a sorted array of integers
     * @param arr The sorted array to search in
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
     * Performs binary search on a sorted array of strings
     * @param arr The sorted array to search in
     * @param target The string to search for
     * @return The index of the target if found, -1 otherwise
     */
    public static int binarySearch(String[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;
            
            // Compare the target with the middle element
            int comparison = target.compareTo(arr[mid]);
            
            // Check if target is present at mid
            if (comparison == 0) {
                return mid;
            }
            
            // If target is greater, ignore left half
            if (comparison > 0) {
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
    
    /**
     * Utility method to print an array of strings
     */
    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("'" + arr[i] + "'");
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
/**
 * CON2P4_Exp - Example demonstrating iterative and recursive binary search implementations
 * 
 * This program demonstrates CON-2.P.4:
 * The binary search algorithm can be written either iteratively or recursively.
 */
public class CON2P4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating iterative and recursive binary search implementations:\n");
        
        // Example 1: Comparing iterative and recursive binary search on an array of integers
        System.out.println("Example 1: Comparing iterative and recursive binary search");
        int[] sortedNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        System.out.println("Sorted array: ");
        printArray(sortedNumbers);
        System.out.println();
        
        // Search for a value using both implementations
        int target = 60;
        System.out.println("Searching for " + target + " using both implementations:\n");
        
        // Iterative binary search
        int iterativeIndex = binarySearchIterative(sortedNumbers, target);
        System.out.println("Iterative binary search found " + target + " at index " + iterativeIndex);
        
        // Recursive binary search
        int recursiveIndex = binarySearchRecursive(sortedNumbers, target, 0, sortedNumbers.length - 1);
        System.out.println("Recursive binary search found " + target + " at index " + recursiveIndex);
        System.out.println();
        
        // Example 2: Tracing through the recursive binary search execution
        System.out.println("Example 2: Tracing through the recursive binary search execution");
        System.out.println("Sorted array: ");
        printArray(sortedNumbers);
        System.out.println();
        
        target = 80;
        System.out.println("Searching for " + target + " using recursive binary search with detailed tracing:\n");
        
        // Recursive binary search with tracing
        recursiveIndex = binarySearchRecursiveWithTracing(sortedNumbers, target, 0, sortedNumbers.length - 1, 1);
        System.out.println("\nRecursive binary search found " + target + " at index " + recursiveIndex);
        System.out.println();
        
        // Example 3: Comparing implementations on an ArrayList
        System.out.println("Example 3: Comparing implementations on an ArrayList");
        java.util.ArrayList<String> namesList = new java.util.ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        namesList.add("David");
        namesList.add("Eve");
        namesList.add("Frank");
        namesList.add("Grace");
        namesList.add("Hannah");
        
        System.out.println("Sorted ArrayList of names: " + namesList);
        
        String targetName = "Frank";
        System.out.println("\nSearching for '" + targetName + "' using both implementations:\n");
        
        // Iterative binary search on ArrayList
        int iterativeNameIndex = binarySearchIterative(namesList, targetName);
        System.out.println("Iterative binary search found '" + targetName + "' at index " + iterativeNameIndex);
        
        // Recursive binary search on ArrayList
        int recursiveNameIndex = binarySearchRecursive(namesList, targetName, 0, namesList.size() - 1);
        System.out.println("Recursive binary search found '" + targetName + "' at index " + recursiveNameIndex);
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Iterative vs. Recursive Binary Search ---");
        System.out.println("1. Both implementations have the same O(log n) time complexity");
        System.out.println("2. Iterative implementation uses a loop, recursive uses method calls");
        System.out.println("3. Recursive implementation may be more intuitive and easier to understand");
        System.out.println("4. Iterative implementation is often more efficient in practice (no method call overhead)");
        System.out.println("5. Recursive implementation uses more memory due to the call stack");
        System.out.println("6. For very large arrays, recursive implementation might cause stack overflow");
        System.out.println("7. Both implementations require the data to be sorted");
    }
    
    /**
     * Performs binary search iteratively on a sorted array of integers
     * @param arr The sorted array to search in
     * @param target The value to search for
     * @return The index of the target if found, -1 otherwise
     */
    public static int binarySearchIterative(int[] arr, int target) {
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
     * Performs binary search recursively on a sorted array of integers
     * @param arr The sorted array to search in
     * @param target The value to search for
     * @param left The left boundary of the search
     * @param right The right boundary of the search
     * @return The index of the target if found, -1 otherwise
     */
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        // Base case: element not found
        if (left > right) {
            return -1;
        }
        
        // Calculate the middle index
        int mid = left + (right - left) / 2;
        
        // Check if target is present at mid
        if (arr[mid] == target) {
            return mid;
        }
        
        // If target is greater, search the right half
        if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        }
        
        // If target is smaller, search the left half
        return binarySearchRecursive(arr, target, left, mid - 1);
    }
    
    /**
     * Performs binary search recursively with detailed tracing
     */
    public static int binarySearchRecursiveWithTracing(int[] arr, int target, int left, int right, int depth) {
        // Print indentation based on recursion depth
        String indent = "  ".repeat(depth - 1);
        
        System.out.println(indent + "Call depth " + depth + ": Searching for " + target + " in range [" + left + ", " + right + "]");
        System.out.print(indent + "Current subarray: ");
        printArrayRange(arr, left, right);
        System.out.println();
        
        // Base case: element not found
        if (left > right) {
            System.out.println(indent + "Base case reached: left > right, element not found");
            return -1;
        }
        
        // Calculate the middle index
        int mid = left + (right - left) / 2;
        System.out.println(indent + "Middle index: " + mid + ", value: " + arr[mid]);
        
        // Check if target is present at mid
        if (arr[mid] == target) {
            System.out.println(indent + "Target found at index " + mid + "!");
            return mid;
        }
        
        // If target is greater, search the right half
        if (arr[mid] < target) {
            System.out.println(indent + "Target " + target + " > middle element " + arr[mid] + ", searching right half");
            return binarySearchRecursiveWithTracing(arr, target, mid + 1, right, depth + 1);
        }
        
        // If target is smaller, search the left half
        System.out.println(indent + "Target " + target + " < middle element " + arr[mid] + ", searching left half");
        return binarySearchRecursiveWithTracing(arr, target, left, mid - 1, depth + 1);
    }
    
    /**
     * Performs binary search iteratively on a sorted ArrayList of strings
     * @param list The sorted ArrayList to search in
     * @param target The string to search for
     * @return The index of the target if found, -1 otherwise
     */
    public static int binarySearchIterative(java.util.ArrayList<String> list, String target) {
        int left = 0;
        int right = list.size() - 1;
        
        while (left <= right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;
            
            // Compare the target with the middle element
            int comparison = target.compareTo(list.get(mid));
            
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
     * Performs binary search recursively on a sorted ArrayList of strings
     * @param list The sorted ArrayList to search in
     * @param target The string to search for
     * @param left The left boundary of the search
     * @param right The right boundary of the search
     * @return The index of the target if found, -1 otherwise
     */
    public static int binarySearchRecursive(java.util.ArrayList<String> list, String target, int left, int right) {
        // Base case: element not found
        if (left > right) {
            return -1;
        }
        
        // Calculate the middle index
        int mid = left + (right - left) / 2;
        
        // Compare the target with the middle element
        int comparison = target.compareTo(list.get(mid));
        
        // Check if target is present at mid
        if (comparison == 0) {
            return mid;
        }
        
        // If target is greater, search the right half
        if (comparison > 0) {
            return binarySearchRecursive(list, target, mid + 1, right);
        }
        
        // If target is smaller, search the left half
        return binarySearchRecursive(list, target, left, mid - 1);
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
     * Utility method to print a range of an array
     */
    public static void printArrayRange(int[] arr, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
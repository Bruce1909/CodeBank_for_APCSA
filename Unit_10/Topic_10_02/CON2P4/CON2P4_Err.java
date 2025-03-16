/**
 * CON2P4_Err - Error examples demonstrating common mistakes with iterative and recursive binary search
 * 
 * This program demonstrates common errors related to CON-2.P.4:
 * The binary search algorithm can be written either iteratively or recursively.
 */
public class CON2P4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with iterative and recursive binary search:\n");
        
        // Example 1: Recursive binary search with incorrect base case
        System.out.println("Example 1: Recursive binary search with incorrect base case");
        int[] sortedNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        System.out.println("Sorted array: ");
        printArray(sortedNumbers);
        System.out.println();
        
        int target = 110; // Value not in the array
        System.out.println("Searching for " + target + " using recursive binary search with incorrect base case:\n");
        
        try {
            // This will cause a stack overflow due to missing or incorrect base case
            int incorrectIndex = binarySearchRecursiveWithIncorrectBaseCase(sortedNumbers, target, 0, sortedNumbers.length - 1);
            System.out.println("Found " + target + " at index " + incorrectIndex);
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow error occurred due to incorrect base case!");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        
        // Show the correct approach
        System.out.println("\nCorrect approach: Properly check base case when element is not found");
        System.out.println("if (left > right) { // Base case: element not found");
        System.out.println("    return -1;");
        System.out.println("}\n");
        
        // Example 2: Iterative binary search with incorrect loop condition
        System.out.println("Example 2: Iterative binary search with incorrect loop condition");
        System.out.println("Sorted array: ");
        printArray(sortedNumbers);
        System.out.println();
        
        target = 90;
        System.out.println("Searching for " + target + " using iterative binary search with incorrect loop condition:\n");
        
        // Using incorrect loop condition that can miss elements
        int incorrectIndex = binarySearchIterativeWithIncorrectCondition(sortedNumbers, target);
        
        if (incorrectIndex != -1) {
            System.out.println("Found " + target + " at index " + incorrectIndex);
        } else {
            System.out.println(target + " not found in the array (This result may be incorrect!)");
        }
        
        // Show the correct approach
        System.out.println("\nCorrect approach: Use proper loop condition");
        System.out.println("while (left <= right) { // Use <= to ensure all elements are checked");
        System.out.println("    // Binary search logic");
        System.out.println("}\n");
        
        // Example 3: Recursive binary search with incorrect parameter updates
        System.out.println("Example 3: Recursive binary search with incorrect parameter updates");
        System.out.println("Sorted array: ");
        printArray(sortedNumbers);
        System.out.println();
        
        target = 30;
        System.out.println("Searching for " + target + " using recursive binary search with incorrect parameter updates:\n");
        
        try {
            // This might cause infinite recursion or incorrect results due to improper parameter updates
            incorrectIndex = binarySearchRecursiveWithIncorrectUpdates(sortedNumbers, target, 0, sortedNumbers.length - 1, 1);
            
            if (incorrectIndex != -1) {
                System.out.println("Found " + target + " at index " + incorrectIndex + " (This result may be incorrect!)");
            } else {
                System.out.println(target + " not found in the array (This result may be incorrect!)");
            }
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow error occurred due to incorrect parameter updates!");
        }
        
        // Show the correct approach
        System.out.println("\nCorrect approach: Properly update parameters in recursive calls");
        System.out.println("return binarySearchRecursive(arr, target, mid + 1, right); // For right half");
        System.out.println("return binarySearchRecursive(arr, target, left, mid - 1); // For left half\n");
        
        // Example 4: Not handling potential stack overflow in recursive implementation
        System.out.println("Example 4: Not handling potential stack overflow in recursive implementation");
        
        // Create a very large array that might cause stack overflow with recursive approach
        System.out.println("For very large arrays, recursive binary search might cause stack overflow");
        System.out.println("Correct approach: Use iterative binary search for very large arrays or");
        System.out.println("implement tail recursion optimization if supported by the language\n");
        
        // Summary
        System.out.println("--- Common Errors with Iterative and Recursive Binary Search ---");
        System.out.println("1. Missing or incorrect base case in recursive implementation (can cause stack overflow)");
        System.out.println("2. Using < instead of <= in the iterative loop condition (can miss elements)");
        System.out.println("3. Incorrect parameter updates in recursive calls (can cause infinite recursion)");
        System.out.println("4. Not handling potential stack overflow for large arrays in recursive implementation");
        System.out.println("5. Forgetting to return the recursive call result (common mistake in recursive functions)");
    }
    
    /**
     * Performs binary search recursively with an incorrect base case
     * This can cause stack overflow if the target is not in the array
     */
    public static int binarySearchRecursiveWithIncorrectBaseCase(int[] arr, int target, int left, int right) {
        // Missing or incorrect base case!
        // Should check if left > right to handle case when element is not found
        
        // Calculate the middle index
        int mid = left + (right - left) / 2;
        
        // Check if target is present at mid
        if (arr[mid] == target) {
            return mid;
        }
        
        // If target is greater, search the right half
        if (arr[mid] < target) {
            return binarySearchRecursiveWithIncorrectBaseCase(arr, target, mid + 1, right);
        }
        
        // If target is smaller, search the left half
        return binarySearchRecursiveWithIncorrectBaseCase(arr, target, left, mid - 1);
    }
    
    /**
     * Performs binary search iteratively with an incorrect loop condition
     * Using < instead of <= can cause the algorithm to miss elements
     */
    public static int binarySearchIterativeWithIncorrectCondition(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        // Incorrect loop condition: using < instead of <=
        while (left < right) { // This can miss checking the last element when left == right
            // Calculate the middle index
            int mid = left + (right - left) / 2;
            
            System.out.println("Checking range [" + left + ", " + right + "], mid = " + mid);
            
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
        
        // Check the last element when left == right
        if (left == right && arr[left] == target) {
            return left;
        }
        
        // Target not found
        return -1;
    }
    
    /**
     * Performs binary search recursively with incorrect parameter updates
     * This can cause infinite recursion or incorrect results
     */
    public static int binarySearchRecursiveWithIncorrectUpdates(int[] arr, int target, int left, int right, int depth) {
        // Limit recursion depth to prevent stack overflow during demonstration
        if (depth > 10) {
            System.out.println("Maximum recursion depth reached, stopping to prevent stack overflow");
            return -1;
        }
        
        // Base case: element not found
        if (left > right) {
            return -1;
        }
        
        // Calculate the middle index
        int mid = left + (right - left) / 2;
        
        System.out.println("Depth " + depth + ": Checking range [" + left + ", " + right + "], mid = " + mid);
        
        // Check if target is present at mid
        if (arr[mid] == target) {
            return mid;
        }
        
        // Incorrect parameter updates
        if (arr[mid] < target) {
            // Error: should be mid + 1, not mid
            return binarySearchRecursiveWithIncorrectUpdates(arr, target, mid, right, depth + 1);
        } else {
            // Error: should be mid - 1, not mid
            return binarySearchRecursiveWithIncorrectUpdates(arr, target, left, mid, depth + 1);
        }
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
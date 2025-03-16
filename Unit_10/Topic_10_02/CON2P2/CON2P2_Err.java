/**
 * CON2P2_Err - Error examples demonstrating common mistakes with binary search elimination
 * 
 * This program demonstrates common errors related to CON-2.P.2:
 * The binary search algorithm starts at the middle of a sorted array or ArrayList and eliminates
 * half of the array or ArrayList in each iteration until the desired value is found or all elements
 * have been eliminated.
 */
public class CON2P2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with binary search elimination:\n");
        
        // Example 1: Incorrectly calculating the middle index
        System.out.println("Example 1: Incorrectly calculating the middle index");
        int[] sortedNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        System.out.println("Sorted array: ");
        printArray(sortedNumbers);
        System.out.println();
        
        int target = 70;
        System.out.println("Searching for " + target + " using binary search with incorrect middle calculation:\n");
        
        // Using incorrect middle calculation that can cause integer overflow for large arrays
        int incorrectIndex = binarySearchWithIncorrectMid(sortedNumbers, target);
        
        if (incorrectIndex != -1) {
            System.out.println("\nFound " + target + " at index " + incorrectIndex);
        } else {
            System.out.println("\n" + target + " not found in the array");
        }
        
        // Show the correct approach
        System.out.println("\nCorrect approach: Calculate middle index safely to prevent overflow");
        System.out.println("int mid = left + (right - left) / 2; // Prevents integer overflow");
        System.out.println();
        
        // Example 2: Incorrectly updating search boundaries
        System.out.println("Example 2: Incorrectly updating search boundaries");
        System.out.println("Sorted array: ");
        printArray(sortedNumbers);
        System.out.println();
        
        target = 40;
        System.out.println("Searching for " + target + " using binary search with incorrect boundary updates:\n");
        
        // Using incorrect boundary updates that can cause infinite loops or missed elements
        incorrectIndex = binarySearchWithIncorrectBoundaries(sortedNumbers, target);
        
        if (incorrectIndex != -1) {
            System.out.println("\nFound " + target + " at index " + incorrectIndex);
        } else {
            System.out.println("\n" + target + " not found in the array (This result may be incorrect!)");
        }
        
        // Show the correct approach
        System.out.println("\nCorrect approach: Properly update boundaries to eliminate exactly half");
        System.out.println("left = mid + 1; // Move right past the middle element");
        System.out.println("right = mid - 1; // Move left before the middle element");
        System.out.println();
        
        // Example 3: Not eliminating half of the array in each iteration
        System.out.println("Example 3: Not eliminating half of the array in each iteration");
        System.out.println("Sorted array: ");
        printArray(sortedNumbers);
        System.out.println();
        
        target = 90;
        System.out.println("Searching for " + target + " using inefficient search that doesn't eliminate half each time:\n");
        
        // Using an inefficient approach that doesn't eliminate half each time
        int steps = linearSearchWithSteps(sortedNumbers, target);
        System.out.println("\nLinear search found " + target + " after " + steps + " steps");
        
        steps = binarySearchWithSteps(sortedNumbers, target);
        System.out.println("Binary search found " + target + " after " + steps + " steps");
        
        System.out.println("\nCorrect approach: Use proper binary search to eliminate half each iteration");
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors with Binary Search Elimination ---");
        System.out.println("1. Incorrectly calculating the middle index (can cause integer overflow)");
        System.out.println("2. Incorrectly updating search boundaries (can cause infinite loops or missed elements)");
        System.out.println("3. Not eliminating half of the array in each iteration (defeats the purpose of binary search)");
        System.out.println("4. Using < instead of <= in the while loop condition (can miss elements)");
        System.out.println("5. Forgetting to update search boundaries (causes infinite loops)");
    }
    
    /**
     * Performs binary search with an incorrect middle index calculation
     * This can cause integer overflow for large arrays
     */
    public static int binarySearchWithIncorrectMid(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int iteration = 1;
        
        while (left <= right) {
            // Incorrect middle calculation that can cause overflow
            int mid = (left + right) / 2; // Can overflow if left + right > Integer.MAX_VALUE
            
            System.out.println("Iteration " + iteration + ":");
            System.out.println("left = " + left + ", right = " + right);
            System.out.println("mid = (" + left + " + " + right + ") / 2 = " + mid);
            System.out.println("arr[mid] = " + arr[mid]);
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            
            iteration++;
            System.out.println();
        }
        
        return -1;
    }
    
    /**
     * Performs binary search with incorrect boundary updates
     * This can cause infinite loops or missed elements
     */
    public static int binarySearchWithIncorrectBoundaries(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int iteration = 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            System.out.println("Iteration " + iteration + ":");
            System.out.println("left = " + left + ", right = " + right);
            System.out.println("mid = " + mid);
            System.out.println("arr[mid] = " + arr[mid]);
            
            if (arr[mid] == target) {
                return mid;
            }
            
            // Incorrect boundary updates
            if (arr[mid] < target) {
                left = mid; // Error: Should be mid + 1, this can cause infinite loop
            } else {
                right = mid; // Error: Should be mid - 1, this can cause infinite loop
            }
            
            // Check for infinite loop
            if (iteration > 10) {
                System.out.println("Possible infinite loop detected! Breaking out.");
                break;
            }
            
            iteration++;
            System.out.println();
        }
        
        return -1;
    }
    
    /**
     * Performs linear search with step counting
     * This doesn't eliminate half of the array in each iteration
     */
    public static int linearSearchWithSteps(int[] arr, int target) {
        int steps = 0;
        
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == target) {
                return steps;
            }
        }
        
        return steps;
    }
    
    /**
     * Performs binary search with step counting
     */
    public static int binarySearchWithSteps(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int steps = 0;
        
        while (left <= right) {
            steps++;
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return steps;
            }
            
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return steps;
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
/**
 * CON2P2_Exp - Example demonstrating how binary search works
 * 
 * This program demonstrates CON-2.P.2:
 * The binary search algorithm starts at the middle of a sorted array or ArrayList and eliminates
 * half of the array or ArrayList in each iteration until the desired value is found or all elements
 * have been eliminated.
 */
public class CON2P2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how binary search works by eliminating half the array each iteration:\n");
        
        // Example 1: Binary search on a sorted array with detailed steps
        System.out.println("Example 1: Binary search on a sorted array with detailed steps");
        int[] sortedNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        System.out.println("Sorted array: ");
        printArray(sortedNumbers);
        System.out.println();
        
        int target = 70;
        System.out.println("Searching for " + target + " using binary search with detailed steps:\n");
        
        int index = binarySearchWithSteps(sortedNumbers, target);
        
        if (index != -1) {
            System.out.println("\nFound " + target + " at index " + index);
        } else {
            System.out.println("\n" + target + " not found in the array");
        }
        System.out.println();
        
        // Example 2: Binary search on an ArrayList with detailed steps
        System.out.println("Example 2: Binary search on an ArrayList with detailed steps");
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
        
        String targetName = "David";
        System.out.println("\nSearching for '" + targetName + "' using binary search with detailed steps:\n");
        
        int nameIndex = binarySearchWithSteps(namesList, targetName);
        
        if (nameIndex != -1) {
            System.out.println("\nFound '" + targetName + "' at index " + nameIndex);
        } else {
            System.out.println("\n'" + targetName + "' not found in the ArrayList");
        }
        System.out.println();
        
        // Example 3: Binary search on a String (searching for a character)
        System.out.println("Example 3: Binary search on a String (searching for a character)");
        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("String: " + text);
        
        char targetChar = 'P';
        System.out.println("\nSearching for '" + targetChar + "' using binary search with detailed steps:\n");
        
        int charIndex = binarySearchWithSteps(text, targetChar);
        
        if (charIndex != -1) {
            System.out.println("\nFound '" + targetChar + "' at index " + charIndex);
        } else {
            System.out.println("\n'" + targetChar + "' not found in the string");
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Binary Search Algorithm ---");
        System.out.println("1. Binary search starts at the middle of a sorted collection");
        System.out.println("2. It compares the target value with the middle element");
        System.out.println("3. If the target equals the middle element, the search is complete");
        System.out.println("4. If the target is less than the middle element, search the left half");
        System.out.println("5. If the target is greater than the middle element, search the right half");
        System.out.println("6. Each iteration eliminates half of the remaining elements");
        System.out.println("7. The process continues until the target is found or all elements are eliminated");
    }
    
    /**
     * Performs binary search on a sorted array of integers with detailed steps
     * @param arr The sorted array to search in
     * @param target The value to search for
     * @return The index of the target if found, -1 otherwise
     */
    public static int binarySearchWithSteps(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int iteration = 1;
        
        while (left <= right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;
            
            // Print the current state of the search
            System.out.println("Iteration " + iteration + ":");
            System.out.print("Current search range: ");
            printArrayRange(arr, left, right);
            System.out.println("\nMiddle element at index " + mid + ": " + arr[mid]);
            
            // Check if target is present at mid
            if (arr[mid] == target) {
                System.out.println("Target " + target + " found at index " + mid);
                return mid;
            }
            
            // If target is greater, ignore left half
            if (arr[mid] < target) {
                System.out.println("Target " + target + " is greater than middle element " + arr[mid]);
                System.out.println("Eliminating left half (indices " + left + " to " + mid + ")");
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                System.out.println("Target " + target + " is less than middle element " + arr[mid]);
                System.out.println("Eliminating right half (indices " + mid + " to " + right + ")");
                right = mid - 1;
            }
            
            iteration++;
            System.out.println();
        }
        
        // Target not found
        System.out.println("Target " + target + " not found in the array");
        return -1;
    }
    
    /**
     * Performs binary search on a sorted ArrayList of strings with detailed steps
     * @param list The sorted ArrayList to search in
     * @param target The string to search for
     * @return The index of the target if found, -1 otherwise
     */
    public static int binarySearchWithSteps(java.util.ArrayList<String> list, String target) {
        int left = 0;
        int right = list.size() - 1;
        int iteration = 1;
        
        while (left <= right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;
            
            // Print the current state of the search
            System.out.println("Iteration " + iteration + ":");
            System.out.print("Current search range: ");
            printArrayListRange(list, left, right);
            System.out.println("\nMiddle element at index " + mid + ": '" + list.get(mid) + "'");
            
            // Compare the target with the middle element
            int comparison = target.compareTo(list.get(mid));
            
            // Check if target is present at mid
            if (comparison == 0) {
                System.out.println("Target '" + target + "' found at index " + mid);
                return mid;
            }
            
            // If target is greater, ignore left half
            if (comparison > 0) {
                System.out.println("Target '" + target + "' is greater than middle element '" + list.get(mid) + "'");
                System.out.println("Eliminating left half (indices " + left + " to " + mid + ")");
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                System.out.println("Target '" + target + "' is less than middle element '" + list.get(mid) + "'");
                System.out.println("Eliminating right half (indices " + mid + " to " + right + ")");
                right = mid - 1;
            }
            
            iteration++;
            System.out.println();
        }
        
        // Target not found
        System.out.println("Target '" + target + "' not found in the ArrayList");
        return -1;
    }
    
    /**
     * Performs binary search on a String (searching for a character) with detailed steps
     * @param str The string to search in
     * @param target The character to search for
     * @return The index of the target if found, -1 otherwise
     */
    public static int binarySearchWithSteps(String str, char target) {
        int left = 0;
        int right = str.length() - 1;
        int iteration = 1;
        
        while (left <= right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;
            
            // Print the current state of the search
            System.out.println("Iteration " + iteration + ":");
            System.out.print("Current search range: ");
            printStringRange(str, left, right);
            System.out.println("\nMiddle element at index " + mid + ": '" + str.charAt(mid) + "'");
            
            // Check if target is present at mid
            if (str.charAt(mid) == target) {
                System.out.println("Target '" + target + "' found at index " + mid);
                return mid;
            }
            
            // If target is greater, ignore left half
            if (str.charAt(mid) < target) {
                System.out.println("Target '" + target + "' is greater than middle element '" + str.charAt(mid) + "'");
                System.out.println("Eliminating left half (indices " + left + " to " + mid + ")");
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                System.out.println("Target '" + target + "' is less than middle element '" + str.charAt(mid) + "'");
                System.out.println("Eliminating right half (indices " + mid + " to " + right + ")");
                right = mid - 1;
            }
            
            iteration++;
            System.out.println();
        }
        
        // Target not found
        System.out.println("Target '" + target + "' not found in the string");
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
    
    /**
     * Utility method to print a range of an ArrayList
     */
    public static void printArrayListRange(java.util.ArrayList<String> list, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print("'" + list.get(i) + "'");
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    
    /**
     * Utility method to print a range of a String
     */
    public static void printStringRange(String str, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print("'" + str.charAt(i) + "'");
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
/**
 * CON-2.O.6: Recursion can be used to traverse String, array, and ArrayList objects.
 *
 * This example demonstrates how recursion can be used to traverse and process
 * different types of data structures: Strings, arrays, and ArrayLists.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class CON2O6_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating recursive traversal of different data structures:\n");
        
        // Example 1: Recursive String traversal
        System.out.println("Example 1: Recursive String Traversal");
        String text = "Hello, World!";
        System.out.println("Original string: \"" + text + "\"");
        
        System.out.println("\nPrinting each character recursively:");
        printStringRecursively(text, 0);
        
        System.out.println("\nCounting vowels recursively: " + countVowelsRecursively(text, 0));
        
        System.out.println("\nReversing string recursively: " + reverseStringRecursively(text));
        
        // Example 2: Recursive array traversal
        System.out.println("\nExample 2: Recursive Array Traversal");
        int[] numbers = {3, 7, 2, 8, 9, 4, 1, 6, 5};
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        System.out.println("\nPrinting array elements recursively:");
        printArrayRecursively(numbers, 0);
        
        System.out.println("\nSum of array elements (recursive): " + sumArrayRecursively(numbers, 0));
        
        System.out.println("\nMaximum value in array (recursive): " + findMaxRecursively(numbers, 0, numbers[0]));
        
        // Example 3: Recursive ArrayList traversal
        System.out.println("\nExample 3: Recursive ArrayList Traversal");
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"));
        System.out.println("Original ArrayList: " + fruits);
        
        System.out.println("\nPrinting ArrayList elements recursively:");
        printArrayListRecursively(fruits, 0);
        
        System.out.println("\nSearching for 'Cherry' recursively: " + 
                          searchArrayListRecursively(fruits, "Cherry", 0));
        
        System.out.println("\n--- Key Points about Recursive Traversal ---");
        System.out.println("1. Recursion can be used to process any sequential data structure");
        System.out.println("2. The index parameter tracks the current position in the traversal");
        System.out.println("3. Base case is typically when we reach the end of the structure");
        System.out.println("4. Each recursive call processes one element and moves to the next");
        System.out.println("5. Recursive traversal can be used for searching, counting, transforming, etc.");
    }
    
    /**
     * Recursively prints each character in a string.
     * 
     * @param str The string to traverse
     * @param index The current position in the string
     */
    public static void printStringRecursively(String str, int index) {
        // Base case: reached the end of the string
        if (index >= str.length()) {
            return;
        }
        
        // Process current character
        System.out.println("Character at index " + index + ": '" + str.charAt(index) + "'");
        
        // Recursive call to process the next character
        printStringRecursively(str, index + 1);
    }
    
    /**
     * Recursively counts vowels in a string.
     * 
     * @param str The string to analyze
     * @param index The current position in the string
     * @return The number of vowels in the string
     */
    public static int countVowelsRecursively(String str, int index) {
        // Base case: reached the end of the string
        if (index >= str.length()) {
            return 0;
        }
        
        // Process current character
        char ch = Character.toLowerCase(str.charAt(index));
        int count = 0;
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count = 1;
        }
        
        // Recursive call to process the rest of the string
        return count + countVowelsRecursively(str, index + 1);
    }
    
    /**
     * Recursively reverses a string.
     * 
     * @param str The string to reverse
     * @return The reversed string
     */
    public static String reverseStringRecursively(String str) {
        // Base case: empty string or single character
        if (str.length() <= 1) {
            return str;
        }
        
        // Recursive case: reverse the substring excluding the first character,
        // then append the first character at the end
        return reverseStringRecursively(str.substring(1)) + str.charAt(0);
    }
    
    /**
     * Recursively prints each element in an array.
     * 
     * @param arr The array to traverse
     * @param index The current position in the array
     */
    public static void printArrayRecursively(int[] arr, int index) {
        // Base case: reached the end of the array
        if (index >= arr.length) {
            return;
        }
        
        // Process current element
        System.out.println("Element at index " + index + ": " + arr[index]);
        
        // Recursive call to process the next element
        printArrayRecursively(arr, index + 1);
    }
    
    /**
     * Recursively calculates the sum of elements in an array.
     * 
     * @param arr The array to sum
     * @param index The current position in the array
     * @return The sum of elements from index to the end
     */
    public static int sumArrayRecursively(int[] arr, int index) {
        // Base case: reached the end of the array
        if (index >= arr.length) {
            return 0;
        }
        
        // Recursive case: current element + sum of remaining elements
        return arr[index] + sumArrayRecursively(arr, index + 1);
    }
    
    /**
     * Recursively finds the maximum value in an array.
     * 
     * @param arr The array to search
     * @param index The current position in the array
     * @param currentMax The maximum value found so far
     * @return The maximum value in the array
     */
    public static int findMaxRecursively(int[] arr, int index, int currentMax) {
        // Base case: reached the end of the array
        if (index >= arr.length) {
            return currentMax;
        }
        
        // Update current maximum if needed
        if (arr[index] > currentMax) {
            currentMax = arr[index];
        }
        
        // Recursive call to process the next element
        return findMaxRecursively(arr, index + 1, currentMax);
    }
    
    /**
     * Recursively prints each element in an ArrayList.
     * 
     * @param list The ArrayList to traverse
     * @param index The current position in the ArrayList
     */
    public static void printArrayListRecursively(ArrayList<String> list, int index) {
        // Base case: reached the end of the ArrayList
        if (index >= list.size()) {
            return;
        }
        
        // Process current element
        System.out.println("Element at index " + index + ": " + list.get(index));
        
        // Recursive call to process the next element
        printArrayListRecursively(list, index + 1);
    }
    
    /**
     * Recursively searches for an element in an ArrayList.
     * 
     * @param list The ArrayList to search
     * @param target The element to search for
     * @param index The current position in the ArrayList
     * @return The index of the target if found, -1 otherwise
     */
    public static int searchArrayListRecursively(ArrayList<String> list, String target, int index) {
        // Base case: reached the end of the ArrayList
        if (index >= list.size()) {
            return -1;
        }
        
        // Base case: found the target
        if (list.get(index).equals(target)) {
            return index;
        }
        
        // Recursive call to search the rest of the ArrayList
        return searchArrayListRecursively(list, target, index + 1);
    }
}
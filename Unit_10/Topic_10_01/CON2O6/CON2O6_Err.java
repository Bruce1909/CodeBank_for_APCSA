/**
 * CON-2.O.6: Recursion can be used to traverse String, array, and ArrayList objects.
 *
 * This example demonstrates common errors when using recursion to traverse
 * different types of data structures: Strings, arrays, and ArrayLists.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class CON2O6_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors in recursive traversal of data structures:\n");
        
        // Example 1: Recursive String traversal with errors
        System.out.println("Example 1: Recursive String Traversal Errors");
        String text = "Hello, World!";
        System.out.println("Original string: \"" + text + "\"");
        
        System.out.println("\nAttempting to print string with incorrect base case (commented out to prevent crash):");
        // Uncommenting the next line would cause a StackOverflowError
        // printStringIncorrectBaseCase(text, 0);
        
        System.out.println("\nAttempting to reverse string with incorrect recursive call:");
        try {
            String reversed = reverseStringIncorrectRecursion(text);
            System.out.println("Result: " + reversed); // This won't execute due to StackOverflowError
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError occurred: The recursion never terminates");
        }
        
        // Example 2: Recursive array traversal with errors
        System.out.println("\nExample 2: Recursive Array Traversal Errors");
        int[] numbers = {3, 7, 2, 8, 9, 4, 1, 6, 5};
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        System.out.println("\nAttempting to sum array with incorrect index update (commented out to prevent crash):");
        // Uncommenting the next line would cause a StackOverflowError
        // int sum = sumArrayIncorrectIndex(numbers, 0);
        
        System.out.println("\nAttempting to find maximum with incorrect parameter passing:");
        try {
            int max = findMaxIncorrectParameter(numbers, 0);
            System.out.println("Incorrect maximum: " + max);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: Index out of bounds");
        }
        
        // Example 3: Recursive ArrayList traversal with errors
        System.out.println("\nExample 3: Recursive ArrayList Traversal Errors");
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"));
        System.out.println("Original ArrayList: " + fruits);
        
        System.out.println("\nAttempting to search ArrayList with missing base case (commented out to prevent crash):");
        // Uncommenting the next line would cause a StackOverflowError
        // int index = searchArrayListMissingBaseCase(fruits, "Cherry", 0);
        
        System.out.println("\n--- Common Errors in Recursive Traversal ---");
        System.out.println("1. Missing or incorrect base case: Causes infinite recursion");
        System.out.println("2. Incorrect index update: Fails to make progress toward the base case");
        System.out.println("3. Incorrect parameter passing: Loses track of important state information");
        System.out.println("4. Inefficient recursive calls: Unnecessarily recalculates values");
        System.out.println("5. Boundary condition errors: Causes index out of bounds exceptions");
    }
    
    /**
     * A recursive method to print a string with an incorrect base case.
     * This will cause infinite recursion and StackOverflowError.
     * 
     * @param str The string to print
     * @param index The current position in the string
     */
    public static void printStringIncorrectBaseCase(String str, int index) {
        // Error: Missing or incorrect base case
        // The base case should be (index >= str.length())
        if (index < 0) { // This condition will never be true
            return;
        }
        
        // Process current character
        System.out.println("Character at index " + index + ": '" + str.charAt(index) + "'");
        
        // Recursive call
        printStringIncorrectBaseCase(str, index + 1);
    }
    
    /**
     * A recursive method to reverse a string with an incorrect recursive call.
     * The recursive call doesn't properly reduce the problem size.
     * 
     * @param str The string to reverse
     * @return The reversed string (would never return due to infinite recursion)
     */
    public static String reverseStringIncorrectRecursion(String str) {
        // Base case: empty string or single character
        if (str.length() <= 1) {
            return str;
        }
        
        // Error: The recursive call doesn't properly reduce the problem size
        // It should be str.substring(1), not str
        return reverseStringIncorrectRecursion(str) + str.charAt(0);
    }
    
    /**
     * A recursive method to sum array elements with an incorrect index update.
     * This will cause infinite recursion and StackOverflowError.
     * 
     * @param arr The array to sum
     * @param index The current position in the array
     * @return The sum of elements (would never return due to infinite recursion)
     */
    public static int sumArrayIncorrectIndex(int[] arr, int index) {
        // Base case: reached the end of the array
        if (index >= arr.length) {
            return 0;
        }
        
        // Error: The recursive call doesn't update the index
        // It should be (index + 1), not index
        return arr[index] + sumArrayIncorrectIndex(arr, index);
    }
    
    /**
     * A recursive method to find the maximum value in an array with incorrect parameter passing.
     * This will cause incorrect results or exceptions.
     * 
     * @param arr The array to search
     * @param index The current position in the array
     * @return The maximum value (incorrect or exception)
     */
    public static int findMaxIncorrectParameter(int[] arr, int index) {
        // Error: Missing the currentMax parameter to track the maximum value
        // Also, missing proper boundary check before accessing arr[index + 1]
        
        // Base case: reached the end of the array
        if (index >= arr.length - 1) {
            return arr[index];
        }
        
        // Error: This will cause ArrayIndexOutOfBoundsException when index is at the last element
        // Also, doesn't properly track the maximum value found so far
        if (arr[index] > arr[index + 1]) {
            // Replace the next element with the current one if it's larger
            arr[index + 1] = arr[index]; // Modifying the array is usually not intended
        }
        
        // Recursive call
        return findMaxIncorrectParameter(arr, index + 1);
    }
    
    /**
     * A recursive method to search an ArrayList with a missing base case.
     * This will cause infinite recursion and StackOverflowError.
     * 
     * @param list The ArrayList to search
     * @param target The element to search for
     * @param index The current position in the ArrayList
     * @return The index of the target (would never return due to infinite recursion)
     */
    public static int searchArrayListMissingBaseCase(ArrayList<String> list, String target, int index) {
        // Error: Missing the base case for when the element is not found
        // Should have: if (index >= list.size()) { return -1; }
        
        // Base case: found the target
        if (list.get(index).equals(target)) {
            return index;
        }
        
        // Recursive call
        return searchArrayListMissingBaseCase(list, target, index + 1);
        // This will eventually cause an IndexOutOfBoundsException when index >= list.size()
    }
}
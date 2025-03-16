import java.util.ArrayList;

/**
 * CON2J1_Err - Example demonstrating common errors in ArrayList traversal algorithms
 * 
 * This program shows common mistakes when using ArrayList algorithms that utilize traversals:
 * - Incorrect insertion of elements
 * - Improper deletion causing index issues
 * - Errors in applying standard array algorithms
 */
public class CON2J1_Err {
    public static void main(String[] args) {
        // Create and initialize an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        System.out.println("Original ArrayList: " + numbers);
        
        // ERROR 1: Inserting at invalid index
        // Attempting to insert at an invalid negative index
        insertElementError(numbers, -1, 25);
        // Attempting to insert at an index beyond the size
        insertElementError(numbers, 20, 75);
        System.out.println("After attempted invalid insertions: " + numbers);
        
        // ERROR 2: Deleting elements with forward traversal
        // This causes index shifting issues
        deleteElementsWithForwardTraversal(numbers);
        System.out.println("After deleting with forward traversal: " + numbers);
        
        // ERROR 3: Finding maximum without checking for empty list
        ArrayList<Integer> emptyList = new ArrayList<>();
        try {
            int max = findMaximumError(emptyList);
            System.out.println("Maximum value: " + max); // This line won't execute
        } catch (Exception e) {
            System.out.println("Error finding maximum: " + e.getMessage());
        }
        
        // ERROR 4: Modifying ArrayList during enhanced for loop
        try {
            modifyDuringEnhancedForLoop(numbers);
        } catch (Exception e) {
            System.out.println("Error during enhanced for loop: " + e.getMessage());
        }
        
        // ERROR 5: Incorrect reversal algorithm
        ArrayList<Integer> numbersToReverse = new ArrayList<>(numbers);
        reverseArrayListError(numbersToReverse);
        System.out.println("Incorrectly reversed ArrayList: " + numbersToReverse);
    }
    
    /**
     * ERROR: Attempts to insert an element without validating the index
     * @param list The ArrayList to modify
     * @param index The position to insert the element (potentially invalid)
     * @param value The value to insert
     */
    public static void insertElementError(ArrayList<Integer> list, int index, int value) {
        try {
            // ERROR: No index validation before insertion
            list.add(index, value);
            System.out.println("Inserted " + value + " at index " + index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Failed to insert at index " + index + ": " + e.getMessage());
        }
    }
    
    /**
     * ERROR: Deletes elements using forward traversal
     * This causes index shifting issues when elements are removed
     * @param list The ArrayList to modify
     */
    public static void deleteElementsWithForwardTraversal(ArrayList<Integer> list) {
        // ERROR: Traversing from beginning to end while removing elements
        // This causes index shifting, potentially skipping elements
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 20 == 0) {
                list.remove(i);
                // ERROR: Not adjusting index after removal
                // Should use i-- to recheck the current index after shifting
            }
        }
    }
    
    /**
     * ERROR: Finds maximum without checking for empty list
     * @param list The ArrayList to search
     * @return The maximum value
     */
    public static int findMaximumError(ArrayList<Integer> list) {
        // ERROR: No check for empty list
        int max = list.get(0); // Will throw IndexOutOfBoundsException if list is empty
        
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
    
    /**
     * ERROR: Attempts to modify ArrayList during enhanced for loop
     * @param list The ArrayList to process
     */
    public static void modifyDuringEnhancedForLoop(ArrayList<Integer> list) {
        // ERROR: Attempting to modify the ArrayList during enhanced for loop
        // This will throw ConcurrentModificationException
        for (int value : list) {
            if (value % 30 == 0) {
                list.remove(Integer.valueOf(value)); // This will cause an exception
            }
        }
    }
    
    /**
     * ERROR: Incorrectly implements ArrayList reversal
     * @param list The ArrayList to reverse
     */
    public static void reverseArrayListError(ArrayList<Integer> list) {
        int size = list.size();
        
        // ERROR: Incorrect loop bounds causing only half the elements to be properly swapped
        // and the other half to be swapped back to original positions
        for (int i = 0; i < size; i++) {
            // Swap elements at i and (size-1-i)
            int temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
        // The correct implementation should only iterate to the middle: i < size/2
    }
}
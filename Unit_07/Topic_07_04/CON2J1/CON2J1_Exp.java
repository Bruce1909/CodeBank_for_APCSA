import java.util.ArrayList;

/**
 * CON2J1_Exp - Example demonstrating correct ArrayList traversal algorithms
 * 
 * This program demonstrates standard ArrayList algorithms that utilize traversals to:
 * - Insert elements
 * - Delete elements
 * - Apply standard algorithms used with 1D arrays
 */
public class CON2J1_Exp {
    public static void main(String[] args) {
        // Create and initialize an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        System.out.println("Original ArrayList: " + numbers);
        
        // EXAMPLE 1: Insert elements at specific positions
        // Insert element 25 at index 3
        insertElement(numbers, 3, 25);
        System.out.println("After inserting 25 at index 3: " + numbers);
        
        // EXAMPLE 2: Delete elements that meet a specific condition
        // Delete all elements that are divisible by 20
        deleteElementsByCondition(numbers);
        System.out.println("After deleting elements divisible by 20: " + numbers);
        
        // EXAMPLE 3: Apply standard array algorithm - Find maximum value
        int max = findMaximum(numbers);
        System.out.println("Maximum value in the ArrayList: " + max);
        
        // EXAMPLE 4: Apply standard array algorithm - Calculate sum
        int sum = calculateSum(numbers);
        System.out.println("Sum of all elements: " + sum);
        
        // EXAMPLE 5: Apply standard array algorithm - Reverse the ArrayList
        reverseArrayList(numbers);
        System.out.println("Reversed ArrayList: " + numbers);
    }
    
    /**
     * Inserts an element at a specific position in the ArrayList
     * @param list The ArrayList to modify
     * @param index The position to insert the element
     * @param value The value to insert
     */
    public static void insertElement(ArrayList<Integer> list, int index, int value) {
        // Check if index is valid
        if (index >= 0 && index <= list.size()) {
            list.add(index, value);
        }
    }
    
    /**
     * Deletes elements that meet a specific condition (divisible by 20)
     * @param list The ArrayList to modify
     */
    public static void deleteElementsByCondition(ArrayList<Integer> list) {
        // Traverse the ArrayList from end to beginning to avoid index shifting issues
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 20 == 0) {
                list.remove(i);
            }
        }
    }
    
    /**
     * Finds the maximum value in the ArrayList
     * @param list The ArrayList to search
     * @return The maximum value
     */
    public static int findMaximum(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("ArrayList is empty");
        }
        
        int max = list.get(0);
        // Traverse the ArrayList to find the maximum value
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
    
    /**
     * Calculates the sum of all elements in the ArrayList
     * @param list The ArrayList to process
     * @return The sum of all elements
     */
    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        // Traverse the ArrayList to calculate the sum
        for (int value : list) {
            sum += value;
        }
        return sum;
    }
    
    /**
     * Reverses the order of elements in the ArrayList
     * @param list The ArrayList to reverse
     */
    public static void reverseArrayList(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        
        // Swap elements from both ends moving toward the center
        while (left < right) {
            // Swap elements at left and right indices
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            
            // Move indices toward the center
            left++;
            right--;
        }
    }
}
/**
 * CON2L2_Err.java
 * This program demonstrates common errors in insertion sort implementation
 * for both arrays and ArrayLists.
 * 
 * CON-2.L.1: Selection sort and insertion sort are iterative sorting algorithms
 * that can be used to sort elements in an array or ArrayList.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class CON2L2_Err {
    public static void main(String[] args) {
        // Demonstrate insertion sort with arrays (with errors)
        int[] numbers = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(numbers));
        insertionSortArrayWithErrors(numbers);
        System.out.println("Array after incorrect insertion sort: " + Arrays.toString(numbers));
        
        // Demonstrate insertion sort with ArrayList (with errors)
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(64, 25, 12, 22, 11));
        System.out.println("\nOriginal ArrayList: " + numberList);
        insertionSortArrayListWithErrors(numberList);
        System.out.println("ArrayList after incorrect insertion sort: " + numberList);
    }
    
    /**
     * Insertion sort implementation for arrays with common errors.
     * ERROR 1: Starting from index 0 instead of 1
     * ERROR 2: Incorrect comparison operator
     * ERROR 3: Not properly shifting elements
     * 
     * @param arr The array to be sorted
     */
    public static void insertionSortArrayWithErrors(int[] arr) {
        int n = arr.length;
        
        // ERROR 1: Starting from index 0 instead of 1
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // ERROR 2: Incorrect comparison operator (using >= instead of >)
            while (j >= 0 && arr[j] >= key) {
                // ERROR 3: Not properly shifting elements (missing assignment)
                j = j - 1;
            }
            arr[j + 1] = key;
            
            // Print the array after each iteration to show the sorting process
            System.out.println("After iteration " + i + ": " + Arrays.toString(arr));
        }
    }
    
    /**
     * Insertion sort implementation for ArrayList with common errors.
     * ERROR 1: Incorrect loop condition
     * ERROR 2: Not maintaining the key value
     * ERROR 3: Incorrect element shifting
     * 
     * @param list The ArrayList to be sorted
     */
    public static void insertionSortArrayListWithErrors(ArrayList<Integer> list) {
        int n = list.size();
        
        // ERROR 1: Incorrect loop condition (using <= instead of <)
        for (int i = 1; i <= n; i++) {
            // ERROR 2: Not maintaining the key value
            int j = i - 1;
            
            // ERROR 3: Incorrect element shifting (comparing with wrong element)
            while (j >= 0 && list.get(j) > list.get(j + 1)) {
                // Swap elements incorrectly
                int temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
                j = j - 1;
            }
            
            // Print the ArrayList after each iteration to show the sorting process
            System.out.println("After iteration " + i + ": " + list);
        }
    }
}
/**
 * CON2L1_Err.java
 * This program demonstrates common errors in selection sort implementation
 * for both arrays and ArrayLists.
 * 
 * CON-2.L.1: Selection sort and insertion sort are iterative sorting algorithms
 * that can be used to sort elements in an array or ArrayList.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class CON2L1_Err {
    public static void main(String[] args) {
        // Demonstrate selection sort with arrays (with errors)
        int[] numbers = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(numbers));
        selectionSortArrayWithErrors(numbers);
        System.out.println("Array after incorrect selection sort: " + Arrays.toString(numbers));
        
        // Demonstrate selection sort with ArrayList (with errors)
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(64, 25, 12, 22, 11));
        System.out.println("\nOriginal ArrayList: " + numberList);
        selectionSortArrayListWithErrors(numberList);
        System.out.println("ArrayList after incorrect selection sort: " + numberList);
    }
    
    /**
     * Selection sort implementation for arrays with common errors.
     * ERROR 1: Incorrect loop boundary (using n instead of n-1)
     * ERROR 2: Not updating minIndex correctly
     * ERROR 3: Incorrect swapping logic
     * 
     * @param arr The array to be sorted
     */
    public static void selectionSortArrayWithErrors(int[] arr) {
        int n = arr.length;
        
        // ERROR 1: Incorrect loop boundary (should be n-1)
        for (int i = 0; i < n; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // ERROR 2: Incorrect comparison (using > instead of <)
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // ERROR 3: Incorrect swapping (missing temp variable)
            // This will lose the value at arr[i]
            arr[minIndex] = arr[i];
            arr[i] = arr[minIndex]; // This is now the same as arr[i], not the original arr[minIndex]
            
            // Print the array after each iteration to show the sorting process
            System.out.println("After iteration " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }
    
    /**
     * Selection sort implementation for ArrayList with common errors.
     * ERROR 1: Starting from index 1 instead of 0
     * ERROR 2: Incorrect comparison operator
     * ERROR 3: Not properly swapping elements
     * 
     * @param list The ArrayList to be sorted
     */
    public static void selectionSortArrayListWithErrors(ArrayList<Integer> list) {
        int n = list.size();
        
        // ERROR 1: Starting from index 1 instead of 0
        for (int i = 1; i < n; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // ERROR 2: Incorrect comparison (using >= instead of <)
                if (list.get(j) >= list.get(minIndex)) {
                    minIndex = j;
                }
            }
            
            // ERROR 3: Not properly swapping elements (only setting one side)
            list.set(i, list.get(minIndex));
            // Missing: list.set(minIndex, temp);
            
            // Print the ArrayList after each iteration to show the sorting process
            System.out.println("After iteration " + i + ": " + list);
        }
    }
}
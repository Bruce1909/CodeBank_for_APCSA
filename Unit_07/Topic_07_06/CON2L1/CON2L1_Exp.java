/**
 * CON2L1_Exp.java
 * This program demonstrates the correct implementation of selection sort
 * for both arrays and ArrayLists.
 * 
 * CON-2.L.1: Selection sort and insertion sort are iterative sorting algorithms
 * that can be used to sort elements in an array or ArrayList.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class CON2L1_Exp {
    public static void main(String[] args) {
        // Demonstrate selection sort with arrays
        int[] numbers = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(numbers));
        selectionSortArray(numbers);
        System.out.println("Array after selection sort: " + Arrays.toString(numbers));
        
        // Demonstrate selection sort with ArrayList
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(64, 25, 12, 22, 11));
        System.out.println("\nOriginal ArrayList: " + numberList);
        selectionSortArrayList(numberList);
        System.out.println("ArrayList after selection sort: " + numberList);
    }
    
    /**
     * Selection sort implementation for arrays.
     * The algorithm works by finding the minimum element from the unsorted part
     * and putting it at the beginning of the unsorted part.
     * 
     * @param arr The array to be sorted
     */
    public static void selectionSortArray(int[] arr) {
        int n = arr.length;
        
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
            // Print the array after each iteration to show the sorting process
            System.out.println("After iteration " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }
    
    /**
     * Selection sort implementation for ArrayList.
     * The algorithm works by finding the minimum element from the unsorted part
     * and putting it at the beginning of the unsorted part.
     * 
     * @param list The ArrayList to be sorted
     */
    public static void selectionSortArrayList(ArrayList<Integer> list) {
        int n = list.size();
        
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
            
            // Print the ArrayList after each iteration to show the sorting process
            System.out.println("After iteration " + (i + 1) + ": " + list);
        }
    }
}
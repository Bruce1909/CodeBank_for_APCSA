/**
 * CON2L2_Exp.java
 * This program demonstrates the correct implementation of insertion sort
 * for both arrays and ArrayLists.
 * 
 * CON-2.L.1: Selection sort and insertion sort are iterative sorting algorithms
 * that can be used to sort elements in an array or ArrayList.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class CON2L2_Exp {
    public static void main(String[] args) {
        // Demonstrate insertion sort with arrays
        int[] numbers = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(numbers));
        insertionSortArray(numbers);
        System.out.println("Array after insertion sort: " + Arrays.toString(numbers));
        
        // Demonstrate insertion sort with ArrayList
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(64, 25, 12, 22, 11));
        System.out.println("\nOriginal ArrayList: " + numberList);
        insertionSortArrayList(numberList);
        System.out.println("ArrayList after insertion sort: " + numberList);
    }
    
    /**
     * Insertion sort implementation for arrays.
     * The algorithm works by building the final sorted array one item at a time,
     * by repeatedly inserting a new element into the sorted portion of the array.
     * 
     * @param arr The array to be sorted
     */
    public static void insertionSortArray(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            
            // Print the array after each iteration to show the sorting process
            System.out.println("After iteration " + i + ": " + Arrays.toString(arr));
        }
    }
    
    /**
     * Insertion sort implementation for ArrayList.
     * The algorithm works by building the final sorted list one item at a time,
     * by repeatedly inserting a new element into the sorted portion of the list.
     * 
     * @param list The ArrayList to be sorted
     */
    public static void insertionSortArrayList(ArrayList<Integer> list) {
        int n = list.size();
        
        for (int i = 1; i < n; i++) {
            int key = list.get(i);
            int j = i - 1;
            
            // Move elements of list[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
            
            // Print the ArrayList after each iteration to show the sorting process
            System.out.println("After iteration " + i + ": " + list);
        }
    }
}
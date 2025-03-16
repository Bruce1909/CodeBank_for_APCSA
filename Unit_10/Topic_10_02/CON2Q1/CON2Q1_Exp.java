/**
 * CON2Q1_Exp.java
 * This program demonstrates the correct implementation of merge sort
 * for both arrays and ArrayLists.
 * 
 * CON-2.Q.1: Merge sort is a recursive sorting algorithm that can be used
 * to sort elements in an array or ArrayList.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CON2Q1_Exp {
    public static void main(String[] args) {
        // Demonstrate merge sort with arrays
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        // Create a copy of the array for merge sort
        int[] sortedArray = Arrays.copyOf(numbers, numbers.length);
        mergeSortArray(sortedArray, 0, sortedArray.length - 1);
        
        System.out.println("Array after merge sort: " + Arrays.toString(sortedArray));
        
        // Demonstrate merge sort with ArrayList
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(38, 27, 43, 3, 9, 82, 10));
        System.out.println("\nOriginal ArrayList: " + numberList);
        
        ArrayList<Integer> sortedList = mergeSortArrayList(numberList);
        System.out.println("ArrayList after merge sort: " + sortedList);
    }
    
    /**
     * Merge sort implementation for arrays.
     * The algorithm works by dividing the array into two halves,
     * recursively sorting each half, and then merging the sorted halves.
     * 
     * Time Complexity: O(n log n) - where n is the number of elements
     * Space Complexity: O(n) - for the temporary arrays used in merging
     * 
     * @param arr The array to be sorted
     * @param left The starting index
     * @param right The ending index
     */
    public static void mergeSortArray(int[] arr, int left, int right) {
        // Base case: if left >= right, the array has 0 or 1 element and is already sorted
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;
            
            // Print the current state of the recursion
            System.out.println("Dividing array from index " + left + " to " + right);
            
            // Recursively sort first and second halves
            mergeSortArray(arr, left, mid);
            mergeSortArray(arr, mid + 1, right);
            
            // Merge the sorted halves
            merge(arr, left, mid, right);
            
            // Print the array after merging
            System.out.println("After merging indices " + left + " to " + right + ": " 
                    + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
        }
    }
    
    /**
     * Merges two subarrays of arr[].
     * First subarray is arr[left..mid]
     * Second subarray is arr[mid+1..right]
     * 
     * @param arr The array containing the subarrays to be merged
     * @param left Starting index of the first subarray
     * @param mid Ending index of the first subarray
     * @param right Ending index of the second subarray
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];
        
        // Merge the temporary arrays
        
        // Initial indices of first and second subarrays
        int i = 0, j = 0;
        
        // Initial index of merged subarray
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    /**
     * Merge sort implementation for ArrayList.
     * This implementation creates new ArrayLists for each recursive call.
     * 
     * Time Complexity: O(n log n) - where n is the number of elements
     * Space Complexity: O(n log n) - due to creating new ArrayLists at each level of recursion
     * 
     * @param list The ArrayList to be sorted
     * @return A new sorted ArrayList
     */
    public static ArrayList<Integer> mergeSortArrayList(ArrayList<Integer> list) {
        // Base case: if the list has 0 or 1 element, it's already sorted
        if (list.size() <= 1) {
            return new ArrayList<>(list);
        }
        
        // Find the middle point
        int mid = list.size() / 2;
        
        // Print the current state of the recursion
        System.out.println("Dividing ArrayList: " + list);
        
        // Split the list into two halves
        ArrayList<Integer> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(list.subList(mid, list.size()));
        
        // Recursively sort both halves
        left = mergeSortArrayList(left);
        right = mergeSortArrayList(right);
        
        // Merge the sorted halves
        ArrayList<Integer> merged = mergeArrayLists(left, right);
        
        // Print the result after merging
        System.out.println("After merging: " + merged);
        
        return merged;
    }
    
    /**
     * Merges two sorted ArrayLists into a single sorted ArrayList.
     * 
     * @param left The first sorted ArrayList
     * @param right The second sorted ArrayList
     * @return A new merged and sorted ArrayList
     */
    private static ArrayList<Integer> mergeArrayLists(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;
        
        // Compare elements from both lists and add the smaller one to the result
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) <= right.get(rightIndex)) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }
        
        // Add remaining elements from left list, if any
        while (leftIndex < left.size()) {
            result.add(left.get(leftIndex));
            leftIndex++;
        }
        
        // Add remaining elements from right list, if any
        while (rightIndex < right.size()) {
            result.add(right.get(rightIndex));
            rightIndex++;
        }
        
        return result;
    }
}
/**
 * CON2Q1_Err.java
 * This program demonstrates common errors in merge sort implementation
 * for both arrays and ArrayLists.
 * 
 * CON-2.Q.1: Merge sort is a recursive sorting algorithm that can be used
 * to sort elements in an array or ArrayList.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CON2Q1_Err {
    public static void main(String[] args) {
        // Demonstrate merge sort with arrays (with errors)
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        // Create a copy of the array for merge sort
        int[] sortedArray = Arrays.copyOf(numbers, numbers.length);
        mergeSortArrayWithErrors(sortedArray, 0, sortedArray.length - 1);
        
        System.out.println("Array after incorrect merge sort: " + Arrays.toString(sortedArray));
        
        // Demonstrate merge sort with ArrayList (with errors)
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(38, 27, 43, 3, 9, 82, 10));
        System.out.println("\nOriginal ArrayList: " + numberList);
        
        ArrayList<Integer> sortedList = mergeSortArrayListWithErrors(numberList);
        System.out.println("ArrayList after incorrect merge sort: " + sortedList);
    }
    
    /**
     * Merge sort implementation for arrays with common errors.
     * ERROR 1: Missing base case check
     * ERROR 2: Incorrect middle point calculation
     * ERROR 3: Not merging the sorted halves
     * 
     * @param arr The array to be sorted
     * @param left The starting index
     * @param right The ending index
     */
    public static void mergeSortArrayWithErrors(int[] arr, int left, int right) {
        // ERROR 1: Missing base case check
        // Should have: if (left < right) { ... }
        
        // ERROR 2: Incorrect middle point calculation
        // Using integer division without considering potential overflow
        int mid = (left + right) / 2; // Can cause overflow for large arrays
        
        // Print the current state of the recursion
        System.out.println("Dividing array from index " + left + " to " + right);
        
        // Recursively sort first and second halves
        mergeSortArrayWithErrors(arr, left, mid);
        mergeSortArrayWithErrors(arr, mid + 1, right);
        
        // ERROR 3: Not merging the sorted halves
        // Should call merge function here
        // merge(arr, left, mid, right);
        
        // Instead, we'll just print without actually merging
        System.out.println("Failed to merge indices " + left + " to " + right);
    }
    
    /**
     * Merges two subarrays of arr[] with errors.
     * ERROR 1: Incorrect array size calculation
     * ERROR 2: Incorrect copying of elements
     * ERROR 3: Incorrect merging logic
     * 
     * @param arr The array containing the subarrays to be merged
     * @param left Starting index of the first subarray
     * @param mid Ending index of the first subarray
     * @param right Ending index of the second subarray
     */
    private static void mergeWithErrors(int[] arr, int left, int mid, int right) {
        // ERROR 1: Incorrect array size calculation
        int n1 = mid - left; // Missing +1, should be mid - left + 1
        int n2 = right - mid; // This is actually correct, but inconsistent with the error above
        
        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // ERROR 2: Incorrect copying of elements
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i]; // This will miss the element at mid due to incorrect n1
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + j]; // Should be arr[mid + 1 + j]
        
        // ERROR 3: Incorrect merging logic
        int i = 0, j = 0;
        int k = left;
        
        // Only comparing and not actually merging
        while (i < n1 && j < n2) {
            // Using incorrect comparison (using > instead of <=)
            if (L[i] > R[j]) { // Should be L[i] <= R[j]
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        // Missing code to copy remaining elements
        // Should have:
        // while (i < n1) { arr[k] = L[i]; i++; k++; }
        // while (j < n2) { arr[k] = R[j]; j++; k++; }
    }
    
    /**
     * Merge sort implementation for ArrayList with errors.
     * ERROR 1: Incorrect base case
     * ERROR 2: Incorrect list splitting
     * ERROR 3: Not properly merging the sorted lists
     * 
     * @param list The ArrayList to be sorted
     * @return A partially sorted ArrayList
     */
    public static ArrayList<Integer> mergeSortArrayListWithErrors(ArrayList<Integer> list) {
        // ERROR 1: Incorrect base case
        // Using == 1 instead of <= 1, which will cause problems with empty lists
        if (list.size() == 1) {
            return new ArrayList<>(list);
        }
        
        // Missing handling for empty list case
        if (list.size() == 0) {
            // This will throw an exception in the next step
            // Should return an empty list here
        }
        
        // Find the middle point
        int mid = list.size() / 2;
        
        // Print the current state of the recursion
        System.out.println("Dividing ArrayList: " + list);
        
        // ERROR 2: Incorrect list splitting
        // Using incorrect indices for subList
        ArrayList<Integer> left = new ArrayList<>(list.subList(0, mid - 1)); // Should be (0, mid)
        ArrayList<Integer> right = new ArrayList<>(list.subList(mid, list.size()));
        
        // Recursively sort both halves
        left = mergeSortArrayListWithErrors(left);
        right = mergeSortArrayListWithErrors(right);
        
        // ERROR 3: Not properly merging the sorted lists
        // Using incorrect merging function
        ArrayList<Integer> merged = mergeArrayListsWithErrors(left, right);
        
        // Print the result after merging
        System.out.println("After incorrect merging: " + merged);
        
        return merged;
    }
    
    /**
     * Merges two sorted ArrayLists into a single ArrayList with errors.
     * ERROR 1: Not comparing elements correctly
     * ERROR 2: Not handling remaining elements
     * 
     * @param left The first sorted ArrayList
     * @param right The second sorted ArrayList
     * @return A partially merged ArrayList
     */
    private static ArrayList<Integer> mergeArrayListsWithErrors(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;
        
        // ERROR 1: Not comparing elements correctly
        // Using >= instead of <=, which will sort in descending order
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) >= right.get(rightIndex)) { // Should be <=
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }
        
        // ERROR 2: Not handling remaining elements
        // Missing code to add remaining elements from both lists
        // Should have:
        // while (leftIndex < left.size()) { result.add(left.get(leftIndex)); leftIndex++; }
        // while (rightIndex < right.size()) { result.add(right.get(rightIndex)); rightIndex++; }
        
        return result;
    }
}
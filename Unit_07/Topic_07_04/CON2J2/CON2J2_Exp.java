import java.util.ArrayList;
import java.util.Arrays;

/**
 * CON2J2_Exp - Example demonstrating correct simultaneous traversal of multiple objects
 * 
 * This program demonstrates algorithms that require multiple String, array, or ArrayList
 * objects to be traversed simultaneously.
 */
public class CON2J2_Exp {
    public static void main(String[] args) {
        // EXAMPLE 1: Merging two sorted arrays
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        
        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
        
        // EXAMPLE 2: Comparing two Strings character by character
        String str1 = "hello";
        String str2 = "world";
        System.out.println("\nString 1: " + str1);
        System.out.println("String 2: " + str2);
        
        compareStrings(str1, str2);
        
        // EXAMPLE 3: Finding common elements in two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        System.out.println("\nArrayList 1: " + list1);
        System.out.println("ArrayList 2: " + list2);
        
        ArrayList<Integer> commonElements = findCommonElements(list1, list2);
        System.out.println("Common elements: " + commonElements);
        
        // EXAMPLE 4: Zipping two arrays into pairs
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        int[] ages = {25, 30, 35, 40};
        System.out.println("\nNames: " + Arrays.toString(names));
        System.out.println("Ages: " + Arrays.toString(ages));
        
        zipArrays(names, ages);
    }
    
    /**
     * Merges two sorted arrays into a single sorted array
     * @param arr1 First sorted array
     * @param arr2 Second sorted array
     * @return Merged sorted array
     */
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0; // Index for arr1
        int j = 0; // Index for arr2
        int k = 0; // Index for result
        
        // Traverse both arrays simultaneously
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        
        // Copy remaining elements from arr1, if any
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        
        // Copy remaining elements from arr2, if any
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        
        return result;
    }
    
    /**
     * Compares two strings character by character
     * @param str1 First string
     * @param str2 Second string
     */
    public static void compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        
        System.out.println("Character comparison:");
        // Traverse both strings simultaneously up to the length of the shorter string
        for (int i = 0; i < minLength; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            System.out.println("Position " + i + ": '" + c1 + "' vs '" + c2 + "' - " + 
                               (c1 == c2 ? "Match" : "Different"));
        }
        
        // Check if one string is longer than the other
        if (str1.length() != str2.length()) {
            System.out.println("Strings have different lengths: " + 
                               str1.length() + " vs " + str2.length());
        }
    }
    
    /**
     * Finds common elements between two ArrayLists
     * @param list1 First ArrayList
     * @param list2 Second ArrayList
     * @return ArrayList containing common elements
     */
    public static ArrayList<Integer> findCommonElements(ArrayList<Integer> list1, 
                                                      ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Traverse the first list and check if each element exists in the second list
        for (Integer element : list1) {
            if (list2.contains(element) && !result.contains(element)) {
                result.add(element);
            }
        }
        
        return result;
    }
    
    /**
     * Zips two arrays together, printing pairs of elements
     * @param names Array of names
     * @param ages Array of ages
     */
    public static void zipArrays(String[] names, int[] ages) {
        // Determine the minimum length to avoid IndexOutOfBoundsException
        int minLength = Math.min(names.length, ages.length);
        
        System.out.println("Name-Age pairs:");
        // Traverse both arrays simultaneously
        for (int i = 0; i < minLength; i++) {
            System.out.println(names[i] + " is " + ages[i] + " years old");
        }
        
        // Check if arrays have different lengths
        if (names.length != ages.length) {
            System.out.println("Warning: Arrays have different lengths. " + 
                               "Some elements were not paired.");
        }
    }
}
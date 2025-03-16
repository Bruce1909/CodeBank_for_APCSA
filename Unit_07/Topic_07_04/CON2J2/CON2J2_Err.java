import java.util.ArrayList;
import java.util.Arrays;

/**
 * CON2J2_Err - Example demonstrating common errors in simultaneous traversal of multiple objects
 * 
 * This program shows common mistakes when implementing algorithms that require multiple
 * String, array, or ArrayList objects to be traversed simultaneously.
 */
public class CON2J2_Err {
    public static void main(String[] args) {
        // ERROR 1: Merging two sorted arrays with incorrect boundary checks
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        
        int[] mergedArrayError = mergeSortedArraysError(arr1, arr2);
        System.out.println("Incorrectly merged array: " + Arrays.toString(mergedArrayError));
        
        // ERROR 2: Comparing strings without handling different lengths properly
        String str1 = "hello";
        String str2 = "hi";
        System.out.println("\nString 1: " + str1);
        System.out.println("String 2: " + str2);
        
        try {
            compareStringsError(str1, str2);
        } catch (Exception e) {
            System.out.println("Error comparing strings: " + e.getMessage());
        }
        
        // ERROR 3: Finding common elements with inefficient approach
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        System.out.println("\nArrayList 1: " + list1);
        System.out.println("ArrayList 2: " + list2);
        
        ArrayList<Integer> commonElementsError = findCommonElementsError(list1, list2);
        System.out.println("Common elements (with duplicates): " + commonElementsError);
        
        // ERROR 4: Zipping arrays without checking lengths
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] ages = {25, 30, 35, 40, 45}; // Intentionally different length
        System.out.println("\nNames: " + Arrays.toString(names));
        System.out.println("Ages: " + Arrays.toString(ages));
        
        try {
            zipArraysError(names, ages);
        } catch (Exception e) {
            System.out.println("Error zipping arrays: " + e.getMessage());
        }
    }
    
    /**
     * ERROR: Incorrectly merges two sorted arrays
     * @param arr1 First sorted array
     * @param arr2 Second sorted array
     * @return Incorrectly merged array
     */
    public static int[] mergeSortedArraysError(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        
        // ERROR: Incorrect merging logic that doesn't properly handle the comparison
        // This alternates elements rather than maintaining sorted order
        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            result[i*2] = arr1[i];
            result[i*2+1] = arr2[i];
        }
        
        // ERROR: Doesn't properly handle cases where arrays have different lengths
        // Missing code to copy remaining elements from the longer array
        
        return result;
    }
    
    /**
     * ERROR: Compares two strings without proper bounds checking
     * @param str1 First string
     * @param str2 Second string
     */
    public static void compareStringsError(String str1, String str2) {
        System.out.println("Character comparison (with error):");
        
        // ERROR: No bounds checking, assumes both strings have the same length
        // This will throw IndexOutOfBoundsException if str2 is shorter than str1
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i); // Potential IndexOutOfBoundsException
            System.out.println("Position " + i + ": '" + c1 + "' vs '" + c2 + "' - " + 
                               (c1 == c2 ? "Match" : "Different"));
        }
    }
    
    /**
     * ERROR: Finds common elements inefficiently, allowing duplicates
     * @param list1 First ArrayList
     * @param list2 Second ArrayList
     * @return ArrayList containing common elements (with potential duplicates)
     */
    public static ArrayList<Integer> findCommonElementsError(ArrayList<Integer> list1, 
                                                          ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // ERROR 1: Inefficient nested loop approach
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                // ERROR 2: Doesn't check if element is already in result list
                // This can lead to duplicates in the result
                if (list1.get(i).equals(list2.get(j))) {
                    result.add(list1.get(i));
                }
            }
        }
        
        return result;
    }
    
    /**
     * ERROR: Zips two arrays without checking array bounds
     * @param names Array of names
     * @param ages Array of ages
     */
    public static void zipArraysError(String[] names, int[] ages) {
        System.out.println("Name-Age pairs (with error):");
        
        // ERROR: Assumes both arrays have the same length
        // Uses the length of the first array without checking the second
        for (int i = 0; i < names.length; i++) {
            // This will throw ArrayIndexOutOfBoundsException if ages array is shorter
            System.out.println(names[i] + " is " + ages[i] + " years old");
        }
    }
}
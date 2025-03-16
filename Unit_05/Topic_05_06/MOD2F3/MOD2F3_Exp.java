/**
 * MOD-2.F.3 Example
 * 
 * This program demonstrates good programming practice by not modifying
 * mutable objects that are passed as parameters unless required in the specification.
 */
public class MOD2F3_Exp {
    
    /**
     * This method demonstrates good practice by not modifying the array parameter.
     * It calculates the average of the array elements without changing the array.
     * 
     * @param numbers An array of integers
     * @return The average of the numbers in the array
     */
    public static double calculateAverage(int[] numbers) {
        // Good practice: We don't modify the array parameter
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        return sum / numbers.length;
    }
    
    /**
     * This method demonstrates good practice by creating a new array
     * instead of modifying the original array parameter.
     * 
     * @param numbers An array of integers
     * @return A new array with each element doubled
     */
    public static int[] doubleValues(int[] numbers) {
        // Good practice: Create a new array instead of modifying the parameter
        int[] result = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] * 2;
        }
        
        return result; // Return a new array, original array is unchanged
    }
    
    /**
     * This method demonstrates a case where modifying the parameter is required
     * by the specification, so it's acceptable to do so.
     * 
     * @param numbers An array to be sorted in place (as specified)
     */
    public static void sortArray(int[] numbers) {
        // This is acceptable because the method's purpose is to sort the array in place
        // The specification requires modifying the parameter
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] originalArray = {5, 2, 8, 1, 9};
        
        // Demonstrate not modifying the parameter
        double average = calculateAverage(originalArray);
        System.out.println("Average: " + average);
        
        // Demonstrate returning a new array instead of modifying the parameter
        int[] doubledArray = doubleValues(originalArray);
        
        System.out.println("\nOriginal array after doubleValues method:");
        for (int num : originalArray) {
            System.out.print(num + " "); // Original array is unchanged
        }
        
        System.out.println("\nNew doubled array:");
        for (int num : doubledArray) {
            System.out.print(num + " "); // New array has doubled values
        }
        
        // Demonstrate modifying the parameter when required by specification
        System.out.println("\n\nOriginal array before sorting:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        
        sortArray(originalArray); // This method modifies the array as specified
        
        System.out.println("\nOriginal array after sorting:");
        for (int num : originalArray) {
            System.out.print(num + " "); // Array is now sorted
        }
    }
}
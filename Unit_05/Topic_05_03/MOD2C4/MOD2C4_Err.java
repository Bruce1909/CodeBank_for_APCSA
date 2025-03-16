/**
 * MOD2C4_Err.java
 * This program demonstrates common errors related to postconditions in Java methods (MOD-2.C.4).
 * 
 * @author AP CSA
 */
public class MOD2C4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to postconditions:\n");
        
        // ERROR 1: Not documenting postconditions
        System.out.println("ERROR 1: Not documenting postconditions");
        System.out.println("Method: undocumentedAbsoluteValue(int)");
        
        int number = -10;
        int result = undocumentedAbsoluteValue(number);
        System.out.println("Called undocumentedAbsoluteValue(" + number + ") = " + result);
        System.out.println("The method works correctly, but its postcondition is not documented");
        System.out.println("This makes it harder for other programmers to understand the method's guarantees\n");
        
        // ERROR 2: Failing to ensure postconditions are met
        System.out.println("ERROR 2: Failing to ensure postconditions are met");
        System.out.println("Method: normalizeScore(int) - Postcondition: 0 <= return value <= 100");
        
        int score1 = 150;
        int normalizedScore1 = normalizeScore(score1);
        System.out.println("Called normalizeScore(" + score1 + ") = " + normalizedScore1);
        System.out.println("The postcondition is violated: the result is greater than 100\n");
        
        // ERROR 3: Confusing postconditions with return values
        System.out.println("ERROR 3: Confusing postconditions with return values");
        System.out.println("Postconditions can describe more than just return values:");
        System.out.println("- They can describe object state changes");
        System.out.println("- They can describe relationships between inputs and outputs");
        System.out.println("- They can describe side effects\n");
        
        // ERROR 4: Not considering all possible execution paths
        System.out.println("ERROR 4: Not considering all possible execution paths");
        System.out.println("Method: findMax(int[]) - Postcondition: returns the maximum value in the array");
        
        try {
            int[] emptyArray = {};
            System.out.println("Calling findMax on an empty array");
            int max = findMax(emptyArray);
            System.out.println("Result: " + max + " (This is incorrect)");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("The method failed to handle an edge case\n");
        }
        
        // ERROR 5: Assuming postconditions are met without verification
        System.out.println("ERROR 5: Assuming postconditions are met without verification");
        System.out.println("Method: sortArrayIncorrect(int[]) - Postcondition: array is sorted in ascending order");
        
        int[] array = {5, 2, 8, 1, 9};
        System.out.println("Original array: " + arrayToString(array));
        sortArrayIncorrect(array);
        System.out.println("After 'sorting': " + arrayToString(array));
        System.out.println("The postcondition is not satisfied: the array is not properly sorted");
        
        System.out.println("\nKey points about postcondition errors:");
        System.out.println("- Postconditions must be clearly documented");
        System.out.println("- Code must be written to ensure postconditions are met");
        System.out.println("- All execution paths must satisfy the postconditions");
        System.out.println("- Postconditions describe more than just return values");
        System.out.println("- Postconditions help verify method correctness");
    }
    
    // This method has an undocumented postcondition
    public static int undocumentedAbsoluteValue(int number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
        // Undocumented postcondition: return value >= 0
    }
    
    /**
     * Normalizes a score to be between 0 and 100.
     * 
     * Postcondition: 0 <= return value <= 100
     * 
     * @param score the input score
     * @return the normalized score
     */
    public static int normalizeScore(int score) {
        if (score < 0) {
            return 0;
        }
        // Bug: missing the check for score > 100
        return score; // This violates the postcondition when score > 100
    }
    
    /**
     * Finds the maximum value in an array.
     * 
     * Postcondition: returns the maximum value in the array
     * 
     * @param array the input array
     * @return the maximum value in the array
     */
    public static int findMax(int[] array) {
        // Bug: doesn't handle empty arrays
        int max = array[0]; // Throws ArrayIndexOutOfBoundsException if array is empty
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        return max;
    }
    
    /**
     * Sorts an array in ascending order.
     * 
     * Postcondition: The array elements are arranged in ascending order
     * 
     * @param array the array to be sorted
     */
    public static void sortArrayIncorrect(int[] array) {
        // Bug: incomplete bubble sort implementation (only one pass)
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] > array[j + 1]) {
                // Swap elements
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
        // The postcondition is not satisfied because the array might not be fully sorted
    }
    
    /**
     * Converts an array to a string representation.
     * 
     * @param array the array to convert
     * @return a string representation of the array
     */
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
/**
 * MOD2C5_Err.java
 * This program demonstrates common errors related to satisfying postconditions
 * when preconditions are met (MOD-2.C.5).
 * 
 * @author AP CSA
 */
public class MOD2C5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when trying to satisfy postconditions:\n");
        
        // ERROR 1: Not handling all valid inputs that meet preconditions
        System.out.println("ERROR 1: Not handling all valid inputs that meet preconditions");
        System.out.println("Method: findMaxIncomplete(int[]) - Precondition: array is not null");
        System.out.println("Postcondition: returns the maximum value in the array");
        
        try {
            int[] emptyArray = {}; // Empty array is valid (not null)
            System.out.println("Calling findMaxIncomplete on an empty array");
            int max = findMaxIncomplete(emptyArray);
            System.out.println("Result: " + max);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("The method fails to satisfy the postcondition for all valid inputs\n");
        }
        
        // ERROR 2: Implementing only part of the postcondition
        System.out.println("ERROR 2: Implementing only part of the postcondition");
        System.out.println("Method: normalizeScoreIncomplete(int) - Precondition: none");
        System.out.println("Postcondition: 0 <= return value <= 100");
        
        int score1 = -10;
        int normalizedScore1 = normalizeScoreIncomplete(score1);
        System.out.println("normalizeScoreIncomplete(" + score1 + ") = " + normalizedScore1);
        
        int score2 = 150;
        int normalizedScore2 = normalizeScoreIncomplete(score2);
        System.out.println("normalizeScoreIncomplete(" + score2 + ") = " + normalizedScore2);
        System.out.println("The method only handles negative values, not values > 100\n");
        
        // ERROR 3: Assuming preconditions guarantee postconditions without proper implementation
        System.out.println("ERROR 3: Assuming preconditions guarantee postconditions without proper implementation");
        System.out.println("Method: sortArrayIncomplete(int[]) - Precondition: array is not null");
        System.out.println("Postcondition: array is sorted in ascending order");
        
        int[] array = {5, 2, 8, 1, 9};
        System.out.println("Original array: " + arrayToString(array));
        sortArrayIncomplete(array);
        System.out.println("After 'sorting': " + arrayToString(array));
        System.out.println("The implementation is incomplete and doesn't satisfy the postcondition\n");
        
        // ERROR 4: Ignoring edge cases that satisfy preconditions
        System.out.println("ERROR 4: Ignoring edge cases that satisfy preconditions");
        System.out.println("Method: divideAndRound(int, int) - Precondition: divisor != 0");
        System.out.println("Postcondition: returns the rounded result of division");
        
        int a = 10;
        int b = 3;
        System.out.println("divideAndRound(" + a + ", " + b + ") = " + divideAndRound(a, b));
        
        int c = Integer.MAX_VALUE;
        int d = 1;
        try {
            System.out.println("divideAndRound(" + c + ", " + d + ") = " + divideAndRound(c, d));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("The method doesn't handle integer overflow edge cases\n");
        }
        
        // ERROR 5: Violating postconditions despite meeting preconditions
        System.out.println("ERROR 5: Violating postconditions despite meeting preconditions");
        System.out.println("Method: createPositiveArray(int) - Precondition: size > 0");
        System.out.println("Postcondition: returns an array of size 'size' with all positive values");
        
        int size = 5;
        int[] positiveArray = createPositiveArray(size);
        System.out.println("Array created: " + arrayToString(positiveArray));
        System.out.println("The method violates the postcondition by including zero (not positive)\n");
        
        System.out.println("Key points about satisfying postconditions:");
        System.out.println("- Methods must handle ALL valid inputs that meet preconditions");
        System.out.println("- All parts of a postcondition must be implemented");
        System.out.println("- Preconditions alone don't guarantee postconditions");
        System.out.println("- Edge cases that meet preconditions must be handled");
        System.out.println("- Implementation must be complete to satisfy postconditions");
    }
    
    /**
     * Finds the maximum value in an array.
     * 
     * Precondition: array is not null
     * Postcondition: returns the maximum value in the array
     * 
     * @param array the input array
     * @return the maximum value in the array
     */
    public static int findMaxIncomplete(int[] array) {
        // ERROR: This implementation doesn't handle empty arrays
        // which satisfy the precondition (not null) but cause an exception
        int max = array[0]; // Throws ArrayIndexOutOfBoundsException if array is empty
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        return max;
    }
    
    /**
     * Normalizes a score to be between 0 and 100.
     * 
     * Postcondition: 0 <= return value <= 100
     * 
     * @param score the input score
     * @return the normalized score
     */
    public static int normalizeScoreIncomplete(int score) {
        // ERROR: This implementation only handles negative values
        // but doesn't handle values greater than 100
        if (score < 0) {
            return 0;
        }
        
        return score; // Violates postcondition when score > 100
    }
    
    /**
     * Sorts an array in ascending order.
     * 
     * Precondition: array is not null
     * Postcondition: array is sorted in ascending order
     * 
     * @param array the array to be sorted
     */
    public static void sortArrayIncomplete(int[] array) {
        // ERROR: This implementation is incomplete and doesn't fully sort the array
        // It only does a single pass, which doesn't guarantee the postcondition
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] > array[j + 1]) {
                // Swap elements
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
    
    /**
     * Divides two integers and rounds the result.
     * 
     * Precondition: divisor != 0
     * Postcondition: returns the rounded result of division
     * 
     * @param numerator the number to be divided
     * @param divisor the number to divide by
     * @return the rounded result of division
     */
    public static int divideAndRound(int numerator, int divisor) {
        // ERROR: This implementation doesn't handle potential integer overflow
        // which can occur with large values that still meet the precondition
        double result = (double) numerator / divisor;
        return (int) Math.round(result);
    }
    
    /**
     * Creates an array of the specified size with all positive values.
     * 
     * Precondition: size > 0
     * Postcondition: returns an array of size 'size' with all positive values
     * 
     * @param size the size of the array to create
     * @return an array with all positive values
     */
    public static int[] createPositiveArray(int size) {
        // ERROR: This implementation includes zero, which is not positive
        // This violates the postcondition despite meeting the precondition
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i; // Values include 0, which is not positive
        }
        return array;
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
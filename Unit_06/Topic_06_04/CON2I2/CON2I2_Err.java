/**
 * This program demonstrates common errors when implementing standard array algorithms (CON-2.I.2)
 * It shows mistakes that can occur when shifting/rotating elements left or right,
 * and when reversing the order of elements.
 */
public class CON2I2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors in array traversal algorithms (CON-2.I.2):\n");
        
        // Sample array for demonstrations
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original array: " + arrayToString(numbers) + "\n");
        
        // Example 1: ERROR - Incorrect right shift implementation (modifying original array)
        System.out.println("Example 1: ERROR - Incorrect right shift implementation");
        System.out.println("Before shift: " + arrayToString(numbers));
        
        // ERROR: This attempts to shift in-place, but will overwrite values
        int[] numbersToShiftRight = numbers.clone();
        System.out.println("Attempting to shift right by 2 positions in-place...");
        
        // ERROR: This loop overwrites values without saving them first
        for (int i = numbersToShiftRight.length - 1; i >= 2; i--) {
            numbersToShiftRight[i] = numbersToShiftRight[i - 2];
        }
        // Set the first two positions to zero
        numbersToShiftRight[0] = 0;
        numbersToShiftRight[1] = 0;
        
        System.out.println("Result (incorrect - duplicated values): " + arrayToString(numbersToShiftRight));
        System.out.println("The correct approach would create a new array or use a temporary array");
        System.out.println();
        
        // Example 2: ERROR - Incorrect left shift (off-by-one error)
        System.out.println("Example 2: ERROR - Incorrect left shift (off-by-one error)");
        System.out.println("Before shift: " + arrayToString(numbers));
        
        int[] incorrectLeftShift = new int[numbers.length];
        // ERROR: Off-by-one error in the loop bounds
        for (int i = 0; i < numbers.length - 2; i++) { // Should be numbers.length - 2
            incorrectLeftShift[i] = numbers[i + 2];
        }
        
        System.out.println("After shifting left by 2 (incorrect): " + arrayToString(incorrectLeftShift));
        System.out.println("The last two elements were not properly set to zero");
        System.out.println();
        
        // Example 3: ERROR - Incorrect right rotation (formula error)
        System.out.println("Example 3: ERROR - Incorrect right rotation (formula error)");
        System.out.println("Before rotation: " + arrayToString(numbers));
        
        int[] incorrectRightRotation = new int[numbers.length];
        int positions = 2;
        
        // ERROR: Incorrect formula for calculating new positions
        for (int i = 0; i < numbers.length; i++) {
            // ERROR: This formula is incorrect for right rotation
            int newPosition = (i - positions) % numbers.length; // Should be (i + positions) % length
            
            // ERROR: Negative modulo needs correction
            if (newPosition < 0) {
                newPosition += numbers.length;
            }
            
            incorrectRightRotation[newPosition] = numbers[i];
        }
        
        System.out.println("After rotating right by 2 (incorrect): " + arrayToString(incorrectRightRotation));
        System.out.println("This actually performs a left rotation instead of right");
        System.out.println();
        
        // Example 4: ERROR - Incorrect left rotation (not handling large positions)
        System.out.println("Example 4: ERROR - Incorrect left rotation (not handling large positions)");
        System.out.println("Before rotation: " + arrayToString(numbers));
        
        int[] incorrectLeftRotation = new int[numbers.length];
        int largePositions = 9; // More than the array length
        
        // ERROR: Not handling positions larger than array length
        for (int i = 0; i < numbers.length; i++) {
            // This will cause array index out of bounds for large positions
            int newPosition = (i - largePositions); // Should use modulo
            
            if (newPosition < 0) {
                newPosition += numbers.length;
            }
            
            // This might still cause index out of bounds for very large positions
            incorrectLeftRotation[newPosition] = numbers[i];
        }
        
        System.out.println("After rotating left by " + largePositions + " (potentially incorrect): " + 
                           arrayToString(incorrectLeftRotation));
        System.out.println("The correct approach would use modulo to handle positions larger than array length");
        System.out.println();
        
        // Example 5: ERROR - Incorrect array reversal (only swapping half the elements)
        System.out.println("Example 5: ERROR - Incorrect array reversal (only swapping half the elements)");
        System.out.println("Before reversal: " + arrayToString(numbers));
        
        int[] incorrectReversal = numbers.clone();
        
        // ERROR: Incorrect loop bounds for reversal
        for (int i = 0; i < incorrectReversal.length / 2 - 1; i++) { // Should be length/2 without -1
            // Swap elements
            int temp = incorrectReversal[i];
            incorrectReversal[i] = incorrectReversal[incorrectReversal.length - 1 - i];
            incorrectReversal[incorrectReversal.length - 1 - i] = temp;
        }
        
        System.out.println("After reversal (incorrect): " + arrayToString(incorrectReversal));
        System.out.println("The middle elements were not properly swapped due to incorrect loop bounds");
        System.out.println();
        
        // Example 6: ERROR - Incorrect in-place reversal (overwriting values)
        System.out.println("Example 6: ERROR - Incorrect in-place reversal (overwriting values)");
        int[] numbersToReverseIncorrectly = numbers.clone();
        System.out.println("Before in-place reversal: " + arrayToString(numbersToReverseIncorrectly));
        
        // ERROR: This approach overwrites values without saving them
        for (int i = 0; i < numbersToReverseIncorrectly.length; i++) {
            // This overwrites values without saving them first
            numbersToReverseIncorrectly[i] = numbersToReverseIncorrectly[numbersToReverseIncorrectly.length - 1 - i];
        }
        
        System.out.println("After in-place reversal (incorrect): " + arrayToString(numbersToReverseIncorrectly));
        System.out.println("The array contains duplicated values because original values were overwritten");
        System.out.println("The correct approach would use a temporary variable to swap elements");
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors in Array Traversal Algorithms (CON-2.I.2) ---");
        System.out.println("1. Attempting to shift elements in-place without preserving original values");
        System.out.println("2. Off-by-one errors in loop bounds when shifting elements");
        System.out.println("3. Incorrect formulas for calculating new positions during rotation");
        System.out.println("4. Not handling positions larger than array length in rotations");
        System.out.println("5. Incorrect loop bounds when reversing arrays");
        System.out.println("6. Overwriting values during in-place operations without saving them first");
    }
    
    // Helper method to convert an array to a string for display
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
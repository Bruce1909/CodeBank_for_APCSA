/**
 * This program demonstrates standard array algorithms that utilize traversals (CON-2.I.2)
 * It shows how to shift or rotate elements left or right, and how to reverse the order of elements.
 */
public class CON2I2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating standard array traversal algorithms (CON-2.I.2):\n");
        
        // Sample array for demonstrations
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original array: " + arrayToString(numbers) + "\n");
        
        // Example 1: Shift elements to the right
        System.out.println("Example 1: Shifting elements to the right");
        System.out.println("Before shift: " + arrayToString(numbers));
        
        int[] rightShifted = shiftRight(numbers.clone(), 2);
        System.out.println("After shifting right by 2: " + arrayToString(rightShifted));
        System.out.println();
        
        // Example 2: Shift elements to the left
        System.out.println("Example 2: Shifting elements to the left");
        System.out.println("Before shift: " + arrayToString(numbers));
        
        int[] leftShifted = shiftLeft(numbers.clone(), 2);
        System.out.println("After shifting left by 2: " + arrayToString(leftShifted));
        System.out.println();
        
        // Example 3: Rotate elements to the right (circular shift)
        System.out.println("Example 3: Rotating elements to the right (circular shift)");
        System.out.println("Before rotation: " + arrayToString(numbers));
        
        int[] rightRotated = rotateRight(numbers.clone(), 2);
        System.out.println("After rotating right by 2: " + arrayToString(rightRotated));
        System.out.println();
        
        // Example 4: Rotate elements to the left (circular shift)
        System.out.println("Example 4: Rotating elements to the left (circular shift)");
        System.out.println("Before rotation: " + arrayToString(numbers));
        
        int[] leftRotated = rotateLeft(numbers.clone(), 2);
        System.out.println("After rotating left by 2: " + arrayToString(leftRotated));
        System.out.println();
        
        // Example 5: Reverse the order of elements
        System.out.println("Example 5: Reversing the order of elements");
        System.out.println("Before reversal: " + arrayToString(numbers));
        
        int[] reversed = reverse(numbers.clone());
        System.out.println("After reversal: " + arrayToString(reversed));
        System.out.println();
        
        // Example 6: In-place reversal (modifying the original array)
        System.out.println("Example 6: In-place reversal (modifying the original array)");
        int[] numbersToReverse = numbers.clone();
        System.out.println("Before in-place reversal: " + arrayToString(numbersToReverse));
        
        reverseInPlace(numbersToReverse);
        System.out.println("After in-place reversal: " + arrayToString(numbersToReverse));
        System.out.println();
        
        // Summary
        System.out.println("--- Standard Array Traversal Algorithms (CON-2.I.2) ---");
        System.out.println("1. Shifting elements right - moves elements to higher indices, discarding elements at the end");
        System.out.println("2. Shifting elements left - moves elements to lower indices, discarding elements at the beginning");
        System.out.println("3. Rotating elements right - circular shift where elements wrap around to the beginning");
        System.out.println("4. Rotating elements left - circular shift where elements wrap around to the end");
        System.out.println("5. Reversing element order - swapping elements from opposite ends of the array");
    }
    
    // Helper method to shift array elements to the right
    private static int[] shiftRight(int[] arr, int positions) {
        int[] result = new int[arr.length];
        
        // Fill the first 'positions' elements with zeros (or default values)
        for (int i = 0; i < positions; i++) {
            result[i] = 0; // Default value for shifted positions
        }
        
        // Copy the original elements to their new positions
        for (int i = 0; i < arr.length - positions; i++) {
            result[i + positions] = arr[i];
        }
        
        return result;
    }
    
    // Helper method to shift array elements to the left
    private static int[] shiftLeft(int[] arr, int positions) {
        int[] result = new int[arr.length];
        
        // Copy elements to their new positions (shifted left)
        for (int i = positions; i < arr.length; i++) {
            result[i - positions] = arr[i];
        }
        
        // Fill the last 'positions' elements with zeros (or default values)
        for (int i = arr.length - positions; i < arr.length; i++) {
            result[i] = 0; // Default value for shifted positions
        }
        
        return result;
    }
    
    // Helper method to rotate array elements to the right (circular shift)
    private static int[] rotateRight(int[] arr, int positions) {
        int[] result = new int[arr.length];
        positions = positions % arr.length; // Handle cases where positions > array length
        
        // Copy elements to their rotated positions
        for (int i = 0; i < arr.length; i++) {
            int newPosition = (i + positions) % arr.length;
            result[newPosition] = arr[i];
        }
        
        return result;
    }
    
    // Helper method to rotate array elements to the left (circular shift)
    private static int[] rotateLeft(int[] arr, int positions) {
        int[] result = new int[arr.length];
        positions = positions % arr.length; // Handle cases where positions > array length
        
        // Copy elements to their rotated positions
        for (int i = 0; i < arr.length; i++) {
            int newPosition = (i - positions + arr.length) % arr.length;
            result[newPosition] = arr[i];
        }
        
        return result;
    }
    
    // Helper method to reverse the order of array elements (creating a new array)
    private static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        
        return result;
    }
    
    // Helper method to reverse the order of array elements in-place
    private static void reverseInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move indices toward the center
            left++;
            right--;
        }
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
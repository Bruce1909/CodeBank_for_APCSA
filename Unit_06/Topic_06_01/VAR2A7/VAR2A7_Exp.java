/**
 * VAR2A7_Exp.java
 * This program demonstrates the valid index values for arrays and
 * what happens when invalid indices are used (VAR-2.A.7).
 */
public class VAR2A7_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating valid array indices and bounds checking:\n");
        
        // Example 1: Creating an array and examining valid indices
        System.out.println("Example 1: Creating an array and examining valid indices");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Created an array: int[] numbers = {10, 20, 30, 40, 50};");
        System.out.println("Array length: " + numbers.length);
        System.out.println("Valid indices are from 0 to " + (numbers.length - 1) + " (inclusive)");
        
        // Accessing elements with valid indices
        System.out.println("\nAccessing elements with valid indices:");
        System.out.println("First element (index 0): numbers[0] = " + numbers[0]);
        System.out.println("Third element (index 2): numbers[2] = " + numbers[2]);
        System.out.println("Last element (index " + (numbers.length - 1) + "): numbers[" + (numbers.length - 1) + "] = " + numbers[numbers.length - 1]);
        
        // Example 2: Safely iterating through an array
        System.out.println("\nExample 2: Safely iterating through an array");
        System.out.println("Using a for loop with proper bounds:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("  numbers[" + i + "] = " + numbers[i]);
        }
        
        // Example 3: Using enhanced for loop (for-each) to avoid index issues
        System.out.println("\nExample 3: Using enhanced for loop to avoid index issues");
        System.out.println("Enhanced for loop automatically uses valid indices:");
        int index = 0;
        for (int value : numbers) {
            System.out.println("  Element at index " + index + ": " + value);
            index++;
        }
        
        // Example 4: Demonstrating bounds checking
        System.out.println("\nExample 4: Demonstrating bounds checking");
        System.out.println("Safe array access with bounds checking:");
        accessArraySafely(numbers, 2);  // Valid index
        accessArraySafely(numbers, 5);  // Invalid index (too high)
        accessArraySafely(numbers, -1); // Invalid index (negative)
        
        // Example 5: Demonstrating ArrayIndexOutOfBoundsException
        System.out.println("\nExample 5: Demonstrating ArrayIndexOutOfBoundsException");
        System.out.println("The following code would cause an ArrayIndexOutOfBoundsException:");
        System.out.println("// int value = numbers[5]; // Error: Index 5 out of bounds for length 5");
        System.out.println("// int value = numbers[-1]; // Error: Index -1 out of bounds for length 5");
        
        // Catching the exception
        System.out.println("\nCatching the ArrayIndexOutOfBoundsException:");
        try {
            System.out.println("Attempting to access numbers[5]...");
            int value = numbers[5]; // This will throw an exception
            System.out.println("This line will not be executed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("It's important to use valid indices!");
        }
        
        // Key points about array indices
        System.out.println("\nKey points about array indices:");
        System.out.println("1. Valid indices are from 0 to (array.length - 1)");
        System.out.println("2. Accessing an array with an invalid index throws ArrayIndexOutOfBoundsException");
        System.out.println("3. Always check that indices are within bounds before accessing array elements");
        System.out.println("4. Use loops with proper conditions to avoid index out of bounds errors");
    }
    
    /**
     * Safely accesses an array element by checking bounds first
     * @param arr The array to access
     * @param index The index to check and access
     */
    private static void accessArraySafely(int[] arr, int index) {
        System.out.print("Accessing index " + index + ": ");
        if (index >= 0 && index < arr.length) {
            System.out.println("Value is " + arr[index]);
        } else {
            System.out.println("Invalid index! Must be between 0 and " + (arr.length - 1));
        }
    }
}
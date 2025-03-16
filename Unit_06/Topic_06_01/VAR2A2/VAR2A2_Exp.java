/**
 * VAR2A2_Exp.java
 * This program demonstrates that the size of an array is established
 * at the time of creation and cannot be changed (VAR-2.A.2).
 */
public class VAR2A2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating that array size is fixed at creation time:\n");
        
        // Example 1: Creating an array with a specific size
        System.out.println("Example 1: Creating an array with a specific size");
        int[] numbers = new int[5]; // Creates an array that can hold exactly 5 integers
        System.out.println("Created an array 'numbers' with size: " + numbers.length);
        
        // Fill the array with values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        
        // Display the array contents
        System.out.print("Array contents: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Example 2: Creating a new array to accommodate more elements
        System.out.println("\nExample 2: Creating a new array to accommodate more elements");
        System.out.println("We want to add more elements, but the original array size is fixed");
        System.out.println("Solution: Create a new, larger array and copy the elements");
        
        // Create a new, larger array
        int[] largerNumbers = new int[10]; // New array with size 10
        
        // Copy elements from the original array
        for (int i = 0; i < numbers.length; i++) {
            largerNumbers[i] = numbers[i];
        }
        
        // Add new elements to the larger array
        for (int i = numbers.length; i < largerNumbers.length; i++) {
            largerNumbers[i] = i * 10;
        }
        
        // Display the new array contents
        System.out.print("New array contents: ");
        for (int num : largerNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Example 3: Using System.arraycopy for more efficient copying
        System.out.println("\nExample 3: Using System.arraycopy for more efficient copying");
        int[] anotherArray = new int[15]; // Even larger array
        System.arraycopy(largerNumbers, 0, anotherArray, 0, largerNumbers.length);
        
        // Display the array after using System.arraycopy
        System.out.print("Array after System.arraycopy: ");
        for (int i = 0; i < anotherArray.length; i++) {
            if (i < largerNumbers.length) {
                System.out.print(anotherArray[i] + " ");
            } else {
                System.out.print("_ "); // Underscore for uninitialized elements
            }
        }
        System.out.println();
        
        // Key points about array size
        System.out.println("\nKey points about array size:");
        System.out.println("1. The size of an array is fixed when it is created");
        System.out.println("2. You cannot add or remove elements to change the array's size");
        System.out.println("3. To accommodate more elements, you must create a new array");
        System.out.println("4. The length property gives you the size of the array");
    }
}
/**
 * VAR-2.C.4 Example
 * Program code written using an enhanced `for` loop to traverse and access elements in an array
 * can be rewritten using an indexed `for` loop or a `while` loop.
 * 
 * This program demonstrates how to convert between different loop types
 * for traversing array elements.
 */
public class VAR2C4_Exp {
    public static void main(String[] args) {
        // Create a 1D array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("1. Using enhanced for loop:");
        int enhancedForSum = 0;
        for (int num : numbers) {
            enhancedForSum += num;
            System.out.println("Processing element: " + num);
        }
        System.out.println("Sum using enhanced for loop: " + enhancedForSum);
        
        System.out.println("\n2. Equivalent indexed for loop:");
        int indexedForSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            indexedForSum += numbers[i];
            System.out.println("Processing element at index " + i + ": " + numbers[i]);
        }
        System.out.println("Sum using indexed for loop: " + indexedForSum);
        
        System.out.println("\n3. Equivalent while loop:");
        int whileSum = 0;
        int index = 0;
        while (index < numbers.length) {
            whileSum += numbers[index];
            System.out.println("Processing element at index " + index + ": " + numbers[index]);
            index++;
        }
        System.out.println("Sum using while loop: " + whileSum);
        
        // Example with String array
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        
        System.out.println("\nString array processing:");
        
        System.out.println("\n1. Enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        System.out.println("\n2. Equivalent indexed for loop:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit at index " + i + ": " + fruits[i]);
        }
        
        System.out.println("\n3. Equivalent while loop:");
        int fruitIndex = 0;
        while (fruitIndex < fruits.length) {
            System.out.println("Fruit at index " + fruitIndex + ": " + fruits[fruitIndex]);
            fruitIndex++;
        }
    }
}
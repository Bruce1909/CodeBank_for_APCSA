/**
 * VAR2A6_Exp.java
 * This program demonstrates how square brackets are used to access
 * and modify elements in a 1D array using an index (VAR-2.A.6).
 */
public class VAR2A6_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating array access and modification using square brackets:\n");
        
        // Example 1: Creating and accessing elements in an integer array
        System.out.println("Example 1: Creating and accessing elements in an integer array");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Created an array: int[] numbers = {10, 20, 30, 40, 50};");
        
        // Accessing array elements using square brackets
        System.out.println("\nAccessing array elements using square brackets:");
        System.out.println("First element (index 0): numbers[0] = " + numbers[0]);
        System.out.println("Third element (index 2): numbers[2] = " + numbers[2]);
        System.out.println("Last element (index 4): numbers[4] = " + numbers[4]);
        
        // Example 2: Modifying array elements using square brackets
        System.out.println("\nExample 2: Modifying array elements using square brackets");
        System.out.println("Original array contents:");
        printArray(numbers);
        
        // Modify elements using square brackets
        numbers[0] = 15;    // Change the first element
        numbers[2] = 35;    // Change the third element
        numbers[4] = 55;    // Change the last element
        
        System.out.println("\nAfter modifying elements:");
        System.out.println("numbers[0] = 15;    // Changed the first element");
        System.out.println("numbers[2] = 35;    // Changed the third element");
        System.out.println("numbers[4] = 55;    // Changed the last element");
        printArray(numbers);
        
        // Example 3: Using variables as indices
        System.out.println("\nExample 3: Using variables as indices");
        int index = 1;
        System.out.println("Using a variable as an index: numbers[index] where index = " + index);
        System.out.println("Value at numbers[" + index + "] = " + numbers[index]);
        
        // Modify using variable index
        numbers[index] = 25;
        System.out.println("After numbers[index] = 25:");
        printArray(numbers);
        
        // Example 4: Using expressions as indices
        System.out.println("\nExample 4: Using expressions as indices");
        System.out.println("Using an expression as an index: numbers[index + 2] where index = " + index);
        System.out.println("Value at numbers[" + index + " + 2] = numbers[" + (index + 2) + "] = " + numbers[index + 2]);
        
        // Modify using expression as index
        numbers[index + 2] = 45;
        System.out.println("After numbers[index + 2] = 45:");
        printArray(numbers);
        
        // Example 5: Working with arrays of objects
        System.out.println("\nExample 5: Working with arrays of objects");
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        System.out.println("Created a String array: String[] fruits = {...};");
        
        // Accessing and modifying String array elements
        System.out.println("Original fruits[1] = " + fruits[1]);
        fruits[1] = "Blueberry";
        System.out.println("After fruits[1] = \"Blueberry\":");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        // Key points about array access
        System.out.println("\nKey points about array access using square brackets:");
        System.out.println("1. Square brackets [] are used to access array elements");
        System.out.println("2. Array indices start at 0 (zero-indexed)");
        System.out.println("3. The same syntax is used for both reading and writing elements");
        System.out.println("4. Variables and expressions can be used as indices");
    }
    
    /**
     * Helper method to print the contents of an integer array
     */
    private static void printArray(int[] arr) {
        System.out.print("Array contents: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
/**
 * VAR2A2_Err.java
 * This program demonstrates common errors related to the fixed size
 * of arrays after creation (VAR-2.A.2).
 */
public class VAR2A2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors related to fixed array size:\n");
        
        // ERROR 1: Attempting to change array size after creation
        System.out.println("ERROR 1: Attempting to change array size after creation");
        int[] numbers = new int[5];
        System.out.println("Created an array with size: " + numbers.length);
        
        // Fill the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        
        // Display the array
        System.out.print("Array contents: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("\nTrying to add a 6th element to a 5-element array:");
        System.out.println("// numbers.length = 10; // ERROR: Cannot change length property");
        System.out.println("// numbers[5] = 6;     // ERROR: ArrayIndexOutOfBoundsException");
        
        // ERROR 2: Misunderstanding array assignment
        System.out.println("\nERROR 2: Misunderstanding array assignment");
        int[] array1 = new int[3];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        
        int[] array2 = array1; // This doesn't create a new array, just a new reference
        
        System.out.println("array1 and array2 point to the same array in memory");
        System.out.println("Changing array2[0] will also change array1[0]");
        
        array2[0] = 100;
        
        System.out.print("array1 after changing array2: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // ERROR 3: Incorrect array resizing
        System.out.println("\nERROR 3: Incorrect array resizing");
        int[] smallArray = {1, 2, 3};
        
        System.out.println("Incorrect way to 'resize' an array:");
        System.out.println("smallArray = new int[5]; // This creates a new array, losing the original values");
        
        // Demonstrate the incorrect resizing
        System.out.print("Original array: ");
        for (int num : smallArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        smallArray = new int[5]; // This creates a new array, losing the original values
        
        System.out.print("After incorrect resizing: ");
        for (int num : smallArray) {
            System.out.print(num + " ");
        }
        System.out.println(" (Original values are lost)");
        
        // ERROR 4: Forgetting that arrays have fixed size
        System.out.println("\nERROR 4: Forgetting that arrays have fixed size");
        System.out.println("Common error: Trying to add elements to an array as if it were a list");
        System.out.println("// numbers.add(6);  // ERROR: Arrays don't have an add() method");
        
        // Correct approach
        System.out.println("\nCorrect approach: Create a new array with larger size");
        System.out.println("int[] largerArray = new int[numbers.length + 1];");
        System.out.println("System.arraycopy(numbers, 0, largerArray, 0, numbers.length);");
        System.out.println("largerArray[numbers.length] = 6;");
    }
}
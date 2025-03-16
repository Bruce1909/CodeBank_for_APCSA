/**
 * VAR2A7_Err.java
 * This program demonstrates common errors related to array indices
 * and ArrayIndexOutOfBoundsException (VAR-2.A.7).
 */
public class VAR2A7_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors with array indices:\n");
        
        // ERROR 1: Accessing an array with an index equal to its length
        System.out.println("ERROR 1: Accessing an array with an index equal to its length");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Created an array: int[] numbers = {10, 20, 30, 40, 50};");
        System.out.println("Array length: " + numbers.length);
        System.out.println("Valid indices are from 0 to " + (numbers.length - 1));
        
        System.out.println("\nCommon error: Using the array length as an index");
        System.out.println("// int value = numbers[numbers.length]; // ERROR: ArrayIndexOutOfBoundsException");
        System.out.println("The correct way to access the last element is:");
        System.out.println("int lastElement = numbers[numbers.length - 1]; // Value: " + numbers[numbers.length - 1]);
        
        // ERROR 2: Using negative indices
        System.out.println("\nERROR 2: Using negative indices");
        System.out.println("Some languages allow negative indices, but Java does not");
        System.out.println("// int firstElement = numbers[-1]; // ERROR: ArrayIndexOutOfBoundsException");
        System.out.println("The correct way to access the first element is:");
        System.out.println("int firstElement = numbers[0]; // Value: " + numbers[0]);
        
        // ERROR 3: Off-by-one errors in loops
        System.out.println("\nERROR 3: Off-by-one errors in loops");
        System.out.println("Common error: Using <= instead of < in a for loop");
        System.out.println("for (int i = 0; i <= numbers.length; i++) { // ERROR: Will cause ArrayIndexOutOfBoundsException");
        System.out.println("    System.out.println(numbers[i]);");
        System.out.println("}");
        
        System.out.println("\nCorrect loop condition:");
        System.out.println("for (int i = 0; i < numbers.length; i++) { // Correct: i stops at length-1");
        System.out.println("    System.out.println(numbers[i]);");
        System.out.println("}");
        
        // ERROR 4: Not checking user input or calculated indices
        System.out.println("\nERROR 4: Not checking user input or calculated indices");
        System.out.println("int userIndex = getUserInput(); // Could be any value");
        System.out.println("// int value = numbers[userIndex]; // ERROR if userIndex is invalid");
        
        System.out.println("\nCorrect approach with bounds checking:");
        System.out.println("if (userIndex >= 0 && userIndex < numbers.length) {");
        System.out.println("    int value = numbers[userIndex]; // Safe access");
        System.out.println("} else {");
        System.out.println("    System.out.println(\"Invalid index\");");
        System.out.println("}");
        
        // ERROR 5: Not handling ArrayIndexOutOfBoundsException
        System.out.println("\nERROR 5: Not handling ArrayIndexOutOfBoundsException");
        System.out.println("When accessing arrays with uncertain indices, use try-catch:");
        System.out.println("try {");
        System.out.println("    int value = numbers[someIndex]; // Potentially unsafe access");
        System.out.println("    // Process value");
        System.out.println("} catch (ArrayIndexOutOfBoundsException e) {");
        System.out.println("    System.out.println(\"Invalid index: \" + e.getMessage());");
        System.out.println("    // Handle the error appropriately");
        System.out.println("}");
        
        // ERROR 6: Confusing array length with capacity
        System.out.println("\nERROR 6: Confusing array length with capacity");
        System.out.println("Arrays in Java have a fixed size that cannot be changed");
        System.out.println("// numbers[numbers.length] = 60; // ERROR: Cannot add a new element");
        System.out.println("To add more elements, you must create a new, larger array and copy the elements");
        
        // Demonstrate a real ArrayIndexOutOfBoundsException
        System.out.println("\nDemonstrating a real ArrayIndexOutOfBoundsException (commented out):");
        System.out.println("// Uncommenting the next line would crash the program if not in a try-catch block");
        // Uncomment to see the exception: System.out.println(numbers[10]);
        
        // Safe way to demonstrate the exception
        try {
            // This will throw an exception
            int index = 10;
            System.out.println("Attempting to access numbers[" + index + "]...");
            // int value = numbers[index]; // Commented to prevent actual crash
            System.out.println("This line would not be executed if the above line was uncommented");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Would catch: ArrayIndexOutOfBoundsException");
        }
    }
    
    /**
     * Simulated method to represent user input
     * @return A value that might be a valid or invalid index
     */
    private static int getUserInput() {
        // This would normally get input from the user
        return 3; // Just a placeholder value
    }
}
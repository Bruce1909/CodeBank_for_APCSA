/**
 * VAR2A6_Err.java
 * This program demonstrates common errors when using square brackets
 * to access and modify elements in a 1D array (VAR-2.A.6).
 */
public class VAR2A6_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors when accessing array elements:\n");
        
        // ERROR 1: Accessing an array element with an invalid index
        System.out.println("ERROR 1: Accessing an array element with an invalid index");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Created an array: int[] numbers = {10, 20, 30, 40, 50};");
        System.out.println("Valid indices are 0 to " + (numbers.length - 1));
        
        System.out.println("Trying to access element at index 5:");
        System.out.println("// int value = numbers[5]; // ERROR: ArrayIndexOutOfBoundsException");
        System.out.println("Trying to access element at index -1:");
        System.out.println("// int value = numbers[-1]; // ERROR: ArrayIndexOutOfBoundsException");
        
        // ERROR 2: Forgetting that array indices start at 0
        System.out.println("\nERROR 2: Forgetting that array indices start at 0");
        String[] months = {"January", "February", "March", "April", "May"};
        System.out.println("Created an array of months");
        
        System.out.println("Common error: Thinking the first month is at index 1");
        System.out.println("First month is at months[0]: " + months[0]);
        System.out.println("Second month is at months[1]: " + months[1]);
        
        // ERROR 3: Using a variable index without bounds checking
        System.out.println("\nERROR 3: Using a variable index without bounds checking");
        System.out.println("int index = getUserInput(); // Assume this gets a value from user");
        System.out.println("// int value = numbers[index]; // ERROR if index is out of bounds");
        
        System.out.println("Correct approach: Check bounds before accessing");
        System.out.println("if (index >= 0 && index < numbers.length) {");
        System.out.println("    int value = numbers[index]; // Safe access");
        System.out.println("} else {");
        System.out.println("    System.out.println(\"Invalid index\");");
        System.out.println("}");
        
        // ERROR 4: Confusing array length with the last valid index
        System.out.println("\nERROR 4: Confusing array length with the last valid index");
        System.out.println("Array length: " + numbers.length);
        System.out.println("Last valid index: " + (numbers.length - 1));
        System.out.println("Common error: Using array.length as an index");
        System.out.println("// int lastElement = numbers[numbers.length]; // ERROR: ArrayIndexOutOfBoundsException");
        System.out.println("Correct: int lastElement = numbers[numbers.length - 1]; // Correct way to access last element");
        
        // ERROR 5: Modifying an array element with the wrong type
        System.out.println("\nERROR 5: Modifying an array element with the wrong type");
        double[] prices = {19.99, 29.99, 39.99};
        System.out.println("Created a double array: double[] prices = {19.99, 29.99, 39.99};");
        
        System.out.println("Common error: Trying to store an incompatible type");
        System.out.println("// prices[0] = \"Sale!\"; // ERROR: Cannot convert String to double");
        System.out.println("// prices[1] = true;    // ERROR: Cannot convert boolean to double");
        
        // ERROR 6: Forgetting to update an array element after calculation
        System.out.println("\nERROR 6: Forgetting to update an array element after calculation");
        int[] values = {5, 10, 15};
        System.out.println("Created an array: int[] values = {5, 10, 15};");
        
        System.out.println("Common error: Forgetting to store the result back in the array");
        System.out.println("// values[0] * 2; // ERROR: Calculation performed but result not stored");
        System.out.println("Correct: values[0] = values[0] * 2; // Correct way to double the value");
        
        // ERROR 7: Using array access syntax with non-array variables
        System.out.println("\nERROR 7: Using array access syntax with non-array variables");
        int number = 42;
        System.out.println("Created a single int variable: int number = 42;");
        
        System.out.println("Common error: Trying to use array access on a non-array");
        System.out.println("// int digit = number[0]; // ERROR: Cannot use array access on int");
    }
    
    // Simulated method to represent user input
    private static int getUserInput() {
        // This would normally get input from the user
        return 3; // Just a placeholder value
    }
}
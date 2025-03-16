/**
 * VAR-2.C.4 Error Example
 * Program code written using an enhanced `for` loop to traverse and access elements in an array
 * can be rewritten using an indexed `for` loop or a `while` loop.
 * 
 * This program demonstrates common errors when converting between different loop types.
 */
public class VAR2C4_Err {
    public static void main(String[] args) {
        // Create a 1D array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Original enhanced for loop:");
        for (int num : numbers) {
            System.out.println("Processing: " + num);
        }
        
        // ERROR 1: Off-by-one error when converting to indexed for loop
        System.out.println("\nError 1: Off-by-one error in indexed for loop");
        System.out.println("(Using <= instead of < in the loop condition)");
        
        // This will cause an ArrayIndexOutOfBoundsException
        try {
            for (int i = 0; i <= numbers.length; i++) { // ERROR: should be i < numbers.length
                System.out.println("Processing element at index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because we used <= instead of < in the loop condition");
        }
        
        // ERROR 2: Forgetting to increment the index in a while loop
        System.out.println("\nError 2: Forgetting to increment the index in a while loop");
        System.out.println("(This would cause an infinite loop if not for our safety check)");
        
        int index = 0;
        int safetyCounter = 0;
        
        System.out.println("Starting problematic while loop with safety counter...");
        while (index < numbers.length) {
            System.out.println("Processing element at index " + index + ": " + numbers[index]);
            // Missing index++ here would cause an infinite loop
            
            // Safety mechanism to prevent actual infinite loop
            safetyCounter++;
            if (safetyCounter >= 10) {
                System.out.println("Safety break applied! This would have been an infinite loop.");
                System.out.println("The error is that we forgot to increment 'index' inside the loop.");
                break;
            }
        }
        
        // ERROR 3: Incorrect initialization when converting from enhanced for loop
        System.out.println("\nError 3: Incorrect initialization in indexed for loop");
        
        // Starting from index 1 instead of 0 skips the first element
        System.out.println("Starting from index 1 instead of 0:");
        for (int i = 1; i < numbers.length; i++) { // ERROR: should start from i = 0
            System.out.println("Processing element at index " + i + ": " + numbers[i]);
        }
        System.out.println("Notice that the first element (10) was skipped!");
        
        // Correct conversion examples
        System.out.println("\nCorrect conversions would be:");
        System.out.println("1. Indexed for loop: for (int i = 0; i < numbers.length; i++)");
        System.out.println("2. While loop: int i = 0; while (i < numbers.length) { ... i++; }");
    }
}
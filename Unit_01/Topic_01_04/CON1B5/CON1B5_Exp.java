/**
 * CON1B5_Exp.java
 * 
 * This program demonstrates the increment and decrement operators in Java.
 * Knowledge Point: CON-1.B.5 - The increment operator (++) and decrement operator (−−) 
 * are used to add 1 or subtract 1 from the stored value of a variable or an array element. 
 * The new value is assigned to the variable or array element.
 * 
 * Note: The AP Exam excludes the use of increment and decrement operators in prefix form (i.e., ++x)
 * and inside other expressions (i.e., arr[x++]).
 */
public class CON1B5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Increment and Decrement Operators:\n");
        
        // Example 1: Basic increment operator (++)
        System.out.println("Example 1: Basic increment operator (++)");
        int count = 5;
        System.out.println("Initial count: " + count);
        
        count++;  // Equivalent to: count = count + 1;
        System.out.println("After count++: " + count);
        System.out.println();
        
        // Example 2: Basic decrement operator (--)
        System.out.println("Example 2: Basic decrement operator (--)");
        int value = 10;
        System.out.println("Initial value: " + value);
        
        value--;  // Equivalent to: value = value - 1;
        System.out.println("After value--: " + value);
        System.out.println();
        
        // Example 3: Using increment in a loop
        System.out.println("Example 3: Using increment in a loop");
        System.out.println("Counting from 1 to 5:");
        
        for (int i = 1; i <= 5; i++) {  // i++ increments i after each iteration
            System.out.println("Current value: " + i);
        }
        System.out.println();
        
        // Example 4: Using decrement in a loop
        System.out.println("Example 4: Using decrement in a loop");
        System.out.println("Counting down from 5 to 1:");
        
        for (int i = 5; i >= 1; i--) {  // i-- decrements i after each iteration
            System.out.println("Current value: " + i);
        }
        System.out.println();
        
        // Example 5: Increment and decrement with array elements
        System.out.println("Example 5: Increment and decrement with array elements");
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Original array values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        // Increment array elements
        numbers[0]++;  // Increment the first element
        numbers[2]++;  // Increment the third element
        
        // Decrement array elements
        numbers[1]--;  // Decrement the second element
        numbers[3]--;  // Decrement the fourth element
        
        System.out.println("\nArray values after increment/decrement:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        System.out.println();
        
        // Example 6: Using increment/decrement in while loop
        System.out.println("Example 6: Using increment/decrement in while loop");
        int counter = 1;
        
        System.out.println("While loop with increment:");
        while (counter <= 3) {
            System.out.println("Counter: " + counter);
            counter++;  // Increment counter after each iteration
        }
        
        System.out.println("\nWhile loop with decrement:");
        counter = 3;
        while (counter >= 1) {
            System.out.println("Counter: " + counter);
            counter--;  // Decrement counter after each iteration
        }
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Increment and Decrement Operators ---");
        System.out.println("1. The increment operator (++) adds 1 to the value of a variable (CON-1.B.5)");
        System.out.println("2. The decrement operator (--) subtracts 1 from the value of a variable (CON-1.B.5)");
        System.out.println("3. These operators can be used with variables or array elements");
        System.out.println("4. They are commonly used in loops to control iteration");
        System.out.println("5. The AP Exam excludes prefix form (++x) and use inside other expressions (arr[x++])");
    }
}
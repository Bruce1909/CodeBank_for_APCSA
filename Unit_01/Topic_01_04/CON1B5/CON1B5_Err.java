/**
 * CON1B5_Err.java
 * 
 * This program demonstrates common errors related to increment and decrement operators in Java.
 * Knowledge Point: CON-1.B.5 - The increment operator (++) and decrement operator (−−) 
 * are used to add 1 or subtract 1 from the stored value of a variable or an array element. 
 * The new value is assigned to the variable or array element.
 * 
 * Note: The AP Exam excludes the use of increment and decrement operators in prefix form (i.e., ++x)
 * and inside other expressions (i.e., arr[x++]).
 */
public class CON1B5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Increment and Decrement Operators:\n");
        
        // Example 1: Using prefix form (excluded from AP Exam)
        System.out.println("Example 1: Using prefix form (excluded from AP Exam)");
        
        int x = 5;
        // ++x;  // Prefix increment (excluded from AP Exam)
        // --x;  // Prefix decrement (excluded from AP Exam)
        
        System.out.println("x = " + x);
        System.out.println("Error 1: ++x; - Prefix increment is excluded from AP Exam");
        System.out.println("Error 2: --x; - Prefix decrement is excluded from AP Exam");
        System.out.println("Correct: x++; or x--; - Use postfix form instead");
        System.out.println();
        
        // Example 2: Using increment/decrement inside expressions (excluded from AP Exam)
        System.out.println("Example 2: Using increment/decrement inside expressions (excluded from AP Exam)");
        
        int[] arr = {10, 20, 30, 40, 50};
        int i = 0;
        
        // int value = arr[i++];  // Using i++ inside array access (excluded from AP Exam)
        
        System.out.println("i = " + i);
        System.out.println("Error 3: int value = arr[i++]; - Using increment inside other expressions is excluded from AP Exam");
        System.out.println("Correct approach:");
        System.out.println("int value = arr[i];");
        System.out.println("i++;");
        System.out.println();
        
        // Example 3: Attempting to increment/decrement literals or expressions
        System.out.println("Example 3: Attempting to increment/decrement literals or expressions");
        
        // 5++;  // Error: Cannot increment a literal
        // (x + 2)++;  // Error: Cannot increment an expression
        
        System.out.println("Error 4: 5++; - Cannot increment a literal");
        System.out.println("Error 5: (x + 2)++; - Cannot increment an expression");
        System.out.println("Correct: Only variables and array elements can be incremented/decremented");
        System.out.println();
        
        // Example 4: Attempting to increment/decrement final variables
        System.out.println("Example 4: Attempting to increment/decrement final variables");
        
        final int CONSTANT = 100;
        // CONSTANT++;  // Error: Cannot increment a final variable
        
        System.out.println("final int CONSTANT = 100;");
        System.out.println("Error 6: CONSTANT++; - Cannot increment a final variable");
        System.out.println("Correct: Final variables cannot be modified after initialization");
        System.out.println();
        
        // Example 5: Misunderstanding the difference between postfix and prefix (conceptual error)
        System.out.println("Example 5: Misunderstanding postfix vs. prefix (conceptual error)");
        
        int a = 5;
        int b = 5;
        
        // These would behave differently, but prefix form is excluded from AP Exam
        // int resultA = ++a;  // Increment a first, then assign to resultA (excluded from AP Exam)
        int resultB = b++;  // Assign b to resultB first, then increment b
        
        System.out.println("a = 5, b = 5 initially");
        System.out.println("After b++, b = " + b + ", resultB = " + resultB);
        System.out.println("Note: resultB gets the original value of b, then b is incremented");
        System.out.println("This is different from prefix form (++b), which is excluded from AP Exam");
        System.out.println();
        
        // Example 6: Forgetting that increment/decrement changes the variable
        System.out.println("Example 6: Forgetting that increment/decrement changes the variable");
        
        int count = 10;
        System.out.println("Initial count: " + count);
        
        System.out.println("count++: " + count++);  // Displays 10, then increments count to 11
        System.out.println("Current count: " + count);  // Displays 11
        
        System.out.println("\nError 7: Forgetting that the variable value changes after using postfix increment/decrement");
        System.out.println("Correct understanding: The postfix operator returns the original value but changes the variable");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Increment and Decrement Operator Errors ---");
        System.out.println("1. The AP Exam excludes prefix form (++x, --x) of increment/decrement operators");
        System.out.println("2. The AP Exam excludes using increment/decrement inside other expressions (arr[i++])");
        System.out.println("3. Only variables and array elements can be incremented or decremented, not literals or expressions");
        System.out.println("4. Final variables cannot be incremented or decremented");
        System.out.println("5. Postfix form (x++) returns the original value, then changes the variable");
        System.out.println("6. Remember that increment/decrement operators actually change the variable's value");
    }
}
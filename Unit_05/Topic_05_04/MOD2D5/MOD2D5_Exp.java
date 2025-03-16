/**
 * MOD2D5_Exp.java
 * This program demonstrates how the return keyword is used to return the flow of control
 * to the point immediately following where the method or constructor was called (MOD-2.D.5).
 * 
 * @author AP CSA
 */
public class MOD2D5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating the return keyword in Java:\n");
        
        // Example 1: Basic return from a void method
        System.out.println("Example 1: Basic return from a void method");
        System.out.println("Calling printMessage(5):");
        printMessage(5);
        System.out.println("Control returned to main method\n");
        
        // Example 2: Early return from a void method
        System.out.println("Example 2: Early return from a void method");
        System.out.println("Calling printMessage(-3):");
        printMessage(-3);
        System.out.println("Control returned to main method\n");
        
        // Example 3: Return with a value from a non-void method
        System.out.println("Example 3: Return with a value from a non-void method");
        int result = calculateSquare(4);
        System.out.println("4 squared = " + result);
        System.out.println("Control returned to main method with value " + result + "\n");
        
        // Example 4: Multiple return statements in a method
        System.out.println("Example 4: Multiple return statements in a method");
        System.out.println("getLetterGrade(95): " + getLetterGrade(95));
        System.out.println("getLetterGrade(85): " + getLetterGrade(85));
        System.out.println("getLetterGrade(75): " + getLetterGrade(75));
        System.out.println("getLetterGrade(65): " + getLetterGrade(65));
        System.out.println("getLetterGrade(55): " + getLetterGrade(55));
        System.out.println("Control returned to main method with different values\n");
        
        // Example 5: Return from a recursive method
        System.out.println("Example 5: Return from a recursive method");
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Control returned to main method after multiple recursive returns\n");
        
        System.out.println("Key points about the return keyword:");
        System.out.println("- The return keyword immediately exits the current method");
        System.out.println("- Control flow returns to the point where the method was called");
        System.out.println("- In non-void methods, return must be followed by a value");
        System.out.println("- In void methods, return can be used without a value to exit early");
        System.out.println("- A method can have multiple return statements");
    }
    
    /**
     * A void method that demonstrates basic and early returns.
     * 
     * @param value the value to check and print
     */
    public static void printMessage(int value) {
        System.out.println("Inside printMessage method");
        
        // Early return example
        if (value < 0) {
            System.out.println("Value is negative, returning early");
            return; // Early return - control goes back to the caller
        }
        
        System.out.println("Value is: " + value);
        // Method ends here, implicit return occurs
    }
    
    /**
     * A non-void method that returns the square of a number.
     * 
     * @param number the number to square
     * @return the square of the input number
     */
    public static int calculateSquare(int number) {
        System.out.println("Inside calculateSquare method");
        int result = number * number;
        System.out.println("Calculated result: " + result);
        return result; // Returns the value and control to the caller
    }
    
    /**
     * A method with multiple return statements.
     * 
     * @param score the numerical score
     * @return the letter grade corresponding to the score
     */
    public static String getLetterGrade(int score) {
        if (score >= 90) {
            return "A"; // First possible return point
        } else if (score >= 80) {
            return "B"; // Second possible return point
        } else if (score >= 70) {
            return "C"; // Third possible return point
        } else if (score >= 60) {
            return "D"; // Fourth possible return point
        } else {
            return "F"; // Fifth possible return point
        }
    }
    
    /**
     * A recursive method that demonstrates how return works in recursion.
     * 
     * @param n the number to calculate factorial for
     * @return the factorial of n
     */
    public static int factorial(int n) {
        System.out.println("Computing factorial(" + n + ")");
        
        // Base case
        if (n <= 1) {
            System.out.println("Base case reached, returning 1");
            return 1; // Return from base case
        }
        
        // Recursive case
        int result = n * factorial(n - 1); // Recursive call
        System.out.println("Returning factorial(" + n + ") = " + result);
        return result; // Return from recursive case
    }
}
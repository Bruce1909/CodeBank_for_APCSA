/**
 * MOD2C3_Exp.java
 * This program demonstrates preconditions in Java methods (MOD-2.C.3).
 * A precondition is a condition that must be true just prior to the execution
 * of a section of program code in order for the method to behave as expected.
 * 
 * @author AP CSA
 */
public class MOD2C3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating preconditions in Java methods:\n");
        
        // Example 1: Square root method with precondition
        System.out.println("Example 1: Square root method with precondition");
        System.out.println("Precondition: The input must be non-negative");
        
        double number1 = 16.0;
        System.out.println("Calling squareRoot(" + number1 + ")");
        System.out.println("Result: " + squareRoot(number1));
        
        double number2 = -4.0;
        System.out.println("\nCalling squareRoot(" + number2 + ")");
        System.out.println("This violates the precondition, so the result is undefined");
        // We don't call the method with invalid input in this example
        System.out.println();
        
        // Example 2: Division method with precondition
        System.out.println("Example 2: Division method with precondition");
        System.out.println("Precondition: The divisor must not be zero");
        
        int numerator = 10;
        int divisor1 = 2;
        System.out.println("Calling divide(" + numerator + ", " + divisor1 + ")");
        System.out.println("Result: " + divide(numerator, divisor1));
        
        int divisor2 = 0;
        System.out.println("\nCalling divide(" + numerator + ", " + divisor2 + ")");
        System.out.println("This violates the precondition, so the result is undefined");
        // We don't call the method with invalid input in this example
        System.out.println();
        
        // Example 3: Array access method with precondition
        System.out.println("Example 3: Array access method with precondition");
        System.out.println("Precondition: The index must be within the array bounds");
        
        int[] array = {10, 20, 30, 40, 50};
        int validIndex = 2;
        System.out.println("Calling getElement(array, " + validIndex + ")");
        System.out.println("Result: " + getElement(array, validIndex));
        
        int invalidIndex = 10;
        System.out.println("\nCalling getElement(array, " + invalidIndex + ")");
        System.out.println("This violates the precondition, so the result is undefined");
        // We don't call the method with invalid input in this example
        
        System.out.println("\nKey points about preconditions:");
        System.out.println("- Preconditions are conditions that must be true before a method executes");
        System.out.println("- Methods are not expected to check preconditions");
        System.out.println("- It is the caller's responsibility to ensure preconditions are met");
        System.out.println("- If preconditions are violated, the method's behavior is undefined");
        System.out.println("- Preconditions should be documented in method comments");
    }
    
    /**
     * Calculates the square root of a number.
     * 
     * Precondition: number >= 0
     * The input must be non-negative for this method to work correctly.
     * 
     * @param number the number to find the square root of
     * @return the square root of the number
     */
    public static double squareRoot(double number) {
        // Note: This method does not check the precondition
        // It assumes the caller has ensured number >= 0
        return Math.sqrt(number);
    }
    
    /**
     * Divides two integers.
     * 
     * Precondition: divisor != 0
     * The divisor must not be zero to avoid division by zero error.
     * 
     * @param numerator the number to be divided
     * @param divisor the number to divide by
     * @return the result of the division
     */
    public static int divide(int numerator, int divisor) {
        // Note: This method does not check the precondition
        // It assumes the caller has ensured divisor != 0
        return numerator / divisor;
    }
    
    /**
     * Gets an element from an array at the specified index.
     * 
     * Precondition: 0 <= index < array.length
     * The index must be within the bounds of the array.
     * 
     * @param array the array to access
     * @param index the index of the element to retrieve
     * @return the element at the specified index
     */
    public static int getElement(int[] array, int index) {
        // Note: This method does not check the precondition
        // It assumes the caller has ensured 0 <= index < array.length
        return array[index];
    }
}
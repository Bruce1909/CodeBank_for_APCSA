/**
 * MOD2C3_Err.java
 * This program demonstrates common errors related to preconditions in Java methods (MOD-2.C.3).
 * 
 * @author AP CSA
 */
public class MOD2C3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to preconditions:\n");
        
        // ERROR 1: Violating a precondition
        System.out.println("ERROR 1: Violating a precondition");
        System.out.println("Method: squareRoot(double) - Precondition: number >= 0");
        
        try {
            double negativeNumber = -4.0;
            System.out.println("Calling squareRoot(" + negativeNumber + ")");
            double result = squareRoot(negativeNumber);
            System.out.println("Result: " + result + " (This is mathematically incorrect)");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 2: Assuming methods will check preconditions
        System.out.println("ERROR 2: Assuming methods will check preconditions");
        System.out.println("Method: divide(int, int) - Precondition: divisor != 0");
        
        try {
            int numerator = 10;
            int divisor = 0;
            System.out.println("Calling divide(" + numerator + ", " + divisor + ")");
            System.out.println("Incorrectly assuming the method will check for division by zero");
            int quotient = divide(numerator, divisor);
            System.out.println("This line will not execute due to ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("The method did not check the precondition!");
        }
        System.out.println();
        
        // ERROR 3: Not documenting preconditions
        System.out.println("ERROR 3: Not documenting preconditions");
        System.out.println("Method: getElementUndocumented(int[], int)");
        System.out.println("This method has an undocumented precondition: 0 <= index < array.length");
        
        int[] array = {10, 20, 30};
        try {
            int invalidIndex = 5;
            System.out.println("Calling getElementUndocumented(array, " + invalidIndex + ")");
            System.out.println("The caller doesn't know about the precondition");
            int value = getElementUndocumented(array, invalidIndex);
            System.out.println("This line will not execute due to ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 4: Confusing preconditions with input validation
        System.out.println("ERROR 4: Confusing preconditions with input validation");
        System.out.println("Preconditions are not the same as input validation:");
        System.out.println("- Preconditions: conditions that must be true for correct operation");
        System.out.println("- Input validation: checking and handling invalid inputs");
        
        try {
            int age = -5;
            System.out.println("Calling calculateRetirementAge(" + age + ")");
            int retirementAge = calculateRetirementAge(age);
            System.out.println("Result: " + retirementAge + " (This is logically incorrect)");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 5: Not checking preconditions before calling methods
        System.out.println("ERROR 5: Not checking preconditions before calling methods");
        System.out.println("It is the caller's responsibility to ensure preconditions are met:");
        
        try {
            int[] emptyArray = {};
            int index = 0;
            System.out.println("Calling getElement with an empty array");
            // We should check if the array is not empty before calling
            // if (emptyArray.length > 0) { ... }
            int value = getElement(emptyArray, index);
            System.out.println("This line will not execute due to ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("The caller should have checked the precondition!");
        }
        
        System.out.println("\nKey points about precondition errors:");
        System.out.println("- Violating preconditions leads to undefined behavior or exceptions");
        System.out.println("- Methods are not expected to check preconditions");
        System.out.println("- Preconditions must be clearly documented");
        System.out.println("- It is the caller's responsibility to ensure preconditions are met");
        System.out.println("- Preconditions are different from input validation");
    }
    
    /**
     * Calculates the square root of a number.
     * 
     * Precondition: number >= 0
     * 
     * @param number the number to find the square root of
     * @return the square root of the number
     */
    public static double squareRoot(double number) {
        // This method does not check the precondition
        return Math.sqrt(number);
    }
    
    /**
     * Divides two integers.
     * 
     * Precondition: divisor != 0
     * 
     * @param numerator the number to be divided
     * @param divisor the number to divide by
     * @return the result of the division
     */
    public static int divide(int numerator, int divisor) {
        // This method does not check the precondition
        return numerator / divisor;
    }
    
    /**
     * Gets an element from an array at the specified index.
     * 
     * Precondition: 0 <= index < array.length
     * 
     * @param array the array to access
     * @param index the index of the element to retrieve
     * @return the element at the specified index
     */
    public static int getElement(int[] array, int index) {
        // This method does not check the precondition
        return array[index];
    }
    
    // This method has an undocumented precondition
    public static int getElementUndocumented(int[] array, int index) {
        // The precondition (0 <= index < array.length) is not documented
        return array[index];
    }
    
    /**
     * Calculates the retirement age based on current age.
     * 
     * Precondition: age > 0
     * 
     * @param age the current age
     * @return the retirement age
     */
    public static int calculateRetirementAge(int age) {
        // This method does not check the precondition
        return age + 65 - age;
    }
}
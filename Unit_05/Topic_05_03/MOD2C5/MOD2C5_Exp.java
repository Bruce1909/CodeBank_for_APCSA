/**
 * MOD2C5_Exp.java
 * This program demonstrates how programmers write method code to satisfy
 * postconditions when preconditions are met (MOD-2.C.5).
 * 
 * @author AP CSA
 */
public class MOD2C5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how to satisfy postconditions when preconditions are met:\n");
        
        // Example 1: Square root method
        System.out.println("Example 1: Square root method");
        System.out.println("Precondition: number >= 0");
        System.out.println("Postcondition: result * result is approximately equal to the input");
        
        double number = 16.0;
        System.out.println("Input: " + number);
        double sqrtResult = calculateSquareRoot(number);
        System.out.println("Square root: " + sqrtResult);
        System.out.println("Verification: " + sqrtResult + "² = " + (sqrtResult * sqrtResult));
        System.out.println("The postcondition is satisfied when the precondition is met\n");
        
        // Example 2: Array search method
        System.out.println("Example 2: Array search method");
        System.out.println("Precondition: array is not null and contains at least one element");
        System.out.println("Postcondition: returns index of target if found, or -1 if not found");
        
        int[] array = {10, 25, 30, 45, 50};
        int target1 = 30;
        int target2 = 42;
        
        System.out.println("Array: " + arrayToString(array));
        System.out.println("Searching for " + target1);
        int index1 = findElement(array, target1);
        System.out.println("Result: " + index1 + " (Element found at this index)");
        
        System.out.println("Searching for " + target2);
        int index2 = findElement(array, target2);
        System.out.println("Result: " + index2 + " (Element not found)");
        System.out.println("The postcondition is satisfied in both cases\n");
        
        // Example 3: String trimming method
        System.out.println("Example 3: String trimming method");
        System.out.println("Precondition: input string is not null");
        System.out.println("Postcondition: returned string has no leading/trailing spaces and length <= maxLength");
        
        String text = "  Hello, World!   ";
        int maxLength = 10;
        
        System.out.println("Original string: \"" + text + "\"");
        System.out.println("Max length: " + maxLength);
        String trimmed = trimAndLimit(text, maxLength);
        System.out.println("Result: \"" + trimmed + "\"");
        System.out.println("Length: " + trimmed.length() + " (≤ " + maxLength + ")");
        System.out.println("The postcondition is satisfied when the precondition is met\n");
        
        System.out.println("Key points about satisfying postconditions:");
        System.out.println("- Method implementation must ensure postconditions are met");
        System.out.println("- The code should handle all possible valid inputs (that meet preconditions)");
        System.out.println("- Postconditions serve as a contract that the method must fulfill");
        System.out.println("- Well-designed methods have clear preconditions and postconditions");
        System.out.println("- Testing should verify that postconditions are met for all valid inputs");
    }
    
    /**
     * Calculates the square root of a number.
     * 
     * Precondition: number >= 0
     * Postcondition: result * result is approximately equal to the input number
     * 
     * @param number the number to find the square root of
     * @return the square root of the number
     */
    public static double calculateSquareRoot(double number) {
        // This implementation satisfies the postcondition when the precondition is met
        // We use the built-in Math.sqrt method which is designed to satisfy this postcondition
        return Math.sqrt(number);
    }
    
    /**
     * Finds the index of an element in an array.
     * 
     * Precondition: array is not null and contains at least one element
     * Postcondition: returns the index of the target if found, or -1 if not found
     * 
     * @param array the array to search in
     * @param target the element to search for
     * @return the index of the target if found, or -1 if not found
     */
    public static int findElement(int[] array, int target) {
        // This implementation satisfies the postcondition when the precondition is met
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Found the target, return its index
            }
        }
        return -1; // Target not found, return -1 as specified in the postcondition
    }
    
    /**
     * Trims leading and trailing spaces from a string and limits its length.
     * 
     * Precondition: text is not null
     * Postcondition: returned string has no leading/trailing spaces and length <= maxLength
     * 
     * @param text the string to process
     * @param maxLength the maximum length of the result
     * @return the trimmed and length-limited string
     */
    public static String trimAndLimit(String text, int maxLength) {
        // First, trim leading and trailing spaces
        String trimmed = text.trim();
        
        // Then, ensure the length is within the limit
        if (trimmed.length() <= maxLength) {
            return trimmed;
        } else {
            return trimmed.substring(0, maxLength);
        }
        // This implementation satisfies both parts of the postcondition
    }
    
    /**
     * Converts an array to a string representation.
     * 
     * @param array the array to convert
     * @return a string representation of the array
     */
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
/**
 * VAR1C4_Err - Final Variables Error Demonstration
 * 
 * This program demonstrates common errors and misconceptions about final variables
 * as specified in VAR-1.C.4.
 */
public class VAR1C4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Final Variables:\n");
        
        // ERROR 1: Attempting to change a final variable after initialization
        System.out.println("ERROR 1: Attempting to change a final variable after initialization");
        
        try {
            final int MAX_SCORE = 100;
            System.out.println("Initial MAX_SCORE: " + MAX_SCORE);
            
            // Uncommenting the next line would cause a compilation error
            // MAX_SCORE = 95; // Error: cannot assign a value to final variable MAX_SCORE
            System.out.println("Attempting to change MAX_SCORE would cause a compilation error");
            System.out.println("This is because final variables cannot be changed once initialized");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 2: Not initializing a final variable
        System.out.println("ERROR 2: Not initializing a final variable");
        
        try {
            // Uncommenting the following code would cause a compilation error
            // final double PI;
            // System.out.println("PI: " + PI); // Error: variable PI might not have been initialized
            System.out.println("Declaring a final variable without initializing it and then using it");
            System.out.println("would cause a compilation error");
            System.out.println("Final variables must be initialized before they are used");
            
            // This is allowed - declaring and then initializing (but only once)
            final double PI;
            PI = 3.14159; // This is valid because it's the first initialization
            System.out.println("Correct approach: PI = " + PI);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 3: Multiple initialization attempts
        System.out.println("ERROR 3: Multiple initialization attempts");
        
        try {
            final boolean DEBUG_MODE;
            DEBUG_MODE = true; // First initialization is allowed
            System.out.println("DEBUG_MODE (first initialization): " + DEBUG_MODE);
            
            // Uncommenting the next line would cause a compilation error
            // DEBUG_MODE = false; // Error: cannot assign a value to final variable DEBUG_MODE
            System.out.println("Attempting to initialize DEBUG_MODE again would cause a compilation error");
            System.out.println("Final variables can only be initialized once");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 4: Misconception about final reference variables
        System.out.println("ERROR 4: Misconception about final reference variables");
        
        try {
            // For reference types, final means the reference cannot change,
            // but the object's contents can still be modified
            final int[] scores = {90, 85, 95};
            
            System.out.println("Initial scores array: " + scores[0] + ", " + scores[1] + ", " + scores[2]);
            
            // This is allowed - modifying the contents of the array
            scores[0] = 92;
            System.out.println("After modifying first element: " + scores[0] + ", " + scores[1] + ", " + scores[2]);
            System.out.println("This is allowed because we're changing the array's contents, not the reference");
            
            // Uncommenting the next line would cause a compilation error
            // scores = new int[]{100, 100, 100}; // Error: cannot assign a value to final variable scores
            System.out.println("However, attempting to assign a new array to scores would cause an error");
            System.out.println("because that would change the reference, which is final");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Final Variable Errors ---");
        System.out.println("1. Final variables cannot be changed after initialization");
        System.out.println("2. Final variables must be initialized before they are used");
        System.out.println("3. Final variables can only be initialized once");
        System.out.println("4. For reference types, final prevents changing the reference, not the object's contents");
        System.out.println("5. Final is different from const in some other languages (like C++)");
    }
}
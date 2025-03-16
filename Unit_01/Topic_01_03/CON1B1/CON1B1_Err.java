/**
 * CON1B1_Err.java
 * 
 * This program demonstrates common errors related to the assignment operator in Java.
 * Knowledge Point: CON-1.B.1 - The assignment operator (=) allows a program to initialize 
 * or change the value stored in a variable. The value of the expression on the right 
 * is stored in the variable on the left.
 */
public class CON1B1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with the Assignment Operator (=):\n");
        
        // Example 1: Using assignment operator (=) instead of equality operator (==) in conditions
        System.out.println("Example 1: Using assignment (=) instead of equality (==) in conditions");
        
        int x = 10;
        
        // Error 1: Using = instead of == in if condition
        // if (x = 5) {  // This assigns 5 to x and then evaluates to true (non-zero)
        //     System.out.println("This will always execute if x becomes non-zero");
        // }
        System.out.println("Error 1: if (x = 5) - Uses assignment instead of equality check");
        System.out.println("Correct: if (x == 5) - Uses equality operator for comparison");
        System.out.println();
        
        // Example 2: Attempting to assign to a value (not a variable)
        System.out.println("Example 2: Attempting to assign to a value (not a variable)");
        
        // Error 2: Assigning to a literal or expression result
        // 10 = x;  // Error: Left side of assignment must be a variable
        // (x + 5) = 20;  // Error: Left side of assignment must be a variable
        
        System.out.println("Error 2: 10 = x; - Cannot assign to a literal");
        System.out.println("Error 3: (x + 5) = 20; - Cannot assign to an expression");
        System.out.println("Correct: x = 10; - Variable on left, value on right");
        System.out.println();
        
        // Example 3: Type mismatch in assignment
        System.out.println("Example 3: Type mismatch in assignment");
        
        // Error 4: Assigning incompatible types without casting
        // int intValue = 3.14;  // Error: Possible loss of precision
        // char charValue = "A";  // Error: String cannot be converted to char
        // boolean boolValue = 1;  // Error: int cannot be converted to boolean
        
        System.out.println("Error 4: int intValue = 3.14; - Possible loss of precision");
        System.out.println("Error 5: char charValue = \"A\"; - String cannot be converted to char");
        System.out.println("Error 6: boolean boolValue = 1; - int cannot be converted to boolean");
        System.out.println("Correct: int intValue = (int)3.14; - Explicit cast for precision loss");
        System.out.println();
        
        // Example 4: Uninitialized variables
        System.out.println("Example 4: Uninitialized variables");
        
        // Error 7: Using uninitialized variables
        int uninitializedVar;  // Declared but not initialized
        // System.out.println("Value: " + uninitializedVar);  // Error: Variable might not have been initialized
        
        System.out.println("Error 7: Using uninitializedVar without assignment");
        System.out.println("Correct: Assign a value before using the variable");
        System.out.println();
        
        // Example 5: Assignment to final variables
        System.out.println("Example 5: Assignment to final variables");
        
        final int CONSTANT = 100;  // Final variable (constant)
        // CONSTANT = 200;  // Error: Cannot assign a value to final variable
        
        System.out.println("Error 8: CONSTANT = 200; - Cannot assign to final variable");
        System.out.println("Correct: Final variables can only be assigned once at initialization");
        System.out.println();
        
        // Example 6: Missing assignment operator
        System.out.println("Example 6: Missing assignment operator");
        
        int a, b;  // Declare multiple variables
        // a, b = 5;  // Error: Cannot use comma to assign multiple variables
        
        System.out.println("Error 9: a, b = 5; - Cannot use comma to assign multiple variables");
        System.out.println("Correct: a = b = 5; - Use chained assignment");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Assignment Operator Errors ---");
        System.out.println("1. Don't confuse assignment operator (=) with equality operator (==)");
        System.out.println("2. The left side of an assignment must be a variable, not a value or expression");
        System.out.println("3. Type compatibility is required for assignment, or explicit casting is needed");
        System.out.println("4. Variables must be initialized before use");
        System.out.println("5. Final variables cannot be reassigned after initialization");
        System.out.println("6. Each variable needs its own assignment operator");
    }
}
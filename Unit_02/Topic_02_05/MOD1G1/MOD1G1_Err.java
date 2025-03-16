/**
 * MOD1G1_Err.java
 * 
 * This program demonstrates common errors when calling non-static non-void methods
 * and handling their return values.
 * 
 * Knowledge Point: MOD-1.G.1
 * Non-void methods return a value that is the same type as the return type in the signature.
 * To use the return value when calling a non-void method, it must be stored in a variable
 * or used as part of an expression.
 */
public class MOD1G1_Err {
    public static void main(String[] args) {
        // Create an instance of the class to call non-static methods
        MOD1G1_Err demo = new MOD1G1_Err();
        
        System.out.println("Demonstrating common errors with non-static non-void methods:\n");
        
        // ERROR 1: Not using the return value at all
        System.out.println("ERROR 1: Not using the return value");
        System.out.println("The following line calls a method but ignores its return value:");
        demo.calculateSum(5, 10); // Return value is ignored
        System.out.println("The sum was calculated but not used or displayed");
        System.out.println();
        
        // ERROR 2: Trying to use a void method's "return value"
        System.out.println("ERROR 2: Trying to use a void method's \"return value\"");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // int result = demo.displayMessage("Hello"); // Error: void cannot be converted to int
        System.out.println();
        
        // ERROR 3: Assigning return value to incompatible type
        System.out.println("ERROR 3: Assigning return value to incompatible type");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // boolean isValid = demo.calculateSum(10, 20); // Error: int cannot be converted to boolean
        System.out.println();
        
        // ERROR 4: Using return value without proper type conversion
        System.out.println("ERROR 4: Using return value without proper type conversion");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // char firstChar = demo.getCount(); // Error: int cannot be converted to char without explicit cast
        System.out.println();
        
        // ERROR 5: Forgetting to store or use the return value when needed
        System.out.println("ERROR 5: Forgetting to store or use the return value when needed");
        System.out.println("The following code doesn't store the result for later use:");
        if (demo.isPositive(42)) {
            System.out.println("The number is positive");
        }
        // Oops, we can't use the result here because we didn't store it
        // System.out.println("The result of the check was: " + result); // result is not defined
        System.out.println();
        
        // ERROR 6: Calling a non-static method statically
        System.out.println("ERROR 6: Calling a non-static method statically");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // int staticResult = MOD1G1_Err.calculateSum(5, 5); // Error: non-static method cannot be referenced from a static context
        System.out.println();
        
        // ERROR 7: Confusing return type with parameter type
        System.out.println("ERROR 7: Confusing return type with parameter type");
        System.out.println("The following method returns a String but takes an int parameter:");
        String message = demo.convertToMessage(42);
        System.out.println("Message: " + message);
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // int backToNumber = demo.convertToMessage(42); // Error: String cannot be converted to int
        System.out.println();
        
        // ERROR 8: Not handling potential null return values
        System.out.println("ERROR 8: Not handling potential null return values");
        System.out.println("The following code might cause a NullPointerException:");
        String nullableResult = demo.getMaybeNull(true);
        // Uncommenting the following line could cause a NullPointerException if nullableResult is null
        // System.out.println("Length: " + nullableResult.length());
        // Correct approach would be to check for null first
        if (nullableResult != null) {
            System.out.println("Length: " + nullableResult.length());
        } else {
            System.out.println("Result was null");
        }
        System.out.println();
        
        // ERROR 9: Misunderstanding method chaining
        System.out.println("ERROR 9: Misunderstanding method chaining");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // int chainResult = demo.calculateSum(5, 5).multiplyBy(2); // Error: int has no method multiplyBy
        System.out.println();
        
        // ERROR 10: Forgetting that primitive return values are copies
        System.out.println("ERROR 10: Forgetting that primitive return values are copies");
        int x = 10;
        System.out.println("Original x: " + x);
        demo.increment(x); // This doesn't modify x because the return value is ignored
        System.out.println("After calling increment(x) without using return value: " + x);
        // Correct way to use the method
        x = demo.increment(x); // Assign the return value back to x
        System.out.println("After x = increment(x): " + x);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Common Errors with Non-Void Methods ---");
        System.out.println("1. Always use the return value of a non-void method when needed");
        System.out.println("2. Void methods don't return values and can't be used in assignments");
        System.out.println("3. The variable type must match the method's return type (or be compatible)");
        System.out.println("4. Non-static methods must be called on an instance of the class");
        System.out.println("5. Return type is different from parameter types");
        System.out.println("6. Always check for null when a method might return null");
        System.out.println("7. Primitive return values are copies and don't modify the original variables");
    }
    
    // Non-void method that returns the sum of two numbers
    public int calculateSum(int a, int b) {
        return a + b;
    }
    
    // Void method that doesn't return a value
    public void displayMessage(String message) {
        System.out.println("Message: " + message);
        // No return statement needed for void methods
    }
    
    // Method that returns a count
    public int getCount() {
        return 42;
    }
    
    // Method that returns a boolean
    public boolean isPositive(int number) {
        return number > 0;
    }
    
    // Method that converts an int to a String message
    public String convertToMessage(int number) {
        return "The number is: " + number;
    }
    
    // Method that might return null
    public String getMaybeNull(boolean returnNull) {
        if (returnNull) {
            return null;
        } else {
            return "Not null";
        }
    }
    
    // Method that increments a number and returns the new value
    public int increment(int number) {
        return number + 1;
    }
}
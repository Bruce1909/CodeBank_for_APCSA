/**
 * MOD2E1_Err.java
 * This program demonstrates common errors when using void methods (MOD-2.E.1).
 * 
 * @author AP CSA
 */
public class MOD2E1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with void methods:\n");
        
        // Error 1: Trying to return a value from a void method
        System.out.println("Error 1: Trying to return a value from a void method");
        System.out.println("The following code would cause a compilation error if uncommented:");
        System.out.println("// public void methodWithInvalidReturn() {");
        System.out.println("//     return 42; // ERROR: Cannot return a value from a void method");
        System.out.println("// }");
        System.out.println("Void methods must not return a value. Use 'return;' without a value to exit early.");
        System.out.println();
        
        // Error 2: Trying to use a void method call as a value
        System.out.println("Error 2: Trying to use a void method call as a value");
        ErrorDemonstrator demo = new ErrorDemonstrator();
        System.out.println("The following code would cause a compilation error if uncommented:");
        System.out.println("// int result = demo.printMessage(); // ERROR: void cannot be converted to int");
        System.out.println("// String text = demo.printMessage(); // ERROR: void cannot be converted to String");
        System.out.println("Void methods cannot be used in expressions that require a value.");
        System.out.println();
        
        // Error 3: Trying to assign a void method call to a variable
        System.out.println("Error 3: Trying to assign a void method call to a variable");
        System.out.println("The following code would cause a compilation error if uncommented:");
        System.out.println("// void result = demo.printMessage(); // ERROR: void is not a valid type for variables");
        System.out.println("'void' is not a data type that can be used for variables.");
        System.out.println();
        
        // Error 4: Forgetting that void methods don't return values
        System.out.println("Error 4: Forgetting that void methods don't return values");
        System.out.println("The following code would cause a compilation error if uncommented:");
        System.out.println("// if (demo.printMessage()) { // ERROR: void cannot be converted to boolean");
        System.out.println("//     System.out.println(\"This will never execute\");");
        System.out.println("// }");
        System.out.println("Void methods cannot be used in conditions or anywhere a value is expected.");
        System.out.println();
        
        // Error 5: Calling a void method incorrectly
        System.out.println("Error 5: Calling a void method incorrectly");
        try {
            System.out.println("Calling a void method with incorrect parameters:");
            // This will compile but throw an exception at runtime
            demo.printMessageWithParam(); // Missing required parameter
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Always provide the required parameters when calling a void method.");
        }
        System.out.println();
        
        // Error 6: Not understanding that void methods can modify object state
        System.out.println("Error 6: Not understanding that void methods can modify object state");
        Counter counter = new Counter();
        System.out.println("Initial count: " + counter.getCount());
        counter.increment(); // This void method changes the object's state
        System.out.println("Count after increment(): " + counter.getCount());
        System.out.println("Even though void methods don't return values, they can still modify object state.");
        System.out.println();
        
        // Error 7: Misunderstanding return in void methods
        System.out.println("Error 7: Misunderstanding return in void methods");
        System.out.println("Calling a void method with early return:");
        demo.methodWithEarlyReturn(15);
        System.out.println("Calling the same method with a different parameter:");
        demo.methodWithEarlyReturn(5);
        System.out.println("In void methods, 'return;' (without a value) can be used for early exit.");
        System.out.println();
        
        System.out.println("Key points about errors with void methods:");
        System.out.println("- Void methods cannot return values; use 'return;' without a value for early exit");
        System.out.println("- Void method calls cannot be used in expressions that require a value");
        System.out.println("- 'void' is not a data type for variables");
        System.out.println("- Void methods can still modify object state even though they don't return values");
        System.out.println("- Always provide the required parameters when calling void methods");
    }
}

/**
 * A class that demonstrates common errors with void methods.
 */
class ErrorDemonstrator {
    /**
     * A void method that prints a message.
     */
    public void printMessage() {
        System.out.println("This is a void method that doesn't return a value.");
    }
    
    /**
     * A void method that requires a parameter.
     * 
     * @param message the message to print
     */
    public void printMessageWithParam(String message) {
        System.out.println("Message: " + message);
    }
    
    /**
     * A void method with an early return statement.
     * 
     * @param value a value to check
     */
    public void methodWithEarlyReturn(int value) {
        System.out.println("Starting method with value: " + value);
        
        if (value > 10) {
            System.out.println("Value is greater than 10, returning early.");
            return; // Early exit from the method (no value is returned)
        }
        
        System.out.println("This line only executes if value <= 10.");
    }
    
    // The following method would cause a compilation error if uncommented
    /*
    public void methodWithInvalidReturn() {
        return 42; // ERROR: Cannot return a value from a void method
    }
    */
}

/**
 * A class with a counter that can be modified by void methods.
 */
class Counter {
    private int count = 0;
    
    /**
     * Gets the current count.
     * 
     * @return the current count
     */
    public int getCount() {
        return count;
    }
    
    /**
     * A void method that increments the count.
     * This method modifies the object's state but doesn't return a value.
     */
    public void increment() {
        count++;
    }
}
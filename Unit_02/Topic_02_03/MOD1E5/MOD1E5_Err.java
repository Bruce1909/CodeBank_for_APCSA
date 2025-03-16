/**
 * MOD1E5_Err.java
 * 
 * This program demonstrates common errors related to calling non-static methods through objects.
 * 
 * Knowledge Point: MOD-1.E.5
 * Non-static methods are called through objects of the class.
 */
public class MOD1E5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when calling non-static methods:\n");
        
        // ERROR 1: Trying to call a non-static method without an object
        System.out.println("ERROR 1: Trying to call a non-static method without an object");
        System.out.println("The following line would cause a compilation error:");
        // displayMessage();  // Error: non-static method displayMessage() cannot be referenced from a static context
        System.out.println("Non-static methods must be called through an object.\n");
        
        // Create an object to call non-static methods correctly
        MOD1E5_Err demo = new MOD1E5_Err();
        
        // ERROR 2: Trying to call a non-static method using the class name
        System.out.println("ERROR 2: Trying to call a non-static method using the class name");
        System.out.println("The following line would cause a compilation error:");
        // MOD1E5_Err.displayMessage();  // Error: non-static method displayMessage() cannot be referenced from a static context
        System.out.println("Class names can only be used to call static methods, not non-static methods.\n");
        
        // ERROR 3: Trying to call a method on a null object reference
        System.out.println("ERROR 3: Trying to call a method on a null object reference");
        System.out.println("The following code would cause a NullPointerException at runtime:");
        System.out.println("MOD1E5_Err nullDemo = null;");
        System.out.println("// nullDemo.displayMessage();  // NullPointerException");
        System.out.println("An object reference must point to an actual object to call methods.\n");
        
        // ERROR 4: Trying to call a method on an uninitialized object
        System.out.println("ERROR 4: Trying to call a method on an uninitialized object");
        System.out.println("The following code would cause a compilation error:");
        System.out.println("MOD1E5_Err uninitializedDemo;  // Only declared, not initialized");
        System.out.println("// uninitializedDemo.displayMessage();  // Error: variable uninitializedDemo might not have been initialized");
        System.out.println("An object variable must be initialized before calling methods on it.\n");
        
        // ERROR 5: Confusing static and non-static methods
        System.out.println("ERROR 5: Confusing static and non-static methods");
        System.out.println("The following demonstrates the difference:");
        
        // Correct way to call a static method
        staticMethod();  // Called directly, no object needed
        
        // Correct way to call a non-static method
        demo.displayMessage();  // Called through an object
        
        System.out.println("\nStatic methods belong to the class and are called directly.");
        System.out.println("Non-static methods belong to objects and must be called through objects.\n");
        
        // ERROR 6: Trying to call a method on an object of the wrong type
        System.out.println("ERROR 6: Trying to call a method on an object of the wrong type");
        Calculator calc = new Calculator();
        
        System.out.println("The following line would cause a compilation error:");
        // calc.displayMessage();  // Error: method displayMessage() not found in Calculator class
        System.out.println("The displayMessage() method doesn't exist in the Calculator class.\n");
    }
    
    // Non-static method - must be called through an object
    public void displayMessage() {
        System.out.println("This is a non-static method that must be called through an object.");
    }
    
    // Static method - can be called directly without an object
    public static void staticMethod() {
        System.out.println("This is a static method that can be called directly.");
    }
}

// Calculator class for demonstration
class Calculator {
    // This class doesn't have a displayMessage method
    public void add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
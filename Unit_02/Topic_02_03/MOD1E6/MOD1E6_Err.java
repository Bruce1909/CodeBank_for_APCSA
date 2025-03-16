/**
 * MOD1E6_Err.java
 * 
 * This program demonstrates common errors related to using the dot operator
 * with object names to call non-static methods.
 * 
 * Knowledge Point: MOD-1.E.6
 * The dot operator is used along with the object name to call non-static methods.
 */
public class MOD1E6_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with the dot operator:\n");
        
        // Create an object to use for demonstration
        MOD1E6_Err demo = new MOD1E6_Err();
        
        // ERROR 1: Forgetting to use the dot operator
        System.out.println("ERROR 1: Forgetting to use the dot operator");
        System.out.println("The following line would cause a compilation error:");
        // demo displayMessage();  // Error: ';' expected
        System.out.println("The correct syntax requires the dot operator: demo.displayMessage();\n");
        
        // ERROR 2: Using incorrect syntax with the dot operator
        System.out.println("ERROR 2: Using incorrect syntax with the dot operator");
        System.out.println("The following line would cause a compilation error:");
        // demo.displayMessage;  // Error: ';' expected
        System.out.println("Method calls require parentheses after the method name: demo.displayMessage();\n");
        
        // ERROR 3: Using the dot operator with a class name for non-static methods
        System.out.println("ERROR 3: Using the dot operator with a class name for non-static methods");
        System.out.println("The following line would cause a compilation error:");
        // MOD1E6_Err.displayMessage();  // Error: non-static method displayMessage() cannot be referenced from a static context
        System.out.println("The dot operator must be used with an object, not a class name, for non-static methods.\n");
        
        // ERROR 4: Using the dot operator with a null reference
        System.out.println("ERROR 4: Using the dot operator with a null reference");
        System.out.println("The following code would cause a NullPointerException at runtime:");
        System.out.println("MOD1E6_Err nullDemo = null;");
        System.out.println("// nullDemo.displayMessage();  // NullPointerException");
        System.out.println("The dot operator requires a non-null object reference.\n");
        
        // ERROR 5: Using the dot operator with an object of the wrong type
        System.out.println("ERROR 5: Using the dot operator with an object of the wrong type");
        Car myCar = new Car();
        System.out.println("The following line would cause a compilation error:");
        // myCar.displayMessage();  // Error: cannot find symbol method displayMessage()
        System.out.println("The method must exist in the class of the object.\n");
        
        // Demonstrate correct use of the dot operator
        System.out.println("Correct use of the dot operator:");
        demo.displayMessage();  // Correct: object.method()
        myCar.start();          // Correct: object.method()
    }
    
    // Non-static method to be called with the dot operator
    public void displayMessage() {
        System.out.println("This method was called correctly using the dot operator.");
    }
}

// Car class for demonstration
class Car {
    public void start() {
        System.out.println("The car is starting.");
    }
}
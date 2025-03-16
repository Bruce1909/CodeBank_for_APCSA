/**
 * MOD1F1_Err.java
 * 
 * This program demonstrates common errors related to method signatures with parameters.
 * 
 * Knowledge Point: MOD-1.F.1
 * A method signature for a method with parameters consists of the method name and the ordered list of parameter types.
 */
public class MOD1F1_Err {
    public static void main(String[] args) {
        // Create an instance of the class to call non-static methods
        MOD1F1_Err demo = new MOD1F1_Err();
        
        System.out.println("Demonstrating common errors with method signatures:\n");
        
        // ERROR 1: Attempting to call a method that doesn't exist
        System.out.println("ERROR 1: Attempting to call a method that doesn't exist");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // demo.nonExistentMethod(); // Error: method nonExistentMethod() does not exist
        System.out.println();
        
        // ERROR 2: Calling a method with incorrect number of parameters
        System.out.println("ERROR 2: Calling a method with incorrect number of parameters");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // demo.greet("Alice", "Smith"); // Error: method greet(String, String) does not exist
        System.out.println();
        
        // ERROR 3: Calling a method with incorrect parameter types
        System.out.println("ERROR 3: Calling a method with incorrect parameter types");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // demo.displayNumber("42"); // Error: incompatible types: String cannot be converted to int
        System.out.println();
        
        // ERROR 4: Confusing method signatures with the same number of parameters but different types
        System.out.println("ERROR 4: Confusing method signatures with the same number of parameters but different types");
        System.out.println("The following calls two different methods with different signatures:");
        demo.process("Hello", 42); // Calls process(String, int)
        demo.process(42, "Hello"); // Calls process(int, String) - different method
        System.out.println();
        
        // ERROR 5: Confusing return type as part of the method signature
        System.out.println("ERROR 5: Confusing return type as part of the method signature");
        System.out.println("Return type is NOT part of the method signature.");
        System.out.println("Uncommenting the following would cause a compilation error:");
        // int result = demo.getMessage(); // Error: incompatible types: String cannot be converted to int
        System.out.println();
        
        // ERROR 6: Confusing parameter names as part of the method signature
        System.out.println("ERROR 6: Confusing parameter names as part of the method signature");
        System.out.println("Parameter names are NOT part of the method signature.");
        System.out.println("The following calls the same method even though the parameter names in the definition are different:");
        demo.calculate(5, 3); // Calls calculate(int, int) regardless of parameter names
        System.out.println();
        
        // ERROR 7: Confusing access modifiers as part of the method signature
        System.out.println("ERROR 7: Confusing access modifiers as part of the method signature");
        System.out.println("Access modifiers (public, private, etc.) are NOT part of the method signature.");
        System.out.println();
        
        // Correct method calls for reference
        System.out.println("Correct method calls for reference:");
        demo.greet("Alice");
        demo.displayNumber(42);
        demo.calculate(10, 5);
    }
    
    // Method with one String parameter
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    // Method with one int parameter
    public void displayNumber(int num) {
        System.out.println("The number is: " + num);
    }
    
    // Two methods with the same name but different parameter types (method overloading)
    // This demonstrates that the parameter types and order are part of the signature
    public void process(String text, int number) {
        System.out.println("Processing text: " + text + " and number: " + number);
    }
    
    public void process(int number, String text) {
        System.out.println("Processing number: " + number + " and text: " + text);
    }
    
    // Method that returns a String
    // Return type is NOT part of the method signature
    public String getMessage() {
        return "This is a message";
    }
    
    // Method with parameters that have different names in the definition
    // Parameter names are NOT part of the method signature
    public void calculate(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    
    // Private method - access modifier is NOT part of the method signature
    private void privateMethod() {
        System.out.println("This is a private method");
    }
}
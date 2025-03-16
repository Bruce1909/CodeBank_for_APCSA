/**
 * VAR1G3_Exp - Method Parameters and Local Variables Scope Example
 * 
 * This program demonstrates VAR-1.G.3:
 * Formal parameters and variables declared in a method or constructor
 * can only be used within that method or constructor.
 */
public class VAR1G3_Exp {
    // Instance variables
    private int instanceVar = 10;
    private String message;
    
    // Constructor with parameters
    public VAR1G3_Exp(String initialMessage) {
        // Parameter 'initialMessage' is only accessible within this constructor
        message = initialMessage;
        
        // Local variable in constructor
        int constructorVar = 20;
        
        System.out.println("In constructor:");
        System.out.println("Parameter 'initialMessage' = " + initialMessage);
        System.out.println("Local variable 'constructorVar' = " + constructorVar);
        System.out.println("Instance variable 'message' set to: " + message);
    }
    
    // Method with parameters
    public void processData(int value, String text) {
        // Parameters 'value' and 'text' are only accessible within this method
        System.out.println("\nIn processData method:");
        System.out.println("Parameter 'value' = " + value);
        System.out.println("Parameter 'text' = " + text);
        
        // Local variable in method
        int result = value * 2;
        System.out.println("Local variable 'result' = " + result);
        
        // We can access instance variables
        instanceVar += value;
        System.out.println("Updated instanceVar = " + instanceVar);
    }
    
    // Another method to demonstrate parameter scope
    public void displayInfo() {
        System.out.println("\nIn displayInfo method:");
        System.out.println("Instance variable 'message' = " + message);
        System.out.println("Instance variable 'instanceVar' = " + instanceVar);
        
        // Uncommenting any of the lines below would cause compilation errors
        // System.out.println(value);        // Error: Cannot resolve symbol 'value'
        // System.out.println(text);         // Error: Cannot resolve symbol 'text'
        // System.out.println(result);       // Error: Cannot resolve symbol 'result'
        // System.out.println(initialMessage); // Error: Cannot resolve symbol 'initialMessage'
        // System.out.println(constructorVar); // Error: Cannot resolve symbol 'constructorVar'
    }
    
    // Method demonstrating nested method calls and parameter passing
    public void methodA(int x) {
        System.out.println("\nIn methodA with parameter x = " + x);
        
        // Local variable
        int y = x + 5;
        System.out.println("Local variable y = " + y);
        
        // Call another method with different parameters
        methodB(y, "Passed from methodA");
        
        // After methodB returns, we continue in methodA
        System.out.println("Back in methodA, y = " + y);
    }
    
    // Helper method called by methodA
    private void methodB(int num, String str) {
        System.out.println("In methodB with parameters:");
        System.out.println("num = " + num);
        System.out.println("str = " + str);
        
        // Local variable in methodB
        int z = num * 2;
        System.out.println("Local variable z = " + z);
        
        // We cannot access variables from methodA
        // System.out.println(y); // Error: Cannot resolve symbol 'y'
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.G.3: Method Parameters and Local Variables Scope\n");
        
        // Create an instance of the class
        VAR1G3_Exp example = new VAR1G3_Exp("Hello World");
        
        // Call methods to demonstrate parameter and variable scope
        example.processData(5, "Test");
        example.displayInfo();
        example.methodA(10);
        
        // Summary
        System.out.println("\n--- Key Points about Parameter and Local Variable Scope ---");
        System.out.println("1. Parameters and local variables are only accessible within their declaring method/constructor");
        System.out.println("2. Each method has its own set of parameters and local variables");
        System.out.println("3. When a method calls another method, each maintains its own variable scope");
        System.out.println("4. Instance variables are accessible from any method in the class");
        System.out.println("5. Parameters can be used to pass data between methods");
    }
}
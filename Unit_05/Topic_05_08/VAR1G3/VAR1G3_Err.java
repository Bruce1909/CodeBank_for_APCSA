/**
 * VAR1G3_Err - Method Parameters and Local Variables Scope Error Examples
 * 
 * This program demonstrates common errors related to VAR-1.G.3:
 * Attempting to access formal parameters and local variables outside
 * their declaring method or constructor.
 */
public class VAR1G3_Err {
    // Instance variables
    private int instanceVar = 10;
    private String message;
    
    // ERROR 1: Attempting to access constructor parameters as instance variables
    public VAR1G3_Err(String initialMessage) {
        message = initialMessage;
        
        // Local variable in constructor
        int constructorVar = 20;
        
        System.out.println("\nERROR 1: Attempting to access constructor parameters as instance variables");
        System.out.println("In constructor:");
        System.out.println("Parameter 'initialMessage' = " + initialMessage);
        System.out.println("Local variable 'constructorVar' = " + constructorVar);
        
        // Common mistake: Thinking constructor parameters are automatically stored
        System.out.println("Common mistake: Assuming constructor parameters are stored automatically");
        System.out.println("To keep the parameter value, you must explicitly store it:");
        System.out.println("message = initialMessage;  // Correct way to store the parameter");
    }
    
    // ERROR 2: Attempting to access method parameters from another method
    public void method1(int param1, String param2) {
        System.out.println("\nERROR 2: Attempting to access method parameters from another method");
        System.out.println("In method1:");
        System.out.println("param1 = " + param1);
        System.out.println("param2 = " + param2);
        
        // Local variable
        int localVar = param1 * 2;
        System.out.println("localVar = " + localVar);
    }
    
    public void method2() {
        System.out.println("\nIn method2:");
        System.out.println("Attempting to access method1's parameters and local variable:");
        
        // ERROR: Cannot access parameters from method1
        System.out.println("// param1 = " + "Error: Cannot resolve symbol 'param1'");
        System.out.println("// param2 = " + "Error: Cannot resolve symbol 'param2'");
        System.out.println("// localVar = " + "Error: Cannot resolve symbol 'localVar'");
    }
    
    // ERROR 3: Attempting to access local variables outside their block scope
    public void blockScopeError() {
        System.out.println("\nERROR 3: Attempting to access local variables outside their block scope");
        
        if (instanceVar > 0) {
            int blockVar = 30;
            System.out.println("Inside if block:");
            System.out.println("blockVar = " + blockVar);
        }
        
        // ERROR: Cannot access blockVar outside if block
        System.out.println("\nOutside if block:");
        System.out.println("// blockVar = " + "Error: Cannot resolve symbol 'blockVar'");
    }
    
    // ERROR 4: Attempting to access method parameters in a nested class
    public void methodWithInnerClass(final int param) {
        System.out.println("\nERROR 4: Attempting to access method parameters in a nested class");
        
        class LocalClass {
            public void innerMethod() {
                // Can only access final or effectively final parameters
                System.out.println("In inner class:");
                System.out.println("Can access param because it's final: " + param);
                
                // ERROR: Cannot modify param even though we can access it
                System.out.println("// param++; // Error: Cannot modify parameter");
            }
        }
        
        new LocalClass().innerMethod();
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.G.3 Errors: Parameter and Local Variable Scope");
        
        // Create an instance of the class
        VAR1G3_Err example = new VAR1G3_Err("Test Message");
        
        // Call methods to demonstrate scope errors
        example.method1(100, "Hello");
        example.method2();
        example.blockScopeError();
        example.methodWithInnerClass(50);
        
        // Summary
        System.out.println("\n--- Common Errors with Parameter and Local Variable Scope ---");
        System.out.println("1. Attempting to access constructor parameters outside the constructor");
        System.out.println("2. Trying to access method parameters from other methods");
        System.out.println("3. Attempting to use local variables outside their block scope");
        System.out.println("4. Modifying parameters accessed from inner classes");
        System.out.println("5. Forgetting that each method has its own separate scope");
    }
}
/**
 * VAR1G1_Exp - Local Variables Example
 * 
 * This program demonstrates VAR-1.G.1:
 * Local variables can be declared in the body of constructors and methods.
 * These variables may only be used within the constructor or method and
 * cannot be declared to be public or private.
 */
public class VAR1G1_Exp {
    // Instance variables (class level)
    private int instanceVar = 10;
    
    // Constructor with local variables
    public VAR1G1_Exp() {
        // Local variable in constructor
        int constructorVar = 20;
        
        System.out.println("In constructor:");
        System.out.println("instanceVar = " + instanceVar);
        System.out.println("constructorVar = " + constructorVar);
        
        // We can modify the instance variable
        instanceVar = 15;
        System.out.println("Modified instanceVar = " + instanceVar);
        
        // constructorVar is only accessible within this constructor
    }
    
    // Method with local variables
    public void demonstrateLocalVariables() {
        // Local variable in method
        int methodVar = 30;
        
        System.out.println("\nIn demonstrateLocalVariables method:");
        System.out.println("instanceVar = " + instanceVar);
        System.out.println("methodVar = " + methodVar);
        
        // Local variables can be modified within their scope
        methodVar = 35;
        System.out.println("Modified methodVar = " + methodVar);
        
        // Local variables with limited scope
        if (methodVar > 30) {
            // This variable is only accessible within this if block
            int blockVar = 40;
            System.out.println("blockVar = " + blockVar);
        }
        
        // Uncommenting the line below would cause a compilation error
        // System.out.println(blockVar); // Error: blockVar is out of scope
        
        // Uncommenting the line below would cause a compilation error
        // System.out.println(constructorVar); // Error: constructorVar is not accessible here
    }
    
    // Method demonstrating method parameters as local variables
    public void demonstrateParameters(int param1, String param2) {
        System.out.println("\nIn demonstrateParameters method:");
        System.out.println("param1 = " + param1);
        System.out.println("param2 = " + param2);
        
        // Parameters are local variables and can be modified
        param1 = 100;
        System.out.println("Modified param1 = " + param1);
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.G.1: Local Variables\n");
        
        // Create an instance of the class
        VAR1G1_Exp example = new VAR1G1_Exp();
        
        // Call methods to demonstrate local variables
        example.demonstrateLocalVariables();
        example.demonstrateParameters(50, "Hello");
        
        // Summary
        System.out.println("\n--- Key Points about Local Variables ---");
        System.out.println("1. Local variables are declared within constructors and methods");
        System.out.println("2. Local variables can only be used within their scope");
        System.out.println("3. Local variables cannot be declared as public or private");
        System.out.println("4. Method parameters are treated as local variables");
        System.out.println("5. Local variables in nested blocks have limited scope");
    }
}
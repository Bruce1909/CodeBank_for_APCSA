/**
 * VAR1G2_Exp - Variable Shadowing Example
 * 
 * This program demonstrates VAR-1.G.2:
 * When there is a local variable with the same name as an instance variable,
 * the variable name will refer to the local variable instead of the instance variable.
 * This concept is known as "variable shadowing".
 */
public class VAR1G2_Exp {
    // Instance variables
    private int value = 100;
    private String name = "Instance";
    private double price = 9.99;
    
    // Method demonstrating variable shadowing
    public void demonstrateShadowing() {
        System.out.println("Before shadowing:");
        System.out.println("Instance value = " + value);
        System.out.println("Instance name = " + name);
        System.out.println("Instance price = " + price);
        System.out.println();
        
        // Local variables with the same names as instance variables
        int value = 200;      // Shadows the instance variable 'value'
        String name = "Local"; // Shadows the instance variable 'name'
        double price = 19.99;  // Shadows the instance variable 'price'
        
        System.out.println("After declaring local variables with the same names:");
        System.out.println("Local value = " + value);       // Refers to local variable
        System.out.println("Local name = " + name);         // Refers to local variable
        System.out.println("Local price = " + price);       // Refers to local variable
        System.out.println();
        
        // Accessing instance variables using 'this' keyword
        System.out.println("Accessing instance variables using 'this' keyword:");
        System.out.println("this.value = " + this.value);   // Refers to instance variable
        System.out.println("this.name = " + this.name);     // Refers to instance variable
        System.out.println("this.price = " + this.price);   // Refers to instance variable
    }
    
    // Method demonstrating shadowing in method parameters
    public void parameterShadowing(int value, String name) {
        System.out.println("\nIn parameterShadowing method:");
        System.out.println("Parameter value = " + value);   // Refers to parameter
        System.out.println("Parameter name = " + name);     // Refers to parameter
        System.out.println("Instance value = " + this.value); // Refers to instance variable
        System.out.println("Instance name = " + this.name);   // Refers to instance variable
    }
    
    // Method demonstrating shadowing in nested blocks
    public void nestedShadowing() {
        int value = 300;  // Shadows instance variable
        
        System.out.println("\nIn nestedShadowing method:");
        System.out.println("Method-level value = " + value);  // 300
        
        // Block with its own shadowing
        {
            int value = 400;  // Shadows method-level variable
            System.out.println("Block-level value = " + value);  // 400
            System.out.println("Instance value = " + this.value);  // 100
        }
        
        // Back to method-level scope
        System.out.println("Method-level value again = " + value);  // 300
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.G.2: Variable Shadowing\n");
        
        // Create an instance of the class
        VAR1G2_Exp example = new VAR1G2_Exp();
        
        // Call methods to demonstrate variable shadowing
        example.demonstrateShadowing();
        example.parameterShadowing(500, "Parameter");
        example.nestedShadowing();
        
        // Summary
        System.out.println("\n--- Key Points about Variable Shadowing ---");
        System.out.println("1. When a local variable has the same name as an instance variable, the local variable takes precedence");
        System.out.println("2. Method parameters can shadow instance variables with the same name");
        System.out.println("3. Variables in nested blocks can shadow variables in outer blocks");
        System.out.println("4. Use the 'this' keyword to access shadowed instance variables");
        System.out.println("5. Shadowing can make code harder to read and maintain if used carelessly");
    }
}
/**
 * VAR1G2_Err - Variable Shadowing Error Examples
 * 
 * This program demonstrates common errors and confusions related to VAR-1.G.2:
 * When there is a local variable with the same name as an instance variable,
 * the variable name will refer to the local variable instead of the instance variable.
 */
public class VAR1G2_Err {
    // Instance variables
    private int value = 100;
    private String name = "Instance";
    
    // ERROR 1: Confusion with shadowing in constructors
    public VAR1G2_Err(int value, String name) {
        // These parameters shadow the instance variables
        System.out.println("\nERROR 1: Confusion with shadowing in constructors");
        System.out.println("Parameter value = " + value);  // 200 (parameter)
        System.out.println("Parameter name = " + name);    // "Parameter" (parameter)
        
        // Common mistake: Forgetting that parameters shadow instance variables
        // The following doesn't set instance variables as might be expected
        value = 300;  // This modifies the parameter, not the instance variable
        name = "Modified";  // This modifies the parameter, not the instance variable
        
        System.out.println("After modification:");
        System.out.println("Parameter value = " + value);  // 300 (modified parameter)
        System.out.println("Parameter name = " + name);    // "Modified" (modified parameter)
        System.out.println("Instance value = " + this.value);  // 100 (unchanged instance variable)
        System.out.println("Instance name = " + this.name);    // "Instance" (unchanged instance variable)
        
        // Correct way to set instance variables when parameters shadow them
        this.value = value;  // Now the instance variable is set to 300
        this.name = name;    // Now the instance variable is set to "Modified"
        
        System.out.println("\nAfter using 'this' keyword:");
        System.out.println("Instance value = " + this.value);  // 300
        System.out.println("Instance name = " + this.name);    // "Modified"
    }
    
    // ERROR 2: Unintended shadowing in methods
    public void unintendedShadowing() {
        System.out.println("\nERROR 2: Unintended shadowing in methods");
        System.out.println("Before method execution, instance value = " + value);  // 300
        
        // Unintentionally creating a local variable with the same name
        int value = 400;  // This creates a new local variable instead of modifying the instance variable
        
        System.out.println("Local value = " + value);  // 400 (local variable)
        System.out.println("Instance value = " + this.value);  // 300 (instance variable)
        
        // Modifying the local variable doesn't affect the instance variable
        value = 500;
        System.out.println("Modified local value = " + value);  // 500
        System.out.println("Instance value still = " + this.value);  // 300 (unchanged)
    }
    
    // ERROR 3: Confusion with shadowing in nested blocks
    public void nestedShadowingConfusion() {
        System.out.println("\nERROR 3: Confusion with shadowing in nested blocks");
        
        // Local variable shadows instance variable
        int value = 600;
        System.out.println("Method-level value = " + value);  // 600
        
        // Nested block with another local variable of the same name
        {
            // This shadows both the method-level variable and the instance variable
            int value = 700;
            System.out.println("Block-level value = " + value);  // 700
            
            // Common mistake: Confusion about which variable is being modified
            value = 800;  // This modifies the block-level variable only
            System.out.println("Modified block-level value = " + value);  // 800
        }
        
        // Outside the block, the method-level variable is still unchanged
        System.out.println("Method-level value after block = " + value);  // 600 (unchanged)
        System.out.println("Instance value = " + this.value);  // 300 (unchanged)
    }
    
    // ERROR 4: Shadowing causing bugs in calculations
    public int calculateTotal(int value) {
        // Parameter shadows instance variable
        System.out.println("\nERROR 4: Shadowing causing bugs in calculations");
        System.out.println("Parameter value = " + value);  // Parameter value
        System.out.println("Instance value = " + this.value);  // Instance value
        
        // Common mistake: Intending to use instance variable but using parameter instead
        int result = value * 2;  // Uses parameter, not instance variable
        System.out.println("result = value * 2 = " + result);  // Parameter * 2
        
        // If the intention was to use the instance variable:
        int correctResult = this.value * 2;  // Uses instance variable
        System.out.println("correctResult = this.value * 2 = " + correctResult);  // Instance value * 2
        
        return result;  // Returns calculation based on parameter
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.G.2 Errors: Variable Shadowing");
        
        // Create an instance of the class
        VAR1G2_Err example = new VAR1G2_Err(200, "Parameter");
        
        // Call methods to demonstrate shadowing errors
        example.unintendedShadowing();
        example.nestedShadowingConfusion();
        example.calculateTotal(1000);
        
        // Summary
        System.out.println("\n--- Common Errors with Variable Shadowing ---");
        System.out.println("1. Forgetting that constructor parameters shadow instance variables");
        System.out.println("2. Unintentionally creating local variables that shadow instance variables");
        System.out.println("3. Confusion about which variable is being accessed in nested blocks");
        System.out.println("4. Calculation bugs due to using shadowed variables instead of instance variables");
        System.out.println("5. Forgetting to use 'this' keyword when needed to access instance variables");
    }
}
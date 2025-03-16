/**
 * VAR1G1_Err - Local Variables Error Examples
 * 
 * This program demonstrates common errors related to VAR-1.G.1:
 * - Attempting to declare local variables as public or private
 * - Attempting to access local variables outside their scope
 * - Attempting to access constructor/method variables from other methods
 */
public class VAR1G1_Err {
    // Instance variable
    private int instanceVar = 10;
    
    public VAR1G1_Err() {
        // Local variable in constructor
        int constructorVar = 20;
        
        System.out.println("In constructor:");
        System.out.println("instanceVar = " + instanceVar);
        System.out.println("constructorVar = " + constructorVar);
        
        // ERROR 1: Cannot declare local variables as private or public
        // Uncommenting the line below would cause a compilation error
        // private int privateLocalVar = 30; // Error: Modifier 'private' not allowed here
        
        // ERROR 2: Cannot declare local variables as public
        // Uncommenting the line below would cause a compilation error
        // public int publicLocalVar = 40; // Error: Modifier 'public' not allowed here
        
        System.out.println("\nERROR 1 & 2: Cannot declare local variables as private or public");
        System.out.println("private int privateLocalVar = 30; // Error: Modifier 'private' not allowed here");
        System.out.println("public int publicLocalVar = 40; // Error: Modifier 'public' not allowed here");
    }
    
    public void method1() {
        // Local variable in method1
        int method1Var = 50;
        
        System.out.println("\nIn method1:");
        System.out.println("method1Var = " + method1Var);
        
        // ERROR 3: Cannot access constructor variables
        System.out.println("\nERROR 3: Cannot access constructor variables");
        System.out.println("System.out.println(constructorVar); // Error: Cannot resolve symbol 'constructorVar'");
        // Uncommenting the line below would cause a compilation error
        // System.out.println(constructorVar); // Error: Cannot resolve symbol 'constructorVar'
    }
    
    public void method2() {
        System.out.println("\nIn method2:");
        
        // ERROR 4: Cannot access variables from other methods
        System.out.println("\nERROR 4: Cannot access variables from other methods");
        System.out.println("System.out.println(method1Var); // Error: Cannot resolve symbol 'method1Var'");
        // Uncommenting the line below would cause a compilation error
        // System.out.println(method1Var); // Error: Cannot resolve symbol 'method1Var'
        
        // Local variable with block scope
        if (instanceVar > 5) {
            int blockVar = 60;
            System.out.println("blockVar inside if block = " + blockVar);
        }
        
        // ERROR 5: Cannot access block-scoped variables outside their block
        System.out.println("\nERROR 5: Cannot access block-scoped variables outside their block");
        System.out.println("System.out.println(blockVar); // Error: Cannot resolve symbol 'blockVar'");
        // Uncommenting the line below would cause a compilation error
        // System.out.println(blockVar); // Error: Cannot resolve symbol 'blockVar'
    }
    
    public void method3() {
        // ERROR 6: Variable shadowing - local variable with same name as instance variable
        int instanceVar = 70; // This shadows the instance variable
        
        System.out.println("\nIn method3:");
        System.out.println("ERROR 6: Variable shadowing");
        System.out.println("int instanceVar = 70; // This shadows the instance variable");
        System.out.println("Local instanceVar = " + instanceVar); // Refers to local variable (70)
        System.out.println("Instance instanceVar = " + this.instanceVar); // Refers to instance variable (10)
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.G.1 Errors: Local Variables\n");
        
        // Create an instance of the class
        VAR1G1_Err example = new VAR1G1_Err();
        
        // Call methods to demonstrate errors
        example.method1();
        example.method2();
        example.method3();
        
        // Summary
        System.out.println("\n--- Common Errors with Local Variables ---");
        System.out.println("1. Cannot declare local variables as public or private");
        System.out.println("2. Cannot access local variables outside their scope");
        System.out.println("3. Cannot access constructor variables from methods");
        System.out.println("4. Cannot access variables from other methods");
        System.out.println("5. Cannot access block-scoped variables outside their block");
        System.out.println("6. Local variables can shadow instance variables with the same name");
    }
}
/**
 * MOD-2.H.3 Example
 * 
 * This program demonstrates that static variables are used with the class name
 * and the dot operator, since they are associated with a class, not objects of a class.
 */
public class MOD2H3_Exp {
    
    // Static variables - belong to the class itself
    private static int counter = 0;
    public static String className = "MOD2H3_Exp";
    
    // Instance variable - belongs to objects of the class
    private String instanceName;
    
    /**
     * Constructor that initializes instance variables
     * 
     * @param name The name for this instance
     */
    public MOD2H3_Exp(String name) {
        this.instanceName = name;
        counter++; // Increment the static counter
    }
    
    /**
     * Demonstrate the proper way to access static variables
     */
    public static void demonstrateStaticAccess() {
        System.out.println("Proper way to access static variables:");
        
        // Access static variables using the class name and dot operator
        System.out.println("Using class name: MOD2H3_Exp.counter = " + MOD2H3_Exp.counter);
        System.out.println("Using class name: MOD2H3_Exp.className = " + MOD2H3_Exp.className);
        
        // Within the same class, you can also access static variables directly
        // without the class name (but using the class name is more explicit)
        System.out.println("\nWithin the same class, direct access: counter = " + counter);
        System.out.println("Within the same class, direct access: className = " + className);
    }
    
    /**
     * Get the instance name
     * 
     * @return The instance name
     */
    public String getInstanceName() {
        return instanceName;
    }
    
    /**
     * Get the counter value
     * 
     * @return The counter value
     */
    public static int getCounter() {
        return counter;
    }
    
    public static void main(String[] args) {
        // Demonstrate accessing static variables with the class name and dot operator
        System.out.println("Demonstrating static variable access:\n");
        
        // Access static variables before creating any instances
        System.out.println("Accessing static variables before creating instances:");
        System.out.println("MOD2H3_Exp.counter = " + MOD2H3_Exp.counter);
        System.out.println("MOD2H3_Exp.className = " + MOD2H3_Exp.className);
        
        // Call the static method that demonstrates static variable access
        System.out.println("\nCalling static method to demonstrate access:");
        MOD2H3_Exp.demonstrateStaticAccess();
        
        // Create instances
        MOD2H3_Exp instance1 = new MOD2H3_Exp("Instance 1");
        MOD2H3_Exp instance2 = new MOD2H3_Exp("Instance 2");
        
        // Access static variables after creating instances
        System.out.println("\nAccessing static variables after creating instances:");
        System.out.println("MOD2H3_Exp.counter = " + MOD2H3_Exp.counter);
        
        // You can also access static variables through instances,
        // but this is not recommended as it can be confusing
        System.out.println("\nAccessing static variables through instances (not recommended):");
        System.out.println("instance1.counter = " + instance1.getCounter());
        System.out.println("instance2.counter = " + instance2.getCounter());
        
        // Modify a static variable
        System.out.println("\nModifying a static variable:");
        MOD2H3_Exp.className = "Modified Class Name";
        
        // Show that the modification affects all access paths
        System.out.println("\nAfter modification, all access paths see the same value:");
        System.out.println("MOD2H3_Exp.className = " + MOD2H3_Exp.className);
        System.out.println("instance1.className = " + instance1.className);
        System.out.println("instance2.className = " + instance2.className);
        
        // Explain the concept
        System.out.println("\nExplanation:");
        System.out.println("Static variables are associated with the class, not with objects of the class.");
        System.out.println("Therefore, they should be accessed using the class name and the dot operator.");
        System.out.println("While it's possible to access them through instances, this is not recommended");
        System.out.println("as it can lead to confusion about whether the variable is static or instance-based.");
    }
}
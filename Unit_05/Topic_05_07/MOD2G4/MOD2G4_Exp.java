/**
 * MOD-2.G.4 Example
 * 
 * This program demonstrates that static methods can access or change
 * the values of static variables.
 */
public class MOD2G4_Exp {
    
    // Static variables - belong to the class itself, not to instances
    private static int counter = 0;
    private static String lastAction = "None";
    private static double totalAmount = 0.0;
    
    // Instance variable for comparison
    private String name;
    
    /**
     * Constructor that initializes the instance variable
     * and updates static variables
     * 
     * @param name The name
     */
    public MOD2G4_Exp(String name) {
        this.name = name;
        counter++; // Increment the static counter
        lastAction = "Created instance with name: " + name;
    }
    
    /**
     * A static method that accesses a static variable.
     * 
     * @return The current counter value
     */
    public static int getCounter() {
        return counter; // This works because counter is static
    }
    
    /**
     * A static method that changes a static variable.
     * 
     * @param amount The amount to add
     */
    public static void addToTotal(double amount) {
        totalAmount += amount; // This works because totalAmount is static
        lastAction = "Added " + amount + " to total";
    }
    
    /**
     * A static method that resets all static variables.
     */
    public static void resetStaticVariables() {
        counter = 0;
        lastAction = "Reset";
        totalAmount = 0.0;
        System.out.println("All static variables have been reset.");
    }
    
    /**
     * A static method that returns information about all static variables.
     * 
     * @return Information about the static state
     */
    public static String getStaticState() {
        return "Counter: " + counter + 
               "\nLast Action: " + lastAction + 
               "\nTotal Amount: " + totalAmount;
    }
    
    /**
     * An instance method that shows both instance and static variables.
     * 
     * @return Information about this instance and static state
     */
    public String getInstanceInfo() {
        return "Instance name: " + name + 
               "\n" + getStaticState(); // Can call static method from instance method
    }
    
    public static void main(String[] args) {
        // Demonstrate that static methods can access and modify static variables
        System.out.println("Initial static state:");
        System.out.println(getStaticState());
        
        // Modify static variables using static methods
        System.out.println("\nModifying static variables using static methods:");
        addToTotal(100.50);
        addToTotal(25.75);
        System.out.println(getStaticState());
        
        // Create some instances and show how they affect static variables
        System.out.println("\nCreating instances:");
        MOD2G4_Exp instance1 = new MOD2G4_Exp("First");
        System.out.println(getStaticState());
        
        MOD2G4_Exp instance2 = new MOD2G4_Exp("Second");
        System.out.println(getStaticState());
        
        // Show instance information which includes static state
        System.out.println("\nInstance information:");
        System.out.println(instance1.getInstanceInfo());
        
        // Reset static variables and show the effect
        System.out.println("\nResetting static variables:");
        resetStaticVariables();
        System.out.println(getStaticState());
        
        // Show that instances still exist but static variables are reset
        System.out.println("\nInstance information after reset:");
        System.out.println(instance1.getInstanceInfo());
        System.out.println(instance2.getInstanceInfo());
        
        // Explain the concept
        System.out.println("\nExplanation:");
        System.out.println("Static methods can access and modify static variables because");
        System.out.println("both belong to the class itself, not to any specific instance.");
        System.out.println("All instances share the same static variables, and changes made");
        System.out.println("by static methods are visible to all instances and other static methods.");
    }
}
/**
 * MOD-2.H.1 Example
 * 
 * This program demonstrates that static variables belong to the class,
 * with all objects of a class sharing a single static variable.
 */
public class MOD2H1_Exp {
    
    // Static variable - belongs to the class itself
    private static int instanceCount = 0;
    
    // Instance variables - belong to objects of the class
    private String name;
    private int id;
    
    /**
     * Constructor that initializes instance variables and increments the static counter
     * 
     * @param name The name for this instance
     */
    public MOD2H1_Exp(String name) {
        this.name = name;
        instanceCount++; // Increment the shared static variable
        this.id = instanceCount; // Assign the current count as this instance's ID
    }
    
    /**
     * Get the name of this instance
     * 
     * @return The name of this instance
     */
    public String getName() {
        return name;
    }
    
    /**
     * Get the ID of this instance
     * 
     * @return The ID of this instance
     */
    public int getId() {
        return id;
    }
    
    /**
     * Get the total number of instances created
     * 
     * @return The total number of instances created
     */
    public static int getInstanceCount() {
        return instanceCount;
    }
    
    public static void main(String[] args) {
        // Demonstrate that the static variable is shared among all instances
        System.out.println("Demonstrating that static variables are shared among all instances:\n");
        
        // Initial state - no instances created yet
        System.out.println("Initial instance count: " + MOD2H1_Exp.getInstanceCount());
        
        // Create first instance
        MOD2H1_Exp instance1 = new MOD2H1_Exp("First");
        System.out.println("\nCreated instance: " + instance1.getName());
        System.out.println("Instance ID: " + instance1.getId());
        System.out.println("Instance count after first creation: " + MOD2H1_Exp.getInstanceCount());
        
        // Create second instance
        MOD2H1_Exp instance2 = new MOD2H1_Exp("Second");
        System.out.println("\nCreated instance: " + instance2.getName());
        System.out.println("Instance ID: " + instance2.getId());
        System.out.println("Instance count after second creation: " + MOD2H1_Exp.getInstanceCount());
        
        // Create third instance
        MOD2H1_Exp instance3 = new MOD2H1_Exp("Third");
        System.out.println("\nCreated instance: " + instance3.getName());
        System.out.println("Instance ID: " + instance3.getId());
        System.out.println("Instance count after third creation: " + MOD2H1_Exp.getInstanceCount());
        
        // Show that all instances see the same value for the static variable
        System.out.println("\nDemonstrating that all instances see the same static variable value:");
        System.out.println("From instance1: " + instance1.getInstanceCount());
        System.out.println("From instance2: " + instance2.getInstanceCount());
        System.out.println("From instance3: " + instance3.getInstanceCount());
        System.out.println("From class: " + MOD2H1_Exp.getInstanceCount());
        System.out.println("All four calls return the same value because the static variable is shared!");
        
        // Explain the concept
        System.out.println("\nExplanation:");
        System.out.println("The 'instanceCount' variable is static, which means it belongs to the class,");
        System.out.println("not to individual instances. All instances share this single variable.");
        System.out.println("When we increment it in the constructor, all instances see the updated value.");
        System.out.println("This is why each instance gets a unique ID based on the order of creation.");
    }
}
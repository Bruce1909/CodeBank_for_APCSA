/**
 * MOD-2.H.3 Error Example
 * 
 * This program demonstrates common errors related to static variable access,
 * such as not using the class name to access static variables.
 */
public class MOD2H3_Err {
    
    // Static variables - belong to the class itself
    private static int counter = 0;
    public static String className = "MOD2H3_Err";
    
    // Instance variable - belongs to objects of the class
    private String instanceName;
    
    /**
     * Constructor that initializes instance variables
     * 
     * @param name The name for this instance
     */
    public MOD2H3_Err(String name) {
        this.instanceName = name;
        counter++; // Increment the static counter
    }
    
    /**
     * ERROR: This method incorrectly suggests that static variables belong to instances
     */
    public void incorrectStaticVariableDescription() {
        // Conceptual error in the comment below
        // System.out.println("This instance's counter value: " + counter);
        
        System.out.println("ERROR: Referring to a static variable as 'this instance\'s counter'");
        System.out.println("is conceptually incorrect. Static variables don't belong to instances;");
        System.out.println("they belong to the class itself.");
    }
    
    /**
     * ERROR: This method incorrectly suggests that each instance has its own copy of the static variable
     */
    public void incorrectStaticVariableModification() {
        System.out.println("ERROR: Thinking that modifying a static variable through an instance");
        System.out.println("only affects that instance is incorrect. Any modification to a static");
        System.out.println("variable affects all instances because there is only one copy of the");
        System.out.println("variable shared by the entire class.");
        
        // The following would modify the shared static variable, not just for this instance
        // counter = 100; // This would affect all instances, not just this one
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
        // Demonstrate errors with static variable access
        System.out.println("Demonstrating errors with static variable access:\n");
        
        // ERROR: Accessing static variables through instances (not recommended)
        System.out.println("ERROR: Accessing static variables through instances:");
        MOD2H3_Err instance1 = new MOD2H3_Err("Instance 1");
        System.out.println("instance1.className = " + instance1.className); // Not recommended
        System.out.println("This works but is misleading because it suggests that 'className'");
        System.out.println("belongs to the instance, when it actually belongs to the class.");
        
        // The correct way is to use the class name
        System.out.println("\nThe correct way is to use the class name:");
        System.out.println("MOD2H3_Err.className = " + MOD2H3_Err.className);
        
        // ERROR: Demonstrate the conceptual error of thinking static variables belong to instances
        System.out.println("\nDemonstrating conceptual errors with static variables:");
        instance1.incorrectStaticVariableDescription();
        
        // ERROR: Demonstrate the error of thinking static variable modifications are instance-specific
        System.out.println("\nDemonstrating errors with static variable modification:");
        instance1.incorrectStaticVariableModification();
        
        // Create another instance to show that static variables are shared
        MOD2H3_Err instance2 = new MOD2H3_Err("Instance 2");
        
        // Modify the static variable through the class name (correct way)
        System.out.println("\nModifying the static variable through the class name (correct way):");
        MOD2H3_Err.className = "Modified Class Name";
        
        // Show that the modification affects all access paths
        System.out.println("\nAfter modification, all access paths see the same value:");
        System.out.println("MOD2H3_Err.className = " + MOD2H3_Err.className); // Correct access
        System.out.println("instance1.className = " + instance1.className); // Not recommended
        System.out.println("instance2.className = " + instance2.className); // Not recommended
        
        // Explain the error conceptually
        System.out.println("\nConceptual explanation of the error:");
        System.out.println("The error is in how we think about and access static variables.");
        System.out.println("Static variables belong to the class, not to instances.");
        System.out.println("Therefore, they should be accessed using the class name and the dot operator.");
        System.out.println("While Java allows accessing static variables through instances,");
        System.out.println("this practice is discouraged because it can lead to confusion");
        System.out.println("about whether the variable is static or instance-based.");
    }
}
/**
 * MOD-2.H.1 Error Example
 * 
 * This program demonstrates common errors related to static variables,
 * such as misunderstanding that static variables are shared among all instances.
 */
public class MOD2H1_Err {
    
    // Static variable - belongs to the class itself
    private static int sharedCounter = 0;
    
    // Instance variables - belong to objects of the class
    private String name;
    private int id;
    
    /**
     * Constructor that initializes instance variables and attempts to work with the static variable
     * 
     * @param name The name for this instance
     * @param id The ID to assign (ERROR: trying to manually set IDs instead of using shared counter)
     */
    public MOD2H1_Err(String name, int id) {
        this.name = name;
        this.id = id; // ERROR: This attempts to assign a unique ID manually
                      // instead of using the shared counter
        sharedCounter++;
    }
    
    /**
     * ERROR: This method incorrectly attempts to reset the static variable
     * for a specific instance, not understanding that it affects all instances.
     */
    public void resetMyCounter() {
        // Uncommenting the next line would reset the counter for ALL instances
        // sharedCounter = 0;
        
        System.out.println("ERROR: Cannot reset the counter just for this instance.");
        System.out.println("The static variable 'sharedCounter' is shared among all instances.");
        System.out.println("Resetting it would affect all instances, not just this one.");
    }
    
    /**
     * ERROR: This method incorrectly assumes each instance has its own copy of the static variable
     * 
     * @return Would return a message if it could compile correctly
     */
    public String getIncorrectCounterInfo() {
        // The following comment shows a conceptual error in understanding static variables
        // return "This instance's counter value is: " + sharedCounter; // Conceptual error
        
        return "ERROR: The phrase 'this instance\'s counter value' is incorrect.\n" +
               "The static variable 'sharedCounter' doesn't belong to any instance.\n" +
               "It belongs to the class and is shared by all instances.";
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
     * Get the shared counter value
     * 
     * @return The shared counter value
     */
    public static int getSharedCounter() {
        return sharedCounter;
    }
    
    public static void main(String[] args) {
        // Demonstrate errors with static variables
        System.out.println("Demonstrating errors with static variables:\n");
        
        // Create instances with manually assigned IDs (conceptual error)
        MOD2H1_Err instance1 = new MOD2H1_Err("First", 101);
        MOD2H1_Err instance2 = new MOD2H1_Err("Second", 102);
        
        // Show the manually assigned IDs
        System.out.println("Instance 1 name: " + instance1.getName() + ", ID: " + instance1.getId());
        System.out.println("Instance 2 name: " + instance2.getName() + ", ID: " + instance2.getId());
        
        // Show that the shared counter is incremented for both instances
        System.out.println("\nShared counter value: " + MOD2H1_Err.getSharedCounter());
        System.out.println("Note that the counter equals 2, because we created 2 instances.");
        
        // Demonstrate the error of trying to reset the counter for one instance
        System.out.println("\nAttempting to reset counter for instance1 only:");
        instance1.resetMyCounter();
        
        // Demonstrate the error of thinking each instance has its own copy
        System.out.println("\nDemonstrating misconception about instance-specific counters:");
        System.out.println(instance1.getIncorrectCounterInfo());
        
        // Create a third instance to show the counter continues to increment
        MOD2H1_Err instance3 = new MOD2H1_Err("Third", 103);
        System.out.println("\nCreated a third instance.");
        System.out.println("Shared counter value: " + MOD2H1_Err.getSharedCounter());
        
        // Explain the error conceptually
        System.out.println("\nConceptual explanation of the error:");
        System.out.println("The error in this program is conceptual - it tries to treat");
        System.out.println("static variables as if they belong to individual instances.");
        System.out.println("In reality, static variables belong to the class itself and");
        System.out.println("are shared among all instances. Any change to a static variable");
        System.out.println("affects all instances of the class simultaneously.");
    }
}
/**
 * MOD-2.G.4 Error Example
 * 
 * This program demonstrates common errors related to static methods accessing
 * or changing static variables.
 */
public class MOD2G4_Err {
    
    // Static variables - belong to the class itself
    private static int counter = 0;
    private static String lastAction = "None";
    
    // Instance variable for comparison
    private String name;
    
    /**
     * Constructor that initializes the instance variable
     * 
     * @param name The name
     */
    public MOD2G4_Err(String name) {
        this.name = name;
        counter++; // Increment the static counter
    }
    
    /**
     * ERROR: This method incorrectly tries to hide a static variable with a local variable.
     * This can lead to confusion and bugs.
     */
    public static void shadowingStaticVariable() {
        // Local variable with the same name as the static variable
        int counter = 100; // This shadows the static counter variable
        
        System.out.println("Local counter: " + counter); // This refers to the local variable
        System.out.println("Static counter (using class name): " + MOD2G4_Err.counter); // This refers to the static variable
        
        System.out.println("ERROR: Shadowing static variables with local variables");
        System.out.println("can lead to confusion and bugs.");
    }
    
    /**
     * ERROR: This method incorrectly assumes that static variables are reset
     * when all instances are garbage collected.
     */
    public static void incorrectAssumptionAboutLifetime() {
        System.out.println("ERROR: Some programmers incorrectly assume that static variables");
        System.out.println("are reset when all instances of a class are garbage collected.");
        System.out.println("In reality, static variables exist for the entire duration of the program,");
        System.out.println("regardless of whether any instances exist.");
    }
    
    /**
     * ERROR: This method incorrectly tries to initialize a static variable
     * based on instance-specific information.
     */
    public void incorrectInitialization() {
        // Uncommenting the next line would be a logical error (not a compilation error)
        // MOD2G4_Err.lastAction = "Action by " + this.name; // This ties a static variable to instance-specific data
        
        System.out.println("ERROR: Initializing static variables with instance-specific information");
        System.out.println("is usually a design flaw, as static variables are shared across all instances.");
        System.out.println("The last instance to set the value would overwrite values from all other instances.");
    }
    
    /**
     * A static method that correctly accesses and modifies a static variable.
     */
    public static void incrementCounter() {
        counter++;
        lastAction = "Incremented counter";
    }
    
    /**
     * A static method that returns the current counter value.
     * 
     * @return The counter value
     */
    public static int getCounter() {
        return counter;
    }
    
    public static void main(String[] args) {
        // Demonstrate shadowing a static variable with a local variable
        System.out.println("Initial counter value: " + getCounter());
        System.out.println("\nDemonstrating shadowing a static variable:");
        shadowingStaticVariable();
        
        // Demonstrate incorrect assumption about static variable lifetime
        System.out.println("\nDemonstrating incorrect assumption about static variable lifetime:");
        incorrectAssumptionAboutLifetime();
        
        // Create an instance and demonstrate incorrect initialization
        MOD2G4_Err instance = new MOD2G4_Err("Test");
        System.out.println("\nDemonstrating incorrect initialization with instance-specific data:");
        instance.incorrectInitialization();
        
        // Demonstrate that static variables persist even when we create and discard instances
        System.out.println("\nDemonstrating static variable persistence:");
        System.out.println("Counter before creating instances: " + getCounter());
        
        // Create some instances
        MOD2G4_Err instance1 = new MOD2G4_Err("First");
        MOD2G4_Err instance2 = new MOD2G4_Err("Second");
        System.out.println("Counter after creating 2 instances: " + getCounter());
        
        // Discard references to instances
        instance1 = null;
        instance2 = null;
        // Suggest garbage collection (though it's not guaranteed to run)
        System.gc();
        
        System.out.println("Counter after discarding instances: " + getCounter());
        System.out.println("Notice that the counter value persists even after instances are gone.");
        
        // Explain the correct way to use static variables
        System.out.println("\nCorrect way to use static variables with static methods:");
        System.out.println("Static variables should be used for class-wide information");
        System.out.println("that is independent of any specific instance.");
    }
}
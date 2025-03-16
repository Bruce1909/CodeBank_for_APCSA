/**
 * MOD-2.H.2 Example
 * 
 * This program demonstrates that static variables can be designated as either
 * public or private and are designated with the static keyword before the variable type.
 */
public class MOD2H2_Exp {
    
    // Private static variable - accessible only within this class
    private static int privateCounter = 0;
    
    // Public static variable - accessible from any class
    public static String publicMessage = "Hello from MOD2H2_Exp class!";
    
    // Static final variable (constant) - cannot be changed after initialization
    public static final double PI_VALUE = 3.14159;
    
    // Instance variable for comparison
    private String name;
    
    /**
     * Constructor that initializes the instance variable and increments the private counter
     * 
     * @param name The name for this instance
     */
    public MOD2H2_Exp(String name) {
        this.name = name;
        privateCounter++;
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
     * Get the private counter value
     * 
     * @return The private counter value
     */
    public static int getPrivateCounter() {
        return privateCounter;
    }
    
    /**
     * Demonstrate how to modify a static variable
     * 
     * @param newMessage The new message to set
     */
    public static void setPublicMessage(String newMessage) {
        publicMessage = newMessage;
    }
    
    public static void main(String[] args) {
        // Demonstrate static variable declaration and access modifiers
        System.out.println("Demonstrating static variable declaration and access modifiers:\n");
        
        // Access public static variable directly using class name
        System.out.println("Accessing public static variable:");
        System.out.println("publicMessage: " + MOD2H2_Exp.publicMessage);
        
        // Access private static variable through a public static method
        System.out.println("\nAccessing private static variable through a method:");
        System.out.println("privateCounter: " + MOD2H2_Exp.getPrivateCounter());
        
        // Access public static final constant
        System.out.println("\nAccessing public static final constant:");
        System.out.println("PI_VALUE: " + MOD2H2_Exp.PI_VALUE);
        
        // Create instances and show that they share the static variables
        MOD2H2_Exp instance1 = new MOD2H2_Exp("First");
        MOD2H2_Exp instance2 = new MOD2H2_Exp("Second");
        
        System.out.println("\nCreated two instances. Private counter is now: " + getPrivateCounter());
        
        // Modify the public static variable
        System.out.println("\nModifying the public static variable:");
        MOD2H2_Exp.setPublicMessage("Updated message from the class!");
        System.out.println("Updated publicMessage: " + MOD2H2_Exp.publicMessage);
        
        // Show that all instances see the updated static variable
        System.out.println("\nAccessing the updated static variable through instances:");
        System.out.println("From instance1: " + instance1.publicMessage);
        System.out.println("From instance2: " + instance2.publicMessage);
        
        // Attempt to modify the static final constant would cause a compilation error
        // Uncommenting the next line would cause a compilation error
        // MOD2H2_Exp.PI_VALUE = 3.14; // Error: Cannot assign a value to final variable
        
        System.out.println("\nExplanation of static variable declaration:");
        System.out.println("1. Static variables are declared with the 'static' keyword before the type.");
        System.out.println("2. They can have access modifiers like 'public' or 'private'.");
        System.out.println("3. Adding 'final' makes them constants that cannot be changed.");
        System.out.println("4. They are initialized when the class is loaded, before any instances are created.");
    }
}
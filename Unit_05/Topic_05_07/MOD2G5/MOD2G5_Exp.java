/**
 * MOD-2.G.5 Example
 * 
 * This program demonstrates that static methods do not have a 'this' reference
 * and are unable to use the class's instance variables or call non-static methods.
 */
public class MOD2G5_Exp {
    
    // Instance variables - belong to objects of the class
    private String name;
    private int age;
    
    // Static variable - belongs to the class itself
    private static int instanceCount = 0;
    
    /**
     * Constructor that initializes instance variables
     * 
     * @param name The name
     * @param age The age
     */
    public MOD2G5_Exp(String name, int age) {
        this.name = name; // 'this' refers to the current instance
        this.age = age;   // 'this' refers to the current instance
        instanceCount++;  // No 'this' needed for static variables
    }
    
    /**
     * A static method that demonstrates the absence of 'this' reference.
     * 
     * @return An explanation message
     */
    public static String explainNoThisReference() {
        // The following line would cause a compilation error if uncommented
        // String message = "My name is " + this.name; // Error: Cannot use 'this' in a static context
        
        return "Static methods do not have a 'this' reference because they\n" +
               "are not associated with any specific instance of the class.\n" +
               "The 'this' keyword refers to the current instance, but static\n" +
               "methods belong to the class itself, not to any instance.";
    }
    
    /**
     * A static method that demonstrates why it cannot call non-static methods.
     * 
     * @return An explanation message
     */
    public static String explainCannotCallNonStatic() {
        // The following line would cause a compilation error if uncommented
        // String info = getInstanceInfo(); // Error: Cannot call non-static method from static context
        
        return "Static methods cannot call non-static methods directly because\n" +
               "non-static methods require an instance to operate on. Since static\n" +
               "methods do not have a 'this' reference, they have no instance\n" +
               "context from which to call non-static methods.";
    }
    
    /**
     * A non-static method that uses 'this' reference and accesses instance variables.
     * 
     * @return Information about this instance
     */
    public String getInstanceInfo() {
        // Instance methods can use 'this' and access instance variables
        return "Name: " + this.name + ", Age: " + this.age;
    }
    
    /**
     * A static method that shows how to properly work with instances if needed.
     * 
     * @param instance An instance of MOD2G5_Exp
     * @return Information about the provided instance
     */
    public static String getInfoFromInstance(MOD2G5_Exp instance) {
        // Static methods can work with instances if they are passed as parameters
        if (instance != null) {
            // Now we can call non-static methods on the provided instance
            return "Instance info: " + instance.getInstanceInfo();
        } else {
            return "No instance provided.";
        }
    }
    
    public static void main(String[] args) {
        // Demonstrate the absence of 'this' reference in static methods
        System.out.println("Explanation of no 'this' reference in static methods:");
        System.out.println(explainNoThisReference());
        
        // Demonstrate why static methods cannot call non-static methods
        System.out.println("\nExplanation of why static methods cannot call non-static methods:");
        System.out.println(explainCannotCallNonStatic());
        
        // Create an instance and demonstrate the proper way to work with instances
        MOD2G5_Exp person = new MOD2G5_Exp("Alice", 30);
        
        // Show how a static method can work with an instance if it's passed as a parameter
        System.out.println("\nUsing a static method with an instance passed as a parameter:");
        System.out.println(getInfoFromInstance(person));
        
        // Show that instance methods can use 'this' and call other instance methods
        System.out.println("\nUsing an instance method (which has 'this' reference):");
        System.out.println(person.getInstanceInfo());
        
        // Demonstrate that static methods can access static variables
        System.out.println("\nStatic methods can access static variables:");
        System.out.println("Instance count: " + instanceCount);
    }
}
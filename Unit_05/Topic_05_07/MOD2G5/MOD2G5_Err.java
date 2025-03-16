/**
 * MOD-2.G.5 Error Example
 * 
 * This program demonstrates common errors related to static methods trying to use
 * 'this' reference or call non-static methods.
 */
public class MOD2G5_Err {
    
    // Instance variables - belong to objects of the class
    private String name;
    private int age;
    
    // Static variable - belongs to the class itself
    private static int counter = 0;
    
    /**
     * Constructor that initializes instance variables
     * 
     * @param name The name
     * @param age The age
     */
    public MOD2G5_Err(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }
    
    /**
     * ERROR: This static method incorrectly tries to use 'this' reference.
     * This will cause a compilation error.
     * 
     * @return Would return a greeting if it could compile
     */
    public static String incorrectUseOfThis() {
        // Uncommenting the next line would cause a compilation error
        // return "Hello, my name is " + this.name; // Error: Cannot use 'this' in a static context
        
        System.out.println("ERROR: A static method cannot use 'this' reference");
        System.out.println("because 'this' refers to the current instance, but static methods");
        System.out.println("are not associated with any instance.");
        return "This method would not compile if we tried to use 'this'";
    }
    
    /**
     * ERROR: This static method incorrectly tries to call a non-static method.
     * This will cause a compilation error.
     * 
     * @return Would return instance info if it could compile
     */
    public static String incorrectCallToNonStatic() {
        // Uncommenting the next line would cause a compilation error
        // return getInstanceInfo(); // Error: Cannot call non-static method from static context
        
        System.out.println("ERROR: A static method cannot call non-static methods directly");
        System.out.println("because non-static methods require an instance to operate on.");
        return "This method would not compile if we tried to call 'getInstanceInfo()'";
    }
    
    /**
     * A non-static method that uses 'this' reference and accesses instance variables.
     * 
     * @return Information about this instance
     */
    public String getInstanceInfo() {
        return "Name: " + this.name + ", Age: " + this.age;
    }
    
    /**
     * ERROR: This static method incorrectly tries to create and return an anonymous
     * inner class that uses instance variables.
     */
    public static Runnable incorrectAnonymousInnerClass() {
        // Uncommenting the next block would cause a compilation error
        /*
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Name: " + name); // Error: Cannot access instance variable
            }
        };
        */
        
        System.out.println("ERROR: A static method cannot create anonymous inner classes");
        System.out.println("that access instance variables of the outer class.");
        return null;
    }
    
    /**
     * The correct way to work with instances in static methods - pass them as parameters.
     * 
     * @param instance An instance of MOD2G5_Err
     * @return Information about the provided instance
     */
    public static String correctWayToWorkWithInstances(MOD2G5_Err instance) {
        if (instance != null) {
            // Now we can call non-static methods on the provided instance
            return "Instance info: " + instance.getInstanceInfo();
        } else {
            return "No instance provided.";
        }
    }
    
    public static void main(String[] args) {
        // Demonstrate errors with static methods trying to use 'this'
        System.out.println("Demonstrating errors with static methods trying to use 'this':");
        System.out.println(incorrectUseOfThis());
        
        // Demonstrate errors with static methods trying to call non-static methods
        System.out.println("\nDemonstrating errors with static methods trying to call non-static methods:");
        System.out.println(incorrectCallToNonStatic());
        
        // Demonstrate errors with anonymous inner classes in static methods
        System.out.println("\nDemonstrating errors with anonymous inner classes in static methods:");
        incorrectAnonymousInnerClass();
        
        // Create an instance to show the correct way to work with instances
        MOD2G5_Err person = new MOD2G5_Err("Alice", 25);
        
        // Show the correct way to work with instances in static methods
        System.out.println("\nThe correct way to work with instances in static methods:");
        System.out.println(correctWayToWorkWithInstances(person));
        
        // Explain the error conceptually
        System.out.println("\nConceptual explanation of the error:");
        System.out.println("Static methods do not have a 'this' reference because they");
        System.out.println("belong to the class itself, not to any specific instance.");
        System.out.println("Without a 'this' reference, static methods cannot access instance");
        System.out.println("variables or call non-static methods directly.");
    }
}
/**
 * MOD-2.G.3 Error Example
 * 
 * This program demonstrates common errors related to static methods trying to access
 * instance variables, which is not allowed in Java.
 */
public class MOD2G3_Err {
    
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
    public MOD2G3_Err(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }
    
    /**
     * ERROR: This static method incorrectly tries to access instance variables.
     * This will cause a compilation error.
     * 
     * @return Would return a greeting if it could compile
     */
    public static String incorrectStaticMethod() {
        // Uncommenting the next line would cause a compilation error
        // return "Hello, " + name; // Error: Cannot access instance variable 'name'
        
        System.out.println("ERROR: A static method cannot access instance variables");
        System.out.println("because there is no 'this' reference in static methods.");
        return "This method would not compile if we tried to access 'name' or 'age'";
    }
    
    /**
     * ERROR: This static method incorrectly tries to modify instance variables.
     * This will cause a compilation error.
     */
    public static void incorrectModifyInstanceVariable() {
        // Uncommenting the next line would cause a compilation error
        // age = 30; // Error: Cannot access instance variable 'age'
        
        System.out.println("ERROR: A static method cannot modify instance variables");
        System.out.println("because there is no specific instance to modify.");
    }
    
    /**
     * ERROR: This static method incorrectly tries to call a non-static method.
     * This will cause a compilation error.
     */
    public static void incorrectCallNonStaticMethod() {
        // Uncommenting the next line would cause a compilation error
        // displayInfo(); // Error: Cannot call non-static method from static context
        
        System.out.println("ERROR: A static method cannot call non-static methods");
        System.out.println("because non-static methods require an instance to operate on.");
    }
    
    /**
     * A non-static method that displays information about this instance.
     */
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    /**
     * A static method that correctly accesses only static variables.
     * 
     * @return The counter value
     */
    public static int getCounter() {
        return counter; // This works because counter is static
    }
    
    public static void main(String[] args) {
        // Demonstrate errors with static methods trying to access instance variables
        System.out.println("Demonstrating errors with static methods:");
        System.out.println(incorrectStaticMethod());
        
        System.out.println("\nDemonstrating errors with static methods trying to modify instance variables:");
        incorrectModifyInstanceVariable();
        
        System.out.println("\nDemonstrating errors with static methods trying to call non-static methods:");
        incorrectCallNonStaticMethod();
        
        // Create an instance to show the correct way to access instance variables
        MOD2G3_Err person = new MOD2G3_Err("Alice", 25);
        
        System.out.println("\nCorrect way to access instance variables (through an instance):");
        person.displayInfo();
        
        // Show that static methods can access static variables
        System.out.println("\nStatic methods can access static variables:");
        System.out.println("Counter: " + getCounter());
        
        // Explain the error conceptually
        System.out.println("\nConceptual explanation of the error:");
        System.out.println("Static methods belong to the class itself, not to any instance.");
        System.out.println("When a static method is called, there might not even be any");
        System.out.println("instances of the class created yet. Therefore, there would be");
        System.out.println("no instance variables to access or modify.");
    }
}
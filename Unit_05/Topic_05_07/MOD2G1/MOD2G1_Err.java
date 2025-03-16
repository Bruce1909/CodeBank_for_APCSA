/**
 * MOD-2.G.1 Error Example
 * 
 * This program demonstrates common errors related to static methods,
 * such as trying to call non-static methods without an instance.
 */
public class MOD2G1_Err {
    
    /**
     * A static method that is associated with the class, not objects of the class.
     * 
     * @return A greeting message
     */
    public static String getClassGreeting() {
        return "Hello from the MOD2G1_Err class!";
    }
    
    /**
     * A non-static (instance) method that is associated with objects of the class.
     * 
     * @return A greeting message from the instance
     */
    public String getInstanceGreeting() {
        return "Hello from an instance of MOD2G1_Err!";
    }
    
    public static void main(String[] args) {
        // Demonstrate the correct way to call a static method
        System.out.println("Correctly calling a static method:");
        System.out.println(MOD2G1_Err.getClassGreeting());
        
        // ERROR: Attempting to call a non-static method using the class name
        // This will cause a compilation error
        System.out.println("\nERROR: Attempting to call a non-static method using the class name:");
        // Uncommenting the next line would cause a compilation error
        // System.out.println(MOD2G1_Err.getInstanceGreeting());
        System.out.println("The above line would cause a compilation error because");
        System.out.println("non-static methods require an instance of the class.");
        
        // ERROR: Attempting to access a non-static method from a static context
        System.out.println("\nERROR: Attempting to access a non-static method from a static context:");
        // Uncommenting the next line would cause a compilation error
        // System.out.println(getInstanceGreeting());
        System.out.println("The above line would cause a compilation error because");
        System.out.println("you cannot access non-static methods from a static context");
        System.out.println("without an instance of the class.");
        
        // The correct way to call a non-static method
        System.out.println("\nThe correct way to call a non-static method:");
        MOD2G1_Err instance = new MOD2G1_Err();
        System.out.println(instance.getInstanceGreeting());
        
        // ERROR: Common misconception - thinking that static methods are tied to instances
        System.out.println("\nERROR: Common misconception about static methods:");
        System.out.println("Some programmers incorrectly believe that each instance has its own");
        System.out.println("copy of static methods, but static methods belong to the class itself,");
        System.out.println("not to instances of the class.");
    }
}
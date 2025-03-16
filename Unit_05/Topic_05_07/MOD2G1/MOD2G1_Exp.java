/**
 * MOD-2.G.1 Example
 * 
 * This program demonstrates that static methods are associated with the class,
 * not objects of the class.
 */
public class MOD2G1_Exp {
    
    /**
     * A static method that is associated with the class, not objects of the class.
     * This method can be called using the class name without creating an instance.
     * 
     * @return A greeting message
     */
    public static String getClassGreeting() {
        return "Hello from the MOD2G1_Exp class!";
    }
    
    /**
     * A non-static (instance) method that is associated with objects of the class.
     * This method can only be called using an instance of the class.
     * 
     * @return A greeting message from the instance
     */
    public String getInstanceGreeting() {
        return "Hello from an instance of MOD2G1_Exp!";
    }
    
    public static void main(String[] args) {
        // Demonstrate calling a static method using the class name
        // No need to create an instance of the class
        System.out.println("Calling static method using class name:");
        System.out.println(MOD2G1_Exp.getClassGreeting());
        
        // You can also call a static method without the class name from within the same class
        System.out.println("\nCalling static method without class name (from within the class):");
        System.out.println(getClassGreeting());
        
        // Create an instance of the class
        MOD2G1_Exp instance = new MOD2G1_Exp();
        
        // You can call a static method using an instance (but this is not recommended)
        // This is allowed but discouraged because it can be confusing
        System.out.println("\nCalling static method using an instance (not recommended):");
        System.out.println(instance.getClassGreeting());
        
        // Demonstrate calling a non-static method using an instance
        // This requires an instance of the class
        System.out.println("\nCalling non-static method using an instance:");
        System.out.println(instance.getInstanceGreeting());
        
        // The following would cause a compilation error because you cannot call
        // a non-static method without an instance
        // System.out.println(MOD2G1_Exp.getInstanceGreeting()); // This would not compile
        
        // Demonstrate that static methods are shared across all instances
        System.out.println("\nDemonstrating that static methods are shared across all instances:");
        MOD2G1_Exp instance1 = new MOD2G1_Exp();
        MOD2G1_Exp instance2 = new MOD2G1_Exp();
        
        System.out.println("From instance1: " + instance1.getClassGreeting());
        System.out.println("From instance2: " + instance2.getClassGreeting());
        System.out.println("From class: " + MOD2G1_Exp.getClassGreeting());
        System.out.println("All three calls invoke the same static method!");
    }
}
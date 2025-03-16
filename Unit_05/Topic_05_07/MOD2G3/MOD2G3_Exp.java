/**
 * MOD-2.G.3 Example
 * 
 * This program demonstrates that static methods cannot access or change
 * the values of instance variables.
 */
public class MOD2G3_Exp {
    
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
    public MOD2G3_Exp(String name, int age) {
        this.name = name;
        this.age = age;
        instanceCount++; // Increment the static counter
    }
    
    /**
     * A static method that can access static variables but NOT instance variables.
     * 
     * @return The number of instances created
     */
    public static int getInstanceCount() {
        // This works because instanceCount is a static variable
        return instanceCount;
        
        // The following lines would cause compilation errors if uncommented
        // because static methods cannot access instance variables
        
        // return name; // Error: Cannot access instance variable 'name'
        // return age;  // Error: Cannot access instance variable 'age'
    }
    
    /**
     * A static method that demonstrates why it cannot access instance variables.
     * 
     * @return An explanation message
     */
    public static String explainWhyNoInstanceAccess() {
        return "Static methods cannot access instance variables because they belong\n" +
               "to the class itself, not to any specific instance. When a static\n" +
               "method is called, there might not even be any instances of the class\n" +
               "created yet, so there would be no instance variables to access.";
    }
    
    /**
     * A non-static (instance) method that can access both instance and static variables.
     * 
     * @return Information about this instance
     */
    public String getInstanceInfo() {
        // Instance methods can access both instance and static variables
        return "Name: " + name + ", Age: " + age + 
               "\nThis is instance #" + instanceCount + " of the class.";
    }
    
    public static void main(String[] args) {
        // Demonstrate that static methods can be called without any instances
        System.out.println("Before creating any instances:");
        System.out.println("Instance count: " + getInstanceCount());
        
        // Create some instances
        MOD2G3_Exp person1 = new MOD2G3_Exp("Alice", 30);
        MOD2G3_Exp person2 = new MOD2G3_Exp("Bob", 25);
        
        // Show that the static method correctly tracks the number of instances
        System.out.println("\nAfter creating instances:");
        System.out.println("Instance count: " + getInstanceCount());
        
        // Demonstrate that instance methods can access instance variables
        System.out.println("\nInformation about person1:");
        System.out.println(person1.getInstanceInfo());
        
        System.out.println("\nInformation about person2:");
        System.out.println(person2.getInstanceInfo());
        
        // Explain why static methods cannot access instance variables
        System.out.println("\nWhy static methods cannot access instance variables:");
        System.out.println(explainWhyNoInstanceAccess());
    }
}
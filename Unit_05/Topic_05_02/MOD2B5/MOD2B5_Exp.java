/**
 * MOD2B5_Exp.java
 * 
 * This program demonstrates the correct usage of default constructors as described in
 * MOD-2.B.5: When no constructor is written, Java provides a no-argument constructor,
 * and the instance variables are set to default values.
 */
public class MOD2B5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating default constructors (MOD-2.B.5):\n");
        
        // Create an object using the default constructor
        System.out.println("Creating an object with the default constructor:");
        DefaultConstructorDemo obj1 = new DefaultConstructorDemo();
        
        // Display the default values of instance variables
        System.out.println("\nDefault values of instance variables:");
        obj1.displayInfo();
        
        // Modify the object's state
        System.out.println("\nModifying the object's state:");
        obj1.setName("Example Object");
        obj1.setValue(42);
        obj1.setActive(true);
        obj1.displayInfo();
        
        // Create another object to demonstrate that each gets its own default values
        System.out.println("\nCreating another object with the default constructor:");
        DefaultConstructorDemo obj2 = new DefaultConstructorDemo();
        obj2.displayInfo();
        
        // Demonstrate a class with explicit initialization of instance variables
        System.out.println("\nCreating an object with explicit initialization of instance variables:");
        InitializedDemo obj3 = new InitializedDemo();
        obj3.displayInfo();
        
        System.out.println("\n--- Key Points about Default Constructors ---");
        System.out.println("1. Java provides a no-argument constructor when no constructor is written");
        System.out.println("2. The default constructor initializes instance variables to default values:");
        System.out.println("   - numeric types (int, double, etc.) to 0");
        System.out.println("   - boolean to false");
        System.out.println("   - reference types (String, arrays, objects) to null");
        System.out.println("3. Explicit initialization of instance variables happens before the constructor runs");
        System.out.println("4. If any constructor is defined, Java will not provide a default constructor");
        System.out.println("5. The default constructor has the same access modifier as the class");
    }
}

/**
 * Class that demonstrates the default constructor
 * No constructor is explicitly defined, so Java provides a default no-argument constructor
 */
class DefaultConstructorDemo {
    // Instance variables with no explicit initialization
    private String name;    // Default value: null
    private int value;      // Default value: 0
    private double rate;    // Default value: 0.0
    private boolean active; // Default value: false
    private int[] data;     // Default value: null
    
    // No constructor defined - Java provides a default constructor
    // The default constructor would look like this if written explicitly:
    // public DefaultConstructorDemo() {
    //     // No code - instance variables get default values
    // }
    
    // Methods to modify the state
    public void setName(String name) {
        this.name = name;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    
    // Method to display the current state
    public void displayInfo() {
        System.out.println("  Name: " + name);
        System.out.println("  Value: " + value);
        System.out.println("  Rate: " + rate);
        System.out.println("  Active: " + active);
        System.out.println("  Data: " + (data == null ? "null" : "array with length " + data.length));
    }
}

/**
 * Class that demonstrates explicit initialization of instance variables
 * Even with no constructor, these initializations happen before the default constructor runs
 */
class InitializedDemo {
    // Instance variables with explicit initialization
    private String name = "Default Name";  // Explicit initialization
    private int value = 100;               // Explicit initialization
    private double rate = 1.5;             // Explicit initialization
    private boolean active = true;         // Explicit initialization
    private int[] data = new int[5];       // Explicit initialization
    
    // No constructor defined - Java provides a default constructor
    // The explicit initializations happen before the default constructor runs
    
    // Method to display the current state
    public void displayInfo() {
        System.out.println("  Name: " + name);
        System.out.println("  Value: " + value);
        System.out.println("  Rate: " + rate);
        System.out.println("  Active: " + active);
        System.out.println("  Data: array with length " + data.length);
    }
}
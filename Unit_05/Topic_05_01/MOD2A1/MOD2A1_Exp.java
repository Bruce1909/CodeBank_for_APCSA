/**
 * MOD2A1_Exp.java
 * 
 * This program demonstrates the correct usage of public and private keywords
 * as described in MOD-2.A.1: The keywords public and private affect the access
 * of classes, data, constructors, and methods.
 */
public class MOD2A1_Exp {
    // Private instance variables - only accessible within this class
    private int privateData;
    private String privateMessage;
    
    // Public constructor - accessible from outside the class
    public MOD2A1_Exp(int data, String message) {
        this.privateData = data;
        this.privateMessage = message;
        System.out.println("Constructor called with data: " + data + " and message: " + message);
    }
    
    // Public method - accessible from outside the class
    public void displayInfo() {
        System.out.println("Public method called");
        System.out.println("Data: " + privateData);
        System.out.println("Message: " + privateMessage);
        // We can call private methods from within public methods
        processDataInternally();
    }
    
    // Private method - only accessible within this class
    private void processDataInternally() {
        System.out.println("Private method called - internal processing");
        privateData *= 2; // Modify the private data
        System.out.println("Data after processing: " + privateData);
    }
    
    // Public method to demonstrate access control
    public void demonstrateAccess() {
        System.out.println("\nDemonstrating access control:");
        System.out.println("1. Public methods can access private data: " + privateData);
        System.out.println("2. Public methods can call private methods:");
        processDataInternally();
        System.out.println("3. External classes cannot directly access private members");
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating public and private keywords (MOD-2.A.1):\n");
        
        // Create an instance of the class using the public constructor
        MOD2A1_Exp example = new MOD2A1_Exp(42, "Hello, Java!");
        
        // Call public methods
        System.out.println("\nCalling public methods:");
        example.displayInfo();
        
        // Demonstrate access control
        example.demonstrateAccess();
        
        // The following would cause compilation errors if uncommented:
        // int data = example.privateData; // Error: privateData has private access
        // example.processDataInternally(); // Error: processDataInternally() has private access
        
        System.out.println("\n--- Key Points about Public and Private Keywords ---");
        System.out.println("1. public members are accessible from any class");
        System.out.println("2. private members are only accessible within the declaring class");
        System.out.println("3. public methods can access private members of the same class");
        System.out.println("4. private methods can only be called from within the class");
    }
}
/**
 * MOD2A2_Exp.java
 * 
 * This program demonstrates the correct usage of public and private keywords
 * as described in MOD-2.A.2: The keyword private restricts access to the declaring class,
 * while the keyword public allows access from classes outside the declaring class.
 */
public class MOD2A2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating public and private access (MOD-2.A.2):\n");
        
        // Create an instance of DataManager
        DataManager manager = new DataManager("Confidential Information", 12345);
        
        // Access public methods
        System.out.println("Accessing public methods from outside the class:");
        manager.displayPublicInfo();
        manager.updateData("Updated Information", 67890);
        manager.displayPublicInfo();
        
        // Cannot access private methods or data directly
        System.out.println("\nAttempting to access private members (commented out to avoid compilation errors):");
        // System.out.println(manager.privateData); // Error: privateData has private access
        // System.out.println(manager.secretInfo); // Error: secretInfo has private access
        // manager.processInternally(); // Error: processInternally() has private access
        
        // Create an instance of AccessTester to demonstrate class boundaries
        System.out.println("\nDemonstrating access from another class (AccessTester):");
        AccessTester tester = new AccessTester();
        tester.testAccess(manager);
        
        System.out.println("\n--- Key Points about Public and Private Access ---");
        System.out.println("1. private members can only be accessed within the declaring class");
        System.out.println("2. public members can be accessed from any class");
        System.out.println("3. Even another class in the same file cannot access private members");
        System.out.println("4. Access modifiers enforce encapsulation boundaries");
    }
}

/**
 * Class that demonstrates data encapsulation with private and public members
 */
class DataManager {
    // Private data - only accessible within this class
    private String secretInfo;
    private int privateData;
    
    // Public constructor
    public DataManager(String info, int data) {
        this.secretInfo = info;
        this.privateData = data;
        System.out.println("DataManager created with private data");
    }
    
    // Public method - accessible from outside the class
    public void displayPublicInfo() {
        System.out.println("Public method called to display information");
        // We can access private data within the class
        System.out.println("Info (accessed internally): " + secretInfo);
        System.out.println("Data (accessed internally): " + privateData);
        
        // We can call private methods from within public methods
        processInternally();
    }
    
    // Public method to update data
    public void updateData(String newInfo, int newData) {
        System.out.println("\nUpdating data through public method:");
        this.secretInfo = newInfo;
        this.privateData = newData;
        System.out.println("Data updated successfully");
    }
    
    // Private method - only accessible within this class
    private void processInternally() {
        System.out.println("Private method called - internal processing");
        // Private implementation details hidden from outside classes
    }
}

/**
 * Class that demonstrates attempting to access members of another class
 */
class AccessTester {
    public void testAccess(DataManager manager) {
        // Can access public methods
        System.out.println("AccessTester can call public methods:");
        manager.displayPublicInfo();
        
        // Cannot access private members
        System.out.println("\nAccessTester cannot access private members (commented out):");
        // System.out.println(manager.secretInfo); // Error: secretInfo has private access
        // System.out.println(manager.privateData); // Error: privateData has private access
        // manager.processInternally(); // Error: processInternally() has private access
        
        System.out.println("\nThis demonstrates that private members are not accessible");
        System.out.println("even from other classes in the same file.");
    }
}
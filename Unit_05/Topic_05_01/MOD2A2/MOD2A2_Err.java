/**
 * MOD2A2_Err.java
 * 
 * This program demonstrates common errors related to public and private access modifiers
 * as described in MOD-2.A.2: The keyword private restricts access to the declaring class,
 * while the keyword public allows access from classes outside the declaring class.
 */
public class MOD2A2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with public and private access (MOD-2.A.2):\n");
        
        // Create an instance of DataManagerWithErrors
        DataManagerWithErrors manager = new DataManagerWithErrors("Sensitive Information", 12345);
        
        // ERROR 1: Accessing what should be private data directly
        System.out.println("\nError 1: Directly accessing data that should be private:");
        System.out.println("Direct access to info: " + manager.info); // This should be private
        System.out.println("Direct access to data: " + manager.data); // This should be private
        
        // ERROR 2: Modifying what should be private data directly
        System.out.println("\nError 2: Directly modifying data that should be private:");
        manager.info = "Modified without proper method!";
        manager.data = 99999;
        System.out.println("After direct modification - info: " + manager.info);
        System.out.println("After direct modification - data: " + manager.data);
        
        // ERROR 3: Accessing what should be a private method
        System.out.println("\nError 3: Accessing a method that should be private:");
        manager.internalProcess(); // This method should be private
        
        // Create an instance of AccessViolator to demonstrate improper access
        System.out.println("\nDemonstrating improper access from another class (AccessViolator):");
        AccessViolator violator = new AccessViolator();
        violator.demonstrateImproperAccess(manager);
        
        System.out.println("\n--- Common Errors with Public and Private Access ---");
        System.out.println("1. Making data public that should be private");
        System.out.println("2. Allowing direct modification of internal data");
        System.out.println("3. Making internal methods public that should be private");
        System.out.println("4. Not enforcing proper encapsulation boundaries");
        System.out.println("5. Exposing implementation details to external classes");
    }
}

/**
 * Class that demonstrates errors in data encapsulation
 */
class DataManagerWithErrors {
    // ERROR: These fields should be private
    public String info; // Should be private
    public int data;    // Should be private
    
    // Constructor
    public DataManagerWithErrors(String info, int data) {
        this.info = info;
        this.data = data;
        System.out.println("DataManagerWithErrors created with data that should be private");
    }
    
    // Public method
    public void displayInfo() {
        System.out.println("Public method called to display information");
        System.out.println("Info: " + info);
        System.out.println("Data: " + data);
        internalProcess();
    }
    
    // ERROR: This method should be private
    public void internalProcess() {
        System.out.println("Internal processing method called - this should be private");
        // Implementation details that should be hidden
        data *= 2;
        System.out.println("Data after internal processing: " + data);
    }
    
    // Public method to update data (correct approach)
    public void updateData(String newInfo, int newData) {
        System.out.println("\nUpdating data through public method (correct approach):");
        this.info = newInfo;
        this.data = newData;
        System.out.println("Data updated successfully");
    }
}

/**
 * Class that demonstrates improper access to another class's members
 */
class AccessViolator {
    public void demonstrateImproperAccess(DataManagerWithErrors manager) {
        // ERROR: Directly accessing and modifying what should be private data
        System.out.println("AccessViolator improperly accessing data:");
        System.out.println("Direct access to info: " + manager.info); // Should not be possible
        System.out.println("Direct access to data: " + manager.data); // Should not be possible
        
        System.out.println("\nAccessViolator improperly modifying data:");
        manager.info = "Violated by external class!";
        manager.data = 54321;
        System.out.println("After violation - info: " + manager.info);
        System.out.println("After violation - data: " + manager.data);
        
        // ERROR: Calling what should be a private method
        System.out.println("\nAccessViolator calling what should be a private method:");
        manager.internalProcess(); // Should not be possible
        
        System.out.println("\nThis demonstrates how lack of proper access control");
        System.out.println("allows external classes to violate encapsulation.");
    }
}
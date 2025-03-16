/**
 * MOD2A1_Err.java
 * 
 * This program demonstrates common errors when using public and private keywords
 * as described in MOD-2.A.1: The keywords public and private affect the access
 * of classes, data, constructors, and methods.
 */
public class MOD2A1_Err {
    // ERROR 1: Public instance variables expose internal data
    public int publicData; // Should be private to maintain encapsulation
    public String publicMessage; // Should be private to maintain encapsulation
    
    // Constructor
    public MOD2A1_Err(int data, String message) {
        this.publicData = data;
        this.publicMessage = message;
        System.out.println("Constructor called with data: " + data + " and message: " + message);
    }
    
    // Public method
    public void displayInfo() {
        System.out.println("Public method called");
        System.out.println("Data: " + publicData);
        System.out.println("Message: " + publicMessage);
        processData();
    }
    
    // ERROR 2: Method that should be private is public
    public void processData() {
        System.out.println("Processing data internally - this method should be private");
        publicData *= 2;
        System.out.println("Data after processing: " + publicData);
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with public and private keywords (MOD-2.A.1):\n");
        
        // Create an instance of the class
        MOD2A1_Err example = new MOD2A1_Err(42, "Hello, Java!");
        
        // ERROR 3: Direct access to public instance variables
        System.out.println("\nError 3: Direct access to public instance variables:");
        System.out.println("Direct access to publicData: " + example.publicData);
        System.out.println("Direct access to publicMessage: " + example.publicMessage);
        
        // ERROR 4: Modifying public instance variables directly
        System.out.println("\nError 4: Modifying public instance variables directly:");
        example.publicData = 100;
        example.publicMessage = "Modified directly!";
        System.out.println("After modification - publicData: " + example.publicData);
        System.out.println("After modification - publicMessage: " + example.publicMessage);
        
        // ERROR 5: Calling internal processing method directly
        System.out.println("\nError 5: Calling internal processing method directly:");
        example.processData(); // This method should be private
        
        // Display information after errors
        System.out.println("\nCalling displayInfo after errors:");
        example.displayInfo();
        
        System.out.println("\n--- Common Errors with Public and Private Keywords ---");
        System.out.println("1. Making instance variables public instead of private");
        System.out.println("2. Making internal methods public instead of private");
        System.out.println("3. Directly accessing public instance variables from outside the class");
        System.out.println("4. Directly modifying public instance variables from outside the class");
        System.out.println("5. Calling internal processing methods from outside the class");
        System.out.println("\nThese errors break encapsulation and can lead to unexpected behavior and maintenance issues.");
    }
}
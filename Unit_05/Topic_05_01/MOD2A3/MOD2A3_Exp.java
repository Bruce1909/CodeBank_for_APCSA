/**
 * MOD2A3_Exp.java
 * 
 * This program demonstrates the correct usage of public class designation
 * as described in MOD-2.A.3: Classes are designated public.
 */

// Main class must be public and match the filename
public class MOD2A3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating public class designation (MOD-2.A.3):\n");
        
        // Create instances of different classes
        System.out.println("Creating an instance of the main public class:");
        MOD2A3_Exp mainClass = new MOD2A3_Exp();
        mainClass.displayInfo();
        
        System.out.println("\nCreating an instance of a non-public class in the same file:");
        HelperClass helper = new HelperClass("Helper");
        helper.displayInfo();
        
        System.out.println("\nAccessing a public class from another file:");
        // We can access PublicUtility because it's public
        PublicUtility utility = new PublicUtility();
        utility.performTask();
        
        System.out.println("\n--- Key Points about Public Class Designation ---");
        System.out.println("1. The class that matches the filename must be declared public");
        System.out.println("2. A Java file can have only one public class");
        System.out.println("3. Non-public classes can only be accessed within the same package");
        System.out.println("4. Public classes can be accessed from any package (with proper import)");
    }
    
    // Method in the main class
    public void displayInfo() {
        System.out.println("This is the main public class (MOD2A3_Exp)");
    }
}

// Non-public class in the same file
class HelperClass {
    private String name;
    
    public HelperClass(String name) {
        this.name = name;
    }
    
    public void displayInfo() {
        System.out.println("This is a non-public helper class named: " + name);
        System.out.println("Non-public classes can only be accessed within the same package");
    }
}

// Another public class that would be in a separate file
// Note: In a real Java program, this would need to be in its own file named PublicUtility.java
// It's included here for demonstration purposes only
class PublicUtility {
    public void performTask() {
        System.out.println("This is a public utility class performing a task");
        System.out.println("In a real program, this class would be in its own file");
    }
}
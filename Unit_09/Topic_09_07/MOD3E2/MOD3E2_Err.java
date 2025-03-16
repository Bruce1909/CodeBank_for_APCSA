/**
 * MOD3E2_Err.java
 * This program demonstrates common errors related to the Object class being part of the java.lang package.
 * 
 * MOD-3.E.2: The Object class is part of the java.lang package.
 */

// ERROR 1: Unnecessary import of java.lang classes
import java.lang.Object; // Unnecessary import
import java.lang.String; // Unnecessary import
import java.lang.System; // Unnecessary import

public class MOD3E2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to java.lang package:\n");
        
        // ERROR 2: Confusion about automatic importing
        System.out.println("ERROR 1: Unnecessary imports of java.lang classes");
        System.out.println("The java.lang package is automatically imported, so these imports are redundant:");
        System.out.println("import java.lang.Object;");
        System.out.println("import java.lang.String;");
        System.out.println("import java.lang.System;");
        
        // ERROR 3: Confusion between java.lang and other packages
        System.out.println("\nERROR 2: Confusion between java.lang and other packages");
        System.out.println("Classes like ArrayList are NOT in java.lang and need explicit imports");
        
        // The following would cause a compilation error if uncommented:
        // ArrayList list = new ArrayList(); // Error: ArrayList is not in java.lang
        System.out.println("Correct way: import java.util.ArrayList; or use fully qualified name");
        
        // ERROR 4: Trying to extend final classes from java.lang
        System.out.println("\nERROR 3: Trying to extend final classes from java.lang");
        System.out.println("Some classes in java.lang like String, Integer, and Math are final and cannot be extended");
        
        // ERROR 5: Confusion about Object methods availability
        ErrorClass obj = new ErrorClass();
        System.out.println("\nERROR 4: Not understanding that all Object methods are available to all classes");
        System.out.println("Even though we didn't explicitly extend Object, ErrorClass still has Object methods:");
        System.out.println("toString(): " + obj.toString());
        System.out.println("hashCode(): " + obj.hashCode());
        System.out.println("getClass(): " + obj.getClass().getName());
        
        // ERROR 6: Trying to use java.lang methods that don't exist
        System.out.println("\nERROR 5: Assuming methods exist in Object that don't");
        // The following would cause compilation errors if uncommented:
        // obj.print(); // Error: No such method in Object
        // obj.size(); // Error: No such method in Object
        System.out.println("Object does not have methods like print() or size()");
    }
}

/**
 * A class that doesn't explicitly extend any class
 * but still inherits from Object implicitly
 */
class ErrorClass {
    // No explicit extends clause, but still inherits from Object
    
    // This class inherits all Object methods even without explicitly extending Object
}
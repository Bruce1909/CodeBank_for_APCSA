/**
 * MOD2A3_Err.java
 * 
 * This program demonstrates common errors related to public class designation
 * as described in MOD-2.A.3: Classes are designated public.
 */

// ERROR 1: Multiple public classes in the same file
public class MOD2A3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with public class designation (MOD-2.A.3):\n");
        
        // Create instances of different classes
        System.out.println("Creating an instance of the main class:");
        MOD2A3_Err mainClass = new MOD2A3_Err();
        mainClass.displayInfo();
        
        // ERROR 3: Attempting to access a class that should be in another file
        System.out.println("\nError 3: Attempting to access a class that should be in another file:");
        System.out.println("In a real Java program, the following would cause compilation errors:");
        System.out.println("- AnotherPublicClass should be in its own file named AnotherPublicClass.java");
        AnotherPublicClass another = new AnotherPublicClass();
        another.displayInfo();
        
        System.out.println("\n--- Common Errors with Public Class Designation ---");
        System.out.println("1. Having multiple public classes in the same file");
        System.out.println("2. Not making the class that matches the filename public");
        System.out.println("3. Trying to access a non-public class from outside its package");
        System.out.println("4. Naming a file differently from its public class");
    }
    
    public void displayInfo() {
        System.out.println("This is the main class (MOD2A3_Err)");
    }
}

// ERROR 2: Another public class in the same file
// This would cause a compilation error in a real Java program
public class AnotherPublicClass {
    public void displayInfo() {
        System.out.println("This is another public class in the same file");
        System.out.println("This would cause a compilation error in a real Java program");
    }
}

// Non-public class (this is allowed)
class HelperClass {
    public void doWork() {
        System.out.println("This is a non-public helper class");
        System.out.println("Multiple non-public classes are allowed in the same file");
    }
}

// Note: The following errors are commented out because they would prevent compilation

// ERROR 4: Class name doesn't match filename
// class MOD2A3_WrongName {
//     // This would cause a compilation error if it were the only public class
//     // because the filename is MOD2A3_Err.java, not MOD2A3_WrongName.java
// }

// ERROR 5: Missing public modifier for the main class
// class MOD2A3_MissingPublic {
//     // This would cause accessibility issues if this were the main class
//     // because it's not declared public
// }
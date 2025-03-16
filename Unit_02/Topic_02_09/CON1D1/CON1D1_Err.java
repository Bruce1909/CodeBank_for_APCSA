/**
 * CON1D1_Err.java
 * 
 * This program demonstrates common errors related to the Math class being part of the java.lang package.
 * Knowledge Point: CON-1.D.1 - The Math class is part of the java.lang package.
 */
public class CON1D1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors Related to Math Class Package:\n");
        
        // Error 1: Unnecessary import of java.lang.Math
        System.out.println("Error 1: Unnecessary import of java.lang.Math");
        System.out.println("// import java.lang.Math; // This is unnecessary and redundant");
        System.out.println("The java.lang package is automatically imported in every Java program.");
        System.out.println("Adding 'import java.lang.Math;' is redundant and shows lack of understanding.");
        System.out.println();
        
        // Error 2: Confusion with similarly named classes in other packages
        System.out.println("Error 2: Confusion with similarly named classes in other packages");
        System.out.println("// import java.util.Math; // Error: No such class exists");
        System.out.println("// import javax.swing.Math; // Error: No such class exists");
        System.out.println("The Math class is only defined in the java.lang package.");
        System.out.println("Be careful not to confuse it with similarly named classes in other packages.");
        System.out.println();
        
        // Error 3: Fully qualified name usage when unnecessary
        System.out.println("Error 3: Fully qualified name usage when unnecessary");
        double value = 3.14159;
        double absValue = Math.abs(value); // Correct way
        // The following line is equivalent but unnecessarily verbose
        double absValue2 = java.lang.Math.abs(value); // Unnecessarily verbose
        
        System.out.println("Math.abs(" + value + ") = " + absValue + " (Correct way)");
        System.out.println("java.lang.Math.abs(" + value + ") = " + absValue2 + " (Unnecessarily verbose)");
        System.out.println("Using the fully qualified name 'java.lang.Math' is redundant");
        System.out.println("since java.lang is automatically imported.");
        System.out.println();
        
        // Error 4: Attempting to create a custom Math class that conflicts
        System.out.println("Error 4: Attempting to create a custom Math class that conflicts");
        System.out.println("// class Math { // This would cause a naming conflict");
        System.out.println("//     public static int abs(int x) { return (x < 0) ? -x : x; }");
        System.out.println("// }");
        System.out.println("Creating your own class named 'Math' is possible but not recommended");
        System.out.println("as it would conflict with java.lang.Math and cause confusion.");
        System.out.println("You would need to use the fully qualified name to access the standard Math class.");
        System.out.println();
        
        // Error 5: Misunderstanding the accessibility of java.lang
        System.out.println("Error 5: Misunderstanding the accessibility of java.lang");
        System.out.println("Some programmers incorrectly believe they need to add:");
        System.out.println("// import java.lang.*; // This is unnecessary");
        System.out.println("This is incorrect because java.lang.* is automatically imported.");
        System.out.println();
        
        // Summary of common errors
        System.out.println("--- Common Errors Related to Math Class Package ---");
        System.out.println("1. Unnecessarily importing java.lang.Math");
        System.out.println("2. Confusing Math with similarly named classes in other packages");
        System.out.println("3. Using fully qualified name (java.lang.Math) when unnecessary");
        System.out.println("4. Creating custom classes that conflict with java.lang classes");
        System.out.println("5. Explicitly importing java.lang.* when it's automatically imported");
    }
}
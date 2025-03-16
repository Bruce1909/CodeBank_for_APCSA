/**
 * VAR1E8_Err.java
 * 
 * This program demonstrates common errors related to Java packages and the java.lang package.
 * 
 * Knowledge Points: VAR-1.E.8, VAR-1.E.9
 * - Classes in the APIs and libraries are grouped into packages
 * - The String class is part of the java.lang package. Classes in the java.lang package are available by default.
 */
public class VAR1E8_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with Java packages:\n");
        
        // ERROR 1: Unnecessary import of java.lang classes
        System.out.println("ERROR 1: Unnecessary import of java.lang classes");
        System.out.println("Uncommenting the following line would be unnecessary:");
        // import java.lang.String; // Unnecessary - java.lang is imported by default
        // import java.lang.System; // Unnecessary - java.lang is imported by default
        System.out.println("Classes in the java.lang package are automatically imported");
        System.out.println("Adding explicit imports for them is redundant and clutters the code");
        System.out.println();
        
        // ERROR 2: Forgetting to import non-java.lang classes
        System.out.println("ERROR 2: Forgetting to import non-java.lang classes");
        System.out.println("Uncommenting the following lines would cause compilation errors:");
        // ArrayList<String> list = new ArrayList<>(); // Error: ArrayList is not imported
        // HashMap<String, Integer> map = new HashMap<>(); // Error: HashMap is not imported
        System.out.println("Classes outside java.lang must be imported or referenced with fully qualified names");
        System.out.println("Correct approach: import java.util.ArrayList; import java.util.HashMap;");
        System.out.println("Or use fully qualified names: java.util.ArrayList, java.util.HashMap");
        System.out.println();
        
        // ERROR 3: Confusing import statements
        System.out.println("ERROR 3: Confusing import statements");
        System.out.println("Uncommenting the following line would be incorrect:");
        // import java.*; // This does NOT import all Java classes
        System.out.println("This only imports classes directly in the java package, not subpackages");
        System.out.println("It doesn't import java.util.*, java.io.*, etc.");
        System.out.println("Correct approach: import specific packages like java.util.* or specific classes");
        System.out.println();
        
        // ERROR 4: Name conflicts with imports
        System.out.println("ERROR 4: Name conflicts with imports");
        System.out.println("When two packages have classes with the same name, conflicts can occur:");
        System.out.println("Example: java.util.Date and java.sql.Date");
        System.out.println("If you import both, the compiler won't know which one to use");
        System.out.println("Solution: Use fully qualified names for at least one of them:");
        System.out.println("java.util.Date utilDate = new java.util.Date();");
        System.out.println("java.sql.Date sqlDate = new java.sql.Date(0);");
        System.out.println();
        
        // ERROR 5: Misunderstanding package structure
        System.out.println("ERROR 5: Misunderstanding package structure");
        System.out.println("Packages use a hierarchical structure, but subpackages are not automatically imported");
        System.out.println("Example: importing java.util.* does NOT import java.util.concurrent.*");
        System.out.println("Each package level needs its own import statement");
        System.out.println();
        
        // ERROR 6: Confusing static imports
        System.out.println("ERROR 6: Confusing static imports");
        System.out.println("Regular imports are for classes, static imports are for static members");
        System.out.println("Incorrect: import java.lang.Math; // Regular import for a class");
        System.out.println("Then using: double value = PI; // Error: PI is not defined");
        System.out.println("Correct: import static java.lang.Math.PI; // Static import");
        System.out.println("Then using: double value = PI; // Works with static import");
        System.out.println();
        
        // ERROR 7: Assuming all useful classes are in java.lang
        System.out.println("ERROR 7: Assuming all useful classes are in java.lang");
        System.out.println("Many essential classes are NOT in java.lang and require imports:");
        System.out.println("- Collections (ArrayList, HashMap) are in java.util");
        System.out.println("- File I/O classes are in java.io");
        System.out.println("- Networking classes are in java.net");
        System.out.println("- Modern date/time classes are in java.time");
        System.out.println();
        
        // ERROR 8: Confusing package names with directory structure
        System.out.println("ERROR 8: Confusing package names with directory structure");
        System.out.println("Package names should match directory structure in source code");
        System.out.println("Example: class in package com.example.app should be in directory com/example/app/");
        System.out.println("Mismatch between package declaration and directory structure causes errors");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Common Errors with Java Packages ---");
        System.out.println("1. Unnecessarily importing java.lang classes");
        System.out.println("2. Forgetting to import non-java.lang classes");
        System.out.println("3. Misunderstanding wildcard imports (import java.* doesn't import subpackages)");
        System.out.println("4. Not handling name conflicts between packages");
        System.out.println("5. Confusing regular imports with static imports");
        System.out.println("6. Assuming all commonly used classes are in java.lang");
        System.out.println("7. Misalignment between package names and directory structure");
    }
}
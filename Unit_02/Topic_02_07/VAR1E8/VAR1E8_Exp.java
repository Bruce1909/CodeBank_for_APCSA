/**
 * VAR1E8_Exp.java
 * 
 * This program demonstrates Java packages and the java.lang package.
 * 
 * Knowledge Points: VAR-1.E.8, VAR-1.E.9
 * - Classes in the APIs and libraries are grouped into packages
 * - The String class is part of the java.lang package. Classes in the java.lang package are available by default.
 */
public class VAR1E8_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Java Packages and the java.lang Package:\n");
        
        // Example 1: Using classes from the java.lang package (no import needed)
        System.out.println("Example 1: Using classes from the java.lang package (no import needed)");
        String text = "Hello, World!"; // String is in java.lang
        System.out.println("String object: \"" + text + "\"");
        
        Integer number = 42; // Integer is in java.lang
        System.out.println("Integer object: " + number);
        
        Math.sqrt(16); // Math is in java.lang
        System.out.println("Math.sqrt(16): " + Math.sqrt(16));
        
        System.out.println("These classes are all from the java.lang package, which is imported by default");
        System.out.println();
        
        // Example 2: Common Java packages and their purposes
        System.out.println("Example 2: Common Java packages and their purposes");
        System.out.println("java.lang - Core classes (String, Math, Integer, etc.)");
        System.out.println("java.util - Utility classes (ArrayList, HashMap, Scanner, etc.)");
        System.out.println("java.io - Input/output operations (File, InputStream, etc.)");
        System.out.println("java.net - Networking capabilities (URL, Socket, etc.)");
        System.out.println("java.time - Date and time API (LocalDate, LocalTime, etc.)");
        System.out.println("java.awt - Abstract Window Toolkit for GUI components");
        System.out.println("javax.swing - Swing GUI components");
        System.out.println();
        
        // Example 3: Demonstrating the need for imports with non-java.lang packages
        System.out.println("Example 3: Demonstrating the need for imports with non-java.lang packages");
        System.out.println("To use ArrayList, we need: import java.util.ArrayList;");
        System.out.println("To use File, we need: import java.io.File;");
        System.out.println("To use JFrame, we need: import javax.swing.JFrame;");
        System.out.println();
        
        // Example 4: Demonstrating the package structure
        System.out.println("Example 4: Demonstrating the package structure");
        System.out.println("Packages use a hierarchical naming convention:");
        System.out.println("java.util.concurrent - Concurrent utilities");
        System.out.println("java.util.function - Functional interfaces");
        System.out.println("javax.swing.text - Text components for Swing");
        System.out.println();
        
        // Example 5: Fully qualified class names
        System.out.println("Example 5: Fully qualified class names");
        System.out.println("Every class has a fully qualified name that includes its package:");
        System.out.println("java.lang.String - The String class");
        System.out.println("java.util.ArrayList - The ArrayList class");
        System.out.println("java.io.File - The File class");
        System.out.println();
        
        // Example 6: The java.lang package in detail
        System.out.println("Example 6: The java.lang package in detail");
        System.out.println("The java.lang package contains fundamental classes:");
        System.out.println("- String, StringBuilder, StringBuffer - String handling");
        System.out.println("- Integer, Double, Boolean, etc. - Wrapper classes for primitives");
        System.out.println("- Math - Mathematical functions");
        System.out.println("- System - System-related utilities");
        System.out.println("- Thread - Threading capabilities");
        System.out.println("- Exception, RuntimeException, etc. - Exception handling");
        System.out.println("- Object - The root class of all Java classes");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Java Packages ---");
        System.out.println("1. Packages organize classes into logical groups");
        System.out.println("2. The java.lang package is imported by default in all Java programs");
        System.out.println("3. Other packages must be explicitly imported to use their classes");
        System.out.println("4. Packages help prevent naming conflicts between classes");
        System.out.println("5. Packages provide access control and encapsulation");
    }
}
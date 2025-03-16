/**
 * VAR1F1_Exp - Wrapper Classes Package Example
 * 
 * This program demonstrates VAR-1.F.1:
 * The Integer class and Double class are part of the java.lang package.
 */
public class VAR1F1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.F.1: Integer and Double classes are part of java.lang package\n");
        
        // The java.lang package is automatically imported in every Java program
        // So we can use Integer and Double without explicit import statements
        
        // Creating Integer and Double objects
        Integer intObj = Integer.valueOf(100);
        Double doubleObj = Double.valueOf(3.14);
        
        // Demonstrating that these classes are from java.lang package
        System.out.println("The fully qualified name of the Integer class is: " + Integer.class.getName());
        System.out.println("The package of the Integer class is: " + Integer.class.getPackage().getName());
        System.out.println();
        
        System.out.println("The fully qualified name of the Double class is: " + Double.class.getName());
        System.out.println("The package of the Double class is: " + Double.class.getPackage().getName());
        System.out.println();
        
        // Demonstrating that java.lang is automatically imported
        System.out.println("Unlike other packages, java.lang is automatically imported.");
        System.out.println("This means we can use classes like Integer, Double, String, Math, etc.");
        System.out.println("without having to write import statements.");
        System.out.println();
        
        // Examples of other commonly used classes from java.lang
        System.out.println("Other commonly used classes from java.lang include:");
        System.out.println("- String: " + String.class.getName());
        System.out.println("- Math: " + Math.class.getName());
        System.out.println("- System: " + System.class.getName());
        System.out.println("- Exception: " + Exception.class.getName());
    }
}
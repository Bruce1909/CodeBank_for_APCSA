/**
 * MOD3E2_Exp.java
 * This program demonstrates that the Object class is part of the java.lang package.
 * 
 * MOD-3.E.2: The Object class is part of the java.lang package.
 */

public class MOD3E2_Exp {
    public static void main(String[] args) {
        // The java.lang package is automatically imported in all Java programs
        // So we can use Object without an explicit import statement
        
        System.out.println("Demonstrating that Object is part of the java.lang package:\n");
        
        // Create an Object instance
        Object obj = new Object();
        
        // Get the class of the object
        Class<?> objClass = obj.getClass();
        
        // Print the fully qualified name of the Object class
        System.out.println("Fully qualified name of Object class: " + objClass.getName());
        
        // Print the package name of the Object class
        Package objPackage = objClass.getPackage();
        System.out.println("Package name: " + objPackage.getName());
        
        // Demonstrate that other common classes are also in java.lang
        System.out.println("\nOther classes in the java.lang package:");
        
        // String class
        String str = "Hello";
        System.out.println("String class: " + str.getClass().getName());
        
        // Integer class
        Integer num = 42;
        System.out.println("Integer class: " + num.getClass().getName());
        
        // System class
        System.out.println("System class: " + System.class.getName());
        
        // Demonstrate that java.lang is automatically imported
        System.out.println("\nDemonstrating that java.lang is automatically imported:");
        
        // We can use these classes without import statements:
        Object object = new Object();
        String string = new String("Test");
        Integer integer = new Integer(10);
        Math math = null; // Cannot instantiate Math, but can reference it
        
        System.out.println("Created instances of java.lang classes without import statements");
        
        // Show that we can use the fully qualified name too
        java.lang.Object fullNameObject = new java.lang.Object();
        System.out.println("\nCreated Object using fully qualified name: " + fullNameObject);
        
        // Demonstrate that the Object class methods are available
        System.out.println("\nObject class methods from java.lang.Object:");
        System.out.println("toString(): " + obj.toString());
        System.out.println("hashCode(): " + obj.hashCode());
        System.out.println("getClass().getName(): " + obj.getClass().getName());
    }
}
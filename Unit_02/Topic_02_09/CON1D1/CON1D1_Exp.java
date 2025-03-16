/**
 * CON1D1_Exp.java
 * 
 * This program demonstrates that the Math class is part of the java.lang package.
 * Knowledge Point: CON-1.D.1 - The Math class is part of the java.lang package.
 */
public class CON1D1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating that Math class is part of java.lang package:\n");
        
        // Example 1: Using Math class without explicit import
        System.out.println("Example 1: Using Math class without explicit import");
        double value = 3.14159;
        double absValue = Math.abs(value);
        System.out.println("Math.abs(" + value + ") = " + absValue);
        System.out.println("Notice that we didn't need to import Math class");
        System.out.println();
        
        // Example 2: Examining the package of Math class
        System.out.println("Example 2: Examining the package of Math class");
        System.out.println("Math class's full name: " + Math.class.getName());
        System.out.println("Math class's package: " + Math.class.getPackage().getName());
        System.out.println();
        
        // Example 3: Other classes in java.lang package
        System.out.println("Example 3: Other classes in java.lang package");
        System.out.println("String class's package: " + String.class.getPackage().getName());
        System.out.println("Integer class's package: " + Integer.class.getPackage().getName());
        System.out.println("System class's package: " + System.class.getPackage().getName());
        System.out.println("All these classes are in java.lang and don't need explicit imports");
        System.out.println();
        
        // Example 4: Comparing with a class from another package
        System.out.println("Example 4: Comparing with a class from another package");
        System.out.println("To use classes from other packages, we need explicit imports.");
        System.out.println("For example, java.util.ArrayList would need: import java.util.ArrayList;");
        System.out.println("But Math is in java.lang, which is automatically imported.");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Math Class Package ---");
        System.out.println("1. The Math class is part of the java.lang package (CON-1.D.1)");
        System.out.println("2. Classes in the java.lang package are automatically imported");
        System.out.println("3. We don't need to write 'import java.lang.Math' to use Math class");
        System.out.println("4. Other commonly used classes in java.lang include String, System, and Integer");
    }
}
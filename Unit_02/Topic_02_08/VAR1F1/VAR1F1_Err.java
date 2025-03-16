/**
 * VAR1F1_Err - Wrapper Classes Package Error Example
 * 
 * This program demonstrates common errors related to VAR-1.F.1:
 * The Integer class and Double class are part of the java.lang package.
 */
public class VAR1F1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to VAR-1.F.1\n");
        
        // ERROR 1: Unnecessary import of java.lang classes
        System.out.println("ERROR 1: Unnecessary import of java.lang classes");
        System.out.println("The following import statement is unnecessary:");
        System.out.println("import java.lang.Integer; // Unnecessary - java.lang is automatically imported");
        System.out.println("import java.lang.Double;  // Unnecessary - java.lang is automatically imported");
        System.out.println();
        
        // ERROR 2: Confusion with other wrapper classes from different packages
        System.out.println("ERROR 2: Confusion with other wrapper classes from different packages");
        System.out.println("Unlike Integer and Double, some wrapper classes are NOT in java.lang:");
        System.out.println("- BigInteger and BigDecimal are in java.math package");
        System.out.println("- AtomicInteger and AtomicLong are in java.util.concurrent.atomic package");
        System.out.println();
        
        // Correct code example
        System.out.println("Correct usage: No import needed for Integer and Double");
        Integer num = 100;  // No import needed
        Double pi = 3.14;   // No import needed
        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + pi);
        System.out.println();
        
        // ERROR 3: Confusion between java.lang.Integer and other number-related classes
        System.out.println("ERROR 3: Confusion between java.lang.Integer and other number classes");
        System.out.println("Common confusion:");
        System.out.println("- Integer is in java.lang (automatically imported)");
        System.out.println("- NumberFormat is in java.text (requires explicit import)");
        System.out.println("- DecimalFormat is in java.text (requires explicit import)");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about java.lang Package ---");
        System.out.println("1. java.lang is the only package automatically imported in Java");
        System.out.println("2. Integer and Double are part of java.lang");
        System.out.println("3. No import statements are needed for java.lang classes");
        System.out.println("4. Other packages (java.util, java.io, etc.) require explicit imports");
    }
}
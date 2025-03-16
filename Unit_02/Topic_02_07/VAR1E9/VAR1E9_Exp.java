/**
 * VAR1E9_Exp.java
 * 
 * This program demonstrates that the String class is part of the java.lang package
 * and that classes in the java.lang package are available by default.
 * 
 * Knowledge Point: VAR-1.E.9
 * - The String class is part of the java.lang package. Classes in the java.lang package are available by default.
 */
public class VAR1E9_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating the java.lang Package and Default Imports:\n");
        
        // Example 1: Using String class without import
        System.out.println("Example 1: Using String class without import");
        String message = "Hello, java.lang package!";
        System.out.println("Created a String object: \"" + message + "\"");
        System.out.println("No import statement was needed for the String class");
        System.out.println();
        
        // Example 2: Other commonly used classes from java.lang
        System.out.println("Example 2: Other commonly used classes from java.lang");
        Integer intObject = 42;
        System.out.println("Integer object: " + intObject);
        
        Double doubleObject = 3.14159;
        System.out.println("Double object: " + doubleObject);
        
        Boolean boolObject = true;
        System.out.println("Boolean object: " + boolObject);
        
        Character charObject = 'A';
        System.out.println("Character object: " + charObject);
        
        System.out.println("All these wrapper classes are from java.lang and available by default");
        System.out.println();
        
        // Example 3: Math class from java.lang
        System.out.println("Example 3: Math class from java.lang");
        double squareRoot = Math.sqrt(25);
        System.out.println("Square root of 25: " + squareRoot);
        
        double sine = Math.sin(Math.PI / 2);
        System.out.println("Sine of 90 degrees (π/2): " + sine);
        
        double randomNumber = Math.random();
        System.out.println("Random number between 0 and 1: " + randomNumber);
        
        System.out.println("The Math class is from java.lang and available by default");
        System.out.println();
        
        // Example 4: System class from java.lang
        System.out.println("Example 4: System class from java.lang");
        long currentTime = System.currentTimeMillis();
        System.out.println("Current time in milliseconds: " + currentTime);
        
        String javaVersion = System.getProperty("java.version");
        System.out.println("Java version: " + javaVersion);
        
        System.out.println("The System class is from java.lang and available by default");
        System.out.println();
        
        // Example 5: Exception classes from java.lang
        System.out.println("Example 5: Exception classes from java.lang");
        try {
            // Deliberately cause an exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
            System.out.println("ArithmeticException is from java.lang and available by default");
        }
        System.out.println();
        
        // Example 6: Object class from java.lang
        System.out.println("Example 6: Object class from java.lang");
        Object obj = new Object();
        System.out.println("Created an Object: " + obj);
        System.out.println("The Object class is the root of all Java classes");
        System.out.println("It's from java.lang and available by default");
        System.out.println();
        
        // Example 7: Comparing with classes that need imports
        System.out.println("Example 7: Comparing with classes that need imports");
        System.out.println("Classes NOT in java.lang require explicit imports:");
        System.out.println("- ArrayList (java.util.ArrayList)");
        System.out.println("- File (java.io.File)");
        System.out.println("- Scanner (java.util.Scanner)");
        System.out.println("- LocalDate (java.time.LocalDate)");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about java.lang Package ---");
        System.out.println("1. The java.lang package is imported by default in all Java programs");
        System.out.println("2. String class is part of the java.lang package");
        System.out.println("3. Other important classes in java.lang include Math, System, Object, and wrapper classes");
        System.out.println("4. No import statements are needed to use classes from java.lang");
        System.out.println("5. Classes from other packages require explicit import statements");
    }
}
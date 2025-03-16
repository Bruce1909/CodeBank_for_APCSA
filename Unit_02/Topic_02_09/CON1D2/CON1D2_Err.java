/**
 * CON1D2_Err.java
 * 
 * This program demonstrates common errors related to the Math class containing only static methods.
 * Knowledge Point: CON-1.D.2 - The Math class contains only static methods.
 */
public class CON1D2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors Related to Math Class Static Methods:\n");
        
        // Error 1: Attempting to instantiate the Math class
        System.out.println("Error 1: Attempting to instantiate the Math class");
        System.out.println("// Math mathObj = new Math(); // Error: Math constructor is private");
        System.out.println("The Math class has a private constructor to prevent instantiation.");
        System.out.println("Since all methods are static, there's no need to create Math objects.");
        System.out.println();
        
        // Error 2: Trying to use Math methods as if they were instance methods
        System.out.println("Error 2: Trying to use Math methods as if they were instance methods");
        System.out.println("// Math mathObj = getMathInstance(); // Hypothetical method");
        System.out.println("// double result = mathObj.sqrt(25.0); // Error: sqrt is static, not instance method");
        System.out.println("Math methods should be called on the class itself, not on instances:");
        System.out.println("Correct: Math.sqrt(25.0) = " + Math.sqrt(25.0));
        System.out.println();
        
        // Error 3: Creating a subclass of Math
        System.out.println("Error 3: Creating a subclass of Math");
        System.out.println("// class MyMath extends Math { // Error: Math class is final");
        System.out.println("//     public static double cubeRoot(double x) { return Math.pow(x, 1.0/3.0); }");
        System.out.println("// }");
        System.out.println("The Math class is declared as 'final' and cannot be extended.");
        System.out.println("Instead, create a utility class with your own static methods.");
        System.out.println();
        
        // Error 4: Trying to modify Math constants
        System.out.println("Error 4: Trying to modify Math constants");
        System.out.println("// Math.PI = 3.14; // Error: PI is a final constant");
        System.out.println("Math constants like PI and E are declared as 'public static final'.");
        System.out.println("They cannot be modified after initialization.");
        System.out.println("Current value of Math.PI: " + Math.PI);
        System.out.println();
        
        // Error 5: Misunderstanding static vs. instance context
        System.out.println("Error 5: Misunderstanding static vs. instance context");
        System.out.println("In a class with both static and instance methods:");
        System.out.println("// class Calculator {");
        System.out.println("//     private double memory;");
        System.out.println("//     public void store(double value) { memory = value; }");
        System.out.println("//     public static double sqrt(double x) { return Math.sqrt(x); }");
        System.out.println("//     public static void printMemory() { System.out.println(memory); } // Error: Cannot access instance variable");
        System.out.println("// }");
        System.out.println("Static methods cannot directly access instance variables or methods.");
        System.out.println("They can only access other static members of the class.");
        System.out.println();
        
        // Summary of common errors
        System.out.println("--- Common Errors Related to Math Class Static Methods ---");
        System.out.println("1. Attempting to instantiate the Math class (it has a private constructor)");
        System.out.println("2. Trying to use Math methods as if they were instance methods");
        System.out.println("3. Attempting to extend the Math class (it's declared as final)");
        System.out.println("4. Trying to modify Math constants (they are final)");
        System.out.println("5. Misunderstanding the limitations of static methods (cannot access instance members)");
    }
}
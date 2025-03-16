/**
 * MOD1D3_Err - Error examples demonstrating common mistakes when utilizing existing classes
 * 
 * This program demonstrates common errors related to MOD-1.D.3:
 * Existing classes and class libraries can be utilized as appropriate to create objects.
 */
public class MOD1D3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when utilizing existing classes and libraries:\n");
        
        // Example 1: Forgetting to import or use fully qualified names
        System.out.println("Example 1: Forgetting to import or use fully qualified names");
        System.out.println("// Error: ArrayList<String> list = new ArrayList<>(); // Missing import or qualification");
        System.out.println("// This would cause a compilation error if java.util.ArrayList is not imported");
        
        // Correct way
        System.out.println("Correct way:");
        System.out.println("// Option 1: Use fully qualified name");
        java.util.ArrayList<String> list1 = new java.util.ArrayList<>();
        System.out.println("java.util.ArrayList<String> list1 = new java.util.ArrayList<>();");
        
        System.out.println("// Option 2: Import the class (at the top of the file)");
        System.out.println("// import java.util.ArrayList;");
        System.out.println("// ArrayList<String> list2 = new ArrayList<>();");
        System.out.println();
        
        // Example 2: Using a class that doesn't exist in the specified package
        System.out.println("Example 2: Using a class that doesn't exist in the specified package");
        System.out.println("// Error: java.util.StringFormatter formatter = new java.util.StringFormatter();");
        System.out.println("// This would cause a compilation error because StringFormatter doesn't exist in java.util");
        
        // Correct way
        System.out.println("Correct way:");
        System.out.println("// Check the Java API documentation for the correct class and package");
        java.util.Formatter formatter = new java.util.Formatter();
        System.out.println("java.util.Formatter formatter = new java.util.Formatter(); // Correct class name");
        System.out.println();
        
        // Example 3: Using a method that doesn't exist in the class
        System.out.println("Example 3: Using a method that doesn't exist in the class");
        String text = "Hello, world!";
        System.out.println("String text = \"Hello, world!\";");
        System.out.println("// Error: text.reverse(); // The String class doesn't have a reverse() method");
        System.out.println("// This would cause a compilation error");
        
        // Correct way
        System.out.println("Correct way:");
        System.out.println("// Use StringBuilder or StringBuffer which have reverse() method");
        StringBuilder sb = new StringBuilder(text);
        System.out.println("StringBuilder sb = new StringBuilder(text);");
        System.out.println("Reversed text: " + sb.reverse());
        System.out.println();
        
        // Example 4: Using a deprecated class or method
        System.out.println("Example 4: Using a deprecated class or method");
        System.out.println("// Warning: java.util.Date date = new java.util.Date(2023, 5, 15);");
        System.out.println("// This constructor is deprecated and doesn't work as expected");
        
        // Correct way
        System.out.println("Correct way:");
        System.out.println("// Use the newer java.time package introduced in Java 8");
        java.time.LocalDate date = java.time.LocalDate.of(2023, 5, 15);
        System.out.println("java.time.LocalDate date = java.time.LocalDate.of(2023, 5, 15);");
        System.out.println("Date: " + date);
        System.out.println();
        
        // Example 5: Not handling exceptions from library classes
        System.out.println("Example 5: Not handling exceptions from library classes");
        System.out.println("// Error: java.io.FileReader reader = new java.io.FileReader(\"nonexistent.txt\");");
        System.out.println("// This would throw a FileNotFoundException that must be caught or declared");
        
        // Correct way
        System.out.println("Correct way:");
        System.out.println("// Handle the exception with try-catch");
        System.out.println("try {");
        System.out.println("    java.io.FileReader reader = new java.io.FileReader(\"nonexistent.txt\");");
        System.out.println("} catch (java.io.FileNotFoundException e) {");
        System.out.println("    System.out.println(\"File not found: \" + e.getMessage());");
        System.out.println("}");
        
        // Demonstrate the correct way
        try {
            java.io.FileReader reader = new java.io.FileReader("nonexistent.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors When Utilizing Existing Classes and Libraries ---");
        System.out.println("1. Forgetting to import or use fully qualified names for classes");
        System.out.println("2. Using a class that doesn't exist in the specified package");
        System.out.println("3. Calling methods that don't exist in the class");
        System.out.println("4. Using deprecated classes or methods");
        System.out.println("5. Not handling required exceptions from library classes");
    }
}
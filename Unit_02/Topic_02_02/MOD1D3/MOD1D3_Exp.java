/**
 * MOD1D3_Exp - Example demonstrating utilization of existing classes and class libraries
 * 
 * This program demonstrates MOD-1.D.3:
 * Existing classes and class libraries can be utilized as appropriate to create objects.
 */
public class MOD1D3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating utilization of existing classes and class libraries:\n");
        
        // Example 1: Using Java's built-in String class
        System.out.println("Example 1: Using Java's built-in String class");
        String greeting = new String("Hello, world!");
        System.out.println("Created String object: " + greeting);
        System.out.println("String length: " + greeting.length());
        System.out.println("Uppercase: " + greeting.toUpperCase());
        System.out.println();
        
        // Example 2: Using Java's ArrayList class from java.util package
        System.out.println("Example 2: Using ArrayList from java.util package");
        java.util.ArrayList<String> nameList = new java.util.ArrayList<>();
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.add("Charlie");
        System.out.println("Created ArrayList: " + nameList);
        System.out.println("Size of ArrayList: " + nameList.size());
        System.out.println("First element: " + nameList.get(0));
        System.out.println();
        
        // Example 3: Using Java's Random class from java.util package
        System.out.println("Example 3: Using Random class from java.util package");
        java.util.Random random = new java.util.Random();
        int randomNumber = random.nextInt(100); // Random number between 0 and 99
        System.out.println("Generated random number: " + randomNumber);
        System.out.println();
        
        // Example 4: Using Java's Date class from java.util package
        System.out.println("Example 4: Using Date class from java.util package");
        java.util.Date currentDate = new java.util.Date();
        System.out.println("Current date and time: " + currentDate);
        System.out.println();
        
        // Example 5: Using a custom class from our own "library"
        System.out.println("Example 5: Using a custom class from our own library");
        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("5 - 3 = " + calc.subtract(5, 3));
        System.out.println("5 * 3 = " + calc.multiply(5, 3));
        System.out.println("5 / 3 = " + calc.divide(5, 3));
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Using Existing Classes and Libraries ---");
        System.out.println("1. Java provides many built-in classes ready to use");
        System.out.println("2. Classes from packages can be imported or used with fully qualified names");
        System.out.println("3. Using existing classes saves development time and effort");
        System.out.println("4. The Java API documentation helps you find and use existing classes");
        System.out.println("5. Custom classes can form your own libraries for reuse");
    }
}

/**
 * A simple Calculator class that serves as our own "library" class
 */
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
/**
 * MOD1E2_Err.java
 * 
 * This program demonstrates common errors related to procedural abstraction.
 * 
 * Knowledge Point: MOD-1.E.2
 * Procedural abstraction allows a programmer to use a method by knowing what the method does
 * even if they do not know how the method was written.
 */
public class MOD1E2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to procedural abstraction:\n");
        
        // ERROR 1: Trying to modify the implementation of a method instead of using abstraction
        System.out.println("ERROR 1: Trying to modify the implementation instead of using abstraction");
        Calculator calc = new Calculator();
        
        // Instead of simply using the add method as intended:
        calc.add(5, 3);
        
        System.out.println("\nThe following would be incorrect (trying to modify the implementation):");
        System.out.println("// Incorrect approach: trying to reimplement the addition logic");
        System.out.println("int a = 5, b = 3;");
        System.out.println("int result = a + b;");
        System.out.println("System.out.println(a + \" + \" + b + \" = \" + result);");
        System.out.println("// This defeats the purpose of procedural abstraction\n");
        
        // ERROR 2: Assuming knowledge about the implementation details
        System.out.println("ERROR 2: Assuming knowledge about the implementation details");
        System.out.println("The following code would be incorrect:");
        System.out.println("// Incorrect: assuming the implementation uses a specific algorithm");
        System.out.println("// calc.useQuickSortAlgorithm(); // Error: method doesn't exist");
        System.out.println("// This assumes knowledge about HOW the method works internally\n");
        
        // ERROR 3: Trying to access private implementation details
        System.out.println("ERROR 3: Trying to access private implementation details");
        Database db = new Database();
        db.connect();
        
        System.out.println("\nThe following would cause a compilation error:");
        System.out.println("// db.connectionString = \"jdbc:mysql://localhost:3306/mydb\"; // Error: private field");
        System.out.println("// This tries to access the internal implementation details\n");
        
        // ERROR 4: Reimplementing functionality instead of reusing existing methods
        System.out.println("ERROR 4: Reimplementing functionality instead of reusing methods");
        System.out.println("Instead of using the square method:");
        calc.square(4);
        
        System.out.println("\nThe following reimplements the functionality unnecessarily:");
        System.out.println("int num = 4;");
        System.out.println("int squared = num * num;");
        System.out.println("System.out.println(num + \"² = \" + squared);");
        System.out.println("// This defeats the purpose of procedural abstraction\n");
    }
}

// Calculator class with methods that demonstrate procedural abstraction
class Calculator {
    // Implementation details are hidden from the user
    private int lastResult;
    
    public void add(int a, int b) {
        lastResult = a + b;
        System.out.println(a + " + " + b + " = " + lastResult);
    }
    
    public void square(int a) {
        lastResult = a * a;
        System.out.println(a + "² = " + lastResult);
    }
    
    // Private helper method - part of the implementation, not the interface
    private void saveResult(int result) {
        lastResult = result;
    }
}

// Database class with methods that demonstrate procedural abstraction
class Database {
    // Implementation details are hidden from the user
    private String connectionString;
    private boolean isConnected;
    
    public void connect() {
        // Complex implementation details hidden from the user
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        isConnected = true;
        System.out.println("Database connected successfully");
    }
    
    // Private helper method - part of the implementation, not the interface
    private boolean checkConnection() {
        return isConnected;
    }
}
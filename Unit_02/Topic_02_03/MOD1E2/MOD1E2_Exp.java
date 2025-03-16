/**
 * MOD1E2_Exp.java
 * 
 * This program demonstrates procedural abstraction, which allows a programmer to use a method
 * by knowing what the method does even if they do not know how the method was written.
 * 
 * Knowledge Point: MOD-1.E.2
 * Procedural abstraction allows a programmer to use a method by knowing what the method does
 * even if they do not know how the method was written.
 */
public class MOD1E2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating procedural abstraction:\n");
        
        // Create a Calculator object
        Calculator calc = new Calculator();
        
        // Use the calculator's methods without knowing how they are implemented
        System.out.println("Using calculator methods through procedural abstraction:");
        
        // We know WHAT these methods do, but we don't need to know HOW they do it
        calc.add(10, 5);          // We know it adds two numbers
        calc.subtract(10, 5);     // We know it subtracts the second number from the first
        calc.multiply(10, 5);     // We know it multiplies two numbers
        calc.divide(10, 5);       // We know it divides the first number by the second
        calc.square(5);           // We know it squares a number
        
        System.out.println("\nUsing database methods through procedural abstraction:");
        
        // Create a Database object
        Database db = new Database();
        
        // Use database methods without knowing their implementation details
        db.connect();             // We know it connects to a database
        db.saveData("user123");   // We know it saves data
        db.disconnect();          // We know it disconnects from the database
    }
}

// Calculator class with methods that demonstrate procedural abstraction
class Calculator {
    // Users of this class only need to know WHAT these methods do,
    // not HOW they perform their calculations
    
    public void add(int a, int b) {
        // The implementation could be simple or complex, but users don't need to know
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }
    
    public void subtract(int a, int b) {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }
    
    public void multiply(int a, int b) {
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }
    
    public void divide(int a, int b) {
        // The implementation handles division by zero, but users don't need to know how
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return;
        }
        int result = a / b;
        System.out.println(a + " / " + b + " = " + result);
    }
    
    public void square(int a) {
        int result = a * a;
        System.out.println(a + "² = " + result);
    }
}

// Database class with methods that demonstrate procedural abstraction
class Database {
    // Users only need to know WHAT these methods do, not HOW they work
    
    public void connect() {
        // The actual implementation could involve complex connection logic
        // but users only need to know that this method establishes a connection
        System.out.println("Database connected successfully");
    }
    
    public void saveData(String data) {
        // The actual implementation could involve complex data storage operations
        // but users only need to know that this method saves the data
        System.out.println("Data '" + data + "' saved successfully");
    }
    
    public void disconnect() {
        // The actual implementation could involve complex cleanup operations
        // but users only need to know that this method closes the connection
        System.out.println("Database disconnected successfully");
    }
}
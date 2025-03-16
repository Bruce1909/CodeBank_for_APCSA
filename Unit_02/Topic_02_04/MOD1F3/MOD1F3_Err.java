/**
 * MOD1F3_Err.java
 * 
 * This program demonstrates common errors related to method overloading.
 * 
 * Knowledge Point: MOD-1.F.3
 * Methods are said to be overloaded when there are multiple methods with the same name but a different signature.
 */
public class MOD1F3_Err {
    public static void main(String[] args) {
        // Create an instance of the class to call non-static methods
        MOD1F3_Err demo = new MOD1F3_Err();
        
        System.out.println("Demonstrating common errors with method overloading:\n");
        
        // ERROR 1: Attempting to overload methods with only different return types
        System.out.println("ERROR 1: Attempting to overload methods with only different return types");
        System.out.println("The following methods would cause a compilation error if uncommented:");
        System.out.println("public int getValue() { return 42; }");
        System.out.println("public double getValue() { return 42.0; }");
        System.out.println("Methods cannot be overloaded based on return type alone.");
        System.out.println();
        
        // ERROR 2: Confusion about method resolution with overloaded methods
        System.out.println("ERROR 2: Confusion about method resolution with overloaded methods");
        System.out.println("Method signatures: process(int) and process(long)");
        System.out.println("Calling process(10) calls process(int), not process(long):");
        demo.process(10); // Calls process(int), not process(long)
        System.out.println();
        
        // ERROR 3: Ambiguous method calls
        System.out.println("ERROR 3: Ambiguous method calls");
        System.out.println("Method signatures: ambiguousMethod(int, double) and ambiguousMethod(double, int)");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // demo.ambiguousMethod(1, 1); // Error: reference to ambiguousMethod is ambiguous
        System.out.println("The compiler cannot determine which method to call.");
        System.out.println();
        
        // ERROR 4: Confusion with type promotion in overloaded methods
        System.out.println("ERROR 4: Confusion with type promotion in overloaded methods");
        System.out.println("Method signatures: show(int) and show(double)");
        System.out.println("When calling show(10), Java calls show(int):");
        demo.show(10); // Calls show(int)
        System.out.println("\nWhen calling show(10.0), Java calls show(double):");
        demo.show(10.0); // Calls show(double)
        System.out.println("\nWhen calling show('A'), Java promotes char to int and calls show(int):");
        demo.show('A'); // Calls show(int) because char is promoted to int
        System.out.println();
        
        // ERROR 5: Confusion with varargs and overloading
        System.out.println("ERROR 5: Confusion with varargs and overloading");
        System.out.println("Method signatures: printValues(int...) and printValues(int, int)");
        System.out.println("When calling printValues(1, 2), Java calls printValues(int, int):");
        demo.printValues(1, 2); // Calls printValues(int, int), not printValues(int...)
        System.out.println("\nWhen calling printValues(1, 2, 3), Java calls printValues(int...):");
        demo.printValues(1, 2, 3); // Calls printValues(int...)
        System.out.println();
        
        // ERROR 6: Confusion with null arguments and overloaded methods
        System.out.println("ERROR 6: Confusion with null arguments and overloaded methods");
        System.out.println("Method signatures: handleObject(String) and handleObject(StringBuilder)");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // demo.handleObject(null); // Error: reference to handleObject is ambiguous
        System.out.println("The compiler cannot determine which method to call with null.");
        System.out.println("To fix this, we need to cast the null value:");
        demo.handleObject((String)null); // Explicitly cast to String
        System.out.println();
        
        // ERROR 7: Confusion with autoboxing and overloaded methods
        System.out.println("ERROR 7: Confusion with autoboxing and overloaded methods");
        System.out.println("Method signatures: processValue(int) and processValue(Integer)");
        System.out.println("When calling processValue(10), Java calls processValue(int):");
        demo.processValue(10); // Calls processValue(int), not processValue(Integer)
        System.out.println("\nWhen calling processValue with a null, we must use the reference type:");
        demo.processValue((Integer)null); // Must call processValue(Integer) with null
        System.out.println();
        
        // Correct method calls for reference
        System.out.println("Correct method calls for reference:");
        demo.greet("Alice"); // Calls greet(String)
        demo.greet("Bob", "Welcome!"); // Calls greet(String, String)
    }
    
    // Methods with the same name but different parameter lists (valid overloading)
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    public void greet(String name, String message) {
        System.out.println(message + " " + name + "!");
    }
    
    // Overloaded methods with different parameter types
    public void process(int value) {
        System.out.println("Processing int: " + value);
    }
    
    public void process(long value) {
        System.out.println("Processing long: " + value);
    }
    
    // Methods that can cause ambiguous calls
    public void ambiguousMethod(int a, double b) {
        System.out.println("Called ambiguousMethod(int, double)");
    }
    
    public void ambiguousMethod(double a, int b) {
        System.out.println("Called ambiguousMethod(double, int)");
    }
    
    // Methods demonstrating type promotion
    public void show(int value) {
        System.out.println("show(int): " + value);
    }
    
    public void show(double value) {
        System.out.println("show(double): " + value);
    }
    
    // Methods demonstrating varargs and overloading
    public void printValues(int... values) {
        System.out.print("printValues(int...): ");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public void printValues(int a, int b) {
        System.out.println("printValues(int, int): " + a + ", " + b);
    }
    
    // Methods demonstrating null argument ambiguity
    public void handleObject(String str) {
        System.out.println("handleObject(String): " + (str == null ? "null" : str));
    }
    
    public void handleObject(StringBuilder sb) {
        System.out.println("handleObject(StringBuilder): " + (sb == null ? "null" : sb.toString()));
    }
    
    // Methods demonstrating autoboxing with overloading
    public void processValue(int value) {
        System.out.println("processValue(int): " + value);
    }
    
    public void processValue(Integer value) {
        System.out.println("processValue(Integer): " + (value == null ? "null" : value));
    }
    
    // The following methods would cause a compilation error if uncommented
    // because methods cannot be overloaded based on return type alone
    /*
    public int getValue() {
        return 42;
    }
    
    public double getValue() {
        return 42.0;
    }
    */
}
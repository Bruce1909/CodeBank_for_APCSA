/**
 * MOD1F1_Exp.java
 * 
 * This program demonstrates method signatures for methods with parameters.
 * 
 * Knowledge Point: MOD-1.F.1
 * A method signature for a method with parameters consists of the method name and the ordered list of parameter types.
 */
public class MOD1F1_Exp {
    public static void main(String[] args) {
        // Create an instance of the class to call non-static methods
        MOD1F1_Exp demo = new MOD1F1_Exp();
        
        // Call methods with different signatures
        System.out.println("Calling methods with different signatures:\n");
        
        // Method with no parameters
        System.out.println("Calling greet() - no parameters:");
        demo.greet();
        
        // Method with one String parameter
        System.out.println("\nCalling greet(String name) - one String parameter:");
        demo.greet("Alice");
        
        // Method with one int parameter
        System.out.println("\nCalling displayNumber(int num) - one int parameter:");
        demo.displayNumber(42);
        
        // Method with two parameters (String and int)
        System.out.println("\nCalling displayPersonInfo(String name, int age) - two parameters (String, int):");
        demo.displayPersonInfo("Bob", 25);
        
        // Method with two parameters (int and String)
        System.out.println("\nCalling displayIdInfo(int id, String department) - two parameters (int, String):");
        demo.displayIdInfo(1001, "Engineering");
        
        // Method with three parameters
        System.out.println("\nCalling calculateAndDisplay(int a, int b, String operation) - three parameters (int, int, String):");
        demo.calculateAndDisplay(10, 5, "add");
        
        // Explain method signatures
        System.out.println("\n--- Method Signature Explanation ---");
        System.out.println("A method signature consists of:");
        System.out.println("1. The method name");
        System.out.println("2. The ordered list of parameter types (not parameter names)");
        System.out.println("\nExamples of method signatures in this program:");
        System.out.println("- greet()");
        System.out.println("- greet(String)");
        System.out.println("- displayNumber(int)");
        System.out.println("- displayPersonInfo(String, int)");
        System.out.println("- displayIdInfo(int, String)");
        System.out.println("- calculateAndDisplay(int, int, String)");
    }
    
    // Method with no parameters
    public void greet() {
        System.out.println("Hello, World!");
    }
    
    // Method with one String parameter
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    // Method with one int parameter
    public void displayNumber(int num) {
        System.out.println("The number is: " + num);
    }
    
    // Method with two parameters (String and int)
    public void displayPersonInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    // Method with two parameters (int and String) - different order from displayPersonInfo
    public void displayIdInfo(int id, String department) {
        System.out.println("ID: " + id + ", Department: " + department);
    }
    
    // Method with three parameters
    public void calculateAndDisplay(int a, int b, String operation) {
        int result = 0;
        
        if (operation.equals("add")) {
            result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        } else if (operation.equals("subtract")) {
            result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        } else if (operation.equals("multiply")) {
            result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        } else if (operation.equals("divide")) {
            if (b != 0) {
                result = a / b;
                System.out.println(a + " / " + b + " = " + result);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Unknown operation: " + operation);
        }
    }
}
/**
 * MOD1E7_Exp.java
 * 
 * This program demonstrates that void methods do not have return values and are
 * therefore not called as part of an expression.
 * 
 * Knowledge Point: MOD-1.E.7
 * Void methods do not have return values and are therefore not called as part of an expression.
 */
public class MOD1E7_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating void methods and how they are called:\n");
        
        // Create an instance of the class to call non-static methods
        MOD1E7_Exp demo = new MOD1E7_Exp();
        
        // Calling void methods - they perform actions but don't return values
        System.out.println("Calling void methods (they perform actions but don't return values):");
        demo.displayMessage();  // Called as a statement, not part of an expression
        demo.printCurrentTime();  // Called as a statement, not part of an expression
        
        // For comparison, calling non-void methods that return values
        System.out.println("\nFor comparison, calling non-void methods (they return values):");
        
        // Non-void methods can be used in expressions because they return values
        int sum = demo.add(5, 3);  // The return value is stored in a variable
        System.out.println("Sum: " + sum);
        
        // Non-void methods can be used directly in expressions
        System.out.println("Product: " + demo.multiply(4, 6));  // Used directly in an expression
        
        // Demonstrate the difference between void and non-void methods
        System.out.println("\nDemonstrating the difference between void and non-void methods:");
        
        // Create a TextProcessor object
        TextProcessor processor = new TextProcessor();
        
        // Void method - called as a statement
        processor.printText("Hello");  // Called as a statement
        
        // Non-void method - can be used in expressions
        String processed = processor.processText("World");  // Return value stored in a variable
        System.out.println("Processed text: " + processed);
    }
    
    // Void method - performs an action but doesn't return a value
    public void displayMessage() {
        System.out.println("This is a void method - it performs an action but doesn't return a value.");
        // No return statement with a value
    }
    
    // Another void method - performs an action but doesn't return a value
    public void printCurrentTime() {
        System.out.println("Current time: " + java.time.LocalTime.now());
        // No return statement with a value
    }
    
    // Non-void method - returns an int value
    public int add(int a, int b) {
        return a + b;  // Returns a value that can be used in expressions
    }
    
    // Another non-void method - returns an int value
    public int multiply(int a, int b) {
        return a * b;  // Returns a value that can be used in expressions
    }
}

// Class with both void and non-void methods for comparison
class TextProcessor {
    // Void method - performs an action but doesn't return a value
    public void printText(String text) {
        System.out.println("Printing: " + text);
        // No return statement with a value
    }
    
    // Non-void method - returns a String value
    public String processText(String text) {
        return text.toUpperCase() + "!";  // Returns a value that can be used in expressions
    }
}
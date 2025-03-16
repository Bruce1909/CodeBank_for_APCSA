/**
 * MOD1E7_Err.java
 * 
 * This program demonstrates common errors related to void methods not having return values
 * and therefore not being callable as part of an expression.
 * 
 * Knowledge Point: MOD-1.E.7
 * Void methods do not have return values and are therefore not called as part of an expression.
 */
public class MOD1E7_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with void methods:\n");
        
        // Create an instance of the class to call non-static methods
        MOD1E7_Err demo = new MOD1E7_Err();
        
        // ERROR 1: Trying to use a void method as part of an expression
        System.out.println("ERROR 1: Trying to use a void method as part of an expression");
        System.out.println("The following line would cause a compilation error:");
        // int result = demo.displayMessage();  // Error: void cannot be converted to int
        System.out.println("Void methods don't return values, so they can't be assigned to variables.\n");
        
        // ERROR 2: Trying to use a void method in a mathematical expression
        System.out.println("ERROR 2: Trying to use a void method in a mathematical expression");
        System.out.println("The following line would cause a compilation error:");
        // int calculation = 5 + demo.printNumber(10);  // Error: void cannot be converted to int
        System.out.println("Void methods don't return values, so they can't be used in calculations.\n");
        
        // ERROR 3: Trying to use a void method as an argument to another method
        System.out.println("ERROR 3: Trying to use a void method as an argument to another method");
        System.out.println("The following line would cause a compilation error:");
        // System.out.println(demo.displayMessage());  // Error: void cannot be converted to String
        System.out.println("Void methods don't return values, so they can't be used as method arguments.\n");
        
        // ERROR 4: Confusing void methods with non-void methods
        System.out.println("ERROR 4: Confusing void methods with non-void methods");
        System.out.println("The following demonstrates the difference:");
        
        // This is correct - calling a non-void method and using its return value
        int sum = demo.add(5, 3);
        System.out.println("Result of add method: " + sum);
        
        // This is correct - calling a void method as a statement
        demo.displaySum(5, 3);
        
        System.out.println("\nThe displaySum method performs the same calculation as add,");
        System.out.println("but it prints the result directly instead of returning it.\n");
        
        // ERROR 5: Trying to return a value from a void method
        System.out.println("ERROR 5: Trying to return a value from a void method");
        System.out.println("The following code would cause a compilation error:");
        System.out.println("public void invalidMethod() {");
        System.out.println("    // Error: cannot return a value from method with void result type");
        System.out.println("    return 42;");
        System.out.println("}\n");
    }
    
    // Void method - performs an action but doesn't return a value
    public void displayMessage() {
        System.out.println("This is a void method that doesn't return a value.");
    }
    
    // Another void method - performs an action but doesn't return a value
    public void printNumber(int num) {
        System.out.println("The number is: " + num);
    }
    
    // Non-void method - returns an int value
    public int add(int a, int b) {
        return a + b;  // Returns a value that can be used in expressions
    }
    
    // Void method that performs the same calculation as add but doesn't return a value
    public void displaySum(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        // No return statement with a value
    }
    
    // Void method with a return statement (no value)
    public void methodWithReturn() {
        System.out.println("This method will exit early.");
        return;  // Valid in void methods - exits the method without returning a value
        // System.out.println("This line will never execute.");
    }
}
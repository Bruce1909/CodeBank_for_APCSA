/**
 * MOD1E4_Exp.java
 * 
 * This program demonstrates how method calls interrupt the sequential execution of statements.
 * 
 * Knowledge Point: MOD-1.E.4
 * A method or constructor call interrupts the sequential execution of statements, causing the program
 * to first execute the statements in the method or constructor before continuing. Once the last
 * statement in the method or constructor has executed or a return statement is executed, flow of
 * control is returned to the point immediately following where the method or constructor was called.
 */
public class MOD1E4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how method calls interrupt sequential execution:\n");
        
        System.out.println("Step 1: Before calling the first method");
        firstMethod();
        System.out.println("Step 4: After returning from the first method\n");
        
        // Create an instance to call non-static methods
        MOD1E4_Exp demo = new MOD1E4_Exp();
        
        System.out.println("Step 5: Before calling a method with nested method calls");
        demo.methodWithNestedCalls();
        System.out.println("Step 12: After returning from the method with nested calls\n");
        
        // Demonstrate constructor calls
        System.out.println("Step 13: Before creating a new object (constructor call)");
        Person person = new Person("Alice");
        System.out.println("Step 15: After the constructor call\n");
        
        // Demonstrate early return
        System.out.println("Step 16: Demonstrating early return with different values");
        demo.methodWithEarlyReturn(5);  // Will return early
        demo.methodWithEarlyReturn(15); // Will execute completely
    }
    
    // Static method to demonstrate flow interruption
    public static void firstMethod() {
        System.out.println("Step 2: Inside the first method");
        secondMethod();
        System.out.println("Step 3: Back in the first method after the second method returns");
    }
    
    // Another static method called by the first method
    public static void secondMethod() {
        System.out.println("   Step 2.1: Inside the second method");
    }
    
    // Non-static method with nested method calls
    public void methodWithNestedCalls() {
        System.out.println("Step 6: Inside methodWithNestedCalls");
        firstNestedMethod();
        System.out.println("Step 11: Back in methodWithNestedCalls after firstNestedMethod returns");
    }
    
    // First level nested method
    public void firstNestedMethod() {
        System.out.println("Step 7: Inside firstNestedMethod");
        secondNestedMethod();
        System.out.println("Step 10: Back in firstNestedMethod after secondNestedMethod returns");
    }
    
    // Second level nested method
    public void secondNestedMethod() {
        System.out.println("Step 8: Inside secondNestedMethod");
        thirdNestedMethod();
        System.out.println("Step 9: Back in secondNestedMethod after thirdNestedMethod returns");
    }
    
    // Third level nested method
    public void thirdNestedMethod() {
        System.out.println("   Step 8.1: Inside thirdNestedMethod - deepest level");
    }
    
    // Method demonstrating early return
    public void methodWithEarlyReturn(int value) {
        System.out.println("Checking value: " + value);
        
        if (value < 10) {
            System.out.println("Value is less than 10, returning early");
            return; // Early return - flow of control immediately returns to the caller
        }
        
        // This code only executes if the early return didn't happen
        System.out.println("Value is 10 or greater, continuing execution");
        System.out.println("Finished processing value: " + value);
    }
}

// Class with a constructor to demonstrate constructor calls
class Person {
    private String name;
    
    // Constructor
    public Person(String name) {
        System.out.println("Step 14: Inside Person constructor");
        this.name = name;
    }
}
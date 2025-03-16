/**
 * MOD1E4_Err.java
 * 
 * This program demonstrates common errors related to understanding how method calls
 * interrupt the sequential execution of statements.
 * 
 * Knowledge Point: MOD-1.E.4
 * A method or constructor call interrupts the sequential execution of statements, causing the program
 * to first execute the statements in the method or constructor before continuing. Once the last
 * statement in the method or constructor has executed or a return statement is executed, flow of
 * control is returned to the point immediately following where the method or constructor was called.
 */
public class MOD1E4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to method call flow:\n");
        
        // ERROR 1: Misunderstanding the order of execution
        System.out.println("ERROR 1: Misunderstanding the order of execution");
        System.out.println("Incorrect understanding: Thinking that the following code would print 1, 3, 2");
        System.out.println("Correct understanding: It will print 1, 2, 3 because the method call interrupts the flow");
        
        System.out.println("\nDemonstration:");
        System.out.println("1: Before method call");
        printMessage();
        System.out.println("3: After method call\n");
        
        // ERROR 2: Forgetting that constructors also interrupt sequential execution
        System.out.println("ERROR 2: Forgetting that constructors also interrupt sequential execution");
        System.out.println("The following code demonstrates the correct order:");
        System.out.println("4: Before constructor call");
        Student student = new Student("Bob");
        System.out.println("6: After constructor call\n");
        
        // ERROR 3: Misunderstanding return statements in void methods
        System.out.println("ERROR 3: Misunderstanding return statements in void methods");
        System.out.println("Incorrect understanding: Thinking that a return statement in a void method returns a value");
        System.out.println("Correct understanding: A return statement in a void method only exits the method");
        
        System.out.println("\nDemonstration of early return:");
        MOD1E4_Err demo = new MOD1E4_Err();
        demo.methodWithEarlyReturn(5);  // Will return early
        System.out.println();
        
        // ERROR 4: Assuming code after a return statement will execute
        System.out.println("ERROR 4: Assuming code after a return statement will execute");
        System.out.println("The following would be incorrect logic:");
        System.out.println("// Incorrect understanding of code flow");
        System.out.println("public void someMethod() {");
        System.out.println("    System.out.println(\"First statement\");");
        System.out.println("    return;  // Method execution stops here");
        System.out.println("    System.out.println(\"This will never execute\");  // Unreachable code");
        System.out.println("}\n");
        
        // ERROR 5: Not understanding nested method calls
        System.out.println("ERROR 5: Not understanding nested method calls");
        System.out.println("Demonstration of correct nested call order:");
        demo.outerMethod();
    }
    
    // Method used to demonstrate flow interruption
    public static void printMessage() {
        System.out.println("2: Inside the method call");
    }
    
    // Method with early return to demonstrate flow control
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
    
    // Methods to demonstrate nested calls
    public void outerMethod() {
        System.out.println("A: Start of outerMethod");
        middleMethod();
        System.out.println("D: End of outerMethod");
    }
    
    public void middleMethod() {
        System.out.println("B: Start of middleMethod");
        innerMethod();
        System.out.println("C: End of middleMethod");
    }
    
    public void innerMethod() {
        System.out.println("   B.1: Inside innerMethod");
    }
}

// Class with a constructor to demonstrate constructor calls
class Student {
    private String name;
    
    // Constructor
    public Student(String name) {
        System.out.println("5: Inside Student constructor");
        this.name = name;
    }
}
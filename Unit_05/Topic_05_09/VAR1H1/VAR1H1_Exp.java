/**
 * VAR1H1_Exp.java
 * 
 * This program demonstrates the use of the 'this' keyword as a reference to the current object.
 * Knowledge Point: VAR-1.H.1 - Within a non-static method or a constructor, the keyword 'this'
 * is a reference to the current object—the object whose method or constructor is being called.
 */
public class VAR1H1_Exp {
    // Instance variables
    private int value;
    private String name;
    
    /**
     * Constructor that uses 'this' to refer to instance variables
     */
    public VAR1H1_Exp(int value, String name) {
        // Using 'this' to distinguish between instance variables and parameters
        this.value = value;
        this.name = name;
    }
    
    /**
     * Method that uses 'this' to call another method of the same object
     */
    public void displayInfo() {
        System.out.println("Object Info: Name = " + this.name + ", Value = " + this.value);
        // 'this' can be used to call other methods of the current object
        this.modifyValue(10);
    }
    
    /**
     * Method that modifies the value of the current object
     */
    public void modifyValue(int increment) {
        // Using 'this' to access instance variable
        this.value += increment;
        System.out.println("Value after modification: " + this.value);
    }
    
    /**
     * Method that returns the current object
     */
    public VAR1H1_Exp getThis() {
        // 'this' can be used to return the current object
        return this;
    }
    
    /**
     * Method that demonstrates chaining method calls using 'this'
     */
    public VAR1H1_Exp setName(String name) {
        this.name = name;
        // Returning 'this' allows method chaining
        return this;
    }
    
    public VAR1H1_Exp setValue(int value) {
        this.value = value;
        // Returning 'this' allows method chaining
        return this;
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating the 'this' keyword as a reference to the current object:\n");
        
        // Example 1: Using 'this' in constructors and methods
        System.out.println("Example 1: Using 'this' in constructors and methods");
        VAR1H1_Exp obj1 = new VAR1H1_Exp(5, "Object1");
        obj1.displayInfo();
        System.out.println();
        
        // Example 2: Using 'this' to return the current object
        System.out.println("Example 2: Using 'this' to return the current object");
        VAR1H1_Exp obj2 = new VAR1H1_Exp(10, "Object2");
        VAR1H1_Exp sameObj = obj2.getThis();
        
        System.out.println("obj2: " + obj2);
        System.out.println("sameObj: " + sameObj);
        System.out.println("Are they the same object? " + (obj2 == sameObj));
        System.out.println();
        
        // Example 3: Method chaining using 'this'
        System.out.println("Example 3: Method chaining using 'this'");
        VAR1H1_Exp obj3 = new VAR1H1_Exp(0, "");
        obj3.setName("ChainedObject").setValue(15);
        obj3.displayInfo();
        System.out.println();
        
        // Example 4: Implicit use of 'this'
        System.out.println("Example 4: Implicit use of 'this'");
        VAR1H1_Exp obj4 = new VAR1H1_Exp(20, "Object4");
        // 'this' is implicitly used when accessing instance variables/methods
        obj4.implicitThisDemo();
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about 'this' Keyword ---");
        System.out.println("1. 'this' refers to the current object instance");
        System.out.println("2. 'this' can be used to distinguish between instance variables and parameters");
        System.out.println("3. 'this' can be used to call methods of the current object");
        System.out.println("4. 'this' can be returned to allow method chaining");
        System.out.println("5. 'this' is implicitly used when accessing instance variables/methods");
    }
    
    /**
     * Method that demonstrates implicit use of 'this'
     */
    public void implicitThisDemo() {
        // These statements implicitly use 'this'
        name = "Modified";
        value = 25;
        displayInfo();
        
        // They are equivalent to:
        // this.name = "Modified";
        // this.value = 25;
        // this.displayInfo();
    }
}
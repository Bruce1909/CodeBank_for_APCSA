/**
 * VAR1H1_Err.java
 * 
 * This program demonstrates common errors related to using the 'this' keyword as a reference to the current object.
 * Knowledge Point: VAR-1.H.1 - Within a non-static method or a constructor, the keyword 'this'
 * is a reference to the current object—the object whose method or constructor is being called.
 */
public class VAR1H1_Err {
    // Instance variables
    private int value;
    private String name;
    
    /**
     * Constructor with parameter name collision (common error)
     */
    public VAR1H1_Err(int value, String name) {
        // Error 1: Not using 'this' when parameter names collide with instance variable names
        value = value;  // This assigns the parameter to itself, not to the instance variable
        name = name;    // This assigns the parameter to itself, not to the instance variable
        System.out.println("Constructor called, but instance variables not properly initialized");
        System.out.println("Instance value = " + this.value + ", Instance name = " + this.name);
        System.out.println("Parameter value = " + value + ", Parameter name = " + name);
    }
    
    /**
     * Constructor that correctly uses 'this'
     */
    public VAR1H1_Err(int v, String n) {
        // Correct way: either use different parameter names or use 'this'
        value = v;
        name = n;
        System.out.println("Constructor with different parameter names called");
        System.out.println("Instance value = " + this.value + ", Instance name = " + this.name);
    }
    
    /**
     * Static method attempting to use 'this' (will cause compilation error)
     */
    public static void staticMethodWithThis() {
        // Error 2: Cannot use 'this' in a static context
        // Uncommenting the next line would cause a compilation error
        // System.out.println("Value: " + this.value);  // Error: Cannot use 'this' in a static context
        System.out.println("Error 2: Cannot use 'this' in a static context");
        System.out.println("this.value would cause compilation error in static method");
    }
    
    /**
     * Method with unnecessary 'this' usage
     */
    public void redundantThis(int newValue) {
        // Error 3: Unnecessary use of 'this' when there's no name collision
        // Not an error but considered bad practice
        this.value = newValue;  // 'this' is not needed here since there's no name collision
        System.out.println("Redundant use of 'this': this.value = " + this.value);
    }
    
    /**
     * Method that incorrectly tries to reassign 'this'
     */
    public void reassignThis() {
        // Error 4: Attempting to reassign 'this'
        // Uncommenting the next line would cause a compilation error
        // this = new VAR1H1_Err(100, "NewObject");  // Error: Cannot assign a value to 'this'
        System.out.println("Error 4: Cannot assign a value to 'this'");
        System.out.println("'this' is a final reference and cannot be changed");
    }
    
    /**
     * Method that incorrectly returns a different type when chaining
     */
    public int setBadValue(int value) {
        // Error 5: Incorrect return type for method chaining
        this.value = value;
        return value;  // Should return 'this' for proper method chaining
    }
    
    /**
     * Method that correctly returns 'this' for method chaining
     */
    public VAR1H1_Err setGoodValue(int value) {
        this.value = value;
        return this;  // Correct: returns the current object for method chaining
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with the 'this' Keyword:\n");
        
        // Example 1: Parameter name collision in constructor
        System.out.println("Example 1: Parameter name collision in constructor");
        VAR1H1_Err obj1 = new VAR1H1_Err(5, "Object1");
        System.out.println();
        
        // Example 2: Constructor with different parameter names
        System.out.println("Example 2: Constructor with different parameter names");
        VAR1H1_Err obj2 = new VAR1H1_Err(10, "Object2");
        System.out.println();
        
        // Example 3: Static method and 'this'
        System.out.println("Example 3: Static method and 'this'");
        staticMethodWithThis();
        System.out.println();
        
        // Example 4: Redundant use of 'this'
        System.out.println("Example 4: Redundant use of 'this'");
        obj2.redundantThis(15);
        System.out.println();
        
        // Example 5: Cannot reassign 'this'
        System.out.println("Example 5: Cannot reassign 'this'");
        obj2.reassignThis();
        System.out.println();
        
        // Example 6: Incorrect method chaining
        System.out.println("Example 6: Incorrect method chaining");
        int returnedValue = obj2.setBadValue(20);
        System.out.println("setBadValue returns: " + returnedValue + " (not the object itself)");
        System.out.println("This prevents method chaining like: obj.setBadValue(20).setName(\"name\")");
        
        // Example 7: Correct method chaining
        System.out.println("\nExample 7: Correct method chaining");
        VAR1H1_Err chainedObj = obj2.setGoodValue(25);
        System.out.println("setGoodValue returns the object itself, allowing method chaining");
        System.out.println("Are they the same object? " + (obj2 == chainedObj));
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors with 'this' Keyword ---");
        System.out.println("1. Not using 'this' when parameter names collide with instance variable names");
        System.out.println("2. Attempting to use 'this' in a static context");
        System.out.println("3. Unnecessary use of 'this' when there's no name collision (style issue)");
        System.out.println("4. Attempting to reassign 'this' (it's a final reference)");
        System.out.println("5. Incorrect return type for method chaining (should return 'this')");
    }
}
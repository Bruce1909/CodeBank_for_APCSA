/**
 * This program demonstrates common errors related to runtime method execution (MOD-3.D.3).
 * It shows mistakes when working with polymorphism and method overriding.
 */
public class MOD3D3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating runtime method execution errors (MOD-3.D.3):\n");
        
        // ERROR 1: Confusing static and non-static method behavior
        System.out.println("--- ERROR 1: Confusing static and non-static method behavior ---");
        Parent parent = new Child();
        
        System.out.println("Calling static method:");
        parent.staticMethod();  // Calls Parent.staticMethod() - static methods are bound at compile time
        
        System.out.println("\nCalling instance method:");
        parent.instanceMethod(); // Calls Child.instanceMethod() - instance methods are bound at runtime
        
        System.out.println("\nProblem: Static methods are not polymorphic and are bound to the reference type,");
        System.out.println("not the actual object type. This can lead to confusion when expecting polymorphic behavior.");
        
        // ERROR 2: Overriding methods with different access modifiers
        System.out.println("\n--- ERROR 2: Overriding methods with different access modifiers ---");
        System.out.println("The AccessModifierChild class attempts to override a method with a more restrictive access modifier.");
        System.out.println("This would cause a compile-time error (see the class definition).");
        
        // ERROR 3: Not calling super.method() when needed
        System.out.println("\n--- ERROR 3: Not calling super.method() when needed ---");
        BadOverrider badOverrider = new BadOverrider();
        badOverrider.processData();  // Doesn't call the parent's important initialization
        
        System.out.println("\nProblem: The overriding method doesn't call super.processData(),");
        System.out.println("so important initialization in the parent class is skipped.");
        
        // ERROR 4: Overloading vs. Overriding confusion
        System.out.println("\n--- ERROR 4: Overloading vs. Overriding confusion ---");
        OverloadingExample parent2 = new OverloadingChild();
        parent2.process(10);  // Calls OverloadingExample.process(int) - not overridden
        
        System.out.println("\nProblem: The child class defined process(long) instead of process(int),");
        System.out.println("creating an overloaded method rather than overriding the parent's method.");
        
        // ERROR 5: Forgetting @Override annotation
        System.out.println("\n--- ERROR 5: Forgetting @Override annotation ---");
        System.out.println("The MisspelledOverride class attempts to override toString() but misspells it as tostring().");
        System.out.println("Without the @Override annotation, this creates a new method rather than overriding.");
        
        MisspelledOverride misspelled = new MisspelledOverride();
        System.out.println("toString() result: " + misspelled.toString());
        System.out.println("tostring() result: " + misspelled.tostring());
        
        // Summary
        System.out.println("\n--- Common Errors with Runtime Method Execution ---");
        System.out.println("1. Confusing static method behavior (compile-time binding) with instance method behavior (runtime binding)");
        System.out.println("2. Attempting to override methods with more restrictive access modifiers");
        System.out.println("3. Not calling super.method() when the parent's implementation is still needed");
        System.out.println("4. Confusing method overloading (different parameters) with method overriding (same signature)");
        System.out.println("5. Forgetting to use the @Override annotation, which can lead to undetected errors");
    }
}

// Classes demonstrating static vs non-static method behavior
class Parent {
    // Static method - cannot be overridden, only hidden
    public static void staticMethod() {
        System.out.println("Parent.staticMethod() called");
    }
    
    // Non-static method - can be overridden
    public void instanceMethod() {
        System.out.println("Parent.instanceMethod() called");
    }
}

class Child extends Parent {
    // This hides the parent's static method (not overriding)
    public static void staticMethod() {
        System.out.println("Child.staticMethod() called");
    }
    
    // This overrides the parent's instance method
    @Override
    public void instanceMethod() {
        System.out.println("Child.instanceMethod() called");
    }
}

// Classes demonstrating access modifier errors
class AccessModifierParent {
    // Public method
    public void doSomething() {
        System.out.println("Parent's public method");
    }
}

class AccessModifierChild extends AccessModifierParent {
    // This would cause a compile-time error - cannot override with more restrictive access
    // Uncommenting this would prevent compilation
    /*
    @Override
    protected void doSomething() { // Error: cannot reduce visibility
        System.out.println("Child's protected method");
    }
    */
}

// Classes demonstrating the importance of calling super.method()
class DataProcessor {
    protected boolean initialized = false;
    
    public void processData() {
        System.out.println("DataProcessor: Initializing important resources...");
        initialized = true;
        System.out.println("DataProcessor: Initialization complete.");
    }
}

class BadOverrider extends DataProcessor {
    @Override
    public void processData() {
        // ERROR: Doesn't call super.processData(), so initialization is skipped
        System.out.println("BadOverrider: Processing data without proper initialization");
        
        // Try to use resources that should have been initialized
        if (initialized) {
            System.out.println("BadOverrider: Using initialized resources");
        } else {
            System.out.println("BadOverrider: ERROR - Resources not initialized!");
        }
    }
}

// Classes demonstrating overloading vs. overriding confusion
class OverloadingExample {
    public void process(int value) {
        System.out.println("OverloadingExample: Processing int value: " + value);
    }
}

class OverloadingChild extends OverloadingExample {
    // This is overloading, not overriding (different parameter type)
    public void process(long value) {
        System.out.println("OverloadingChild: Processing long value: " + value);
    }
    
    // To override the parent's method, it should be:
    // @Override
    // public void process(int value) { ... }
}

// Class demonstrating the importance of @Override annotation
class MisspelledOverride {
    // Misspelled method name - intended to override toString() but creates a new method
    public String tostring() { // Missing @Override would catch this error
        return "MisspelledOverride object";
    }
    
    // The actual toString() method is inherited from Object
}
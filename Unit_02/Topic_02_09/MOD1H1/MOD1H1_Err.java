/**
 * MOD1H1_Err.java
 * 
 * This program demonstrates common errors when calling static methods.
 * 
 * Knowledge Point: MOD-1.H.1
 * Static methods are called using the dot operator along with the class name
 * unless they are defined in the enclosing class.
 */
public class MOD1H1_Err {
    // Instance variable for demonstration
    private int instanceValue = 10;
    
    // Static variable for demonstration
    private static int staticValue = 20;
    
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when calling static methods:\n");
        
        // Create an instance of the class for demonstration
        MOD1H1_Err demo = new MOD1H1_Err();
        
        // ERROR 1: Trying to call a static method using an instance
        System.out.println("ERROR 1: Trying to call a static method using an instance");
        System.out.println("The following is not recommended (though it works):");
        demo.staticMethod(); // This works but is not recommended
        System.out.println("Correct way: MOD1H1_Err.staticMethod()");
        MOD1H1_Err.staticMethod();
        System.out.println();
        
        // ERROR 2: Trying to call a non-static method without an instance
        System.out.println("ERROR 2: Trying to call a non-static method without an instance");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // instanceMethod(); // Error: non-static method cannot be referenced from a static context
        System.out.println("Correct way: Create an instance and call the method on it");
        demo.instanceMethod();
        System.out.println();
        
        // ERROR 3: Trying to access instance variables from a static method
        System.out.println("ERROR 3: Trying to access instance variables from a static method");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // System.out.println(instanceValue); // Error: non-static variable cannot be referenced from a static context
        System.out.println("Correct way: Access static variables or use an instance");
        System.out.println("Static value: " + staticValue);
        System.out.println("Instance value via object: " + demo.instanceValue);
        System.out.println();
        
        // ERROR 4: Forgetting to use the class name when calling a static method from another class
        System.out.println("ERROR 4: Forgetting to use the class name when calling a static method from another class");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // int result = add(5, 10); // Error: method add not found
        System.out.println("Correct way: Use the class name with the dot operator");
        int result = StaticUtility.add(5, 10);
        System.out.println("Result of StaticUtility.add(5, 10): " + result);
        System.out.println();
        
        // ERROR 5: Using the wrong class name to call a static method
        System.out.println("ERROR 5: Using the wrong class name to call a static method");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // double squareRoot = MathUtility.sqrt(16); // Error: class MathUtility not found
        System.out.println("Correct way: Use the correct class name");
        double squareRoot = Math.sqrt(16);
        System.out.println("Result of Math.sqrt(16): " + squareRoot);
        System.out.println();
        
        // ERROR 6: Trying to override a static method (demonstrated in a comment)
        System.out.println("ERROR 6: Trying to override a static method");
        System.out.println("Static methods cannot be overridden in the traditional sense.");
        System.out.println("They can be hidden by declaring a static method with the same signature in a subclass.");
        System.out.println();
        
        // ERROR 7: Confusing static and instance method calls
        System.out.println("ERROR 7: Confusing static and instance method calls");
        StaticUtility utility = new StaticUtility();
        System.out.println("Calling instance method: utility.getInstanceValue() = " + utility.getInstanceValue());
        System.out.println("Calling static method: StaticUtility.getStaticValue() = " + StaticUtility.getStaticValue());
        System.out.println("The following works but is confusing and not recommended:");
        System.out.println("utility.getStaticValue() = " + utility.getStaticValue()); // Works but not recommended
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Static Method Errors ---");
        System.out.println("1. Always call static methods using ClassName.methodName() syntax");
        System.out.println("2. Don't call static methods on instances (though it works, it's confusing)");
        System.out.println("3. Static methods cannot access instance variables or methods directly");
        System.out.println("4. Non-static methods cannot be called from static contexts without an instance");
        System.out.println("5. Static methods cannot be overridden, only hidden in subclasses");
    }
    
    // Static method for demonstration
    public static void staticMethod() {
        System.out.println("This is a static method");
        // Uncommenting the following line would cause a compilation error
        // System.out.println(instanceValue); // Error: non-static variable cannot be referenced from a static context
    }
    
    // Instance method for demonstration
    public void instanceMethod() {
        System.out.println("This is an instance method");
        // Instance methods can access both static and instance variables
        System.out.println("Instance value: " + instanceValue);
        System.out.println("Static value: " + staticValue);
    }
}

// A utility class with static methods
class StaticUtility {
    private int instanceValue = 5;
    private static int staticValue = 10;
    
    // Static method for addition
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Static method that returns the static value
    public static int getStaticValue() {
        return staticValue;
    }
    
    // Instance method that returns the instance value
    public int getInstanceValue() {
        return instanceValue;
    }
}

// Example of static method hiding (not overriding)
class BaseClass {
    public static void staticMethod() {
        System.out.println("BaseClass static method");
    }
}

class SubClass extends BaseClass {
    // This hides the parent's static method, not overrides it
    public static void staticMethod() {
        System.out.println("SubClass static method");
    }
}
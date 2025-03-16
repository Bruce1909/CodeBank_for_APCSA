/**
 * VAR1H2_Err.java
 * 
 * This program demonstrates common errors related to using the 'this' keyword to pass the current object as a parameter.
 * Knowledge Point: VAR-1.H.2 - The keyword 'this' can be used to pass the current object as an actual parameter in a method call.
 */
public class VAR1H2_Err {
    // Instance variables
    private int id;
    private String name;
    
    /**
     * Constructor
     */
    public VAR1H2_Err(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    /**
     * Getter for id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Getter for name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Method that incorrectly tries to pass 'this' in a static context
     */
    public static void staticMethodError() {
        // Error 1: Cannot use 'this' in a static context
        // Uncommenting the next line would cause a compilation error
        // ErrorProcessor.process(this);  // Error: Cannot use 'this' in a static context
        System.out.println("Error 1: Cannot use 'this' in a static context");
        System.out.println("ErrorProcessor.process(this) would cause compilation error in static method");
    }
    
    /**
     * Method that incorrectly passes 'this' to a method expecting a different type
     */
    public void typeMismatchError() {
        // Error 2: Type mismatch when passing 'this'
        // Uncommenting the next line would cause a compilation error
        // StringProcessor.process(this);  // Error: Cannot convert VAR1H2_Err to String
        System.out.println("Error 2: Type mismatch when passing 'this'");
        System.out.println("StringProcessor.process(this) would cause compilation error due to type mismatch");
    }
    
    /**
     * Method that passes 'this' to a method that modifies the object without realizing it
     */
    public void unexpectedModificationError() {
        // Error 3: Unexpected modification of the object
        System.out.println("Before modification - ID: " + id + ", Name: " + name);
        ModifierProcessor.process(this);  // This method modifies the object
        System.out.println("After modification - ID: " + id + ", Name: " + name);
        System.out.println("Error 3: Object was unexpectedly modified when passing 'this'");
    }
    
    /**
     * Method that incorrectly passes 'this' to a method that stores a reference to it
     */
    public void referenceStorageError() {
        // Error 4: Method stores a reference to 'this' which can cause problems
        ReferenceHolder.storeReference(this);
        System.out.println("Error 4: Method stores a reference to 'this' which can cause problems later");
    }
    
    /**
     * Method that incorrectly passes 'this' to a constructor creating circular references
     */
    public CircularReference createCircularReference() {
        // Error 5: Creating circular references
        return new CircularReference(this);
    }
    
    /**
     * Method that incorrectly passes 'this' before the object is fully initialized
     */
    public void passingThisBeforeInitialization() {
        // Error 6: Passing 'this' before the object is fully initialized
        System.out.println("Error 6: Passing 'this' before the object is fully initialized");
        System.out.println("This can happen in constructors before all fields are initialized");
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors when Using 'this' as a Parameter:\n");
        
        // Example 1: Cannot use 'this' in a static context
        System.out.println("Example 1: Cannot use 'this' in a static context");
        staticMethodError();
        System.out.println();
        
        // Example 2: Type mismatch when passing 'this'
        System.out.println("Example 2: Type mismatch when passing 'this'");
        VAR1H2_Err obj1 = new VAR1H2_Err(1, "Object1");
        obj1.typeMismatchError();
        System.out.println();
        
        // Example 3: Unexpected modification of the object
        System.out.println("Example 3: Unexpected modification of the object");
        VAR1H2_Err obj2 = new VAR1H2_Err(2, "Object2");
        obj2.unexpectedModificationError();
        System.out.println();
        
        // Example 4: Method stores a reference to 'this'
        System.out.println("Example 4: Method stores a reference to 'this'");
        VAR1H2_Err obj3 = new VAR1H2_Err(3, "Object3");
        obj3.referenceStorageError();
        // Demonstrate the problem
        ReferenceHolder.displayStoredReference();
        // Change the object after its reference is stored
        obj3 = new VAR1H2_Err(33, "Modified Object3");
        System.out.println("Object was changed, but the stored reference still points to the old state");
        ReferenceHolder.displayStoredReference();
        System.out.println();
        
        // Example 5: Creating circular references
        System.out.println("Example 5: Creating circular references");
        VAR1H2_Err obj4 = new VAR1H2_Err(4, "Object4");
        CircularReference circular = obj4.createCircularReference();
        System.out.println("Created circular reference: obj4 -> circular -> obj4");
        System.out.println("This can cause memory leaks and serialization problems");
        System.out.println();
        
        // Example 6: Passing 'this' before the object is fully initialized
        System.out.println("Example 6: Passing 'this' before the object is fully initialized");
        PrematureThis premature = new PrematureThis();
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors when Using 'this' as a Parameter ---");
        System.out.println("1. Cannot use 'this' in a static context");
        System.out.println("2. Type mismatch when passing 'this' to methods expecting different types");
        System.out.println("3. Unexpected modification of the object when passing 'this'");
        System.out.println("4. Methods storing references to 'this' can cause stale references");
        System.out.println("5. Creating circular references can cause memory leaks");
        System.out.println("6. Passing 'this' before the object is fully initialized can cause bugs");
    }
}

/**
 * Processor class that modifies objects
 */
class ModifierProcessor {
    public static void process(VAR1H2_Err obj) {
        // This method modifies the object without making it clear
        obj.id = 999;
        obj.name = "Modified";
        System.out.println("Object processed and modified");
    }
}

/**
 * Class that demonstrates storing references to passed objects
 */
class ReferenceHolder {
    private static VAR1H2_Err storedReference;
    
    public static void storeReference(VAR1H2_Err obj) {
        storedReference = obj;
        System.out.println("Stored reference to object - ID: " + obj.getId() + ", Name: " + obj.getName());
    }
    
    public static void displayStoredReference() {
        if (storedReference != null) {
            System.out.println("Stored reference points to - ID: " + storedReference.getId() + ", Name: " + storedReference.getName());
        } else {
            System.out.println("No reference stored");
        }
    }
}

/**
 * Class that demonstrates circular references
 */
class CircularReference {
    private VAR1H2_Err reference;
    
    public CircularReference(VAR1H2_Err obj) {
        this.reference = obj;
    }
}

/**
 * Class that demonstrates passing 'this' before initialization is complete
 */
class PrematureThis {
    private int value;
    private Helper helper;
    
    public PrematureThis() {
        // Error: Passing 'this' before the object is fully initialized
        helper = new Helper(this);  // 'this' is passed before value is initialized
        value = 42;  // This initialization happens after 'this' is passed
    }
    
    public int getValue() {
        return value;
    }
}

/**
 * Helper class that uses the passed object
 */
class Helper {
    private PrematureThis obj;
    
    public Helper(PrematureThis obj) {
        this.obj = obj;
        // This will print 0, not 42, because the PrematureThis constructor hasn't finished
        System.out.println("Helper created with object value: " + obj.getValue());
    }
}

/**
 * This class is referenced in the error examples but not implemented
 * to demonstrate compilation errors
 */
class StringProcessor {
    public static void process(String str) {
        System.out.println("Processing string: " + str);
    }
}

/**
 * This class is referenced in the error examples but not implemented
 * to demonstrate compilation errors
 */
class ErrorProcessor {
    public static void process(VAR1H2_Err obj) {
        System.out.println("Processing object: " + obj.getName());
    }
}
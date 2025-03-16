/**
 * VAR1H2_Exp.java
 * 
 * This program demonstrates using the 'this' keyword to pass the current object as an actual parameter in a method call.
 * Knowledge Point: VAR-1.H.2 - The keyword 'this' can be used to pass the current object as an actual parameter in a method call.
 */
public class VAR1H2_Exp {
    // Instance variables
    private int id;
    private String name;
    
    /**
     * Constructor
     */
    public VAR1H2_Exp(int id, String name) {
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
     * Method that passes 'this' to another method
     */
    public void processObject() {
        System.out.println("Processing object: " + name);
        // Pass the current object to another method
        DataProcessor.process(this);
    }
    
    /**
     * Method that passes 'this' to a method of another object
     */
    public void registerWith(Registry registry) {
        System.out.println("Registering object: " + name);
        // Pass the current object to another object's method
        registry.register(this);
    }
    
    /**
     * Method that compares the current object with another object
     */
    public boolean isSameAs(VAR1H2_Exp other) {
        // Compare the current object with another object
        return this.id == other.id;
    }
    
    /**
     * Method that passes 'this' to a static method of the same class
     */
    public void printDetails() {
        // Pass the current object to a static method of the same class
        printObjectInfo(this);
    }
    
    /**
     * Static method that accepts an object as a parameter
     */
    public static void printObjectInfo(VAR1H2_Exp obj) {
        System.out.println("Object Info - ID: " + obj.id + ", Name: " + obj.name);
    }
    
    /**
     * Method that demonstrates passing 'this' to a constructor
     */
    public ObjectWrapper createWrapper() {
        // Pass the current object to a constructor
        return new ObjectWrapper(this);
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating using 'this' as a method parameter:\n");
        
        // Example 1: Passing 'this' to a static method
        System.out.println("Example 1: Passing 'this' to a static method");
        VAR1H2_Exp obj1 = new VAR1H2_Exp(1, "Object1");
        obj1.printDetails();
        System.out.println();
        
        // Example 2: Passing 'this' to another object's method
        System.out.println("Example 2: Passing 'this' to another object's method");
        Registry registry = new Registry();
        VAR1H2_Exp obj2 = new VAR1H2_Exp(2, "Object2");
        obj2.registerWith(registry);
        registry.listRegisteredObjects();
        System.out.println();
        
        // Example 3: Passing 'this' to a utility class method
        System.out.println("Example 3: Passing 'this' to a utility class method");
        VAR1H2_Exp obj3 = new VAR1H2_Exp(3, "Object3");
        obj3.processObject();
        System.out.println();
        
        // Example 4: Using 'this' for object comparison
        System.out.println("Example 4: Using 'this' for object comparison");
        VAR1H2_Exp obj4a = new VAR1H2_Exp(4, "Object4a");
        VAR1H2_Exp obj4b = new VAR1H2_Exp(4, "Object4b");
        VAR1H2_Exp obj5 = new VAR1H2_Exp(5, "Object5");
        
        System.out.println("obj4a and obj4b have the same ID: " + obj4a.isSameAs(obj4b));
        System.out.println("obj4a and obj5 have the same ID: " + obj4a.isSameAs(obj5));
        System.out.println();
        
        // Example 5: Passing 'this' to a constructor
        System.out.println("Example 5: Passing 'this' to a constructor");
        VAR1H2_Exp obj6 = new VAR1H2_Exp(6, "Object6");
        ObjectWrapper wrapper = obj6.createWrapper();
        wrapper.displayWrappedObject();
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Using 'this' as a Parameter ---");
        System.out.println("1. 'this' can be passed to static methods of the same class");
        System.out.println("2. 'this' can be passed to methods of other objects");
        System.out.println("3. 'this' can be passed to utility class methods");
        System.out.println("4. 'this' can be used for object comparison");
        System.out.println("5. 'this' can be passed to constructors to create wrapper objects");
    }
}

/**
 * Utility class for processing objects
 */
class DataProcessor {
    public static void process(VAR1H2_Exp obj) {
        System.out.println("Processing data for object with ID: " + obj.getId() + ", Name: " + obj.getName());
        // Simulate some processing
        System.out.println("Data processing complete");
    }
}

/**
 * Registry class that keeps track of registered objects
 */
class Registry {
    private VAR1H2_Exp[] registeredObjects;
    private int count;
    
    public Registry() {
        registeredObjects = new VAR1H2_Exp[10]; // Can store up to 10 objects
        count = 0;
    }
    
    public void register(VAR1H2_Exp obj) {
        if (count < registeredObjects.length) {
            registeredObjects[count] = obj;
            count++;
            System.out.println("Object registered successfully");
        } else {
            System.out.println("Registry is full");
        }
    }
    
    public void listRegisteredObjects() {
        System.out.println("Registered objects:");
        for (int i = 0; i < count; i++) {
            System.out.println("  - ID: " + registeredObjects[i].getId() + ", Name: " + registeredObjects[i].getName());
        }
    }
}

/**
 * Wrapper class that holds a reference to another object
 */
class ObjectWrapper {
    private VAR1H2_Exp wrappedObject;
    
    public ObjectWrapper(VAR1H2_Exp obj) {
        this.wrappedObject = obj;
    }
    
    public void displayWrappedObject() {
        System.out.println("Wrapper contains object - ID: " + wrappedObject.getId() + ", Name: " + wrappedObject.getName());
    }
}
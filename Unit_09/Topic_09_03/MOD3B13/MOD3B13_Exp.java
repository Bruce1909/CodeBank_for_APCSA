/**
 * MOD3B13_Exp.java
 * 
 * This program demonstrates MOD-3.B.13: A subclass will inherit all public methods from
 * the superclass; these methods remain public in the subclass.
 */
public class MOD3B13_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating inheritance of public methods (MOD-3.B.13):\n");
        
        // Create instances of superclass and subclass
        System.out.println("Creating a Parent object:");
        Parent parent = new Parent("Parent Object", 100);
        parent.displayInfo();
        parent.publicMethod();
        System.out.println();
        
        System.out.println("Creating a Child object:");
        Child child = new Child("Child Object", 50, "Special");
        
        // Demonstrate that public methods from Parent are inherited and remain public in Child
        System.out.println("\nCalling public methods inherited from Parent:");
        child.displayInfo(); // Inherited public method (overridden)
        child.publicMethod(); // Inherited public method (not overridden)
        child.accessParentMethods(); // Child method that calls inherited public methods
        
        // Demonstrate that private methods are not inherited
        System.out.println("\nPrivate methods are not inherited:");
        // child.privateMethod(); // Error: privateMethod() has private access in Parent
        System.out.println("Cannot call parent.privateMethod() or child.privateMethod()");
        
        // Demonstrate that protected methods are inherited but not accessible outside the inheritance hierarchy
        System.out.println("\nProtected methods are inherited but not accessible outside the hierarchy:");
        // child.protectedMethod(); // Error: protectedMethod() has protected access
        System.out.println("Cannot call child.protectedMethod() from outside the hierarchy");
        System.out.println("But Child can access it internally: ");
        child.accessProtectedMethod();
        
        System.out.println("\n--- Key Points about Inheritance of Public Methods ---");
        System.out.println("1. All public methods from the superclass are inherited by the subclass");
        System.out.println("2. Inherited public methods remain public in the subclass");
        System.out.println("3. Subclasses can override inherited public methods");
        System.out.println("4. Private methods are not inherited");
        System.out.println("5. Protected methods are inherited but have restricted access");
    }
}

/**
 * Parent class with various methods with different access modifiers
 */
class Parent {
    private String name;
    private int value;
    
    public Parent(String name, int value) {
        this.name = name;
        this.value = value;
    }
    
    // Public method - will be inherited and remain public in subclass
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Value: " + value);
    }
    
    // Another public method - will be inherited and remain public in subclass
    public void publicMethod() {
        System.out.println("This is a public method from Parent");
    }
    
    // Private method - will NOT be inherited by subclass
    private void privateMethod() {
        System.out.println("This is a private method from Parent");
    }
    
    // Protected method - will be inherited but with restricted access
    protected void protectedMethod() {
        System.out.println("This is a protected method from Parent");
    }
    
    // Public getters and setters - will be inherited and remain public
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
}

/**
 * Child class that inherits from Parent
 */
class Child extends Parent {
    private String attribute;
    
    public Child(String name, int value, String attribute) {
        super(name, value);
        this.attribute = attribute;
    }
    
    // Override an inherited public method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent's version
        System.out.println("Attribute: " + attribute);
    }
    
    // Child's own public method that calls inherited public methods
    public void accessParentMethods() {
        System.out.println("Child accessing inherited public methods:");
        System.out.println("Getting name: " + getName()); // Inherited public method
        System.out.println("Getting value: " + getValue()); // Inherited public method
    }
    
    // Child's method that accesses inherited protected method
    public void accessProtectedMethod() {
        System.out.println("Child accessing inherited protected method:");
        protectedMethod(); // Can access inherited protected method
    }
    
    // Note: Child cannot access Parent's private methods
    // The following would cause a compilation error:
    // public void tryToAccessPrivateMethod() {
    //     privateMethod(); // Error: privateMethod() has private access in Parent
    // }
}
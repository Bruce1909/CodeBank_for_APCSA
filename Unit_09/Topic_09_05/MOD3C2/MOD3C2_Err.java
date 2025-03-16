/**
 * MOD3C2_Err.java
 * 
 * This program demonstrates common errors related to MOD-3.C.2: If S is a subclass of T, then assigning
 * an object of type S to a reference of type T facilitates polymorphism.
 */
public class MOD3C2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors in polymorphism (MOD-3.C.2):\n");
        
        // Create objects of different types
        ShapeErr circle = new CircleErr("Red Circle", 5.0);
        ShapeErr rectangle = new RectangleErr("Blue Rectangle", 4.0, 6.0);
        CircleErr actualCircle = new CircleErr("Green Circle", 3.0);
        
        // ERROR 1: Attempting to access subclass-specific methods through a superclass reference
        System.out.println("ERROR 1: Attempting to access subclass-specific methods through a superclass reference:");
        System.out.println("circle is actually a CircleErr object: " + (circle instanceof CircleErr));
        // This will cause a compile-time error, commented out to allow compilation
        // System.out.println("Radius: " + circle.getRadius()); // Error: getRadius() not found in ShapeErr
        System.out.println("This would cause a compile-time error because getRadius() is not defined in ShapeErr.");
        
        // ERROR 2: Incorrect casting
        System.out.println("\nERROR 2: Incorrect casting:");
        try {
            System.out.println("Attempting to cast rectangle (which is a RectangleErr) to CircleErr:");
            // This will compile but fail at runtime
            // CircleErr wrongCast = (CircleErr) rectangle; // ClassCastException at runtime
            System.out.println("This would throw a ClassCastException at runtime because");
            System.out.println("rectangle is a RectangleErr object, not a CircleErr object.");
        } catch (Exception e) {
            System.out.println("Exception would occur: ClassCastException");
        }
        
        // ERROR 3: Not checking type before casting
        System.out.println("\nERROR 3: Not checking type before casting:");
        System.out.println("Correct approach - check type before casting:");
        if (circle instanceof CircleErr) {
            CircleErr safeCircle = (CircleErr) circle;
            System.out.println("Safe cast successful. Circle radius: " + safeCircle.getRadius());
        } else {
            System.out.println("Cannot cast to CircleErr - not the right type.");
        }
        
        System.out.println("\nIncorrect approach - casting without checking:");
        // Commented out to allow compilation
        // CircleErr unsafeCircle = (CircleErr) rectangle; // Would throw ClassCastException
        System.out.println("This would throw a ClassCastException at runtime.");
        
        // ERROR 4: Misunderstanding method overriding vs. method hiding
        System.out.println("\nERROR 4: Misunderstanding method overriding vs. method hiding:");
        ShapeErr shape1 = new ShapeErrImpl();
        ShapeErr shape2 = new ShapeErrSubclass();
        
        System.out.println("Static method called through superclass reference to superclass object:");
        shape1.staticMethod(); // Calls ShapeErr.staticMethod()
        
        System.out.println("Static method called through superclass reference to subclass object:");
        shape2.staticMethod(); // Still calls ShapeErr.staticMethod() - static methods are not polymorphic
        
        System.out.println("Instance method called through superclass reference to superclass object:");
        shape1.instanceMethod(); // Calls ShapeErrImpl.instanceMethod()
        
        System.out.println("Instance method called through superclass reference to subclass object:");
        shape2.instanceMethod(); // Calls ShapeErrSubclass.instanceMethod() - polymorphism works
        
        // ERROR 5: Not understanding that constructors are not inherited
        System.out.println("\nERROR 5: Not understanding that constructors are not inherited:");
        System.out.println("Constructors are not inherited and are not polymorphic.");
        System.out.println("Each subclass must define its own constructors.");
        
        System.out.println("\n--- Common Errors with Polymorphism ---");
        System.out.println("1. Attempting to access subclass-specific methods through a superclass reference");
        System.out.println("2. Incorrect casting between unrelated subclasses");
        System.out.println("3. Not checking type before casting");
        System.out.println("4. Misunderstanding method overriding vs. method hiding (static methods)");
        System.out.println("5. Not understanding that constructors are not inherited or polymorphic");
    }
}

/**
 * Abstract superclass - ShapeErr
 */
abstract class ShapeErr {
    protected String name;
    
    public ShapeErr(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    // Static method - cannot be overridden, can only be hidden
    public static void staticMethod() {
        System.out.println("ShapeErr static method");
    }
    
    // Instance method - can be overridden
    public void instanceMethod() {
        System.out.println("ShapeErr instance method");
    }
    
    // Abstract methods to be implemented by subclasses
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

/**
 * Concrete implementation of ShapeErr for demonstration
 */
class ShapeErrImpl extends ShapeErr {
    public ShapeErrImpl() {
        super("Generic Shape");
    }
    
    @Override
    public double calculateArea() {
        return 0;
    }
    
    @Override
    public double calculatePerimeter() {
        return 0;
    }
}

/**
 * Subclass that hides static method and overrides instance method
 */
class ShapeErrSubclass extends ShapeErrImpl {
    public ShapeErrSubclass() {
        super();
    }
    
    // This hides the superclass static method (not overriding)
    public static void staticMethod() {
        System.out.println("ShapeErrSubclass static method");
    }
    
    // This overrides the superclass instance method
    @Override
    public void instanceMethod() {
        System.out.println("ShapeErrSubclass instance method");
    }
}

/**
 * Subclass - CircleErr
 */
class CircleErr extends ShapeErr {
    private double radius;
    
    public CircleErr(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
    // Subclass-specific method
    public double getRadius() {
        return radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

/**
 * Subclass - RectangleErr
 */
class RectangleErr extends ShapeErr {
    private double length;
    private double width;
    
    public RectangleErr(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    
    // Subclass-specific methods
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
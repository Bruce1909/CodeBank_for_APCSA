/**
 * MOD3B2_Err.java
 * 
 * This program demonstrates errors related to MOD-3.B.2: Failing to properly draw upon
 * existing attributes and behaviors of the superclass in subclasses.
 */
public class MOD3B2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors when subclasses don't use superclass features (MOD-3.B.2):\n");
        
        // Create instances of different shape types
        CircleWithErrors circle = new CircleWithErrors("Red", 5.0);
        RectangleWithErrors rectangle = new RectangleWithErrors("Blue", 4.0, 6.0);
        TriangleWithErrors triangle = new TriangleWithErrors("Green", 3.0, 4.0, 5.0);
        
        // Display information about each shape
        System.out.println("Circle Information:");
        circle.displayInfo();
        System.out.println("Area: " + circle.calculateArea());
        circle.draw();
        System.out.println();
        
        System.out.println("Rectangle Information:");
        rectangle.displayInfo();
        System.out.println("Area: " + rectangle.calculateArea());
        rectangle.draw();
        System.out.println();
        
        System.out.println("Triangle Information:");
        triangle.displayInfo();
        System.out.println("Area: " + triangle.calculateArea());
        triangle.draw();
        
        System.out.println("\n--- Problems with Not Using Superclass Features ---");
        System.out.println("1. Code duplication: Methods are reimplemented instead of reusing superclass code");
        System.out.println("2. Inconsistent behavior: Similar operations behave differently across subclasses");
        System.out.println("3. Maintenance issues: Changes to common behavior must be made in multiple places");
        System.out.println("4. Reduced readability: Code is more complex and harder to understand");
        System.out.println("5. Violates DRY principle: 'Don't Repeat Yourself' is not followed");
    }
}

/**
 * Superclass for all shapes
 */
class ShapeWithErrors {
    // Common attribute for all shapes
    protected String color;
    
    // Constructor
    public ShapeWithErrors(String color) {
        this.color = color;
    }
    
    // Common methods for all shapes
    public void draw() {
        System.out.println("Drawing a " + color + " shape");
    }
    
    public void displayInfo() {
        System.out.println("Color: " + color);
    }
    
    // Method to be overridden by subclasses
    public double calculateArea() {
        return 0.0; // Default implementation
    }
    
    // Getter and setter
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}

/**
 * Circle subclass with errors
 * ERROR: Doesn't properly use superclass methods
 */
class CircleWithErrors extends ShapeWithErrors {
    private double radius;
    
    public CircleWithErrors(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    // ERROR: Properly overrides but doesn't reuse superclass implementation
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // ERROR: Completely reimplements draw() instead of extending superclass behavior
    @Override
    public void draw() {
        // Does not call super.draw()
        System.out.println("Drawing a circle with radius " + radius);
        // Missing the color information that the superclass would provide
    }
    
    // ERROR: Completely reimplements displayInfo() instead of extending superclass behavior
    @Override
    public void displayInfo() {
        // Does not call super.displayInfo()
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color); // Duplicates code from superclass
    }
}

/**
 * Rectangle subclass with errors
 * ERROR: Doesn't properly use superclass methods
 */
class RectangleWithErrors extends ShapeWithErrors {
    private double length;
    private double width;
    
    public RectangleWithErrors(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    // ERROR: Properly overrides but doesn't reuse superclass implementation
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    // ERROR: Completely reimplements draw() with inconsistent format
    @Override
    public void draw() {
        // Does not call super.draw()
        // Inconsistent format compared to CircleWithErrors
        System.out.println("Rectangle drawing - Length: " + length + ", Width: " + width);
        // Missing color information
    }
    
    // ERROR: Completely reimplements displayInfo() with inconsistent format
    @Override
    public void displayInfo() {
        // Does not call super.displayInfo()
        // Inconsistent format compared to CircleWithErrors
        System.out.println("Rectangle Properties:");
        System.out.println("- Length: " + length);
        System.out.println("- Width: " + width);
        System.out.println("- Color: " + color); // Duplicates code from superclass
    }
}

/**
 * Triangle subclass with errors
 * ERROR: Doesn't properly use superclass methods
 */
class TriangleWithErrors extends ShapeWithErrors {
    private double sideA;
    private double sideB;
    private double sideC;
    
    public TriangleWithErrors(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    // ERROR: Properly overrides but doesn't reuse superclass implementation
    @Override
    public double calculateArea() {
        // Heron's formula
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    
    // ERROR: Completely reimplements draw() with yet another inconsistent format
    @Override
    public void draw() {
        // Does not call super.draw()
        // Another inconsistent format
        System.out.println("DRAWING TRIANGLE:");
        System.out.println("Sides: " + sideA + ", " + sideB + ", " + sideC);
        // Completely forgets to mention color
    }
    
    // ERROR: Completely reimplements displayInfo() with yet another inconsistent format
    @Override
    public void displayInfo() {
        // Does not call super.displayInfo()
        // Another inconsistent format
        System.out.println("Triangle:");
        System.out.println("Side lengths = " + sideA + ", " + sideB + ", " + sideC);
        // Completely forgets to display color
    }
}
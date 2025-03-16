/**
 * MOD3B2_Exp.java
 * 
 * This program demonstrates MOD-3.B.2: Classes that extend a superclass, called subclasses,
 * can draw upon the existing attributes and behaviors of the superclass without repeating
 * these in the code.
 */
public class MOD3B2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating subclasses using superclass attributes and behaviors (MOD-3.B.2):\n");
        
        // Create instances of different shape types
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        Triangle triangle = new Triangle("Green", 3.0, 4.0, 5.0);
        
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
        
        System.out.println("\n--- Key Points about Subclasses Using Superclass Features ---");
        System.out.println("1. Subclasses inherit attributes and behaviors from the superclass");
        System.out.println("2. Subclasses can use superclass methods without redefining them");
        System.out.println("3. Subclasses can access protected members of the superclass");
        System.out.println("4. This promotes code reuse and reduces redundancy");
        System.out.println("5. Subclasses only need to define what makes them different from the superclass");
    }
}

/**
 * Superclass for all shapes
 */
class Shape {
    // Common attributes for all shapes
    protected String color;
    
    // Constructor
    public Shape(String color) {
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
 * Circle subclass
 */
class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color); // Reuse superclass constructor
        this.radius = radius;
    }
    
    // Override superclass method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Override superclass method
    @Override
    public void draw() {
        // Reuse superclass behavior
        super.draw();
        System.out.println("Specifically, drawing a circle with radius " + radius);
    }
    
    // Override superclass method
    @Override
    public void displayInfo() {
        // Reuse superclass behavior
        super.displayInfo();
        System.out.println("Radius: " + radius);
    }
    
    // Circle-specific method
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

/**
 * Rectangle subclass
 */
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color); // Reuse superclass constructor
        this.length = length;
        this.width = width;
    }
    
    // Override superclass method
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    // Override superclass method
    @Override
    public void draw() {
        // Reuse superclass behavior
        super.draw();
        System.out.println("Specifically, drawing a rectangle with length " + length + " and width " + width);
    }
    
    // Override superclass method
    @Override
    public void displayInfo() {
        // Reuse superclass behavior
        super.displayInfo();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
    
    // Rectangle-specific method
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

/**
 * Triangle subclass
 */
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    
    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color); // Reuse superclass constructor
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    // Override superclass method
    @Override
    public double calculateArea() {
        // Heron's formula
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    
    // Override superclass method
    @Override
    public void draw() {
        // Reuse superclass behavior
        super.draw();
        System.out.println("Specifically, drawing a triangle with sides " + sideA + ", " + sideB + ", and " + sideC);
    }
    
    // Override superclass method
    @Override
    public void displayInfo() {
        // Reuse superclass behavior
        super.displayInfo();
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
    }
    
    // Triangle-specific method
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
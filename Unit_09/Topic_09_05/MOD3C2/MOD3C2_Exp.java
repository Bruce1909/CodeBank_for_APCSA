/**
 * MOD3C2_Exp.java
 * 
 * This program demonstrates MOD-3.C.2: If S is a subclass of T, then assigning an object of type S
 * to a reference of type T facilitates polymorphism.
 */
public class MOD3C2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating polymorphism through superclass references (MOD-3.C.2):\n");
        
        // Create objects of different types
        System.out.println("Creating objects of different types:");
        Shape circle = new Circle("Red Circle", 5.0);
        Shape rectangle = new Rectangle("Blue Rectangle", 4.0, 6.0);
        Shape triangle = new Triangle("Green Triangle", 3.0, 4.0, 5.0);
        
        // Notice that all variables are declared as Shape (superclass type)
        // but they reference objects of different subclass types
        
        // Demonstrate polymorphism by calling methods on superclass references
        System.out.println("\n--- Demonstrating Polymorphism ---");
        displayShapeInfo(circle);     // Passes a Circle object through a Shape reference
        displayShapeInfo(rectangle);  // Passes a Rectangle object through a Shape reference
        displayShapeInfo(triangle);   // Passes a Triangle object through a Shape reference
        
        // Create an array of Shape references containing different subclass objects
        System.out.println("\n--- Demonstrating Polymorphism with an Array ---");
        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = triangle;
        
        // Process all shapes polymorphically
        for (Shape shape : shapes) {
            System.out.println("\nProcessing: " + shape.getName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            // The appropriate method for each actual object type is called
        }
        
        // Explain polymorphism
        System.out.println("\n--- Explanation of Polymorphism ---");
        System.out.println("1. All variables are declared as the superclass type (Shape)");
        System.out.println("2. Each variable references an object of a different subclass");
        System.out.println("3. When methods are called, the appropriate version for the actual object type executes");
        System.out.println("4. This is known as dynamic binding or runtime polymorphism");
        System.out.println("5. Polymorphism allows for flexible and extensible code");
    }
    
    // Method that accepts a Shape reference but can work with any subclass of Shape
    public static void displayShapeInfo(Shape shape) {
        System.out.println("\nShape Information:");
        System.out.println("Name: " + shape.getName());
        System.out.println("Type: " + shape.getClass().getSimpleName());
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        // The appropriate version of calculateArea() and calculatePerimeter() 
        // is called based on the actual object type
    }
}

/**
 * Superclass - Shape
 */
abstract class Shape {
    protected String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    // Abstract methods to be implemented by subclasses
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

/**
 * Subclass - Circle
 */
class Circle extends Shape {
    private double radius;
    
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
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
 * Subclass - Rectangle
 */
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
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

/**
 * Subclass - Triangle
 */
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    
    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    @Override
    public double calculateArea() {
        // Using Heron's formula
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
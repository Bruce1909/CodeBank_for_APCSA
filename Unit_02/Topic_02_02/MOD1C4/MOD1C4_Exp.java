/**
 * MOD1C4_Exp.java
 * 
 * This program demonstrates the correct usage of constructor overloading.
 * 
 * Knowledge Point: MOD-1.C.4
 * Constructors are said to be overloaded when there are multiple constructors with the same name but a different signature.
 */
public class MOD1C4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Constructor Overloading:\n");
        
        // Creating objects using different overloaded constructors
        System.out.println("Example 1: Creating a Rectangle with no parameters");
        Rectangle rect1 = new Rectangle();
        rect1.display();
        
        System.out.println("\nExample 2: Creating a Rectangle with width and height");
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        rect2.display();
        
        System.out.println("\nExample 3: Creating a Rectangle with width, height, and color");
        Rectangle rect3 = new Rectangle(4.0, 2.0, "blue");
        rect3.display();
        
        System.out.println("\nExample 4: Creating a Rectangle with a single dimension (square)");
        Rectangle rect4 = new Rectangle(6.0);
        rect4.display();
        
        System.out.println("\nExample 5: Creating a Rectangle with color only");
        Rectangle rect5 = new Rectangle("green");
        rect5.display();
        
        System.out.println("\nConstructor overloading:");
        System.out.println("- Allows multiple constructors with the same name but different signatures");
        System.out.println("- Each constructor must have a unique parameter list (different types or number of parameters)");
        System.out.println("- Enables object creation with different sets of initial values");
        System.out.println("- The appropriate constructor is called based on the arguments provided");
    }
}

// Rectangle class with multiple overloaded constructors
class Rectangle {
    // Instance variables
    private double width;
    private double height;
    private String color;
    
    // Constructor with no parameters
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
        this.color = "red";
        System.out.println("Called constructor with signature: Rectangle()");
    }
    
    // Constructor with one parameter (square)
    public Rectangle(double side) {
        this.width = side;
        this.height = side;
        this.color = "red";
        System.out.println("Called constructor with signature: Rectangle(double)");
    }
    
    // Constructor with one parameter (color)
    public Rectangle(String color) {
        this.width = 1.0;
        this.height = 1.0;
        this.color = color;
        System.out.println("Called constructor with signature: Rectangle(String)");
    }
    
    // Constructor with two parameters
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.color = "red";
        System.out.println("Called constructor with signature: Rectangle(double, double)");
    }
    
    // Constructor with three parameters
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
        System.out.println("Called constructor with signature: Rectangle(double, double, String)");
    }
    
    // Method to display rectangle information
    public void display() {
        System.out.println("Rectangle Information:");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Color: " + color);
        System.out.println("Area: " + (width * height));
    }
}
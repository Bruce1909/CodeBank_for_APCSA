/**
 * MOD1C4_Err.java
 * 
 * This program demonstrates common errors when using constructor overloading.
 * 
 * Knowledge Point: MOD-1.C.4
 * Constructors are said to be overloaded when there are multiple constructors with the same name but a different signature.
 */
public class MOD1C4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Constructor Overloading Errors:\n");
        
        // Creating a valid Rectangle object for comparison
        Rectangle validRect = new Rectangle(4.0, 3.0, "yellow");
        validRect.display();
        
        System.out.println("\nCommon errors with constructor overloading:");
        System.out.println("1. Creating constructors with the same signature");
        System.out.println("2. Ambiguous constructor calls");
        System.out.println("3. Type conversion issues with overloaded constructors");
        System.out.println("4. Recursive constructor calls without a base case");
        
        // ERROR 1: Ambiguous constructor call
        // Uncommenting the following line will cause a compilation error in some cases
        // Rectangle rect1 = new Rectangle(5); // Error: Ambiguous between Rectangle(double) and Rectangle(int)
        
        // ERROR 2: Trying to call a constructor that doesn't exist
        // Uncommenting the following line will cause a compilation error
        // Rectangle rect2 = new Rectangle(true); // Error: No constructor with boolean parameter
        
        // ERROR 3: Type conversion issues
        // Uncommenting the following line might cause unexpected behavior
        // Rectangle rect3 = new Rectangle('A'); // 'A' is converted to int 65, then to double
    }
}

// Rectangle class with overloaded constructors and common errors
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
    }
    
    // Constructor with one parameter (double)
    public Rectangle(double side) {
        this.width = side;
        this.height = side;
        this.color = "red";
    }
    
    // ERROR 1: Constructor with same signature as another constructor
    // Uncommenting the following will cause a compilation error
    /*
    public Rectangle(double length) {
        // Error: Duplicate method Rectangle(double) in type Rectangle
        this.width = length;
        this.height = length;
        this.color = "blue";
    }
    */
    
    // Constructor with one parameter (String)
    public Rectangle(String color) {
        this.width = 1.0;
        this.height = 1.0;
        this.color = color;
    }
    
    // Constructor with two parameters
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.color = "red";
    }
    
    // Constructor with three parameters
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    // ERROR 2: Recursive constructor call without reaching a base case
    // Uncommenting the following will cause a stack overflow error at runtime
    /*
    public Rectangle(int size) {
        // Error: Recursive constructor invocation
        this(size); // Calls itself recursively
    }
    */
    
    // ERROR 3: Ambiguous constructor with similar parameter types
    // Uncommenting the following will cause a compilation error
    /*
    public Rectangle(int width, int height) {
        // This can cause ambiguity with Rectangle(double, double)
        // when autoboxing/unboxing is involved
        this.width = width;
        this.height = height;
        this.color = "red";
    }
    */
    
    // Method to display rectangle information
    public void display() {
        System.out.println("Rectangle Information:");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Color: " + color);
        System.out.println("Area: " + (width * height));
    }
}
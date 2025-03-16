/**
 * MOD3B7_Err.java
 * 
 * This program demonstrates errors related to MOD-3.B.7: Incorrectly passing parameters
 * to the superclass constructor, which leads to improper initialization of instance variables.
 */
public class MOD3B7_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors when passing parameters to superclass constructors (MOD-3.B.7):\n");
        
        // ERROR 1: Passing incorrect parameter types
        System.out.println("ERROR 1: Passing incorrect parameter types");
        System.out.println("Creating a RectangleWithError with incorrect parameter types:");
        // This will cause type conversion issues
        RectangleWithError rectangle = new RectangleWithError("Blue", "5", "3"); // Strings instead of doubles
        rectangle.displayInfo();
        System.out.println("Area: " + rectangle.calculateArea()); // Will show 0.0 due to conversion error
        System.out.println();
        
        // ERROR 2: Passing null values
        System.out.println("ERROR 2: Passing null values");
        System.out.println("Creating a CircleWithError with null color:");
        CircleWithError circle = new CircleWithError(null, 4.0);
        circle.displayInfo(); // Will display null for color
        System.out.println();
        
        // ERROR 3: Passing out-of-range values
        System.out.println("ERROR 3: Passing out-of-range values");
        System.out.println("Creating a StudentWithError with negative age:");
        StudentWithError student = new StudentWithError("Jane Smith", -5, "Computer Science");
        student.displayInfo(); // Will display negative age
        System.out.println();
        
        // ERROR 4: Passing the wrong number of parameters
        System.out.println("ERROR 4: Passing the wrong number of parameters");
        System.out.println("The following code would not compile in Java:");
        System.out.println("TriangleWithError triangle = new TriangleWithError(\"Red\"); // Missing required parameters");
        System.out.println();
        
        // ERROR 5: Passing parameters in the wrong order
        System.out.println("ERROR 5: Passing parameters in the wrong order");
        System.out.println("Creating a PersonWithError with swapped parameters:");
        PersonWithError person = new PersonWithError(25, "John Doe"); // Age and name swapped
        person.displayInfo(); // Will display incorrect values
        
        System.out.println("\n--- Problems with Incorrect Parameter Passing ---");
        System.out.println("1. Passing incorrect parameter types causes type conversion issues");
        System.out.println("2. Passing null values can lead to NullPointerExceptions");
        System.out.println("3. Passing out-of-range values leads to logical errors");
        System.out.println("4. Passing the wrong number of parameters causes compilation errors");
        System.out.println("5. Passing parameters in the wrong order leads to incorrect initialization");
    }
}

/**
 * Superclass for shapes with errors
 */
class ShapeWithError {
    private String color;
    
    // Constructor that initializes the color instance variable
    public ShapeWithError(String color) {
        System.out.println("ShapeWithError constructor called with color: " + color);
        this.color = color; // Initialize instance variable with parameter value
    }
    
    public void displayInfo() {
        System.out.println("Color: " + color);
    }
    
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
 * ERROR: Rectangle subclass with incorrect parameter handling
 */
class RectangleWithError extends ShapeWithError {
    private double length;
    private double width;
    
    // ERROR: Constructor accepts String parameters instead of double
    public RectangleWithError(String color, String lengthStr, String widthStr) {
        super(color); // Pass color parameter to superclass constructor
        System.out.println("RectangleWithError constructor called with length: " + lengthStr + ", width: " + widthStr);
        
        // ERROR: Improper conversion without error handling
        try {
            this.length = Double.parseDouble(lengthStr);
            this.width = Double.parseDouble(widthStr);
        } catch (NumberFormatException e) {
            // ERROR: Silently failing and using default values
            System.out.println("Error converting dimensions to numbers. Using default values.");
            this.length = 0.0;
            this.width = 0.0;
        }
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display superclass info
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
}

/**
 * ERROR: Circle subclass that doesn't handle null values properly
 */
class CircleWithError extends ShapeWithError {
    private double radius;
    
    // Constructor that doesn't check for null color
    public CircleWithError(String color, double radius) {
        super(color); // Pass potentially null color to superclass constructor
        System.out.println("CircleWithError constructor called with radius: " + radius);
        this.radius = radius;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display superclass info, may display "Color: null"
        System.out.println("Radius: " + radius);
        
        // ERROR: Potential NullPointerException if color is used in string operations
        // String upperCaseColor = getColor().toUpperCase(); // Would throw NullPointerException if color is null
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

/**
 * Person superclass with errors
 */
class PersonWithError {
    private String name;
    private int age;
    
    // ERROR: Constructor parameters in unusual order (age before name)
    public PersonWithError(int age, String name) {
        System.out.println("PersonWithError constructor called with age: " + age + ", name: " + name);
        this.name = name;
        this.age = age; // No validation for negative age
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}

/**
 * ERROR: Student subclass that doesn't validate parameters
 */
class StudentWithError extends PersonWithError {
    private String major;
    
    // Constructor that passes negative age to superclass
    public StudentWithError(String name, int age, String major) {
        super(age, name); // Pass age and name to superclass constructor (in the order expected by PersonWithError)
        System.out.println("StudentWithError constructor called with major: " + major);
        this.major = major;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display superclass info
        System.out.println("Major: " + major);
    }
}

/**
 * ERROR: Triangle class with missing parameters
 * This class demonstrates a constructor that would cause compilation errors
 * if instantiated without all required parameters
 */
class TriangleWithError extends ShapeWithError {
    private double sideA;
    private double sideB;
    private double sideC;
    
    // Constructor that requires all parameters
    public TriangleWithError(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    // ERROR: No constructor that accepts just color
    // The following instantiation would cause a compilation error:
    // TriangleWithError triangle = new TriangleWithError("Red");
}
/**
 * MOD3B7_Exp.java
 * 
 * This program demonstrates MOD-3.B.7: The actual parameters passed in the call to the
 * superclass constructor provide values that the constructor can use to initialize the
 * object's instance variables.
 */
public class MOD3B7_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating parameter passing to superclass constructors (MOD-3.B.7):\n");
        
        // Create instances with different parameter values
        System.out.println("Creating a Rectangle with specific dimensions:");
        Rectangle rectangle = new Rectangle("Blue", 5.0, 3.0);
        rectangle.displayInfo();
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println();
        
        System.out.println("Creating a Circle with specific radius:");
        Circle circle = new Circle("Red", 4.0);
        circle.displayInfo();
        System.out.println("Area: " + circle.calculateArea());
        System.out.println();
        
        System.out.println("Creating a Student with specific information:");
        Student student = new Student("Jane Smith", 20, "Computer Science");
        student.displayInfo();
        System.out.println();
        
        // Demonstrate passing calculated or derived values
        System.out.println("Creating a Rectangle with calculated dimensions:");
        double width = 2.5;
        double length = width * 2; // Calculated value
        Rectangle rectangle2 = new Rectangle("Green", length, width);
        rectangle2.displayInfo();
        System.out.println("Area: " + rectangle2.calculateArea());
        
        System.out.println("\n--- Key Points about Parameter Passing to Superclass Constructors ---");
        System.out.println("1. Parameters passed to super() are used to initialize superclass instance variables");
        System.out.println("2. These parameters can be literals, variables, or expressions");
        System.out.println("3. The values are passed from the subclass to the superclass");
        System.out.println("4. This ensures proper initialization of inherited attributes");
        System.out.println("5. Parameter types must match the superclass constructor's parameter types");
    }
}

/**
 * Superclass for shapes
 */
class Shape {
    private String color;
    
    // Constructor that initializes the color instance variable
    public Shape(String color) {
        System.out.println("Shape constructor called with color: " + color);
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
 * Rectangle subclass
 */
class Rectangle extends Shape {
    private double length;
    private double width;
    
    // Constructor that passes color to superclass and initializes length and width
    public Rectangle(String color, double length, double width) {
        super(color); // Pass color parameter to superclass constructor
        System.out.println("Rectangle constructor called with length: " + length + ", width: " + width);
        this.length = length; // Initialize subclass instance variable
        this.width = width;   // Initialize subclass instance variable
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
 * Circle subclass
 */
class Circle extends Shape {
    private double radius;
    
    // Constructor that passes color to superclass and initializes radius
    public Circle(String color, double radius) {
        super(color); // Pass color parameter to superclass constructor
        System.out.println("Circle constructor called with radius: " + radius);
        this.radius = radius; // Initialize subclass instance variable
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display superclass info
        System.out.println("Radius: " + radius);
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

/**
 * Person superclass
 */
class Person {
    private String name;
    private int age;
    
    // Constructor that initializes name and age instance variables
    public Person(String name, int age) {
        System.out.println("Person constructor called with name: " + name + ", age: " + age);
        this.name = name; // Initialize instance variable with parameter value
        this.age = age;   // Initialize instance variable with parameter value
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
 * Student subclass
 */
class Student extends Person {
    private String major;
    
    // Constructor that passes name and age to superclass and initializes major
    public Student(String name, int age, String major) {
        super(name, age); // Pass name and age parameters to superclass constructor
        System.out.println("Student constructor called with major: " + major);
        this.major = major; // Initialize subclass instance variable
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display superclass info
        System.out.println("Major: " + major);
    }
    
    // Getter and setter
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
}
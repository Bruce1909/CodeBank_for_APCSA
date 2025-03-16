/**
 * MOD3B14_Exp.java
 * 
 * This program demonstrates MOD-3.B.14: The keyword 'super' can be used to call a
 * superclass's constructors and methods.
 */
public class MOD3B14_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating the 'super' keyword for calling superclass constructors and methods (MOD-3.B.14):\n");
        
        // Create instances of different shapes
        System.out.println("Creating a Rectangle object:");
        Rectangle rectangle = new Rectangle("Blue", 5.0, 3.0);
        rectangle.displayInfo();
        rectangle.draw();
        System.out.println();
        
        System.out.println("Creating a Circle object:");
        Circle circle = new Circle("Red", 4.0);
        circle.displayInfo();
        circle.draw();
        System.out.println();
        
        // Create an instance of Student to demonstrate both constructor and method calls
        System.out.println("Creating a Student object:");
        Student student = new Student("Jane Smith", 20, "Computer Science");
        student.displayInfo();
        student.study();
        
        System.out.println("\n--- Key Points about Using 'super' Keyword ---");
        System.out.println("1. The 'super' keyword can call superclass constructors: super(...)");
        System.out.println("2. The 'super' keyword can call superclass methods: super.methodName(...)");
        System.out.println("3. Constructor calls with super() must be the first statement in a constructor");
        System.out.println("4. Method calls with super.method() can be anywhere in a method");
        System.out.println("5. Using super helps avoid code duplication and maintains the inheritance hierarchy");
    }
}

/**
 * Superclass for shapes
 */
class Shape {
    private String color;
    
    // Constructor
    public Shape(String color) {
        System.out.println("Executing Shape constructor");
        this.color = color;
    }
    
    // Methods that can be called using super
    public void displayInfo() {
        System.out.println("Color: " + color);
    }
    
    public void draw() {
        System.out.println("Drawing a " + color + " shape");
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
 * Rectangle subclass that uses super for constructor and method calls
 */
class Rectangle extends Shape {
    private double length;
    private double width;
    
    // Constructor that uses super to call superclass constructor
    public Rectangle(String color, double length, double width) {
        super(color); // Call to superclass constructor using super
        System.out.println("Executing Rectangle constructor");
        this.length = length;
        this.width = width;
    }
    
    // Method that uses super to call superclass method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to superclass method using super
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + (length * width));
    }
    
    // Method that uses super to call superclass method
    @Override
    public void draw() {
        super.draw(); // Call to superclass method using super
        System.out.println("Specifically, drawing a rectangle with length " + length + " and width " + width);
    }
}

/**
 * Circle subclass that uses super for constructor and method calls
 */
class Circle extends Shape {
    private double radius;
    
    // Constructor that uses super to call superclass constructor
    public Circle(String color, double radius) {
        super(color); // Call to superclass constructor using super
        System.out.println("Executing Circle constructor");
        this.radius = radius;
    }
    
    // Method that uses super to call superclass method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to superclass method using super
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
    }
    
    // Method that uses super to call superclass method
    @Override
    public void draw() {
        super.draw(); // Call to superclass method using super
        System.out.println("Specifically, drawing a circle with radius " + radius);
    }
}

/**
 * Person superclass
 */
class Person {
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        System.out.println("Executing Person constructor");
        this.name = name;
        this.age = age;
    }
    
    // Methods that can be called using super
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public void greet() {
        System.out.println("Hello, my name is " + name);
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
 * Student subclass that uses super for constructor and method calls
 */
class Student extends Person {
    private String major;
    
    // Constructor that uses super to call superclass constructor
    public Student(String name, int age, String major) {
        super(name, age); // Call to superclass constructor using super
        System.out.println("Executing Student constructor");
        this.major = major;
    }
    
    // Method that uses super to call superclass method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to superclass method using super
        System.out.println("Major: " + major);
    }
    
    // Method that uses super to call superclass method
    public void study() {
        super.greet(); // Call to superclass method using super
        System.out.println("I am studying " + major);
    }
}
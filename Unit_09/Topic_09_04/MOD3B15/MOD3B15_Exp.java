/**
 * MOD3B15_Exp.java
 * 
 * This program demonstrates MOD-3.B.15: The superclass method can be called in a subclass
 * by using the keyword 'super' with the method name and passing appropriate parameters.
 */
public class MOD3B15_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating calling superclass methods with 'super' (MOD-3.B.15):\n");
        
        // Create instances of different shapes
        System.out.println("Creating a Rectangle object:");
        Rectangle rectangle = new Rectangle("Blue", 5.0, 3.0);
        rectangle.displayInfo();
        rectangle.calculateArea();
        rectangle.draw();
        System.out.println();
        
        System.out.println("Creating a Circle object:");
        Circle circle = new Circle("Red", 4.0);
        circle.displayInfo();
        circle.calculateArea();
        circle.draw();
        System.out.println();
        
        // Create an instance of Employee to demonstrate method calls with parameters
        System.out.println("Creating an Employee object:");
        Employee employee = new Employee("John Doe", 50000);
        employee.displayInfo();
        employee.giveRaise(5000);
        System.out.println();
        
        // Create an instance of Manager to demonstrate calling superclass methods with parameters
        System.out.println("Creating a Manager object:");
        Manager manager = new Manager("Jane Smith", 80000, "Marketing");
        manager.displayInfo();
        manager.giveRaise(10000); // Calls overridden method that uses super
        
        System.out.println("\n--- Key Points about Calling Superclass Methods with 'super' ---");
        System.out.println("1. The 'super' keyword with a method name calls the superclass version of that method");
        System.out.println("2. Parameters can be passed to the superclass method as needed");
        System.out.println("3. This allows subclasses to extend superclass behavior rather than completely replace it");
        System.out.println("4. Using super.methodName() can be done anywhere in a subclass method");
        System.out.println("5. This is particularly useful when overriding methods but still needing the superclass functionality");
    }
}

/**
 * Superclass for shapes
 */
class Shape {
    private String color;
    
    // Constructor
    public Shape(String color) {
        this.color = color;
    }
    
    // Methods that can be called using super
    public void displayInfo() {
        System.out.println("Color: " + color);
    }
    
    public void draw() {
        System.out.println("Drawing a " + color + " shape");
    }
    
    public double calculateArea() {
        System.out.println("Calculating area of a generic shape");
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
 * Rectangle subclass that calls superclass methods using super
 */
class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void displayInfo() {
        // Call superclass method using super
        super.displayInfo();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
    
    @Override
    public double calculateArea() {
        // Call superclass method using super
        super.calculateArea(); // This calls the Shape's calculateArea method
        
        // Add subclass-specific implementation
        double area = length * width;
        System.out.println("Rectangle area: " + area);
        return area;
    }
    
    @Override
    public void draw() {
        // Call superclass method using super
        super.draw();
        System.out.println("Specifically, drawing a rectangle with length " + length + " and width " + width);
    }
}

/**
 * Circle subclass that calls superclass methods using super
 */
class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public void displayInfo() {
        // Call superclass method using super
        super.displayInfo();
        System.out.println("Radius: " + radius);
    }
    
    @Override
    public double calculateArea() {
        // Call superclass method using super
        super.calculateArea(); // This calls the Shape's calculateArea method
        
        // Add subclass-specific implementation
        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + area);
        return area;
    }
    
    @Override
    public void draw() {
        // Call superclass method using super
        super.draw();
        System.out.println("Specifically, drawing a circle with radius " + radius);
    }
}

/**
 * Employee superclass with methods that take parameters
 */
class Employee {
    private String name;
    private double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
    
    // Method with parameters that can be called using super
    public void giveRaise(double amount) {
        if (amount > 0) {
            salary += amount;
            System.out.println(name + " received a raise of $" + amount);
            System.out.println("New salary: $" + salary);
        } else {
            System.out.println("Invalid raise amount.");
        }
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

/**
 * Manager subclass that calls superclass methods with parameters using super
 */
class Manager extends Employee {
    private String department;
    
    public Manager(String name, double salary, String department) {
        super(name, department);
        this.department = department;
    }
    
    @Override
    public void displayInfo() {
        // Call superclass method using super
        super.displayInfo();
        System.out.println("Department: " + department);
    }
    
    @Override
    public void giveRaise(double amount) {
        // Add a bonus for managers (10% extra)
        double bonus = amount * 0.1;
        System.out.println("Manager bonus: $" + bonus);
        
        // Call superclass method with parameters using super
        super.giveRaise(amount + bonus); // Pass the modified amount to the superclass method
    }
}
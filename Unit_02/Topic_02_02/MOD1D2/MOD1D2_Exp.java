/**
 * MOD1D2_Exp - Example demonstrating constructors having the same name as the class
 * 
 * This program demonstrates MOD-1.D.2:
 * A class contains constructors that are invoked to create objects. They have the same name as the class.
 */
public class MOD1D2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating constructors having the same name as the class:\n");
        
        // Example 1: Creating objects using the Person class constructor
        System.out.println("Example 1: Creating Person objects using constructors");
        Person person1 = new Person(); // Using no-arg constructor
        Person person2 = new Person("Alice", 25); // Using parameterized constructor
        
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
        System.out.println();
        
        // Example 2: Creating objects using the Rectangle class constructor
        System.out.println("Example 2: Creating Rectangle objects using constructors");
        Rectangle rect1 = new Rectangle(); // Using no-arg constructor
        Rectangle rect2 = new Rectangle(5.0, 3.0); // Using parameterized constructor
        
        System.out.println("Rectangle 1: " + rect1);
        System.out.println("Rectangle 2: " + rect2);
        System.out.println();
        
        // Example 3: Creating objects using the Car class constructor
        System.out.println("Example 3: Creating Car objects using constructors");
        Car car1 = new Car(); // Using no-arg constructor
        Car car2 = new Car("Toyota", "Camry", 2022); // Using parameterized constructor
        
        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Constructors ---");
        System.out.println("1. Constructors always have the same name as the class");
        System.out.println("2. Constructors are used to initialize the object's state");
        System.out.println("3. A class can have multiple constructors (constructor overloading)");
        System.out.println("4. Constructors don't have a return type, not even void");
        System.out.println("5. Constructors are called automatically when an object is created with 'new'");
    }
}

/**
 * Person class with multiple constructors
 */
class Person {
    private String name;
    private int age;
    
    // No-arg constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Person() constructor called");
    }
    
    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person(String, int) constructor called");
    }
    
    @Override
    public String toString() {
        return "Person(name=" + name + ", age=" + age + ")";
    }
}

/**
 * Rectangle class with multiple constructors
 */
class Rectangle {
    private double length;
    private double width;
    
    // No-arg constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
        System.out.println("Rectangle() constructor called");
    }
    
    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Rectangle(double, double) constructor called");
    }
    
    @Override
    public String toString() {
        return "Rectangle(length=" + length + ", width=" + width + ")";
    }
}

/**
 * Car class with multiple constructors
 */
class Car {
    private String make;
    private String model;
    private int year;
    
    // No-arg constructor
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        System.out.println("Car() constructor called");
    }
    
    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("Car(String, String, int) constructor called");
    }
    
    @Override
    public String toString() {
        return "Car(make=" + make + ", model=" + model + ", year=" + year + ")";
    }
}
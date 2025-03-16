/**
 * MOD1D2_Err - Error examples demonstrating common mistakes with constructors
 * 
 * This program demonstrates common errors related to MOD-1.D.2:
 * A class contains constructors that are invoked to create objects. They have the same name as the class.
 */
public class MOD1D2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with constructors:\n");
        
        // Example 1: Attempting to name a constructor differently from the class
        System.out.println("Example 1: Attempting to name a constructor differently from the class");
        System.out.println("// Error: In the class definition:");
        System.out.println("// public void InitializeStudent() { // This is a method, not a constructor");
        System.out.println("//     this.name = \"Unknown\";");
        System.out.println("//     this.id = 0;");
        System.out.println("// }");
        System.out.println("// This would compile but wouldn't be called when creating a new Student");
        
        // Correct way
        System.out.println("Correct way:");
        System.out.println("// public Student() { // Constructor has the same name as the class");
        System.out.println("//     this.name = \"Unknown\";");
        System.out.println("//     this.id = 0;");
        System.out.println("// }");
        
        // Create a student to demonstrate
        Student student = new Student();
        System.out.println("Created student: " + student);
        System.out.println();
        
        // Example 2: Trying to specify a return type for a constructor
        System.out.println("Example 2: Trying to specify a return type for a constructor");
        System.out.println("// Error: In the class definition:");
        System.out.println("// public Student Student() { // Constructors cannot have return types");
        System.out.println("//     this.name = \"Unknown\";");
        System.out.println("//     this.id = 0;");
        System.out.println("//     return this; // Cannot return from constructor");
        System.out.println("// }");
        System.out.println("// This would cause a compilation error");
        
        // Correct way
        System.out.println("Correct way:");
        System.out.println("// public Student() { // No return type specified");
        System.out.println("//     this.name = \"Unknown\";");
        System.out.println("//     this.id = 0;");
        System.out.println("// }");
        System.out.println();
        
        // Example 3: Trying to call a constructor directly like a method
        System.out.println("Example 3: Trying to call a constructor directly like a method");
        System.out.println("// Error: Rectangle rect = new Rectangle();");
        System.out.println("// rect.Rectangle(10.0, 5.0); // Cannot call constructor as a method");
        System.out.println("// This would cause a compilation error");
        
        // Correct way
        System.out.println("Correct way:");
        Rectangle rect = new Rectangle();
        System.out.println("Rectangle rect = new Rectangle(); // Create with default constructor");
        System.out.println("// To change values, use setter methods or create a new object:");
        rect.setDimensions(10.0, 5.0); // Use a method to change values
        System.out.println("rect.setDimensions(10.0, 5.0); // Use a method instead");
        System.out.println("Updated rectangle: " + rect);
        System.out.println();
        
        // Example 4: Forgetting that constructors are not inherited
        System.out.println("Example 4: Forgetting that constructors are not inherited");
        System.out.println("// Error: When creating a subclass without defining constructors:");
        System.out.println("// class SportsCar extends Car {");
        System.out.println("//     private int topSpeed;");
        System.out.println("//     // No constructor defined, only default no-arg constructor available");
        System.out.println("// }");
        System.out.println("// SportsCar sc = new SportsCar(\"Ferrari\", \"F50\", 2023); // Error: No such constructor");
        
        // Correct way
        System.out.println("Correct way:");
        SportsCar sc = new SportsCar(); // Using default constructor
        System.out.println("SportsCar sc = new SportsCar(); // Using available no-arg constructor");
        System.out.println("Created sports car: " + sc);
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors with Constructors ---");
        System.out.println("1. Naming a method like a constructor (with class name but with return type)");
        System.out.println("2. Adding a return type to a constructor declaration");
        System.out.println("3. Trying to call a constructor directly after object creation");
        System.out.println("4. Forgetting that constructors are not inherited from parent classes");
        System.out.println("5. Forgetting to define a no-arg constructor when other constructors exist");
    }
}

/**
 * Student class with a proper constructor
 */
class Student {
    private String name;
    private int id;
    
    // Proper constructor - same name as class, no return type
    public Student() {
        this.name = "Unknown";
        this.id = 0;
        System.out.println("Student constructor called");
    }
    
    // This is a method, not a constructor (has return type and different name)
    public void initializeStudent() {
        this.name = "Unknown";
        this.id = 0;
        System.out.println("initializeStudent method called - this is NOT a constructor");
    }
    
    @Override
    public String toString() {
        return "Student(name=" + name + ", id=" + id + ")";
    }
}

/**
 * Rectangle class with a constructor and a setter method
 */
class Rectangle {
    private double length;
    private double width;
    
    // Constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
        System.out.println("Rectangle constructor called");
    }
    
    // Method to set dimensions (not a constructor)
    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("setDimensions method called");
    }
    
    @Override
    public String toString() {
        return "Rectangle(length=" + length + ", width=" + width + ")";
    }
}

/**
 * Car class (parent class)
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
        System.out.println("Car no-arg constructor called");
    }
    
    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("Car parameterized constructor called");
    }
    
    @Override
    public String toString() {
        return "Car(make=" + make + ", model=" + model + ", year=" + year + ")";
    }
}

/**
 * SportsCar class (subclass) - demonstrates constructor issues
 */
class SportsCar extends Car {
    private int topSpeed;
    
    // Only has default no-arg constructor which calls parent's no-arg constructor
    // No parameterized constructor is defined, so can't be called with parameters
    
    @Override
    public String toString() {
        return super.toString() + " SportsCar(topSpeed=" + topSpeed + ")";
    }
}
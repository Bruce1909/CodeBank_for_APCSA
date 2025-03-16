/**
 * MOD2B1_Exp.java
 * 
 * This program demonstrates the correct usage of instance variables as described in
 * MOD-2.B.1: An object's state refers to its attributes and their values at a given time
 * and is defined by instance variables belonging to the object. This creates a "has-a"
 * relationship between the object and its instance variables.
 */
public class MOD2B1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating instance variables and object state (MOD-2.B.1):\n");
        
        // Create two Car objects with different initial states
        Car car1 = new Car("Toyota", "Camry", 2022, "Blue");
        Car car2 = new Car("Honda", "Civic", 2021, "Red");
        
        // Display the initial state of each car
        System.out.println("Initial state of car1:");
        car1.displayInfo();
        
        System.out.println("\nInitial state of car2:");
        car2.displayInfo();
        
        // Modify the state of car1
        System.out.println("\nChanging the state of car1:");
        car1.setColor("Black");
        car1.setMileage(1500);
        car1.displayInfo();
        
        // Demonstrate that car2's state is independent of car1
        System.out.println("\ncar2's state remains unchanged:");
        car2.displayInfo();
        
        // Create another car with the same make and model but different state
        Car car3 = new Car("Toyota", "Camry", 2020, "Silver");
        car3.setMileage(25000);
        
        System.out.println("\ncar3 has the same make/model as car1 but different state:");
        car3.displayInfo();
        
        System.out.println("\n--- Key Points about Instance Variables and Object State ---");
        System.out.println("1. Each object has its own copy of instance variables");
        System.out.println("2. Instance variables define the object's state at any given time");
        System.out.println("3. The state can change throughout the object's lifetime");
        System.out.println("4. Objects of the same class can have different states");
        System.out.println("5. The 'has-a' relationship means a Car 'has-a' make, model, year, etc.");
    }
}

/**
 * Class that demonstrates instance variables defining an object's state
 */
class Car {
    // Instance variables define the state of a Car object
    private String make;        // Car 'has-a' make
    private String model;       // Car 'has-a' model
    private int year;           // Car 'has-a' year
    private String color;       // Car 'has-a' color
    private double mileage;     // Car 'has-a' mileage
    private boolean running;    // Car 'has-a' running status
    
    // Constructor initializes the state of the Car object
    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = 0.0;     // Default value
        this.running = false;   // Default value
    }
    
    // Methods to change the state of the Car object
    public void start() {
        running = true;
        System.out.println(year + " " + make + " " + model + " started.");
    }
    
    public void stop() {
        running = false;
        System.out.println(year + " " + make + " " + model + " stopped.");
    }
    
    public void drive(double distance) {
        if (running) {
            mileage += distance;
            System.out.println("Drove " + distance + " miles. New mileage: " + mileage);
        } else {
            System.out.println("Cannot drive. Car is not running.");
        }
    }
    
    // Methods to modify specific attributes (changing the state)
    public void setColor(String newColor) {
        System.out.println("Changing color from " + color + " to " + newColor);
        color = newColor;
    }
    
    public void setMileage(double newMileage) {
        System.out.println("Setting mileage from " + mileage + " to " + newMileage);
        mileage = newMileage;
    }
    
    // Method to display the current state of the Car object
    public void displayInfo() {
        System.out.println("  Make: " + make);
        System.out.println("  Model: " + model);
        System.out.println("  Year: " + year);
        System.out.println("  Color: " + color);
        System.out.println("  Mileage: " + mileage);
        System.out.println("  Running: " + (running ? "Yes" : "No"));
    }
}
/**
 * MOD3B1_Exp.java
 * 
 * This program demonstrates MOD-3.B.1: A class hierarchy can be developed by putting
 * common attributes and behaviors of related classes into a single class called a superclass.
 */
public class MOD3B1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating class hierarchy with a superclass (MOD-3.B.1):\n");
        
        // Create instances of different vehicle types
        Car car = new Car("Toyota", "Camry", 4, 5);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2, true);
        Truck truck = new Truck("Ford", "F-150", 4, 2000);
        
        // Display information about each vehicle
        System.out.println("Car Information:");
        car.displayInfo();
        car.startEngine();
        System.out.println();
        
        System.out.println("Motorcycle Information:");
        motorcycle.displayInfo();
        motorcycle.startEngine();
        System.out.println();
        
        System.out.println("Truck Information:");
        truck.displayInfo();
        truck.startEngine();
        
        System.out.println("\n--- Key Points about Class Hierarchy ---");
        System.out.println("1. Common attributes and behaviors are placed in the superclass (Vehicle)");
        System.out.println("2. Specific attributes and behaviors are placed in subclasses (Car, Motorcycle, Truck)");
        System.out.println("3. This reduces code duplication and promotes code reuse");
        System.out.println("4. The superclass provides a common interface for all subclasses");
        System.out.println("5. The class hierarchy represents real-world relationships between objects");
    }
}

/**
 * Superclass that contains common attributes and behaviors of all vehicles
 */
class Vehicle {
    // Common attributes for all vehicles
    private String make;
    private String model;
    private int wheels;
    
    // Constructor
    public Vehicle(String make, String model, int wheels) {
        this.make = make;
        this.model = model;
        this.wheels = wheels;
    }
    
    // Common methods for all vehicles
    public void startEngine() {
        System.out.println("The " + make + " " + model + "'s engine is starting...");
    }
    
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Wheels: " + wheels);
    }
    
    // Getters
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getWheels() {
        return wheels;
    }
}

/**
 * Subclass for cars
 */
class Car extends Vehicle {
    // Specific attribute for cars
    private int seatingCapacity;
    
    // Constructor
    public Car(String make, String model, int wheels, int seatingCapacity) {
        super(make, model, wheels);  // Call superclass constructor
        this.seatingCapacity = seatingCapacity;
    }
    
    // Override displayInfo to include car-specific information
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call superclass method
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

/**
 * Subclass for motorcycles
 */
class Motorcycle extends Vehicle {
    // Specific attribute for motorcycles
    private boolean hasFairing;
    
    // Constructor
    public Motorcycle(String make, String model, int wheels, boolean hasFairing) {
        super(make, model, wheels);  // Call superclass constructor
        this.hasFairing = hasFairing;
    }
    
    // Override displayInfo to include motorcycle-specific information
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call superclass method
        System.out.println("Has Fairing: " + (hasFairing ? "Yes" : "No"));
    }
}

/**
 * Subclass for trucks
 */
class Truck extends Vehicle {
    // Specific attribute for trucks
    private int cargoCapacity;
    
    // Constructor
    public Truck(String make, String model, int wheels, int cargoCapacity) {
        super(make, model, wheels);  // Call superclass constructor
        this.cargoCapacity = cargoCapacity;
    }
    
    // Override displayInfo to include truck-specific information
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call superclass method
        System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
    }
}
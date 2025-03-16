/**
 * MOD3B1_Err.java
 * 
 * This program demonstrates errors related to MOD-3.B.1: Failing to properly develop
 * a class hierarchy by not putting common attributes and behaviors into a superclass.
 */
public class MOD3B1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors in class hierarchy development (MOD-3.B.1):\n");
        
        // Create instances of different vehicle types
        CarWithoutHierarchy car = new CarWithoutHierarchy("Toyota", "Camry", 4, 5);
        MotorcycleWithoutHierarchy motorcycle = new MotorcycleWithoutHierarchy("Honda", "CBR", 2, true);
        TruckWithoutHierarchy truck = new TruckWithoutHierarchy("Ford", "F-150", 4, 2000);
        
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
        
        System.out.println("\n--- Problems with Not Using a Superclass ---");
        System.out.println("1. Code duplication: The same attributes and methods are repeated in each class");
        System.out.println("2. Maintenance issues: Changes must be made in multiple places");
        System.out.println("3. Inconsistent implementation: Methods may be implemented differently");
        System.out.println("4. No common interface: Cannot treat different vehicles polymorphically");
        System.out.println("5. Poor organization: No clear representation of real-world relationships");
    }
}

/**
 * Car class without using inheritance
 * ERROR: Duplicates code that could be in a superclass
 */
class CarWithoutHierarchy {
    // Duplicated attributes that could be in a superclass
    private String make;
    private String model;
    private int wheels;
    private int seatingCapacity;
    
    // Constructor
    public CarWithoutHierarchy(String make, String model, int wheels, int seatingCapacity) {
        this.make = make;
        this.model = model;
        this.wheels = wheels;
        this.seatingCapacity = seatingCapacity;
    }
    
    // Duplicated method that could be in a superclass
    public void startEngine() {
        System.out.println("The " + make + " " + model + "'s engine is starting...");
    }
    
    // Duplicated method that could be in a superclass
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Wheels: " + wheels);
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
    
    // Duplicated getters that could be in a superclass
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
 * Motorcycle class without using inheritance
 * ERROR: Duplicates code that could be in a superclass
 */
class MotorcycleWithoutHierarchy {
    // Duplicated attributes that could be in a superclass
    private String make;
    private String model;
    private int wheels;
    private boolean hasFairing;
    
    // Constructor
    public MotorcycleWithoutHierarchy(String make, String model, int wheels, boolean hasFairing) {
        this.make = make;
        this.model = model;
        this.wheels = wheels;
        this.hasFairing = hasFairing;
    }
    
    // Duplicated method that could be in a superclass
    public void startEngine() {
        // Inconsistent implementation compared to Car class
        System.out.println("Starting the engine of " + make + " " + model + "...");
    }
    
    // Duplicated method that could be in a superclass
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Wheels: " + wheels);
        System.out.println("Has Fairing: " + (hasFairing ? "Yes" : "No"));
    }
    
    // Duplicated getters that could be in a superclass
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
 * Truck class without using inheritance
 * ERROR: Duplicates code that could be in a superclass
 */
class TruckWithoutHierarchy {
    // Duplicated attributes that could be in a superclass
    private String make;
    private String model;
    private int wheels;
    private int cargoCapacity;
    
    // Constructor
    public TruckWithoutHierarchy(String make, String model, int wheels, int cargoCapacity) {
        this.make = make;
        this.model = model;
        this.wheels = wheels;
        this.cargoCapacity = cargoCapacity;
    }
    
    // Duplicated method that could be in a superclass
    public void startEngine() {
        // Another inconsistent implementation
        System.out.println(make + " " + model + " engine starting with a rumble!");
    }
    
    // Duplicated method that could be in a superclass
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Wheels: " + wheels);
        System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
    }
    
    // Duplicated getters that could be in a superclass
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
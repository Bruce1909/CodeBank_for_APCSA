/**
 * MOD3B6_Exp.java
 * 
 * This program demonstrates MOD-3.B.6: The superclass constructor can be called from the
 * first line of a subclass constructor by using the keyword 'super' and passing appropriate
 * parameters.
 */
public class MOD3B6_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating calling superclass constructors with 'super' (MOD-3.B.6):\n");
        
        // Create instances of different vehicle types
        System.out.println("Creating a Car object:");
        Car car = new Car("Toyota", "Camry", 2022, 4);
        car.displayInfo();
        System.out.println();
        
        System.out.println("Creating a Truck object:");
        Truck truck = new Truck("Ford", "F-150", 2023, 2000);
        truck.displayInfo();
        System.out.println();
        
        System.out.println("Creating a Motorcycle object:");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2021, true);
        motorcycle.displayInfo();
        
        System.out.println("\n--- Key Points about Calling Superclass Constructors ---");
        System.out.println("1. The 'super' keyword is used to call a superclass constructor");
        System.out.println("2. The call to 'super' must be the first statement in the subclass constructor");
        System.out.println("3. Appropriate parameters must be passed to match a superclass constructor");
        System.out.println("4. This ensures proper initialization of inherited attributes");
        System.out.println("5. Each subclass constructor explicitly calls a superclass constructor");
    }
}

/**
 * Superclass for all vehicle types
 */
class Vehicle {
    private String make;
    private String model;
    private int year;
    
    // Constructor with parameters
    public Vehicle(String make, String model, int year) {
        System.out.println("Executing Vehicle(String, String, int) constructor");
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // No-argument constructor
    public Vehicle() {
        System.out.println("Executing Vehicle() constructor");
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }
    
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
    // Getters and setters
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
}

/**
 * Car subclass - demonstrates calling superclass constructor with 'super'
 */
class Car extends Vehicle {
    private int numDoors;
    
    // Constructor that calls the superclass constructor
    public Car(String make, String model, int year, int numDoors) {
        // Call to superclass constructor must be the first statement
        super(make, model, year); // Using 'super' to call Vehicle constructor
        System.out.println("Executing Car constructor after Vehicle constructor");
        this.numDoors = numDoors;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Number of Doors: " + numDoors);
    }
}

/**
 * Truck subclass - demonstrates calling superclass constructor with 'super'
 */
class Truck extends Vehicle {
    private int cargoCapacity;
    
    // Constructor that calls the superclass constructor
    public Truck(String make, String model, int year, int cargoCapacity) {
        // Call to superclass constructor must be the first statement
        super(make, model, year); // Using 'super' to call Vehicle constructor
        System.out.println("Executing Truck constructor after Vehicle constructor");
        this.cargoCapacity = cargoCapacity;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
    }
}

/**
 * Motorcycle subclass - demonstrates calling superclass constructor with 'super'
 */
class Motorcycle extends Vehicle {
    private boolean hasFairing;
    
    // Constructor that calls the superclass constructor
    public Motorcycle(String make, String model, int year, boolean hasFairing) {
        // Call to superclass constructor must be the first statement
        super(make, model, year); // Using 'super' to call Vehicle constructor
        System.out.println("Executing Motorcycle constructor after Vehicle constructor");
        this.hasFairing = hasFairing;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Has Fairing: " + (hasFairing ? "Yes" : "No"));
    }
}
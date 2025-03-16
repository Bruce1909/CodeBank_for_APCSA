/**
 * MOD3C3_Exp.java
 * 
 * This program demonstrates MOD-3.C.3: If S is a subclass of T, then a reference of type T
 * can be used to refer to an object of type T or S.
 */
public class MOD3C3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating superclass references to subclass objects (MOD-3.C.3):\n");
        
        // Create objects of different types
        System.out.println("Creating objects of different types:");
        
        // 1. Superclass reference to superclass object (normal case)
        System.out.println("\n--- Superclass Reference to Superclass Object ---");
        Vehicle vehicle = new Vehicle("Generic Vehicle", 2020);
        System.out.println("vehicle reference type: Vehicle");
        System.out.println("vehicle object type: " + vehicle.getClass().getSimpleName());
        vehicle.displayInfo();
        vehicle.start();
        
        // 2. Superclass reference to subclass object (demonstrates MOD-3.C.3)
        System.out.println("\n--- Superclass Reference to Subclass Object ---");
        Vehicle car = new Car("Sedan", 2022, 4);
        System.out.println("car reference type: Vehicle");
        System.out.println("car object type: " + car.getClass().getSimpleName());
        car.displayInfo(); // Calls Car's overridden method
        car.start();       // Calls Car's overridden method
        
        // 3. Another example with a different subclass
        System.out.println("\n--- Another Superclass Reference to Different Subclass ---");
        Vehicle motorcycle = new Motorcycle("Sport Bike", 2021, false);
        System.out.println("motorcycle reference type: Vehicle");
        System.out.println("motorcycle object type: " + motorcycle.getClass().getSimpleName());
        motorcycle.displayInfo(); // Calls Motorcycle's overridden method
        motorcycle.start();       // Calls Motorcycle's overridden method
        
        // 4. Array of superclass references holding different types of objects
        System.out.println("\n--- Array of Superclass References ---");
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = vehicle;    // Superclass object
        vehicles[1] = car;        // Car subclass object
        vehicles[2] = motorcycle; // Motorcycle subclass object
        
        System.out.println("Processing all vehicles in the array:");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nVehicle " + (i + 1) + ":");
            vehicles[i].displayInfo();
            vehicles[i].start();
        }
        
        // Explain the concept
        System.out.println("\n--- Explanation of Superclass References to Subclass Objects ---");
        System.out.println("1. A reference of type T (Vehicle) can refer to an object of type T (Vehicle)");
        System.out.println("2. A reference of type T (Vehicle) can also refer to an object of type S (Car or Motorcycle)");
        System.out.println("3. When methods are called through the superclass reference, the appropriate");
        System.out.println("   version for the actual object type is executed (polymorphism)");
        System.out.println("4. This allows for flexible code that can work with any current or future subclass");
    }
}

/**
 * Superclass - Vehicle
 */
class Vehicle {
    protected String model;
    protected int year;
    
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    public void displayInfo() {
        System.out.println("Vehicle: " + model);
        System.out.println("Year: " + year);
    }
    
    public void start() {
        System.out.println("Vehicle starting...");
    }
}

/**
 * Subclass - Car
 */
class Car extends Vehicle {
    private int numDoors;
    
    public Car(String model, int year, int numDoors) {
        super(model, year);
        this.numDoors = numDoors;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Car: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of doors: " + numDoors);
    }
    
    @Override
    public void start() {
        System.out.println("Car engine starting... Vroom!");
    }
    
    // Subclass-specific method
    public void honk() {
        System.out.println("Car honking: Beep! Beep!");
    }
}

/**
 * Subclass - Motorcycle
 */
class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(String model, int year, boolean hasSidecar) {
        super(model, year);
        this.hasSidecar = hasSidecar;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Motorcycle: " + model);
        System.out.println("Year: " + year);
        System.out.println("Has sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
    
    @Override
    public void start() {
        System.out.println("Motorcycle engine starting... Vroom! Vroom!");
    }
    
    // Subclass-specific method
    public void wheelie() {
        System.out.println("Motorcycle doing a wheelie!");
    }
}
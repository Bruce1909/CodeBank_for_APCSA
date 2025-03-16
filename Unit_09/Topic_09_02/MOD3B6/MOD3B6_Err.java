/**
 * MOD3B6_Err.java
 * 
 * This program demonstrates errors related to MOD-3.B.6: Incorrectly calling or not calling
 * the superclass constructor from a subclass constructor.
 */
public class MOD3B6_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors when calling superclass constructors (MOD-3.B.6):\n");
        
        // Create instances of different vehicle types with errors
        System.out.println("Creating a CarWithError object:");
        // This works but doesn't properly initialize the superclass fields
        CarWithError car = new CarWithError("Toyota", "Camry", 2022, 4);
        car.displayInfo();
        System.out.println();
        
        // ERROR 1: Not calling super() as the first statement
        System.out.println("ERROR 1: Not calling super() as the first statement");
        System.out.println("The following code would not compile in Java:");
        System.out.println("public TruckWithError(String make, String model, int year, int cargoCapacity) {");
        System.out.println("    this.cargoCapacity = cargoCapacity; // Error: Cannot use 'this' before super()");
        System.out.println("    super(make, model, year); // Error: Call to super must be first statement");
        System.out.println("}\n");
        
        // ERROR 2: Passing incorrect parameters to super()
        System.out.println("ERROR 2: Passing incorrect parameters to super()");
        System.out.println("The following would cause runtime errors or incorrect behavior:");
        System.out.println("public MotorcycleWithError(String make, String model, int year, boolean hasFairing) {");
        System.out.println("    super(model, make, 0); // Error: Incorrect parameter order or values");
        System.out.println("    this.hasFairing = hasFairing;");
        System.out.println("}\n");
        
        // Create an instance with incorrect parameter passing
        System.out.println("Creating a MotorcycleWithError object with incorrect parameter passing:");
        MotorcycleWithError motorcycle = new MotorcycleWithError("Honda", "CBR", 2021, true);
        motorcycle.displayInfo(); // Shows incorrect values due to parameter swapping
        System.out.println();
        
        // ERROR 3: Not calling any superclass constructor
        System.out.println("ERROR 3: Not calling any superclass constructor explicitly");
        System.out.println("The following would cause compilation errors if VehicleWithError had no no-arg constructor:");
        System.out.println("public BusWithError(int capacity) {");
        System.out.println("    // No explicit call to super() - Java will insert super() automatically");
        System.out.println("    // This fails if VehicleWithError has no no-arg constructor");
        System.out.println("    this.capacity = capacity;");
        System.out.println("}\n");
        
        System.out.println("\n--- Problems with Incorrect Superclass Constructor Calls ---");
        System.out.println("1. Not calling super() as the first statement causes compilation errors");
        System.out.println("2. Passing incorrect parameters to super() causes incorrect initialization");
        System.out.println("3. Not calling super() explicitly causes Java to insert super() automatically");
        System.out.println("4. If the superclass has no no-arg constructor, implicit super() calls fail");
        System.out.println("5. Incorrect initialization can lead to runtime errors and unexpected behavior");
    }
}

/**
 * Superclass with errors for vehicle types
 */
class VehicleWithError {
    private String make;
    private String model;
    private int year;
    
    // Constructor with parameters
    public VehicleWithError(String make, String model, int year) {
        System.out.println("Executing VehicleWithError(String, String, int) constructor");
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // No-argument constructor
    public VehicleWithError() {
        System.out.println("Executing VehicleWithError() constructor");
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
 * ERROR: Car subclass that doesn't call the superclass constructor explicitly
 * This relies on the implicit call to super() which calls the no-arg constructor
 */
class CarWithError extends VehicleWithError {
    private int numDoors;
    
    // Constructor that doesn't explicitly call the superclass constructor
    public CarWithError(String make, String model, int year, int numDoors) {
        // No explicit call to super(make, model, year)
        // Java inserts super() here, which calls VehicleWithError()
        System.out.println("Executing CarWithError constructor without proper super call");
        this.numDoors = numDoors;
        
        // ERROR: Trying to set superclass fields directly
        // This won't work properly because the fields are private
        // setMake(make);
        // setModel(model);
        // setYear(year);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Will display "Unknown" for make and model, and 0 for year
        System.out.println("Number of Doors: " + numDoors);
    }
}

/**
 * ERROR: Motorcycle subclass that passes parameters in the wrong order
 */
class MotorcycleWithError extends VehicleWithError {
    private boolean hasFairing;
    
    // Constructor that calls the superclass constructor with incorrect parameter order
    public MotorcycleWithError(String make, String model, int year, boolean hasFairing) {
        // ERROR: Passing parameters in the wrong order
        super(model, make, year); // Swapped make and model parameters
        System.out.println("Executing MotorcycleWithError constructor with incorrect parameter order");
        this.hasFairing = hasFairing;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo(); // Will display swapped make and model values
        System.out.println("Has Fairing: " + (hasFairing ? "Yes" : "No"));
    }
}

/**
 * The following class would cause a compilation error if uncommented and if
 * VehicleWithError had no no-argument constructor:
 */
// class VehicleWithNoDefaultConstructor {
//     private String make;
//     private String model;
//     private int year;
//     
//     // Only parameterized constructor, no no-arg constructor
//     public VehicleWithNoDefaultConstructor(String make, String model, int year) {
//         this.make = make;
//         this.model = model;
//         this.year = year;
//     }
// }
// 
// class BusWithError extends VehicleWithNoDefaultConstructor {
//     private int capacity;
//     
//     // ERROR: No explicit call to super()
//     public BusWithError(int capacity) {
//         // Java tries to insert super() here, but there is no no-arg constructor
//         // This would cause a compilation error
//         this.capacity = capacity;
//     }
// }
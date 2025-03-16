/**
 * MOD1C5_Err.java
 * 
 * This program demonstrates common errors when using incompatible parameter types in constructors.
 * 
 * Knowledge Point: MOD-1.C.5
 * The actual parameters passed to a constructor must be compatible with the types identified in the formal parameter list.
 */
public class MOD1C5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Parameter Type Compatibility Errors:\n");
        
        // Creating a valid Vehicle object for comparison
        Vehicle validVehicle = new Vehicle("Toyota", 4, 65.5, true);
        validVehicle.displayInfo();
        
        System.out.println("\nCommon errors with parameter type compatibility:");
        System.out.println("1. Passing incompatible primitive types");
        System.out.println("2. Passing incompatible reference types");
        System.out.println("3. Narrowing conversions without explicit casting");
        System.out.println("4. Passing null to primitive types");
        System.out.println("5. Type mismatch in method calls");
        
        // ERROR 1: Passing incompatible primitive types
        // Uncommenting the following line will cause a compilation error
        // Vehicle vehicle1 = new Vehicle("Ford", 4.5, 70.0, true); // Error: double cannot be converted to int
        
        // ERROR 2: Passing incompatible reference types
        // Uncommenting the following line will cause a compilation error
        // Integer wheelCount = 4;
        // Vehicle vehicle2 = new Vehicle(wheelCount, "Chevrolet", 75.0, false); // Error: Integer cannot be converted to String
        
        // ERROR 3: Narrowing conversion without explicit casting
        // Uncommenting the following line will cause a compilation error
        // double wheelCount = 4.5;
        // Vehicle vehicle3 = new Vehicle("Nissan", wheelCount, 80.0, true); // Error: double cannot be converted to int
        
        // ERROR 4: Passing null to primitive types
        // Uncommenting the following line will cause a compilation error
        // Vehicle vehicle4 = new Vehicle("BMW", null, 90.0, false); // Error: null cannot be converted to int
        
        // ERROR 5: Passing wrong object type to a method
        // Uncommenting the following line will cause a compilation error
        // String notAVehicle = "This is not a vehicle";
        // testVehicle(notAVehicle); // Error: String cannot be converted to Vehicle
    }
    
    // Method that expects a Vehicle parameter
    public static void testVehicle(Vehicle vehicle) {
        System.out.println("Testing vehicle: " + vehicle.getClass().getSimpleName());
        vehicle.displayInfo();
    }
}

// Vehicle class with a constructor that accepts various parameter types
class Vehicle {
    // Instance variables
    private String make;
    private int wheels;
    private double maxSpeed;
    private boolean isElectric;
    
    /**
     * Constructor with parameters of different types
     */
    public Vehicle(String make, int wheels, double maxSpeed, boolean isElectric) {
        this.make = make;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }
    
    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Make: " + (make == null ? "Unknown" : make));
        System.out.println("Wheels: " + wheels);
        System.out.println("Max Speed: " + maxSpeed + " mph");
        System.out.println("Electric: " + (isElectric ? "Yes" : "No"));
    }
    
    // ERROR 6: Constructor with incompatible default values
    // Uncommenting the following will cause a compilation error
    /*
    public Vehicle(String make) {
        this.make = make;
        this.wheels = "four"; // Error: String cannot be converted to int
        this.maxSpeed = 60.0;
        this.isElectric = false;
    }
    */
    
    // ERROR 7: Constructor with incompatible parameter assignments
    // Uncommenting the following will cause a compilation error
    /*
    public Vehicle(String make, boolean isElectric) {
        this.make = make;
        this.wheels = 4;
        this.maxSpeed = "fast"; // Error: String cannot be converted to double
        this.isElectric = isElectric;
    }
    */
}

// ERROR 8: Class with constructor that has incompatible super() call
// Uncommenting the following will cause a compilation error
/*
class ElectricVehicle extends Vehicle {
    public ElectricVehicle() {
        super("Electric", "four", 80.0, true); // Error: String cannot be converted to int
    }
}
*/
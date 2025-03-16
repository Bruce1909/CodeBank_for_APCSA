/**
 * MOD1C5_Exp.java
 * 
 * This program demonstrates the correct usage of compatible parameter types in constructors.
 * 
 * Knowledge Point: MOD-1.C.5
 * The actual parameters passed to a constructor must be compatible with the types identified in the formal parameter list.
 */
public class MOD1C5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Parameter Type Compatibility:\n");
        
        // Example 1: Passing exact matching types
        System.out.println("Example 1: Passing exact matching types");
        Vehicle car1 = new Vehicle("Toyota", 4, 65.5, true);
        car1.displayInfo();
        
        // Example 2: Passing compatible primitive types (widening conversion)
        System.out.println("\nExample 2: Passing compatible primitive types (widening conversion)");
        // int to double (widening) is allowed
        int maxSpeedInt = 70;
        Vehicle car2 = new Vehicle("Honda", 4, maxSpeedInt, false);
        car2.displayInfo();
        
        // Example 3: Passing compatible reference types (subclass to superclass)
        System.out.println("\nExample 3: Passing compatible reference types (subclass to superclass)");
        SportsCar sportsCar = new SportsCar();
        // SportsCar can be passed where Vehicle is expected
        testVehicle(sportsCar);
        
        // Example 4: Autoboxing (primitive to wrapper)
        System.out.println("\nExample 4: Autoboxing (primitive to wrapper)");
        // boolean primitive to Boolean wrapper
        boolean isElectricPrimitive = true;
        testAutoboxing(isElectricPrimitive);
        
        // Example 5: Null for reference types
        System.out.println("\nExample 5: Null for reference types");
        // null can be passed for any reference type
        Vehicle car3 = new Vehicle(null, 2, 90.0, true);
        car3.displayInfo();
        
        System.out.println("\nParameter type compatibility:");
        System.out.println("- Exact type matches are always compatible");
        System.out.println("- Widening conversions are allowed (e.g., int to double)");
        System.out.println("- Subclass objects can be passed to parameters expecting superclass types");
        System.out.println("- Autoboxing and unboxing happen automatically");
        System.out.println("- null can be passed for any reference type parameter");
    }
    
    // Method to demonstrate passing a subclass object to a superclass parameter
    public static void testVehicle(Vehicle vehicle) {
        System.out.println("Testing vehicle: " + vehicle.getClass().getSimpleName());
        vehicle.displayInfo();
    }
    
    // Method to demonstrate autoboxing
    public static void testAutoboxing(Boolean isElectric) {
        System.out.println("Testing autoboxing: primitive boolean to Boolean wrapper");
        System.out.println("Is electric: " + isElectric);
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
     * 
     * @param make - the make of the vehicle (String)
     * @param wheels - number of wheels (int)
     * @param maxSpeed - maximum speed in mph (double)
     * @param isElectric - whether the vehicle is electric (boolean)
     */
    public Vehicle(String make, int wheels, double maxSpeed, boolean isElectric) {
        this.make = make;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
        
        System.out.println("Vehicle constructor called with parameters:");
        System.out.println("- make: " + make + " (type: " + (make == null ? "null" : make.getClass().getSimpleName()) + ")");
        System.out.println("- wheels: " + wheels + " (type: int)");
        System.out.println("- maxSpeed: " + maxSpeed + " (type: double)");
        System.out.println("- isElectric: " + isElectric + " (type: boolean)");
    }
    
    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Make: " + (make == null ? "Unknown" : make));
        System.out.println("Wheels: " + wheels);
        System.out.println("Max Speed: " + maxSpeed + " mph");
        System.out.println("Electric: " + (isElectric ? "Yes" : "No"));
    }
}

// Subclass of Vehicle to demonstrate subclass-to-superclass compatibility
class SportsCar extends Vehicle {
    public SportsCar() {
        // Call superclass constructor
        super("Sports Car", 4, 150.0, false);
    }
}
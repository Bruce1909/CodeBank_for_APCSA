/**
 * MOD3C3_Err.java
 * 
 * This program demonstrates common errors related to MOD-3.C.3: If S is a subclass of T, then a reference
 * of type T can be used to refer to an object of type T or S.
 */
public class MOD3C3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors with superclass references to subclass objects (MOD-3.C.3):\n");
        
        // Create objects of different types
        VehicleErr vehicle = new VehicleErr("Generic Vehicle", 2020);
        CarErr car = new CarErr("Sedan", 2022, 4);
        MotorcycleErr motorcycle = new MotorcycleErr("Sport Bike", 2021, false);
        
        // Valid: Superclass reference to subclass object
        VehicleErr carAsVehicle = car;
        VehicleErr motorcycleAsVehicle = motorcycle;
        
        // ERROR 1: Attempting to access subclass-specific methods through a superclass reference
        System.out.println("ERROR 1: Attempting to access subclass-specific methods through a superclass reference:");
        System.out.println("carAsVehicle is actually a CarErr object: " + (carAsVehicle instanceof CarErr));
        
        // This will cause a compile-time error, commented out to allow compilation
        System.out.println("Attempting: carAsVehicle.honk();");
        // carAsVehicle.honk(); // Error: method honk() not found in VehicleErr
        System.out.println("This would cause a compile-time error because the honk() method");
        System.out.println("is not defined in the VehicleErr class.");
        
        System.out.println("\nAttempting: motorcycleAsVehicle.wheelie();");
        // motorcycleAsVehicle.wheelie(); // Error: method wheelie() not found in VehicleErr
        System.out.println("This would cause a compile-time error because the wheelie() method");
        System.out.println("is not defined in the VehicleErr class.");
        
        // ERROR 2: Incorrect downcasting
        System.out.println("\nERROR 2: Incorrect downcasting:");
        VehicleErr genericVehicle = new VehicleErr("Generic Vehicle", 2019);
        
        System.out.println("Attempting to cast a VehicleErr to a CarErr:");
        // This will compile but fail at runtime
        try {
            System.out.println("CarErr castedCar = (CarErr) genericVehicle; // Would throw ClassCastException");
            // CarErr castedCar = (CarErr) genericVehicle; // Would throw ClassCastException
            System.out.println("This would throw a ClassCastException at runtime because");
            System.out.println("genericVehicle is not actually a CarErr object.");
        } catch (Exception e) {
            System.out.println("Exception would occur: ClassCastException");
        }
        
        // ERROR 3: Casting between sibling classes
        System.out.println("\nERROR 3: Casting between sibling classes:");
        System.out.println("Attempting to cast a CarErr to a MotorcycleErr (sibling classes):");
        // This will compile but fail at runtime
        try {
            System.out.println("MotorcycleErr castedMotorcycle = (MotorcycleErr) carAsVehicle; // Would throw ClassCastException");
            // MotorcycleErr castedMotorcycle = (MotorcycleErr) carAsVehicle; // Would throw ClassCastException
            System.out.println("This would throw a ClassCastException at runtime because");
            System.out.println("carAsVehicle is a CarErr object, not a MotorcycleErr object.");
        } catch (Exception e) {
            System.out.println("Exception would occur: ClassCastException");
        }
        
        // ERROR 4: Not checking type before casting
        System.out.println("\nERROR 4: Not checking type before casting:");
        System.out.println("Correct approach - check type before casting:");
        if (carAsVehicle instanceof CarErr) {
            CarErr safeCar = (CarErr) carAsVehicle;
            System.out.println("Safe cast successful. Now we can call honk():");
            safeCar.honk();
        } else {
            System.out.println("Cannot cast to CarErr - not the right type.");
        }
        
        System.out.println("\nIncorrect approach - casting without checking:");
        // Commented out to allow compilation
        // CarErr unsafeCar = (CarErr) motorcycleAsVehicle; // Would throw ClassCastException
        System.out.println("This would throw a ClassCastException at runtime.");
        
        // ERROR 5: Forgetting that arrays follow the same rules
        System.out.println("\nERROR 5: Forgetting that arrays follow the same rules:");
        VehicleErr[] vehicles = new VehicleErr[3];
        vehicles[0] = vehicle;    // Superclass object
        vehicles[1] = car;        // Car subclass object
        vehicles[2] = motorcycle; // Motorcycle subclass object
        
        System.out.println("Attempting to access subclass methods from array elements:");
        // This will cause a compile-time error, commented out to allow compilation
        // vehicles[1].honk(); // Error: method honk() not found in VehicleErr
        System.out.println("vehicles[1].honk(); // Error: method honk() not found in VehicleErr");
        System.out.println("Even though vehicles[1] contains a CarErr object, the reference type is VehicleErr.");
        
        System.out.println("\n--- Common Errors with Superclass References to Subclass Objects ---");
        System.out.println("1. Attempting to access subclass-specific methods through a superclass reference");
        System.out.println("2. Incorrect downcasting from superclass to subclass when the object is not of the target type");
        System.out.println("3. Attempting to cast between sibling classes");
        System.out.println("4. Not checking the object type before casting");
        System.out.println("5. Forgetting that arrays of superclass references follow the same rules");
    }
}

/**
 * Superclass - VehicleErr
 */
class VehicleErr {
    protected String model;
    protected int year;
    
    public VehicleErr(String model, int year) {
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
 * Subclass - CarErr
 */
class CarErr extends VehicleErr {
    private int numDoors;
    
    public CarErr(String model, int year, int numDoors) {
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
 * Subclass - MotorcycleErr
 */
class MotorcycleErr extends VehicleErr {
    private boolean hasSidecar;
    
    public MotorcycleErr(String model, int year, boolean hasSidecar) {
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
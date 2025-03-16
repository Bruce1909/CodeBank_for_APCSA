/**
 * MOD3B11_Exp.java
 * 
 * This program demonstrates MOD-3.B.11: Any method that is called must be defined within
 * its own class or its superclass.
 */
public class MOD3B11_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating method calling rules (MOD-3.B.11):\n");
        
        // Create instances of different vehicle types
        Vehicle vehicle = new Vehicle("Generic Vehicle", 2020);
        Car car = new Car("Toyota", 2022, 4);
        ElectricCar electricCar = new ElectricCar("Tesla", 2023, 4, 300);
        
        // Demonstrate calling methods defined in the same class
        System.out.println("--- Calling Methods Defined in the Same Class ---");
        System.out.println("Vehicle object calling its own method:");
        vehicle.displayInfo(); // Defined in Vehicle class
        vehicle.startEngine(); // Defined in Vehicle class
        System.out.println();
        
        System.out.println("Car object calling its own method:");
        car.honkHorn(); // Defined in Car class
        System.out.println();
        
        System.out.println("ElectricCar object calling its own method:");
        electricCar.chargeBattery(); // Defined in ElectricCar class
        System.out.println();
        
        // Demonstrate calling methods defined in the superclass
        System.out.println("--- Calling Methods Defined in the Superclass ---");
        System.out.println("Car object calling methods from Vehicle:");
        car.displayInfo(); // Inherited from Vehicle class
        car.startEngine(); // Inherited from Vehicle class
        System.out.println();
        
        System.out.println("ElectricCar object calling methods from Car and Vehicle:");
        electricCar.displayInfo(); // Inherited from Vehicle, overridden in Car and ElectricCar
        electricCar.startEngine(); // Inherited from Vehicle, overridden in ElectricCar
        electricCar.honkHorn(); // Inherited from Car
        System.out.println();
        
        // Demonstrate polymorphism - methods must be defined in the class or its superclass
        System.out.println("--- Demonstrating Polymorphism ---");
        Vehicle[] vehicles = {vehicle, car, electricCar};
        
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle type: " + v.getClass().getSimpleName());
            v.startEngine(); // Each object calls the appropriate version of startEngine()
            // v.honkHorn(); // Error: Vehicle class doesn't have honkHorn() method
            // v.chargeBattery(); // Error: Vehicle class doesn't have chargeBattery() method
            System.out.println();
        }
        
        System.out.println("\n--- Key Points about Method Calling Rules ---");
        System.out.println("1. An object can call methods defined in its own class");
        System.out.println("2. An object can call methods inherited from its superclass");
        System.out.println("3. An object cannot call methods defined in its subclasses");
        System.out.println("4. When using a reference of a superclass type, only methods defined in that class or its superclasses can be called");
        System.out.println("5. Method overriding allows different implementations of the same method to be called based on the actual object type");
    }
}

/**
 * Base Vehicle class
 */
class Vehicle {
    private String model;
    private int year;
    
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    // Method defined in this class
    public void startEngine() {
        System.out.println(model + "'s engine is starting...");
    }
    
    // Method defined in this class
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
    // Getters
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
}

/**
 * Car subclass
 */
class Car extends Vehicle {
    private int numDoors;
    
    public Car(String model, int year, int numDoors) {
        super(model, year);
        this.numDoors = numDoors;
    }
    
    // Method defined in this class
    public void honkHorn() {
        System.out.println(getModel() + "'s horn: Beep! Beep!");
    }
    
    // Override method from superclass
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
    }
    
    // Getter
    public int getNumDoors() {
        return numDoors;
    }
}

/**
 * ElectricCar subclass
 */
class ElectricCar extends Car {
    private int range;
    
    public ElectricCar(String model, int year, int numDoors, int range) {
        super(model, year, numDoors);
        this.range = range;
    }
    
    // Method defined in this class
    public void chargeBattery() {
        System.out.println(getModel() + "'s battery is charging...");
    }
    
    // Override method from superclass
    @Override
    public void startEngine() {
        System.out.println(getModel() + "'s electric motor is powering up silently...");
    }
    
    // Override method from superclass
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Range: " + range + " miles");
    }
    
    // Getter
    public int getRange() {
        return range;
    }
}
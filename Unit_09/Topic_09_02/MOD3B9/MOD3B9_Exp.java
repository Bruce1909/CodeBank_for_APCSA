/**
 * MOD3B9_Exp.java
 * 
 * This program demonstrates MOD-3.B.9: Regardless of whether the superclass constructor is
 * called implicitly or explicitly, the process of calling superclass constructors continues
 * until the Object constructor is called. At this point, all of the constructors within the
 * hierarchy execute beginning with the Object constructor.
 */
public class MOD3B9_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating the constructor call hierarchy (MOD-3.B.9):\n");
        
        // Create an instance of the most derived class to demonstrate the constructor call chain
        System.out.println("Creating a SportsCar object:");
        SportsCar sportsCar = new SportsCar("Ferrari", "488", 2023, 2, 670);
        System.out.println("\nSportsCar object created successfully!");
        sportsCar.displayInfo();
        
        System.out.println("\n--- Key Points about Constructor Call Hierarchy ---");
        System.out.println("1. Constructor calls propagate up the inheritance hierarchy to Object");
        System.out.println("2. The Object constructor executes first, then each superclass constructor in order");
        System.out.println("3. This happens regardless of whether super() is called explicitly or implicitly");
        System.out.println("4. The entire chain of constructors executes for every object creation");
        System.out.println("5. This ensures proper initialization of the complete object");
    }
}

/**
 * Base class in the hierarchy - implicitly extends Object
 */
class Vehicle {
    private String make;
    private String model;
    private int year;
    
    public Vehicle(String make, String model, int year) {
        // Implicit call to Object constructor happens here
        System.out.println("Step 2: Executing Vehicle constructor");
        this.make = make;
        this.model = model;
        this.year = year;
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
 * Intermediate class in the hierarchy
 */
class Car extends Vehicle {
    private int doors;
    
    public Car(String make, String model, int year, int doors) {
        super(make, model, year); // Explicit call to Vehicle constructor
        System.out.println("Step 3: Executing Car constructor");
        this.doors = doors;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
    
    public int getDoors() {
        return doors;
    }
}

/**
 * Most derived class in the hierarchy
 */
class SportsCar extends Car {
    private int horsepower;
    
    public SportsCar(String make, String model, int year, int doors, int horsepower) {
        super(make, model, year, doors); // Explicit call to Car constructor
        System.out.println("Step 4: Executing SportsCar constructor");
        this.horsepower = horsepower;
        
        // By this point, all constructors in the hierarchy have executed:
        // 1. Object() (implicit)
        // 2. Vehicle(String, String, int)
        // 3. Car(String, String, int, int)
        // 4. SportsCar(String, String, int, int, int)
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Horsepower: " + horsepower);
    }
    
    public int getHorsepower() {
        return horsepower;
    }
}

/**
 * Special class that explicitly shows the Object constructor call
 */
class ObjectConstructorDemo {
    static {
        // This static initializer block runs when the class is loaded
        System.out.println("\nDemonstrating Object constructor call:\n");
        System.out.println("Creating a new ObjectConstructorDemo object...");
        new ObjectConstructorDemo();
    }
    
    public ObjectConstructorDemo() {
        // We can't actually see the Object constructor call, but we can show where it happens
        System.out.println("Step 1: Implicit call to Object() constructor happens before any code in this constructor");
        System.out.println("Object constructor initializes the basic object structure");
    }
}
/**
 * MOD2B1_Err.java
 * 
 * This program demonstrates common errors related to instance variables as described in
 * MOD-2.B.1: An object's state refers to its attributes and their values at a given time
 * and is defined by instance variables belonging to the object. This creates a "has-a"
 * relationship between the object and its instance variables.
 */
public class MOD2B1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with instance variables and object state (MOD-2.B.1):\n");
        
        // ERROR 1: Using static variables instead of instance variables
        System.out.println("ERROR 1: Using static variables instead of instance variables");
        CarWithErrors car1 = new CarWithErrors("Toyota", "Camry", 2022, "Blue");
        CarWithErrors car2 = new CarWithErrors("Honda", "Civic", 2021, "Red");
        
        System.out.println("Initial state of car1:");
        car1.displayInfo();
        
        System.out.println("\nInitial state of car2:");
        car2.displayInfo();
        
        // Changing a static variable affects ALL instances
        System.out.println("\nChanging the model of car1 to 'Corolla':");
        car1.setModel("Corolla");
        
        System.out.println("\nState of car1 after change:");
        car1.displayInfo();
        
        System.out.println("\nState of car2 after changing car1 (notice the model changed too!):");
        car2.displayInfo();
        
        // ERROR 2: Public instance variables allow direct modification
        System.out.println("\nERROR 2: Public instance variables allow direct modification");
        CarWithPublicFields car3 = new CarWithPublicFields("Ford", "Mustang", 2023, "Yellow");
        
        System.out.println("Initial state of car3:");
        car3.displayInfo();
        
        // Directly modifying public instance variables (bypassing any validation)
        System.out.println("\nDirectly modifying public instance variables:");
        car3.year = -2000; // Invalid year
        car3.mileage = -500; // Negative mileage
        
        System.out.println("\nState of car3 after invalid modifications:");
        car3.displayInfo();
        
        // ERROR 3: Not maintaining proper object state
        System.out.println("\nERROR 3: Not maintaining proper object state");
        CarWithInconsistentState car4 = new CarWithInconsistentState("Chevrolet", "Camaro", 2022, "Black");
        
        System.out.println("Initial state of car4:");
        car4.displayInfo();
        
        // Method that doesn't update the state properly
        System.out.println("\nCalling drive() method that doesn't update mileage:");
        car4.drive(100);
        car4.displayInfo(); // Mileage doesn't change
        
        System.out.println("\n--- Common Errors with Instance Variables ---");
        System.out.println("1. Using static variables when instance variables are needed");
        System.out.println("2. Making instance variables public instead of private");
        System.out.println("3. Not properly maintaining object state in methods");
        System.out.println("4. Confusing class variables with instance variables");
        System.out.println("5. Not understanding the 'has-a' relationship");
    }
}

/**
 * Class that demonstrates errors with static variables instead of instance variables
 */
class CarWithErrors {
    private String make;
    // ERROR: Using static variables means all instances share the same value
    private static String model; // Should be instance variable
    private static int year;     // Should be instance variable
    private String color;
    private double mileage;
    private boolean running;
    
    public CarWithErrors(String make, String model, int year, String color) {
        this.make = make;
        // Static variables are shared across all instances
        CarWithErrors.model = model; // This will affect ALL cars
        CarWithErrors.year = year;   // This will affect ALL cars
        this.color = color;
        this.mileage = 0.0;
        this.running = false;
    }
    
    public void setModel(String newModel) {
        System.out.println("Changing model from " + model + " to " + newModel);
        // This changes the model for ALL instances
        CarWithErrors.model = newModel;
    }
    
    public void displayInfo() {
        System.out.println("  Make: " + make);
        System.out.println("  Model: " + model);
        System.out.println("  Year: " + year);
        System.out.println("  Color: " + color);
        System.out.println("  Mileage: " + mileage);
        System.out.println("  Running: " + (running ? "Yes" : "No"));
    }
}

/**
 * Class that demonstrates errors with public instance variables
 */
class CarWithPublicFields {
    // ERROR: Public instance variables violate encapsulation
    public String make;    // Should be private
    public String model;   // Should be private
    public int year;       // Should be private
    public String color;   // Should be private
    public double mileage; // Should be private
    public boolean running; // Should be private
    
    public CarWithPublicFields(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = 0.0;
        this.running = false;
    }
    
    public void displayInfo() {
        System.out.println("  Make: " + make);
        System.out.println("  Model: " + model);
        System.out.println("  Year: " + year);
        System.out.println("  Color: " + color);
        System.out.println("  Mileage: " + mileage);
        System.out.println("  Running: " + (running ? "Yes" : "No"));
    }
}

/**
 * Class that demonstrates errors with inconsistent state management
 */
class CarWithInconsistentState {
    private String make;
    private String model;
    private int year;
    private String color;
    private double mileage;
    private boolean running;
    
    public CarWithInconsistentState(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = 0.0;
        this.running = false;
    }
    
    // ERROR: Method doesn't update the state properly
    public void drive(double distance) {
        if (running) {
            // ERROR: Doesn't update mileage instance variable
            System.out.println("Drove " + distance + " miles.");
            // mileage should be updated here but isn't
        } else {
            System.out.println("Cannot drive. Car is not running.");
        }
    }
    
    public void start() {
        running = true;
        System.out.println(year + " " + make + " " + model + " started.");
    }
    
    public void displayInfo() {
        System.out.println("  Make: " + make);
        System.out.println("  Model: " + model);
        System.out.println("  Year: " + year);
        System.out.println("  Color: " + color);
        System.out.println("  Mileage: " + mileage);
        System.out.println("  Running: " + (running ? "Yes" : "No"));
    }
}
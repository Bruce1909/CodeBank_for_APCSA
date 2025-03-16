/**
 * MOD3B3_Err.java
 * 
 * This program demonstrates errors related to MOD-3.B.3: Misunderstanding or misusing
 * the "is-a" relationship created by inheritance.
 */
public class MOD3B3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors with 'is-a' relationships in inheritance (MOD-3.B.3):\n");
        
        // ERROR 1: Incorrect inheritance hierarchy - violating "is-a" relationship
        System.out.println("ERROR 1: Incorrect inheritance hierarchy");
        System.out.println("A Penguin is a Bird, but the code incorrectly makes Bird extend Penguin");
        System.out.println("This reverses the natural 'is-a' relationship\n");
        
        // Create instances with incorrect hierarchy
        PenguinWithError penguin = new PenguinWithError("Emperor", 15.0);
        BirdWithError bird = new BirdWithError("Sparrow", 0.1, true);
        
        // Demonstrate the incorrect relationship
        penguin.displayInfo();
        penguin.swim(); // Works fine
        // penguin.fly(); // Error: Penguin cannot access Bird's methods
        System.out.println();
        
        bird.displayInfo();
        bird.fly(); // Works fine
        // The following line would cause a runtime error if uncommented:
        // bird.swim(); // Error: ClassCastException - Bird is not a Penguin
        System.out.println();
        
        // ERROR 2: Forcing unnatural "is-a" relationships
        System.out.println("ERROR 2: Forcing unnatural 'is-a' relationships");
        System.out.println("A Car is not a type of Engine, but the code incorrectly makes Car extend Engine\n");
        
        CarWithError car = new CarWithError("Toyota", "V6", 4);
        car.displayInfo();
        car.start(); // Inherited from Engine
        System.out.println();
        
        // ERROR 3: Treating "has-a" as "is-a"
        System.out.println("ERROR 3: Confusing 'has-a' with 'is-a' relationships");
        System.out.println("A Library has Books, but is not a type of Book\n");
        
        LibraryWithError library = new LibraryWithError("City Library", "Fiction", "J.K. Rowling");
        library.displayInfo();
        library.checkout(); // Inherited from Book, but doesn't make sense for a Library
        System.out.println();
        
        System.out.println("\n--- Problems with Incorrect 'is-a' Relationships ---");
        System.out.println("1. Violates logical real-world relationships");
        System.out.println("2. Creates confusing and counterintuitive code");
        System.out.println("3. Leads to inappropriate method inheritance");
        System.out.println("4. Prevents proper polymorphic behavior");
        System.out.println("5. Confuses 'is-a' (inheritance) with 'has-a' (composition) relationships");
    }
}

/**
 * ERROR: Incorrect inheritance hierarchy
 * A Penguin is a Bird, but here Bird incorrectly extends Penguin
 */
class PenguinWithError {
    private String species;
    private double weight;
    
    public PenguinWithError(String species, double weight) {
        this.species = species;
        this.weight = weight;
    }
    
    public void swim() {
        System.out.println(species + " penguin is swimming.");
    }
    
    public void displayInfo() {
        System.out.println("Penguin Species: " + species);
        System.out.println("Weight: " + weight + " kg");
    }
}

/**
 * ERROR: Bird should not extend Penguin; a Bird is not a type of Penguin
 * The correct relationship would be Penguin extends Bird
 */
class BirdWithError extends PenguinWithError {
    private boolean canFly;
    
    public BirdWithError(String species, double weight, boolean canFly) {
        super(species, weight);
        this.canFly = canFly;
    }
    
    public void fly() {
        if (canFly) {
            System.out.println("Bird is flying.");
        } else {
            System.out.println("This bird cannot fly.");
        }
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }
}

/**
 * ERROR: Confusing "has-a" with "is-a"
 * A Car has an Engine, but is not a type of Engine
 */
class EngineWithError {
    private String type;
    
    public EngineWithError(String type) {
        this.type = type;
    }
    
    public void start() {
        System.out.println(type + " engine is starting...");
    }
    
    public void displayInfo() {
        System.out.println("Engine Type: " + type);
    }
}

/**
 * ERROR: Car should not extend Engine; a Car is not a type of Engine
 * Car should have an Engine (composition) instead of being an Engine (inheritance)
 */
class CarWithError extends EngineWithError {
    private String brand;
    private int doors;
    
    public CarWithError(String brand, String engineType, int doors) {
        super(engineType); // Incorrect use of inheritance
        this.brand = brand;
        this.doors = doors;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Number of Doors: " + doors);
        super.displayInfo(); // Displaying engine info
    }
}

/**
 * ERROR: Confusing "has-a" with "is-a"
 * A Library has Books, but is not a type of Book
 */
class BookWithError {
    private String genre;
    private String author;
    
    public BookWithError(String genre, String author) {
        this.genre = genre;
        this.author = author;
    }
    
    public void checkout() {
        System.out.println("Book by " + author + " has been checked out.");
    }
    
    public void displayInfo() {
        System.out.println("Book Genre: " + genre);
        System.out.println("Author: " + author);
    }
}

/**
 * ERROR: Library should not extend Book; a Library is not a type of Book
 * Library should have Books (composition) instead of being a Book (inheritance)
 */
class LibraryWithError extends BookWithError {
    private String name;
    
    public LibraryWithError(String name, String genre, String author) {
        super(genre, author); // Incorrect use of inheritance
        this.name = name;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Library Name: " + name);
        super.displayInfo(); // Displaying book info
    }
}
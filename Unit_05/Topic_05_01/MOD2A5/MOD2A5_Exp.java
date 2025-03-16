/**
 * MOD2A5_Exp.java
 * 
 * This program demonstrates the correct usage of public constructors
 * as described in MOD-2.A.5: Constructors are designated public.
 */
public class MOD2A5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating public constructors (MOD-2.A.5):\n");
        
        // Create instances using public constructors
        System.out.println("Creating instances using public constructors:");
        
        // Default constructor
        Product product1 = new Product();
        product1.displayInfo();
        
        // Parameterized constructor
        Product product2 = new Product("Laptop", 999.99);
        product2.displayInfo();
        
        // Constructor with partial parameters
        Product product3 = new Product("Smartphone");
        product3.displayInfo();
        
        // Create an instance of a class from another class
        System.out.println("\nCreating an instance from ProductFactory class:");
        ProductFactory factory = new ProductFactory();
        Product product4 = factory.createProduct("Tablet", 349.99);
        product4.displayInfo();
        
        System.out.println("\n--- Key Points about Public Constructors ---");
        System.out.println("1. Constructors should be designated as public");
        System.out.println("2. Public constructors allow objects to be created from outside the class");
        System.out.println("3. Multiple constructors can be provided for different initialization scenarios");
        System.out.println("4. Public constructors enable object creation from other classes");
        System.out.println("5. Constructor overloading provides flexibility in object creation");
    }
}

/**
 * Class that demonstrates proper use of public constructors
 */
class Product {
    // Private instance variables
    private String name;
    private double price;
    private int id;
    private static int nextId = 1000; // For generating unique IDs
    
    // Public default constructor
    public Product() {
        this.name = "Unknown";
        this.price = 0.0;
        this.id = nextId++;
        System.out.println("Default constructor called - Product created with ID: " + id);
    }
    
    // Public constructor with all parameters
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = nextId++;
        System.out.println("Parameterized constructor called - Product created with ID: " + id);
    }
    
    // Public constructor with partial parameters
    public Product(String name) {
        this(name, 0.0); // Call the constructor with two parameters
        System.out.println("Partial constructor called - Price defaulted to 0.0");
    }
    
    // Public method to display product information
    public void displayInfo() {
        System.out.println("\nProduct Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
    
    // Getter and setter methods
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative");
        }
    }
    
    public int getId() {
        return id;
    }
}

/**
 * Factory class that demonstrates creating objects using public constructors
 */
class ProductFactory {
    // Method that creates a Product using its public constructor
    public Product createProduct(String name, double price) {
        System.out.println("ProductFactory creating a new product");
        return new Product(name, price); // Uses public constructor of Product
    }
}
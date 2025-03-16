/**
 * MOD2A5_Err.java
 * 
 * This program demonstrates common errors related to public constructors
 * as described in MOD-2.A.5: Constructors are designated public.
 */
public class MOD2A5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with public constructors (MOD-2.A.5):\n");
        
        // ERROR 1: Attempting to create an instance using a private constructor
        System.out.println("Error 1: Attempting to create an instance using a private constructor:");
        System.out.println("The following would cause compilation errors if uncommented:");
        // RestrictedProduct product1 = new RestrictedProduct("Restricted Item", 99.99);
        // System.out.println("This line would not execute because the constructor is private");
        
        // Instead, we need to use the factory method
        System.out.println("\nUsing the factory method instead (workaround):");
        RestrictedProduct product1 = RestrictedProduct.createProduct("Restricted Item", 99.99);
        product1.displayInfo();
        
        // ERROR 2: Class with no public constructor
        System.out.println("\nError 2: Class with no public constructor:");
        System.out.println("The following would cause compilation errors if uncommented:");
        // SingletonExample singleton1 = new SingletonExample(); // Error: constructor is private
        // SingletonExample singleton2 = new SingletonExample(); // Error: constructor is private
        
        // Instead, we need to use the getInstance method
        System.out.println("\nUsing the getInstance method instead (workaround):");
        SingletonExample singleton1 = SingletonExample.getInstance();
        SingletonExample singleton2 = SingletonExample.getInstance();
        System.out.println("Are the instances the same object? " + (singleton1 == singleton2));
        
        // ERROR 3: Attempting to create an instance of a class with package-private constructor from outside the package
        System.out.println("\nError 3: Attempting to create an instance of a class with package-private constructor:");
        System.out.println("In a real multi-package program, the following would cause compilation errors:");
        PackageProduct product2 = new PackageProduct("Package Item", 49.99);
        product2.displayInfo();
        System.out.println("This works here because we're in the same package, but would fail from another package");
        
        System.out.println("\n--- Common Errors with Public Constructors ---");
        System.out.println("1. Making constructors private instead of public");
        System.out.println("2. Not providing any public constructor");
        System.out.println("3. Using package-private (default) constructors instead of public");
        System.out.println("4. Restricting object creation unnecessarily");
        System.out.println("5. Not allowing objects to be created from other classes or packages");
    }
}

/**
 * Class that demonstrates error of using private constructor instead of public
 */
class RestrictedProduct {
    // Private instance variables
    private String name;
    private double price;
    private int id;
    private static int nextId = 1000;
    
    // ERROR: Constructor is private instead of public
    private RestrictedProduct(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = nextId++;
        System.out.println("Private constructor called - RestrictedProduct created with ID: " + id);
    }
    
    // Factory method as a workaround for private constructor
    public static RestrictedProduct createProduct(String name, double price) {
        System.out.println("Using factory method to create RestrictedProduct");
        return new RestrictedProduct(name, price);
    }
    
    // Public method to display product information
    public void displayInfo() {
        System.out.println("\nRestrictedProduct Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

/**
 * Class that demonstrates error of not providing any public constructor
 * (Singleton pattern - intentionally restricts instantiation)
 */
class SingletonExample {
    // Static instance
    private static SingletonExample instance;
    
    // Private data
    private String data;
    
    // ERROR: Constructor is private with no public alternative
    private SingletonExample() {
        this.data = "Singleton data";
        System.out.println("Private constructor called - SingletonExample created");
    }
    
    // Method to get the singleton instance
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        System.out.println("Returning singleton instance");
        return instance;
    }
    
    // Public method
    public void displayData() {
        System.out.println("Singleton data: " + data);
    }
}

/**
 * Class that demonstrates error of using package-private (default) constructor
 */
class PackageProduct {
    // Private instance variables
    private String name;
    private double price;
    private int id;
    private static int nextId = 2000;
    
    // ERROR: Constructor has default (package-private) access instead of public
    // This will only be accessible from classes in the same package
    PackageProduct(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = nextId++;
        System.out.println("Package-private constructor called - PackageProduct created with ID: " + id);
    }
    
    // Public method to display product information
    public void displayInfo() {
        System.out.println("\nPackageProduct Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}
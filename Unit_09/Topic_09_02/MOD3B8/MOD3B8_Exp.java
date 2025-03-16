/**
 * MOD3B8_Exp.java
 * 
 * This program demonstrates MOD-3.B.8: When a subclass's constructor does not explicitly
 * call a superclass's constructor using super, Java inserts a call to the superclass's
 * no-argument constructor.
 */
public class MOD3B8_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating implicit calls to superclass constructors (MOD-3.B.8):\n");
        
        // Create instances using different constructors
        System.out.println("Creating a Product object with explicit constructor:");
        Product product = new Product("Laptop", 999.99);
        product.displayInfo();
        System.out.println();
        
        System.out.println("Creating an ElectronicProduct object with explicit super() call:");
        ElectronicProduct electronicWithExplicit = new ElectronicProduct("Smartphone", 799.99, "12 months");
        electronicWithExplicit.displayInfo();
        System.out.println();
        
        System.out.println("Creating an ElectronicProduct object with implicit super() call:");
        ElectronicProduct electronicWithImplicit = new ElectronicProduct();
        electronicWithImplicit.displayInfo();
        System.out.println();
        
        System.out.println("Creating a ClothingProduct object with implicit super() call:");
        ClothingProduct clothing = new ClothingProduct();
        clothing.displayInfo();
        
        System.out.println("\n--- Key Points about Implicit Superclass Constructor Calls ---");
        System.out.println("1. When a subclass constructor doesn't explicitly call super(), Java inserts super()");
        System.out.println("2. This implicit call invokes the superclass's no-argument constructor");
        System.out.println("3. The superclass must have a no-argument constructor for this to work");
        System.out.println("4. If the superclass doesn't have a no-argument constructor, a compilation error occurs");
        System.out.println("5. Explicit constructor calls with super() are preferred for clarity");
    }
}

/**
 * Superclass with multiple constructors
 */
class Product {
    private String name;
    private double price;
    
    // Constructor with parameters
    public Product(String name, double price) {
        System.out.println("Executing Product(String, double) constructor");
        this.name = name;
        this.price = price;
    }
    
    // No-argument constructor
    public Product() {
        System.out.println("Executing Product() constructor - called implicitly if not explicit");
        this.name = "Generic Product";
        this.price = 0.0;
    }
    
    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
    
    // Getters and setters
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
        this.price = price;
    }
}

/**
 * Subclass with both explicit and implicit superclass constructor calls
 */
class ElectronicProduct extends Product {
    private String warranty;
    
    // Constructor that explicitly calls the superclass constructor
    public ElectronicProduct(String name, double price, String warranty) {
        super(name, price); // Explicit call to superclass constructor
        System.out.println("Executing ElectronicProduct(String, double, String) constructor");
        this.warranty = warranty;
    }
    
    // Constructor that implicitly calls the superclass no-argument constructor
    public ElectronicProduct() {
        // No explicit super() call
        // Java inserts super() here, which calls Product()
        System.out.println("Executing ElectronicProduct() constructor - with implicit super() call");
        this.warranty = "None";
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warranty);
    }
}

/**
 * Another subclass with implicit superclass constructor call
 */
class ClothingProduct extends Product {
    private String size;
    
    // Constructor that implicitly calls the superclass no-argument constructor
    public ClothingProduct() {
        // No explicit super() call
        // Java inserts super() here, which calls Product()
        System.out.println("Executing ClothingProduct() constructor - with implicit super() call");
        this.size = "Medium";
        setName("Generic Clothing"); // Setting name after superclass constructor has initialized it
        setPrice(29.99);           // Setting price after superclass constructor has initialized it
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
    }
}

/**
 * Example of a class hierarchy where implicit constructor calls would fail:
 * 
 * class ProductWithoutDefault {
 *     private String name;
 *     
 *     // Only has parameterized constructor, no no-arg constructor
 *     public ProductWithoutDefault(String name) {
 *         this.name = name;
 *     }
 * }
 * 
 * class SubProductWithError extends ProductWithoutDefault {
 *     // This would cause a compilation error because there's no explicit super() call
 *     // and ProductWithoutDefault has no no-arg constructor for Java to call implicitly
 *     public SubProductWithError() {
 *         // Java tries to insert super() here, but there is no matching constructor
 *     }
 * }
 */
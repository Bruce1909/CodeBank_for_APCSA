/**
 * MOD3B8_Err.java
 * 
 * This program demonstrates errors related to MOD-3.B.8: Misunderstanding what happens when
 * a subclass's constructor does not explicitly call a superclass's constructor using super.
 */
public class MOD3B8_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors with implicit calls to superclass constructors (MOD-3.B.8):\n");
        
        // ERROR 1: Implicit call to no-argument constructor that doesn't exist
        System.out.println("ERROR 1: Implicit call to no-argument constructor that doesn't exist");
        System.out.println("The following code would not compile in Java:");
        System.out.println("class SubProductWithError extends ProductWithoutDefault {");
        System.out.println("    public SubProductWithError() {");
        System.out.println("        // No explicit super() call");
        System.out.println("        // Java tries to insert super() here, but there is no no-arg constructor");
        System.out.println("    }");
        System.out.println("}\n");
        
        // Create instances to demonstrate other issues
        System.out.println("Creating a ProductWithDefault object:");
        ProductWithDefault product = new ProductWithDefault("Laptop", 999.99);
        product.displayInfo();
        System.out.println();
        
        // ERROR 2: Relying on implicit constructor call with unexpected initialization
        System.out.println("ERROR 2: Relying on implicit constructor call with unexpected initialization");
        System.out.println("Creating an ElectronicProductWithError object with implicit super() call:");
        ElectronicProductWithError electronic = new ElectronicProductWithError("Premium Warranty");
        electronic.displayInfo(); // Shows default product name and price, which might not be appropriate
        System.out.println();
        
        // ERROR 3: Forgetting that instance variables are initialized after constructor calls
        System.out.println("ERROR 3: Forgetting that instance variables are initialized after constructor calls");
        System.out.println("Creating a ClothingProductWithError object:");
        ClothingProductWithError clothing = new ClothingProductWithError();
        clothing.displayInfo(); // Shows incorrect price calculation
        
        System.out.println("\n--- Problems with Implicit Superclass Constructor Calls ---");
        System.out.println("1. Compilation error if the superclass has no no-argument constructor");
        System.out.println("2. Unexpected default initialization of inherited fields");
        System.out.println("3. Unclear code that makes it difficult to understand the initialization sequence");
        System.out.println("4. Potential for initialization errors when subclass depends on specific superclass state");
        System.out.println("5. Harder to maintain code as changes to superclass constructors may break subclasses");
    }
}

/**
 * Superclass with only a parameterized constructor
 * This class is used to demonstrate compilation errors (commented out)
 */
class ProductWithoutDefault {
    private String name;
    private double price;
    
    // Only has parameterized constructor, no no-arg constructor
    public ProductWithoutDefault(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
}

/**
 * ERROR: Subclass that would cause compilation errors
 * This class is commented out because it would prevent the program from compiling
 */
// class SubProductWithError extends ProductWithoutDefault {
//     // This constructor would cause a compilation error
//     public SubProductWithError() {
//         // No explicit super() call
//         // Java tries to insert super() here, but ProductWithoutDefault has no no-arg constructor
//     }
// }

/**
 * Superclass with both parameterized and no-arg constructors
 */
class ProductWithDefault {
    private String name;
    private double price;
    
    // Constructor with parameters
    public ProductWithDefault(String name, double price) {
        System.out.println("Executing ProductWithDefault(String, double) constructor");
        this.name = name;
        this.price = price;
    }
    
    // No-argument constructor with default values
    public ProductWithDefault() {
        System.out.println("Executing ProductWithDefault() constructor - called implicitly if not explicit");
        this.name = "Unknown Product";
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
 * ERROR: Subclass that relies on implicit constructor call with unexpected results
 */
class ElectronicProductWithError extends ProductWithDefault {
    private String warranty;
    
    // ERROR: Constructor doesn't explicitly call super with appropriate parameters
    public ElectronicProductWithError(String warranty) {
        // No explicit super() call
        // Java inserts super() here, which calls ProductWithDefault()
        // This means the product will have name="Unknown Product" and price=0.0
        System.out.println("Executing ElectronicProductWithError constructor with implicit super() call");
        this.warranty = warranty;
        
        // Better approach would be:
        // super("Electronic Device", 299.99);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warranty);
    }
}

/**
 * ERROR: Subclass with incorrect initialization order assumptions
 */
class ClothingProductWithError extends ProductWithDefault {
    private String size;
    private double discount = 0.1; // 10% discount
    private double finalPrice; // Should be calculated based on the superclass price
    
    // ERROR: Constructor with incorrect initialization order assumptions
    public ClothingProductWithError() {
        // No explicit super() call
        // Java inserts super() here, which calls ProductWithDefault()
        
        System.out.println("Executing ClothingProductWithError() constructor");
        this.size = "Medium";
        
        // ERROR: Calculating finalPrice before setting the actual price
        // At this point, price is still 0.0 from the default constructor
        this.finalPrice = getPrice() * (1 - discount);
        
        // Setting properties after the calculation is done
        setName("Generic Clothing");
        setPrice(29.99);
        
        // finalPrice is now incorrect because it was calculated with price=0.0
        System.out.println("Calculated final price: $" + finalPrice + " (incorrect!)");
        System.out.println("Correct final price should be: $" + (getPrice() * (1 - discount)));
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
        System.out.println("Final Price (with discount): $" + finalPrice + " (incorrect due to initialization order)");
    }
}
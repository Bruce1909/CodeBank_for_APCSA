/**
 * MOD3A3_Exp.java
 * 
 * This program demonstrates MOD-3.A.3: Instance variables are encapsulated by using
 * the private access modifier.
 */
public class MOD3A3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating private instance variables for encapsulation (MOD-3.A.3):\n");
        
        // Create an instance of Product with encapsulated instance variables
        Product product = new Product("Laptop", 999.99, 10);
        
        // Display product information using accessor methods
        System.out.println("Product Information:");
        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Total Value: $" + product.calculateTotalValue());
        
        // Update product information using mutator methods
        System.out.println("\nUpdating product information...");
        product.setPrice(899.99);
        product.setQuantity(15);
        
        // Display updated information
        System.out.println("\nUpdated Product Information:");
        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Total Value: $" + product.calculateTotalValue());
        
        // Cannot access private instance variables directly
        System.out.println("\nAttempting to access private instance variables directly (commented out):");
        // System.out.println(product.name);     // Error: name has private access
        // System.out.println(product.price);    // Error: price has private access
        // System.out.println(product.quantity); // Error: quantity has private access
        
        System.out.println("\n--- Key Points about Private Instance Variables ---");
        System.out.println("1. Instance variables should be declared with the private access modifier");
        System.out.println("2. Private instance variables can only be accessed within the class");
        System.out.println("3. This enforces encapsulation by hiding implementation details");
        System.out.println("4. Changes to private instance variables won't affect external code");
        System.out.println("5. Private instance variables help maintain data integrity");
    }
}

/**
 * Class that demonstrates encapsulation using private instance variables
 */
class Product {
    // Private instance variables for encapsulation
    private String name;
    private double price;
    private int quantity;
    
    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = (price > 0) ? price : 0.0;
        this.quantity = (quantity >= 0) ? quantity : 0;
    }
    
    // Accessor methods (getters)
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    // Mutator methods (setters) with validation
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
    
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }
    
    // Business method that uses private instance variables
    public double calculateTotalValue() {
        return price * quantity;
    }
    
    // Private helper method - not accessible from outside
    private void validateData() {
        // Implementation details hidden from users
        if (price < 0) price = 0;
        if (quantity < 0) quantity = 0;
    }
}
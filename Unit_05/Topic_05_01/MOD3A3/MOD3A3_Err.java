/**
 * MOD3A3_Err.java
 * 
 * This program demonstrates common errors when instance variables are not encapsulated
 * using the private access modifier as described in MOD-3.A.3.
 */
public class MOD3A3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors when instance variables are not private (MOD-3.A.3):\n");
        
        // Create an instance of ProductWithErrors with non-encapsulated instance variables
        ProductWithErrors product = new ProductWithErrors("Laptop", 999.99, 10);
        
        // ERROR 1: Directly accessing instance variables
        System.out.println("ERROR 1: Directly accessing instance variables:");
        System.out.println("Name: " + product.name);
        System.out.println("Price: $" + product.price);
        System.out.println("Quantity: " + product.quantity);
        
        // ERROR 2: Directly modifying instance variables without validation
        System.out.println("\nERROR 2: Directly modifying instance variables without validation:");
        product.price = -100.0;  // Setting an invalid negative price
        product.quantity = -5;   // Setting an invalid negative quantity
        
        System.out.println("After invalid modifications:");
        System.out.println("Price: $" + product.price);     // Shows negative price
        System.out.println("Quantity: " + product.quantity); // Shows negative quantity
        
        // ERROR 3: Bypassing business logic
        System.out.println("\nERROR 3: Bypassing business logic:");
        System.out.println("Total Value (with negative values): $" + product.calculateTotalValue());
        System.out.println("This produces an incorrect negative total value!");
        
        // ERROR 4: Breaking object consistency
        System.out.println("\nERROR 4: Breaking object consistency:");
        product.name = null;  // Setting name to null
        try {
            System.out.println("Attempting to get name length: " + product.name.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
            System.out.println("This error could have been prevented with proper encapsulation");
        }
        
        // ERROR 5: External code depends on implementation details
        System.out.println("\nERROR 5: External code depends on implementation details:");
        System.out.println("If the internal representation changes, external code will break");
        
        System.out.println("\n--- Problems with Non-Private Instance Variables ---");
        System.out.println("1. Instance variables can be directly accessed from outside the class");
        System.out.println("2. Instance variables can be modified without validation");
        System.out.println("3. Business logic can be bypassed");
        System.out.println("4. Object consistency cannot be guaranteed");
        System.out.println("5. Changes to implementation will break dependent code");
    }
}

/**
 * Class that demonstrates problems with non-encapsulated instance variables
 */
class ProductWithErrors {
    // ERROR: Public instance variables - not encapsulated
    public String name;
    public double price;
    public int quantity;
    
    // Constructor
    public ProductWithErrors(String name, double price, int quantity) {
        this.name = name;
        this.price = price;  // No validation
        this.quantity = quantity;  // No validation
    }
    
    // Business method that can produce incorrect results due to lack of encapsulation
    public double calculateTotalValue() {
        return price * quantity;  // Can produce negative values due to lack of validation
    }
    
    // Methods that should control access to data but are ineffective
    // because instance variables are directly accessible
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
}
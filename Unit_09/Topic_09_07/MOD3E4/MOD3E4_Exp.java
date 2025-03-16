/**
 * MOD3E4_Exp.java
 * This program demonstrates how subclasses of Object often override the equals
 * and toString methods with class-specific implementations.
 * 
 * MOD-3.E.4: Subclasses of Object often override the equals and toString methods
 * with class-specific implementations.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class MOD3E4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating class-specific overrides of Object methods:\n");
        
        // Demonstrate how different Java classes override Object methods
        demonstrateJavaClassOverrides();
        
        // Demonstrate custom class overrides
        demonstrateCustomClassOverrides();
        
        // Demonstrate why overriding these methods is important
        demonstrateImportanceOfOverrides();
    }
    
    /**
     * Demonstrates how standard Java classes override Object methods
     */
    private static void demonstrateJavaClassOverrides() {
        System.out.println("1. Standard Java classes that override Object methods:\n");
        
        // String class overrides
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println("String class overrides:");
        System.out.println("str1.toString(): " + str1.toString());
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true - same content
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true - same content
        System.out.println("str1 == str3: " + (str1 == str3)); // false - different objects
        
        // Integer class overrides
        Integer int1 = 100;
        Integer int2 = 100;
        Integer int3 = new Integer(100);
        
        System.out.println("\nInteger class overrides:");
        System.out.println("int1.toString(): " + int1.toString());
        System.out.println("int1.equals(int2): " + int1.equals(int2)); // true - same value
        System.out.println("int1.equals(int3): " + int1.equals(int3)); // true - same value
        
        // ArrayList class overrides
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        
        System.out.println("\nArrayList class overrides:");
        System.out.println("list1.toString(): " + list1.toString());
        System.out.println("list1.equals(list2): " + list1.equals(list2)); // true - same elements
    }
    
    /**
     * Demonstrates custom class overrides of Object methods
     */
    private static void demonstrateCustomClassOverrides() {
        System.out.println("\n2. Custom classes overriding Object methods:\n");
        
        // Create instances of our custom classes
        Product product1 = new Product("Laptop", "Electronics", 999.99);
        Product product2 = new Product("Laptop", "Electronics", 999.99);
        Product product3 = new Product("Smartphone", "Electronics", 699.99);
        
        // Class with overridden methods
        System.out.println("Product class (with overrides):");
        System.out.println("product1.toString(): " + product1.toString());
        System.out.println("product1.equals(product2): " + product1.equals(product2)); // true - same content
        System.out.println("product1.equals(product3): " + product1.equals(product3)); // false - different content
        
        // Class without overridden methods
        DefaultProduct defaultProduct1 = new DefaultProduct("Laptop", "Electronics", 999.99);
        DefaultProduct defaultProduct2 = new DefaultProduct("Laptop", "Electronics", 999.99);
        
        System.out.println("\nDefaultProduct class (without overrides):");
        System.out.println("defaultProduct1.toString(): " + defaultProduct1.toString());
        System.out.println("defaultProduct1.equals(defaultProduct2): " + defaultProduct1.equals(defaultProduct2)); // false - different objects
    }
    
    /**
     * Demonstrates why overriding equals and toString is important
     */
    private static void demonstrateImportanceOfOverrides() {
        System.out.println("\n3. Why overriding these methods is important:\n");
        
        // Create products for demonstration
        Product product1 = new Product("Laptop", "Electronics", 999.99);
        Product product2 = new Product("Laptop", "Electronics", 999.99);
        DefaultProduct defaultProduct1 = new DefaultProduct("Laptop", "Electronics", 999.99);
        DefaultProduct defaultProduct2 = new DefaultProduct("Laptop", "Electronics", 999.99);
        
        // Using objects as HashMap keys
        HashMap<Product, String> productInventory = new HashMap<>();
        productInventory.put(product1, "In Stock");
        
        HashMap<DefaultProduct, String> defaultProductInventory = new HashMap<>();
        defaultProductInventory.put(defaultProduct1, "In Stock");
        
        System.out.println("Using objects as HashMap keys:");
        System.out.println("Looking up product2 in productInventory: " + productInventory.get(product2)); // "In Stock" - equals works
        System.out.println("Looking up defaultProduct2 in defaultProductInventory: " + defaultProductInventory.get(defaultProduct2)); // null - equals not overridden
        
        // Using toString for debugging and logging
        System.out.println("\nUsing toString for debugging and logging:");
        System.out.println("Logging product1: " + product1); // Meaningful information
        System.out.println("Logging defaultProduct1: " + defaultProduct1); // Just class name and hash code
    }
}

/**
 * A custom class that overrides both equals() and toString() methods
 */
class Product {
    private String name;
    private String category;
    private double price;
    
    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    
    /**
     * Overrides equals to compare products based on their properties
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        Product other = (Product) obj;
        return Double.compare(price, other.price) == 0 &&
               name.equals(other.name) &&
               category.equals(other.category);
    }
    
    /**
     * Overrides hashCode to be consistent with equals
     * Note: When overriding equals, you should also override hashCode
     */
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + category.hashCode();
        result = 31 * result + Double.hashCode(price);
        return result;
    }
    
    /**
     * Overrides toString to provide meaningful information about the product
     */
    @Override
    public String toString() {
        return "Product[name=" + name + ", category=" + category + ", price=$" + price + "]";
    }
}

/**
 * A custom class that does NOT override equals() or toString() methods
 * This class relies on the default Object implementations
 */
class DefaultProduct {
    private String name;
    private String category;
    private double price;
    
    public DefaultProduct(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    
    // No overrides for equals() or toString()
    // Will use Object's default implementations
}
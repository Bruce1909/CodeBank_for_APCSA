/**
 * MOD3E4_Err.java
 * This program demonstrates common errors when overriding equals and toString methods
 * in subclasses of Object.
 * 
 * MOD-3.E.4: Subclasses of Object often override the equals and toString methods
 * with class-specific implementations.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class MOD3E4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when overriding Object methods:\n");
        
        // Demonstrate errors in overriding equals()
        demonstrateEqualsErrors();
        
        // Demonstrate errors in overriding toString()
        demonstrateToStringErrors();
        
        // Demonstrate errors with hashCode() when overriding equals()
        demonstrateHashCodeErrors();
    }
    
    /**
     * Demonstrates common errors when overriding equals()
     */
    private static void demonstrateEqualsErrors() {
        System.out.println("1. Common errors when overriding equals():\n");
        
        // ERROR 1: Wrong parameter type
        IncorrectEqualsProduct product1 = new IncorrectEqualsProduct("Laptop", 999.99);
        IncorrectEqualsProduct product2 = new IncorrectEqualsProduct("Laptop", 999.99);
        
        System.out.println("ERROR 1: Wrong parameter type in equals() method");
        System.out.println("product1.equals(product2): " + product1.equals(product2)); // This calls the incorrect equals
        
        // This will call Object's equals() method, not our overridden one
        Object objProduct1 = product1;
        Object objProduct2 = product2;
        System.out.println("objProduct1.equals(objProduct2): " + objProduct1.equals(objProduct2)); // false
        System.out.println("The equals() method with wrong parameter type is not actually overriding Object.equals()\n");
        
        // ERROR 2: Not handling null or different class
        BadEqualsProduct badProduct1 = new BadEqualsProduct("Phone", 499.99);
        System.out.println("ERROR 2: Not handling null or different class in equals()");
        try {
            System.out.println("badProduct1.equals(null): " + badProduct1.equals(null)); // Should return false, might throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: equals() method doesn't handle null properly");
        }
        
        try {
            System.out.println("badProduct1.equals(\"Not a product\"): " + badProduct1.equals("Not a product")); // Should return false, might throw ClassCastException
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: equals() method doesn't check object type properly\n");
        }
    }
    
    /**
     * Demonstrates common errors when overriding toString()
     */
    private static void demonstrateToStringErrors() {
        System.out.println("\n2. Common errors when overriding toString():\n");
        
        // ERROR 3: Incorrect toString() implementation
        BadToStringProduct badToStringProduct = new BadToStringProduct("Tablet", 299.99);
        
        System.out.println("ERROR 3: Incorrect toString() implementation");
        System.out.println("badToStringProduct: " + badToStringProduct);
        System.out.println("The toString() method is not actually overriding Object.toString()\n");
        
        // ERROR 4: Returning null from toString()
        NullToStringProduct nullToStringProduct = new NullToStringProduct("Camera", 199.99);
        
        System.out.println("ERROR 4: Returning null from toString()");
        System.out.println("nullToStringProduct: " + nullToStringProduct);
        System.out.println("When toString() returns null, concatenation converts it to 'null' string\n");
    }
    
    /**
     * Demonstrates errors with hashCode() when overriding equals()
     */
    private static void demonstrateHashCodeErrors() {
        System.out.println("\n3. Errors with hashCode() when overriding equals():\n");
        
        // ERROR 5: Not overriding hashCode() when overriding equals()
        NoHashCodeProduct product1 = new NoHashCodeProduct("Headphones", 99.99);
        NoHashCodeProduct product2 = new NoHashCodeProduct("Headphones", 99.99);
        
        System.out.println("ERROR 5: Not overriding hashCode() when overriding equals()");
        System.out.println("product1.equals(product2): " + product1.equals(product2)); // true
        System.out.println("product1.hashCode() == product2.hashCode(): " + (product1.hashCode() == product2.hashCode())); // likely false
        
        // Demonstrate the problem in HashMap
        HashMap<NoHashCodeProduct, String> inventory = new HashMap<>();
        inventory.put(product1, "In Stock");
        
        System.out.println("\nProblem in HashMap:");
        System.out.println("inventory.get(product1): " + inventory.get(product1)); // "In Stock"
        System.out.println("inventory.get(product2): " + inventory.get(product2)); // null, even though equals() returns true
        System.out.println("This violates the contract that equal objects must have equal hash codes");
    }
}

/**
 * A class with incorrect equals() method (wrong parameter type)
 */
class IncorrectEqualsProduct {
    private String name;
    private double price;
    
    public IncorrectEqualsProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // ERROR: Wrong parameter type, should be Object
    // This method doesn't override Object.equals()
    public boolean equals(IncorrectEqualsProduct other) {
        return name.equals(other.name) && price == other.price;
    }
}

/**
 * A class with equals() method that doesn't handle null or different class
 */
class BadEqualsProduct {
    private String name;
    private double price;
    
    public BadEqualsProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // ERROR: Doesn't check for null or different class
    @Override
    public boolean equals(Object obj) {
        // Missing null check and class check
        BadEqualsProduct other = (BadEqualsProduct) obj; // Might throw ClassCastException
        return name.equals(other.name) && price == other.price; // Might throw NullPointerException
    }
}

/**
 * A class with incorrect toString() method (wrong method signature)
 */
class BadToStringProduct {
    private String name;
    private double price;
    
    public BadToStringProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // ERROR: Wrong method signature, doesn't override Object.toString()
    public String toString(String format) {
        return "Product: " + name + ", Price: $" + price;
    }
    
    // The correct implementation would be:
    /*
    @Override
    public String toString() {
        return "Product: " + name + ", Price: $" + price;
    }
    */
}

/**
 * A class with toString() method that returns null
 */
class NullToStringProduct {
    private String name;
    private double price;
    
    public NullToStringProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // ERROR: Returns null
    @Override
    public String toString() {
        return null; // Bad practice
    }
}

/**
 * A class that overrides equals() but not hashCode()
 */
class NoHashCodeProduct {
    private String name;
    private double price;
    
    public NoHashCodeProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        NoHashCodeProduct other = (NoHashCodeProduct) obj;
        return Double.compare(price, other.price) == 0 && 
               name.equals(other.name);
    }
    
    // ERROR: Missing hashCode() override
    // When overriding equals(), you should also override hashCode()
    // to ensure that equal objects have equal hash codes
    
    // The correct implementation would be:
    /*
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Double.hashCode(price);
        return result;
    }
    */
}
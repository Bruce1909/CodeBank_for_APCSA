/**
 * VAR-2.D.3 Example
 * Java allows the generic type ArrayList<E>, where the generic type E specifies the type of the elements.
 * 
 * This program demonstrates how to use generic types with ArrayList to create type-safe collections.
 */
import java.util.ArrayList;

public class VAR2D3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating ArrayList with generic types:\n");
        
        // Create an ArrayList of String objects
        System.out.println("1. ArrayList<String> - stores String objects");
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Hello");
        stringList.add("World");
        // stringList.add(42); // This would cause a compile-time error
        System.out.println("stringList contents: " + stringList);
        
        // Create an ArrayList of Integer objects
        System.out.println("\n2. ArrayList<Integer> - stores Integer objects");
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        // intList.add("text"); // This would cause a compile-time error
        System.out.println("intList contents: " + intList);
        
        // Create an ArrayList of Double objects
        System.out.println("\n3. ArrayList<Double> - stores Double objects");
        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(3.14);
        doubleList.add(2.71);
        // doubleList.add(42); // This would cause a compile-time error (int cannot be converted to Double)
        System.out.println("doubleList contents: " + doubleList);
        
        // Create an ArrayList of a custom class
        System.out.println("\n4. ArrayList<Product> - stores Product objects");
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(new Product("Laptop", 999.99));
        productList.add(new Product("Phone", 699.99));
        // productList.add("Tablet"); // This would cause a compile-time error
        
        System.out.println("productList contents:");
        for (Product product : productList) {
            System.out.println("  " + product);
        }
        
        // Demonstrate using a generic method with different ArrayList types
        System.out.println("\n5. Using a generic method with different ArrayList types:");
        System.out.println("Size of stringList: " + getListSize(stringList));
        System.out.println("Size of intList: " + getListSize(intList));
        System.out.println("Size of productList: " + getListSize(productList));
    }
    
    // A generic method that works with any ArrayList type
    public static <T> int getListSize(ArrayList<T> list) {
        return list.size();
    }
}

// A simple Product class for demonstration
class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=$" + price + "}";
    }
}
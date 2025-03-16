/**
 * MOD2D7_Exp.java
 * This program demonstrates how System.out.print or System.out.println calls
 * an object's toString method when passed an object (MOD-2.D.7).
 * 
 * @author AP CSA
 */
public class MOD2D7_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how System.out.print/println calls toString:\n");
        
        // Example 1: Printing an object with System.out.println
        System.out.println("Example 1: Printing an object with System.out.println");
        Product product = new Product("Laptop", 999.99);
        System.out.println("The following line calls product.toString() automatically:");
        System.out.println(product); // Calls product.toString() automatically
        System.out.println("This is equivalent to:");
        System.out.println(product.toString()); // Explicit call to toString
        System.out.println();
        
        // Example 2: Printing an object with System.out.print
        System.out.println("Example 2: Printing an object with System.out.print");
        Circle circle = new Circle(5.0);
        System.out.println("The following line calls circle.toString() automatically:");
        System.out.print("Circle information: ");
        System.out.print(circle); // Calls circle.toString() automatically
        System.out.println("\n");
        
        // Example 3: Concatenating an object with a string
        System.out.println("Example 3: Concatenating an object with a string");
        Person person = new Person("Alice", 25);
        System.out.println("The following line calls person.toString() during concatenation:");
        System.out.println("Person details: " + person); // Calls person.toString() during concatenation
        System.out.println();
        
        // Example 4: Printing an array of objects
        System.out.println("Example 4: Printing an array of objects");
        Product[] products = {
            new Product("Phone", 599.99),
            new Product("Tablet", 349.99),
            new Product("Headphones", 149.99)
        };
        System.out.println("The following loop prints each product's toString():");
        for (Product p : products) {
            System.out.println("- " + p); // Calls p.toString() for each product
        }
        System.out.println();
        
        // Example 5: Default toString behavior for objects without toString override
        System.out.println("Example 5: Default toString behavior");
        ObjectWithoutToString obj = new ObjectWithoutToString();
        System.out.println("Object without toString override: " + obj);
        System.out.println("The default toString from Object class is used, showing class name and hash code");
        
        System.out.println("\nKey points about System.out.print/println and toString:");
        System.out.println("- When an object is passed to System.out.print or println, toString is called");
        System.out.println("- This happens automatically without an explicit call to toString");
        System.out.println("- The same happens when an object is used in string concatenation");
        System.out.println("- If toString is not overridden, the default from Object class is used");
        System.out.println("- This behavior makes it easy to display object information for debugging");
    }
}

/**
 * A class representing a product with a toString method.
 */
class Product {
    private String name;
    private double price;
    
    /**
     * Constructor to initialize product data.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    /**
     * Overrides the toString method to provide a description of the product.
     * 
     * @return a string representation of the product
     */
    @Override
    public String toString() {
        return "Product[name=\"" + name + "\", price=$" + String.format("%.2f", price) + "]";
    }
}

/**
 * A class representing a circle with a toString method.
 */
class Circle {
    private double radius;
    
    /**
     * Constructor to initialize circle data.
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    
    /**
     * Calculates the area of the circle.
     * 
     * @return the area of the circle
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Overrides the toString method to provide a description of the circle.
     * 
     * @return a string representation of the circle
     */
    @Override
    public String toString() {
        return String.format("Circle(radius=%.1f, area=%.2f)", radius, getArea());
    }
}

/**
 * A class representing a person with a toString method.
 */
class Person {
    private String name;
    private int age;
    
    /**
     * Constructor to initialize person data.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /**
     * Overrides the toString method to provide a description of the person.
     * 
     * @return a string representation of the person
     */
    @Override
    public String toString() {
        return "Person[name=\"" + name + "\", age=" + age + "]";
    }
}

/**
 * A class that does not override the toString method.
 * This will use the default toString implementation from the Object class.
 */
class ObjectWithoutToString {
    // No toString override
    // The default toString from Object class will be used
    // This will output something like: "ObjectWithoutToString@7852e922"
}
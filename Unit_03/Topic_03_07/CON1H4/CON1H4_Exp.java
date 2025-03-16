/**
 * CON-1.H.4: Often classes have their own `equals` method, which can be used to determine whether two objects of the class are equivalent.
 *
 * This example demonstrates how to properly override and use the equals method
 * to compare objects based on their content rather than their reference.
 */
public class CON1H4_Exp {
    public static void main(String[] args) {
        // Create two Product objects with the same values
        Product product1 = new Product("Laptop", 999.99, "Electronics");
        Product product2 = new Product("Laptop", 999.99, "Electronics");
        
        // Create a different Product object
        Product product3 = new Product("Smartphone", 699.99, "Electronics");
        
        // Compare references using ==
        System.out.println("Comparing references using ==:");
        System.out.println("product1 == product2: " + (product1 == product2));
        System.out.println("This returns false because they are different objects in memory.\n");
        
        // Compare objects using equals() method
        System.out.println("Comparing objects using equals() method:");
        System.out.println("product1.equals(product2): " + product1.equals(product2));
        System.out.println("product1.equals(product3): " + product1.equals(product3));
        System.out.println("product1.equals(null): " + product1.equals(null));
        
        // Demonstrate symmetry property of equals
        System.out.println("\nDemonstrating symmetry property of equals:");
        System.out.println("product1.equals(product2): " + product1.equals(product2));
        System.out.println("product2.equals(product1): " + product2.equals(product1));
        
        // Demonstrate using equals with different types
        System.out.println("\nDemonstrating equals with different types:");
        String string = "Laptop";
        System.out.println("product1.equals(string): " + product1.equals(string));
        
        // Create a similar product with different category
        Product product4 = new Product("Laptop", 999.99, "Computers");
        System.out.println("\nComparing similar products with different category:");
        System.out.println("product1.equals(product4): " + product1.equals(product4));
    }
}

/**
 * A Product class with a properly overridden equals method
 */
class Product {
    private String name;
    private double price;
    private String category;
    
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getCategory() {
        return category;
    }
    
    // Override equals method to compare objects based on their content
    @Override
    public boolean equals(Object obj) {
        // Check if the object is being compared to itself
        if (this == obj) {
            return true;
        }
        
        // Check if the object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        // Cast the object to Product
        Product other = (Product) obj;
        
        // Compare the relevant fields
        return name.equals(other.name) && 
               Math.abs(price - other.price) < 0.001 && // Compare doubles with a small epsilon
               category.equals(other.category);
    }
    
    // Note: When overriding equals(), you should also override hashCode()
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + Double.hashCode(price);
        result = 31 * result + category.hashCode();
        return result;
    }
}
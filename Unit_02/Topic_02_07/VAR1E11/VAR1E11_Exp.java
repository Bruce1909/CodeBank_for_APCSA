/**
 * VAR1E11_Exp.java
 * 
 * This program demonstrates String concatenation with object references.
 * 
 * Knowledge Point: VAR-1.E.11
 * - A String object can be concatenated with an object reference, which implicitly calls
 *   the referenced object's toString method.
 */
public class VAR1E11_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating String Concatenation with Object References:\n");
        
        // Example 1: Basic concatenation with objects that have toString() implemented
        System.out.println("Example 1: Basic concatenation with objects that have toString() implemented");
        Person person = new Person("John Doe", 25);
        System.out.println("Person object: " + person);
        System.out.println("When concatenating an object with a string, toString() is implicitly called");
        System.out.println();
        
        // Example 2: Concatenation with multiple objects
        System.out.println("Example 2: Concatenation with multiple objects");
        Book book = new Book("Java Programming", "James Gosling");
        System.out.println("Person " + person + " is reading " + book);
        System.out.println();
        
        // Example 3: Concatenation with objects that don't override toString()
        System.out.println("Example 3: Concatenation with objects that don't override toString()");
        NoToStringOverride obj = new NoToStringOverride();
        System.out.println("Object without toString() override: " + obj);
        System.out.println("The default toString() returns the class name and hash code");
        System.out.println();
        
        // Example 4: Concatenation with null references
        System.out.println("Example 4: Concatenation with null references");
        Person nullPerson = null;
        System.out.println("Concatenating with null: " + nullPerson);
        System.out.println("When a null reference is concatenated, it becomes the string \"null\"");
        System.out.println();
        
        // Example 5: Concatenation with arrays
        System.out.println("Example 5: Concatenation with arrays");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array: " + numbers);
        System.out.println("Arrays don't override toString(), so you get the default implementation");
        System.out.println("To properly display arrays, use Arrays.toString(): " + java.util.Arrays.toString(numbers));
        System.out.println();
        
        // Example 6: Concatenation with wrapper classes
        System.out.println("Example 6: Concatenation with wrapper classes");
        Integer intObj = 42;
        Double doubleObj = 3.14;
        Boolean boolObj = true;
        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Boolean object: " + boolObj);
        System.out.println("Wrapper classes have useful toString() implementations");
        System.out.println();
        
        // Example 7: Concatenation in a more complex scenario
        System.out.println("Example 7: Concatenation in a more complex scenario");
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Product("Laptop", 999.99));
        cart.addItem(new Product("Mouse", 24.99));
        cart.addItem(new Product("Keyboard", 49.99));
        
        System.out.println("Shopping cart contents:\n" + cart);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about String Concatenation with Objects ---");
        System.out.println("1. When an object is concatenated with a String, its toString() method is implicitly called");
        System.out.println("2. Classes should override toString() to provide meaningful string representations");
        System.out.println("3. Without a toString() override, the default implementation returns class name and hash code");
        System.out.println("4. Null references become the string \"null\" when concatenated");
        System.out.println("5. Special handling is needed for arrays (use Arrays.toString())");
    }
}

// Example classes for demonstration

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return name + " (age: " + age + ")";
    }
}

class Book {
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

class NoToStringOverride {
    // This class doesn't override toString()
    // so it will use the default implementation from Object
}

class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

class ShoppingCart {
    private java.util.ArrayList<Product> items = new java.util.ArrayList<>();
    
    public void addItem(Product product) {
        items.add(product);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        double total = 0.0;
        
        for (Product item : items) {
            sb.append("  ").append(item).append("\n");
            total += Double.parseDouble(item.toString().split("\\$")[1]);
        }
        
        sb.append("Total: $").append(total);
        return sb.toString();
    }
}
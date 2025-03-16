/**
 * VAR1E11_Err.java
 * 
 * This program demonstrates common errors related to String concatenation with object references.
 * 
 * Knowledge Point: VAR-1.E.11
 * - A String object can be concatenated with an object reference, which implicitly calls
 *   the referenced object's toString method.
 */
public class VAR1E11_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with String concatenation with objects:\n");
        
        // ERROR 1: Not overriding toString() in custom classes
        System.out.println("ERROR 1: Not overriding toString() in custom classes");
        BadProduct product = new BadProduct("Laptop", 999.99);
        System.out.println("Product information: " + product);
        System.out.println("Without overriding toString(), you get the default implementation");
        System.out.println("which shows the class name and hash code, not useful information");
        
        // Better approach: override toString()
        GoodProduct betterProduct = new GoodProduct("Laptop", 999.99);
        System.out.println("\nWith toString() override: " + betterProduct);
        System.out.println("This provides meaningful information about the object");
        System.out.println();
        
        // ERROR 2: Forgetting that toString() is called implicitly
        System.out.println("ERROR 2: Forgetting that toString() is called implicitly");
        Person person = new Person("John", 25);
        
        // Redundant explicit call to toString()
        System.out.println("Redundant: " + person.toString());
        System.out.println("Cleaner: " + person);
        System.out.println("Both produce the same output because toString() is called implicitly");
        System.out.println();
        
        // ERROR 3: Not handling null references properly
        System.out.println("ERROR 3: Not handling null references properly");
        Person nullPerson = null;
        
        // Concatenating with null
        System.out.println("Concatenating with null: " + nullPerson);
        System.out.println("This outputs the string \"null\" rather than causing an error");
        
        // But calling methods on null causes NullPointerException
        System.out.println("\nHowever, attempting to call methods on null causes errors:");
        try {
            // This will throw a NullPointerException
            System.out.println("Attempting: nullPerson.toString()");
            String str = nullPerson.toString();
            System.out.println(str); // This line won't execute
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot call methods on a null reference");
        }
        System.out.println();
        
        // ERROR 4: Misunderstanding array concatenation
        System.out.println("ERROR 4: Misunderstanding array concatenation");
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Direct concatenation doesn't show array contents
        System.out.println("Direct concatenation: " + numbers);
        System.out.println("This shows the array's memory address, not its contents");
        
        // Correct approach: use Arrays.toString()
        System.out.println("Correct approach: " + java.util.Arrays.toString(numbers));
        System.out.println();
        
        // ERROR 5: Inefficient string building with many objects
        System.out.println("ERROR 5: Inefficient string building with many objects");
        System.out.println("Inefficient approach (creates many temporary String objects):");
        String inefficient = "";
        
        for (int i = 1; i <= 5; i++) {
            // This creates a new String object in each iteration
            inefficient += new Item("Item" + i, i * 10.0);
        }
        
        System.out.println(inefficient);
        
        // Better approach: use StringBuilder
        System.out.println("\nMore efficient approach using StringBuilder:");
        StringBuilder efficient = new StringBuilder();
        
        for (int i = 1; i <= 5; i++) {
            efficient.append(new Item("Item" + i, i * 10.0));
        }
        
        System.out.println(efficient.toString());
        System.out.println();
        
        // ERROR 6: Not considering formatting needs
        System.out.println("ERROR 6: Not considering formatting needs");
        Circle circle = new Circle(5.0);
        
        // Basic concatenation might not format as desired
        System.out.println("Circle information: " + circle);
        
        // Better approach: format explicitly when needed
        System.out.println("Formatted output: " + String.format("Circle(radius=%.2f, area=%.2f)", 
                circle.getRadius(), circle.getArea()));
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Common Errors with Object Concatenation ---");
        System.out.println("1. Not overriding toString() in custom classes");
        System.out.println("2. Redundantly calling toString() explicitly in concatenation");
        System.out.println("3. Not handling null references properly");
        System.out.println("4. Misunderstanding how arrays are converted to strings");
        System.out.println("5. Using inefficient string concatenation with many objects");
        System.out.println("6. Not considering special formatting needs");
    }
}

// Example classes for demonstration

class BadProduct {
    private String name;
    private double price;
    
    public BadProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // No toString() override, will use Object's default implementation
}

class GoodProduct {
    private String name;
    private double price;
    
    public GoodProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

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

class Item {
    private String name;
    private double price;
    
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return name + ": $" + price + "\n";
    }
}

class Circle {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String toString() {
        return "Circle(radius=" + radius + ", area=" + getArea() + ")";
    }
}
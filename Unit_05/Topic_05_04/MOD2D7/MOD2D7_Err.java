/**
 * MOD2D7_Err.java
 * This program demonstrates common errors when using toString method with
 * System.out.print or System.out.println (MOD-2.D.7).
 * 
 * @author AP CSA
 */
public class MOD2D7_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with toString and System.out.print/println:\n");
        
        // Error 1: Not overriding toString method
        System.out.println("Error 1: Not overriding toString method");
        ProductWithoutToString product = new ProductWithoutToString("Laptop", 999.99);
        System.out.println("When toString is not overridden, the default Object.toString() is used:");
        System.out.println(product); // Uses default Object.toString()
        System.out.println("This displays the class name and hash code, not meaningful information");
        System.out.println();
        
        // Error 2: Returning null from toString
        System.out.println("Error 2: Returning null from toString");
        ProductWithNullToString nullProduct = new ProductWithNullToString("Phone", 599.99);
        System.out.println("When toString returns null, 'null' is printed:");
        System.out.println("Product info: " + nullProduct); // Will print "Product info: null"
        System.out.println();
        
        // Error 3: Modifying object state in toString
        System.out.println("Error 3: Modifying object state in toString");
        CounterWithBadToString counter = new CounterWithBadToString();
        System.out.println("Initial counter value: " + counter.getCount());
        System.out.println("First call to println with counter:");
        System.out.println(counter); // Calls toString and modifies state
        System.out.println("Counter value after first println: " + counter.getCount());
        System.out.println("Second call to println with counter:");
        System.out.println(counter); // Calls toString and modifies state again
        System.out.println("Counter value after second println: " + counter.getCount());
        System.out.println("toString should NEVER modify object state!");
        System.out.println();
        
        // Error 4: Infinite recursion in toString
        System.out.println("Error 4: Infinite recursion in toString");
        System.out.println("The following would cause a StackOverflowError if uncommented:");
        // RecursiveToString recursive = new RecursiveToString("Test");
        // System.out.println(recursive); // Would cause StackOverflowError
        System.out.println("// RecursiveToString recursive = new RecursiveToString(\"Test\");");
        System.out.println("// System.out.println(recursive); // Would cause StackOverflowError");
        System.out.println();
        
        // Error 5: Not handling null fields in toString
        System.out.println("Error 5: Not handling null fields in toString");
        PersonWithBadToString person = new PersonWithBadToString(null, 25);
        System.out.println("When toString doesn't check for null fields, it can cause NullPointerException:");
        try {
            System.out.println(person); // Will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
            System.out.println("This happened because toString tried to call methods on a null field");
        }
        System.out.println();
        
        System.out.println("Key points about errors with toString and System.out.print/println:");
        System.out.println("- Always override toString in your classes to provide meaningful information");
        System.out.println("- Never return null from toString");
        System.out.println("- Never modify object state in toString");
        System.out.println("- Avoid infinite recursion in toString");
        System.out.println("- Always handle null fields properly in toString");
        System.out.println("- Remember that toString is called automatically by System.out.print/println");
    }
}

/**
 * A class representing a product without overriding toString.
 */
class ProductWithoutToString {
    private String name;
    private double price;
    
    /**
     * Constructor to initialize product data.
     */
    public ProductWithoutToString(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // No toString override - will use Object.toString()
    // This will output something like: "ProductWithoutToString@7852e922"
}

/**
 * A class representing a product with toString that returns null.
 */
class ProductWithNullToString {
    private String name;
    private double price;
    
    /**
     * Constructor to initialize product data.
     */
    public ProductWithNullToString(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    /**
     * Incorrectly returns null from toString.
     * 
     * @return null (which is a bad practice)
     */
    @Override
    public String toString() {
        return null; // Bad practice - should never return null
    }
}

/**
 * A class that incorrectly modifies its state in toString.
 */
class CounterWithBadToString {
    private int count = 0;
    
    /**
     * Gets the current count.
     * 
     * @return the current count
     */
    public int getCount() {
        return count;
    }
    
    /**
     * Incorrectly modifies object state in toString.
     * 
     * @return a string representation of the counter
     */
    @Override
    public String toString() {
        count++; // BAD PRACTICE: modifying state in toString
        return "Counter[count=" + count + "]"; 
    }
}

/**
 * A class with toString that would cause infinite recursion.
 */
class RecursiveToString {
    private String name;
    
    /**
     * Constructor to initialize data.
     */
    public RecursiveToString(String name) {
        this.name = name;
    }
    
    /**
     * Incorrectly calls System.out.println inside toString, which would
     * cause infinite recursion and StackOverflowError.
     * 
     * @return a string representation (never actually returns)
     */
    @Override
    public String toString() {
        // This causes infinite recursion because println calls toString
        System.out.println("Processing: " + this); 
        return "RecursiveToString[name=" + name + "]"; // Never reaches here
    }
}

/**
 * A class that doesn't handle null fields in toString.
 */
class PersonWithBadToString {
    private String name; // Could be null
    private int age;
    
    /**
     * Constructor to initialize person data.
     */
    public PersonWithBadToString(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /**
     * Incorrectly doesn't check for null fields.
     * 
     * @return a string representation of the person
     */
    @Override
    public String toString() {
        // Will throw NullPointerException if name is null
        return "Person[name=" + name.toUpperCase() + ", age=" + age + "]";
    }
}
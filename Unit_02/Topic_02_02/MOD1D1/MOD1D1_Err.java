/**
 * MOD1D1_Err - Error examples demonstrating common mistakes when creating objects
 * 
 * This program demonstrates common errors related to MOD-1.D.1:
 * Every object is created using the keyword new followed by a call to one of the class's constructors.
 */
public class MOD1D1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when creating objects:\n");
        
        // Example 1: Attempting to create an object without using 'new'
        System.out.println("Example 1: Attempting to create an object without using 'new'");
        System.out.println("// Error: String greeting = String(\"Hello, world!\"); // Missing 'new' keyword");
        System.out.println("// This would cause a compilation error");
        
        // Correct way
        System.out.println("Correct way:");
        String greeting = new String("Hello, world!");
        System.out.println("String greeting = new String(\"Hello, world!\");\n");
        
        // Example 2: Declaring a variable but not instantiating an object
        System.out.println("Example 2: Declaring a variable but not instantiating an object");
        System.out.println("// Error: Student student2; // Only declares a reference, doesn't create an object");
        System.out.println("// student2.getName(); // Would cause NullPointerException if called");
        
        // Correct way
        System.out.println("Correct way:");
        Student student2 = new Student();
        System.out.println("Student student2 = new Student();\n");
        
        // Example 3: Using a constructor that doesn't exist
        System.out.println("Example 3: Using a constructor that doesn't exist");
        System.out.println("// Error: Book book = new Book(\"Title\"); // No constructor with String parameter exists");
        System.out.println("// This would cause a compilation error");
        
        // Correct way
        System.out.println("Correct way:");
        Book book = new Book();
        System.out.println("Book book = new Book(); // Use the no-arg constructor that exists\n");
        
        // Example 4: Trying to create an object of an abstract class
        System.out.println("Example 4: Trying to create an object of an abstract class");
        System.out.println("// Error: Shape shape = new Shape(); // Cannot instantiate abstract class");
        System.out.println("// This would cause a compilation error");
        
        // Correct way
        System.out.println("Correct way:");
        Shape shape = new Circle(); // Create an object of a concrete subclass
        System.out.println("Shape shape = new Circle(); // Create an object of a concrete subclass\n");
        
        // Summary
        System.out.println("--- Common Errors When Creating Objects ---");
        System.out.println("1. Forgetting to use the 'new' keyword");
        System.out.println("2. Declaring a variable but not instantiating an object");
        System.out.println("3. Trying to use a constructor that doesn't exist");
        System.out.println("4. Attempting to instantiate an abstract class");
        System.out.println("5. Using 'new' with primitive types (which is not allowed)");
    }
}

/**
 * A simple Student class for demonstration purposes
 */
class Student {
    private String name;
    private int id;
    
    // Constructor
    public Student() {
        this.name = "Unknown";
        this.id = 0;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Student(name=" + name + ", id=" + id + ")";
    }
}

/**
 * A simple Book class for demonstration purposes
 */
class Book {
    private String title;
    private String author;
    
    // Constructor
    public Book() {
        this.title = "Untitled";
        this.author = "Anonymous";
    }
    
    @Override
    public String toString() {
        return "Book(title=" + title + ", author=" + author + ")";
    }
}

/**
 * An abstract class that cannot be instantiated directly
 */
abstract class Shape {
    abstract double getArea();
}

/**
 * A concrete subclass of Shape that can be instantiated
 */
class Circle extends Shape {
    private double radius = 1.0;
    
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}
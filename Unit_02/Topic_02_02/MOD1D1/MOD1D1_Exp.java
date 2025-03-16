/**
 * MOD1D1_Exp - Example demonstrating object creation using the 'new' keyword
 * 
 * This program demonstrates MOD-1.D.1:
 * Every object is created using the keyword new followed by a call to one of the class's constructors.
 */
public class MOD1D1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating object creation using the 'new' keyword:\n");
        
        // Example 1: Creating a simple String object
        System.out.println("Example 1: Creating a String object");
        String greeting = new String("Hello, world!");
        System.out.println("Created String object: " + greeting);
        System.out.println();
        
        // Example 2: Creating an object of a custom class
        System.out.println("Example 2: Creating a Student object");
        Student student1 = new Student();
        System.out.println("Created Student object: " + student1);
        System.out.println();
        
        // Example 3: Creating an array object
        System.out.println("Example 3: Creating an array object");
        int[] numbers = new int[5];
        System.out.println("Created array object with length: " + numbers.length);
        System.out.println();
        
        // Example 4: Creating multiple objects of the same class
        System.out.println("Example 4: Creating multiple Book objects");
        Book book1 = new Book();
        Book book2 = new Book();
        System.out.println("Created two Book objects: " + book1 + " and " + book2);
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Object Creation ---");
        System.out.println("1. All objects are created using the 'new' keyword");
        System.out.println("2. The 'new' keyword is followed by a call to a constructor");
        System.out.println("3. The constructor has the same name as the class");
        System.out.println("4. Each 'new' expression creates a distinct object in memory");
        System.out.println("5. The 'new' operator returns a reference to the created object");
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
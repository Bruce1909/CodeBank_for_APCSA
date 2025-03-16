/**
 * MOD1E8_Exp.java
 * 
 * This program demonstrates that using a null reference to call a method or access
 * an instance variable causes a NullPointerException to be thrown.
 * 
 * Knowledge Point: MOD-1.E.8
 * Using a null reference to call a method or access an instance variable causes a
 * `NullPointerException` to be thrown.
 */
public class MOD1E8_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException with null references:\n");
        
        // Example 1: Proper object initialization and method call (no exception)
        System.out.println("Example 1: Proper object initialization and method call");
        Student student1 = new Student("Alice", 20);
        student1.displayInfo();  // Works fine because student1 is not null
        System.out.println();
        
        // Example 2: Null reference and method call (will cause NullPointerException)
        System.out.println("Example 2: Null reference and method call");
        Student student2 = null;
        
        System.out.println("About to call a method on a null reference...");
        System.out.println("The following line would throw a NullPointerException at runtime:");
        System.out.println("// student2.displayInfo();  // NullPointerException");
        System.out.println("This happens because student2 is null and cannot call methods.\n");
        
        // Example 3: Null reference and instance variable access (will cause NullPointerException)
        System.out.println("Example 3: Null reference and instance variable access");
        Book book = null;
        
        System.out.println("About to access an instance variable through a null reference...");
        System.out.println("The following line would throw a NullPointerException at runtime:");
        System.out.println("// System.out.println(book.title);  // NullPointerException");
        System.out.println("This happens because book is null and cannot access instance variables.\n");
        
        // Example 4: Checking for null before calling methods (proper way to avoid NullPointerException)
        System.out.println("Example 4: Checking for null before calling methods");
        Student student3 = getStudentFromDatabase("Bob");  // This returns null in this example
        
        // Proper way to avoid NullPointerException
        if (student3 != null) {
            student3.displayInfo();
        } else {
            System.out.println("Cannot display info: student3 is null");
        }
        System.out.println();
        
        // Example 5: Using try-catch to handle potential NullPointerException
        System.out.println("Example 5: Using try-catch to handle potential NullPointerException");
        Student student4 = null;
        
        try {
            System.out.println("Attempting to call a method on a potentially null reference...");
            // This will throw a NullPointerException
            student4.displayInfo();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
            System.out.println("This demonstrates that a NullPointerException was thrown as expected.");
        }
    }
    
    // Method that simulates retrieving a student from a database
    // Returns null to demonstrate null reference handling
    public static Student getStudentFromDatabase(String name) {
        // In a real application, this would search a database
        // For this example, we'll just return null
        System.out.println("Searching for student: " + name);
        System.out.println("No student found, returning null");
        return null;
    }
}

// Student class for demonstration
class Student {
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age);
    }
}

// Book class for demonstration
class Book {
    public String title;  // Public for demonstration purposes
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author);
    }
}
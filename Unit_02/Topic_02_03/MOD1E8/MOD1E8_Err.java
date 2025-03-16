/**
 * MOD1E8_Err.java
 * 
 * This program demonstrates common errors related to using null references to call methods
 * or access instance variables, which causes NullPointerException.
 * 
 * Knowledge Point: MOD-1.E.8
 * Using a null reference to call a method or access an instance variable causes a
 * `NullPointerException` to be thrown.
 */
public class MOD1E8_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with null references:\n");
        
        // ERROR 1: Calling a method on a null reference
        System.out.println("ERROR 1: Calling a method on a null reference");
        System.out.println("The following code would cause a NullPointerException at runtime:");
        System.out.println("Student student = null;");
        System.out.println("// student.displayInfo();  // NullPointerException");
        System.out.println("A null reference cannot be used to call methods.\n");
        
        // ERROR 2: Accessing an instance variable through a null reference
        System.out.println("ERROR 2: Accessing an instance variable through a null reference");
        System.out.println("The following code would cause a NullPointerException at runtime:");
        System.out.println("Book book = null;");
        System.out.println("// String title = book.title;  // NullPointerException");
        System.out.println("A null reference cannot be used to access instance variables.\n");
        
        // ERROR 3: Forgetting to check for null before using an object
        System.out.println("ERROR 3: Forgetting to check for null before using an object");
        System.out.println("The following demonstrates the correct approach:");
        
        // Simulate getting a result that might be null
        Student student = getStudentFromDatabase("Bob");  // Returns null in this example
        
        System.out.println("\nIncorrect approach (would cause NullPointerException):");
        System.out.println("// student.displayInfo();  // NullPointerException if student is null");
        
        System.out.println("\nCorrect approach (checking for null first):");
        if (student != null) {
            System.out.println("Student found, displaying info...");
            // student.displayInfo(); - This would be safe now, but we know student is null
        } else {
            System.out.println("Student is null, cannot display info");
        }
        
        // ERROR 4: Chained method calls with potential null references
        System.out.println("\nERROR 4: Chained method calls with potential null references");
        System.out.println("The following code would cause a NullPointerException at runtime:");
        System.out.println("Department dept = null;");
        System.out.println("// String manager = dept.getManager().getName();  // NullPointerException");
        System.out.println("When chaining method calls, any null reference in the chain will cause a NullPointerException.\n");
        
        // ERROR 5: Not handling null return values from methods
        System.out.println("ERROR 5: Not handling null return values from methods");
        System.out.println("Methods that might return null should be handled carefully:");
        System.out.println("String name = getNameFromDatabase();  // Might return null");
        System.out.println("// int length = name.length();  // NullPointerException if name is null");
        System.out.println("Always check for null when working with values that might be null.\n");
        
        // Demonstrate a NullPointerException in a controlled environment
        System.out.println("Demonstrating a NullPointerException in a controlled environment:");
        try {
            Student nullStudent = null;
            System.out.println("Attempting to call a method on a null reference...");
            nullStudent.displayInfo();  // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
            System.out.println("This is what happens when you use a null reference to call a method.");
        }
    }
    
    // Method that simulates retrieving a student from a database
    // Returns null to demonstrate null reference handling
    public static Student getStudentFromDatabase(String name) {
        System.out.println("Searching for student: " + name);
        System.out.println("No student found, returning null");
        return null;
    }
    
    // Method that might return null
    public static String getNameFromDatabase() {
        // Simulating a database lookup that returns null
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

// Classes for demonstrating chained method calls
class Department {
    private Manager manager;
    
    public Manager getManager() {
        return manager;
    }
}

class Manager {
    private String name;
    
    public String getName() {
        return name;
    }
}
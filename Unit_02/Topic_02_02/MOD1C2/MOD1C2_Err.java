/**
 * MOD1C2_Err.java
 * 
 * This program demonstrates common errors when using parameter lists in constructor headers.
 * 
 * Knowledge Point: MOD-1.C.2
 * The parameter list, in the header of a constructor, lists the types of the values
 * that are passed and their variable names. These are often referred to as formal parameters.
 */
public class MOD1C2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Constructor Parameter List Errors:\n");
        
        // Creating a valid Student object for comparison
        Student validStudent = new Student("John Smith", 17, 3.5, false);
        validStudent.displayInfo();
        
        System.out.println("\nCommon errors with constructor parameter lists:");
        System.out.println("1. Missing parameter type declarations");
        System.out.println("2. Incorrect parameter order");
        System.out.println("3. Incompatible parameter types");
        System.out.println("4. Duplicate parameter names");
        
        // ERROR 1: Trying to call a constructor with incompatible parameter types
        // Uncommenting the following line will cause a compilation error
        // Student student1 = new Student("Jane Doe", "seventeen", 3.9, true); // Error: String cannot be converted to int
        
        // ERROR 2: Trying to call a constructor with incorrect number of parameters
        // Uncommenting the following line will cause a compilation error
        // Student student2 = new Student("Jane Doe", 16, 3.9); // Error: Missing boolean parameter
        
        // ERROR 3: Trying to call a constructor with parameters in wrong order
        // Uncommenting the following line will cause a compilation error or logical error
        // Student student3 = new Student(16, "Jane Doe", true, 3.9); // Error: Incompatible types
    }
}

// Student class with a constructor that has multiple formal parameters
class Student {
    // Instance variables
    private String name;
    private int age;
    private double gpa;
    private boolean isHonorStudent;
    
    /**
     * Constructor with multiple formal parameters
     */
    public Student(String name, int age, double gpa, boolean isHonorStudent) {
        // Using the formal parameters to initialize instance variables
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isHonorStudent = isHonorStudent;
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Honor Student: " + (isHonorStudent ? "Yes" : "No"));
    }
    
    // ERROR 4: Constructor with duplicate parameter names
    // Uncommenting the following will cause a compilation error
    /*
    public Student(String name, int age, double gpa, boolean name) {
        // Error: Duplicate parameter name 'name'
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isHonorStudent = name;
    }
    */
    
    // ERROR 5: Constructor with missing parameter type
    // Uncommenting the following will cause a compilation error
    /*
    public Student(String name, age, double gpa, boolean isHonorStudent) {
        // Error: Missing type for parameter 'age'
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isHonorStudent = isHonorStudent;
    }
    */
}
/**
 * MOD2B2_Exp.java
 * 
 * This program demonstrates the correct usage of constructors as described in
 * MOD-2.B.2: Constructors are used to set the initial state of an object, which
 * should include initial values for all instance variables.
 */
public class MOD2B2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating constructors and initial object state (MOD-2.B.2):\n");
        
        // Create objects using different constructors
        System.out.println("Creating objects with different constructors:");
        
        // Using the main constructor with all parameters
        Student student1 = new Student("John Smith", 16, 11, "A123");
        System.out.println("\nStudent created with full constructor:");
        student1.displayInfo();
        
        // Using a constructor with fewer parameters (overloaded constructor)
        Student student2 = new Student("Emma Johnson", 15, 10);
        System.out.println("\nStudent created with partial constructor:");
        student2.displayInfo();
        
        // Using a constructor with just the name
        Student student3 = new Student("Michael Brown");
        System.out.println("\nStudent created with minimal constructor:");
        student3.displayInfo();
        
        // Demonstrate that all instance variables are initialized
        System.out.println("\nAll instance variables have been initialized with appropriate values");
        System.out.println("Even when not all were specified in the constructor call");
        
        System.out.println("\n--- Key Points about Constructors and Initial State ---");
        System.out.println("1. Constructors initialize the state of a new object");
        System.out.println("2. All instance variables should be initialized in constructors");
        System.out.println("3. Multiple constructors can be provided (constructor overloading)");
        System.out.println("4. Constructors with fewer parameters can call more complete constructors");
        System.out.println("5. Default values should be provided for unspecified instance variables");
    }
}

/**
 * Class that demonstrates proper constructor usage
 */
class Student {
    // Instance variables defining the state of a Student
    private String name;
    private int age;
    private int grade;
    private String studentId;
    private double gpa;
    private boolean enrolled;
    
    // Main constructor that initializes all instance variables
    public Student(String name, int age, int grade, String studentId) {
        // Initialize all instance variables with provided values
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentId = studentId;
        this.gpa = 0.0;      // Default starting GPA
        this.enrolled = true; // Default enrollment status
        
        System.out.println("Created student: " + name + " (ID: " + studentId + ")");
    }
    
    // Overloaded constructor with fewer parameters
    public Student(String name, int age, int grade) {
        // Call the main constructor with a generated ID
        this(name, age, grade, "S" + (1000 + (int)(Math.random() * 9000)));
        System.out.println("Note: Student ID was automatically generated");
    }
    
    // Minimal constructor with just the name
    public Student(String name) {
        // Call the second constructor with default values for age and grade
        this(name, 15, 9);
        System.out.println("Note: Default age (15) and grade (9) were assigned");
    }
    
    // Method to display the current state of the Student object
    public void displayInfo() {
        System.out.println("  Name: " + name);
        System.out.println("  Age: " + age);
        System.out.println("  Grade: " + grade);
        System.out.println("  Student ID: " + studentId);
        System.out.println("  GPA: " + gpa);
        System.out.println("  Enrolled: " + (enrolled ? "Yes" : "No"));
    }
    
    // Other methods to modify the state would go here
    public void updateGpa(double newGpa) {
        if (newGpa >= 0.0 && newGpa <= 4.0) {
            this.gpa = newGpa;
            System.out.println(name + "'s GPA updated to " + gpa);
        } else {
            System.out.println("Invalid GPA value. Must be between 0.0 and 4.0");
        }
    }
    
    public void setEnrollmentStatus(boolean status) {
        this.enrolled = status;
        System.out.println(name + " is now " + (enrolled ? "enrolled" : "not enrolled"));
    }
}
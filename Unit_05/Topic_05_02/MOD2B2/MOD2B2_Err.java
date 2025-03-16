/**
 * MOD2B2_Err.java
 * 
 * This program demonstrates common errors related to constructors as described in
 * MOD-2.B.2: Constructors are used to set the initial state of an object, which
 * should include initial values for all instance variables.
 */
public class MOD2B2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with constructors (MOD-2.B.2):\n");
        
        // ERROR 1: Not initializing all instance variables in constructor
        System.out.println("ERROR 1: Not initializing all instance variables in constructor");
        StudentWithErrors student1 = new StudentWithErrors("John Smith", 16);
        System.out.println("\nStudent created with incomplete constructor:");
        student1.displayInfo(); // Some variables have default values (0, null, false)
        
        // ERROR 2: No validation in constructor
        System.out.println("\nERROR 2: No validation in constructor");
        StudentWithErrors student2 = new StudentWithErrors("Emma Johnson", -5); // Invalid age
        System.out.println("\nStudent created with invalid age:");
        student2.displayInfo();
        
        // ERROR 3: No constructor provided (Java provides default)
        System.out.println("\nERROR 3: No constructor provided (Java provides default)");
        StudentWithNoConstructor student3 = new StudentWithNoConstructor();
        System.out.println("\nStudent created with default constructor:");
        student3.displayInfo(); // All instance variables have default values
        
        // ERROR 4: Inconsistent initialization across multiple constructors
        System.out.println("\nERROR 4: Inconsistent initialization across multiple constructors");
        StudentWithInconsistentConstructors student4 = 
            new StudentWithInconsistentConstructors("Michael Brown");
        System.out.println("\nStudent created with minimal constructor:");
        student4.displayInfo(); // enrolled is not initialized in this constructor
        
        System.out.println("\n--- Common Errors with Constructors ---");
        System.out.println("1. Not initializing all instance variables in constructors");
        System.out.println("2. Not validating constructor parameters");
        System.out.println("3. Relying on default constructor and default values");
        System.out.println("4. Inconsistent initialization across multiple constructors");
        System.out.println("5. Not using 'this' keyword to distinguish instance variables from parameters");
    }
}

/**
 * Class that demonstrates errors with incomplete constructor initialization
 */
class StudentWithErrors {
    // Instance variables
    private String name;
    private int age;
    private int grade;       // Not initialized in constructor
    private String studentId; // Not initialized in constructor
    private double gpa;       // Not initialized in constructor
    private boolean enrolled; // Not initialized in constructor
    
    // ERROR: Constructor doesn't initialize all instance variables
    public StudentWithErrors(String name, int age) {
        // Only initializes some instance variables
        this.name = name;
        this.age = age;
        // ERROR: No validation of parameters
        // age should be validated to be positive
        
        // ERROR: Other instance variables are not initialized
        // They will have default values: 0, null, false
        
        System.out.println("Created student: " + name);
    }
    
    public void displayInfo() {
        System.out.println("  Name: " + name);
        System.out.println("  Age: " + age);
        System.out.println("  Grade: " + grade); // Will be 0 (default for int)
        System.out.println("  Student ID: " + studentId); // Will be null (default for String)
        System.out.println("  GPA: " + gpa); // Will be 0.0 (default for double)
        System.out.println("  Enrolled: " + enrolled); // Will be false (default for boolean)
    }
}

/**
 * Class that demonstrates errors with no constructor provided
 */
class StudentWithNoConstructor {
    // Instance variables
    private String name;    // Will be null
    private int age;        // Will be 0
    private int grade;      // Will be 0
    private String studentId; // Will be null
    private double gpa;     // Will be 0.0
    private boolean enrolled; // Will be false
    
    // ERROR: No constructor provided
    // Java will provide a default no-argument constructor
    // that doesn't initialize any instance variables
    
    public void displayInfo() {
        System.out.println("  Name: " + name);
        System.out.println("  Age: " + age);
        System.out.println("  Grade: " + grade);
        System.out.println("  Student ID: " + studentId);
        System.out.println("  GPA: " + gpa);
        System.out.println("  Enrolled: " + enrolled);
    }
}

/**
 * Class that demonstrates errors with inconsistent constructors
 */
class StudentWithInconsistentConstructors {
    // Instance variables
    private String name;
    private int age;
    private int grade;
    private String studentId;
    private double gpa;
    private boolean enrolled;
    
    // Main constructor
    public StudentWithInconsistentConstructors(String name, int age, int grade, String studentId) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentId = studentId;
        this.gpa = 0.0;
        this.enrolled = true; // Initialized here
        
        System.out.println("Created student: " + name + " (ID: " + studentId + ")");
    }
    
    // ERROR: Inconsistent initialization across constructors
    public StudentWithInconsistentConstructors(String name) {
        // ERROR: Doesn't call the main constructor
        this.name = name;
        this.age = 15;
        this.grade = 9;
        this.studentId = "S" + (1000 + (int)(Math.random() * 9000));
        this.gpa = 0.0;
        // ERROR: enrolled is not initialized in this constructor
        // This creates inconsistent object state
        
        System.out.println("Created student: " + name + " (ID: " + studentId + ")");
    }
    
    public void displayInfo() {
        System.out.println("  Name: " + name);
        System.out.println("  Age: " + age);
        System.out.println("  Grade: " + grade);
        System.out.println("  Student ID: " + studentId);
        System.out.println("  GPA: " + gpa);
        System.out.println("  Enrolled: " + enrolled);
    }
}
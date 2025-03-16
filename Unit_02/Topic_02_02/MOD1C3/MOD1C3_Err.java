/**
 * MOD1C3_Err.java
 * 
 * This program demonstrates common errors when passing actual parameters to constructors.
 * 
 * Knowledge Point: MOD-1.C.3
 * A parameter is a value that is passed into a constructor. These are often referred to as actual parameters.
 */
public class MOD1C3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Actual Parameter Errors in Constructor Calls:\n");
        
        // Declaring variables to use as actual parameters
        String studentName = "Emily Parker";
        int studentAge = 18;
        double studentGpa = 4.0;
        boolean isHonors = true;
        
        // Creating a valid Student object for comparison
        System.out.println("Creating a valid Student object:");
        Student validStudent = new Student(studentName, studentAge, studentGpa, isHonors);
        validStudent.displayInfo();
        
        System.out.println("\nCommon errors with actual parameters:");
        System.out.println("1. Passing incompatible types");
        System.out.println("2. Passing incorrect number of parameters");
        System.out.println("3. Passing parameters in wrong order");
        System.out.println("4. Passing null to primitive types");
        System.out.println("5. Passing uninitialized variables");
        
        // ERROR 1: Passing incompatible types
        // Uncommenting the following line will cause a compilation error
        // Student student1 = new Student(studentName, "eighteen", studentGpa, isHonors); // Error: String cannot be converted to int
        
        // ERROR 2: Passing incorrect number of parameters
        // Uncommenting the following line will cause a compilation error
        // Student student2 = new Student(studentName, studentAge, studentGpa); // Error: Missing boolean parameter
        
        // ERROR 3: Passing parameters in wrong order
        // Uncommenting the following line will cause a compilation error or logical error
        // Student student3 = new Student(studentAge, studentName, isHonors, studentGpa); // Error: Incompatible types
        
        // ERROR 4: Trying to use null for primitive types
        // Uncommenting the following line will cause a compilation error
        // Integer nullAge = null;
        // Student student4 = new Student(studentName, nullAge, studentGpa, isHonors); // Error: Cannot convert from Integer to int
        
        // ERROR 5: Using uninitialized variables
        // Uncommenting the following lines will cause a compilation error
        // String uninitializedName;
        // Student student5 = new Student(uninitializedName, studentAge, studentGpa, isHonors); // Error: Variable might not have been initialized
        
        // ERROR 6: Passing expressions with type errors
        // Uncommenting the following line will cause a compilation error
        // Student student6 = new Student(studentName, studentAge + "years", studentGpa, isHonors); // Error: Cannot add int and String
    }
}

// Student class with a constructor that accepts parameters
class Student {
    // Instance variables
    private String name;
    private int age;
    private double gpa;
    private boolean isHonorStudent;
    
    /**
     * Constructor with parameters
     */
    public Student(String name, int age, double gpa, boolean isHonorStudent) {
        // Using the parameters to initialize instance variables
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isHonorStudent = isHonorStudent;
        
        System.out.println("Constructor called with actual parameters:");
        System.out.println("- name: " + name);
        System.out.println("- age: " + age);
        System.out.println("- gpa: " + gpa);
        System.out.println("- isHonorStudent: " + isHonorStudent);
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Honor Student: " + (isHonorStudent ? "Yes" : "No"));
    }
}
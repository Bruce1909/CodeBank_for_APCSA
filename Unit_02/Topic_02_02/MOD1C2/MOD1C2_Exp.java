/**
 * MOD1C2_Exp.java
 * 
 * This program demonstrates the correct usage of parameter lists in constructor headers.
 * 
 * Knowledge Point: MOD-1.C.2
 * The parameter list, in the header of a constructor, lists the types of the values
 * that are passed and their variable names. These are often referred to as formal parameters.
 */
public class MOD1C2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Constructor Parameter Lists:\n");
        
        // Creating a Student object with various parameters
        System.out.println("Creating a Student with multiple parameters:");
        Student student = new Student("Alice Johnson", 16, 3.85, true);
        student.displayInfo();
        
        System.out.println("\nExamining the formal parameters in the constructor header:");
        System.out.println("1. String name - formal parameter for student's name");
        System.out.println("2. int age - formal parameter for student's age");
        System.out.println("3. double gpa - formal parameter for student's GPA");
        System.out.println("4. boolean isHonorStudent - formal parameter for honor status");
        
        System.out.println("\nFormal parameters:");
        System.out.println("- Are declared in the constructor header");
        System.out.println("- Include both type and variable name");
        System.out.println("- Are used within the constructor body");
        System.out.println("- Receive copies of the values passed when the constructor is called");
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
     * 
     * @param name - formal parameter for student's name (String type)
     * @param age - formal parameter for student's age (int type)
     * @param gpa - formal parameter for student's GPA (double type)
     * @param isHonorStudent - formal parameter for honor status (boolean type)
     */
    public Student(String name, int age, double gpa, boolean isHonorStudent) {
        // Using the formal parameters to initialize instance variables
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isHonorStudent = isHonorStudent;
        
        // Displaying the formal parameters received
        System.out.println("Constructor called with formal parameters:");
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
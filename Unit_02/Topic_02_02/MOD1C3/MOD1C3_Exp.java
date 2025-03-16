/**
 * MOD1C3_Exp.java
 * 
 * This program demonstrates the correct usage of actual parameters passed to constructors.
 * 
 * Knowledge Point: MOD-1.C.3
 * A parameter is a value that is passed into a constructor. These are often referred to as actual parameters.
 */
public class MOD1C3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Actual Parameters in Constructor Calls:\n");
        
        // Declaring variables to use as actual parameters
        String studentName = "Emily Parker";
        int studentAge = 18;
        double studentGpa = 4.0;
        boolean isHonors = true;
        
        System.out.println("Variables defined for actual parameters:");
        System.out.println("studentName = " + studentName);
        System.out.println("studentAge = " + studentAge);
        System.out.println("studentGpa = " + studentGpa);
        System.out.println("isHonors = " + isHonors);
        
        // Example 1: Using literal values as actual parameters
        System.out.println("\nExample 1: Using literal values as actual parameters");
        Student student1 = new Student("David Wilson", 17, 3.75, false);
        student1.displayInfo();
        
        // Example 2: Using variables as actual parameters
        System.out.println("\nExample 2: Using variables as actual parameters");
        Student student2 = new Student(studentName, studentAge, studentGpa, isHonors);
        student2.displayInfo();
        
        // Example 3: Using expressions as actual parameters
        System.out.println("\nExample 3: Using expressions as actual parameters");
        Student student3 = new Student(studentName + " Jr.", studentAge - 2, studentGpa - 0.5, !isHonors);
        student3.displayInfo();
        
        // Example 4: Using method return values as actual parameters
        System.out.println("\nExample 4: Using method return values as actual parameters");
        Student student4 = new Student(getDefaultName(), getDefaultAge(), getDefaultGpa(), getDefaultHonorStatus());
        student4.displayInfo();
        
        System.out.println("\nActual parameters:");
        System.out.println("- Are the values passed to a constructor when it is called");
        System.out.println("- Can be literals, variables, expressions, or method return values");
        System.out.println("- Must be compatible with the formal parameter types in the constructor header");
        System.out.println("- Are copied to the formal parameters when the constructor is called");
    }
    
    // Helper methods to demonstrate using method return values as actual parameters
    public static String getDefaultName() {
        return "Default Student";
    }
    
    public static int getDefaultAge() {
        return 15;
    }
    
    public static double getDefaultGpa() {
        return 3.0;
    }
    
    public static boolean getDefaultHonorStatus() {
        return false;
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
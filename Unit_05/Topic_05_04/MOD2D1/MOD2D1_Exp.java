/**
 * MOD2D1_Exp.java
 * This program demonstrates accessor methods that allow other objects to obtain
 * the value of instance variables or static variables (MOD-2.D.1).
 * 
 * @author AP CSA
 */
public class MOD2D1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating accessor methods in Java:\n");
        
        // Example 1: Accessing instance variables through accessor methods
        System.out.println("Example 1: Accessing instance variables");
        Student student = new Student("John Doe", 16, 3.85);
        
        // Using accessor methods to get instance variable values
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());
        System.out.println("Student GPA: " + student.getGPA());
        System.out.println();
        
        // Example 2: Accessing static variables through accessor methods
        System.out.println("Example 2: Accessing static variables");
        System.out.println("School name: " + School.getSchoolName());
        System.out.println("School year: " + School.getSchoolYear());
        System.out.println();
        
        // Example 3: Using accessor methods with different objects
        System.out.println("Example 3: Using accessor methods with different objects");
        Student student1 = new Student("Alice Smith", 17, 4.0);
        Student student2 = new Student("Bob Johnson", 16, 3.7);
        
        System.out.println("Student 1 name: " + student1.getName());
        System.out.println("Student 2 name: " + student2.getName());
        System.out.println();
        
        System.out.println("Key points about accessor methods:");
        System.out.println("- Accessor methods provide controlled access to private data");
        System.out.println("- They typically start with 'get' followed by the variable name");
        System.out.println("- They return the value of an instance or static variable");
        System.out.println("- They allow access to data without exposing implementation details");
        System.out.println("- They help maintain encapsulation in object-oriented programming");
    }
}

/**
 * A class representing a student with accessor methods for instance variables.
 */
class Student {
    // Private instance variables
    private String name;
    private int age;
    private double gpa;
    
    /**
     * Constructor to initialize student data.
     */
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    /**
     * Accessor method for the name instance variable.
     * 
     * @return the student's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Accessor method for the age instance variable.
     * 
     * @return the student's age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Accessor method for the gpa instance variable.
     * 
     * @return the student's GPA
     */
    public double getGPA() {
        return gpa;
    }
}

/**
 * A class with static variables and accessor methods for those variables.
 */
class School {
    // Private static variables
    private static String schoolName = "Central High School";
    private static int schoolYear = 2023;
    
    /**
     * Accessor method for the schoolName static variable.
     * 
     * @return the school name
     */
    public static String getSchoolName() {
        return schoolName;
    }
    
    /**
     * Accessor method for the schoolYear static variable.
     * 
     * @return the current school year
     */
    public static int getSchoolYear() {
        return schoolYear;
    }
}
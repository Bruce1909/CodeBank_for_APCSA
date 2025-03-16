/**
 * MOD2A4_Exp.java
 * 
 * This program demonstrates the correct usage of private instance variables
 * as described in MOD-2.A.4: Access to attributes should be kept internal to the class.
 * Therefore, instance variables are designated as private.
 */
public class MOD2A4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating private instance variables (MOD-2.A.4):\n");
        
        // Create an instance of Student
        Student student = new Student("John Doe", 17, 3.85);
        
        // Access data through public methods (correct approach)
        System.out.println("Accessing data through public methods (correct approach):");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGpa());
        
        // Update data through public methods
        System.out.println("\nUpdating data through public methods:");
        student.setAge(18);
        student.setGpa(3.92);
        
        // Display updated information
        System.out.println("\nAfter update:");
        student.displayInfo();
        
        // Cannot access private instance variables directly
        System.out.println("\nAttempting to access private instance variables directly (commented out):");
        // System.out.println(student.name);  // Error: name has private access
        // System.out.println(student.age);   // Error: age has private access
        // System.out.println(student.gpa);   // Error: gpa has private access
        
        System.out.println("\n--- Key Points about Private Instance Variables ---");
        System.out.println("1. Instance variables should be declared private");
        System.out.println("2. Access to instance variables should be through public methods");
        System.out.println("3. This approach maintains encapsulation");
        System.out.println("4. Private instance variables can only be accessed within the class");
        System.out.println("5. Getter and setter methods provide controlled access to private data");
    }
}

/**
 * Class that demonstrates proper use of private instance variables
 */
class Student {
    // Private instance variables - only accessible within this class
    private String name;
    private int age;
    private double gpa;
    
    // Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    // Getter methods - provide read access to private data
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    // Setter methods - provide write access to private data with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty");
        }
    }
    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age must be positive");
        }
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Error: GPA must be between 0.0 and 4.0");
        }
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
    
    // Private helper method - only accessible within this class
    private boolean isValidGpa(double gpa) {
        return gpa >= 0.0 && gpa <= 4.0;
    }
}
/**
 * MOD2A4_Err.java
 * 
 * This program demonstrates common errors related to private instance variables
 * as described in MOD-2.A.4: Access to attributes should be kept internal to the class.
 * Therefore, instance variables are designated as private.
 */
public class MOD2A4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with private instance variables (MOD-2.A.4):\n");
        
        // Create an instance of StudentWithErrors
        StudentWithErrors student = new StudentWithErrors("Jane Smith", 16, 3.75);
        
        // ERROR 1: Directly accessing public instance variables
        System.out.println("Error 1: Directly accessing public instance variables:");
        System.out.println("Direct access to name: " + student.name); // Should be private
        System.out.println("Direct access to age: " + student.age);   // Should be private
        System.out.println("Direct access to gpa: " + student.gpa);   // Should be private
        
        // ERROR 2: Directly modifying public instance variables
        System.out.println("\nError 2: Directly modifying public instance variables:");
        student.name = "Modified Name"; // Should use setter method
        student.age = -5;               // Invalid age, no validation
        student.gpa = 5.0;              // Invalid GPA, no validation
        
        // Display information after direct modification
        System.out.println("\nAfter direct modification:");
        student.displayInfo();
        
        // ERROR 3: No data validation when modifying attributes
        System.out.println("\nError 3: No data validation when modifying attributes:");
        System.out.println("Age was set to a negative value: " + student.age);
        System.out.println("GPA was set to a value greater than 4.0: " + student.gpa);
        
        // Create an instance of DataAccessor to demonstrate improper access
        System.out.println("\nDemonstrating improper access from another class (DataAccessor):");
        DataAccessor accessor = new DataAccessor();
        accessor.accessAndModifyData(student);
        
        System.out.println("\n--- Common Errors with Private Instance Variables ---");
        System.out.println("1. Making instance variables public instead of private");
        System.out.println("2. Allowing direct access to instance variables from outside the class");
        System.out.println("3. Allowing direct modification of instance variables without validation");
        System.out.println("4. Not providing proper getter and setter methods");
        System.out.println("5. Breaking encapsulation by exposing internal data");
    }
}

/**
 * Class that demonstrates errors in using instance variables
 */
class StudentWithErrors {
    // ERROR: Instance variables should be private, not public
    public String name; // Should be private
    public int age;     // Should be private
    public double gpa;  // Should be private
    
    // Constructor
    public StudentWithErrors(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
    
    // ERROR: Missing proper getter and setter methods with validation
    // Should have methods like:
    // public String getName() { return name; }
    // public void setAge(int age) { if (age > 0) this.age = age; }
    // etc.
}

/**
 * Class that demonstrates improper access to another class's data
 */
class DataAccessor {
    public void accessAndModifyData(StudentWithErrors student) {
        // ERROR: Directly accessing and modifying another class's data
        System.out.println("DataAccessor improperly accessing data:");
        System.out.println("Direct access to name: " + student.name);
        System.out.println("Direct access to age: " + student.age);
        System.out.println("Direct access to gpa: " + student.gpa);
        
        System.out.println("\nDataAccessor improperly modifying data:");
        student.name = "Changed by external class";
        student.age = 99;
        student.gpa = 1.5;
        
        System.out.println("After external modification:");
        student.displayInfo();
        
        System.out.println("\nThis demonstrates how lack of encapsulation");
        System.out.println("allows external classes to directly manipulate internal data.");
    }
}
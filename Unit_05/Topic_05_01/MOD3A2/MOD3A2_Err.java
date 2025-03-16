/**
 * MOD3A2_Err.java
 * 
 * This program demonstrates common errors in MOD-3.A.2: When designing a class, programmers make decisions
 * about what data to make accessible and modifiable from an external class.
 * Data can be either accessible or modifiable, or it can be both or neither.
 */
public class MOD3A2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors in data accessibility and modifiability decisions (MOD-3.A.2):\n");
        
        // Create an instance of StudentWithErrors with poorly designed data accessibility
        StudentWithErrors student = new StudentWithErrors("John Smith", "S12345", 3.85);
        
        System.out.println("Student Information:");
        
        // ERROR 1: Directly accessing and modifying data that should be private
        System.out.println("\nERROR 1: Directly accessing and modifying data that should be private:");
        System.out.println("Name (before): " + student.name);
        student.name = "John A. Smith";  // Direct modification without any control
        System.out.println("Name (after): " + student.name);
        
        // ERROR 2: Modifying data that should be immutable
        System.out.println("\nERROR 2: Modifying data that should be immutable:");
        System.out.println("Student ID (before): " + student.studentId);
        student.studentId = "S67890";  // Modifying what should be immutable
        System.out.println("Student ID (after): " + student.studentId);
        
        // ERROR 3: Setting invalid data without validation
        System.out.println("\nERROR 3: Setting invalid data without validation:");
        System.out.println("GPA (before): " + student.gpa);
        student.gpa = 5.0;  // Setting an invalid GPA value
        System.out.println("GPA (after): " + student.gpa);
        
        // ERROR 4: Directly accessing and modifying internal implementation details
        System.out.println("\nERROR 4: Directly accessing and modifying internal implementation details:");
        System.out.println("Last Updated (before): " + student.lastUpdated);
        student.lastUpdated = new java.util.Date(0);  // Setting to epoch time
        System.out.println("Last Updated (after): " + student.lastUpdated);
        
        // ERROR 5: Inconsistent state due to lack of encapsulation
        System.out.println("\nERROR 5: Inconsistent state due to lack of encapsulation:");
        student.updateGpa(3.95);  // Using method to update GPA
        System.out.println("GPA updated via method: " + student.gpa);
        System.out.println("But lastUpdated wasn't automatically updated: " + student.lastUpdated);
        
        System.out.println("\n--- Problems with Poor Data Accessibility Design ---");
        System.out.println("1. Data that should be private is directly accessible");
        System.out.println("2. Data that should be immutable can be modified");
        System.out.println("3. Invalid data can be set without validation");
        System.out.println("4. Internal implementation details are exposed");
        System.out.println("5. Object can be left in an inconsistent state");
        System.out.println("6. Business rules cannot be enforced");
    }
}

/**
 * Class that demonstrates poor decisions about data accessibility and modifiability
 */
class StudentWithErrors {
    // ERROR: Public instance variables expose all data
    public String name;
    public String studentId;  // Should be immutable after creation
    public double gpa;        // Should have validation
    public java.util.Date lastUpdated;  // Should be internal only
    
    // Constructor
    public StudentWithErrors(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;  // No validation
        this.lastUpdated = new java.util.Date();
    }
    
    // ERROR: Inconsistent update method that doesn't maintain object integrity
    public void updateGpa(double gpa) {
        this.gpa = gpa;  // Updates GPA but doesn't update lastUpdated
        // Should also update lastUpdated here
    }
    
    // ERROR: Method that exposes internal implementation details
    public java.util.Date getLastUpdated() {
        return lastUpdated;  // Returns reference to mutable object
    }
    
    // ERROR: Method that allows bypassing validation
    public void setAllData(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;  // Should not be modifiable
        this.gpa = gpa;  // No validation
    }
}
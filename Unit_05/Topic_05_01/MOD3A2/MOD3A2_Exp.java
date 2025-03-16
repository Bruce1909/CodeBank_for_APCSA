/**
 * MOD3A2_Exp.java
 * 
 * This program demonstrates MOD-3.A.2: When designing a class, programmers make decisions
 * about what data to make accessible and modifiable from an external class.
 * Data can be either accessible or modifiable, or it can be both or neither.
 */
public class MOD3A2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating data accessibility and modifiability decisions (MOD-3.A.2):\n");
        
        // Create an instance of Student with different levels of data accessibility
        Student student = new Student("John Smith", "S12345", 3.85);
        
        System.out.println("Student Information:");
        
        // Accessible and modifiable data (both getter and setter)
        System.out.println("\n1. Accessible and Modifiable Data:");
        System.out.println("Name (before): " + student.getName());
        student.setName("John A. Smith");
        System.out.println("Name (after): " + student.getName());
        
        // Accessible but not modifiable data (getter but no setter)
        System.out.println("\n2. Accessible but Not Modifiable Data:");
        System.out.println("Student ID: " + student.getStudentId());
        // student.setStudentId("S67890");  // Error: No setter method available
        System.out.println("(Student ID cannot be modified after creation)");
        
        // Modifiable but with restricted access (setter with validation)
        System.out.println("\n3. Modifiable with Restricted Access:");
        System.out.println("GPA (before): " + student.getGpa());
        System.out.println("Attempting to set invalid GPA (5.0)...");
        boolean success = student.setGpa(5.0);
        System.out.println("Update successful? " + success);
        System.out.println("GPA (after invalid attempt): " + student.getGpa());
        
        System.out.println("\nAttempting to set valid GPA (3.95)...");
        success = student.setGpa(3.95);
        System.out.println("Update successful? " + success);
        System.out.println("GPA (after valid attempt): " + student.getGpa());
        
        // Neither accessible nor modifiable directly (internal data)
        System.out.println("\n4. Neither Accessible nor Modifiable Data:");
        System.out.println("Last Updated: " + student.getLastUpdatedFormatted());
        // student.lastUpdated = new java.util.Date();  // Error: lastUpdated has private access
        // System.out.println(student.lastUpdated);     // Error: lastUpdated has private access
        
        System.out.println("\n--- Key Points about Data Accessibility and Modifiability ---");
        System.out.println("1. Some data should be both accessible and modifiable (e.g., name)");
        System.out.println("2. Some data should be accessible but not modifiable (e.g., ID)");
        System.out.println("3. Some data should be modifiable with validation (e.g., GPA)");
        System.out.println("4. Some data should be neither directly accessible nor modifiable (e.g., internal timestamps)");
        System.out.println("5. These decisions are part of the class design process");
    }
}

/**
 * Class that demonstrates different levels of data accessibility and modifiability
 */
class Student {
    // Private instance variables
    private String name;
    private String studentId;  // Immutable after creation
    private double gpa;
    private java.util.Date lastUpdated;  // Internal use only
    
    // Constructor
    public Student(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = (gpa >= 0.0 && gpa <= 4.0) ? gpa : 0.0;
        this.lastUpdated = new java.util.Date();
    }
    
    // Accessible and modifiable: both getter and setter
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
        this.lastUpdated = new java.util.Date();
    }
    
    // Accessible but not modifiable: getter but no setter
    public String getStudentId() {
        return studentId;
    }
    
    // Modifiable with validation: getter and conditional setter
    public double getGpa() {
        return gpa;
    }
    
    public boolean setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
            this.lastUpdated = new java.util.Date();
            return true;
        }
        return false;
    }
    
    // Neither directly accessible nor modifiable: internal data with formatted access
    public String getLastUpdatedFormatted() {
        return lastUpdated.toString();
    }
    
    // Private helper method - not accessible from outside
    private void updateInternalRecords() {
        // Implementation details hidden from users
        System.out.println("This method is private and not accessible from outside");
    }
}
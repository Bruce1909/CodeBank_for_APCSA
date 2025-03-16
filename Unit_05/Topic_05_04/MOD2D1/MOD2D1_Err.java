/**
 * MOD2D1_Err.java
 * This program demonstrates common errors related to accessor methods (MOD-2.D.1).
 * 
 * @author AP CSA
 */
public class MOD2D1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to accessor methods:\n");
        
        // ERROR 1: Trying to access private instance variables directly
        System.out.println("ERROR 1: Trying to access private instance variables directly");
        StudentWithErrors student = new StudentWithErrors("John Doe", 16, 3.85);
        
        System.out.println("The following lines would cause compilation errors if uncommented:");
        // System.out.println("Student name: " + student.name); // Error: name has private access
        // System.out.println("Student age: " + student.age);   // Error: age has private access
        // System.out.println("Student GPA: " + student.gpa);   // Error: gpa has private access
        System.out.println("Private instance variables cannot be accessed directly from outside the class\n");
        
        // ERROR 2: Missing accessor methods
        System.out.println("ERROR 2: Missing accessor methods");
        System.out.println("The StudentWithErrors class is missing accessor methods for some variables");
        System.out.println("We can only access name: " + student.getName());
        System.out.println("But we cannot access age or GPA because accessor methods are missing\n");
        
        // ERROR 3: Trying to access private static variables directly
        System.out.println("ERROR 3: Trying to access private static variables directly");
        System.out.println("The following line would cause a compilation error if uncommented:");
        // System.out.println("School year: " + SchoolWithErrors.schoolYear); // Error: schoolYear has private access
        System.out.println("Private static variables also need accessor methods\n");
        
        // ERROR 4: Accessor method modifying the data
        System.out.println("ERROR 4: Accessor method modifying the data");
        System.out.println("Before calling getBadGPA(): " + student.getGpaStatus());
        student.getBadGPA(); // This accessor method incorrectly modifies the data
        System.out.println("After calling getBadGPA(): " + student.getGpaStatus());
        System.out.println("Accessor methods should not modify the data they access\n");
        
        // ERROR 5: Accessor method returning a reference to a mutable object
        System.out.println("ERROR 5: Accessor method returning a reference to a mutable object");
        System.out.println("Original grades: " + student.getGradesDescription());
        
        // Getting direct access to the internal array and modifying it
        int[] grades = student.getGradesMutable();
        grades[0] = 0; // Modifying the internal array directly
        
        System.out.println("After external modification: " + student.getGradesDescription());
        System.out.println("Accessor methods should return copies of mutable objects to prevent external modification\n");
        
        System.out.println("Key points about accessor method errors:");
        System.out.println("- Private variables cannot be accessed directly from outside the class");
        System.out.println("- Classes should provide accessor methods for all data that needs to be accessed");
        System.out.println("- Accessor methods should not modify the data they access");
        System.out.println("- Accessor methods should protect mutable objects from external modification");
        System.out.println("- Proper accessor methods help maintain encapsulation");
    }
}

/**
 * A class with errors related to accessor methods.
 */
class StudentWithErrors {
    // Private instance variables
    private String name;
    private int age;
    private double gpa;
    private int[] grades = {90, 85, 92, 88, 95};
    
    /**
     * Constructor to initialize student data.
     */
    public StudentWithErrors(String name, int age, double gpa) {
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
    
    // ERROR: Missing accessor methods for age and gpa
    // public int getAge() { return age; }
    // public double getGPA() { return gpa; }
    
    /**
     * ERROR: An accessor method that incorrectly modifies the data.
     * Accessor methods should only access data, not modify it.
     * 
     * @return the student's GPA
     */
    public double getBadGPA() {
        // This is incorrect - an accessor method should not modify the data
        gpa = gpa - 0.1; // Incorrectly reducing the GPA
        return gpa;
    }
    
    /**
     * Helper method to check GPA status.
     * 
     * @return a string describing the GPA status
     */
    public String getGpaStatus() {
        return "Current GPA: " + gpa;
    }
    
    /**
     * ERROR: An accessor method that returns a reference to a mutable object.
     * This allows external code to modify the internal state of the object.
     * 
     * @return a reference to the internal grades array
     */
    public int[] getGradesMutable() {
        // This is incorrect - it returns a reference to the internal array
        return grades; // Should return a copy instead: return Arrays.copyOf(grades, grades.length);
    }
    
    /**
     * Helper method to get a description of the grades.
     * 
     * @return a string describing the grades
     */
    public String getGradesDescription() {
        StringBuilder sb = new StringBuilder("Grades: [");
        for (int i = 0; i < grades.length; i++) {
            sb.append(grades[i]);
            if (i < grades.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

/**
 * A class with errors related to static variable access.
 */
class SchoolWithErrors {
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
    
    // ERROR: Missing accessor method for schoolYear
    // public static int getSchoolYear() { return schoolYear; }
}
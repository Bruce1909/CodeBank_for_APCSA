/**
 * MOD-2.F.5 Example
 * 
 * This program demonstrates that when an actual parameter is a reference to an object,
 * the formal parameter is initialized with a copy of that reference, not a copy of the object.
 * If the reference is to a mutable object, the method or constructor can use this reference
 * to alter the state of the object.
 */
public class MOD2F5_Exp {
    
    /**
     * This method demonstrates how a method can modify a mutable object
     * through a parameter reference.
     * 
     * @param list An array of integers (mutable object)
     */
    public static void modifyArray(int[] list) {
        System.out.println("Inside method, before modification");
        
        // Modify the object through the reference parameter
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] * 2; // Double each element
        }
        
        System.out.println("Inside method, after modification");
        // The original object is modified because we have a reference to it
    }
    
    /**
     * This method demonstrates modifying a Student object through a parameter reference.
     * 
     * @param student A Student object (mutable)
     */
    public static void updateStudentGrade(Student student) {
        System.out.println("Inside method, before modification: " + student);
        
        // Modify the object through the reference parameter
        student.setGrade(student.getGrade() + 10); // Increase grade by 10
        
        System.out.println("Inside method, after modification: " + student);
        // The original object is modified because we have a reference to it
    }
    
    /**
     * This method demonstrates that reassigning the parameter reference
     * does not affect the original reference.
     * 
     * @param student A Student object
     */
    public static void reassignReference(Student student) {
        System.out.println("Inside method, before reassignment: " + student);
        
        // Reassign the parameter to a new object
        student = new Student("New Student", 100);
        
        System.out.println("Inside method, after reassignment: " + student);
        // The original reference is not affected by this reassignment
    }
    
    public static void main(String[] args) {
        // Demonstrate modifying an array through a parameter reference
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Original array before method call:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        modifyArray(numbers);
        
        System.out.println("Original array after method call:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nNotice that the original array has been modified!\n");
        
        // Demonstrate modifying a Student object through a parameter reference
        Student alice = new Student("Alice", 85);
        System.out.println("Original student before method call: " + alice);
        
        updateStudentGrade(alice);
        
        System.out.println("Original student after method call: " + alice);
        System.out.println("Notice that the original student object has been modified!\n");
        
        // Demonstrate that reassigning the parameter reference doesn't affect the original
        Student bob = new Student("Bob", 90);
        System.out.println("Original student before method call: " + bob);
        
        reassignReference(bob);
        
        System.out.println("Original student after method call: " + bob);
        System.out.println("Notice that the original reference is unchanged despite reassignment in the method!");
    }
}

/**
 * A simple Student class for demonstration
 */
class Student {
    private String name;
    private int grade;
    
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    
    public String getName() {
        return name;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    @Override
    public String toString() {
        return name + " (Grade: " + grade + ")";
    }
}
/**
 * MOD2D4_Exp.java
 * This program demonstrates how non-void methods return a copy of a reference
 * when the return expression is a reference to an object (MOD-2.D.4).
 * 
 * @author AP CSA
 */
public class MOD2D4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating return of object references in Java:\n");
        
        // Example 1: Returning a reference to an array
        System.out.println("Example 1: Returning a reference to an array");
        DataContainer container = new DataContainer();
        
        int[] numbers = container.getNumbers();
        System.out.println("Original array: " + arrayToString(numbers));
        
        // Modifying the array through the returned reference
        numbers[0] = 100;
        
        System.out.println("Modified array: " + arrayToString(numbers));
        System.out.println("Array in container: " + arrayToString(container.getNumbers()));
        System.out.println("The original array was modified because a reference was returned\n");
        
        // Example 2: Returning a reference to a mutable object
        System.out.println("Example 2: Returning a reference to a mutable object");
        Student student = container.getStudent();
        System.out.println("Original student: " + student);
        
        // Modifying the Student object through the returned reference
        student.setGrade("A+");
        
        System.out.println("Modified student: " + student);
        System.out.println("Student in container: " + container.getStudent());
        System.out.println("The original Student object was modified because a reference was returned\n");
        
        // Example 3: Returning a defensive copy to prevent modification
        System.out.println("Example 3: Returning a defensive copy to prevent modification");
        int[] safeNumbers = container.getNumbersCopy();
        System.out.println("Original safe array: " + arrayToString(safeNumbers));
        
        // Modifying the array copy
        safeNumbers[0] = 999;
        
        System.out.println("Modified copy: " + arrayToString(safeNumbers));
        System.out.println("Array in container: " + arrayToString(container.getNumbersCopy()));
        System.out.println("The original array was not modified because a copy was returned\n");
        
        System.out.println("Key points about returning object references:");
        System.out.println("- When returning an object reference, a copy of the reference is returned");
        System.out.println("- The copy and the original reference point to the same object");
        System.out.println("- Changes to the object through either reference affect the same object");
        System.out.println("- To prevent modification, return a defensive copy of the object");
        System.out.println("- Understanding reference semantics is crucial for proper encapsulation");
    }
    
    /**
     * Converts an array to a string representation.
     * 
     * @param array the array to convert
     * @return a string representation of the array
     */
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

/**
 * A class representing a student.
 */
class Student {
    private String name;
    private String grade;
    
    /**
     * Constructor to initialize student data.
     */
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
    
    /**
     * Sets the student's grade.
     * 
     * @param grade the new grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    /**
     * Returns a string representation of the student.
     * 
     * @return a string representation of the student
     */
    @Override
    public String toString() {
        return name + " (Grade: " + grade + ")";
    }
}

/**
 * A class that demonstrates returning object references.
 */
class DataContainer {
    private int[] numbers = {1, 2, 3, 4, 5};
    private Student student = new Student("Alice", "A");
    
    /**
     * Returns a reference to the numbers array.
     * This allows the caller to modify the original array.
     * 
     * @return a reference to the numbers array
     */
    public int[] getNumbers() {
        return numbers; // Returns a copy of the reference to the array
    }
    
    /**
     * Returns a reference to the Student object.
     * This allows the caller to modify the original Student object.
     * 
     * @return a reference to the Student object
     */
    public Student getStudent() {
        return student; // Returns a copy of the reference to the Student object
    }
    
    /**
     * Returns a defensive copy of the numbers array.
     * This prevents the caller from modifying the original array.
     * 
     * @return a copy of the numbers array
     */
    public int[] getNumbersCopy() {
        int[] copy = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }
        return copy; // Returns a reference to a new array with the same values
    }
}
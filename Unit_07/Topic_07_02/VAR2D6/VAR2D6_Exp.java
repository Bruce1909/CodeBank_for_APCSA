/**
 * VAR-2.D.6 Example
 * The ArrayList class is part of the java.util package. An import statement can be used
 * to make this class available for use in the program.
 * 
 * This program demonstrates how to properly import and use the ArrayList class.
 */
// Import the ArrayList class from the java.util package
import java.util.ArrayList;

// Alternative: Import all classes from java.util
// import java.util.*;

public class VAR2D6_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating proper import and use of ArrayList:\n");
        
        // Create an ArrayList using the imported class
        System.out.println("1. Creating an ArrayList with explicit import:");
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Java");
        list1.add("Programming");
        System.out.println("list1: " + list1);
        
        // Demonstrate that ArrayList is now available throughout the program
        System.out.println("\n2. Using ArrayList in a method:");
        ArrayList<Integer> numbers = createNumberList(5);
        System.out.println("Numbers list: " + numbers);
        
        // Demonstrate using other classes from java.util
        System.out.println("\n3. Using other classes from java.util:");
        
        // java.util.Date is also in the java.util package
        // If we had used import java.util.*, we wouldn't need to use the fully qualified name
        java.util.Date today = new java.util.Date();
        System.out.println("Today's date: " + today);
        
        // Demonstrate using ArrayList with a custom class
        System.out.println("\n4. Using ArrayList with a custom class:");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Alice", 95));
        students.add(new Student("Bob", 87));
        students.add(new Student("Charlie", 91));
        
        System.out.println("Students list:");
        for (Student student : students) {
            System.out.println("  " + student);
        }
        
        // Demonstrate ArrayList methods
        System.out.println("\n5. Demonstrating ArrayList methods:");
        System.out.println("Number of students: " + students.size());
        System.out.println("First student: " + students.get(0));
        
        // Remove a student
        Student removed = students.remove(1); // Removes Bob
        System.out.println("Removed student: " + removed);
        System.out.println("Students after removal: " + students);
        
        // Add a student at a specific position
        students.add(1, new Student("David", 88));
        System.out.println("Students after adding David at position 1: " + students);
        
        // Replace a student
        Student oldStudent = students.set(2, new Student("Eve", 94));
        System.out.println("Replaced student: " + oldStudent);
        System.out.println("Students after replacement: " + students);
    }
    
    // Method that creates and returns an ArrayList of Integers
    public static ArrayList<Integer> createNumberList(int count) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= count; i++) {
            numbers.add(i * 10);
        }
        return numbers;
    }
}

// A simple Student class for demonstration
class Student {
    private String name;
    private int score;
    
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', score=" + score + "}";
    }
}
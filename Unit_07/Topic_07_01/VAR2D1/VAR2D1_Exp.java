/**
 * VAR-2.D.1 Example
 * An ArrayList object is mutable and contains object references.
 * 
 * This program demonstrates how ArrayList objects are mutable (can be changed)
 * and how they store references to objects rather than the objects themselves.
 */
import java.util.ArrayList;

public class VAR2D1_Exp {
    public static void main(String[] args) {
        // Create an ArrayList of String objects
        ArrayList<String> fruits = new ArrayList<String>();
        
        System.out.println("Demonstrating ArrayList mutability:");
        
        // Adding elements to the ArrayList (mutating it)
        System.out.println("\nAdding elements to ArrayList:");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("ArrayList after adding: " + fruits);
        
        // Removing an element (mutating it)
        System.out.println("\nRemoving an element from ArrayList:");
        fruits.remove(1); // Removes "Banana"
        System.out.println("ArrayList after removing index 1: " + fruits);
        
        // Changing an element (mutating it)
        System.out.println("\nChanging an element in ArrayList:");
        fruits.set(1, "Blueberry"); // Changes "Cherry" to "Blueberry"
        System.out.println("ArrayList after changing index 1: " + fruits);
        
        // Demonstrating that ArrayList contains object references
        System.out.println("\nDemonstrating object references in ArrayList:");
        
        // Create a Student class object
        Student student1 = new Student("Alice", 15);
        Student student2 = new Student("Bob", 16);
        
        // Create an ArrayList of Student objects
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        
        // Print the initial list
        System.out.println("Initial students list:");
        for (Student s : students) {
            System.out.println(s);
        }
        
        // Modify the original student1 object
        System.out.println("\nModifying student1 object directly:");
        student1.setAge(16);
        
        // The change is reflected in the ArrayList because it stores a reference
        System.out.println("\nStudents list after modifying student1:");
        for (Student s : students) {
            System.out.println(s);
        }
        
        // Demonstrate that removing from ArrayList doesn't affect the original object
        System.out.println("\nRemoving student1 from ArrayList:");
        students.remove(0);
        System.out.println("ArrayList size after removal: " + students.size());
        System.out.println("But student1 object still exists: " + student1);
    }
}

// A simple Student class to demonstrate object references
class Student {
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
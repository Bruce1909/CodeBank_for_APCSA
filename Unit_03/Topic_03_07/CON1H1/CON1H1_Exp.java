/**
 * CON-1.H.1: Two object references are considered aliases when they both reference the same object.
 *
 * This example demonstrates the concept of object aliases in Java.
 * When two references point to the same object, they are considered aliases.
 * Changes made through one reference will affect the object accessed through the other reference.
 */
public class CON1H1_Exp {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Alice", 15);
        
        // Create another reference to the same Student object
        Student student2 = student1; // student2 is now an alias of student1
        
        // Display initial values
        System.out.println("Initial values:");
        System.out.println("student1: " + student1.getName() + ", " + student1.getAge());
        System.out.println("student2: " + student2.getName() + ", " + student2.getAge());
        
        // Modify the object through student2 reference
        student2.setName("Alice Smith");
        student2.setAge(16);
        
        // Display values after modification
        System.out.println("\nAfter modifying through student2:");
        System.out.println("student1: " + student1.getName() + ", " + student1.getAge());
        System.out.println("student2: " + student2.getName() + ", " + student2.getAge());
        
        // Demonstrate that both references point to the same object
        System.out.println("\nAre student1 and student2 aliases (reference the same object)? " + 
                          (student1 == student2));
        
        // Create a new Student object with the same values
        Student student3 = new Student("Alice Smith", 16);
        
        // Demonstrate that student3 is a different object, not an alias
        System.out.println("\nAre student1 and student3 aliases? " + 
                          (student1 == student3));
    }
}

/**
 * A simple Student class to demonstrate object references
 */
class Student {
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
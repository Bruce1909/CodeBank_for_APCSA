/**
 * CON-1.H.1: Two object references are considered aliases when they both reference the same object.
 *
 * This example demonstrates common errors when working with object aliases in Java.
 * It shows the misconception that objects with the same content are aliases.
 */
public class CON1H1_Err {
    public static void main(String[] args) {
        // Create two Student objects with the same values
        Student student1 = new Student("Bob", 16);
        Student student2 = new Student("Bob", 16);
        
        // MISCONCEPTION: Thinking that objects with the same content are aliases
        System.out.println("student1 and student2 have the same name and age.");
        System.out.println("Are student1 and student2 aliases? " + (student1 == student2));
        System.out.println("The result is false because they are different objects in memory.");
        
        // MISCONCEPTION: Thinking that modifying one object will affect the other
        System.out.println("\nInitial values:");
        System.out.println("student1: " + student1.getName() + ", " + student1.getAge());
        System.out.println("student2: " + student2.getName() + ", " + student2.getAge());
        
        // Modify student1
        student1.setName("Bob Smith");
        student1.setAge(17);
        
        // Show that student2 is unchanged
        System.out.println("\nAfter modifying student1:");
        System.out.println("student1: " + student1.getName() + ", " + student1.getAge());
        System.out.println("student2: " + student2.getName() + ", " + student2.getAge());
        System.out.println("student2 is unchanged because it's a different object.");
        
        // CORRECT USAGE: Creating an actual alias
        System.out.println("\nCreating a true alias:");
        Student student3 = student1; // student3 is an alias of student1
        
        // Modify through the alias
        student3.setName("Robert Smith");
        
        // Show that both references reflect the change
        System.out.println("After modifying through student3:");
        System.out.println("student1: " + student1.getName() + ", " + student1.getAge());
        System.out.println("student3: " + student3.getName() + ", " + student3.getAge());
        System.out.println("Both show the same values because they reference the same object.");
        System.out.println("Are student1 and student3 aliases? " + (student1 == student3));
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
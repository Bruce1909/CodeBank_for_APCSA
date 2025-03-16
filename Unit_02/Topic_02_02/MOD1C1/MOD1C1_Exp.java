/**
 * MOD1C1_Exp.java
 * 
 * This program demonstrates the correct usage of constructor signatures.
 * 
 * Knowledge Point: MOD-1.C.1
 * A signature consists of the constructor name and the parameter list.
 */
public class MOD1C1_Exp {
    // Main method to demonstrate constructor signatures
    public static void main(String[] args) {
        System.out.println("Demonstrating Constructor Signatures:\n");
        
        // Creating objects using different constructors
        System.out.println("Creating a Person with no parameters:");
        Person person1 = new Person();
        person1.display();
        
        System.out.println("\nCreating a Person with name parameter:");
        Person person2 = new Person("John");
        person2.display();
        
        System.out.println("\nCreating a Person with name and age parameters:");
        Person person3 = new Person("Alice", 25);
        person3.display();
        
        System.out.println("\nEach constructor has a unique signature consisting of:");
        System.out.println("1. The constructor name (always 'Person' in this example)");
        System.out.println("2. The parameter list (empty, String, or String and int)");
    }
}

// Person class with multiple constructors demonstrating different signatures
class Person {
    private String name;
    private int age;
    
    // Constructor with no parameters
    // Signature: Person()
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Called constructor with signature: Person()");
    }
    
    // Constructor with one parameter
    // Signature: Person(String)
    public Person(String name) {
        this.name = name;
        this.age = 0;
        System.out.println("Called constructor with signature: Person(String)");
    }
    
    // Constructor with two parameters
    // Signature: Person(String, int)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Called constructor with signature: Person(String, int)");
    }
    
    // Method to display person information
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
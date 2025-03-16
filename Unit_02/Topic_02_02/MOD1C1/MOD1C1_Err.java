/**
 * MOD1C1_Err.java
 * 
 * This program demonstrates common errors when using constructor signatures.
 * 
 * Knowledge Point: MOD-1.C.1
 * A signature consists of the constructor name and the parameter list.
 */
public class MOD1C1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Constructor Signature Errors:\n");
        
        // ERROR 1: Trying to call a constructor with an incorrect name
        // Uncommenting the following line will cause a compilation error
        // person person1 = new person(); // Error: Class names should start with uppercase letter
        
        // ERROR 2: Trying to call a constructor that doesn't exist
        // Uncommenting the following line will cause a compilation error
        // Person person2 = new Person(true); // Error: No constructor with boolean parameter
        
        // ERROR 3: Trying to call a constructor with wrong parameter order
        // Uncommenting the following line will cause a compilation error
        // Person person3 = new Person(25, "John"); // Error: No constructor with (int, String) signature
        
        // Creating a valid Person object
        Person person4 = new Person("John", 25);
        person4.display();
        
        System.out.println("\nCommon errors with constructor signatures:");
        System.out.println("1. Using incorrect constructor name (case sensitivity matters)");
        System.out.println("2. Calling a constructor with parameters that don't match any signature");
        System.out.println("3. Using incorrect parameter order");
    }
}

// Person class with specific constructor signatures
class Person {
    private String name;
    private int age;
    
    // Constructor with no parameters
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    
    // Constructor with one parameter
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }
    
    // Constructor with two parameters (String, int)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display person information
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    // ERROR 4: Constructor with same signature as another constructor
    // Uncommenting the following will cause a compilation error
    /*
    public Person(String fullName) {
        this.name = fullName;
        this.age = 0;
    }
    */
}
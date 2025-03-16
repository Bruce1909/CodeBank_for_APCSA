/**
 * MOD3E3_Err.java
 * This program demonstrates common errors when using the Object class methods
 * equals() and toString() from the Java Quick Reference.
 * 
 * MOD-3.E.3: The following Object class methods and constructors—including what they do and when 
 * they are used—are part of the Java Quick Reference: 
 * - boolean equals(Object other) 
 * - String toString() 
 */

public class MOD3E3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with Object class methods:\n");
        
        // Create some objects to demonstrate with
        IncorrectPerson person1 = new IncorrectPerson("Alice", 30);
        IncorrectPerson person2 = new IncorrectPerson("Alice", 30);
        IncorrectPerson person3 = new IncorrectPerson("Bob", 25);
        
        // ERROR 1: Not overriding equals() properly
        System.out.println("ERROR 1: Not overriding equals() properly");
        System.out.println("person1 and person2 have the same name and age");
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("This returns false because the default equals() only compares references");
        
        // ERROR 2: Using == instead of equals() for object comparison
        System.out.println("\nERROR 2: Using == instead of equals() for object comparison");
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("str1 == str2: " + (str1 == str2)); // Different objects -> false
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // Same content -> true
        System.out.println("Using == compares object references, not content");
        
        // ERROR 3: Incorrect implementation of equals() method
        System.out.println("\nERROR 3: Incorrect implementation of equals() method");
        IncorrectPerson2 badPerson1 = new IncorrectPerson2("Charlie", 35);
        IncorrectPerson2 badPerson2 = new IncorrectPerson2("Charlie", 35);
        System.out.println("badPerson1.equals(badPerson2): " + badPerson1.equals(badPerson2));
        System.out.println("This returns false because the equals() implementation is incorrect");
        
        // ERROR 4: Not implementing toString() properly
        System.out.println("\nERROR 4: Not implementing toString() properly");
        System.out.println("Default toString() for person1: " + person1);
        System.out.println("This doesn't provide useful information about the object");
        
        // ERROR 5: Forgetting that toString() is called implicitly
        System.out.println("\nERROR 5: Forgetting that toString() is called implicitly");
        System.out.println("When using + with an object: " + person3);
        System.out.println("When using System.out.println(object): " + person3);
        System.out.println("Both cases implicitly call toString()");
    }
}

/**
 * A class that doesn't override equals() or toString()
 */
class IncorrectPerson {
    private String name;
    private int age;
    
    public IncorrectPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // ERROR: No equals() override, so default Object.equals() is used
    // which only compares object references
    
    // ERROR: No toString() override, so default Object.toString() is used
    // which returns className@hashCode
}

/**
 * A class with an incorrect equals() implementation
 */
class IncorrectPerson2 {
    private String name;
    private int age;
    
    public IncorrectPerson2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // ERROR 1: Wrong parameter type (should be Object)
    public boolean equals(IncorrectPerson2 other) {
        return this.name.equals(other.name) && this.age == other.age;
    }
    
    // ERROR 2: Missing @Override annotation
    public String toString() {
        return "Person: " + name + ", " + age;
    }
}
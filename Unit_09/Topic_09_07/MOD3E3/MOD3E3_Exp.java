/**
 * MOD3E3_Exp.java
 * This program demonstrates the Object class methods equals() and toString()
 * that are part of the Java Quick Reference.
 * 
 * MOD-3.E.3: The following Object class methods and constructors—including what they do and when 
 * they are used—are part of the Java Quick Reference: 
 * - boolean equals(Object other) 
 * - String toString() 
 */

public class MOD3E3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Object class methods from Java Quick Reference:\n");
        
        // Create some objects to demonstrate with
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj1; // Same reference as obj1
        
        // Demonstrate the equals(Object other) method
        System.out.println("1. The equals(Object other) method:");
        System.out.println("   - Purpose: Compares this object to the specified object for equality");
        System.out.println("   - Returns: true if the objects are the same, false otherwise");
        System.out.println("   - Default behavior: Compares object references (same as ==)");
        
        System.out.println("\nExample of equals() with Object instances:");
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // Different objects -> false
        System.out.println("obj1.equals(obj3): " + obj1.equals(obj3)); // Same object -> true
        System.out.println("obj1.equals(obj1): " + obj1.equals(obj1)); // Same object -> true
        
        // Create some String objects to demonstrate equals() with overridden behavior
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "World";
        
        System.out.println("\nExample of equals() with String instances (overrides equals()):");
        System.out.println("str1: " + str1 + ", str2: " + str2 + ", str3: " + str3);
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // Same content -> true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // Different content -> false
        System.out.println("str1 == str2: " + (str1 == str2)); // Different objects -> false
        
        // Demonstrate the toString() method
        System.out.println("\n2. The toString() method:");
        System.out.println("   - Purpose: Returns a string representation of the object");
        System.out.println("   - Returns: A string containing useful information about the object");
        System.out.println("   - Default behavior: Returns class name @ hex hashcode");
        
        System.out.println("\nExample of toString() with Object instances:");
        System.out.println("obj1.toString(): " + obj1.toString());
        System.out.println("obj2.toString(): " + obj2.toString());
        
        // Create a custom class instance to demonstrate toString()
        Person person = new Person("John", 25);
        
        System.out.println("\nExample of toString() with custom class (overrides toString()):");
        System.out.println("person.toString(): " + person.toString());
        System.out.println("Implicit toString() call: " + person); // Implicit call to toString()
        
        // When these methods are typically used
        System.out.println("\nWhen these methods are typically used:");
        System.out.println("1. equals() - Used when comparing objects for equality, especially in collections");
        System.out.println("2. toString() - Used for debugging, logging, and displaying object information");
    }
}

/**
 * A custom class that overrides both equals() and toString() methods
 */
class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /**
     * Overrides the equals method to compare Person objects based on their content
     * @param obj The object to compare with
     * @return true if the objects have the same name and age, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // Check if the object is compared with itself
        if (this == obj) {
            return true;
        }
        
        // Check if the object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        // Cast to Person and compare fields
        Person other = (Person) obj;
        return age == other.age && 
               (name == null ? other.name == null : name.equals(other.name));
    }
    
    /**
     * Overrides the toString method to provide a meaningful string representation
     * @return A string containing the person's name and age
     */
    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}
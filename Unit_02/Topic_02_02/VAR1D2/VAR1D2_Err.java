/**
 * This program demonstrates the incorrect use of reference data types
 * VAR-1.D.2: The memory associated with a variable of a reference type holds an object reference value or,
 * if there is no object, null. This value is the memory address of the referenced object.
 * 
 * ERROR: This program demonstrates common misconceptions about reference variables.
 */
public class VAR1D2_Err {
    public static void main(String[] args) {
        // ERROR 1: Confusing reference equality (==) with content equality (.equals())
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        
        // Incorrect: Using == to compare String objects (compares references, not content)
        if (str1 == str2) {
            System.out.println("ERROR: The strings are the same object in memory.");
            // This won't execute because str1 and str2 are different objects
        } else {
            System.out.println("The strings are different objects in memory, even though they have the same content.");
            System.out.println("Should use .equals() to compare content: " + str1.equals(str2));
        }
        
        // ERROR 2: Misunderstanding reference assignment and object modification
        System.out.println("\nDemonstrating misunderstanding of reference assignment:");
        
        // Creating two Person objects
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");
        
        System.out.println("Initial values:");
        System.out.println("person1: " + person1.getName());
        System.out.println("person2: " + person2.getName());
        
        // ERROR: Thinking that assigning person1 = person2 copies the object's data
        // rather than the reference
        person1 = person2;
        
        System.out.println("\nAfter person1 = person2:");
        System.out.println("person1: " + person1.getName()); // Now points to Bob
        System.out.println("person2: " + person2.getName());
        
        // Changing person2's name
        person2.setName("Charlie");
        
        // ERROR: Not realizing that person1 and person2 now reference the same object
        System.out.println("\nAfter changing person2's name:");
        System.out.println("person1: " + person1.getName()); // Will show Charlie, not Bob
        System.out.println("person2: " + person2.getName());
        
        // ERROR 3: Attempting to use a reference after setting it to null
        System.out.println("\nDemonstrating null reference error:");
        person1 = null;
        
        // This will cause a NullPointerException
        System.out.println("Attempting to access person1 after setting to null: " + person1.getName());
    }
}

// Helper class for the example
class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
/**
 * VAR-2.D.1 Error Example
 * An ArrayList object is mutable and contains object references.
 * 
 * This program demonstrates common errors when working with ArrayList objects,
 * particularly related to their mutability and reference behavior.
 */
import java.util.ArrayList;

public class VAR2D1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common ArrayList errors:\n");
        
        // ERROR 1: Forgetting to import java.util.ArrayList
        System.out.println("Error 1: Forgetting to import java.util.ArrayList");
        System.out.println("If you remove the import statement at the top of this file,");
        System.out.println("you would get a compilation error: 'cannot find symbol: class ArrayList'\n");
        
        // ERROR 2: Trying to modify ArrayList elements through the loop variable
        System.out.println("Error 2: Trying to modify ArrayList elements through the loop variable");
        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        System.out.println("Original names: " + names);
        
        System.out.println("Attempting to modify elements using enhanced for loop:");
        for (String name : names) {
            // This only modifies the local copy, not the actual element in the ArrayList
            name = name.toUpperCase();
            System.out.println("Modified local variable: " + name);
        }
        
        System.out.println("Names after attempted modification: " + names);
        System.out.println("Notice that the ArrayList elements remain unchanged!\n");
        
        // Correct way to modify elements
        System.out.println("Correct way to modify elements (using indexed for loop):");
        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).toUpperCase());
        }
        System.out.println("Names after proper modification: " + names + "\n");
        
        // ERROR 3: Misunderstanding object references in ArrayList
        System.out.println("Error 3: Misunderstanding object references in ArrayList");
        ArrayList<Person> people = new ArrayList<Person>();
        
        // Add two Person objects
        Person person1 = new Person("David");
        people.add(person1);
        people.add(new Person("Emma"));
        
        System.out.println("Original people list:");
        for (Person p : people) {
            System.out.println(p);
        }
        
        // ERROR: Thinking that creating a new object with the same name replaces the object in the ArrayList
        System.out.println("\nCommon misconception: Creating a new object with the same name");
        person1 = new Person("David (Modified)");
        System.out.println("Modified person1 reference: " + person1);
        
        System.out.println("\nPeople list after modifying the person1 reference:");
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println("Notice that the ArrayList still contains the original object!\n");
        
        // Correct way to update an object in the ArrayList
        System.out.println("Correct way to update an object in the ArrayList:");
        people.get(0).setName("David (Properly Modified)");
        
        System.out.println("People list after properly modifying the object:");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}

// A simple Person class to demonstrate object references
class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Person{name='" + name + "'}"; 
    }
}
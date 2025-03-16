/**
 * This program demonstrates utilizing the Object class through inheritance (MOD-3.D.1).
 * It shows how all Java classes inherit from Object and can use/override its methods.
 */
public class MOD3D1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Object class inheritance (MOD-3.D.1):\n");
        
        // Create instances of our custom class
        Person person1 = new Person("John", 25);
        Person person2 = new Person("John", 25);
        Person person3 = new Person("Alice", 30);
        
        // Demonstrate toString() method inherited from Object
        System.out.println("--- toString() method from Object ---");
        System.out.println("person1.toString(): " + person1.toString());
        System.out.println("Implicit toString() call: " + person1);
        
        // Demonstrate equals() method inherited from Object
        System.out.println("\n--- equals() method from Object ---");
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));
        System.out.println("person1 == person2: " + (person1 == person2)); // Reference comparison
        
        // Demonstrate hashCode() method inherited from Object
        System.out.println("\n--- hashCode() method from Object ---");
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println("person3.hashCode(): " + person3.hashCode());
        
        // Demonstrate getClass() method inherited from Object
        System.out.println("\n--- getClass() method from Object ---");
        System.out.println("person1.getClass(): " + person1.getClass());
        System.out.println("person1.getClass().getName(): " + person1.getClass().getName());
        
        // Demonstrate clone() method inherited from Object (requires implementing Cloneable)
        System.out.println("\n--- clone() method from Object ---");
        try {
            CloneablePerson cloneablePerson = new CloneablePerson("Bob", 40);
            CloneablePerson clonedPerson = (CloneablePerson) cloneablePerson.clone();
            System.out.println("Original: " + cloneablePerson);
            System.out.println("Clone: " + clonedPerson);
            System.out.println("Are they the same object? " + (cloneablePerson == clonedPerson));
            System.out.println("Do they have the same content? " + cloneablePerson.equals(clonedPerson));
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }
        
        // Explanation
        System.out.println("\n--- Explanation ---");
        System.out.println("1. Every Java class implicitly extends Object if it doesn't extend another class");
        System.out.println("2. Object provides several methods that all classes inherit:");
        System.out.println("   - toString(): returns a string representation of the object");
        System.out.println("   - equals(): compares objects for equality (by default, compares references)");
        System.out.println("   - hashCode(): returns a hash code value for the object");
        System.out.println("   - getClass(): returns the runtime class of the object");
        System.out.println("   - clone(): creates a copy of the object (protected, requires Cloneable)");
        System.out.println("   - finalize(): called by garbage collector before reclaiming object's memory");
        System.out.println("   - wait(), notify(), notifyAll(): used for thread synchronization");
        System.out.println("3. Classes often override these methods to provide custom behavior");
    }
}

/**
 * A simple Person class that overrides toString(), equals(), and hashCode()
 * methods inherited from Object.
 */
class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Override toString() from Object class
    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
    
    // Override equals() from Object class
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Person person = (Person) obj;
        return age == person.age && 
               (name == null ? person.name == null : name.equals(person.name));
    }
    
    // Override hashCode() from Object class
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}

/**
 * A CloneablePerson class that implements Cloneable interface
 * to properly support the clone() method from Object.
 */
class CloneablePerson implements Cloneable {
    private String name;
    private int age;
    
    public CloneablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Override clone() from Object class
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Calls Object's clone method
    }
    
    @Override
    public String toString() {
        return "CloneablePerson[name=" + name + ", age=" + age + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        CloneablePerson person = (CloneablePerson) obj;
        return age == person.age && 
               (name == null ? person.name == null : name.equals(person.name));
    }
    
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
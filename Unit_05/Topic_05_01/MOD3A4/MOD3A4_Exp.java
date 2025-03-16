/**
 * MOD3A4_Exp.java
 * 
 * This program demonstrates MOD-3.A.4: The provided accessor and mutator methods in a class
 * allow client code to use and modify data.
 */
public class MOD3A4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating accessor and mutator methods (MOD-3.A.4):\n");
        
        // Create an instance of Person with encapsulated data
        Person person = new Person("Alice Johnson", 28, "alice@example.com");
        
        // Using accessor methods (getters) to retrieve data
        System.out.println("Person Information (using accessor methods):");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());
        
        // Using mutator methods (setters) to modify data
        System.out.println("\nModifying person data using mutator methods...");
        person.setName("Alice Smith");  // Changed last name
        person.setAge(29);              // Updated age
        person.setEmail("alicesmith@example.com");  // Updated email
        
        // Verify changes using accessor methods
        System.out.println("\nUpdated Person Information (retrieved using accessor methods):");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());
        
        // Demonstrate validation in mutator methods
        System.out.println("\nDemonstrating validation in mutator methods:");
        System.out.println("Attempting to set invalid age (-5)...");
        person.setAge(-5);  // Invalid age, should be rejected
        System.out.println("Age after invalid attempt: " + person.getAge());  // Should remain unchanged
        
        System.out.println("\nAttempting to set invalid email (null)...");
        person.setEmail(null);  // Invalid email, should be rejected or set to default
        System.out.println("Email after invalid attempt: " + person.getEmail());  // Should remain unchanged or set to default
        
        // Cannot access private instance variables directly
        System.out.println("\nAttempting to access private instance variables directly (commented out):");
        // System.out.println(person.name);   // Error: name has private access
        // System.out.println(person.age);    // Error: age has private access
        // System.out.println(person.email);  // Error: email has private access
        // person.age = -10;                  // Error: age has private access
        
        System.out.println("\n--- Key Points about Accessor and Mutator Methods ---");
        System.out.println("1. Accessor methods (getters) allow controlled access to private data");
        System.out.println("2. Mutator methods (setters) allow controlled modification of private data");
        System.out.println("3. Mutator methods can include validation to maintain data integrity");
        System.out.println("4. Accessor and mutator methods provide an interface to the encapsulated data");
        System.out.println("5. Client code interacts with the object through these methods, not directly with the data");
    }
}

/**
 * Class that demonstrates accessor and mutator methods for encapsulated data
 */
class Person {
    // Private instance variables - encapsulated data
    private String name;
    private int age;
    private String email;
    
    // Constructor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = (age >= 0) ? age : 0;  // Validate age
        this.email = (email != null) ? email : "unknown@example.com";  // Validate email
    }
    
    // Accessor methods (getters)
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getEmail() {
        return email;
    }
    
    // Mutator methods (setters) with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
    }
    
    // Additional methods that use the private data
    public boolean isAdult() {
        return age >= 18;
    }
    
    public String getDisplayName() {
        return name + " (" + age + ")";
    }
}
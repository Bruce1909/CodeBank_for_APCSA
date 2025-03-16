/**
 * MOD3A4_Err.java
 * 
 * This program demonstrates common errors related to accessor and mutator methods
 * as described in MOD-3.A.4: The provided accessor and mutator methods in a class
 * allow client code to use and modify data.
 */
public class MOD3A4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors with accessor and mutator methods (MOD-3.A.4):\n");
        
        // Create an instance of PersonWithErrors with poorly implemented accessor and mutator methods
        PersonWithErrors person = new PersonWithErrors("Alice Johnson", 28, "alice@example.com");
        
        // ERROR 1: Inconsistent accessor methods
        System.out.println("ERROR 1: Inconsistent accessor methods:");
        System.out.println("Name: " + person.getName());  // Returns formatted name, not original data
        System.out.println("Age: " + person.getAge());    // Returns age + 1, not actual age
        
        // ERROR 2: Mutator methods without validation
        System.out.println("\nERROR 2: Mutator methods without validation:");
        person.setAge(-5);  // No validation for negative age
        System.out.println("Age after setting invalid value: " + person.getAge());
        
        person.setEmail("invalid-email");  // No validation for email format
        System.out.println("Email after setting invalid value: " + person.getEmail());
        
        // ERROR 3: Exposing internal representation
        System.out.println("\nERROR 3: Exposing internal representation:");
        java.util.ArrayList<String> history = person.getHistory();  // Returns reference to internal list
        System.out.println("History before modification: " + history);
        
        // Modifying the returned reference affects the internal object
        history.add("Unauthorized modification");
        System.out.println("History after external modification: " + person.getHistory());
        
        // ERROR 4: Inconsistent state after mutation
        System.out.println("\nERROR 4: Inconsistent state after mutation:");
        person.setName("Alice Smith");
        System.out.println("Name: " + person.getName());
        System.out.println("Display name not updated: " + person.getDisplayName());
        
        // ERROR 5: Mutator methods with side effects
        System.out.println("\nERROR 5: Mutator methods with side effects:");
        System.out.println("Age before: " + person.getAge());
        person.setName("Bob Johnson");  // Changing name shouldn't affect age
        System.out.println("Age after changing name: " + person.getAge());
        
        System.out.println("\n--- Problems with Poor Accessor and Mutator Methods ---");
        System.out.println("1. Inconsistent accessor methods don't return actual data");
        System.out.println("2. Mutator methods without validation allow invalid data");
        System.out.println("3. Returning references to mutable objects exposes internal representation");
        System.out.println("4. Inconsistent state after mutation when related fields aren't updated");
        System.out.println("5. Mutator methods with unexpected side effects");
        System.out.println("6. Poor accessor and mutator methods break encapsulation");
    }
}

/**
 * Class that demonstrates problems with accessor and mutator methods
 */
class PersonWithErrors {
    private String name;
    private int age;
    private String email;
    private String displayName;  // Derived from name and age
    private java.util.ArrayList<String> history;
    
    // Constructor
    public PersonWithErrors(String name, int age, String email) {
        this.name = name;
        this.age = age;  // No validation
        this.email = email;  // No validation
        this.displayName = name + " (" + age + ")";  // Derived field
        this.history = new java.util.ArrayList<>();
        this.history.add("Created");
    }
    
    // ERROR: Accessor method that doesn't return the actual data
    public String getName() {
        return name.toUpperCase();  // Returns modified data, not original
    }
    
    // ERROR: Accessor method that doesn't return the actual data
    public int getAge() {
        return age + 1;  // Returns age + 1, not actual age
    }
    
    // ERROR: Accessor method without problems
    public String getEmail() {
        return email;
    }
    
    // ERROR: Accessor method that exposes internal representation
    public java.util.ArrayList<String> getHistory() {
        return history;  // Returns reference to internal list, not a copy
    }
    
    // ERROR: Mutator method without validation
    public void setName(String name) {
        this.name = name;
        // ERROR: Doesn't update related displayName field
        // displayName should be updated here
        
        // ERROR: Side effect - changing name affects age
        this.age++;  // Unexpected side effect
        
        this.history.add("Name changed");
    }
    
    // ERROR: Mutator method without validation
    public void setAge(int age) {
        this.age = age;  // No validation for negative values
        // ERROR: Doesn't update related displayName field
        // displayName should be updated here
        
        this.history.add("Age changed");
    }
    
    // ERROR: Mutator method without validation
    public void setEmail(String email) {
        this.email = email;  // No validation for email format
        this.history.add("Email changed");
    }
    
    // ERROR: Accessor method that returns inconsistent data
    public String getDisplayName() {
        return displayName;  // May be inconsistent with current name and age
    }
    
    // ERROR: Method that should be private but is public
    public void clearHistory() {
        history.clear();
    }
}
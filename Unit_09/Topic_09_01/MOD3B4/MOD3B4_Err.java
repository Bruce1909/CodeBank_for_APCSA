/**
 * MOD3B4_Err.java
 * 
 * This program demonstrates errors related to MOD-3.B.4: Misusing the 'extends' keyword
 * and attempting to violate the single inheritance rule in Java.
 */
public class MOD3B4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors with the 'extends' keyword (MOD-3.B.4):\n");
        
        // Create instances of classes with inheritance issues
        ManagerWithError manager = new ManagerWithError("John Smith", 101, "Marketing");
        DeveloperWithError developer = new DeveloperWithError("Jane Doe", 102, "Java");
        
        // Display information about each employee
        System.out.println("Manager Information:");
        manager.displayInfo();
        manager.work();
        System.out.println();
        
        System.out.println("Developer Information:");
        developer.displayInfo();
        developer.work();
        System.out.println();
        
        // ERROR 1: Attempting to use multiple inheritance (commented out as it won't compile)
        System.out.println("ERROR 1: Attempting to use multiple inheritance");
        System.out.println("The following code would not compile in Java:");
        System.out.println("class FullStackDeveloper extends Developer, Designer { ... }");
        System.out.println("Java only supports single inheritance with the 'extends' keyword\n");
        
        // ERROR 2: Forgetting to use the 'extends' keyword
        System.out.println("ERROR 2: Forgetting to use the 'extends' keyword");
        System.out.println("The following code would not compile in Java:");
        System.out.println("class Manager Employee { ... } // Missing 'extends' keyword\n");
        
        // ERROR 3: Extending from a final class
        System.out.println("ERROR 3: Attempting to extend from a final class");
        System.out.println("The following code would not compile in Java:");
        System.out.println("class SubString extends String { ... } // Error: Cannot extend final class\n");
        
        System.out.println("\n--- Problems with Misusing the 'extends' Keyword ---");
        System.out.println("1. Attempting multiple inheritance is not allowed in Java");
        System.out.println("2. Forgetting the 'extends' keyword results in syntax errors");
        System.out.println("3. Extending final classes is not allowed");
        System.out.println("4. Not properly establishing the inheritance hierarchy leads to code duplication");
        System.out.println("5. Misusing inheritance can lead to poor design and maintenance issues");
    }
}

/**
 * ERROR: No explicit inheritance relationship
 * This class doesn't explicitly extend any class, so it implicitly extends Object
 * But it duplicates code that should be in a superclass
 */
class EmployeeWithError {
    private String name;
    private int id;
    
    public EmployeeWithError(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public void work() {
        System.out.println(name + " is working.");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}

/**
 * ERROR: No inheritance relationship with EmployeeWithError
 * This class should extend EmployeeWithError but doesn't use the 'extends' keyword
 * Instead, it duplicates code from EmployeeWithError
 */
class ManagerWithError {
    // Duplicated attributes from EmployeeWithError
    private String name;
    private int id;
    private String department;
    
    public ManagerWithError(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    
    // Duplicated method from EmployeeWithError
    public void work() {
        System.out.println(name + " is working.");
    }
    
    // Duplicated method from EmployeeWithError with additional information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
    
    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting for the " + department + " department.");
    }
    
    // Duplicated getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}

/**
 * ERROR: No inheritance relationship with EmployeeWithError
 * This class should extend EmployeeWithError but doesn't use the 'extends' keyword
 * Instead, it duplicates code from EmployeeWithError
 */
class DeveloperWithError {
    // Duplicated attributes from EmployeeWithError
    private String name;
    private int id;
    private String programmingLanguage;
    
    public DeveloperWithError(String name, int id, String programmingLanguage) {
        this.name = name;
        this.id = id;
        this.programmingLanguage = programmingLanguage;
    }
    
    // Duplicated method from EmployeeWithError
    public void work() {
        // Inconsistent implementation
        System.out.println(name + " is coding.");
    }
    
    // Duplicated method from EmployeeWithError with additional information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Programming Language: " + programmingLanguage);
    }
    
    public void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
    
    // Duplicated getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}

/* 
 * The following code demonstrates errors that would prevent compilation:
 * 
 * // ERROR 1: Multiple inheritance is not allowed in Java
 * class FullStackDeveloper extends Developer, Designer { // This is not allowed in Java
 *     // Class implementation
 * }
 * 
 * // ERROR 2: Missing the 'extends' keyword
 * class Manager Employee { // Missing 'extends' keyword
 *     // Class implementation
 * }
 * 
 * // ERROR 3: Cannot extend final classes
 * class SubString extends String { // Error: Cannot extend final class String
 *     // Class implementation
 * }
 */
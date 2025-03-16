/**
 * MOD3B4_Exp.java
 * 
 * This program demonstrates MOD-3.B.4: The keyword 'extends' is used to establish an
 * inheritance relationship between a subclass and a superclass. A class can extend only
 * one superclass.
 */
public class MOD3B4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating the 'extends' keyword for inheritance (MOD-3.B.4):\n");
        
        // Create instances of different employee types
        Manager manager = new Manager("John Smith", 101, 75000.0, "Marketing");
        Developer developer = new Developer("Jane Doe", 102, 80000.0, "Java");
        Intern intern = new Intern("Bob Johnson", 103, 30000.0, "State University");
        
        // Display information about each employee
        System.out.println("Manager Information:");
        manager.displayInfo();
        manager.work();
        manager.conductMeeting();
        System.out.println();
        
        System.out.println("Developer Information:");
        developer.displayInfo();
        developer.work();
        developer.writeCode();
        System.out.println();
        
        System.out.println("Intern Information:");
        intern.displayInfo();
        intern.work();
        intern.attendTraining();
        
        // Demonstrate that a class can extend only one superclass
        System.out.println("\n--- Demonstrating Single Inheritance ---");
        System.out.println("In Java, a class can extend only one superclass:");
        System.out.println("- Manager extends Employee (not Person and Worker)");
        System.out.println("- Developer extends Employee (not Programmer and Coder)");
        System.out.println("- Intern extends Employee (not Student and Trainee)");
        System.out.println("This is called 'single inheritance'\n");
        
        // Demonstrate the inheritance hierarchy
        System.out.println("--- Inheritance Hierarchy ---");
        System.out.println("Object (built-in Java class)");
        System.out.println("  ↑");
        System.out.println("Employee (our superclass)");
        System.out.println("  ↑         ↑         ↑");
        System.out.println("Manager  Developer  Intern (our subclasses)");
        
        System.out.println("\n--- Key Points about the 'extends' Keyword ---");
        System.out.println("1. The 'extends' keyword establishes an inheritance relationship");
        System.out.println("2. A class can extend only one superclass (single inheritance)");
        System.out.println("3. All classes implicitly extend Object if no superclass is specified");
        System.out.println("4. The 'extends' keyword is used in the class declaration");
        System.out.println("5. Multiple classes can extend the same superclass");
    }
}

/**
 * Superclass for all employee types
 */
class Employee {
    private String name;
    private int id;
    private double salary;
    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public void work() {
        System.out.println(name + " is working.");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
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
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

/**
 * Manager subclass - uses 'extends' keyword to inherit from Employee
 */
class Manager extends Employee {
    private String department;
    
    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }
    
    public void conductMeeting() {
        System.out.println(getName() + " is conducting a meeting for the " + department + " department.");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

/**
 * Developer subclass - uses 'extends' keyword to inherit from Employee
 */
class Developer extends Employee {
    private String programmingLanguage;
    
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    
    public void writeCode() {
        System.out.println(getName() + " is writing code in " + programmingLanguage + ".");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

/**
 * Intern subclass - uses 'extends' keyword to inherit from Employee
 */
class Intern extends Employee {
    private String university;
    
    public Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }
    
    public void attendTraining() {
        System.out.println(getName() + " is attending a training session.");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("University: " + university);
    }
}

/* 
 * The following code would cause a compilation error because Java doesn't support multiple inheritance:
 * 
 * // ERROR: A class cannot extend multiple classes
 * class FullStackDeveloper extends Developer, Designer { // This is not allowed in Java
 *     // Class implementation
 * }
 * 
 * Instead, Java uses interfaces to achieve similar functionality:
 * 
 * interface Designer {
 *     void design();
 * }
 * 
 * class FullStackDeveloper extends Developer implements Designer {
 *     // Class implementation that extends Developer and implements Designer interface
 * }
 */
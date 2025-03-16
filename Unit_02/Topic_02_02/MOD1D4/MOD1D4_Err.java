/**
 * MOD1D4_Err - Error examples demonstrating common mistakes with constructor parameters
 * 
 * This program demonstrates common errors related to MOD-1.D.4:
 * Parameters allow values to be passed to the constructor to establish the initial state of the object.
 */
public class MOD1D4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with constructor parameters:\n");
        
        // Example 1: Passing parameters in the wrong order
        System.out.println("Example 1: Passing parameters in the wrong order");
        System.out.println("// Error: Person person = new Person(25, \"Alice\"); // Wrong order: age, name");
        System.out.println("// This would compile but initialize the object incorrectly");
        
        // Correct way
        System.out.println("Correct way:");
        Person person = new Person("Alice", 25); // Correct order: name, age
        System.out.println("Person person = new Person(\"Alice\", 25); // Correct order: name, age");
        System.out.println("Created person: " + person);
        System.out.println();
        
        // Example 2: Passing parameters of the wrong type
        System.out.println("Example 2: Passing parameters of the wrong type");
        System.out.println("// Error: Rectangle rect = new Rectangle(\"5\", \"3\"); // Wrong types: String instead of double");
        System.out.println("// This would cause a compilation error");
        
        // Correct way
        System.out.println("Correct way:");
        Rectangle rect = new Rectangle(5.0, 3.0); // Correct types: double values
        System.out.println("Rectangle rect = new Rectangle(5.0, 3.0); // Correct types: double values");
        System.out.println("Created rectangle: " + rect);
        System.out.println();
        
        // Example 3: Passing the wrong number of parameters
        System.out.println("Example 3: Passing the wrong number of parameters");
        System.out.println("// Error: BankAccount account = new BankAccount(\"John\", 1000.0, \"Savings\", 123456);");
        System.out.println("// This would cause a compilation error - no constructor with 4 parameters");
        
        // Correct way
        System.out.println("Correct way:");
        BankAccount account = new BankAccount("John", 1000.0, "Savings"); // Correct number of parameters
        System.out.println("BankAccount account = new BankAccount(\"John\", 1000.0, \"Savings\"); // Correct number");
        System.out.println("Created account: " + account);
        System.out.println();
        
        // Example 4: Not validating constructor parameters
        System.out.println("Example 4: Not validating constructor parameters");
        System.out.println("// Error: Student student = new Student(\"Bob\", -100); // Invalid ID (negative)");
        System.out.println("// This would compile but create an object with invalid state");
        
        // Correct way
        System.out.println("Correct way:");
        System.out.println("// Validate parameters in the constructor:");
        System.out.println("// public Student(String name, int id) {");
        System.out.println("//     this.name = name;");
        System.out.println("//     if (id < 0) {");
        System.out.println("//         this.id = 0; // Default to valid value");
        System.out.println("//         System.out.println(\"Warning: Invalid ID provided, using default\");");
        System.out.println("//     } else {");
        System.out.println("//         this.id = id;");
        System.out.println("//     }");
        System.out.println("// }");
        
        // Demonstrate validation
        Student student = new Student("Bob", -100); // Will be validated in constructor
        System.out.println("Student student = new Student(\"Bob\", -100); // Will be validated");
        System.out.println("Created student: " + student);
        System.out.println();
        
        // Example 5: Forgetting to initialize all fields in a constructor
        System.out.println("Example 5: Forgetting to initialize all fields in a constructor");
        System.out.println("// Error: In the class definition:");
        System.out.println("// public Car(String make, String model) { // Missing year initialization");
        System.out.println("//     this.make = make;");
        System.out.println("//     this.model = model;");
        System.out.println("//     // Forgot to initialize this.year");
        System.out.println("// }");
        
        // Demonstrate the issue
        Car car = new Car("Toyota", "Camry"); // Uses constructor with incomplete initialization
        System.out.println("Car car = new Car(\"Toyota\", \"Camry\"); // Uses constructor with incomplete initialization");
        System.out.println("Created car: " + car + " (notice the year is 0, the default value for int)");
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors with Constructor Parameters ---");
        System.out.println("1. Passing parameters in the wrong order");
        System.out.println("2. Passing parameters of the wrong type");
        System.out.println("3. Passing the wrong number of parameters");
        System.out.println("4. Not validating parameters in the constructor");
        System.out.println("5. Forgetting to initialize all fields in a constructor");
    }
}

/**
 * Person class with a constructor that takes parameters
 */
class Person {
    private String name;
    private int age;
    
    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person(name=" + name + ", age=" + age + ")";
    }
}

/**
 * Rectangle class with a constructor that takes parameters
 */
class Rectangle {
    private double length;
    private double width;
    
    // Constructor with parameters
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public String toString() {
        return "Rectangle(length=" + length + ", width=" + width + ")";
    }
}

/**
 * BankAccount class with multiple constructors
 */
class BankAccount {
    private String ownerName;
    private double balance;
    private String accountType;
    
    // Constructor with parameters
    public BankAccount(String ownerName, double balance, String accountType) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.accountType = accountType;
    }
    
    @Override
    public String toString() {
        return "BankAccount(owner=" + ownerName + ", type=" + accountType + ", balance=$" + balance + ")";
    }
}

/**
 * Student class with parameter validation in constructor
 */
class Student {
    private String name;
    private int id;
    
    // Constructor with parameter validation
    public Student(String name, int id) {
        this.name = name;
        if (id < 0) {
            this.id = 0; // Default to valid value
            System.out.println("Warning: Invalid ID provided, using default");
        } else {
            this.id = id;
        }
    }
    
    @Override
    public String toString() {
        return "Student(name=" + name + ", id=" + id + ")";
    }
}

/**
 * Car class with incomplete initialization in one constructor
 */
class Car {
    private String make;
    private String model;
    private int year; // This will be 0 by default if not initialized
    
    // Constructor with incomplete initialization
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        // Forgot to initialize year
    }
    
    // Complete constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    @Override
    public String toString() {
        return "Car(make=" + make + ", model=" + model + ", year=" + year + ")";
    }
}
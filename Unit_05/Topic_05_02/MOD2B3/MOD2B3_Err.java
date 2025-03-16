/**
 * MOD2B3_Err.java
 * 
 * This program demonstrates common errors related to constructor parameters as described in
 * MOD-2.B.3: Constructor parameters are local variables to the constructor and provide
 * data to initialize instance variables.
 */
public class MOD2B3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with constructor parameters (MOD-2.B.3):\n");
        
        // ERROR 1: Not using 'this' keyword when parameter names match instance variable names
        System.out.println("ERROR 1: Not using 'this' keyword with matching parameter names");
        RectangleWithErrors rect1 = new RectangleWithErrors(5.0, 3.0);
        System.out.println("\nRectangle created with parameters (5.0, 3.0):");
        rect1.displayInfo(); // Instance variables not properly initialized
        
        // ERROR 2: Not validating constructor parameters
        System.out.println("\nERROR 2: Not validating constructor parameters");
        BankAccountWithErrors account1 = new BankAccountWithErrors("Alice Johnson", -500.0);
        System.out.println("\nAccount created with invalid initial deposit:");
        account1.displayInfo(); // Negative balance allowed
        
        // ERROR 3: Ignoring constructor parameters
        System.out.println("\nERROR 3: Ignoring constructor parameters");
        PersonWithErrors person1 = new PersonWithErrors("John", "Smith");
        System.out.println("\nPerson created with parameters but using hardcoded values:");
        person1.displayInfo(); // Parameters ignored, hardcoded values used
        
        // ERROR 4: Modifying constructor parameters (which are local variables)
        System.out.println("\nERROR 4: Modifying constructor parameters");
        StudentWithErrors student1 = new StudentWithErrors("Emma Johnson", 15);
        System.out.println("\nStudent created with modified parameters:");
        student1.displayInfo(); // Parameter was modified but doesn't affect the caller
        
        System.out.println("\n--- Common Errors with Constructor Parameters ---");
        System.out.println("1. Not using 'this' keyword when parameter names match instance variables");
        System.out.println("2. Not validating parameters before using them");
        System.out.println("3. Ignoring parameters and using hardcoded values");
        System.out.println("4. Confusing parameters (local variables) with instance variables");
        System.out.println("5. Modifying parameters instead of instance variables");
    }
}

/**
 * Class that demonstrates errors with constructor parameters
 */
class RectangleWithErrors {
    // Instance variables
    private double length;
    private double width;
    private double area;
    private double perimeter;
    
    // ERROR: Not using 'this' keyword when parameter names match instance variables
    public RectangleWithErrors(double length, double width) {
        // ERROR: Without 'this', these assignments do nothing useful
        // They just assign the parameters to themselves
        length = length; // Should be this.length = length;
        width = width;   // Should be this.width = width;
        
        // These calculations use the parameter values, not the instance variables
        // (which remain at their default values of 0.0)
        area = length * width;
        perimeter = 2 * (length + width);
        
        System.out.println("Rectangle created with length " + length + " and width " + width);
    }
    
    public void displayInfo() {
        System.out.println("  Length: " + length); // Will be 0.0 (default)
        System.out.println("  Width: " + width);   // Will be 0.0 (default)
        System.out.println("  Area: " + area);     // Will be calculated from parameters
        System.out.println("  Perimeter: " + perimeter); // Will be calculated from parameters
    }
}

/**
 * Class that demonstrates errors with parameter validation
 */
class BankAccountWithErrors {
    // Instance variables
    private String ownerName;
    private double balance;
    
    // ERROR: No validation of constructor parameters
    public BankAccountWithErrors(String ownerName, double initialDeposit) {
        this.ownerName = ownerName;
        
        // ERROR: No validation of initialDeposit
        // This allows negative initial deposits
        this.balance = initialDeposit;
        
        System.out.println("Account created for " + ownerName + " with initial deposit of $" + initialDeposit);
    }
    
    public void displayInfo() {
        System.out.println("  Owner: " + ownerName);
        System.out.println("  Balance: $" + String.format("%.2f", balance));
    }
}

/**
 * Class that demonstrates errors with ignoring constructor parameters
 */
class PersonWithErrors {
    // Instance variables
    private String firstName;
    private String lastName;
    private String fullName;
    
    // ERROR: Ignoring constructor parameters
    public PersonWithErrors(String firstName, String lastName) {
        // ERROR: Ignoring parameters and using hardcoded values
        this.firstName = "Default"; // Should use the firstName parameter
        this.lastName = "User";     // Should use the lastName parameter
        this.fullName = this.firstName + " " + this.lastName;
        
        System.out.println("Person created: " + fullName);
        System.out.println("Note: Parameters were ignored: " + firstName + " " + lastName);
    }
    
    public void displayInfo() {
        System.out.println("  First Name: " + firstName);
        System.out.println("  Last Name: " + lastName);
        System.out.println("  Full Name: " + fullName);
    }
}

/**
 * Class that demonstrates errors with modifying constructor parameters
 */
class StudentWithErrors {
    // Instance variables
    private String name;
    private int age;
    
    // ERROR: Modifying constructor parameters
    public StudentWithErrors(String name, int age) {
        // ERROR: Modifying the parameter (local variable) instead of the instance variable
        // This has no effect outside the constructor
        age = age + 1; // This just changes the local variable, not the instance variable
        
        // Correctly assign parameters to instance variables
        this.name = name;
        this.age = age; // This assigns the modified local variable
        
        System.out.println("Created student: " + name + " with age " + age);
        System.out.println("Note: Age parameter was modified inside constructor");
    }
    
    public void displayInfo() {
        System.out.println("  Name: " + name);
        System.out.println("  Age: " + age); // Will show the modified value
    }
}
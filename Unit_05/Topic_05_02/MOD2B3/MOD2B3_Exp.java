/**
 * MOD2B3_Exp.java
 * 
 * This program demonstrates the correct usage of constructor parameters as described in
 * MOD-2.B.3: Constructor parameters are local variables to the constructor and provide
 * data to initialize instance variables.
 */
public class MOD2B3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating constructor parameters (MOD-2.B.3):\n");
        
        // Create objects with different constructor parameters
        System.out.println("Creating objects with different constructor parameters:");
        
        // Pass different values to the constructor parameters
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(7.5, 2.0);
        
        // Display the objects created with different parameters
        System.out.println("\nRectangle 1 created with parameters (5.0, 3.0):");
        rect1.displayInfo();
        
        System.out.println("\nRectangle 2 created with parameters (7.5, 2.0):");
        rect2.displayInfo();
        
        // Demonstrate parameter naming and the use of 'this'
        System.out.println("\nCreating a Person object with name parameters:");
        Person person = new Person("John", "Smith");
        person.displayInfo();
        
        // Demonstrate validation of constructor parameters
        System.out.println("\nCreating a BankAccount with validated parameters:");
        BankAccount account = new BankAccount("Alice Johnson", 1000.0);
        account.displayInfo();
        
        // Try to create an object with invalid parameters
        System.out.println("\nAttempting to create a BankAccount with invalid parameters:");
        BankAccount invalidAccount = new BankAccount("Bob Wilson", -500.0);
        invalidAccount.displayInfo(); // Will show the corrected value
        
        System.out.println("\n--- Key Points about Constructor Parameters ---");
        System.out.println("1. Constructor parameters are local variables to the constructor");
        System.out.println("2. Parameters provide data to initialize instance variables");
        System.out.println("3. The 'this' keyword distinguishes instance variables from parameters");
        System.out.println("4. Parameters should be validated before assigning to instance variables");
        System.out.println("5. Parameter names can be the same as instance variable names");
    }
}

/**
 * Class that demonstrates constructor parameters for a Rectangle
 */
class Rectangle {
    // Instance variables
    private double length;
    private double width;
    private double area;
    private double perimeter;
    
    // Constructor with parameters
    public Rectangle(double length, double width) {
        // Parameters 'length' and 'width' are local variables to this constructor
        // They provide data to initialize the instance variables
        
        // Use the parameters to initialize instance variables
        this.length = length;  // 'this.length' refers to the instance variable
        this.width = width;    // 'this.width' refers to the instance variable
        
        // Calculate and initialize other instance variables based on parameters
        this.area = length * width;
        this.perimeter = 2 * (length + width);
        
        System.out.println("Rectangle created with length " + length + " and width " + width);
    }
    
    public void displayInfo() {
        System.out.println("  Length: " + length);
        System.out.println("  Width: " + width);
        System.out.println("  Area: " + area);
        System.out.println("  Perimeter: " + perimeter);
    }
}

/**
 * Class that demonstrates constructor parameters with the same names as instance variables
 */
class Person {
    // Instance variables
    private String firstName;
    private String lastName;
    private String fullName;
    
    // Constructor with parameters that have the same names as instance variables
    public Person(String firstName, String lastName) {
        // The 'this' keyword is essential here to distinguish between
        // the instance variables and the parameters with the same names
        this.firstName = firstName; // 'this.firstName' is the instance variable, 'firstName' is the parameter
        this.lastName = lastName;   // 'this.lastName' is the instance variable, 'lastName' is the parameter
        
        // Combine the parameters to initialize another instance variable
        this.fullName = firstName + " " + lastName;
        
        System.out.println("Person created: " + fullName);
    }
    
    public void displayInfo() {
        System.out.println("  First Name: " + firstName);
        System.out.println("  Last Name: " + lastName);
        System.out.println("  Full Name: " + fullName);
    }
}

/**
 * Class that demonstrates validation of constructor parameters
 */
class BankAccount {
    // Instance variables
    private String ownerName;
    private double balance;
    
    // Constructor with parameter validation
    public BankAccount(String ownerName, double initialDeposit) {
        // Validate and use the parameters to initialize instance variables
        this.ownerName = ownerName;
        
        // Validate the initialDeposit parameter before assigning to balance
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
            System.out.println("Account created for " + ownerName + " with initial deposit of $" + initialDeposit);
        } else {
            // Handle invalid parameter by using a default value
            this.balance = 0.0;
            System.out.println("Warning: Negative initial deposit not allowed. Setting balance to $0.00");
            System.out.println("Account created for " + ownerName + " with initial deposit of $0.00");
        }
    }
    
    public void displayInfo() {
        System.out.println("  Owner: " + ownerName);
        System.out.println("  Balance: $" + String.format("%.2f", balance));
    }
}
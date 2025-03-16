/**
 * MOD1D4_Exp - Example demonstrating how parameters allow values to be passed to constructors
 * 
 * This program demonstrates MOD-1.D.4:
 * Parameters allow values to be passed to the constructor to establish the initial state of the object.
 */
public class MOD1D4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating constructor parameters to establish initial object state:\n");
        
        // Example 1: Creating Student objects with different initial states
        System.out.println("Example 1: Creating Student objects with different initial states");
        Student defaultStudent = new Student();
        Student namedStudent = new Student("Alice");
        Student completeStudent = new Student("Bob", 12345);
        
        System.out.println("Default Student: " + defaultStudent);
        System.out.println("Named Student: " + namedStudent);
        System.out.println("Complete Student: " + completeStudent);
        System.out.println();
        
        // Example 2: Creating Point objects with different coordinates
        System.out.println("Example 2: Creating Point objects with different coordinates");
        Point origin = new Point(); // Default constructor (0,0)
        Point point1 = new Point(5, 10); // Parameterized constructor
        
        System.out.println("Origin Point: " + origin);
        System.out.println("Custom Point: " + point1);
        System.out.println("Distance from origin to custom point: " + origin.distanceTo(point1));
        System.out.println();
        
        // Example 3: Creating BankAccount objects with different initial balances
        System.out.println("Example 3: Creating BankAccount objects with different initial balances");
        BankAccount emptyAccount = new BankAccount("John");
        BankAccount savingsAccount = new BankAccount("Sarah", 1000.0);
        BankAccount checkingAccount = new BankAccount("Michael", 500.0, "Checking");
        
        System.out.println("Empty Account: " + emptyAccount);
        System.out.println("Savings Account: " + savingsAccount);
        System.out.println("Checking Account: " + checkingAccount);
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Constructor Parameters ---");
        System.out.println("1. Constructor parameters allow objects to be created with specific initial states");
        System.out.println("2. Different constructors can accept different parameters (constructor overloading)");
        System.out.println("3. Parameters can be used to initialize instance variables");
        System.out.println("4. Default values can be used when parameters are not provided");
        System.out.println("5. Parameters help create more flexible and reusable classes");
    }
}

/**
 * Student class with multiple constructors demonstrating parameter usage
 */
class Student {
    private String name;
    private int id;
    
    // No-parameter constructor
    public Student() {
        this.name = "Unknown";
        this.id = 0;
        System.out.println("Created student with default values");
    }
    
    // Single-parameter constructor
    public Student(String name) {
        this.name = name;
        this.id = 0;
        System.out.println("Created student with name: " + name);
    }
    
    // Two-parameter constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Created student with name: " + name + " and ID: " + id);
    }
    
    @Override
    public String toString() {
        return "Student(name=" + name + ", id=" + id + ")";
    }
}

/**
 * Point class representing a 2D coordinate
 */
class Point {
    private double x;
    private double y;
    
    // No-parameter constructor - creates origin point (0,0)
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
        System.out.println("Created point at origin (0,0)");
    }
    
    // Two-parameter constructor - creates point at specific coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("Created point at (" + x + "," + y + ")");
    }
    
    // Method to calculate distance to another point
    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    @Override
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }
}

/**
 * BankAccount class with multiple constructors
 */
class BankAccount {
    private String ownerName;
    private double balance;
    private String accountType;
    
    // Constructor with just the owner name
    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0.0;
        this.accountType = "Savings";
        System.out.println("Created empty account for " + ownerName);
    }
    
    // Constructor with owner name and initial balance
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.accountType = "Savings";
        System.out.println("Created account for " + ownerName + " with initial balance of $" + initialBalance);
    }
    
    // Constructor with owner name, initial balance, and account type
    public BankAccount(String ownerName, double initialBalance, String accountType) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.accountType = accountType;
        System.out.println("Created " + accountType + " account for " + ownerName + 
                           " with initial balance of $" + initialBalance);
    }
    
    @Override
    public String toString() {
        return "BankAccount(owner=" + ownerName + ", type=" + accountType + ", balance=$" + balance + ")";
    }
}
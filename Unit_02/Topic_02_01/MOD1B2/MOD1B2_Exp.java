/**
 * MOD1B2_Exp.java
 * 
 * This program demonstrates the concept that a class is the formal implementation,
 * or blueprint, of the attributes and behaviors of an object.
 * 
 * Knowledge Point: MOD-1.B.2
 * A class is the formal implementation, or blueprint, of the attributes and behaviors of an object.
 */
public class MOD1B2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Classes as Blueprints for Objects:\n");
        
        // Example 1: Creating objects from a class blueprint
        System.out.println("Example 1: Creating objects from a class blueprint");
        System.out.println("The Rectangle class defines the blueprint for rectangle objects");
        System.out.println("It specifies attributes (length, width) and behaviors (calculateArea, calculatePerimeter)\n");
        
        // Creating multiple Rectangle objects from the same blueprint
        Rectangle rect1 = new Rectangle(5, 3);
        Rectangle rect2 = new Rectangle(10, 7);
        
        System.out.println("Rectangle 1: " + rect1.getInfo());
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());
        
        System.out.println("\nRectangle 2: " + rect2.getInfo());
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());
        
        // Example 2: Different classes as different blueprints
        System.out.println("\nExample 2: Different classes as different blueprints");
        System.out.println("The Circle class is a different blueprint with its own attributes and behaviors\n");
        
        Circle circle = new Circle(4);
        System.out.println("Circle: " + circle.getInfo());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
        
        // Example 3: Class blueprint defines the structure for all its objects
        System.out.println("\nExample 3: Class blueprint defines the structure for all its objects");
        System.out.println("The BankAccount class defines the structure for all bank account objects\n");
        
        BankAccount account1 = new BankAccount("John Doe", 1000.0);
        BankAccount account2 = new BankAccount("Jane Smith", 2500.0);
        
        System.out.println(account1.getInfo());
        account1.deposit(500.0);
        System.out.println("After deposit: " + account1.getBalance());
        account1.withdraw(200.0);
        System.out.println("After withdrawal: " + account1.getBalance());
        
        System.out.println("\n" + account2.getInfo());
        account2.deposit(1000.0);
        System.out.println("After deposit: " + account2.getBalance());
        account2.withdraw(1500.0);
        System.out.println("After withdrawal: " + account2.getBalance());
        
        // Example 4: Class blueprint can be extended to create more specialized blueprints
        System.out.println("\nExample 4: Class blueprint can be extended to create more specialized blueprints");
        System.out.println("The SavingsAccount class extends BankAccount with additional features\n");
        
        SavingsAccount savings = new SavingsAccount("Alice Johnson", 3000.0, 0.05);
        System.out.println(savings.getInfo());
        System.out.println("Interest rate: " + savings.getInterestRate());
        savings.addInterest();
        System.out.println("After adding interest: " + savings.getBalance());
    }
}

// Rectangle class - a blueprint for rectangle objects
class Rectangle {
    // Attributes (instance variables) defined by the class
    private double length;
    private double width;
    
    // Constructor - initializes new objects
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Behaviors (methods) defined by the class
    public double calculateArea() {
        return length * width;
    }
    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    public String getInfo() {
        return "Length = " + length + ", Width = " + width;
    }
}

// Circle class - a different blueprint for circle objects
class Circle {
    private double radius;
    private final double PI = 3.14159;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return PI * radius * radius;
    }
    
    public double calculateCircumference() {
        return 2 * PI * radius;
    }
    
    public String getInfo() {
        return "Radius = " + radius;
    }
}

// BankAccount class - a blueprint for bank account objects
class BankAccount {
    private String ownerName;
    private double balance;
    
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getInfo() {
        return "Account owner: " + ownerName + ", Balance: $" + balance;
    }
}

// SavingsAccount class - extends the BankAccount blueprint with additional features
class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(String ownerName, double initialBalance, double interestRate) {
        super(ownerName, initialBalance);
        this.interestRate = interestRate;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }
}
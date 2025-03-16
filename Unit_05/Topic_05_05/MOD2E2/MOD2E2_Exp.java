/**
 * MOD2E2_Exp.java
 * This program demonstrates mutator (modifier) methods as void methods that change
 * the values of instance variables or static variables (MOD-2.E.2).
 * 
 * @author AP CSA
 */
public class MOD2E2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating mutator (modifier) methods:\n");
        
        // Example 1: Basic mutator methods for instance variables
        System.out.println("Example 1: Basic mutator methods for instance variables");
        Student student = new Student("John", 85);
        System.out.println("Initial student state: " + student);
        
        // Using mutator methods to change instance variables
        System.out.println("Calling setName(\"John Smith\") mutator method:");
        student.setName("John Smith"); // Mutator method changes name
        System.out.println("After setName(): " + student);
        
        System.out.println("Calling setScore(92) mutator method:");
        student.setScore(92); // Mutator method changes score
        System.out.println("After setScore(): " + student);
        System.out.println();
        
        // Example 2: Mutator methods with validation
        System.out.println("Example 2: Mutator methods with validation");
        BankAccount account = new BankAccount("A12345", 1000.0);
        System.out.println("Initial account state: " + account);
        
        System.out.println("Calling deposit(500.0) mutator method:");
        account.deposit(500.0); // Mutator method that validates input
        System.out.println("After deposit(): " + account);
        
        System.out.println("Calling withdraw(200.0) mutator method:");
        account.withdraw(200.0); // Mutator method that validates input
        System.out.println("After withdraw(): " + account);
        
        System.out.println("Calling withdraw(2000.0) mutator method (exceeds balance):");
        account.withdraw(2000.0); // Mutator method rejects invalid input
        System.out.println("After invalid withdraw(): " + account);
        System.out.println();
        
        // Example 3: Mutator methods for static variables
        System.out.println("Example 3: Mutator methods for static variables");
        System.out.println("Initial configuration: " + Configuration.getAppName() + ", " + 
                          "Debug mode: " + Configuration.isDebugMode());
        
        System.out.println("Calling setAppName(\"New App Name\") static mutator method:");
        Configuration.setAppName("New App Name"); // Static mutator method
        
        System.out.println("Calling setDebugMode(true) static mutator method:");
        Configuration.setDebugMode(true); // Static mutator method
        
        System.out.println("After static mutator methods: " + Configuration.getAppName() + ", " + 
                          "Debug mode: " + Configuration.isDebugMode());
        System.out.println();
        
        // Example 4: Chained mutator methods
        System.out.println("Example 4: Chained mutator methods");
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Initial rectangle: " + rect);
        
        System.out.println("Calling chained mutator methods: rect.setWidth(8).setHeight(15)");
        rect.setWidth(8).setHeight(15); // Chained mutator methods
        System.out.println("After chained mutators: " + rect);
        System.out.println();
        
        // Example 5: Mutator methods that maintain object invariants
        System.out.println("Example 5: Mutator methods that maintain object invariants");
        Circle circle = new Circle(5.0);
        System.out.println("Initial circle: " + circle);
        
        System.out.println("Calling setRadius(7.5) mutator method:");
        circle.setRadius(7.5); // Mutator method updates radius and recalculates area
        System.out.println("After setRadius(): " + circle);
        System.out.println();
        
        System.out.println("Key points about mutator (modifier) methods:");
        System.out.println("- Mutator methods are typically void methods that change object state");
        System.out.println("- They modify instance variables or static variables");
        System.out.println("- They often include validation to ensure data integrity");
        System.out.println("- They can maintain object invariants by updating related properties");
        System.out.println("- They can be designed to return 'this' for method chaining");
        System.out.println("- They work with accessor methods to provide controlled access to data");
    }
}

/**
 * A class that demonstrates basic mutator methods for instance variables.
 */
class Student {
    private String name;
    private int score;
    
    /**
     * Constructor to initialize student data.
     */
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
    /**
     * Accessor method for name.
     * 
     * @return the student's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Mutator method for name.
     * Changes the value of the name instance variable.
     * 
     * @param name the new name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Accessor method for score.
     * 
     * @return the student's score
     */
    public int getScore() {
        return score;
    }
    
    /**
     * Mutator method for score.
     * Changes the value of the score instance variable.
     * 
     * @param score the new score to set
     */
    public void setScore(int score) {
        this.score = score;
    }
    
    /**
     * Returns a string representation of the student.
     * 
     * @return a string representation
     */
    @Override
    public String toString() {
        return "Student[name=\"" + name + "\", score=" + score + "]";
    }
}

/**
 * A class that demonstrates mutator methods with validation.
 */
class BankAccount {
    private String accountNumber;
    private double balance;
    
    /**
     * Constructor to initialize account data.
     */
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    /**
     * Accessor method for account number.
     * 
     * @return the account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }
    
    /**
     * Accessor method for balance.
     * 
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Mutator method that deposits money.
     * Changes the value of the balance instance variable with validation.
     * 
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive");
        }
    }
    
    /**
     * Mutator method that withdraws money.
     * Changes the value of the balance instance variable with validation.
     * 
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
        }
    }
    
    /**
     * Returns a string representation of the account.
     * 
     * @return a string representation
     */
    @Override
    public String toString() {
        return "BankAccount[accountNumber=\"" + accountNumber + "\", balance=$" + 
               String.format("%.2f", balance) + "]";
    }
}

/**
 * A class that demonstrates static mutator methods.
 */
class Configuration {
    private static String appName = "Default App";
    private static boolean debugMode = false;
    
    /**
     * Private constructor to prevent instantiation.
     */
    private Configuration() {
        // This class should not be instantiated
    }
    
    /**
     * Static accessor method for app name.
     * 
     * @return the application name
     */
    public static String getAppName() {
        return appName;
    }
    
    /**
     * Static mutator method for app name.
     * Changes the value of the static appName variable.
     * 
     * @param name the new application name
     */
    public static void setAppName(String name) {
        appName = name;
    }
    
    /**
     * Static accessor method for debug mode.
     * 
     * @return the debug mode state
     */
    public static boolean isDebugMode() {
        return debugMode;
    }
    
    /**
     * Static mutator method for debug mode.
     * Changes the value of the static debugMode variable.
     * 
     * @param mode the new debug mode state
     */
    public static void setDebugMode(boolean mode) {
        debugMode = mode;
    }
}

/**
 * A class that demonstrates chained mutator methods.
 */
class Rectangle {
    private int width;
    private int height;
    
    /**
     * Constructor to initialize rectangle data.
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    /**
     * Accessor method for width.
     * 
     * @return the width
     */
    public int getWidth() {
        return width;
    }
    
    /**
     * Mutator method for width that returns this object for chaining.
     * Changes the value of the width instance variable.
     * 
     * @param width the new width
     * @return this Rectangle object for method chaining
     */
    public Rectangle setWidth(int width) {
        this.width = width;
        return this; // Return this object for method chaining
    }
    
    /**
     * Accessor method for height.
     * 
     * @return the height
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * Mutator method for height that returns this object for chaining.
     * Changes the value of the height instance variable.
     * 
     * @param height the new height
     * @return this Rectangle object for method chaining
     */
    public Rectangle setHeight(int height) {
        this.height = height;
        return this; // Return this object for method chaining
    }
    
    /**
     * Returns a string representation of the rectangle.
     * 
     * @return a string representation
     */
    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + "]";
    }
}

/**
 * A class that demonstrates mutator methods that maintain object invariants.
 */
class Circle {
    private double radius;
    private double area; // Derived from radius
    
    /**
     * Constructor to initialize circle data.
     */
    public Circle(double radius) {
        this.radius = radius;
        recalculateArea(); // Maintain the invariant
    }
    
    /**
     * Accessor method for radius.
     * 
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Mutator method for radius.
     * Changes the value of the radius instance variable and updates area.
     * 
     * @param radius the new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
        recalculateArea(); // Maintain the invariant
    }
    
    /**
     * Accessor method for area.
     * 
     * @return the area
     */
    public double getArea() {
        return area;
    }
    
    /**
     * Private helper method to recalculate area when radius changes.
     * This maintains the object invariant that area = π * radius^2.
     */
    private void recalculateArea() {
        area = Math.PI * radius * radius;
    }
    
    /**
     * Returns a string representation of the circle.
     * 
     * @return a string representation
     */
    @Override
    public String toString() {
        return String.format("Circle[radius=%.1f, area=%.2f]", radius, area);
    }
}
/**
 * MOD2E2_Err.java
 * This program demonstrates common errors when using mutator (modifier) methods (MOD-2.E.2).
 * 
 * @author AP CSA
 */
public class MOD2E2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with mutator methods:\n");
        
        // Error 1: Mutator method without validation
        System.out.println("Error 1: Mutator method without validation");
        StudentWithBadMutators student = new StudentWithBadMutators("John", 85);
        System.out.println("Initial student state: " + student);
        
        // Setting an invalid score
        System.out.println("Calling setScore(-10) without validation:");
        student.setScore(-10); // No validation in mutator method
        System.out.println("After setScore(-10): " + student);
        System.out.println("The score is now negative, which should not be allowed.");
        System.out.println();
        
        // Error 2: Mutator method that doesn't maintain object invariants
        System.out.println("Error 2: Mutator method that doesn't maintain object invariants");
        CircleWithBadMutators circle = new CircleWithBadMutators(5.0);
        System.out.println("Initial circle: " + circle);
        
        System.out.println("Calling setRadius(7.5) without updating area:");
        circle.setRadius(7.5); // Doesn't update the area
        System.out.println("After setRadius(7.5): " + circle);
        System.out.println("The area is now inconsistent with the radius.");
        System.out.println();
        
        // Error 3: Mutator method with side effects
        System.out.println("Error 3: Mutator method with side effects");
        BankAccountWithBadMutators account = new BankAccountWithBadMutators("A12345", 1000.0);
        System.out.println("Initial account state: " + account);
        
        System.out.println("Calling setBalance(1500.0) with side effects:");
        account.setBalance(1500.0); // Has unexpected side effects
        System.out.println("After setBalance(1500.0): " + account);
        System.out.println("The account number was unexpectedly changed.");
        System.out.println();
        
        // Error 4: Static mutator method without access control
        System.out.println("Error 4: Static mutator method without access control");
        System.out.println("Initial configuration: " + ConfigWithBadMutators.appName);
        
        // Direct access to static variable instead of using mutator
        System.out.println("Directly modifying static variable instead of using mutator:");
        ConfigWithBadMutators.appName = "Hacked App"; // Direct access bypasses validation
        System.out.println("After direct modification: " + ConfigWithBadMutators.appName);
        System.out.println("Static variables should be private with controlled access through mutators.");
        System.out.println();
        
        // Error 5: Mutator method that doesn't properly update related fields
        System.out.println("Error 5: Mutator method that doesn't properly update related fields");
        PersonWithBadMutators person = new PersonWithBadMutators("Alice", 25);
        System.out.println("Initial person state: " + person);
        
        System.out.println("Calling setBirthYear(1990) without updating age:");
        person.setBirthYear(1990); // Doesn't update the age field
        System.out.println("After setBirthYear(1990): " + person);
        System.out.println("The age and birth year are now inconsistent.");
        System.out.println();
        
        System.out.println("Key points about errors with mutator methods:");
        System.out.println("- Always include validation in mutator methods to ensure data integrity");
        System.out.println("- Maintain object invariants by updating all related fields");
        System.out.println("- Avoid unexpected side effects in mutator methods");
        System.out.println("- Make instance and static variables private and control access through mutators");
        System.out.println("- Keep related fields consistent when one is modified");
    }
}

/**
 * A class with mutator methods that don't include validation.
 */
class StudentWithBadMutators {
    private String name;
    private int score;
    
    /**
     * Constructor to initialize student data.
     */
    public StudentWithBadMutators(String name, int score) {
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
     * Mutator method for score without validation.
     * ERROR: Should validate that score is not negative.
     * 
     * @param score the new score to set
     */
    public void setScore(int score) {
        // ERROR: No validation to ensure score is valid (e.g., not negative)
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
 * A class with mutator methods that don't maintain object invariants.
 */
class CircleWithBadMutators {
    private double radius;
    private double area;
    
    /**
     * Constructor to initialize circle data.
     */
    public CircleWithBadMutators(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius; // Calculate initial area
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
     * Mutator method for radius that doesn't maintain invariants.
     * ERROR: Doesn't update the area when radius changes.
     * 
     * @param radius the new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
        // ERROR: Doesn't update area, breaking the object invariant
        // Should include: this.area = Math.PI * radius * radius;
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
     * Returns a string representation of the circle.
     * 
     * @return a string representation
     */
    @Override
    public String toString() {
        return String.format("Circle[radius=%.1f, area=%.2f]", radius, area);
    }
}

/**
 * A class with mutator methods that have unexpected side effects.
 */
class BankAccountWithBadMutators {
    private String accountNumber;
    private double balance;
    
    /**
     * Constructor to initialize account data.
     */
    public BankAccountWithBadMutators(String accountNumber, double initialBalance) {
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
     * Mutator method for balance with unexpected side effects.
     * ERROR: Also changes the account number, which is unexpected.
     * 
     * @param newBalance the new balance to set
     */
    public void setBalance(double newBalance) {
        this.balance = newBalance;
        
        // ERROR: Unexpected side effect - changing unrelated field
        this.accountNumber = "B" + accountNumber.substring(1);
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
 * A class with static variables that aren't properly encapsulated.
 */
class ConfigWithBadMutators {
    // ERROR: Public static variables allow direct access without validation
    public static String appName = "Default App";
    public static boolean debugMode = false;
    
    /**
     * Static mutator method for app name.
     * 
     * @param name the new application name
     */
    public static void setAppName(String name) {
        if (name != null && !name.isEmpty()) {
            appName = name;
        }
    }
    
    /**
     * Static mutator method for debug mode.
     * 
     * @param mode the new debug mode state
     */
    public static void setDebugMode(boolean mode) {
        debugMode = mode;
    }
}

/**
 * A class with mutator methods that don't properly update related fields.
 */
class PersonWithBadMutators {
    private String name;
    private int age;
    private int birthYear;
    
    /**
     * Constructor to initialize person data.
     */
    public PersonWithBadMutators(String name, int age) {
        this.name = name;
        this.age = age;
        this.birthYear = java.time.Year.now().getValue() - age; // Calculate birth year
    }
    
    /**
     * Accessor method for name.
     * 
     * @return the person's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Mutator method for name.
     * 
     * @param name the new name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Accessor method for age.
     * 
     * @return the person's age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Mutator method for age that properly updates related fields.
     * 
     * @param age the new age to set
     */
    public void setAge(int age) {
        this.age = age;
        this.birthYear = java.time.Year.now().getValue() - age; // Update birth year
    }
    
    /**
     * Accessor method for birth year.
     * 
     * @return the person's birth year
     */
    public int getBirthYear() {
        return birthYear;
    }
    
    /**
     * Mutator method for birth year that doesn't update related fields.
     * ERROR: Doesn't update the age when birth year changes.
     * 
     * @param year the new birth year to set
     */
    public void setBirthYear(int year) {
        this.birthYear = year;
        // ERROR: Doesn't update age, breaking consistency
        // Should include: this.age = java.time.Year.now().getValue() - year;
    }
    
    /**
     * Returns a string representation of the person.
     * 
     * @return a string representation
     */
    @Override
    public String toString() {
        return "Person[name=\"" + name + "\", age=" + age + ", birthYear=" + birthYear + "]";
    }
}
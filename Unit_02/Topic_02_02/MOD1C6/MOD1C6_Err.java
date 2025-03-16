/**
 * MOD1C6_Err.java
 * 
 * This program demonstrates common errors and misconceptions when using call by value parameter passing in constructors.
 * 
 * Knowledge Point: MOD-1.C.6
 * Parameters are passed using call by value. Call by value initializes the formal parameters
 * with copies of the actual parameters.
 */
public class MOD1C6_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Call By Value Parameter Passing Errors:\n");
        
        // Example 1: Misconception about modifying primitive parameters
        System.out.println("Example 1: Misconception about modifying primitive parameters");
        int age = 25;
        double salary = 50000.0;
        System.out.println("Before constructor call: age = " + age + ", salary = " + salary);
        
        Employee emp1 = new Employee("John", age, salary);
        emp1.displayInfo();
        
        // ERROR 1: Expecting the original variables to be modified
        System.out.println("After constructor call: age = " + age + ", salary = " + salary);
        System.out.println("Note: Original variables remain unchanged because Java uses call by value\n");
        
        // Example 2: Misconception about reference parameters
        System.out.println("Example 2: Misconception about reference parameters");
        Address address = new Address("123 Main St", "Anytown", "12345");
        System.out.println("Before constructor call:");
        address.display();
        
        Employee emp2 = new Employee("Alice", 30, 60000.0, address);
        emp2.displayInfo();
        
        // ERROR 2: Expecting the reference itself to be modified
        System.out.println("After constructor call:");
        if (address == null) {
            System.out.println("Address is null");
        } else {
            address.display();
            System.out.println("Note: The reference variable still points to the original object\n");
        }
        
        // Example 3: Misconception about object state
        System.out.println("Example 3: Misconception about object state");
        MutableInteger count = new MutableInteger(10);
        System.out.println("Before constructor call: count = " + count.getValue());
        
        Employee emp3 = new Employee("Bob", 35, 70000.0, count);
        emp3.displayInfo();
        
        // ERROR 3: Not realizing that object state can be modified
        System.out.println("After constructor call: count = " + count.getValue());
        System.out.println("Note: The object's state was modified even though Java uses call by value\n");
        
        System.out.println("Common misconceptions about call by value:");
        System.out.println("1. Thinking that changes to formal parameters affect the actual parameters");
        System.out.println("2. Thinking that Java uses 'call by reference' for objects");
        System.out.println("3. Not understanding that object references are passed by value");
        System.out.println("4. Confusing modifying a reference with modifying the object it points to");
    }
}

// Address class to demonstrate reference type parameters
class Address {
    private String street;
    private String city;
    private String zipCode;
    
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    
    public void display() {
        System.out.println("Address: " + street + ", " + city + ", " + zipCode);
    }
}

// MutableInteger class to demonstrate object state modification
class MutableInteger {
    private int value;
    
    public MutableInteger(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
}

// Employee class with constructors demonstrating call by value errors
class Employee {
    private String name;
    private int age;
    private double salary;
    private Address address;
    private MutableInteger count;
    
    // Constructor with primitive parameters
    public Employee(String name, int age, double salary) {
        System.out.println("Constructor called with primitive parameters");
        this.name = name;
        this.age = age;
        this.salary = salary;
        
        // ERROR 1: Attempting to modify the caller's variables
        // This only modifies the local copies, not the original variables
        age = 0;
        salary = 0.0;
        
        System.out.println("Inside constructor after modification: age = " + age + ", salary = " + salary);
        System.out.println("Note: These changes only affect the local copies, not the original variables");
    }
    
    // Constructor with reference parameter
    public Employee(String name, int age, double salary, Address address) {
        System.out.println("Constructor called with reference parameter");
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
        
        // ERROR 2: Attempting to modify the caller's reference variable
        // This only modifies the local copy of the reference, not the original reference
        address = null;
        
        System.out.println("Inside constructor after setting address to null");
        System.out.println("Note: This only affects the local copy of the reference");
    }
    
    // Constructor with mutable object parameter
    public Employee(String name, int age, double salary, MutableInteger count) {
        System.out.println("Constructor called with mutable object parameter");
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.count = count;
        
        // This modifies the object's state, which is visible to the caller
        count.setValue(count.getValue() + 100);
        
        System.out.println("Inside constructor after modifying count: " + count.getValue());
        System.out.println("Note: The object's state is modified, which is visible outside the constructor");
    }
    
    // Method to display employee information
    public void displayInfo() {
        System.out.println("\nEmployee Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        if (address != null) {
            address.display();
        }
        if (count != null) {
            System.out.println("Count: " + count.getValue());
        }
    }
}
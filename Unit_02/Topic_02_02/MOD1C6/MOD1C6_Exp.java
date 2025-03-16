/**
 * MOD1C6_Exp.java
 * 
 * This program demonstrates the correct usage of call by value parameter passing in constructors.
 * 
 * Knowledge Point: MOD-1.C.6
 * Parameters are passed using call by value. Call by value initializes the formal parameters
 * with copies of the actual parameters.
 */
public class MOD1C6_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Call By Value Parameter Passing:\n");
        
        // Example 1: Passing primitive types
        System.out.println("Example 1: Passing primitive types");
        int age = 25;
        double salary = 50000.0;
        System.out.println("Before constructor call: age = " + age + ", salary = " + salary);
        
        Employee emp1 = new Employee("John", age, salary);
        emp1.displayInfo();
        
        System.out.println("After constructor call: age = " + age + ", salary = " + salary);
        System.out.println("Note: Original variables remain unchanged\n");
        
        // Example 2: Passing reference types
        System.out.println("Example 2: Passing reference types");
        Address address = new Address("123 Main St", "Anytown", "12345");
        System.out.println("Before constructor call:");
        address.display();
        
        Employee emp2 = new Employee("Alice", 30, 60000.0, address);
        emp2.displayInfo();
        
        System.out.println("After constructor call:");
        address.display();
        System.out.println("Note: The reference variable points to the same object\n");
        
        // Example 3: Modifying the object that a reference parameter points to
        System.out.println("Example 3: Modifying the object that a reference parameter points to");
        Address address2 = new Address("456 Oak Ave", "Somewhere", "67890");
        System.out.println("Before constructor call:");
        address2.display();
        
        Employee emp3 = new Employee("Bob", 35, 70000.0, address2, true);
        emp3.displayInfo();
        
        System.out.println("After constructor call:");
        address2.display();
        System.out.println("Note: Changes to the object are visible outside the constructor\n");
        
        System.out.println("Call by value parameter passing:");
        System.out.println("- Formal parameters receive copies of the values of actual parameters");
        System.out.println("- Changes to primitive parameter values inside methods don't affect the original variables");
        System.out.println("- For reference types, the reference itself is copied (not the object)");
        System.out.println("- Changes to objects via reference parameters are visible outside the method");
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
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public void display() {
        System.out.println("Address: " + street + ", " + city + ", " + zipCode);
    }
}

// Employee class with constructors demonstrating call by value
class Employee {
    private String name;
    private int age;
    private double salary;
    private Address address;
    
    // Constructor with primitive parameters
    public Employee(String name, int age, double salary) {
        System.out.println("Constructor called with primitive parameters");
        this.name = name;
        
        // Modifying the formal parameter (age) doesn't affect the original variable
        this.age = age;
        age = 0; // This change only affects the local copy
        
        // Modifying the formal parameter (salary) doesn't affect the original variable
        this.salary = salary;
        salary = 0.0; // This change only affects the local copy
        
        System.out.println("Inside constructor: age = " + age + ", salary = " + salary);
    }
    
    // Constructor with reference parameter
    public Employee(String name, int age, double salary, Address address) {
        System.out.println("Constructor called with reference parameter");
        this.name = name;
        this.age = age;
        this.salary = salary;
        
        // The reference is copied, so this.address and the parameter address
        // point to the same object
        this.address = address;
        
        // Changing the reference doesn't affect the original reference variable
        address = null; // This only affects the local copy of the reference
    }
    
    // Constructor that modifies the object through the reference parameter
    public Employee(String name, int age, double salary, Address address, boolean modifyAddress) {
        System.out.println("Constructor called with reference parameter and modification");
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
        
        if (modifyAddress) {
            // Modifying the object that the reference points to
            // These changes are visible outside the constructor
            address.setStreet("Modified " + address.street);
            address.setCity("Modified " + address.city);
        }
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
    }
}
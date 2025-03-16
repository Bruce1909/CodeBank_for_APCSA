/**
 * MOD1E6_Exp.java
 * 
 * This program demonstrates that the dot operator is used along with the object name
 * to call non-static methods.
 * 
 * Knowledge Point: MOD-1.E.6
 * The dot operator is used along with the object name to call non-static methods.
 */
public class MOD1E6_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating the dot operator for calling non-static methods:\n");
        
        // Create objects of different classes
        MOD1E6_Exp demo = new MOD1E6_Exp();
        Car myCar = new Car();
        Dog myDog = new Dog();
        
        // Using the dot operator to call methods on the demo object
        System.out.println("Using the dot operator with the demo object:");
        demo.displayMessage();  // Using the dot operator with the demo object
        
        // Using the dot operator to call methods on the myCar object
        System.out.println("\nUsing the dot operator with the myCar object:");
        myCar.start();          // Using the dot operator with the myCar object
        myCar.accelerate();     // Using the dot operator with the myCar object
        myCar.brake();          // Using the dot operator with the myCar object
        
        // Using the dot operator to call methods on the myDog object
        System.out.println("\nUsing the dot operator with the myDog object:");
        myDog.bark();           // Using the dot operator with the myDog object
        myDog.eat();            // Using the dot operator with the myDog object
        
        // Demonstrate chaining method calls using the dot operator
        System.out.println("\nDemonstrating method chaining with the dot operator:");
        TextProcessor text = new TextProcessor("Hello, World!");
        
        // Chain multiple method calls using the dot operator
        text.toUpperCase().addExclamation().display();
        
        // Demonstrate accessing instance variables using the dot operator
        System.out.println("\nDemonstrating accessing instance variables with the dot operator:");
        Person person = new Person();
        person.name = "Alice";  // Using the dot operator to access an instance variable
        person.age = 25;        // Using the dot operator to access an instance variable
        person.displayInfo();    // Using the dot operator to call a method
    }
    
    // Non-static method that will be called using the dot operator
    public void displayMessage() {
        System.out.println("This method was called using the dot operator.");
    }
}

// Car class with methods that will be called using the dot operator
class Car {
    public void start() {
        System.out.println("The car is starting.");
    }
    
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
    
    public void brake() {
        System.out.println("The car is braking.");
    }
}

// Dog class with methods that will be called using the dot operator
class Dog {
    public void bark() {
        System.out.println("Woof! Woof!");
    }
    
    public void eat() {
        System.out.println("The dog is eating.");
    }
}

// TextProcessor class to demonstrate method chaining with the dot operator
class TextProcessor {
    private String text;
    
    public TextProcessor(String text) {
        this.text = text;
    }
    
    // Returns this object to allow method chaining
    public TextProcessor toUpperCase() {
        text = text.toUpperCase();
        return this;
    }
    
    // Returns this object to allow method chaining
    public TextProcessor addExclamation() {
        text = text + "!!!";
        return this;
    }
    
    // Displays the processed text
    public void display() {
        System.out.println("Processed text: " + text);
    }
}

// Person class to demonstrate accessing instance variables with the dot operator
class Person {
    // Public instance variables for demonstration purposes
    public String name;
    public int age;
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
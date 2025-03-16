/**
 * MOD1E3_Exp.java
 * 
 * This program demonstrates method signatures for methods without parameters.
 * 
 * Knowledge Point: MOD-1.E.3
 * A method signature for a method without parameters consists of the method name and an empty parameter list.
 */
public class MOD1E3_Exp {
    public static void main(String[] args) {
        // Create an instance of the class to call non-static methods
        MOD1E3_Exp demo = new MOD1E3_Exp();
        
        System.out.println("Demonstrating method signatures for methods without parameters:\n");
        
        // Call methods with different signatures (all without parameters)
        System.out.println("Calling greet() - method with no parameters:");
        demo.greet();
        
        System.out.println("\nCalling displayCurrentTime() - method with no parameters:");
        demo.displayCurrentTime();
        
        System.out.println("\nCalling makeSound() - method with no parameters:");
        demo.makeSound();
        
        // Create an Animal object to demonstrate method signatures in another class
        System.out.println("\nDemonstrating method signatures in the Animal class:");
        Animal dog = new Animal();
        
        // Call methods with empty parameter lists
        dog.speak();      // Method signature: speak()
        dog.eat();        // Method signature: eat()
        dog.sleep();      // Method signature: sleep()
    }
    
    // Method with signature: greet()
    // The signature consists of the method name (greet) and an empty parameter list ()
    public void greet() {
        System.out.println("Hello! This method has no parameters.");
    }
    
    // Method with signature: displayCurrentTime()
    // The signature consists of the method name (displayCurrentTime) and an empty parameter list ()
    public void displayCurrentTime() {
        System.out.println("The current time is: " + java.time.LocalTime.now());
    }
    
    // Method with signature: makeSound()
    // The signature consists of the method name (makeSound) and an empty parameter list ()
    public void makeSound() {
        System.out.println("Beep! This is a sound made by a method with no parameters.");
    }
}

// Another class with methods that have no parameters
class Animal {
    // Method with signature: speak()
    public void speak() {
        System.out.println("The animal makes a sound.");
    }
    
    // Method with signature: eat()
    public void eat() {
        System.out.println("The animal is eating.");
    }
    
    // Method with signature: sleep()
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
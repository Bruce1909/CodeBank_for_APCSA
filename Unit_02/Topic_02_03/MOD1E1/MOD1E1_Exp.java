/**
 * MOD1E1_Exp.java
 * 
 * This program demonstrates that an object's behavior is defined by its methods.
 * 
 * Knowledge Point: MOD-1.E.1
 * An object's behavior refers to what the object can do (or what can be done to it) 
 * and is defined by methods.
 */
public class MOD1E1_Exp {
    public static void main(String[] args) {
        // Create instances of different objects with different behaviors
        Car myCar = new Car();
        Dog myDog = new Dog();
        
        System.out.println("Demonstrating object behaviors defined by methods:\n");
        
        // Demonstrate car behaviors through its methods
        System.out.println("Car behaviors:");
        myCar.start();        // Car behavior: starting
        myCar.accelerate();   // Car behavior: accelerating
        myCar.brake();        // Car behavior: braking
        myCar.honk();         // Car behavior: honking
        
        System.out.println("\nDog behaviors:");
        myDog.bark();         // Dog behavior: barking
        myDog.eat();          // Dog behavior: eating
        myDog.sleep();        // Dog behavior: sleeping
        myDog.play();         // Dog behavior: playing
    }
}

// Car class with methods defining its behaviors
class Car {
    // Methods define what a Car object can do
    public void start() {
        System.out.println("The car is starting.");
    }
    
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
    
    public void brake() {
        System.out.println("The car is braking.");
    }
    
    public void honk() {
        System.out.println("Beep! Beep!");
    }
}

// Dog class with methods defining its behaviors
class Dog {
    // Methods define what a Dog object can do
    public void bark() {
        System.out.println("Woof! Woof!");
    }
    
    public void eat() {
        System.out.println("The dog is eating.");
    }
    
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }
    
    public void play() {
        System.out.println("The dog is playing.");
    }
}
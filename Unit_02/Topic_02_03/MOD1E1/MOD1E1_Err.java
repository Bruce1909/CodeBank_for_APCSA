/**
 * MOD1E1_Err.java
 * 
 * This program demonstrates common errors related to understanding that an object's behavior
 * is defined by its methods.
 * 
 * Knowledge Point: MOD-1.E.1
 * An object's behavior refers to what the object can do (or what can be done to it) 
 * and is defined by methods.
 */
public class MOD1E1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to object behaviors:\n");
        
        // ERROR 1: Trying to access behaviors (methods) that don't exist for an object
        System.out.println("ERROR 1: Trying to access behaviors (methods) that don't exist");
        Car myCar = new Car();
        System.out.println("The following line would cause a compilation error:");
        // myCar.fly();  // Error: method fly() does not exist in Car class
        System.out.println("Cars don't have a 'fly' behavior because the method is not defined.\n");
        
        // ERROR 2: Confusing object behaviors with class behaviors (static vs non-static)
        System.out.println("ERROR 2: Confusing object behaviors with class behaviors");
        System.out.println("The following line would cause a compilation error:");
        // Car.start();  // Error: non-static method start() cannot be referenced from a static context
        System.out.println("The start() method is an object behavior, not a class behavior.\n");
        
        // ERROR 3: Trying to use an object's behavior without creating the object
        System.out.println("ERROR 3: Trying to use an object's behavior without creating the object");
        System.out.println("The following code would cause a compilation error:");
        // Dog myDog;  // Only declared, not instantiated
        // myDog.bark();  // Error: variable myDog might not have been initialized
        System.out.println("An object must be created before its behaviors can be used.\n");
        
        // ERROR 4: Misunderstanding that behaviors are defined by methods
        System.out.println("ERROR 4: Misunderstanding that behaviors are defined by methods");
        EmptyCar emptyCar = new EmptyCar();
        System.out.println("The EmptyCar class has no defined behaviors (methods).");
        System.out.println("Therefore, the object can't do anything except exist.\n");
    }
}

// Car class with methods defining its behaviors
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

// A class with no methods has no defined behaviors
class EmptyCar {
    // This class has no methods, so objects of this class have no behaviors
    // They can only store data (if instance variables were defined)
}

// Dog class declaration (not instantiated in the error examples)
class Dog {
    public void bark() {
        System.out.println("Woof! Woof!");
    }
}
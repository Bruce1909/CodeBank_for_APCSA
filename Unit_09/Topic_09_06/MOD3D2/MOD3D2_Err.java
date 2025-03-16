/**
 * This program demonstrates common errors related to compile-time method checking (MOD-3.D.2).
 * It shows what happens when you try to call methods not defined in the declared type.
 */
public class MOD3D2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating compile-time method checking errors (MOD-3.D.2):\n");
        
        // Create objects with different declared types
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();          // Car object with Vehicle reference
        Car actualCar = new Car();        // Car object with Car reference
        Vehicle motorcycle = new Motorcycle(); // Motorcycle object with Vehicle reference
        
        // ERROR 1: Attempting to call subclass-specific methods through superclass reference
        System.out.println("--- ERROR 1: Calling subclass-specific methods through superclass reference ---");
        System.out.println("car is actually a Car object: " + (car instanceof Car));
        
        // These would cause compile-time errors (commented out to allow compilation)
        // car.honk();         // Error: honk() is not defined in Vehicle class
        // motorcycle.wheelie(); // Error: wheelie() is not defined in Vehicle class
        
        System.out.println("Cannot call car.honk() - not defined in Vehicle class");
        System.out.println("Cannot call motorcycle.wheelie() - not defined in Vehicle class");
        
        // Correct approach: Cast to the appropriate type first
        System.out.println("\nCorrect approach - cast to appropriate type first:");
        ((Car) car).honk();  // Works after casting
        ((Motorcycle) motorcycle).wheelie();  // Works after casting
        
        // ERROR 2: Forgetting to check type before casting
        System.out.println("\n--- ERROR 2: Forgetting to check type before casting ---");
        
        // This would cause a runtime ClassCastException (commented out to allow compilation)
        // ((Motorcycle) car).wheelie();  // Runtime error: Car cannot be cast to Motorcycle
        
        System.out.println("((Motorcycle) car).wheelie(); // Would throw ClassCastException at runtime");
        System.out.println("Always check the type before casting:");
        
        if (car instanceof Motorcycle) {
            ((Motorcycle) car).wheelie();
        } else {
            System.out.println("car is not a Motorcycle, cannot call wheelie()");
        }
        
        // ERROR 3: Confusing static and non-static method resolution
        System.out.println("\n--- ERROR 3: Confusing static and non-static method resolution ---");
        
        StaticSuperclass superRef = new StaticSubclass();
        
        // Static method - bound at compile time to the reference type
        superRef.staticMethod();  // Calls StaticSuperclass.staticMethod()
        
        // Non-static method - bound at runtime to the actual object type
        superRef.instanceMethod(); // Calls StaticSubclass.instanceMethod()
        
        System.out.println("\nStatic methods are resolved based on the reference type at compile time.");
        System.out.println("Non-static methods are resolved based on the actual object type at runtime.");
        
        // ERROR 4: Trying to override final methods
        System.out.println("\n--- ERROR 4: Trying to override final methods ---");
        System.out.println("The FinalMethodSubclass attempts to override a final method from FinalMethodSuperclass.");
        System.out.println("This would cause a compile-time error (see the class definition).");
        
        // ERROR 5: Overriding with incompatible return types
        System.out.println("\n--- ERROR 5: Overriding with incompatible return types ---");
        System.out.println("The IncompatibleReturnSubclass attempts to override a method with an incompatible return type.");
        System.out.println("This would cause a compile-time error (see the class definition).");
        
        // Summary
        System.out.println("\n--- Common Errors with Compile-Time Method Checking ---");
        System.out.println("1. Attempting to call subclass-specific methods through a superclass reference");
        System.out.println("2. Forgetting to check the object type before casting");
        System.out.println("3. Confusing static method resolution (compile-time) with non-static method resolution (runtime)");
        System.out.println("4. Attempting to override final methods");
        System.out.println("5. Overriding methods with incompatible return types");
    }
}

// Vehicle class hierarchy
class Vehicle {
    public void start() {
        System.out.println("Vehicle starting");
    }
    
    public void stop() {
        System.out.println("Vehicle stopping");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starting - turn key in ignition");
    }
    
    // Additional method not in Vehicle
    public void honk() {
        System.out.println("Car honks: Beep! Beep!");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle starting - kick start");
    }
    
    // Additional method not in Vehicle
    public void wheelie() {
        System.out.println("Motorcycle does a wheelie");
    }
}

// Classes demonstrating static vs non-static method resolution
class StaticSuperclass {
    // Static method - cannot be overridden, only hidden
    public static void staticMethod() {
        System.out.println("StaticSuperclass.staticMethod() called");
    }
    
    // Non-static method - can be overridden
    public void instanceMethod() {
        System.out.println("StaticSuperclass.instanceMethod() called");
    }
}

class StaticSubclass extends StaticSuperclass {
    // This hides the superclass method (not overriding)
    public static void staticMethod() {
        System.out.println("StaticSubclass.staticMethod() called");
    }
    
    // This overrides the superclass method
    @Override
    public void instanceMethod() {
        System.out.println("StaticSubclass.instanceMethod() called");
    }
}

// Classes demonstrating final method errors
class FinalMethodSuperclass {
    // Final method cannot be overridden
    public final void finalMethod() {
        System.out.println("This method cannot be overridden");
    }
}

class FinalMethodSubclass extends FinalMethodSuperclass {
    // This would cause a compile-time error
    // Uncommenting this would prevent compilation
    /*
    @Override
    public void finalMethod() { // Error: Cannot override final method
        System.out.println("Attempting to override a final method");
    }
    */
}

// Classes demonstrating incompatible return type errors
class IncompatibleReturnSuperclass {
    public Number getValue() {
        return 10;
    }
}

class IncompatibleReturnSubclass extends IncompatibleReturnSuperclass {
    // This would cause a compile-time error
    // Uncommenting this would prevent compilation
    /*
    @Override
    public String getValue() { // Error: Incompatible return type
        return "10";
    }
    */
    
    // This would be valid (covariant return type)
    @Override
    public Integer getValue() {
        return 20;
    }
}
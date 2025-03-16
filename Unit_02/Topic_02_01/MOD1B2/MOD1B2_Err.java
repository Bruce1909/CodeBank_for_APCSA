/**
 * MOD1B2_Err.java
 * 
 * This program demonstrates common errors and mistakes related to classes
 * as blueprints for objects.
 * 
 * Knowledge Point: MOD-1.B.2
 * A class is the formal implementation, or blueprint, of the attributes and behaviors of an object.
 */
public class MOD1B2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Classes as Blueprints:\n");
        
        // ERROR 1: Forgetting to define a constructor
        System.out.println("ERROR 1: Forgetting to define a constructor");
        System.out.println("When no constructor is defined, Java provides a default no-argument constructor");
        System.out.println("But if you define any constructor, Java no longer provides the default one");
        
        // Uncommenting the following would cause a compilation error
        // IncompleteRectangle rect = new IncompleteRectangle(); // Error: no default constructor available
        
        // This works because we're using the defined constructor
        IncompleteRectangle rect = new IncompleteRectangle(5, 3);
        System.out.println("Using defined constructor: " + rect.getInfo());
        System.out.println();
        
        // ERROR 2: Forgetting to initialize instance variables
        System.out.println("ERROR 2: Forgetting to initialize instance variables");
        UninitializedCircle circle = new UninitializedCircle(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area calculation uses uninitialized PI: " + circle.calculateArea());
        System.out.println("The PI value was not initialized and defaulted to 0.0");
        System.out.println();
        
        // ERROR 3: Improper encapsulation - public instance variables
        System.out.println("ERROR 3: Improper encapsulation - public instance variables");
        PoorlyEncapsulatedPerson person = new PoorlyEncapsulatedPerson();
        person.name = "John"; // Direct access to public field
        person.age = -30; // Can set invalid age because there's no validation
        System.out.println("Person with invalid age: " + person.name + ", " + person.age);
        System.out.println("Public fields allow direct modification without validation");
        System.out.println();
        
        // ERROR 4: Confusing class and instance methods/variables
        System.out.println("ERROR 4: Confusing class and instance methods/variables");
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        
        counter1.incrementInstanceCount(); // Increments only counter1's count
        counter1.incrementInstanceCount();
        counter2.incrementInstanceCount(); // Increments only counter2's count
        
        Counter.incrementTotalCount(); // Increments the class-wide count
        Counter.incrementTotalCount();
        
        System.out.println("counter1 instance count: " + counter1.getInstanceCount());
        System.out.println("counter2 instance count: " + counter2.getInstanceCount());
        System.out.println("Total count (shared): " + Counter.getTotalCount());
        System.out.println();
        
        // ERROR 5: Incorrect method overriding
        System.out.println("ERROR 5: Incorrect method overriding");
        Animal animal = new Animal();
        Dog dog = new Dog();
        
        System.out.println("Animal sound: " + animal.makeSound());
        System.out.println("Dog sound: " + dog.makeSound());
        System.out.println("Dog's makeNoise method doesn't override Animal's makeSound method");
        System.out.println("They are different methods despite similar functionality");
        System.out.println();
        
        // ERROR 6: Forgetting that a class is a blueprint, not an object
        System.out.println("ERROR 6: Forgetting that a class is a blueprint, not an object");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // BlueprintExample.instanceMethod(); // Error: non-static method cannot be referenced from a static context
        System.out.println("You need to create an object to call instance methods");
        
        BlueprintExample example = new BlueprintExample();
        example.instanceMethod(); // Correct: calling instance method on an object
        BlueprintExample.staticMethod(); // Correct: calling static method on a class
        System.out.println();
        
        // ERROR 7: Circular dependencies between classes
        System.out.println("ERROR 7: Circular dependencies between classes");
        System.out.println("When classes depend on each other in a circular way, it can lead to design problems");
        System.out.println("For example, if ClassA contains ClassB and ClassB contains ClassA");
        System.out.println("This creates tight coupling and makes classes harder to maintain");
        System.out.println();
        
        // ERROR 8: Misunderstanding inheritance
        System.out.println("ERROR 8: Misunderstanding inheritance");
        Vehicle vehicle = new Vehicle("Generic Vehicle");
        Car car = new Car("Sedan", 4);
        
        System.out.println(vehicle.getInfo());
        System.out.println(car.getInfo());
        
        // Uncommenting the following would cause a compilation error
        // int wheels = vehicle.getWheels(); // Error: method not found in Vehicle class
        System.out.println("A parent class doesn't inherit methods from its child classes");
        System.out.println();
        
        // ERROR 9: Not understanding the 'this' keyword
        System.out.println("ERROR 9: Not understanding the 'this' keyword");
        ConfusedThis confused = new ConfusedThis("Original");
        System.out.println("Name: " + confused.getName());
        confused.setName("Updated");
        System.out.println("Name after incorrect setter: " + confused.getName());
        System.out.println("The setter didn't use 'this' to distinguish between parameter and instance variable");
        System.out.println();
        
        // ERROR 10: Misunderstanding object creation and initialization order
        System.out.println("ERROR 10: Misunderstanding object creation and initialization order");
        System.out.println("When creating an InitializationOrder object, notice the order of execution:");
        InitializationOrder init = new InitializationOrder();
        System.out.println("Understanding initialization order is important for proper object setup");
    }
}

// ERROR 1: Class with missing default constructor
class IncompleteRectangle {
    private double length;
    private double width;
    
    // Only constructor with parameters is defined
    // No default (no-argument) constructor
    public IncompleteRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public String getInfo() {
        return "Length = " + length + ", Width = " + width;
    }
}

// ERROR 2: Class with uninitialized instance variable
class UninitializedCircle {
    private double radius;
    private double PI; // Should be initialized but isn't
    
    public UninitializedCircle(double radius) {
        this.radius = radius;
        // Forgot to initialize PI
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double calculateArea() {
        return PI * radius * radius; // PI is 0.0 by default
    }
}

// ERROR 3: Class with poor encapsulation
class PoorlyEncapsulatedPerson {
    public String name; // Public field - violates encapsulation
    public int age;     // Public field - no validation possible
    
    // Better approach would be private fields with getter/setter methods
    // that include validation
}

// ERROR 4: Class demonstrating confusion between static and instance members
class Counter {
    private int instanceCount; // Unique to each instance
    private static int totalCount; // Shared across all instances
    
    public void incrementInstanceCount() {
        instanceCount++;
    }
    
    public static void incrementTotalCount() {
        totalCount++;
    }
    
    public int getInstanceCount() {
        return instanceCount;
    }
    
    public static int getTotalCount() {
        return totalCount;
    }
}

// ERROR 5: Classes demonstrating incorrect method overriding
class Animal {
    public String makeSound() {
        return "Generic animal sound";
    }
}

class Dog extends Animal {
    // This doesn't override the parent method because the name is different
    public String makeNoise() { // Should be makeSound to override
        return "Woof!";
    }
    
    // The parent's makeSound method is still accessible
}

// ERROR 6: Class demonstrating confusion between class and object
class BlueprintExample {
    // Instance method - requires an object
    public void instanceMethod() {
        System.out.println("This is an instance method, called on an object");
    }
    
    // Static method - called on the class itself
    public static void staticMethod() {
        System.out.println("This is a static method, called on the class");
    }
}

// ERROR 8: Classes demonstrating inheritance relationship
class Vehicle {
    private String type;
    
    public Vehicle(String type) {
        this.type = type;
    }
    
    public String getInfo() {
        return "Vehicle type: " + type;
    }
}

class Car extends Vehicle {
    private int wheels;
    
    public Car(String type, int wheels) {
        super(type);
        this.wheels = wheels;
    }
    
    public int getWheels() {
        return wheels;
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + ", Wheels: " + wheels;
    }
}

// ERROR 9: Class demonstrating confusion with 'this' keyword
class ConfusedThis {
    private String name;
    
    public ConfusedThis(String name) {
        this.name = name; // Correct use of 'this'
    }
    
    public String getName() {
        return name;
    }
    
    // Incorrect setter - parameter shadows instance variable
    public void setName(String name) {
        name = name; // Should be this.name = name
    }
}

// ERROR 10: Class demonstrating initialization order
class InitializationOrder {
    // 1. Static variables are initialized when the class is loaded
    private static int staticVar = initStaticVar();
    
    // 2. Instance variables are initialized when an object is created
    private int instanceVar = initInstanceVar();
    
    // 3. Static initialization blocks run when the class is loaded
    static {
        System.out.println("Static initialization block executed");
    }
    
    // 4. Instance initialization blocks run when an object is created, before the constructor
    {
        System.out.println("Instance initialization block executed");
    }
    
    // 5. Constructor runs last when an object is created
    public InitializationOrder() {
        System.out.println("Constructor executed");
    }
    
    private static int initStaticVar() {
        System.out.println("Static variable initialized");
        return 1;
    }
    
    private int initInstanceVar() {
        System.out.println("Instance variable initialized");
        return 1;
    }
}
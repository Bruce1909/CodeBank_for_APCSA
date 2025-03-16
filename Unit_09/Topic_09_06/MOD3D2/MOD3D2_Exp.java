/**
 * This program demonstrates how methods in or inherited by the declared type
 * determine the correctness of a non-static method call at compile time (MOD-3.D.2).
 */
public class MOD3D2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating compile-time method checking (MOD-3.D.2):\n");
        
        // Create objects with different declared types
        System.out.println("--- Creating objects with different declared types ---");
        Animal animal = new Animal();
        Animal dog = new Dog();      // Dog object with Animal reference
        Dog actualDog = new Dog();   // Dog object with Dog reference
        
        // Demonstrate compile-time method checking
        System.out.println("\n--- Demonstrating compile-time method checking ---");
        
        // These method calls are checked against the declared type (Animal)
        System.out.println("Calling methods on 'animal' (Animal reference to Animal object):");
        animal.makeSound();     // Defined in Animal
        animal.eat();           // Defined in Animal
        
        System.out.println("\nCalling methods on 'dog' (Animal reference to Dog object):");
        dog.makeSound();        // Defined in Animal, overridden in Dog
        dog.eat();              // Defined in Animal
        // dog.fetch();         // Error: fetch() is not defined in Animal class
        System.out.println("Cannot call dog.fetch() - not defined in Animal class (compile error)");
        
        System.out.println("\nCalling methods on 'actualDog' (Dog reference to Dog object):");
        actualDog.makeSound();  // Defined in Animal, overridden in Dog
        actualDog.eat();        // Defined in Animal
        actualDog.fetch();      // Defined in Dog
        
        // Demonstrate with another example
        System.out.println("\n--- Another example with Shape hierarchy ---");
        Shape shape = new Shape();
        Shape circle = new Circle();
        Circle actualCircle = new Circle();
        
        System.out.println("\nCalling methods on 'shape' (Shape reference to Shape object):");
        shape.draw();           // Defined in Shape
        shape.getArea();        // Defined in Shape
        
        System.out.println("\nCalling methods on 'circle' (Shape reference to Circle object):");
        circle.draw();          // Defined in Shape, overridden in Circle
        circle.getArea();       // Defined in Shape, overridden in Circle
        // circle.getRadius();  // Error: getRadius() is not defined in Shape class
        System.out.println("Cannot call circle.getRadius() - not defined in Shape class (compile error)");
        
        System.out.println("\nCalling methods on 'actualCircle' (Circle reference to Circle object):");
        actualCircle.draw();    // Defined in Shape, overridden in Circle
        actualCircle.getArea(); // Defined in Shape, overridden in Circle
        actualCircle.getRadius(); // Defined in Circle
        
        // Explanation
        System.out.println("\n--- Explanation ---");
        System.out.println("1. At compile time, Java checks method calls against the declared type of the reference");
        System.out.println("2. Only methods defined in or inherited by the declared type can be called");
        System.out.println("3. This is why we couldn't call fetch() on the 'dog' reference (Animal type)");
        System.out.println("4. Similarly, we couldn't call getRadius() on the 'circle' reference (Shape type)");
        System.out.println("5. The actual object type (runtime type) doesn't matter for compile-time checking");
        System.out.println("6. This is why we need to cast to the appropriate type to access subclass-specific methods");
    }
}

// Animal class hierarchy
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }
    
    public void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
    
    // Additional method not in Animal
    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

// Shape class hierarchy
class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape");
    }
    
    public double getArea() {
        System.out.println("Calculating generic shape area");
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius = 5.0;
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
    @Override
    public double getArea() {
        System.out.println("Calculating circle area");
        return Math.PI * radius * radius;
    }
    
    // Additional method not in Shape
    public double getRadius() {
        System.out.println("Getting circle radius");
        return radius;
    }
}
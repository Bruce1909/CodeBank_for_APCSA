/**
 * MOD3B10_Exp.java
 * 
 * This program demonstrates MOD-3.B.10: Method overriding occurs when a public method in a
 * subclass has the same method signature as a public method in the superclass.
 */
public class MOD3B10_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating method overriding (MOD-3.B.10):\n");
        
        // Create instances of different animal types
        Animal genericAnimal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy", "Golden Retriever");
        Cat cat = new Cat("Whiskers", true);
        
        // Demonstrate method overriding by calling the same method on different objects
        System.out.println("Calling makeSound() on different objects:");
        System.out.println("Generic Animal:");
        genericAnimal.makeSound(); // Calls Animal's implementation
        System.out.println();
        
        System.out.println("Dog:");
        dog.makeSound(); // Calls Dog's overridden implementation
        System.out.println();
        
        System.out.println("Cat:");
        cat.makeSound(); // Calls Cat's overridden implementation
        System.out.println();
        
        // Demonstrate polymorphism with method overriding
        System.out.println("Demonstrating polymorphism with method overriding:");
        Animal[] animals = {genericAnimal, dog, cat};
        
        for (Animal animal : animals) {
            System.out.println("Animal name: " + animal.getName());
            animal.makeSound(); // Calls the appropriate overridden method based on actual object type
            animal.eat();       // Some methods are not overridden
            System.out.println();
        }
        
        System.out.println("\n--- Key Points about Method Overriding ---");
        System.out.println("1. Method overriding occurs when a subclass defines a method with the same signature as in the superclass");
        System.out.println("2. The overriding method must have the same name, return type, and parameter list");
        System.out.println("3. The overriding method cannot have a more restrictive access modifier");
        System.out.println("4. Method overriding enables runtime polymorphism");
        System.out.println("5. The @Override annotation helps catch errors and improves code readability");
    }
}

/**
 * Superclass with methods that can be overridden
 */
class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    // Method that will be overridden by subclasses
    public void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }
    
    // Method that will not be overridden
    public void eat() {
        System.out.println(name + " is eating.");
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
}

/**
 * Dog subclass that overrides the makeSound method
 */
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    
    // Override the makeSound method from the superclass
    @Override // Annotation indicates this method overrides a superclass method
    public void makeSound() {
        System.out.println(getName() + " the " + breed + " barks: Woof! Woof!");
    }
    
    // Dog-specific method (not an override)
    public void fetch() {
        System.out.println(getName() + " is fetching a ball.");
    }
    
    public String getBreed() {
        return breed;
    }
}

/**
 * Cat subclass that overrides the makeSound method
 */
class Cat extends Animal {
    private boolean isIndoor;
    
    public Cat(String name, boolean isIndoor) {
        super(name);
        this.isIndoor = isIndoor;
    }
    
    // Override the makeSound method from the superclass
    @Override // Annotation indicates this method overrides a superclass method
    public void makeSound() {
        System.out.println(getName() + " the " + (isIndoor ? "indoor" : "outdoor") + " cat meows: Meow! Meow!");
    }
    
    // Cat-specific method (not an override)
    public void purr() {
        System.out.println(getName() + " is purring.");
    }
    
    public boolean isIndoor() {
        return isIndoor;
    }
}
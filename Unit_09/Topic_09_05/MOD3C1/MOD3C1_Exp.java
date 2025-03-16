/**
 * MOD3C1_Exp.java
 * 
 * This program demonstrates MOD-3.C.1: When a class S "is-a" class T, T is referred to as a superclass,
 * and S is referred to as a subclass.
 */
public class MOD3C1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating superclass and subclass relationships (MOD-3.C.1):\n");
        
        // Create instances of the superclass and subclass
        Animal animal = new Animal("Generic Animal", 5);
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        
        // Demonstrate the "is-a" relationship
        System.out.println("--- Demonstrating the 'is-a' relationship ---");
        System.out.println("A Dog 'is-a' Animal: " + (dog instanceof Animal));
        
        // Show that both classes can use their own methods
        System.out.println("\n--- Demonstrating superclass and subclass methods ---");
        System.out.println("Animal information:");
        animal.displayInfo();
        animal.makeSound();
        
        System.out.println("\nDog information:");
        dog.displayInfo();
        dog.makeSound();
        dog.fetch(); // Subclass-specific method
        
        // Explain the relationship
        System.out.println("\n--- Explanation of Superclass and Subclass ---");
        System.out.println("1. Animal is the superclass (T)");
        System.out.println("2. Dog is the subclass (S)");
        System.out.println("3. Dog 'is-a' Animal, demonstrating the inheritance relationship");
        System.out.println("4. The subclass inherits properties and behaviors from the superclass");
        System.out.println("5. The subclass can also have its own unique properties and behaviors");
    }
}

/**
 * Superclass (T) - Animal
 */
class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
    
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

/**
 * Subclass (S) - Dog
 * Dog "is-a" Animal, demonstrating the inheritance relationship
 */
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age); // Call the superclass constructor
        this.breed = breed;
    }
    
    // Override the superclass method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Breed: " + breed);
    }
    
    // Override the superclass method
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
    
    // Subclass-specific method
    public void fetch() {
        System.out.println(name + " fetches the ball!");
    }
}
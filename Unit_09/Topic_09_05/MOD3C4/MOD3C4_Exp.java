/**
 * MOD3C4_Exp.java
 * 
 * This program demonstrates MOD-3.C.4: Declaring references of type T, when S is a subclass of T,
 * is useful in formal method parameters, arrays, and ArrayList<T> declarations.
 */
import java.util.ArrayList;

public class MOD3C4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating useful declarations of superclass references (MOD-3.C.4):\n");
        
        // Create objects of different types
        Animal genericAnimal = new Animal("Generic Animal", 5);
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, 9);
        
        // 1. Using superclass reference in formal method parameters
        System.out.println("--- 1. Using Superclass Reference in Formal Method Parameters ---");
        System.out.println("\nCalling feedAnimal() with different animal types:");
        feedAnimal(genericAnimal); // Passing superclass object
        feedAnimal(dog);          // Passing Dog subclass object
        feedAnimal(cat);          // Passing Cat subclass object
        
        // 2. Using superclass reference in arrays
        System.out.println("\n--- 2. Using Superclass Reference in Arrays ---");
        Animal[] animals = new Animal[3]; // Array of Animal references
        animals[0] = genericAnimal;      // Storing superclass object
        animals[1] = dog;                // Storing Dog subclass object
        animals[2] = cat;                // Storing Cat subclass object
        
        System.out.println("\nProcessing all animals in the array:");
        for (Animal animal : animals) {
            System.out.println("\nAnimal Information:");
            animal.displayInfo();    // Polymorphic call
            animal.makeSound();      // Polymorphic call
        }
        
        // 3. Using superclass reference in ArrayList
        System.out.println("\n--- 3. Using Superclass Reference in ArrayList ---");
        ArrayList<Animal> animalList = new ArrayList<>(); // ArrayList of Animal references
        animalList.add(genericAnimal);  // Adding superclass object
        animalList.add(dog);            // Adding Dog subclass object
        animalList.add(cat);            // Adding Cat subclass object
        
        System.out.println("\nProcessing all animals in the ArrayList:");
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println("\nAnimal " + (i + 1) + ":");
            Animal animal = animalList.get(i);
            animal.displayInfo();    // Polymorphic call
            animal.makeSound();      // Polymorphic call
        }
        
        // 4. Using superclass reference in method that returns different subclass objects
        System.out.println("\n--- 4. Using Superclass Reference for Method Return Types ---");
        Animal randomAnimal1 = getRandomAnimal();
        Animal randomAnimal2 = getRandomAnimal();
        
        System.out.println("\nRandom animal 1:");
        randomAnimal1.displayInfo();
        randomAnimal1.makeSound();
        
        System.out.println("\nRandom animal 2:");
        randomAnimal2.displayInfo();
        randomAnimal2.makeSound();
        
        // Explain the benefits
        System.out.println("\n--- Benefits of Using Superclass References ---");
        System.out.println("1. Flexibility: Methods can accept any subclass object");
        System.out.println("2. Polymorphism: The appropriate method version is called based on the actual object type");
        System.out.println("3. Extensibility: New subclasses can be added without changing existing code");
        System.out.println("4. Code reuse: The same method can work with multiple related types");
        System.out.println("5. Simplified collections: Arrays and ArrayLists can store mixed subclass objects");
    }
    
    // 1. Method with superclass reference as formal parameter
    public static void feedAnimal(Animal animal) {
        System.out.println(animal.getName() + " is being fed.");
        // This method works with any Animal or subclass of Animal
    }
    
    // 4. Method that returns a superclass reference but may return different subclass objects
    public static Animal getRandomAnimal() {
        // Randomly return different types of animals
        int random = (int)(Math.random() * 3);
        
        if (random == 0) {
            return new Animal("Random Animal", 1);
        } else if (random == 1) {
            return new Dog("Random Dog", 2, "Mixed Breed");
        } else {
            return new Cat("Random Cat", 3, 7);
        }
    }
}

/**
 * Superclass - Animal
 */
class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Type: " + this.getClass().getSimpleName());
    }
    
    public void makeSound() {
        System.out.println(name + " makes a generic animal sound");
    }
}

/**
 * Subclass - Dog
 */
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
    
    // Subclass-specific method
    public void fetch() {
        System.out.println(name + " fetches the ball!");
    }
}

/**
 * Subclass - Cat
 */
class Cat extends Animal {
    private int lives;
    
    public Cat(String name, int age, int lives) {
        super(name, age);
        this.lives = lives;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Lives remaining: " + lives);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow! Meow!");
    }
    
    // Subclass-specific method
    public void purr() {
        System.out.println(name + " purrs contentedly.");
    }
}
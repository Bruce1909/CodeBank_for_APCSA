/**
 * MOD3B3_Exp.java
 * 
 * This program demonstrates MOD-3.B.3: Extending a subclass from a superclass creates
 * an "is-a" relationship from the subclass to the superclass.
 */
public class MOD3B3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating 'is-a' relationships in inheritance (MOD-3.B.3):\n");
        
        // Create instances of different animal types
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 5, true);
        Bird bird = new Bird("Tweety", 1, true);
        
        // Demonstrate the "is-a" relationship
        System.out.println("--- Demonstrating 'is-a' Relationship ---");
        System.out.println("A Dog 'is-a' Animal: " + (dog instanceof Animal));
        System.out.println("A Cat 'is-a' Animal: " + (cat instanceof Animal));
        System.out.println("A Bird 'is-a' Animal: " + (bird instanceof Animal));
        System.out.println();
        
        // Using the "is-a" relationship for polymorphism
        System.out.println("--- Using 'is-a' Relationship for Polymorphism ---");
        System.out.println("Treating subclasses as their superclass type:\n");
        
        // Create an array of Animal references
        Animal[] animals = new Animal[3];
        animals[0] = dog;   // A Dog is-a Animal
        animals[1] = cat;   // A Cat is-a Animal
        animals[2] = bird;  // A Bird is-a Animal
        
        // Process all animals polymorphically
        for (Animal animal : animals) {
            System.out.println("Processing: " + animal.getName());
            animal.eat();
            animal.sleep();
            animal.makeSound();
            System.out.println();
        }
        
        // Demonstrate that the reverse is not true
        System.out.println("--- The Reverse Relationship is Not True ---");
        System.out.println("An Animal is not necessarily a Dog, Cat, or Bird");
        Animal genericAnimal = new Animal("Generic", 2);
        System.out.println("An Animal 'is-a' Dog: " + (genericAnimal instanceof Dog)); // false
        System.out.println("An Animal 'is-a' Cat: " + (genericAnimal instanceof Cat)); // false
        System.out.println("An Animal 'is-a' Bird: " + (genericAnimal instanceof Bird)); // false
        
        System.out.println("\n--- Key Points about 'is-a' Relationship ---");
        System.out.println("1. The 'is-a' relationship is established through inheritance");
        System.out.println("2. A subclass 'is-a' superclass, but a superclass is not necessarily a subclass");
        System.out.println("3. The 'is-a' relationship allows for polymorphism");
        System.out.println("4. The 'instanceof' operator can check for 'is-a' relationships");
        System.out.println("5. The 'is-a' relationship reflects real-world classification hierarchies");
    }
}

/**
 * Superclass representing a generic animal
 */
class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
    
    public void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}

/**
 * Dog subclass - a Dog "is-a" Animal
 */
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    // Override superclass method
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof! Woof!");
    }
    
    // Dog-specific method
    public void fetch() {
        System.out.println(getName() + " is fetching a ball.");
    }
    
    public String getBreed() {
        return breed;
    }
}

/**
 * Cat subclass - a Cat "is-a" Animal
 */
class Cat extends Animal {
    private boolean isIndoor;
    
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }
    
    // Override superclass method
    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow! Meow!");
    }
    
    // Cat-specific method
    public void purr() {
        System.out.println(getName() + " is purring.");
    }
    
    public boolean isIndoor() {
        return isIndoor;
    }
}

/**
 * Bird subclass - a Bird "is-a" Animal
 */
class Bird extends Animal {
    private boolean canFly;
    
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }
    
    // Override superclass method
    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps: Tweet! Tweet!");
    }
    
    // Bird-specific method
    public void fly() {
        if (canFly) {
            System.out.println(getName() + " is flying high in the sky.");
        } else {
            System.out.println(getName() + " cannot fly.");
        }
    }
    
    public boolean canFly() {
        return canFly;
    }
}
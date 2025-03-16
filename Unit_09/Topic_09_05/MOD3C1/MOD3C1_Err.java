/**
 * MOD3C1_Err.java
 * 
 * This program demonstrates common errors related to MOD-3.C.1: When a class S "is-a" class T,
 * T is referred to as a superclass, and S is referred to as a subclass.
 */
public class MOD3C1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors in superclass and subclass relationships (MOD-3.C.1):\n");
        
        // Create instances of the superclass and subclass
        AnimalErr animal = new AnimalErr("Generic Animal", 5);
        DogErr dog = new DogErr("Buddy", 3, "Golden Retriever");
        CatErr cat = new CatErr("Whiskers", 2, "Siamese");
        
        // ERROR 1: Attempting to assign a superclass object to a subclass reference
        System.out.println("ERROR 1: Attempting to assign a superclass object to a subclass reference:");
        try {
            System.out.println("Attempting: DogErr dogFromAnimal = animal;");
            // This will cause a compile-time error, commented out to allow compilation
            // DogErr dogFromAnimal = animal; // Error: incompatible types
            System.out.println("This would cause a compile-time error because a superclass object");
            System.out.println("cannot be assigned to a subclass reference without an explicit cast.");
            
            // Even with a cast, this will fail at runtime
            System.out.println("\nAttempting with cast: DogErr dogFromAnimal = (DogErr) animal;");
            // DogErr dogFromAnimal = (DogErr) animal; // This would throw ClassCastException at runtime
            System.out.println("This would throw a ClassCastException at runtime because");
            System.out.println("the animal object is not actually a Dog object.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        // ERROR 2: Misunderstanding the "is-a" relationship
        System.out.println("\nERROR 2: Misunderstanding the 'is-a' relationship:");
        System.out.println("A Dog 'is-a' Animal: " + (dog instanceof AnimalErr)); // True
        System.out.println("An Animal 'is-a' Dog: " + (animal instanceof DogErr)); // False
        System.out.println("The 'is-a' relationship is one-directional. While a Dog is an Animal,");
        System.out.println("an Animal is not necessarily a Dog.");
        
        // ERROR 3: Confusing inheritance with composition
        System.out.println("\nERROR 3: Confusing inheritance with composition:");
        System.out.println("Inheritance ('is-a'): A Dog is an Animal.");
        System.out.println("Composition ('has-a'): A Car has an Engine, but a Car is not an Engine.");
        System.out.println("Using inheritance when composition would be more appropriate");
        System.out.println("leads to poor design and potential errors.");
        
        // ERROR 4: Attempting to access subclass-specific methods from a superclass reference
        System.out.println("\nERROR 4: Attempting to access subclass-specific methods from a superclass reference:");
        AnimalErr dogAsAnimal = dog; // Valid: Subclass object can be assigned to superclass reference
        System.out.println("Valid: AnimalErr dogAsAnimal = dog;");
        
        // This will cause a compile-time error, commented out to allow compilation
        System.out.println("Attempting: dogAsAnimal.fetch();");
        // dogAsAnimal.fetch(); // Error: method fetch() not found in AnimalErr
        System.out.println("This would cause a compile-time error because the fetch() method");
        System.out.println("is not defined in the AnimalErr class.");
        
        System.out.println("\n--- Common Errors with Superclass and Subclass Relationships ---");
        System.out.println("1. Attempting to assign a superclass object to a subclass reference");
        System.out.println("2. Misunderstanding the one-directional nature of the 'is-a' relationship");
        System.out.println("3. Confusing inheritance ('is-a') with composition ('has-a')");
        System.out.println("4. Attempting to access subclass-specific methods from a superclass reference");
    }
}

/**
 * Superclass (T) - AnimalErr
 */
class AnimalErr {
    protected String name;
    protected int age;
    
    public AnimalErr(String name, int age) {
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
 * Subclass (S) - DogErr
 */
class DogErr extends AnimalErr {
    private String breed;
    
    public DogErr(String name, int age, String breed) {
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
 * Another Subclass - CatErr
 */
class CatErr extends AnimalErr {
    private String breed;
    
    public CatErr(String name, int age, String breed) {
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
        System.out.println(name + " meows: Meow! Meow!");
    }
    
    // Subclass-specific method
    public void scratch() {
        System.out.println(name + " scratches the furniture!");
    }
}
/**
 * MOD3C4_Err.java
 * 
 * This program demonstrates common errors related to MOD-3.C.4: Declaring references of type T, when S is a subclass of T,
 * is useful in formal method parameters, arrays, and ArrayList<T> declarations.
 */
import java.util.ArrayList;

public class MOD3C4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors with superclass references in declarations (MOD-3.C.4):\n");
        
        // Create objects of different types
        AnimalErr genericAnimal = new AnimalErr("Generic Animal", 5);
        DogErr dog = new DogErr("Buddy", 3, "Golden Retriever");
        CatErr cat = new CatErr("Whiskers", 2, 9);
        
        // ERROR 1: Attempting to store superclass references in a subclass array
        System.out.println("ERROR 1: Attempting to store superclass references in a subclass array:");
        // This will cause a compile-time error, commented out to allow compilation
        System.out.println("Attempting: DogErr[] dogs = new DogErr[2]; dogs[0] = genericAnimal;");
        // DogErr[] dogs = new DogErr[2];
        // dogs[0] = genericAnimal; // Error: incompatible types
        System.out.println("This would cause a compile-time error because an AnimalErr");
        System.out.println("cannot be assigned to a DogErr reference without casting.");
        
        // ERROR 2: Attempting to store objects in an array of the wrong subclass type
        System.out.println("\nERROR 2: Attempting to store objects in an array of the wrong subclass type:");
        DogErr[] dogs = new DogErr[2];
        dogs[0] = dog; // This is fine
        
        System.out.println("Attempting: dogs[1] = cat;");
        // dogs[1] = cat; // Error: incompatible types
        System.out.println("This would cause a compile-time error because a CatErr");
        System.out.println("cannot be assigned to a DogErr reference.");
        
        // ERROR 3: Incorrect use of ArrayList with specific subclass type
        System.out.println("\nERROR 3: Incorrect use of ArrayList with specific subclass type:");
        ArrayList<DogErr> dogList = new ArrayList<>();
        dogList.add(dog); // This is fine
        
        System.out.println("Attempting: dogList.add(cat);");
        // dogList.add(cat); // Error: incompatible types
        System.out.println("This would cause a compile-time error because a CatErr");
        System.out.println("cannot be added to an ArrayList<DogErr>.");
        
        // ERROR 4: Attempting to access subclass-specific methods in a method with superclass parameter
        System.out.println("\nERROR 4: Attempting to access subclass-specific methods in a method with superclass parameter:");
        System.out.println("Calling processAnimal() with a DogErr:");
        processAnimal(dog);
        
        // ERROR 5: Incorrect casting in a method that returns a superclass reference
        System.out.println("\nERROR 5: Incorrect casting in a method that returns a superclass reference:");
        AnimalErr randomAnimal = getRandomAnimal();
        System.out.println("Random animal type: " + randomAnimal.getClass().getSimpleName());
        
        System.out.println("Attempting to cast without checking type:");
        try {
            System.out.println("DogErr dogFromRandom = (DogErr) randomAnimal; // Might throw ClassCastException");
            // Commented out to allow compilation, but would potentially throw an exception at runtime
            // DogErr dogFromRandom = (DogErr) randomAnimal;
            // dogFromRandom.fetch();
            System.out.println("This might throw a ClassCastException at runtime if");
            System.out.println("randomAnimal is not actually a DogErr object.");
        } catch (Exception e) {
            System.out.println("Exception would occur: ClassCastException");
        }
        
        // Correct approach
        System.out.println("\nCorrect approach - check type before casting:");
        if (randomAnimal instanceof DogErr) {
            DogErr dogFromRandom = (DogErr) randomAnimal;
            dogFromRandom.fetch();
        } else {
            System.out.println("randomAnimal is not a DogErr, cannot call fetch()");
        }
        
        // ERROR 6: Forgetting that arrays of superclass type still enforce element type at runtime
        System.out.println("\nERROR 6: Array store issues:");
        Object[] objectArray = new AnimalErr[3]; // Array of AnimalErr, but reference type is Object[]
        objectArray[0] = genericAnimal; // OK
        objectArray[1] = dog;          // OK
        
        try {
            System.out.println("Attempting: objectArray[2] = \"Not an animal\";");
            // This will compile but fail at runtime
            // objectArray[2] = "Not an animal"; // Would throw ArrayStoreException
            System.out.println("This would throw an ArrayStoreException at runtime because");
            System.out.println("a String cannot be stored in an array of AnimalErr.");
        } catch (Exception e) {
            System.out.println("Exception would occur: ArrayStoreException");
        }
        
        System.out.println("\n--- Common Errors with Superclass References in Declarations ---");
        System.out.println("1. Attempting to store superclass objects in a subclass array");
        System.out.println("2. Attempting to store objects in an array of the wrong subclass type");
        System.out.println("3. Using ArrayList with specific subclass type when flexibility is needed");
        System.out.println("4. Attempting to access subclass-specific methods in methods with superclass parameters");
        System.out.println("5. Incorrect casting when working with methods that return superclass references");
        System.out.println("6. Forgetting that arrays enforce element type at runtime (ArrayStoreException)");
    }
    
    // Method with superclass reference as formal parameter
    public static void processAnimal(AnimalErr animal) {
        System.out.println(animal.getName() + " is being processed.");
        
        // ERROR: Attempting to call subclass-specific method
        System.out.println("Attempting: animal.fetch(); // If animal is a DogErr");
        // animal.fetch(); // Error: method fetch() not found in AnimalErr
        System.out.println("This would cause a compile-time error because fetch() is not defined in AnimalErr.");
        
        // Correct approach - check type before casting
        if (animal instanceof DogErr) {
            DogErr dog = (DogErr) animal;
            System.out.println("After proper casting, we can call dog-specific methods:");
            dog.fetch();
        } else if (animal instanceof CatErr) {
            CatErr cat = (CatErr) animal;
            System.out.println("After proper casting, we can call cat-specific methods:");
            cat.purr();
        }
    }
    
    // Method that returns a superclass reference but may return different subclass objects
    public static AnimalErr getRandomAnimal() {
        // Randomly return different types of animals
        int random = (int)(Math.random() * 3);
        
        if (random == 0) {
            return new AnimalErr("Random Animal", 1);
        } else if (random == 1) {
            return new DogErr("Random Dog", 2, "Mixed Breed");
        } else {
            return new CatErr("Random Cat", 3, 7);
        }
    }
}

/**
 * Superclass - AnimalErr
 */
class AnimalErr {
    protected String name;
    protected int age;
    
    public AnimalErr(String name, int age) {
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
 * Subclass - DogErr
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
 * Subclass - CatErr
 */
class CatErr extends AnimalErr {
    private int lives;
    
    public CatErr(String name, int age, int lives) {
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
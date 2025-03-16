/**
 * VAR-2.D.4 Error Example
 * When ArrayList<E> is specified, the types of the reference parameters and return type
 * when using the methods are type E.
 * 
 * This program demonstrates common errors related to method parameters and return types
 * when working with ArrayList<E>.
 */
import java.util.ArrayList;

public class VAR2D4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with ArrayList<E> method parameters and return types:\n");
        
        // ERROR 1: Type mismatch when adding elements
        System.out.println("Error 1: Type mismatch when adding elements");
        ArrayList<String> stringList = new ArrayList<String>();
        
        // This works fine
        stringList.add("Hello");
        
        // This would cause a compile-time error if uncommented
        System.out.println("The following code would not compile if uncommented:");
        System.out.println("// stringList.add(42); // Error: incompatible types: int cannot be converted to String");
        
        // ERROR 2: Incorrect casting of return values
        System.out.println("\nError 2: Incorrect casting of return values");
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        
        // This works fine - no casting needed
        Integer firstNumber = intList.get(0);
        System.out.println("Correctly retrieved Integer: " + firstNumber);
        
        // This would cause a compile-time error if uncommented
        System.out.println("The following code would not compile if uncommented:");
        System.out.println("// String wrongType = intList.get(0); // Error: incompatible types");
        
        // ERROR 3: Forgetting that primitive types are auto-boxed/unboxed
        System.out.println("\nError 3: Misunderstanding auto-boxing/unboxing");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        // Auto-boxing: int -> Integer
        numbers.add(5); // This works because 5 is auto-boxed to Integer
        
        // Auto-unboxing: Integer -> int
        int value = numbers.get(0); // This works because Integer is auto-unboxed to int
        System.out.println("Auto-unboxed value: " + value);
        
        // Common misconception: thinking you need explicit casting
        System.out.println("\nCommon misconception: thinking you need explicit casting");
        System.out.println("The following code is unnecessarily verbose:");
        System.out.println("// int explicitCast = (int) numbers.get(0); // Unnecessary cast");
        System.out.println("// Integer explicitObject = (Integer) numbers.get(0); // Unnecessary cast");
        
        // ERROR 4: Mixing raw types with generics
        System.out.println("\nError 4: Mixing raw types with generics");
        ArrayList rawList = new ArrayList();
        rawList.add("A string");
        rawList.add(42);
        
        ArrayList<String> typedList = new ArrayList<String>();
        
        // This would generate an unchecked warning
        System.out.println("The following assignment would generate an unchecked warning:");
        System.out.println("// typedList = rawList; // Unchecked assignment warning");
        
        // This would cause a runtime error
        System.out.println("\nIf we did the above assignment, this would cause a runtime error:");
        System.out.println("// String s = typedList.get(1); // Would throw ClassCastException at runtime");
        
        // ERROR 5: Misunderstanding the return type of set() method
        System.out.println("\nError 5: Misunderstanding the return type of set() method");
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        
        // Common mistake: forgetting that set() returns the old value
        System.out.println("Common mistake: forgetting that set() returns the old value");
        String oldValue = fruits.set(0, "Banana");
        System.out.println("set() returned: " + oldValue + " (the old value)");
        System.out.println("Current list: " + fruits);
        
        // ERROR 6: Type issues with custom objects
        System.out.println("\nError 6: Type issues with custom objects");
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Lion"));
        
        // This works because Dog is a subclass of Animal
        animals.add(new Dog("Fido"));
        
        // But we can't directly get a Dog without casting
        System.out.println("The following code would not compile if uncommented:");
        System.out.println("// Dog dog = animals.get(1); // Error: incompatible types");
        
        // We need to cast, but this can lead to runtime errors if we're not careful
        System.out.println("\nWe need to cast when retrieving a subclass:");
        try {
            Animal animal = animals.get(1);
            // This is safe because we know index 1 contains a Dog
            Dog dog = (Dog) animal;
            System.out.println("Successfully cast to Dog: " + dog);
            
            // This will cause a ClassCastException
            Dog notADog = (Dog) animals.get(0); // Will throw exception
            System.out.println("This line won't execute");
        } catch (ClassCastException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because we tried to cast a Lion to a Dog");
        }
    }
}

// Classes for demonstrating inheritance and casting issues
class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Animal{name='" + name + "'}"; 
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public String toString() {
        return "Dog{" + super.toString() + "}"; 
    }
}
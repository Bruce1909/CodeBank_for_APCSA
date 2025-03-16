/**
 * VAR-2.D.3 Error Example
 * Java allows the generic type ArrayList<E>, where the generic type E specifies the type of the elements.
 * 
 * This program demonstrates common errors when working with generic types in ArrayList.
 */
import java.util.ArrayList;

public class VAR2D3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with ArrayList generics:\n");
        
        // ERROR 1: Using raw type ArrayList (without generics)
        System.out.println("Error 1: Using raw type ArrayList (without generics)");
        ArrayList rawList = new ArrayList(); // Raw type - not using generics
        
        // With raw types, you can add any type of object
        rawList.add("A string");
        rawList.add(42); // An Integer
        rawList.add(3.14); // A Double
        
        System.out.println("Raw list contents: " + rawList);
        
        // Problem: Type casting is required and can cause runtime errors
        System.out.println("\nProblem with raw types - need for casting:");
        try {
            // This will cause a ClassCastException
            String firstItem = (String) rawList.get(0); // OK
            System.out.println("First item as String: " + firstItem);
            
            String secondItem = (String) rawList.get(1); // Will throw ClassCastException
            System.out.println("This line won't execute");
        } catch (ClassCastException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because we tried to cast an Integer to a String");
        }
        
        // ERROR 2: Mixing incompatible types with generics
        System.out.println("\nError 2: Mixing incompatible types with generics");
        System.out.println("The following code would not compile if uncommented:");
        System.out.println("// ArrayList<String> stringList = new ArrayList<Integer>(); // Incompatible types");
        
        // ERROR 3: Forgetting that primitive types can't be used as type arguments
        System.out.println("\nError 3: Trying to use primitive types as type arguments");
        System.out.println("The following code would not compile if uncommented:");
        System.out.println("// ArrayList<int> intList = new ArrayList<int>(); // Primitives not allowed");
        System.out.println("Instead, use wrapper classes: ArrayList<Integer>");
        
        // Correct way: Using proper generics
        System.out.println("\nCorrect way: Using proper generics");
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Hello");
        stringList.add("World");
        // stringList.add(42); // This would not compile - type safety enforced
        
        // No casting needed, type safety guaranteed at compile time
        String item = stringList.get(0);
        System.out.println("Retrieved item without casting: " + item);
        
        // ERROR 4: Unchecked warnings when mixing raw types with generics
        System.out.println("\nError 4: Unchecked warnings when mixing raw types with generics");
        ArrayList<String> safeList = new ArrayList<String>();
        ArrayList unsafeList = new ArrayList();
        
        // This assignment generates an unchecked warning
        System.out.println("The following assignment would generate an unchecked warning:");
        System.out.println("// safeList = unsafeList; // Unchecked conversion warning");
        
        // This can lead to runtime errors
        unsafeList.add(42);
        // If we had done the assignment above, this would cause a ClassCastException later
        System.out.println("This could lead to runtime errors if we tried to use elements as Strings");
    }
}
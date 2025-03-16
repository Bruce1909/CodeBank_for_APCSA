/**
 * VAR-2.D.5 Error Example
 * ArrayList<E> is preferred over ArrayList because it allows the compiler to find errors 
 * that would otherwise be found at run-time.
 * 
 * This program demonstrates common errors that occur when using raw ArrayList instead of generic ArrayList<E>.
 */
import java.util.ArrayList;

public class VAR2D5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when using raw ArrayList instead of ArrayList<E>:\n");
        
        // ERROR 1: Using raw ArrayList leads to runtime type errors
        System.out.println("Error 1: Using raw ArrayList leads to runtime type errors");
        ArrayList rawList = new ArrayList();
        
        // Can add any type of object to a raw ArrayList
        rawList.add("Hello");
        rawList.add(42);
        rawList.add(3.14);
        
        System.out.println("Raw ArrayList contents: " + rawList);
        
        // Runtime type errors when retrieving elements
        System.out.println("\nRuntime type errors when retrieving elements:");
        try {
            // This works because the first element is a String
            String firstElement = (String) rawList.get(0);
            System.out.println("First element as String: " + firstElement);
            
            // This will cause a ClassCastException
            String secondElement = (String) rawList.get(1); // Integer cannot be cast to String
            System.out.println("This line won't execute");
        } catch (ClassCastException e) {
            System.out.println("Runtime error caught: " + e.getMessage());
            System.out.println("This error would have been caught at compile-time with ArrayList<String>\n");
        }
        
        // ERROR 2: No compile-time type checking for method arguments
        System.out.println("Error 2: No compile-time type checking for method arguments");
        ArrayList numbers = new ArrayList();
        numbers.add(10);
        numbers.add(20);
        
        // Can accidentally add a non-number
        numbers.add("thirty"); // This compiles but is logically wrong
        System.out.println("Numbers list with a String: " + numbers);
        
        // This will cause problems later when we try to use the elements as numbers
        System.out.println("\nProblems when using elements as numbers:");
        try {
            int sum = 0;
            for (int i = 0; i < numbers.size(); i++) {
                // This will fail when i = 2
                sum += (Integer) numbers.get(i);
            }
            System.out.println("Sum: " + sum);
        } catch (ClassCastException e) {
            System.out.println("Runtime error caught: " + e.getMessage());
            System.out.println("With ArrayList<Integer>, this error would have been caught at compile-time\n");
        }
        
        // ERROR 3: Unsafe method parameters with raw types
        System.out.println("Error 3: Unsafe method parameters with raw types");
        ArrayList fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        
        // This compiles but is unsafe
        addNumber(fruits); // Adding a number to a list that should only contain strings
        
        System.out.println("Fruits list after adding a number: " + fruits);
        
        // This will cause problems when we try to process the strings
        System.out.println("\nProblems when processing strings:");
        try {
            for (Object obj : fruits) {
                String fruit = (String) obj;
                System.out.println("Fruit in uppercase: " + fruit.toUpperCase());
            }
        } catch (ClassCastException e) {
            System.out.println("Runtime error caught: " + e.getMessage());
            System.out.println("With ArrayList<String>, the addNumber method would not have compiled\n");
        }
        
        // Correct approach: Using generic ArrayList<E>
        System.out.println("Correct approach: Using generic ArrayList<E>");
        ArrayList<String> safeList = new ArrayList<String>();
        safeList.add("Safe");
        safeList.add("Type");
        safeList.add("Checking");
        
        // The following would not compile:
        // safeList.add(100); // Compile-time error: incompatible types
        // addNumber(safeList); // Compile-time error: incompatible types
        
        System.out.println("Safe list contents: " + safeList);
        System.out.println("No runtime errors when processing the list!");
    }
    
    // A method that adds a number to any ArrayList (unsafe)
    @SuppressWarnings("rawtypes")
    public static void addNumber(ArrayList list) {
        list.add(42); // This can break type safety
    }
}
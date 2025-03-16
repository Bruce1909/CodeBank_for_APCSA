/**
 * VAR-2.D.2 Error Example
 * The ArrayList constructor ArrayList() constructs an empty list.
 * 
 * This program demonstrates common errors when working with the ArrayList constructor
 * and empty ArrayLists.
 */
import java.util.ArrayList;

public class VAR2D2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common ArrayList constructor errors:\n");
        
        // ERROR 1: Trying to access elements in an empty ArrayList
        System.out.println("Error 1: Trying to access elements in an empty ArrayList");
        ArrayList<String> emptyList = new ArrayList<String>();
        
        System.out.println("Created an empty ArrayList");
        System.out.println("Size of the empty list: " + emptyList.size());
        
        try {
            // This will cause an IndexOutOfBoundsException
            System.out.println("Attempting to access the first element: " + emptyList.get(0));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because we tried to access an element in an empty list\n");
        }
        
        // ERROR 2: Forgetting to use the diamond operator in Java 7+
        System.out.println("Error 2: Forgetting to use the diamond operator in Java 7+");
        // Old verbose way (pre-Java 7)
        ArrayList<Integer> oldWay = new ArrayList<Integer>();
        
        // Modern way with diamond operator (Java 7+)
        ArrayList<Integer> modernWay = new ArrayList<>();
        
        System.out.println("Both create empty ArrayLists, but the second is more concise\n");
        
        // ERROR 3: Confusing ArrayList constructor with Arrays.asList()
        System.out.println("Error 3: Confusing ArrayList constructor with Arrays.asList()");
        
        // Common mistake: thinking new ArrayList<String>() can take initial elements
        System.out.println("The following code would not compile if uncommented:");
        System.out.println("// ArrayList<String> list = new ArrayList<String>("A", "B", "C"); // ERROR");
        
        // Correct ways to initialize an ArrayList with elements
        System.out.println("\nCorrect ways to initialize an ArrayList with elements:");
        
        // Method 1: Create empty list and add elements
        ArrayList<String> method1 = new ArrayList<String>();
        method1.add("A");
        method1.add("B");
        method1.add("C");
        System.out.println("Method 1 result: " + method1);
        
        // Method 2: Use Arrays.asList and pass to constructor
        ArrayList<String> method2 = new ArrayList<String>(java.util.Arrays.asList("A", "B", "C"));
        System.out.println("Method 2 result: " + method2);
        
        // ERROR 4: Misunderstanding initial capacity
        System.out.println("\nError 4: Misunderstanding initial capacity");
        ArrayList<String> withCapacity = new ArrayList<String>(10);
        
        System.out.println("Created ArrayList with initial capacity of 10");
        System.out.println("Size of the list: " + withCapacity.size());
        System.out.println("Common misconception: The list does NOT contain 10 elements");
        System.out.println("It only has space pre-allocated for efficiency");
    }
}
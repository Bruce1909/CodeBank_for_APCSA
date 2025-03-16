/**
 * VAR-2.D.7 Error Example
 * The following ArrayList methods— including what they do and when they are used—are part of the Java Quick Reference:
 * - int size() - Returns the number of elements in the list 
 * - boolean add(E obj) - Appends obj to end of list; returns true 
 * - void add(int index, E obj) - Inserts obj at position index (0 <= index <= size), moving elements at position index and higher to the right
 * - E get(int index) - Returns the element at position index in the list 
 * - E set(int index, E obj) — Replaces the element at position index with obj; returns the element formerly at position index
 * - E remove(int index) — Removes element from position index, moving elements at position index + 1 and higher to the left
 * 
 * This program demonstrates common errors when using ArrayList methods.
 */
import java.util.ArrayList;

public class VAR2D7_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when using ArrayList methods:\n");
        
        // Create an ArrayList of String objects
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        
        System.out.println("Initial list: " + colors);
        System.out.println("List size: " + colors.size());
        
        // ERROR 1: IndexOutOfBoundsException with get()
        System.out.println("\nError 1: IndexOutOfBoundsException with get()");
        try {
            // Trying to access an element at an invalid index
            String color = colors.get(3); // Error: index 3 is out of bounds
            System.out.println("This line won't execute");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because we tried to access an index that doesn't exist");
        }
        
        // ERROR 2: IndexOutOfBoundsException with set()
        System.out.println("\nError 2: IndexOutOfBoundsException with set()");
        try {
            // Trying to replace an element at an invalid index
            colors.set(5, "Purple"); // Error: index 5 is out of bounds
            System.out.println("This line won't execute");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because we tried to set a value at an index that doesn't exist");
        }
        
        // ERROR 3: IndexOutOfBoundsException with remove()
        System.out.println("\nError 3: IndexOutOfBoundsException with remove()");
        try {
            // Trying to remove an element at an invalid index
            colors.remove(-1); // Error: negative index is invalid
            System.out.println("This line won't execute");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because we tried to remove an element at a negative index");
        }
        
        // ERROR 4: IndexOutOfBoundsException with add(int, E)
        System.out.println("\nError 4: IndexOutOfBoundsException with add(int, E)");
        try {
            // Trying to insert an element at an invalid index
            colors.add(10, "Yellow"); // Error: index 10 is out of bounds
            System.out.println("This line won't execute");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because we tried to insert at an index > size()");
            System.out.println("Valid indices for insertion are 0 to " + colors.size());
        }
        
        // ERROR 5: Forgetting that remove(Object) and remove(int) are different
        System.out.println("\nError 5: Confusion between remove(Object) and remove(int)");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Add 10 again
        
        System.out.println("Numbers list: " + numbers);
        
        // remove(int) removes the element at the specified position
        Integer removedByIndex = numbers.remove(0); // Removes the first element (10)
        System.out.println("After remove(0): " + numbers);
        System.out.println("Removed element: " + removedByIndex);
        
        // remove(Object) removes the first occurrence of the specified element
        boolean removedByValue = numbers.remove(Integer.valueOf(10)); // Removes the value 10
        System.out.println("After remove(Integer.valueOf(10)): " + numbers);
        System.out.println("Element removed: " + removedByValue);
        
        // Common mistake: Trying to remove an Integer value using remove(int)
        System.out.println("\nCommon mistake: Using remove(int) when intending remove(Object)");
        ArrayList<Integer> moreNumbers = new ArrayList<Integer>();
        moreNumbers.add(100);
        moreNumbers.add(200);
        moreNumbers.add(300);
        
        System.out.println("More numbers list: " + moreNumbers);
        
        // This removes the element at index 100, not the value 100
        try {
            moreNumbers.remove(100); // Interpreted as remove(int), not remove(Integer)
            System.out.println("This line won't execute");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because remove(100) was interpreted as remove at index 100");
            System.out.println("To remove the value 100, use: remove(Integer.valueOf(100))");
        }
        
        // ERROR 6: Forgetting that set() returns the old value
        System.out.println("\nError 6: Forgetting that set() returns the old value");
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        
        System.out.println("Fruits list: " + fruits);
        
        // Common mistake: Ignoring the return value of set()
        String oldFruit = fruits.set(0, "Banana");
        System.out.println("After set(0, \"Banana\"): " + fruits);
        System.out.println("Old value that was replaced: " + oldFruit);
        System.out.println("Many programmers forget that set() returns the replaced element");
        
        // ERROR 7: Modifying a list while iterating through it
        System.out.println("\nError 7: Modifying a list while iterating through it");
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Fish");
        
        System.out.println("Animals list: " + animals);
        
        try {
            System.out.println("Attempting to remove elements while iterating:");
            for (String animal : animals) {
                System.out.println("Processing: " + animal);
                if (animal.equals("Dog")) {
                    animals.remove(animal); // This will cause ConcurrentModificationException
                }
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("Error caught: " + e.getClass().getSimpleName());
            System.out.println("This happened because we modified the list during iteration");
            System.out.println("Use an Iterator or a separate list of elements to remove instead");
        }
    }
}
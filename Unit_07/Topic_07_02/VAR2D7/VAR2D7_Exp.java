/**
 * VAR-2.D.7 Example
 * The following ArrayList methods— including what they do and when they are used—are part of the Java Quick Reference:
 * - int size() - Returns the number of elements in the list 
 * - boolean add(E obj) - Appends obj to end of list; returns true 
 * - void add(int index, E obj) - Inserts obj at position index (0 <= index <= size), moving elements at position index and higher to the right
 * - E get(int index) - Returns the element at position index in the list 
 * - E set(int index, E obj) — Replaces the element at position index with obj; returns the element formerly at position index
 * - E remove(int index) — Removes element from position index, moving elements at position index + 1 and higher to the left
 * 
 * This program demonstrates how to use these ArrayList methods.
 */
import java.util.ArrayList;

public class VAR2D7_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating ArrayList methods from the Java Quick Reference:\n");
        
        // Create an ArrayList of String objects
        ArrayList<String> fruits = new ArrayList<String>();
        
        // 1. boolean add(E obj) - Appends obj to end of list; returns true
        System.out.println("1. Using add(E obj) to append elements:");
        boolean result1 = fruits.add("Apple");  // Returns true
        boolean result2 = fruits.add("Banana");
        boolean result3 = fruits.add("Cherry");
        
        System.out.println("Result of add operation: " + result1); // Always true
        System.out.println("Current list: " + fruits);
        
        // 2. int size() - Returns the number of elements in the list
        System.out.println("\n2. Using size() to get the number of elements:");
        int size = fruits.size();
        System.out.println("Number of elements: " + size);
        
        // 3. void add(int index, E obj) - Inserts obj at position index
        System.out.println("\n3. Using add(int index, E obj) to insert elements at specific positions:");
        fruits.add(1, "Blueberry"); // Insert at index 1
        System.out.println("After inserting 'Blueberry' at index 1: " + fruits);
        
        // 4. E get(int index) - Returns the element at position index
        System.out.println("\n4. Using get(int index) to retrieve elements:");
        String firstFruit = fruits.get(0);
        String thirdFruit = fruits.get(2);
        System.out.println("Element at index 0: " + firstFruit);
        System.out.println("Element at index 2: " + thirdFruit);
        
        // 5. E set(int index, E obj) - Replaces element and returns the old element
        System.out.println("\n5. Using set(int index, E obj) to replace elements:");
        String oldFruit = fruits.set(3, "Date"); // Replace "Cherry" with "Date"
        System.out.println("Replaced '" + oldFruit + "' with 'Date' at index 3");
        System.out.println("Current list: " + fruits);
        
        // 6. E remove(int index) - Removes element and returns it
        System.out.println("\n6. Using remove(int index) to remove elements:");
        String removedFruit = fruits.remove(1); // Remove "Blueberry"
        System.out.println("Removed '" + removedFruit + "' from index 1");
        System.out.println("Current list: " + fruits);
        System.out.println("New size: " + fruits.size());
        
        // Demonstrate how elements shift when adding/removing
        System.out.println("\n7. Demonstrating how elements shift when adding/removing:");
        System.out.println("Original list: " + fruits);
        
        // Add at beginning
        fruits.add(0, "Apricot");
        System.out.println("After adding 'Apricot' at index 0: " + fruits);
        // All elements shifted right by 1
        
        // Remove from middle
        fruits.remove(2);
        System.out.println("After removing element at index 2: " + fruits);
        // All elements after index 2 shifted left by 1
        
        // Demonstrate with a different type
        System.out.println("\n8. Demonstrating ArrayList methods with Integer objects:");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Initial list: " + numbers);
        
        // Insert at index
        numbers.add(1, 15);
        System.out.println("After inserting 15 at index 1: " + numbers);
        
        // Replace element
        Integer oldNumber = numbers.set(2, 25);
        System.out.println("Replaced " + oldNumber + " with 25 at index 2: " + numbers);
        
        // Remove element
        Integer removedNumber = numbers.remove(0);
        System.out.println("Removed " + removedNumber + " from index 0: " + numbers);
        System.out.println("Final list: " + numbers);
    }
}
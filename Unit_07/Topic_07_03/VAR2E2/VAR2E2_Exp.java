/**
 * VAR-2.E.2 Example
 * Deleting elements during a traversal of an ArrayList requires using special techniques to avoid skipping elements.
 * 
 * This program demonstrates safe ways to delete elements while traversing an ArrayList.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class VAR2E2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating safe ways to delete elements while traversing an ArrayList:\n");
        
        // Create and populate an ArrayList
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        
        System.out.println("Original ArrayList: " + fruits);
        
        // Method 1: Using an Iterator with its remove() method
        System.out.println("\n1. Using an Iterator with its remove() method:");
        ArrayList<String> list1 = new ArrayList<String>(fruits); // Create a copy
        System.out.println("  Before: " + list1);
        
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.startsWith("B") || fruit.startsWith("D")) {
                // Safe way to remove elements during iteration
                iterator.remove();
                System.out.println("  Removed: " + fruit);
            }
        }
        
        System.out.println("  After: " + list1);
        
        // Method 2: Iterating backwards with a standard for loop
        System.out.println("\n2. Iterating backwards with a standard for loop:");
        ArrayList<String> list2 = new ArrayList<String>(fruits); // Create a copy
        System.out.println("  Before: " + list2);
        
        for (int i = list2.size() - 1; i >= 0; i--) {
            String fruit = list2.get(i);
            if (fruit.startsWith("C") || fruit.startsWith("E")) {
                list2.remove(i);
                System.out.println("  Removed: " + fruit);
            }
        }
        
        System.out.println("  After: " + list2);
        
        // Method 3: Using a temporary list to store elements to remove
        System.out.println("\n3. Using a temporary list to store elements to remove:");
        ArrayList<String> list3 = new ArrayList<String>(fruits); // Create a copy
        ArrayList<String> toRemove = new ArrayList<String>();
        System.out.println("  Before: " + list3);
        
        // First pass: identify elements to remove
        for (String fruit : list3) {
            if (fruit.startsWith("A") || fruit.startsWith("F")) {
                toRemove.add(fruit);
                System.out.println("  Marked for removal: " + fruit);
            }
        }
        
        // Second pass: remove the identified elements
        list3.removeAll(toRemove);
        
        System.out.println("  After: " + list3);
        
        // Method 4: Using CopyOnWriteArrayList (thread-safe collection that allows modification during iteration)
        System.out.println("\n4. Using CopyOnWriteArrayList:");
        CopyOnWriteArrayList<String> list4 = new CopyOnWriteArrayList<String>(fruits);
        System.out.println("  Before: " + list4);
        
        for (String fruit : list4) {
            if (fruit.length() <= 4) { // Remove short names
                list4.remove(fruit);
                System.out.println("  Removed: " + fruit);
            }
        }
        
        System.out.println("  After: " + list4);
        
        // Method 5: Using removeIf (Java 8+)
        System.out.println("\n5. Using removeIf method (Java 8+):");
        ArrayList<String> list5 = new ArrayList<String>(fruits); // Create a copy
        System.out.println("  Before: " + list5);
        
        // Remove elements that contain the letter 'e'
        list5.removeIf(fruit -> fruit.contains("e"));
        
        System.out.println("  After: " + list5);
        System.out.println("  (Removed all fruits containing the letter 'e')");
    }
}
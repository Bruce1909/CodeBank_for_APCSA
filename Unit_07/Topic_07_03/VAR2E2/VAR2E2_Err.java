/**
 * VAR-2.E.2 Error Example
 * Deleting elements during a traversal of an ArrayList requires using special techniques to avoid skipping elements.
 * 
 * This program demonstrates common errors when deleting elements while traversing an ArrayList.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class VAR2E2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when deleting elements during ArrayList traversal:\n");
        
        // Create and populate an ArrayList
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        
        System.out.println("Original ArrayList: " + fruits);
        
        // ERROR 1: Removing elements using ArrayList.remove() in an enhanced for loop
        System.out.println("\nERROR 1: Removing elements using ArrayList.remove() in an enhanced for loop");
        ArrayList<String> list1 = new ArrayList<String>(fruits); // Create a copy
        System.out.println("  Before: " + list1);
        
        try {
            System.out.println("  Attempting to remove elements starting with 'B' during enhanced for loop:");
            for (String fruit : list1) {
                System.out.println("    Processing: " + fruit);
                if (fruit.startsWith("B")) {
                    // This will cause ConcurrentModificationException
                    list1.remove(fruit);
                }
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("  Error caught: " + e.getClass().getSimpleName());
            System.out.println("  This happened because we modified the ArrayList during enhanced for loop iteration");
        }
        
        // ERROR 2: Removing elements using ArrayList.remove() in a standard for loop
        System.out.println("\nERROR 2: Removing elements using ArrayList.remove() in a standard for loop");
        ArrayList<String> list2 = new ArrayList<String>(fruits); // Create a copy
        System.out.println("  Before: " + list2);
        
        System.out.println("  Attempting to remove elements starting with 'C' during standard for loop:");
        for (int i = 0; i < list2.size(); i++) {
            String fruit = list2.get(i);
            System.out.println("    Processing index " + i + ": " + fruit);
            
            if (fruit.startsWith("C")) {
                list2.remove(i);
                // This doesn't throw an exception, but it causes elements to be skipped
                System.out.println("    Removed: " + fruit);
                // We don't decrement i, so we'll skip the next element
            }
        }
        
        System.out.println("  After: " + list2);
        System.out.println("  Notice that we didn't get an exception, but we might have skipped elements");
        System.out.println("  This is because removing an element shifts all subsequent elements to the left");
        
        // ERROR 3: Incorrect use of Iterator's remove() method
        System.out.println("\nERROR 3: Incorrect use of Iterator's remove() method");
        ArrayList<String> list3 = new ArrayList<String>(fruits); // Create a copy
        System.out.println("  Before: " + list3);
        
        try {
            System.out.println("  Attempting to use Iterator.remove() without calling next() first:");
            Iterator<String> iterator = list3.iterator();
            // This will cause IllegalStateException
            iterator.remove();
        } catch (IllegalStateException e) {
            System.out.println("  Error caught: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            System.out.println("  This happened because we called remove() without calling next() first");
        }
        
        // ERROR 4: Using ArrayList.remove() after obtaining an Iterator
        System.out.println("\nERROR 4: Using ArrayList.remove() after obtaining an Iterator");
        ArrayList<String> list4 = new ArrayList<String>(fruits); // Create a copy
        System.out.println("  Before: " + list4);
        
        try {
            System.out.println("  Attempting to use ArrayList.remove() while using an Iterator:");
            Iterator<String> iterator = list4.iterator();
            
            // Process the first element
            if (iterator.hasNext()) {
                String fruit = iterator.next();
                System.out.println("    Processing with iterator: " + fruit);
                
                // This will cause ConcurrentModificationException
                // We should use iterator.remove() instead
                list4.remove(fruit);
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("  Error caught: " + e.getClass().getSimpleName());
            System.out.println("  This happened because we used ArrayList.remove() after obtaining an Iterator");
            System.out.println("  Once you obtain an Iterator, you must use iterator.remove() to modify the collection");
        }
        
        // ERROR 5: Modifying the ArrayList in other ways during iteration
        System.out.println("\nERROR 5: Modifying the ArrayList in other ways during iteration");
        ArrayList<String> list5 = new ArrayList<String>(fruits); // Create a copy
        System.out.println("  Before: " + list5);
        
        try {
            System.out.println("  Attempting to add elements during enhanced for loop:");
            for (String fruit : list5) {
                System.out.println("    Processing: " + fruit);
                if (fruit.equals("Cherry")) {
                    // This will cause ConcurrentModificationException
                    list5.add("Cranberry");
                }
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("  Error caught: " + e.getClass().getSimpleName());
            System.out.println("  This happened because we added an element during enhanced for loop iteration");
            System.out.println("  Any structural modification (add/remove) during enhanced for loop causes this error");
        }
    }
}
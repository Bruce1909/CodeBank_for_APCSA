/**
 * VAR-2.E.4 Error Example
 * Changing the size of an ArrayList while traversing it using an enhanced for loop 
 * can result in a ConcurrentModificationException being thrown. 
 * Therefore, when using an enhanced for loop to traverse an ArrayList, you should not add or remove elements.
 * 
 * This program demonstrates errors that occur when modifying an ArrayList during enhanced for loop traversal.
 */
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class VAR2E4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors when modifying an ArrayList during enhanced for loop traversal:\n");
        
        // Create and populate an ArrayList
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Fish");
        animals.add("Rabbit");
        
        System.out.println("Original ArrayList: " + animals);
        
        // ERROR 1: Removing elements during enhanced for loop traversal
        System.out.println("\nERROR 1: Removing elements during enhanced for loop traversal");
        ArrayList<String> list1 = new ArrayList<String>(animals); // Create a copy
        System.out.println("  Before: " + list1);
        
        try {
            System.out.println("  Attempting to remove elements during enhanced for loop:");
            for (String animal : list1) {
                System.out.println("    Processing: " + animal);
                if (animal.equals("Dog")) {
                    // This will cause ConcurrentModificationException
                    list1.remove(animal);
                    System.out.println("    This line won't execute");
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("  Error caught: " + e.getClass().getSimpleName());
            System.out.println("  This happened because we tried to remove an element during enhanced for loop");
            System.out.println("  The enhanced for loop uses an Iterator internally, which detects the modification");
        }
        
        // ERROR 2: Adding elements during enhanced for loop traversal
        System.out.println("\nERROR 2: Adding elements during enhanced for loop traversal");
        ArrayList<String> list2 = new ArrayList<String>(animals); // Create a copy
        System.out.println("  Before: " + list2);
        
        try {
            System.out.println("  Attempting to add elements during enhanced for loop:");
            for (String animal : list2) {
                System.out.println("    Processing: " + animal);
                if (animal.equals("Bird")) {
                    // This will cause ConcurrentModificationException
                    list2.add("Parrot");
                    System.out.println("    This line won't execute");
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("  Error caught: " + e.getClass().getSimpleName());
            System.out.println("  This happened because we tried to add an element during enhanced for loop");
            System.out.println("  Any structural modification during enhanced for loop causes this error");
        }
        
        // ERROR 3: Clearing the list during enhanced for loop traversal
        System.out.println("\nERROR 3: Clearing the list during enhanced for loop traversal");
        ArrayList<String> list3 = new ArrayList<String>(animals); // Create a copy
        System.out.println("  Before: " + list3);
        
        try {
            System.out.println("  Attempting to clear the list during enhanced for loop:");
            for (String animal : list3) {
                System.out.println("    Processing: " + animal);
                if (animal.equals("Fish")) {
                    // This will cause ConcurrentModificationException
                    list3.clear();
                    System.out.println("    This line won't execute");
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("  Error caught: " + e.getClass().getSimpleName());
            System.out.println("  This happened because we tried to clear the list during enhanced for loop");
            System.out.println("  Clearing the list is a structural modification");
        }
        
        // ERROR 4: Modifying a different ArrayList that affects the one being traversed
        System.out.println("\nERROR 4: Modifying a different ArrayList that affects the one being traversed");
        ArrayList<String> list4 = new ArrayList<String>(animals); // Create a copy
        ArrayList<String> sharedList = list4; // Both variables reference the same ArrayList
        System.out.println("  Before: " + list4);
        
        try {
            System.out.println("  Attempting to modify the ArrayList through another reference:");
            for (String animal : list4) {
                System.out.println("    Processing: " + animal);
                if (animal.equals("Rabbit")) {
                    // This will cause ConcurrentModificationException
                    // Even though we're using a different variable name, it's the same ArrayList
                    sharedList.remove(0);
                    System.out.println("    This line won't execute");
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("  Error caught: " + e.getClass().getSimpleName());
            System.out.println("  This happened because we modified the ArrayList through another reference");
            System.out.println("  The enhanced for loop doesn't know how the modification happened");
        }
        
        // ERROR 5: Common mistake - trying to modify all elements matching a condition
        System.out.println("\nERROR 5: Common mistake - trying to modify all elements matching a condition");
        ArrayList<String> list5 = new ArrayList<String>();
        list5.add("Cat");
        list5.add("Kitten");
        list5.add("Dog");
        list5.add("Puppy");
        list5.add("Cat"); // Add duplicate
        System.out.println("  Before: " + list5);
        
        try {
            System.out.println("  Attempting to remove all occurrences of 'Cat' during enhanced for loop:");
            for (String animal : list5) {
                System.out.println("    Processing: " + animal);
                if (animal.equals("Cat")) {
                    // This will cause ConcurrentModificationException after the first removal
                    list5.remove(animal);
                    System.out.println("    Removed: " + animal); // This might execute for the first removal
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("  Error caught: " + e.getClass().getSimpleName());
            System.out.println("  This happened because we tried to remove multiple elements during enhanced for loop");
            System.out.println("  Even if the first removal succeeds, the loop will fail on subsequent modifications");
        }
        
        // Correct approach for removing all occurrences
        System.out.println("\n  Correct approach for removing all occurrences of 'Cat':");
        ArrayList<String> correctList = new ArrayList<String>(list5);
        correctList.removeIf(animal -> animal.equals("Cat"));
        System.out.println("  After correct removal: " + correctList);
    }
}
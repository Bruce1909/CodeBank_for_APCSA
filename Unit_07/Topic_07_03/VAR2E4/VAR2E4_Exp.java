/**
 * VAR-2.E.4 Example
 * Changing the size of an ArrayList while traversing it using an enhanced for loop 
 * can result in a ConcurrentModificationException being thrown. 
 * Therefore, when using an enhanced for loop to traverse an ArrayList, you should not add or remove elements.
 * 
 * This program demonstrates safe ways to traverse and modify an ArrayList.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class VAR2E4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating safe ways to traverse and modify an ArrayList:\n");
        
        // Create and populate an ArrayList
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Fish");
        animals.add("Rabbit");
        
        System.out.println("Original ArrayList: " + animals);
        
        // Method 1: Create a copy of the ArrayList before traversing
        System.out.println("\n1. Create a copy of the ArrayList before traversing:");
        ArrayList<String> animalsCopy = new ArrayList<String>(animals);
        ArrayList<String> animalsToRemove = new ArrayList<String>();
        
        // Identify elements to remove during traversal
        for (String animal : animalsCopy) {
            if (animal.length() <= 3) { // Identify short names
                animalsToRemove.add(animal);
                System.out.println("  Identified for removal: " + animal);
            }
        }
        
        // Remove the identified elements from the original list
        animals.removeAll(animalsToRemove);
        System.out.println("  After removal: " + animals);
        
        // Method 2: Use an Iterator instead of enhanced for loop
        System.out.println("\n2. Use an Iterator instead of enhanced for loop:");
        animals = new ArrayList<String>(animalsCopy); // Reset to original
        System.out.println("  Reset to original: " + animals);
        
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            if (animal.length() <= 3) {
                iterator.remove(); // Safe way to remove during iteration
                System.out.println("  Removed: " + animal);
            }
        }
        System.out.println("  After removal using Iterator: " + animals);
        
        // Method 3: Use a standard for loop with index
        System.out.println("\n3. Use a standard for loop with index:");
        animals = new ArrayList<String>(animalsCopy); // Reset to original
        System.out.println("  Reset to original: " + animals);
        
        for (int i = animals.size() - 1; i >= 0; i--) {
            String animal = animals.get(i);
            if (animal.length() <= 3) {
                animals.remove(i);
                System.out.println("  Removed: " + animal + " at index " + i);
            }
        }
        System.out.println("  After removal using indexed for loop: " + animals);
        
        // Method 4: Use removeIf (Java 8+)
        System.out.println("\n4. Use removeIf method (Java 8+):");
        animals = new ArrayList<String>(animalsCopy); // Reset to original
        System.out.println("  Reset to original: " + animals);
        
        // Remove elements with short names
        animals.removeIf(animal -> animal.length() <= 3);
        System.out.println("  After removal using removeIf: " + animals);
        
        // Method 5: Use CopyOnWriteArrayList
        System.out.println("\n5. Use CopyOnWriteArrayList:");
        CopyOnWriteArrayList<String> safeList = new CopyOnWriteArrayList<String>(animalsCopy);
        System.out.println("  Original CopyOnWriteArrayList: " + safeList);
        
        // CopyOnWriteArrayList allows modification during enhanced for loop
        for (String animal : safeList) {
            if (animal.length() <= 3) {
                safeList.remove(animal);
                System.out.println("  Safely removed during iteration: " + animal);
            }
        }
        System.out.println("  After removal using CopyOnWriteArrayList: " + safeList);
        
        // Method 6: Process elements during traversal without modifying the collection
        System.out.println("\n6. Process elements during traversal without modifying the collection:");
        animals = new ArrayList<String>(animalsCopy); // Reset to original
        System.out.println("  Reset to original: " + animals);
        
        // Create a new list for processed elements
        ArrayList<String> processedAnimals = new ArrayList<String>();
        
        // Process each element during traversal
        for (String animal : animals) {
            // Transform the element instead of modifying the original list
            String processed = animal.toUpperCase();
            processedAnimals.add(processed);
            System.out.println("  Processed: " + animal + " -> " + processed);
        }
        
        // Replace the original list after traversal is complete
        animals = processedAnimals;
        System.out.println("  After processing: " + animals);
    }
}
/**
 * VAR-2.E.1 Error Example
 * Iteration statements can be used to access all the elements in an ArrayList.
 * This is called traversing the ArrayList.
 * 
 * This program demonstrates common errors when traversing an ArrayList.
 */
import java.util.ArrayList;

public class VAR2E1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when traversing an ArrayList:\n");
        
        // Create and populate an ArrayList
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        
        System.out.println("Original ArrayList: " + cities);
        
        // ERROR 1: Index out of bounds in a for loop
        System.out.println("\nERROR 1: Index out of bounds in a for loop");
        try {
            // Common mistake: using <= instead of < in the loop condition
            System.out.println("Attempting to iterate with i <= cities.size():");
            for (int i = 0; i <= cities.size(); i++) {
                // This will cause an IndexOutOfBoundsException on the last iteration
                String city = cities.get(i);
                System.out.println("  Index " + i + ": " + city);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("  Error caught: " + e.getMessage());
            System.out.println("  This happened because we used <= instead of < in the loop condition");
            System.out.println("  Valid indices are 0 to " + (cities.size() - 1));
        }
        
        // ERROR 2: Starting index from 1 instead of 0
        System.out.println("\nERROR 2: Starting index from 1 instead of 0");
        try {
            // Common mistake: starting the index from 1 instead of 0
            System.out.println("Attempting to iterate with index starting from 1:");
            for (int i = 1; i < cities.size() + 1; i++) {
                // This will cause an IndexOutOfBoundsException on the last iteration
                String city = cities.get(i);
                System.out.println("  Index " + i + ": " + city);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("  Error caught: " + e.getMessage());
            System.out.println("  This happened because we started the index from 1 instead of 0");
            System.out.println("  ArrayList indices start at 0, not 1");
        }
        
        // ERROR 3: Negative index in a while loop
        System.out.println("\nERROR 3: Negative index in a while loop");
        try {
            // Common mistake: using a negative index
            System.out.println("Attempting to access a negative index:");
            int index = -1;
            String city = cities.get(index);
            System.out.println("  Index " + index + ": " + city);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("  Error caught: " + e.getMessage());
            System.out.println("  This happened because we tried to access a negative index");
            System.out.println("  ArrayList indices must be non-negative");
        }
        
        // ERROR 4: Modifying the loop variable in an enhanced for loop
        System.out.println("\nERROR 4: Modifying the loop variable in an enhanced for loop");
        System.out.println("Original ArrayList: " + cities);
        System.out.println("Attempting to modify elements using the loop variable in an enhanced for loop:");
        
        for (String city : cities) {
            // This will not modify the ArrayList elements
            city = city.toUpperCase();
            System.out.println("  Modified in loop: " + city);
        }
        
        System.out.println("ArrayList after loop: " + cities);
        System.out.println("  Notice that the ArrayList elements were not modified!");
        System.out.println("  This is because the loop variable is a copy of the element, not a reference to it");
        
        // Correct way to modify elements
        System.out.println("\nCorrect way to modify elements (using standard for loop):");
        for (int i = 0; i < cities.size(); i++) {
            cities.set(i, cities.get(i).toUpperCase());
        }
        System.out.println("ArrayList after correct modification: " + cities);
    }
}
/**
 * VAR-2.E.3 Error Example
 * Since the indices for an ArrayList start at 0 and end at the number of elements −1, 
 * accessing an index value outside of this range will result in an IndexOutOfBoundsException being thrown.
 * 
 * This program demonstrates common errors related to ArrayList indices.
 */
import java.util.ArrayList;

public class VAR2E3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with ArrayList indices:\n");
        
        // Create and populate an ArrayList
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        
        System.out.println("ArrayList: " + colors);
        System.out.println("Size: " + colors.size());
        System.out.println("Valid indices: 0 to " + (colors.size() - 1));
        
        // ERROR 1: Accessing an index that is too large
        System.out.println("\nERROR 1: Accessing an index that is too large");
        try {
            int largeIndex = colors.size(); // One beyond the last valid index
            System.out.println("Attempting to access index " + largeIndex);
            String color = colors.get(largeIndex);
            System.out.println("This line won't execute");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because we tried to access an index equal to the size");
            System.out.println("Remember: Valid indices are 0 to size()-1");
        }
        
        // ERROR 2: Accessing a negative index
        System.out.println("\nERROR 2: Accessing a negative index");
        try {
            int negativeIndex = -1;
            System.out.println("Attempting to access index " + negativeIndex);
            String color = colors.get(negativeIndex);
            System.out.println("This line won't execute");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because we tried to access a negative index");
            System.out.println("ArrayList indices must be non-negative");
        }
        
        // ERROR 3: Inserting at an invalid index
        System.out.println("\nERROR 3: Inserting at an invalid index");
        try {
            int invalidInsertIndex = colors.size() + 2; // More than one beyond the last valid insert position
            System.out.println("Attempting to insert at index " + invalidInsertIndex);
            colors.add(invalidInsertIndex, "Yellow");
            System.out.println("This line won't execute");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because we tried to insert at an invalid position");
            System.out.println("Valid insertion indices are 0 to size()");
        }
        
        // ERROR 4: Removing from an invalid index
        System.out.println("\nERROR 4: Removing from an invalid index");
        try {
            int invalidRemoveIndex = colors.size();
            System.out.println("Attempting to remove from index " + invalidRemoveIndex);
            colors.remove(invalidRemoveIndex);
            System.out.println("This line won't execute");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because we tried to remove from an invalid position");
            System.out.println("Valid removal indices are 0 to size()-1");
        }
        
        // ERROR 5: Setting a value at an invalid index
        System.out.println("\nERROR 5: Setting a value at an invalid index");
        try {
            int invalidSetIndex = 10;
            System.out.println("Attempting to set a value at index " + invalidSetIndex);
            colors.set(invalidSetIndex, "Purple");
            System.out.println("This line won't execute");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because we tried to set a value at an invalid index");
            System.out.println("Valid set indices are 0 to size()-1");
        }
        
        // ERROR 6: Common logic error - off-by-one in a loop
        System.out.println("\nERROR 6: Common logic error - off-by-one in a loop");
        try {
            System.out.println("Attempting to iterate with incorrect loop bounds:");
            // Common mistake: using <= instead of < in the loop condition
            for (int i = 0; i <= colors.size(); i++) {
                String color = colors.get(i);
                System.out.println("  Index " + i + ": " + color);
            }
            System.out.println("This line won't execute");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error caught: " + e.getMessage());
            System.out.println("This happened because of an off-by-one error in the loop condition");
            System.out.println("Use 'i < colors.size()' instead of 'i <= colors.size()'");
        }
    }
}
/**
 * VAR-2.E.3 Example
 * Since the indices for an ArrayList start at 0 and end at the number of elements −1, 
 * accessing an index value outside of this range will result in an IndexOutOfBoundsException being thrown.
 * 
 * This program demonstrates how to safely work with ArrayList indices.
 */
import java.util.ArrayList;

public class VAR2E3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating safe handling of ArrayList indices:\n");
        
        // Create and populate an ArrayList
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        
        System.out.println("ArrayList: " + colors);
        System.out.println("Size: " + colors.size());
        System.out.println("Valid indices: 0 to " + (colors.size() - 1));
        
        // 1. Safely accessing elements using valid indices
        System.out.println("\n1. Safely accessing elements using valid indices:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("  Element at index " + i + ": " + colors.get(i));
        }
        
        // 2. Checking if an index is valid before accessing
        System.out.println("\n2. Checking if an index is valid before accessing:");
        int index = 4; // An invalid index
        if (index >= 0 && index < colors.size()) {
            System.out.println("  Element at index " + index + ": " + colors.get(index));
        } else {
            System.out.println("  Index " + index + " is out of bounds (valid range: 0-" + (colors.size() - 1) + ")");
        }
        
        // 3. Using try-catch to handle potential IndexOutOfBoundsException
        System.out.println("\n3. Using try-catch to handle potential IndexOutOfBoundsException:");
        try {
            // Attempt to access an element at a potentially invalid index
            int userIndex = -1; // Simulating a user input
            System.out.println("  Attempting to access index " + userIndex);
            String color = colors.get(userIndex);
            System.out.println("  Element found: " + color);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("  Error caught: " + e.getMessage());
            System.out.println("  Providing user-friendly message: Please enter a valid index between 0 and " + 
                             (colors.size() - 1));
        }
        
        // 4. Safely inserting elements at valid positions
        System.out.println("\n4. Safely inserting elements at valid positions:");
        int insertIndex = 1;
        if (insertIndex >= 0 && insertIndex <= colors.size()) { // Note: <= size() is valid for insertion
            colors.add(insertIndex, "Yellow");
            System.out.println("  Successfully inserted 'Yellow' at index " + insertIndex);
            System.out.println("  Updated ArrayList: " + colors);
        } else {
            System.out.println("  Cannot insert at index " + insertIndex + 
                             " (valid range for insertion: 0-" + colors.size() + ")");
        }
        
        // 5. Safely removing elements at valid positions
        System.out.println("\n5. Safely removing elements at valid positions:");
        int removeIndex = 2;
        if (removeIndex >= 0 && removeIndex < colors.size()) {
            String removed = colors.remove(removeIndex);
            System.out.println("  Successfully removed '" + removed + "' from index " + removeIndex);
            System.out.println("  Updated ArrayList: " + colors);
        } else {
            System.out.println("  Cannot remove from index " + removeIndex + 
                             " (valid range: 0-" + (colors.size() - 1) + ")");
        }
        
        // 6. Using a helper method to safely get elements
        System.out.println("\n6. Using a helper method to safely get elements:");
        System.out.println("  Element at index 0: " + safeGet(colors, 0));
        System.out.println("  Element at index 10: " + safeGet(colors, 10));
    }
    
    /**
     * A helper method to safely get an element from an ArrayList.
     * Returns the element if the index is valid, or a default message if not.
     */
    private static String safeGet(ArrayList<String> list, int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        } else {
            return "<index out of bounds>";
        }
    }
}
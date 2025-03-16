import java.util.ArrayList;

/**
 * This program demonstrates the correct implementation of sequential/linear search
 * algorithm to search for specific information in an ArrayList.
 *
 * Knowledge Point:
 * - Sequential/linear search checks each element in order until the desired value
 *   is found or all elements in the ArrayList have been checked.
 */
public class CON2K2_Exp {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");
        
        String target = "Charlie";

        // Perform sequential search
        int index = sequentialSearch(names, target);

        // Display the result
        if (index != -1) {
            System.out.println("Found '" + target + "' at index " + index);
        } else {
            System.out.println("'" + target + "' was not found in the ArrayList");
        }

        // Example with a value that doesn't exist in the ArrayList
        target = "Frank";
        index = sequentialSearch(names, target);
        if (index != -1) {
            System.out.println("Found '" + target + "' at index " + index);
        } else {
            System.out.println("'" + target + "' was not found in the ArrayList");
        }
        
        // Example of searching for an element that satisfies a condition
        System.out.println("\nSearching for a name that starts with 'D':");
        index = searchByCondition(names, "D");
        if (index != -1) {
            System.out.println("Found name starting with 'D' at index " + index + ": " + names.get(index));
        } else {
            System.out.println("No name starting with 'D' was found");
        }
    }

    /**
     * Performs a sequential search on an ArrayList of Strings.
     * @param list The ArrayList to search through
     * @param target The value to search for
     * @return The index of the target if found, -1 otherwise
     */
    public static int sequentialSearch(ArrayList<String> list, String target) {
        // Check each element in order
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i; // Return the index when target is found
            }
        }
        return -1; // Return -1 if target is not found
    }
    
    /**
     * Searches for the first element that starts with the given prefix.
     * @param list The ArrayList to search through
     * @param prefix The prefix to search for
     * @return The index of the first matching element, -1 if none found
     */
    public static int searchByCondition(ArrayList<String> list, String prefix) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith(prefix)) {
                return i; // Return the index of the first element that satisfies the condition
            }
        }
        return -1; // Return -1 if no element satisfies the condition
    }
}
import java.util.ArrayList;

/**
 * This program demonstrates common mistakes when implementing sequential/linear search
 * algorithm to search for specific information in an ArrayList.
 *
 * Common Mistakes:
 * 1. Not checking all elements (early termination)
 * 2. Not handling null values properly
 * 3. Using == instead of equals() for String comparison
 */
public class CON2K2_Err {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add(null);  // Add a null value to demonstrate error handling
        names.add("Eve");
        
        String target = "Charlie";

        // Example 1: Incorrect implementation - early termination
        System.out.println("\nExample 1: Early termination bug");
        int index = incorrectSearchEarlyTermination(names, target);
        System.out.println("Result (should be 2, but got): " + index);

        // Example 2: Incorrect implementation - no null check
        System.out.println("\nExample 2: No null check");
        try {
            index = incorrectSearchNoNullCheck(names, target);
            System.out.println("Result (should throw exception): " + index);
        } catch (NullPointerException e) {
            System.out.println("Correctly caught null pointer exception");
        }

        // Example 3: Incorrect implementation - wrong string comparison
        System.out.println("\nExample 3: Wrong string comparison");
        index = incorrectStringComparison(names, new String("Charlie"));
        System.out.println("Result (should be 2, but got): " + index);
    }

    /**
     * Incorrect implementation: Early termination bug.
     * Bug: Returns -1 immediately if any element doesn't match,
     * instead of continuing to check remaining elements.
     */
    public static int incorrectSearchEarlyTermination(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && list.get(i).equals(target)) {
                return i;
            } else {
                return -1; // BUG: Returns too early!
            }
        }
        return -1;
    }

    /**
     * Incorrect implementation: No null check.
     * Bug: Doesn't check for null values, which will cause NullPointerException.
     */
    public static int incorrectSearchNoNullCheck(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) { // BUG: No null check!
                return i;
            }
        }
        return -1;
    }

    /**
     * Incorrect implementation: Wrong string comparison.
     * Bug: Uses == instead of equals() for String comparison.
     */
    public static int incorrectStringComparison(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) { // BUG: Should use equals() instead of ==
                return i;
            }
        }
        return -1;
    }
}
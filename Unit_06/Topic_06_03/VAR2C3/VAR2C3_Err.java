/**
 * VAR-2.C.3 Error Example
 * Assigning a new value to the enhanced `for` loop variable does not change the value stored in the array.
 * 
 * This program demonstrates common errors when trying to modify array elements through enhanced for loop variables.
 */
public class VAR2C3_Err {
    public static void main(String[] args) {
        // Create a 1D array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Original array values:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // ERROR: Attempting to modify array elements through the loop variable
        System.out.println("\nError example: Attempting to double each value in the array");
        System.out.println("(This won't work because the loop variable is just a copy)");
        
        for (int num : numbers) {
            // This modification only affects the local copy, not the array element
            num = num * 2;
            System.out.println("Modified loop variable: " + num);
        }
        
        // The array remains unchanged
        System.out.println("\nArray after attempted modification (unchanged):");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Common misconception with objects
        System.out.println("\nError example with objects:");
        StringBuilder[] builders = {
            new StringBuilder("First"),
            new StringBuilder("Second"),
            new StringBuilder("Third")
        };
        
        System.out.println("Original StringBuilder contents:");
        for (StringBuilder sb : builders) {
            System.out.print(sb + " ");
        }
        System.out.println();
        
        System.out.println("\nAttempting to reassign loop variable (won't affect array):");
        for (StringBuilder sb : builders) {
            // Reassigning the loop variable doesn't affect the array
            sb = new StringBuilder("Changed");
            System.out.println("Loop variable now: " + sb);
        }
        
        System.out.println("\nArray after attempted reassignment (unchanged):");
        for (StringBuilder sb : builders) {
            System.out.print(sb + " "); // Original references remain unchanged
        }
        System.out.println();
        
        System.out.println("\nHowever, modifying the object state WILL work:");
        for (StringBuilder sb : builders) {
            // Modifying the object state works because we're using the same reference
            sb.append("_Modified");
        }
        
        System.out.println("Array after modifying object state (changed):");
        for (StringBuilder sb : builders) {
            System.out.print(sb + " "); // Objects are modified
        }
        System.out.println();
    }
}
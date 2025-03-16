/**
 * VAR-2.C.1 Example
 * An enhanced `for` loop header includes a variable, referred to as the enhanced `for` loop variable.
 * 
 * This program demonstrates the correct usage of an enhanced for loop variable
 * to traverse elements in a 1D array.
 */
public class VAR2C1_Exp {
    public static void main(String[] args) {
        // Create a 1D array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Traversing array using enhanced for loop:");
        
        // Enhanced for loop with properly declared loop variable
        // The loop variable 'num' is declared as an int to match the array element type
        for (int num : numbers) {
            System.out.println("Current element: " + num);
        }
        
        // Another example with a String array
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        
        System.out.println("\nTraversing String array using enhanced for loop:");
        
        // Enhanced for loop variable 'fruit' is declared as a String
        for (String fruit : fruits) {
            System.out.println("Current fruit: " + fruit);
        }
    }
}
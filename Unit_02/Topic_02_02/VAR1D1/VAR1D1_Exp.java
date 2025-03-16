/**
 * This program demonstrates the correct use of the null keyword
 * VAR-1.D.1: The keyword null is a special value used to indicate 
 * that a reference is not associated with any object.
 */
public class VAR1D1_Exp {
    public static void main(String[] args) {
        // Declaring a reference variable and initializing it to null
        String message = null;
        System.out.println("Initial value of message: " + message);
        
        // Checking if a reference is null before using it
        if (message == null) {
            System.out.println("The message variable is null. Assigning a value to it.");
            message = "Hello, World!";
        }
        
        System.out.println("Current value of message: " + message);
        
        // Example with an object reference
        Object obj = null;
        System.out.println("\nInitial value of obj: " + obj);
        
        // Assigning an object to the reference
        obj = new Object();
        System.out.println("After assignment, obj: " + obj);
        
        // Setting back to null
        obj = null;
        System.out.println("After setting to null, obj: " + obj);
        
        System.out.println("\nThis program demonstrates the correct use of null keyword.");
    }
}
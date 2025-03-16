/**
 * This program demonstrates the incorrect use of the null keyword
 * VAR-1.D.1: The keyword null is a special value used to indicate 
 * that a reference is not associated with any object.
 * 
 * ERROR: This program will throw a NullPointerException because it attempts
 * to call methods on a null reference.
 */
public class VAR1D1_Err {
    public static void main(String[] args) {
        // Declaring a reference variable and initializing it to null
        String message = null;
        System.out.println("Initial value of message: " + message);
        
        // ERROR: Attempting to call a method on a null reference
        // This will cause a NullPointerException
        System.out.println("The length of message is: " + message.length());
        
        // The following code will never execute due to the exception above
        System.out.println("This line will not be printed.");
        
        // Another example of null reference error
        Object obj = null;
        // ERROR: Attempting to call toString() on a null reference
        // This would also cause a NullPointerException if reached
        System.out.println("Object's toString(): " + obj.toString());
    }
}
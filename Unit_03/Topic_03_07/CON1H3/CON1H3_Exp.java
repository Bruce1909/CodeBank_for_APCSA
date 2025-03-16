/**
 * CON-1.H.3: A reference value can be compared with `null`, using `==` or `!=`, to determine if the reference actually references an object.
 *
 * This example demonstrates how to properly check if an object reference is null or not.
 * Using == and != operators to compare references with null is the correct approach.
 */
public class CON1H3_Exp {
    public static void main(String[] args) {
        // Create a Message object
        Message message1 = new Message("Hello, world!");
        
        // Create a null reference
        Message message2 = null;
        
        // Using == to check if a reference is null
        System.out.println("Checking if references are null using == operator:");
        System.out.println("message1 == null: " + (message1 == null));
        System.out.println("message2 == null: " + (message2 == null));
        
        // Using != to check if a reference is not null
        System.out.println("\nChecking if references are not null using != operator:");
        System.out.println("message1 != null: " + (message1 != null));
        System.out.println("message2 != null: " + (message2 != null));
        
        // Demonstrate safe method calls with null checks
        System.out.println("\nSafe method calls with null checks:");
        
        // Safe way to call methods on potentially null references
        if (message1 != null) {
            System.out.println("message1 content: " + message1.getContent());
        } else {
            System.out.println("message1 is null, cannot access content.");
        }
        
        if (message2 != null) {
            System.out.println("message2 content: " + message2.getContent());
        } else {
            System.out.println("message2 is null, cannot access content.");
        }
        
        // Demonstrate assigning null to an existing reference
        System.out.println("\nAssigning null to an existing reference:");
        System.out.println("Before: message1 == null: " + (message1 == null));
        message1 = null; // Set reference to null
        System.out.println("After: message1 == null: " + (message1 == null));
    }
}

/**
 * A simple Message class to demonstrate null references
 */
class Message {
    private String content;
    
    public Message(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
}
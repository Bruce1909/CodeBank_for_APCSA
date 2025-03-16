/**
 * CON-1.H.3: A reference value can be compared with `null`, using `==` or `!=`, to determine if the reference actually references an object.
 *
 * This example demonstrates common errors when checking for null references.
 * It shows the consequences of not properly checking for null before accessing object methods or properties.
 */
public class CON1H3_Err {
    public static void main(String[] args) {
        // Create a null reference
        Message message = null;
        
        // MISCONCEPTION: Forgetting to check for null before accessing methods
        System.out.println("MISCONCEPTION: Forgetting to check for null");
        System.out.println("The following line will cause a NullPointerException:");
        
        try {
            // This will cause a NullPointerException
            System.out.println("Message content: " + message.getContent());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
            System.out.println("This error occurs because we tried to call a method on a null reference.");
        }
        
        // MISCONCEPTION: Using equals() method to check for null
        System.out.println("\nMISCONCEPTION: Using equals() method to check for null");
        System.out.println("The following line will also cause a NullPointerException:");
        
        try {
            // This is incorrect and will cause a NullPointerException
            // because null.equals() is attempting to call a method on null
            if (message.equals(null)) {
                System.out.println("This will never execute");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
            System.out.println("This error occurs because we tried to call equals() on a null reference.");
        }
        
        // CORRECT APPROACH: Using == to check for null
        System.out.println("\nCORRECT APPROACH: Using == to check for null");
        if (message == null) {
            System.out.println("message is null. We should not call methods on it.");
        }
        
        // Create a non-null reference
        Message validMessage = new Message("Hello!");
        
        // MISCONCEPTION: Unnecessary null check for a method that returns a primitive
        System.out.println("\nMISCONCEPTION: Unnecessary null check for primitive return values");
        
        // This is unnecessary because primitives cannot be null
        // However, the method itself could throw NullPointerException if the object is null
        int length = validMessage.getContentLength();
        // if (length != null) { // This will cause a compilation error because int cannot be null
        //     System.out.println("Content length: " + length);
        // }
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
    
    public int getContentLength() {
        return content.length();
    }
}
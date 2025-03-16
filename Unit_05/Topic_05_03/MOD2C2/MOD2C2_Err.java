/**
 * MOD2C2_Err.java
 * This program demonstrates common errors related to the three types of comments in Java (MOD-2.C.2).
 * 
 * @author AP CSA
 */
public class MOD2C2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with the three types of comments in Java:\n");
        
        // ERROR 1: Misusing single-line comments
        System.out.println("ERROR 1: Misusing single-line comments");
        System.out.println("Single-line comments only affect the current line:");
        
        // The following line demonstrates a common misunderstanding
        System.out.println("Uncommenting the following would cause unexpected behavior:");
        // System.out.println("This line is commented out");
        // But this line would still execute if uncommented!
        
        System.out.println("To comment out multiple lines, you need // on each line\n");
        
        // ERROR 2: Incorrect block comment syntax
        System.out.println("ERROR 2: Incorrect block comment syntax");
        System.out.println("Block comments must have proper opening and closing markers:");
        
        System.out.println("Uncommenting the following would cause a compilation error:");
        // The following would cause errors if uncommented:
        // /* This block comment is not closed properly
        // System.out.println("This would cause a compilation error");
        
        System.out.println("Block comments cannot be nested\n");
        
        // ERROR 3: Misunderstanding Javadoc comments
        System.out.println("ERROR 3: Misunderstanding Javadoc comments");
        System.out.println("Javadoc comments are not processed unless they're in the correct position:");
        
        /** This is a Javadoc comment, but it's not attached to any class, method, or field */
        System.out.println("The above Javadoc comment won't be included in generated documentation");
        
        System.out.println("Javadoc comments must be placed immediately before classes, methods, or fields\n");
        
        // ERROR 4: Using the wrong comment type for the situation
        System.out.println("ERROR 4: Using the wrong comment type for the situation");
        System.out.println("Using single-line comments for large blocks of text is inefficient:");
        
        // This is a large block of text that would be better as a block comment
        // It requires adding // at the beginning of each line
        // which makes it harder to edit and maintain
        // Block comments would be more appropriate here
        
        System.out.println("Using block comments for API documentation won't generate proper documentation\n");
        
        // ERROR 5: Forgetting that comments don't affect code execution
        System.out.println("ERROR 5: Forgetting that comments don't affect code execution");
        
        int x = 10;
        /* The following comment doesn't change the value of x */
        // x = 20;
        System.out.println("x = " + x + " (comments don't change variable values)");
        
        System.out.println("\nKey points about comment errors:");
        System.out.println("- Single-line comments only affect the current line");
        System.out.println("- Block comments need proper opening /* and closing */ markers");
        System.out.println("- Javadoc comments must be placed before classes, methods, or fields");
        System.out.println("- Choose the appropriate comment type for each situation");
        System.out.println("- Remember that comments never affect code execution");
    }
    
    // This method has a regular comment instead of a Javadoc comment
    // This is not ideal for methods that should be documented
    public static int add(int a, int b) {
        return a + b;
    }
    
    /* This method has a block comment instead of a Javadoc comment
       It won't be properly included in generated API documentation */
    public static int subtract(int a, int b) {
        return a - b;
    }
}
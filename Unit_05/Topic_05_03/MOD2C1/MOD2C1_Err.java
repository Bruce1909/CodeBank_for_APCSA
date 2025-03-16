/**
 * MOD2C1_Err.java
 * This program demonstrates common errors related to comments (MOD-2.C.1).
 * 
 * @author AP CSA
 */
public class MOD2C1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to comments:\n");
        
        // ERROR 1: Assuming commented code will execute
        System.out.println("ERROR 1: Assuming commented code will execute");
        System.out.println("The following commented code will NOT execute:");
        // int x = 10;
        // System.out.println("The value of x is: " + x);
        
        // If we try to use x, we'll get a compilation error because x was never declared
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // System.out.println("x = " + x); // Error: x cannot be resolved to a variable
        System.out.println();
        
        // ERROR 2: Incorrect comment syntax
        System.out.println("ERROR 2: Incorrect comment syntax");
        System.out.println("The following lines show incorrect comment syntax (commented out to prevent errors):");
        // This would cause errors if uncommented:
        // / This is not a valid comment - missing a slash
        // /* This comment is not closed properly
        // /** This Javadoc comment is not closed properly
        System.out.println();
        
        // ERROR 3: Nested comments don't work as expected
        System.out.println("ERROR 3: Nested comments don't work as expected");
        System.out.println("The following shows a nested comment issue (commented out to prevent errors):");
        /*
        System.out.println("This line is commented out");
        /* This is a nested comment attempt */
        // System.out.println("This line would actually execute if uncommented!");
        */
        System.out.println("Java does not support nested block comments.\n");
        
        // ERROR 4: Confusing comments with actual code
        System.out.println("ERROR 4: Confusing comments with actual code");
        System.out.println("Comments do not affect program logic or execution:");
        
        int total = 5;
        // total = total + 10; // This line is commented out and has no effect
        System.out.println("Total: " + total + " (still 5 because the addition was commented out)\n");
        
        // ERROR 5: Relying on comments to change program behavior
        System.out.println("ERROR 5: Relying on comments to change program behavior");
        System.out.println("Comments cannot be used to conditionally execute code like if statements:");
        
        boolean condition = true;
        // if (condition) {
        System.out.println("This line always executes regardless of the condition");
        // }
        
        System.out.println("\nKey points about comment errors:");
        System.out.println("- Comments are NEVER executed, regardless of their content");
        System.out.println("- Commented code is completely ignored by the compiler");
        System.out.println("- Comments cannot be used to control program flow");
        System.out.println("- Nested block comments are not supported in Java");
        System.out.println("- Incorrect comment syntax can lead to compilation errors");
    }
}
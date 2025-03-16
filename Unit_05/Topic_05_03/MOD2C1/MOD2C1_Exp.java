/**
 * MOD2C1_Exp.java
 * This program demonstrates how comments are ignored by the compiler
 * and not executed when the program runs (MOD-2.C.1).
 * 
 * @author AP CSA
 */
public class MOD2C1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how comments are ignored by the compiler:\n");
        
        // This is a single-line comment - it will be ignored by the compiler
        System.out.println("1. This line is executed");
        
        /* This is a multi-line comment
           Everything between the opening and closing
           comment markers is ignored by the compiler */
        System.out.println("2. This line is also executed");
        
        // System.out.println("This line will NOT be executed because it's commented out");
        
        /* The following line is inside a comment block
        System.out.println("This line will NOT be executed either");
        */
        
        // Comments can contain code, special characters, or anything else
        // int x = 5 + 3; // This code is not executed
        
        int sum = 5 + 3; // The code before the comment is executed, but this comment is ignored
        System.out.println("3. The sum is: " + sum);
        
        /*
         * Comments can also be used to temporarily disable code during testing
         * This is sometimes called "commenting out" code
         */
        System.out.println("\nKey points about comments:");
        System.out.println("- Comments are completely ignored by the compiler");
        System.out.println("- Comments do not affect program execution in any way");
        System.out.println("- Comments are purely for human readers of the code");
        System.out.println("- Comments can be used to explain code or temporarily disable code");
    }
}
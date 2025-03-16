/**
 * MOD2C2_Exp.java
 * This program demonstrates the three types of comments in Java (MOD-2.C.2):
 * 1. Block comments using /* */
 * 2. Single-line comments using //
 * 3. Javadoc comments using /** */
 *
 * @author AP CSA
 * @version 1.0
 */
public class MOD2C2_Exp {
    
    /**
     * This is a Javadoc comment for the main method.
     * Javadoc comments are used to generate API documentation.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Demonstrating the three types of comments in Java:\n");
        
        // PART 1: Single-line comments
        System.out.println("1. Single-line comments (//)");
        System.out.println("   - Used for brief explanations or notes");
        System.out.println("   - Only comment out code to the end of the line");
        
        // This is a single-line comment
        int x = 10; // This is also a single-line comment
        
        // Multiple single-line comments
        // can be used to create
        // a multi-line comment block
        
        System.out.println("   Example: x = " + x + " // Value initialized to 10");
        System.out.println();
        
        /* PART 2: Block comments
           Block comments can span multiple lines
           without needing to add // at the beginning of each line */
        System.out.println("2. Block comments (/* */)");
        System.out.println("   - Can span multiple lines");
        System.out.println("   - Useful for longer explanations");
        System.out.println("   - Can be used to comment out blocks of code");
        
        /* This is a block comment
           that spans multiple lines */
        
        int y = 20; /* This is a block comment on the same line as code */
        
        System.out.println("   Example: y = " + y + " /* Value initialized to 20 */");
        System.out.println();
        
        /**
         * PART 3: Javadoc comments
         * Javadoc comments are special block comments that start with /**
         * They are used to generate API documentation
         */
        System.out.println("3. Javadoc comments (/** */)");
        System.out.println("   - Used to generate API documentation");
        System.out.println("   - Should be placed before classes, methods, and fields");
        System.out.println("   - Can include special tags like @param, @return, @author");
        
        // Call a method with Javadoc comments
        int sum = add(5, 3);
        System.out.println("   Example: sum = " + sum + " (calculated by the add method)");
        
        System.out.println("\nKey points about the three types of comments:");
        System.out.println("- All comments are ignored by the compiler");
        System.out.println("- Single-line comments are best for brief notes");
        System.out.println("- Block comments are good for longer explanations");
        System.out.println("- Javadoc comments are essential for documenting APIs");
    }
    
    /**
     * Adds two integers and returns the sum.
     * This is a Javadoc comment that demonstrates proper API documentation.
     * 
     * @param a the first integer to add
     * @param b the second integer to add
     * @return the sum of a and b
     */
    public static int add(int a, int b) {
        return a + b; // Return the sum
    }
}
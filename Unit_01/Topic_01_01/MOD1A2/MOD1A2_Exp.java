/**
 * MOD1A2_Exp.java
 * 
 * This program demonstrates the difference between System.out.println and System.out.print
 * regarding cursor movement after displaying information.
 * 
 * Knowledge Point: MOD-1.A.2
 * System.out.println moves the cursor to a new line after the information has been displayed,
 * while System.out.print does not.
 */
public class MOD1A2_Exp {
    public static void main(String[] args) {
        // Example 1: Demonstrating System.out.println
        System.out.println("Example 1: Using System.out.println");
        System.out.println("Line 1: This text is followed by a new line.");
        System.out.println("Line 2: This text appears on a new line.");
        System.out.println("Line 3: This text also appears on a new line.");
        System.out.println(); // Empty println creates just a new line
        
        // Example 2: Demonstrating System.out.print
        System.out.println("Example 2: Using System.out.print");
        System.out.print("Text 1: This text is not followed by a new line. ");
        System.out.print("Text 2: This text appears on the same line. ");
        System.out.print("Text 3: This text also appears on the same line.\n"); // Manual newline
        
        // Example 3: Mixing print and println
        System.out.println("Example 3: Mixing print and println");
        System.out.print("First part: ");
        System.out.println("Second part (followed by a new line).");
        System.out.print("Third part: ");
        System.out.print("Fourth part (on the same line). ");
        System.out.println("Fifth part (followed by a new line).");
        
        // Example 4: Using print with manual line breaks
        System.out.println("Example 4: Using print with manual line breaks");
        System.out.print("Line 1 with manual break.\n");
        System.out.print("Line 2 with manual break.\n");
        System.out.print("Line 3 with manual break.\n");
        
        // Example 5: Creating formatted output with a combination of print and println
        System.out.println("Example 5: Creating formatted output");
        System.out.print("Name: ");
        System.out.println("John Doe");
        System.out.print("Age: ");
        System.out.println(25);
        System.out.print("Occupation: ");
        System.out.println("Software Developer");
        
        // Example 6: Creating a table-like output
        System.out.println("Example 6: Creating a table-like output");
        System.out.println("ID\tName\t\tScore");
        System.out.println("--\t----\t\t-----");
        System.out.print("1\t");
        System.out.print("Alice\t\t");
        System.out.println(95);
        System.out.print("2\t");
        System.out.print("Bob\t\t");
        System.out.println(87);
        System.out.print("3\t");
        System.out.print("Charlie\t");
        System.out.println(92);
        
        // Example 7: Demonstrating the effect on program flow
        System.out.println("Example 7: Effect on program flow");
        System.out.print("This is the first part of a message. ");
        // Code can continue here, and the output will still be on the same line
        System.out.println("This is the second part, and it ends the line.");
        // After println, the next output will start on a new line
        System.out.println("This is on a new line.");
    }
}
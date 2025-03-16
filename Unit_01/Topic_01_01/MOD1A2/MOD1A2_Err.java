/**
 * MOD1A2_Err.java
 * 
 * This program demonstrates common errors and mistakes related to cursor movement
 * when using System.out.println and System.out.print methods.
 * 
 * Knowledge Point: MOD-1.A.2
 * System.out.println moves the cursor to a new line after the information has been displayed,
 * while System.out.print does not.
 */
public class MOD1A2_Err {
    public static void main(String[] args) {
        // ERROR 1: Expecting System.out.print to automatically move to a new line
        System.out.print("Error 1: This text will not be followed by a new line.");
        System.out.print("This text will appear immediately after the previous text without any space.");
        // The correct approach would be to either use println or manually add a newline character
        System.out.println(); // Adding a newline to fix the display for subsequent examples
        
        // ERROR 2: Inconsistent use of print and println causing formatting issues
        System.out.println("Error 2: Inconsistent use of print and println:");
        System.out.print("Name: ");
        System.out.print("John Doe"); // Should use println to move to next line
        System.out.print("Age: ");
        System.out.print("25"); // Should use println to move to next line
        System.out.println(); // Adding a newline to fix the display
        
        // ERROR 3: Forgetting to add spaces when using multiple print statements
        System.out.println("\nError 3: Forgetting spaces between print statements:");
        System.out.print("This");
        System.out.print("text");
        System.out.print("has");
        System.out.print("no");
        System.out.print("spaces");
        System.out.println(); // Adding a newline
        
        // ERROR 4: Misunderstanding how escape sequences work with print vs println
        System.out.println("\nError 4: Misunderstanding escape sequences:");
        // The following line has a newline escape sequence, but it's inside the string, not related to the print method
        System.out.print("This text has a newline\nin the middle, not at the end.");
        System.out.print("This text appears after the newline, not on a new line after the entire previous text.");
        System.out.println(); // Adding a newline
        
        // ERROR 5: Assuming println adds extra spacing
        System.out.println("\nError 5: Assuming println adds extra spacing:");
        System.out.println("Line 1");
        System.out.println("Line 2"); // println only adds a newline, not extra vertical spacing
        System.out.println("Line 3");
        // To add extra vertical spacing, you need explicit empty println calls:
        System.out.println();
        System.out.println("This line has extra spacing above it.");
        
        // ERROR 6: Confusion about when the newline is added with println
        System.out.println("\nError 6: Confusion about when newline is added:");
        System.out.print("Part 1 ");
        // Some code or processing might happen here
        System.out.println("Part 2"); // The newline happens AFTER Part 2 is printed, not before
        System.out.print("This is on the next line, not on the same line as Part 2.");
        System.out.println(); // Adding a newline
        
        // ERROR 7: Misusing print for creating tables or aligned output
        System.out.println("\nError 7: Misusing print for tables:");
        System.out.print("Column 1");
        System.out.print("Column 2");
        System.out.print("Column 3");
        System.out.println(); // Adding a newline
        System.out.print("Data 1");
        System.out.print("Data 2");
        System.out.print("Data 3");
        // The correct approach would use tabs or fixed-width formatting
        System.out.println("\n\nCorrect approach for tables:");
        System.out.println("Column 1\tColumn 2\tColumn 3");
        System.out.println("Data 1\tData 2\tData 3");
        
        // ERROR 8: Overusing println when print would be more appropriate
        System.out.println("\nError 8: Overusing println:");
        System.out.println("Enter your name: "); // Should use print to keep cursor on same line for input
        // In a real program with input, the cursor would be at the start of the next line
        // instead of after the prompt
        
        // ERROR 9: Mixing print styles inconsistently in a program
        System.out.println("\nError 9: Inconsistent print styles:");
        System.out.print("First prompt: ");
        System.out.println("First value"); // Using println here
        System.out.println("Second prompt: "); // But using println here instead of print
        System.out.print("Second value\n"); // And using print with manual newline here
        // This inconsistency makes code harder to read and maintain
        
        // ERROR 10: Not understanding that println is equivalent to print followed by newline
        System.out.println("\nError 10: Not understanding println equivalence:");
        // These two approaches produce identical output:
        System.out.println("Approach 1: Using println");
        System.out.print("Approach 2: Using print with newline\n");
        // But mixing them inconsistently can lead to confusion
    }
}
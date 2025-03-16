/**
 * MOD1A1_Exp.java
 * 
 * This program demonstrates the correct usage of System.out.print and System.out.println
 * methods to display information on the computer monitor.
 * 
 * Knowledge Point: MOD-1.A.1
 * System.out.print and System.out.println display information on the computer monitor.
 */
public class MOD1A1_Exp {
    public static void main(String[] args) {
        // Using System.out.println to display text
        System.out.println("Example 1: Using System.out.println to display text");
        
        // Using System.out.println to display numbers
        System.out.println(42);
        
        // Using System.out.println to display decimal numbers
        System.out.println(3.14159);
        
        // Using System.out.println to display boolean values
        System.out.println(true);
        
        // Using System.out.println to display characters
        System.out.println('A');
        
        // Using System.out.println to display expressions
        System.out.println(5 + 7);
        
        // Using System.out.println to display multiple values with concatenation
        System.out.println("The sum of 5 and 7 is " + (5 + 7));
        
        // Using System.out.print to display text
        System.out.print("Example 2: Using System.out.print to display text. ");
        System.out.print("This text appears on the same line. ");
        System.out.println("This text also appears on the same line but moves cursor to next line.");
        
        // Using System.out.print with various data types
        System.out.print("Number: ");
        System.out.print(42);
        System.out.print(", Decimal: ");
        System.out.print(3.14159);
        System.out.print(", Boolean: ");
        System.out.print(true);
        System.out.print(", Character: ");
        System.out.println('A');
        
        // Displaying null values
        String nullString = null;
        System.out.println("Displaying null: " + nullString);
        
        // Displaying array reference (will show memory address/hash code)
        int[] numbers = {1, 2, 3};
        System.out.println("Array reference: " + numbers);
        
        // Using escape sequences in output
        System.out.println("Line 1\nLine 2"); // New line
        System.out.println("Tab\tcharacter"); // Tab
        System.out.println("Backspace\b character"); // Backspace
        System.out.println("Carriage\rReturn"); // Carriage return
        System.out.println("Double quote: \"quoted text\""); // Double quote
        System.out.println("Single quote: \'A\'"); // Single quote
        System.out.println("Backslash: \\"); // Backslash
    }
}
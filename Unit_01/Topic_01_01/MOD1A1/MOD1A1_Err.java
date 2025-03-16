/**
 * MOD1A1_Err.java
 * 
 * This program demonstrates common errors and mistakes when using System.out.print
 * and System.out.println methods.
 * 
 * Knowledge Point: MOD-1.A.1
 * System.out.print and System.out.println display information on the computer monitor.
 */
public class MOD1A1_Err {
    public static void main(String[] args) {
        // ERROR 1: Misspelling System
        // Uncommenting the following line will cause a compilation error
        // Sistem.out.println("This will not compile due to misspelled 'System'");
        
        // ERROR 2: Incorrect capitalization
        // Uncommenting the following line will cause a compilation error
        // system.out.println("This will not compile due to lowercase 's' in 'system'");
        
        // ERROR 3: Missing the 'out' part
        // Uncommenting the following line will cause a compilation error
        // System.println("This will not compile due to missing 'out'");
        
        // ERROR 4: Incorrect method name
        // Uncommenting the following line will cause a compilation error
        // System.out.printline("This will not compile due to incorrect method name");
        
        // ERROR 5: Missing semicolon
        // Uncommenting the following line will cause a compilation error
        // System.out.println("This will not compile due to missing semicolon")
        
        // ERROR 6: Unclosed string literal
        // Uncommenting the following line will cause a compilation error
        // System.out.println("This string is not closed);
        
        // ERROR 7: Incorrect quotation marks for strings
        // Uncommenting the following line will cause a compilation error
        // System.out.println('This uses single quotes instead of double quotes');
        
        // ERROR 8: Using single quotes for multi-character strings
        // Uncommenting the following line will cause a compilation error
        // System.out.println('ABC');
        
        // ERROR 9: Incorrect escape sequences
        // Uncommenting the following line will cause a compilation error
        // System.out.println("Incorrect escape sequence: \z");
        
        // ERROR 10: Trying to print an undefined variable
        // Uncommenting the following lines will cause a compilation error
        // int x;
        // System.out.println("The value of x is: " + x); // Error: variable x might not have been initialized
        
        // ERROR 11: Type mismatch in concatenation (this will actually work but might be unexpected)
        System.out.println("The result of 5 + 3 is: " + 5 + 3); // Outputs "The result of 5 + 3 is: 53" instead of "The result of 5 + 3 is: 8"
        
        // ERROR 12: Forgetting parentheses for arithmetic in string concatenation
        // The correct way would be: System.out.println("The result is: " + (5 + 3));
        
        // ERROR 13: Trying to directly print complex objects without proper toString implementation
        Object[] objArray = {1, "string", true};
        System.out.println("Printing array directly: " + objArray); // Prints memory address/hash code
        
        // ERROR 14: Confusing print and println behavior
        System.out.print("This will not move to the next line");
        System.out.print("This will appear on the same line");
        // This can cause readability issues in output
        
        // ERROR 15: Trying to use formatting options that require printf
        // Uncommenting the following line will cause unexpected output (not an error but incorrect usage)
        // System.out.println("The value is: %d", 42); // This doesn't work as expected, should use printf instead
        
        // ERROR 16: Forgetting to convert numbers to strings when specific formatting is needed
        double value = 123.456789;
        System.out.println("The value is: " + value); // This works but doesn't allow for format control
        
        // ERROR 17: Attempting to use println with multiple arguments
        // Uncommenting the following line will cause a compilation error
        // System.out.println("Name:", "John", "Age:", 25); // println doesn't accept multiple arguments like this
        
        // ERROR 18: Null pointer exception when System.out is null (theoretical example)
        // In a real scenario, if System.out were null, this would cause a NullPointerException
        // This is just for illustration and cannot be easily demonstrated
        
        // ERROR 19: Trying to reassign System.out
        // Uncommenting the following line will cause a compilation error
        // System.out = null; // System.out is final and cannot be reassigned
        
        // ERROR 20: Confusing System.out and System.err
        // Not an error but a conceptual mistake
        System.err.println("This goes to the error output stream, not the standard output");
        // This might appear in a different color or location depending on the environment
    }
}
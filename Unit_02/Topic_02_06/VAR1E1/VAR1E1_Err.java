/**
 * VAR1E1_Err.java
 * 
 * This program demonstrates common errors when working with String objects.
 * 
 * Knowledge Points: VAR-1.E.1, VAR-1.E.2, VAR-1.E.3, VAR-1.E.4, VAR-1.E.5
 * - Errors related to String immutability
 * - Mistakes in String concatenation
 * - Issues with escape sequences
 * - Problems with implicit type conversion
 */
public class VAR1E1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with String objects:\n");
        
        // ERROR 1: Misunderstanding String immutability
        System.out.println("ERROR 1: Misunderstanding String immutability");
        String name = "Alice";
        System.out.println("Original name: " + name);
        
        // Attempting to modify a String directly (doesn't work)
        System.out.println("Attempting to modify the String directly:");
        name.toUpperCase(); // This doesn't modify 'name'
        System.out.println("After toUpperCase() call: " + name + " (unchanged)");
        System.out.println("Correct approach: name = name.toUpperCase();");
        System.out.println();
        
        // ERROR 2: Forgetting to reassign String after modification
        System.out.println("ERROR 2: Forgetting to reassign String after modification");
        String greeting = "hello";
        System.out.println("Original greeting: " + greeting);
        
        // Common mistake: not capturing the result of String methods
        greeting.replace('h', 'H'); // This doesn't modify 'greeting'
        System.out.println("After replace() call: " + greeting + " (unchanged)");
        System.out.println("Correct approach: greeting = greeting.replace('h', 'H');");
        System.out.println();
        
        // ERROR 3: Misunderstanding operator precedence with String concatenation
        System.out.println("ERROR 3: Misunderstanding operator precedence with String concatenation");
        int a = 5;
        int b = 10;
        
        // This doesn't add the numbers first
        System.out.println("Result of '\"Sum: \" + a + b': " + "Sum: " + a + b);
        System.out.println("The expression evaluates left to right, resulting in string concatenation");
        
        // Correct approach: use parentheses to control evaluation order
        System.out.println("Correct approach: '\"Sum: \" + (a + b)': " + "Sum: " + (a + b));
        System.out.println();
        
        // ERROR 4: Forgetting escape sequences
        System.out.println("ERROR 4: Forgetting escape sequences");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // String quote = "She said, "Java is fun!""; // Error: unclosed string literal
        System.out.println("Correct approach: String quote = \"She said, \\\"Java is fun!\\\"\";\n");
        
        // ERROR 5: Incorrect escape sequences
        System.out.println("ERROR 5: Incorrect escape sequences");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // String path = "C:\Program Files\Java"; // Error: invalid escape sequence
        System.out.println("Correct approach: String path = \"C:\\\\Program Files\\\\Java\";\n");
        
        // ERROR 6: Confusing char and String types
        System.out.println("ERROR 6: Confusing char and String types");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // char letter = "A"; // Error: incompatible types
        System.out.println("Correct approach: char letter = 'A'; (single quotes for char)\n");
        
        // ERROR 7: Misunderstanding String equality
        System.out.println("ERROR 7: Misunderstanding String equality");
        String str1 = "Hello";
        String str2 = new String("Hello");
        
        // Using == to compare String objects (checks reference equality, not content)
        if (str1 == str2) {
            System.out.println("Strings are equal (using ==)");
        } else {
            System.out.println("Strings are not equal (using ==)");
            System.out.println("This is because == compares object references, not content");
        }
        
        // Correct approach: use equals() method
        if (str1.equals(str2)) {
            System.out.println("Strings are equal (using equals())");
            System.out.println("This is the correct way to compare String content");
        }
        System.out.println();
        
        // ERROR 8: Misunderstanding String concatenation with null
        System.out.println("ERROR 8: Misunderstanding String concatenation with null");
        String nullString = null;
        try {
            // This will cause a NullPointerException
            String result = nullString.concat(" World");
            System.out.println(result); // This line won't execute
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot call methods on a null String");
        }
        
        // However, this works (+ operator handles null differently)
        String safeResult = nullString + " World";
        System.out.println("Using + operator: " + safeResult);
        System.out.println();
        
        // Summary of common errors
        System.out.println("--- Common Errors with Strings ---");
        System.out.println("1. Not understanding String immutability - String methods return new objects");
        System.out.println("2. Forgetting to capture the result of String methods");
        System.out.println("3. Misunderstanding operator precedence in String concatenation");
        System.out.println("4. Forgetting to escape quotes and backslashes in String literals");
        System.out.println("5. Confusing char literals (single quotes) and String literals (double quotes)");
        System.out.println("6. Using == instead of equals() to compare String content");
        System.out.println("7. Calling methods on null String references");
    }
}
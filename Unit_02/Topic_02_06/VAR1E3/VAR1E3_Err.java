/**
 * VAR1E3_Err.java
 * 
 * This program demonstrates common errors related to String concatenation.
 * 
 * Knowledge Point: VAR-1.E.3
 * - String objects can be concatenated using the + or += operator, resulting in a new String object.
 */
public class VAR1E3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with String concatenation:\n");
        
        // ERROR 1: Misunderstanding operator precedence in concatenation
        System.out.println("ERROR 1: Misunderstanding operator precedence in concatenation");
        int a = 5;
        int b = 10;
        
        // Common mistake: expecting arithmetic operations to happen before concatenation
        String result1 = "Sum: " + a + b;
        System.out.println("result1 = \"Sum: \" + a + b: \"" + result1 + "\"");
        System.out.println("The expression is evaluated left to right, so it concatenates each value as a string");
        
        // Correct approach: use parentheses to control evaluation order
        String result2 = "Sum: " + (a + b);
        System.out.println("result2 = \"Sum: \" + (a + b): \"" + result2 + "\"");
        System.out.println("Using parentheses ensures the addition happens before concatenation");
        System.out.println();
        
        // ERROR 2: Inefficient string concatenation in loops
        System.out.println("ERROR 2: Inefficient string concatenation in loops");
        System.out.println("Inefficient approach (creates many temporary String objects):");
        
        String inefficient = "";
        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < 5000; i++) {
            // This creates a new String object in each iteration
            inefficient = inefficient + i;
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Time for inefficient concatenation: " + (endTime - startTime) + " ms");
        System.out.println("Result length: " + inefficient.length());
        
        // Better approach: use StringBuilder
        System.out.println("\nMore efficient approach using StringBuilder:");
        StringBuilder efficient = new StringBuilder();
        startTime = System.currentTimeMillis();
        
        for (int i = 0; i < 5000; i++) {
            efficient.append(i);
        }
        
        endTime = System.currentTimeMillis();
        System.out.println("Time for StringBuilder: " + (endTime - startTime) + " ms");
        System.out.println("Result length: " + efficient.length());
        System.out.println();
        
        // ERROR 3: Concatenating null with strings
        System.out.println("ERROR 3: Concatenating null with strings");
        String validString = "Hello";
        String nullString = null;
        
        // Using + operator with null
        System.out.println("Using + operator with null:");
        String nullConcat = validString + nullString;
        System.out.println("validString + nullString: \"" + nullConcat + "\"");
        System.out.println("The + operator converts null to the string \"null\"");
        
        // Using concat() method with null
        System.out.println("\nUsing concat() method with null:");
        try {
            // This will throw a NullPointerException
            String nullMethodConcat = validString.concat(nullString);
            System.out.println(nullMethodConcat); // This line won't execute
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot call concat() with a null argument");
        }
        
        try {
            // This will throw a NullPointerException
            String nullMethodConcat2 = nullString.concat(validString);
            System.out.println(nullMethodConcat2); // This line won't execute
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot call methods on a null reference");
        }
        System.out.println();
        
        // ERROR 4: Misunderstanding memory usage in concatenation
        System.out.println("ERROR 4: Misunderstanding memory usage in concatenation");
        System.out.println("Each concatenation creates a new String object, which can lead to memory issues");
        System.out.println("For example, the following code creates 100 String objects:");
        System.out.println("String s = \"\";");
        System.out.println("for (int i = 0; i < 100; i++) {");
        System.out.println("    s += \"a\";");
        System.out.println("}\n");
        
        // ERROR 5: Forgetting that concatenation creates new objects
        System.out.println("ERROR 5: Forgetting that concatenation creates new objects");
        String original = "Hello";
        String reference = original;
        
        System.out.println("original: \"" + original + "\"");
        System.out.println("reference: \"" + reference + "\" (points to the same object as original)");
        
        // Concatenation creates a new object
        original += " World";
        
        System.out.println("\nAfter original += \" World\":");
        System.out.println("original: \"" + original + "\"");
        System.out.println("reference: \"" + reference + "\" (still points to the original object)");
        System.out.println("This shows that += creates a new String object rather than modifying the existing one");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Common Errors with String Concatenation ---");
        System.out.println("1. Misunderstanding operator precedence (use parentheses when needed)");
        System.out.println("2. Using inefficient concatenation in loops (use StringBuilder instead)");
        System.out.println("3. Confusion about how null values are handled in concatenation");
        System.out.println("4. Not considering memory implications of repeated concatenations");
        System.out.println("5. Forgetting that concatenation creates new String objects");
    }
}
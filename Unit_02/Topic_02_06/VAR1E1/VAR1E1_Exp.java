/**
 * VAR1E1_Exp.java
 * 
 * This program demonstrates the creation and basic operations of String objects.
 * 
 * Knowledge Points: VAR-1.E.1, VAR-1.E.2, VAR-1.E.3, VAR-1.E.4, VAR-1.E.5
 * - String objects can be created using string literals or the String constructor
 * - String objects are immutable
 * - String concatenation using + or += operators
 * - Primitive values can be concatenated with Strings (implicit conversion)
 * - Escape sequences in Strings (\\, \", \n)
 */
public class VAR1E1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating String Creation and Operations:\n");
        
        // Example 1: Creating String objects using literals
        System.out.println("Example 1: Creating String objects using literals");
        String greeting = "Hello, World!";
        String message = "Java Programming";
        System.out.println("greeting: " + greeting);
        System.out.println("message: " + message);
        System.out.println();
        
        // Example 2: Creating String objects using constructors
        System.out.println("Example 2: Creating String objects using constructors");
        String str1 = new String("Using String constructor");
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str2 = new String(charArray);
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println();
        
        // Example 3: String immutability
        System.out.println("Example 3: String immutability");
        String original = "Original String";
        System.out.println("Before method call: " + original);
        modifyString(original);
        System.out.println("After method call: " + original + " (unchanged)");
        
        // String methods return new String objects
        String uppercase = original.toUpperCase();
        System.out.println("After toUpperCase(): " + original + " (original unchanged)");
        System.out.println("New uppercase string: " + uppercase);
        System.out.println();
        
        // Example 4: String concatenation using + operator
        System.out.println("Example 4: String concatenation using + operator");
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Full name: " + fullName);
        System.out.println();
        
        // Example 5: String concatenation using += operator
        System.out.println("Example 5: String concatenation using += operator");
        String sentence = "Java ";
        System.out.println("Initial sentence: " + sentence);
        sentence += "is ";
        System.out.println("After first +=: " + sentence);
        sentence += "awesome!";
        System.out.println("After second +=: " + sentence);
        System.out.println();
        
        // Example 6: Concatenating primitive values with Strings
        System.out.println("Example 6: Concatenating primitive values with Strings");
        int age = 25;
        double height = 5.9;
        boolean isStudent = true;
        char grade = 'A';
        
        String info = "Age: " + age + ", Height: " + height + ", Student: " + isStudent + ", Grade: " + grade;
        System.out.println(info);
        System.out.println();
        
        // Example 7: Escape sequences in Strings
        System.out.println("Example 7: Escape sequences in Strings");
        String withQuotes = "She said, \"Java is fun!\"";
        String withBackslash = "File path: C:\\Program Files\\Java";
        String withNewlines = "Line 1\nLine 2\nLine 3";
        
        System.out.println("String with quotes: " + withQuotes);
        System.out.println("String with backslashes: " + withBackslash);
        System.out.println("String with newlines:\n" + withNewlines);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Strings ---");
        System.out.println("1. Strings can be created using literals (\"text\") or constructors (new String())");
        System.out.println("2. Strings are immutable - methods return new String objects");
        System.out.println("3. Strings can be concatenated using + or += operators");
        System.out.println("4. Primitive values are automatically converted to Strings during concatenation");
        System.out.println("5. Escape sequences: \\\" (quote), \\\\ (backslash), \\n (newline)");
    }
    
    // This method demonstrates that Strings are immutable
    public static void modifyString(String str) {
        // This doesn't change the original String
        str = str + " - Modified";
        System.out.println("Inside method: " + str + " (local change only)");
    }
}
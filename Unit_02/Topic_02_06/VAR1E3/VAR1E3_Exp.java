/**
 * VAR1E3_Exp.java
 * 
 * This program demonstrates String concatenation using + and += operators.
 * 
 * Knowledge Point: VAR-1.E.3
 * - String objects can be concatenated using the + or += operator, resulting in a new String object.
 */
public class VAR1E3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating String Concatenation:\n");
        
        // Example 1: Basic String concatenation with + operator
        System.out.println("Example 1: Basic String concatenation with + operator");
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        
        System.out.println("firstName: \"" + firstName + "\"");
        System.out.println("lastName: \"" + lastName + "\"");
        System.out.println("fullName (firstName + \" \" + lastName): \"" + fullName + "\"");
        System.out.println("Note: The original strings remain unchanged");
        System.out.println();
        
        // Example 2: String concatenation with += operator
        System.out.println("Example 2: String concatenation with += operator");
        String message = "Hello";
        System.out.println("Original message: \"" + message + "\"");
        
        message += " World";
        System.out.println("After message += \" World\": \"" + message + "\"");
        
        message += "!";
        System.out.println("After message += \"!\": \"" + message + "\"");
        System.out.println("Each += operation creates a new String object");
        System.out.println();
        
        // Example 3: Concatenating multiple strings
        System.out.println("Example 3: Concatenating multiple strings");
        String part1 = "Java";
        String part2 = "is";
        String part3 = "fun";
        
        String combined = part1 + " " + part2 + " " + part3 + "!";
        System.out.println("Combined string: \"" + combined + "\"");
        System.out.println();
        
        // Example 4: Building a string incrementally
        System.out.println("Example 4: Building a string incrementally");
        String sentence = "";
        System.out.println("Initial empty string: \"" + sentence + "\"");
        
        sentence += "The quick ";
        System.out.println("After first addition: \"" + sentence + "\"");
        
        sentence += "brown fox ";
        System.out.println("After second addition: \"" + sentence + "\"");
        
        sentence += "jumps over ";
        System.out.println("After third addition: \"" + sentence + "\"");
        
        sentence += "the lazy dog.";
        System.out.println("Final sentence: \"" + sentence + "\"");
        System.out.println();
        
        // Example 5: Concatenation in a loop (inefficient but demonstrates the concept)
        System.out.println("Example 5: Concatenation in a loop (small example)");
        String numbers = "";
        
        for (int i = 1; i <= 5; i++) {
            numbers += i;
            if (i < 5) {
                numbers += ", ";
            }
        }
        
        System.out.println("Result of concatenation in loop: \"" + numbers + "\"");
        System.out.println("Note: For larger loops, StringBuilder is more efficient");
        System.out.println();
        
        // Example 6: Comparing concatenation with StringBuilder (for reference)
        System.out.println("Example 6: Comparing with StringBuilder (for reference)");
        String concatResult = "";
        StringBuilder sbResult = new StringBuilder();
        
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            concatResult += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time for String concatenation: " + (endTime - startTime) + " ms");
        
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            sbResult.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time for StringBuilder: " + (endTime - startTime) + " ms");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about String Concatenation ---");
        System.out.println("1. The + operator combines two strings into a new String object");
        System.out.println("2. The += operator appends to a string, creating a new String object");
        System.out.println("3. Original strings remain unchanged after concatenation");
        System.out.println("4. Multiple strings can be concatenated in a single expression");
        System.out.println("5. For many concatenations, especially in loops, StringBuilder is more efficient");
    }
}
/**
 * VAR1E13_Exp.java
 * 
 * This program demonstrates how to create a string identical to a single element substring.
 * 
 * Knowledge Point: VAR-1.E.13
 * - A string identical to the single element substring at position index can be created by calling
 *   substring(index, index + 1).
 */
public class VAR1E13_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Single Element Substrings:\n");
        
        // Example 1: Basic single element substring
        System.out.println("Example 1: Basic single element substring");
        String text = "Java";
        System.out.println("Original string: \"" + text + "\"");
        
        // Creating single element substrings
        String firstChar = text.substring(0, 1);  // "J"
        String secondChar = text.substring(1, 2); // "a"
        String thirdChar = text.substring(2, 3);  // "v"
        String fourthChar = text.substring(3, 4); // "a"
        
        System.out.println("First character: \"" + firstChar + "\"");
        System.out.println("Second character: \"" + secondChar + "\"");
        System.out.println("Third character: \"" + thirdChar + "\"");
        System.out.println("Fourth character: \"" + fourthChar + "\"");
        System.out.println();
        
        // Example 2: Comparing with charAt() method
        System.out.println("Example 2: Comparing with charAt() method");
        String word = "Programming";
        System.out.println("Original string: \"" + word + "\"");
        
        // Using substring to get a single character as a String
        String charAsString = word.substring(3, 4); // "g"
        System.out.println("Character at index 3 as String (using substring): \"" + charAsString + "\"");
        
        // Using charAt to get a single character as a char
        char charAsChar = word.charAt(3); // 'g'
        System.out.println("Character at index 3 as char (using charAt): '" + charAsChar + "'");
        
        // Demonstrating the difference
        System.out.println("substring returns a String object, while charAt returns a char primitive");
        System.out.println("charAsString is a String: " + (charAsString instanceof String));
        System.out.println("charAsChar is a char primitive: " + (Character.valueOf(charAsChar) instanceof Character));
        System.out.println();
        
        // Example 3: Using single element substrings in operations
        System.out.println("Example 3: Using single element substrings in operations");
        String sentence = "Hello, World!";
        System.out.println("Original string: \"" + sentence + "\"");
        
        // Extract and manipulate a single character
        String comma = sentence.substring(5, 6); // ","
        System.out.println("Extracted comma: \"" + comma + "\"");
        
        // Replace all occurrences of this character
        String modified = sentence.replace(comma, ";");
        System.out.println("After replacing comma with semicolon: \"" + modified + "\"");
        System.out.println();
        
        // Example 4: Iterating through a string using single element substrings
        System.out.println("Example 4: Iterating through a string using single element substrings");
        String sample = "ABCDE";
        System.out.println("Original string: \"" + sample + "\"");
        System.out.println("Characters as single element substrings:");
        
        for (int i = 0; i < sample.length(); i++) {
            String singleChar = sample.substring(i, i + 1);
            System.out.println("  Index " + i + ": \"" + singleChar + "\"");
        }
        System.out.println();
        
        // Example 5: Practical application - counting specific characters
        System.out.println("Example 5: Practical application - counting specific characters");
        String testString = "Mississippi";
        System.out.println("Original string: \"" + testString + "\"");
        
        int countS = 0;
        int countI = 0;
        
        for (int i = 0; i < testString.length(); i++) {
            String character = testString.substring(i, i + 1);
            if (character.equals("s")) {
                countS++;
            } else if (character.equals("i")) {
                countI++;
            }
        }
        
        System.out.println("Number of 's' characters: " + countS);
        System.out.println("Number of 'i' characters: " + countI);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Single Element Substrings ---");
        System.out.println("1. substring(index, index + 1) creates a string with just the character at position index");
        System.out.println("2. Unlike charAt(), which returns a char primitive, substring returns a String object");
        System.out.println("3. This allows the single character to be used in String operations like equals() and replace()");
        System.out.println("4. It's useful when you need to work with a single character as a String");
        System.out.println("5. Remember that substring is zero-indexed, like all String operations in Java");
    }
}
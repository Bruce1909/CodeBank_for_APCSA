/**
 * VAR1E12_Exp.java
 * 
 * This program demonstrates the String methods and constructors that are part of the Java Quick Reference.
 * 
 * Knowledge Point: VAR-1.E.12
 * - The following String methods and constructors are part of the Java Quick Reference:
 *   - String(String str) — Constructs a new String object that represents the same sequence of characters as str
 *   - int length() — Returns the number of characters in a String object
 *   - String substring(int from, int to) — Returns the substring beginning at index from and ending at index to − 1
 *   - String substring(int from) — Returns substring(from, length())
 *   - int indexOf(String str) — Returns the index of the first occurrence of str; returns -1 if not found
 *   - boolean equals(String other) — Returns true if this is equal to other; returns false otherwise
 *   - int compareTo(String other) — Returns a value < 0 if this is less than other; returns zero if this is equal to other;
 *     returns a value > 0 if this is greater than other
 */
public class VAR1E12_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating String Methods from the Java Quick Reference:\n");
        
        // Example 1: String constructor - String(String str)
        System.out.println("Example 1: String constructor - String(String str)");
        String original = "Hello, World!";
        String copy = new String(original);
        
        System.out.println("Original string: \"" + original + "\"");
        System.out.println("Copy using constructor: \"" + copy + "\"");
        System.out.println("Both strings contain the same sequence of characters");
        System.out.println("But they are different objects: " + (original == copy ? "same object" : "different objects"));
        System.out.println();
        
        // Example 2: length() method
        System.out.println("Example 2: length() method");
        String text = "Java Programming";
        int length = text.length();
        
        System.out.println("String: \"" + text + "\"");
        System.out.println("Length: " + length + " characters");
        System.out.println("The length() method returns the number of characters in the string");
        System.out.println();
        
        // Example 3: substring(int from, int to) method
        System.out.println("Example 3: substring(int from, int to) method");
        String sentence = "The quick brown fox jumps over the lazy dog";
        
        String sub1 = sentence.substring(4, 9);  // "quick"
        String sub2 = sentence.substring(10, 15); // "brown"
        String sub3 = sentence.substring(16, 19); // "fox"
        
        System.out.println("Original string: \"" + sentence + "\"");
        System.out.println("substring(4, 9): \"" + sub1 + "\"");
        System.out.println("substring(10, 15): \"" + sub2 + "\"");
        System.out.println("substring(16, 19): \"" + sub3 + "\"");
        System.out.println("The substring begins at 'from' index and extends to the character at 'to-1' index");
        System.out.println();
        
        // Example 4: substring(int from) method
        System.out.println("Example 4: substring(int from) method");
        String phrase = "Hello, Java!";
        
        String sub4 = phrase.substring(7); // "Java!"
        
        System.out.println("Original string: \"" + phrase + "\"");
        System.out.println("substring(7): \"" + sub4 + "\"");
        System.out.println("This is equivalent to substring(7, phrase.length())");
        System.out.println();
        
        // Example 5: indexOf(String str) method
        System.out.println("Example 5: indexOf(String str) method");
        String searchText = "Java is a programming language. Java is object-oriented.";
        
        int firstJava = searchText.indexOf("Java");
        int programming = searchText.indexOf("programming");
        int secondJava = searchText.indexOf("Java", firstJava + 1);
        int notFound = searchText.indexOf("Python");
        
        System.out.println("Text: \"" + searchText + "\"");
        System.out.println("indexOf(\"Java\"): " + firstJava);
        System.out.println("indexOf(\"programming\"): " + programming);
        System.out.println("indexOf(\"Java\", firstJava + 1): " + secondJava + " (searching for second occurrence)");
        System.out.println("indexOf(\"Python\"): " + notFound + " (returns -1 when not found)");
        System.out.println();
        
        // Example 6: equals(String other) method
        System.out.println("Example 6: equals(String other) method");
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";
        String str4 = new String("Hello");
        
        System.out.println("str1: \"" + str1 + "\"");
        System.out.println("str2: \"" + str2 + "\"");
        System.out.println("str3: \"" + str3 + "\"");
        System.out.println("str4: new String(\"Hello\")");
        
        System.out.println("str1.equals(str2): " + str1.equals(str2) + " (case matters)");
        System.out.println("str1.equals(str3): " + str1.equals(str3) + " (same content)");
        System.out.println("str1.equals(str4): " + str1.equals(str4) + " (different objects, same content)");
        System.out.println("str1 == str3: " + (str1 == str3) + " (same object due to string interning)");
        System.out.println("str1 == str4: " + (str1 == str4) + " (different objects)");
        System.out.println();
        
        // Example 7: compareTo(String other) method
        System.out.println("Example 7: compareTo(String other) method");
        String a = "apple";
        String b = "banana";
        String c = "Apple";
        String d = "apple";
        
        System.out.println("a: \"" + a + "\"");
        System.out.println("b: \"" + b + "\"");
        System.out.println("c: \"" + c + "\"");
        System.out.println("d: \"" + d + "\"");
        
        System.out.println("a.compareTo(b): " + a.compareTo(b) + " (negative because 'apple' comes before 'banana')");
        System.out.println("b.compareTo(a): " + b.compareTo(a) + " (positive because 'banana' comes after 'apple')");
        System.out.println("a.compareTo(c): " + a.compareTo(c) + " (positive because lowercase comes after uppercase in ASCII)");
        System.out.println("a.compareTo(d): " + a.compareTo(d) + " (zero because they are equal)");
        System.out.println();
        
        // Example 8: Combining multiple methods
        System.out.println("Example 8: Combining multiple methods");
        String sample = "Java Programming Language";
        
        // Find the index of "Programming"
        int progIndex = sample.indexOf("Programming");
        
        // Extract the word using substring
        String word = sample.substring(progIndex, progIndex + "Programming".length());
        
        // Check if it equals "Programming"
        boolean isEqual = word.equals("Programming");
        
        System.out.println("Sample: \"" + sample + "\"");
        System.out.println("Index of \"Programming\": " + progIndex);
        System.out.println("Extracted word: \"" + word + "\"");
        System.out.println("word.equals(\"Programming\"): " + isEqual);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about String Methods in Java Quick Reference ---");
        System.out.println("1. String(String str) - Creates a new String with the same characters as str");
        System.out.println("2. length() - Returns the number of characters in the string");
        System.out.println("3. substring(from, to) - Returns characters from index 'from' to 'to-1'");
        System.out.println("4. substring(from) - Returns characters from index 'from' to the end");
        System.out.println("5. indexOf(str) - Returns the index of the first occurrence of str, or -1 if not found");
        System.out.println("6. equals(other) - Returns true if the strings have the same characters");
        System.out.println("7. compareTo(other) - Compares strings lexicographically");
    }
}
/**
 * VAR1E10_Exp.java
 * 
 * This program demonstrates String indices, concatenation with object references,
 * and String methods from the Java Quick Reference.
 * 
 * Knowledge Points: VAR-1.E.10, VAR-1.E.11, VAR-1.E.12, VAR-1.E.13
 * - String indices range from 0 to length-1
 * - String concatenation with object references implicitly calls toString()
 * - String methods from the Java Quick Reference
 * - Creating single character substrings
 */
public class VAR1E10_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating String Indices and Methods:\n");
        
        // Example 1: String indices (VAR-1.E.10)
        System.out.println("Example 1: String indices (0 to length-1)");
        String text = "Java";
        System.out.println("String: \"" + text + "\"");
        System.out.println("Length: " + text.length());
        System.out.println("Valid indices: 0 to " + (text.length() - 1));
        
        // Accessing characters at different indices
        System.out.println("Character at index 0: " + text.charAt(0));
        System.out.println("Character at index 1: " + text.charAt(1));
        System.out.println("Character at index 2: " + text.charAt(2));
        System.out.println("Character at index 3: " + text.charAt(3));
        
        // Demonstrating StringIndexOutOfBoundsException
        try {
            System.out.println("Attempting to access index 4 (out of bounds):");
            char c = text.charAt(4); // This will throw an exception
            System.out.println(c); // This line won't execute
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Index is out of range");
        }
        System.out.println();
        
        // Example 2: String concatenation with object references (VAR-1.E.11)
        System.out.println("Example 2: String concatenation with object references");
        
        // Creating a custom object
        Person person = new Person("John", 25);
        System.out.println("Person object: " + person);
        System.out.println("When concatenating an object with a string, toString() is implicitly called");
        
        // Another example with a different object
        Book book = new Book("Java Programming", "James Gosling");
        String bookInfo = "I'm reading: " + book;
        System.out.println(bookInfo);
        System.out.println();
        
        // Example 3: String methods from Java Quick Reference (VAR-1.E.12)
        System.out.println("Example 3: String methods from Java Quick Reference");
        
        // String constructor
        String original = "Hello";
        String copy = new String(original);
        System.out.println("Original: \"" + original + "\", Copy: \"" + copy + "\"");
        System.out.println("Are they the same object? " + (original == copy));
        System.out.println("Do they have the same content? " + original.equals(copy));
        System.out.println();
        
        // length() method
        String sentence = "Java programming is fun!";
        System.out.println("Sentence: \"" + sentence + "\"");
        System.out.println("Length: " + sentence.length() + " characters");
        System.out.println();
        
        // substring methods
        System.out.println("substring(from, to) and substring(from) methods:");
        System.out.println("sentence.substring(5, 16): \"" + sentence.substring(5, 16) + "\"");
        System.out.println("sentence.substring(5): \"" + sentence.substring(5) + "\"");
        System.out.println();
        
        // indexOf method
        System.out.println("indexOf method:");
        System.out.println("sentence.indexOf(\"programming\"): " + sentence.indexOf("programming"));
        System.out.println("sentence.indexOf(\"Python\"): " + sentence.indexOf("Python"));
        System.out.println();
        
        // equals method
        System.out.println("equals method:");
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";
        System.out.println("str1: \"" + str1 + "\", str2: \"" + str2 + "\", str3: \"" + str3 + "\"");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println();
        
        // compareTo method
        System.out.println("compareTo method:");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2) + " (negative because 'H' comes before 'h')");
        System.out.println("str2.compareTo(str1): " + str2.compareTo(str1) + " (positive because 'h' comes after 'H')");
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3) + " (zero because they are equal)");
        System.out.println();
        
        // Example 4: Creating single character substrings (VAR-1.E.13)
        System.out.println("Example 4: Creating single character substrings");
        String word = "Programming";
        System.out.println("Word: \"" + word + "\"");
        
        // Getting single characters as strings using substring
        String firstChar = word.substring(0, 1);  // "P"
        String fifthChar = word.substring(4, 5);  // "r"
        String lastChar = word.substring(word.length() - 1, word.length());  // "g"
        
        System.out.println("First character as string: \"" + firstChar + "\"");
        System.out.println("Fifth character as string: \"" + fifthChar + "\"");
        System.out.println("Last character as string: \"" + lastChar + "\"");
        
        // Comparing with charAt (returns char, not String)
        System.out.println("\nComparing with charAt (returns char, not String):");
        char firstCharChar = word.charAt(0);
        System.out.println("First character as char: '" + firstCharChar + "'");
        System.out.println("Is firstChar a String? " + (firstChar instanceof String));
        System.out.println("Is firstCharChar a char? " + (firstCharChar + " is a char"));
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about String Indices and Methods ---");
        System.out.println("1. String indices range from 0 to length-1");
        System.out.println("2. Accessing an index outside this range throws StringIndexOutOfBoundsException");
        System.out.println("3. Concatenating an object with a String implicitly calls the object's toString() method");
        System.out.println("4. Important String methods: length(), substring(), indexOf(), equals(), compareTo()");
        System.out.println("5. To get a single character as a String, use substring(index, index+1)");
    }
}

// Custom class to demonstrate toString() with concatenation
class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}

// Another custom class for demonstration
class Book {
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    @Override
    public String toString() {
        return title + " by " + author;
    }
}
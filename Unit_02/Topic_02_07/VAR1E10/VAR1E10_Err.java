/**
 * VAR1E10_Err.java
 * 
 * This program demonstrates common errors when working with String indices,
 * concatenation with object references, and String methods.
 * 
 * Knowledge Points: VAR-1.E.10, VAR-1.E.11, VAR-1.E.12, VAR-1.E.13
 * - Errors related to String indices
 * - Mistakes with toString() in concatenation
 * - Common errors with String methods
 * - Issues with single character substrings
 */
public class VAR1E10_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with String indices and methods:\n");
        
        // ERROR 1: String index out of bounds (VAR-1.E.10)
        System.out.println("ERROR 1: String index out of bounds");
        String text = "Java";
        System.out.println("String: \"" + text + "\"");
        System.out.println("Length: " + text.length());
        System.out.println("Valid indices: 0 to " + (text.length() - 1));
        
        // Common error: Accessing an index equal to the length
        System.out.println("\nAttempting to access index equal to length:");
        try {
            char lastChar = text.charAt(text.length()); // This will throw an exception
            System.out.println(lastChar); // This line won't execute
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Index " + text.length() + " is out of bounds");
            System.out.println("Remember: Valid indices are 0 to length-1 (" + (text.length()-1) + ")");
        }
        
        // Common error: Accessing a negative index
        System.out.println("\nAttempting to access a negative index:");
        try {
            char firstChar = text.charAt(-1); // This will throw an exception
            System.out.println(firstChar); // This line won't execute
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Index -1 is out of bounds");
            System.out.println("Remember: Indices cannot be negative");
        }
        System.out.println();
        
        // ERROR 2: Not overriding toString() in custom classes (VAR-1.E.11)
        System.out.println("ERROR 2: Not overriding toString() in custom classes");
        
        // Class without toString() override
        BadProduct product = new BadProduct("Laptop", 999.99);
        System.out.println("Concatenating object without toString() override: " + product);
        System.out.println("This outputs the class name and hash code, not useful information");
        
        // Class with toString() override
        GoodProduct betterProduct = new GoodProduct("Laptop", 999.99);
        System.out.println("Concatenating object with toString() override: " + betterProduct);
        System.out.println("This outputs meaningful information about the object");
        System.out.println();
        
        // ERROR 3: Misunderstanding String method behavior (VAR-1.E.12)
        System.out.println("ERROR 3: Misunderstanding String method behavior");
        
        // Common error with substring
        String sentence = "Java programming";
        System.out.println("String: \"" + sentence + "\"");
        
        System.out.println("\nCommon error with substring:");
        try {
            // Incorrect: Using an end index beyond the string length
            String sub = sentence.substring(5, 20); // This will throw an exception
            System.out.println(sub); // This line won't execute
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: End index 20 is out of bounds");
            System.out.println("Remember: substring end index must be <= string length");
        }
        
        // Common error with indexOf
        System.out.println("\nCommon error with indexOf:");
        int index = sentence.indexOf("Python");
        System.out.println("indexOf(\"Python\"): " + index);
        System.out.println("Error: Not checking if indexOf returns -1 before using the index");
        
        // Incorrect use of the index without checking
        System.out.println("Attempting to use the index without checking:");
        try {
            if (index >= 0) { // Correct check
                System.out.println("Substring found at index: " + index);
            } else {
                System.out.println("Substring not found");
            }
        } catch (Exception e) {
            System.out.println("Exception would occur if we used index without checking");
        }
        
        // Common error with equals vs ==
        System.out.println("\nCommon error with equals vs ==:");
        String str1 = "Hello";
        String str2 = new String("Hello");
        
        System.out.println("str1: \"" + str1 + "\", str2: \"" + str2 + "\"");
        System.out.println("str1 == str2: " + (str1 == str2) + " (incorrect comparison for content)");
        System.out.println("str1.equals(str2): " + str1.equals(str2) + " (correct comparison for content)");
        System.out.println();
        
        // ERROR 4: Confusion between char and String for single characters (VAR-1.E.13)
        System.out.println("ERROR 4: Confusion between char and String for single characters");
        String word = "Programming";
        
        // Common error: Confusing charAt and substring
        System.out.println("String: \"" + word + "\"");
        
        // Using charAt (returns char)
        char firstChar = word.charAt(0);
        System.out.println("\nUsing charAt(0): " + firstChar + " (type: char)");
        
        // Using substring (returns String)
        String firstCharString = word.substring(0, 1);
        System.out.println("Using substring(0, 1): " + firstCharString + " (type: String)");
        
        // Demonstrating the difference
        System.out.println("\nDemonstrating the difference:");
        System.out.println("Can call String methods on substring result: " + firstCharString.toUpperCase());
        
        // This would cause a compilation error
        System.out.println("Cannot call String methods on charAt result (would cause compilation error):");
        // firstChar.toUpperCase(); // Error: char has no toUpperCase() method
        
        // Common error: Forgetting that substring(index, index+1) is needed for a single character String
        System.out.println("\nCommon error: Incorrect way to get a single character as String:");
        // String incorrectChar = word.substring(0); // This gets the entire string from index 0
        System.out.println("word.substring(0): " + word.substring(0) + " (gets entire string, not just first char)");
        System.out.println("Correct way: word.substring(0, 1): " + word.substring(0, 1) + " (gets only first char)");
        System.out.println();
        
        // Summary of common errors
        System.out.println("--- Common Errors with String Indices and Methods ---");
        System.out.println("1. Accessing indices outside the valid range (0 to length-1)");
        System.out.println("2. Not overriding toString() when concatenating objects with strings");
        System.out.println("3. Misunderstanding String method behavior (substring, indexOf, equals)");
        System.out.println("4. Confusing char (from charAt) and String (from substring) types");
        System.out.println("5. Using == instead of equals() to compare String content");
        System.out.println("6. Not checking if indexOf returns -1 before using the index");
        System.out.println("7. Using substring incorrectly to get a single character");
    }
}

// Class without toString() override
class BadProduct {
    private String name;
    private double price;
    
    public BadProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // No toString() override
}

// Class with toString() override
class GoodProduct {
    private String name;
    private double price;
    
    public GoodProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product[name=" + name + ", price=$" + price + "]";
    }
}
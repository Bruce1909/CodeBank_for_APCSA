/**
 * VAR1E7_Err.java
 * 
 * This program demonstrates common errors related to misunderstanding or not using API documentation.
 * 
 * Knowledge Point: VAR-1.E.7
 * - Documentation for APIs and libraries are essential to understanding the attributes
 *   and behaviors of an object of a class.
 */
public class VAR1E7_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors from not using API documentation:\n");
        
        // ERROR 1: Misunderstanding method parameters due to lack of documentation
        System.out.println("ERROR 1: Misunderstanding method parameters due to lack of documentation");
        String text = "Java Programming";
        
        try {
            // Common mistake: assuming substring parameters are (startIndex, length)
            System.out.println("Attempting text.substring(5, 3) thinking it means 'start at 5, length 3':");
            String sub = text.substring(5, 3); // This will throw an exception
            System.out.println(sub); // This line won't execute
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("API documentation would clarify that substring(int beginIndex, int endIndex)");
            System.out.println("requires beginIndex to be less than or equal to endIndex");
        }
        System.out.println();
        
        // ERROR 2: Not checking return values as specified in documentation
        System.out.println("ERROR 2: Not checking return values as specified in documentation");
        String searchStr = "Hello, World!";
        
        // Common mistake: not checking if indexOf returns -1
        int index = searchStr.indexOf("Java");
        System.out.println("searchStr.indexOf(\"Java\"): " + index);
        
        // Incorrect code that doesn't check the return value
        System.out.println("Incorrect code that doesn't check if indexOf returned -1:");
        System.out.println("char charAtIndex = searchStr.charAt(index); // This would throw an exception");
        
        // Correct approach: check the return value as documented
        System.out.println("Correct approach (check if indexOf returned -1):");
        if (index != -1) {
            System.out.println("Found 'Java' at index: " + index);
        } else {
            System.out.println("'Java' not found in the string");
        }
        System.out.println();
        
        // ERROR 3: Ignoring documented exceptions
        System.out.println("ERROR 3: Ignoring documented exceptions");
        String shortStr = "ABC";
        
        System.out.println("API documentation states charAt(int index) throws IndexOutOfBoundsException");
        System.out.println("if the index is negative or not less than length().");
        
        System.out.println("Incorrect code that ignores this documented exception:");
        System.out.println("char c = shortStr.charAt(10); // This would throw an exception");
        
        // Correct approach: handle the documented exception
        System.out.println("Correct approach (handle the documented exception):");
        try {
            char c = shortStr.charAt(10);
            System.out.println(c); // This line won't execute
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught expected exception: " + e.getClass().getName());
            System.out.println("Index 10 is out of bounds for string of length " + shortStr.length());
        }
        System.out.println();
        
        // ERROR 4: Misinterpreting method behavior due to not reading documentation
        System.out.println("ERROR 4: Misinterpreting method behavior due to not reading documentation");
        String s1 = "apple";
        String s2 = "APPLE";
        
        // Common mistake: assuming equals() is case-insensitive
        boolean isEqual = s1.equals(s2);
        System.out.println("s1.equals(s2): " + isEqual);
        System.out.println("A developer might incorrectly assume equals() ignores case");
        System.out.println("API documentation would clarify that equals() is case-sensitive");
        System.out.println("and equalsIgnoreCase() should be used for case-insensitive comparison");
        System.out.println("s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2));
        System.out.println();
        
        // ERROR 5: Misunderstanding return value types
        System.out.println("ERROR 5: Misunderstanding return value types");
        String numStr = "42";
        
        // Common mistake: assuming parseInt returns a String
        System.out.println("Without reading documentation, a developer might write:");
        System.out.println("String parsedNum = Integer.parseInt(numStr); // Compilation error");
        System.out.println("API documentation would clarify that parseInt returns an int, not a String");
        
        // Correct approach: use the correct return type
        int parsedNum = Integer.parseInt(numStr);
        System.out.println("Correct approach: int parsedNum = Integer.parseInt(numStr): " + parsedNum);
        System.out.println();
        
        // ERROR 6: Not understanding method overloads
        System.out.println("ERROR 6: Not understanding method overloads");
        String sentence = "Java is fun";
        
        // Common mistake: using the wrong overload
        System.out.println("Without reading documentation, a developer might not know about overloads:");
        int lastIndex = sentence.lastIndexOf('a');
        System.out.println("sentence.lastIndexOf('a'): " + lastIndex);
        System.out.println("But there's also sentence.lastIndexOf('a', 5): " + sentence.lastIndexOf('a', 5));
        System.out.println("API documentation would explain all available overloads and their behaviors");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Common Errors from Not Using API Documentation ---");
        System.out.println("1. Misunderstanding method parameters and their requirements");
        System.out.println("2. Not checking return values as specified in documentation");
        System.out.println("3. Ignoring documented exceptions that methods may throw");
        System.out.println("4. Misinterpreting method behavior (e.g., case sensitivity)");
        System.out.println("5. Misunderstanding return value types");
        System.out.println("6. Not being aware of method overloads and their different behaviors");
        System.out.println("7. Missing optimizations or best practices mentioned in documentation");
    }
}
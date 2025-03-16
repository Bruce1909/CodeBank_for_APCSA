/**
 * VAR1E2_Err.java
 * 
 * This program demonstrates common errors related to String immutability.
 * 
 * Knowledge Point: VAR-1.E.2
 * - String objects are immutable, meaning that String methods do not change the String object.
 */
public class VAR1E2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with String immutability:\n");
        
        // ERROR 1: Forgetting that String methods don't modify the original String
        System.out.println("ERROR 1: Forgetting that String methods don't modify the original String");
        String name = "john";
        System.out.println("Original name: \"" + name + "\"");
        
        // Common mistake: expecting the original String to change
        name.toUpperCase(); // This doesn't modify 'name'
        System.out.println("After toUpperCase() call: \"" + name + "\" (still lowercase)");
        
        System.out.println("Correct approach: name = name.toUpperCase();");
        name = name.toUpperCase();
        System.out.println("After correct assignment: \"" + name + "\"");
        System.out.println();
        
        // ERROR 2: Misunderstanding String concatenation
        System.out.println("ERROR 2: Misunderstanding String concatenation");
        String greeting = "Hello";
        System.out.println("Original greeting: \"" + greeting + "\"");
        
        // Common mistake: expecting concatenation to modify the original
        greeting.concat(", World!"); // This doesn't modify 'greeting'
        System.out.println("After concat() call: \"" + greeting + "\" (unchanged)");
        
        System.out.println("Correct approach: greeting = greeting.concat(\", World!\");");
        greeting = greeting.concat(", World!");
        System.out.println("After correct assignment: \"" + greeting + "\"");
        System.out.println();
        
        // ERROR 3: Misunderstanding String references
        System.out.println("ERROR 3: Misunderstanding String references");
        String s1 = "Hello";
        String s2 = s1;
        
        System.out.println("s1: \"" + s1 + "\"");
        System.out.println("s2: \"" + s2 + "\" (references the same String as s1)");
        
        // Common misconception: thinking that modifying s1 will affect s2
        System.out.println("\nMisconception: thinking that modifying s1 will affect s2");
        s1 = s1.toUpperCase();
        
        System.out.println("After s1 = s1.toUpperCase():");
        System.out.println("s1: \"" + s1 + "\" (now references a new String)");
        System.out.println("s2: \"" + s2 + "\" (still references the original String)");
        System.out.println("This is because s1 now references a new String object, not the original one");
        System.out.println();
        
        // ERROR 4: Inefficient String manipulation in loops
        System.out.println("ERROR 4: Inefficient String manipulation in loops");
        System.out.println("Inefficient code (creates many temporary String objects):");
        
        String result = "";
        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < 10000; i++) {
            // This creates a new String object in each iteration
            result = result + "a";
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with String concatenation: " + (endTime - startTime) + " ms");
        System.out.println("Result length: " + result.length());
        
        // Better approach: use StringBuilder
        System.out.println("\nMore efficient code using StringBuilder:");
        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        
        for (int i = 0; i < 10000; i++) {
            // This modifies the StringBuilder in place
            sb.append("a");
        }
        
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " ms");
        System.out.println("Result length: " + sb.length());
        System.out.println();
        
        // ERROR 5: Trying to modify individual characters in a String
        System.out.println("ERROR 5: Trying to modify individual characters in a String");
        String text = "Java";
        System.out.println("Original text: \"" + text + "\"");
        
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // text.charAt(0) = 'L'; // Error: charAt() returns a value, not a reference
        
        System.out.println("Correct approach: create a new String with the desired changes");
        text = "L" + text.substring(1);
        System.out.println("After correct approach: \"" + text + "\"");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Common Errors with String Immutability ---");
        System.out.println("1. Forgetting to capture the result of String methods");
        System.out.println("2. Expecting String methods to modify the original String");
        System.out.println("3. Misunderstanding String references and assignment");
        System.out.println("4. Using inefficient String concatenation in loops");
        System.out.println("5. Attempting to modify individual characters directly");
    }
}
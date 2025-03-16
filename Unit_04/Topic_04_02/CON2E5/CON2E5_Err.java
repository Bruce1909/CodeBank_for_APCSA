/**
 * This program demonstrates common "off by one" errors in loops
 * as described in CON-2.E.5:
 * - "Off by one" errors occur when the iteration statement loops one time too many or one time too few
 */
public class CON2E5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common 'off by one' errors in loops (CON-2.E.5):\n");
        
        // Error 1: Incorrect array iteration
        System.out.println("Error 1: Incorrect array iteration");
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Array values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        System.out.println("\nIncorrect iteration (using <= instead of <):");
        System.out.println("for (int i = 0; i <= numbers.length; i++) { ... }");
        System.out.println("This would cause an ArrayIndexOutOfBoundsException at i = " + numbers.length);
        
        // Demonstration with try-catch
        try {
            System.out.println("Attempting to access numbers[" + numbers.length + "]");
            // The following line would throw an exception
            // System.out.println(numbers[numbers.length]);
            System.out.println("This would throw ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Exception would occur: Index out of bounds");
        }
        System.out.println();
        
        // Error 2: Incorrect range iteration
        System.out.println("Error 2: Incorrect range iteration");
        int n = 5;
        
        System.out.println("Correct (printing 1 to 5):");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n\nIncorrect (using < instead of <=):");
        for (int i = 1; i < n; i++) { // Incorrect: using < for inclusive range
            System.out.print(i + " "); // Only prints 1 to 4, missing 5
        }
        System.out.println(" (missing the value " + n + ")");
        System.out.println();
        
        // Error 3: Incorrect substring processing
        System.out.println("Error 3: Incorrect substring processing");
        String text = "Hello, World!";
        int start = 0;
        int end = 5; // We want "Hello"
        
        System.out.println("Original string: " + text);
        
        System.out.println("\nCorrect (using exclusive end index):");
        String correctSubstring = text.substring(start, end);
        System.out.println("text.substring(" + start + ", " + end + ") = \"" + correctSubstring + "\"");
        
        System.out.println("\nIncorrect (using inclusive end index):");
        try {
            // Common mistake: thinking end index is inclusive
            String incorrectSubstring = text.substring(start, end - 1);
            System.out.println("text.substring(" + start + ", " + (end - 1) + ") = \"" + incorrectSubstring + "\"" + " (missing the last character)");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // Error 4: Incorrect loop initialization
        System.out.println("Error 4: Incorrect loop initialization");
        
        System.out.println("Correct (starting at 1):");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println("\n\nIncorrect (starting at 0 when you want to start at 1):");
        for (int i = 0; i <= 5; i++) { // Incorrect: starting at 0 instead of 1
            System.out.print(i + " "); // Prints 0 to 5 instead of 1 to 5
        }
        System.out.println(" (includes unwanted value 0)");
        System.out.println();
        
        // Error 5: Fence post error
        System.out.println("Error 5: Fence post error");
        int sections = 5;
        
        System.out.println("For " + sections + " fence sections:");
        
        System.out.println("\nCorrect (using sections + 1 posts):");
        int correctPosts = sections + 1;
        System.out.println("Need " + correctPosts + " posts");
        
        System.out.print("Correct fence: ");
        for (int i = 0; i < correctPosts; i++) {
            System.out.print("|"); // Print a post
            if (i < sections) { // Only print sections between posts
                System.out.print("---"); // Print a section
            }
        }
        
        System.out.println("\n\nIncorrect (using same number of posts as sections):");
        int incorrectPosts = sections;
        System.out.println("Using only " + incorrectPosts + " posts (incorrect)");
        
        System.out.print("Incorrect fence: ");
        for (int i = 0; i < incorrectPosts; i++) {
            System.out.print("|"); // Print a post
            System.out.print("---"); // Print a section
        }
        System.out.println(" (missing the last post)");
        System.out.println();
        
        // Summary
        System.out.println("--- Common 'Off by One' Errors (CON-2.E.5) ---");
        System.out.println("1. Using <= instead of < when iterating through arrays");
        System.out.println("2. Using < instead of <= when you want an inclusive upper bound");
        System.out.println("3. Misunderstanding that String.substring() end index is exclusive");
        System.out.println("4. Starting a loop at the wrong index (e.g., 0 instead of 1)");
        System.out.println("5. Fence post errors: forgetting that N sections need N+1 posts");
        System.out.println("6. Always test your loops with small examples and check boundary conditions");
    }
}
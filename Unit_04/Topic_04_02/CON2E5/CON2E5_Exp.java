/**
 * This program demonstrates "off by one" errors in loops and how to avoid them
 * as described in CON-2.E.5:
 * - "Off by one" errors occur when the iteration statement loops one time too many or one time too few
 */
public class CON2E5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how to avoid 'off by one' errors in loops (CON-2.E.5):\n");
        
        // Example 1: Correctly iterating through an array
        System.out.println("Example 1: Correctly iterating through an array");
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Array values:");
        for (int i = 0; i < numbers.length; i++) { // Correct: using < with length
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        System.out.println();
        
        // Example 2: Correctly iterating from 1 to N
        System.out.println("Example 2: Correctly iterating from 1 to N");
        int n = 5;
        
        System.out.println("Printing numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) { // Correct: using <= for inclusive range
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // Example 3: Correctly processing a substring
        System.out.println("Example 3: Correctly processing a substring");
        String text = "Hello, World!";
        int start = 0;
        int end = 5; // We want "Hello"
        
        System.out.println("Original string: " + text);
        System.out.println("Extracting substring from index " + start + " to " + (end - 1) + ":");
        
        // Correct: substring end index is exclusive
        String substring = text.substring(start, end);
        System.out.println("Extracted: \"" + substring + "\"");
        System.out.println();
        
        // Example 4: Correctly using a do-while loop
        System.out.println("Example 4: Correctly using a do-while loop");
        System.out.println("Counting from 1 to 5 using do-while:");
        
        int counter = 1;
        do {
            System.out.print(counter + " ");
            counter++;
        } while (counter <= 5); // Correct: using <= for inclusive range
        System.out.println("\n");
        
        // Example 5: Correctly handling fence post problems
        System.out.println("Example 5: Correctly handling fence post problems");
        System.out.println("Building a fence with 5 sections requires 6 posts:");
        
        int sections = 5;
        int posts = sections + 1; // Correct: posts = sections + 1
        
        System.out.println("For " + sections + " fence sections, we need " + posts + " posts");
        
        // Visual representation of the fence
        System.out.print("Fence: ");
        for (int i = 0; i < posts; i++) {
            System.out.print("|"); // Print a post
            if (i < sections) { // Only print sections between posts, not after the last post
                System.out.print("---"); // Print a section
            }
        }
        System.out.println("\n");
        
        // Summary
        System.out.println("--- Key Points about Avoiding 'Off by One' Errors (CON-2.E.5) ---");
        System.out.println("1. When iterating through arrays, use i < array.length, not i <= array.length");
        System.out.println("2. For inclusive ranges (1 to N), use i <= N, not i < N");
        System.out.println("3. For exclusive ranges (0 to N-1), use i < N, not i <= N");
        System.out.println("4. Remember that String.substring(start, end) includes start but excludes end");
        System.out.println("5. In fence post problems, remember that N sections require N+1 posts");
        System.out.println("6. Always test boundary conditions: first iteration, last iteration, empty collections");
    }
}
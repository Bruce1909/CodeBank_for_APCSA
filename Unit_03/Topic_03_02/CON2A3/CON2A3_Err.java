/**
 * CON2A3_Err.java
 * 
 * This program demonstrates common errors related to one-way selection using if statements.
 * Knowledge Point: CON-2.A.3 - A one-way selection (if statement) is written when there is a set of statements
 * to execute under a certain condition. In this case, the body is executed only when the Boolean condition is true.
 */
public class CON2A3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with one-way selection using if statements:\n");
        
        // Example 1: Forgetting that one-way selection doesn't handle the false case
        System.out.println("Example 1: Forgetting that one-way selection doesn't handle the false case");
        int score = 65;
        
        System.out.println("Student score: " + score);
        
        // Error 1: Using one-way selection when two-way selection is needed
        if (score >= 70) {
            System.out.println("Student passed the test");
        }
        // No message is displayed for failing students!
        
        System.out.println("Correct approach using two-way selection:");
        if (score >= 70) {
            System.out.println("Student passed the test");
        } else {
            System.out.println("Student failed the test");
        }
        System.out.println();
        
        // Example 2: Redundant if statements
        System.out.println("Example 2: Redundant if statements");
        boolean isAdult = true;
        
        // Error 2: Using redundant if statements for mutually exclusive conditions
        if (isAdult) {
            System.out.println("Person is an adult");
        }
        if (!isAdult) { // This is never executed when isAdult is true
            System.out.println("Person is a minor");
        }
        
        System.out.println("Correct approach using if-else:");
        if (isAdult) {
            System.out.println("Person is an adult");
        } else {
            System.out.println("Person is a minor");
        }
        System.out.println();
        
        // Example 3: Misplaced statements
        System.out.println("Example 3: Misplaced statements");
        int temperature = 28;
        
        // Error 3: Placing statements that should be in the if block outside of it
        System.out.println("Current temperature: " + temperature);
        if (temperature < 32) {
            System.out.println("Warning: Freezing temperatures!");
        }
        System.out.println("Take precautions against ice and frost."); // This always executes!
        
        System.out.println("\nCorrect approach with all related statements in the if block:");
        System.out.println("Current temperature: " + temperature);
        if (temperature < 32) {
            System.out.println("Warning: Freezing temperatures!");
            System.out.println("Take precautions against ice and frost.");
        }
        System.out.println();
        
        // Example 4: Unnecessary one-way selection
        System.out.println("Example 4: Unnecessary one-way selection");
        boolean isLoggedIn = true;
        
        // Error 4: Using if statement when direct assignment would work
        String message;
        if (isLoggedIn) {
            message = "Welcome back!";
        } else {
            message = "Please log in.";
        }
        System.out.println(message);
        
        System.out.println("Simpler approach using conditional expression:");
        String betterMessage = isLoggedIn ? "Welcome back!" : "Please log in.";
        System.out.println(betterMessage);
        System.out.println();
        
        // Example 5: Confusing one-way and two-way selection
        System.out.println("Example 5: Confusing one-way and two-way selection");
        int num = 10;
        
        // Error 5: Using multiple one-way selections instead of multi-way selection
        if (num > 0) {
            System.out.println("Number is positive");
        }
        if (num < 0) {
            System.out.println("Number is negative");
        }
        if (num == 0) {
            System.out.println("Number is zero");
        }
        
        System.out.println("Better approach using multi-way selection:");
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Common Errors with One-Way Selection ---");
        System.out.println("1. One-way selection doesn't handle the false case - use two-way selection when needed");
        System.out.println("2. Avoid redundant if statements for mutually exclusive conditions");
        System.out.println("3. Keep related statements inside the if block");
        System.out.println("4. Consider using conditional expressions for simple assignments");
        System.out.println("5. Use multi-way selection for mutually exclusive conditions");
    }
}
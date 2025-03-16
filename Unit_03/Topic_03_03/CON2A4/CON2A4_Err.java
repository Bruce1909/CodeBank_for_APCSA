/**
 * CON2A4_Err.java
 * 
 * This program demonstrates common errors related to two-way selection using if-else statements.
 * Knowledge Point: CON-2.A.4 - A two-way selection is written when there are two sets of statements—
 * one to be executed when the Boolean condition is true, and another set for when the Boolean condition is false.
 * In this case, the body of the "if" is executed when the Boolean condition is true, and the body of the "else"
 * is executed when the Boolean condition is false.
 */
public class CON2A4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with two-way selection using if-else statements:\n");
        
        // Example 1: Misplaced else clause
        System.out.println("Example 1: Misplaced else clause");
        int x = 10;
        
        // Error 1: Misplaced else clause due to missing braces
        if (x > 5)
            System.out.println("x is greater than 5");
        // The else below is associated with the closest if, which causes a compilation error
        // else
        //     System.out.println("x is not greater than 5");
        
        System.out.println("Error 1: Misplaced else clause due to missing braces");
        System.out.println("Correct version with proper braces:");
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is not greater than 5");
        }
        System.out.println();
        
        // Example 2: Redundant else-if
        System.out.println("Example 2: Redundant else-if");
        int score = 85;
        
        // Error 2: Using else-if when conditions are mutually exclusive
        System.out.println("Student score: " + score);
        if (score >= 60) {
            System.out.println("Student passed");
        } else if (score < 60) { // This condition is redundant
            System.out.println("Student failed");
        }
        
        System.out.println("Error 2: Using else-if when conditions are mutually exclusive");
        System.out.println("Correct version using simple else:");
        if (score >= 60) {
            System.out.println("Student passed");
        } else { // No need to check score < 60, it's implied
            System.out.println("Student failed");
        }
        System.out.println();
        
        // Example 3: Forgetting that else is optional
        System.out.println("Example 3: Forgetting that else is optional");
        boolean hasPermission = true;
        
        // Error 3: Using empty else block
        if (hasPermission) {
            System.out.println("Access granted");
        } else {
            // Empty else block - unnecessary
        }
        
        System.out.println("Error 3: Using empty else block");
        System.out.println("Correct version without unnecessary else:");
        if (hasPermission) {
            System.out.println("Access granted");
        }
        System.out.println();
        
        // Example 4: Nested if-else indentation confusion
        System.out.println("Example 4: Nested if-else indentation confusion");
        int age = 25;
        boolean isStudent = true;
        
        // Error 4: Confusing nested if-else structure
        System.out.println("Age: " + age + ", Is student: " + isStudent);
        if (age >= 18) {
            System.out.println("Person is an adult");
            if (isStudent)
                System.out.println("Adult student");
        } else // This else belongs to the outer if
            System.out.println("Person is a minor");
        
        System.out.println("\nClearer version with proper indentation and braces:");
        if (age >= 18) {
            System.out.println("Person is an adult");
            if (isStudent) {
                System.out.println("Adult student");
            }
        } else {
            System.out.println("Person is a minor");
        }
        System.out.println();
        
        // Example 5: Conditional expression errors
        System.out.println("Example 5: Conditional expression errors");
        boolean isLoggedIn = true;
        
        // Error 5: Forgetting that conditional expressions need both true and false cases
        // String message = isLoggedIn ? "Welcome back!"; // Missing false case
        System.out.println("Error 5: Forgetting that conditional expressions need both true and false cases");
        System.out.println("Correct version with both cases:");
        String message = isLoggedIn ? "Welcome back!" : "Please log in";
        System.out.println(message);
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Common Errors with Two-Way Selection ---");
        System.out.println("1. Always use braces for multi-line if-else blocks to avoid misplaced else clauses");
        System.out.println("2. Don't use redundant else-if when a simple else would suffice");
        System.out.println("3. Remember that else is optional - don't use empty else blocks");
        System.out.println("4. Use proper indentation and braces for nested if-else structures");
        System.out.println("5. Conditional expressions require both true and false cases");
    }
}
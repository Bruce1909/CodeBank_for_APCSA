/**
 * CON2A4_Exp.java
 * 
 * This program demonstrates two-way selection using if-else statements.
 * Knowledge Point: CON-2.A.4 - A two-way selection is written when there are two sets of statements—
 * one to be executed when the Boolean condition is true, and another set for when the Boolean condition is false.
 * In this case, the body of the "if" is executed when the Boolean condition is true, and the body of the "else"
 * is executed when the Boolean condition is false.
 */
public class CON2A4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating two-way selection using if-else statements:\n");
        
        // Example 1: Basic two-way selection
        System.out.println("Example 1: Basic two-way selection");
        int score = 75;
        
        System.out.println("Student score: " + score);
        if (score >= 70) {
            System.out.println("Student passed the test");
        } else {
            System.out.println("Student failed the test");
        }
        System.out.println();
        
        // Example 2: Two-way selection with boolean variable
        System.out.println("Example 2: Two-way selection with boolean variable");
        boolean isAdult = false;
        
        System.out.println("Is the person an adult? " + isAdult);
        if (isAdult) {
            System.out.println("Person is eligible for adult services");
            System.out.println("No parental consent required");
        } else {
            System.out.println("Person is a minor");
            System.out.println("Parental consent may be required");
        }
        System.out.println();
        
        // Example 3: Two-way selection with compound condition
        System.out.println("Example 3: Two-way selection with compound condition");
        int temperature = 85;
        boolean isRaining = false;
        
        System.out.println("Temperature: " + temperature + " degrees");
        System.out.println("Is it raining? " + isRaining);
        
        if (temperature > 80 && !isRaining) {
            System.out.println("It's a great day for outdoor activities!");
            System.out.println("Remember to use sunscreen");
        } else {
            System.out.println("Consider indoor activities today");
            System.out.println("The weather conditions are not ideal for outdoors");
        }
        System.out.println();
        
        // Example 4: Two-way selection with method call
        System.out.println("Example 4: Two-way selection with method call");
        String password = "pass123";
        
        System.out.println("Checking password strength...");
        if (isStrongPassword(password)) {
            System.out.println("Password is strong");
            System.out.println("Your account is secure");
        } else {
            System.out.println("Password is weak");
            System.out.println("Please consider using a stronger password");
        }
        System.out.println();
        
        // Example 5: Two-way selection with conditional expression
        System.out.println("Example 5: Two-way selection with conditional expression");
        int age = 20;
        
        System.out.println("Age: " + age);
        String status = (age >= 18) ? "adult" : "minor";
        System.out.println("Person's status: " + status);
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Two-Way Selection ---");
        System.out.println("1. Two-way selection uses if-else structure");
        System.out.println("2. Exactly one of the two code blocks will execute");
        System.out.println("3. The if block executes when the condition is true");
        System.out.println("4. The else block executes when the condition is false");
        System.out.println("5. For simple assignments, conditional expressions (? :) can be used");
    }
    
    // Helper method for Example 4
    private static boolean isStrongPassword(String password) {
        // Simple check: password is strong if length >= 8
        return password != null && password.length() >= 8;
    }
}
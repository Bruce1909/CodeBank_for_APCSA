/**
 * CON2A5_Exp.java
 * 
 * This program demonstrates multi-way selection using if-else-if statements.
 * Knowledge Point: CON-2.A.5 - A multi-way selection is written when there are a series of conditions
 * with different statements for each condition. Multi-way selection is performed using if-else-if statements
 * such that exactly one section of code is executed based on the first condition that evaluates to true.
 */
public class CON2A5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating multi-way selection using if-else-if statements:\n");
        
        // Example 1: Basic multi-way selection with grades
        System.out.println("Example 1: Basic multi-way selection with grades");
        int score = 85;
        
        System.out.println("Student score: " + score);
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        System.out.println();
        
        // Example 2: Multi-way selection with time of day
        System.out.println("Example 2: Multi-way selection with time of day");
        int hour = 14; // 24-hour format
        
        System.out.println("Current hour: " + hour);
        if (hour < 6) {
            System.out.println("Good night");
        } else if (hour < 12) {
            System.out.println("Good morning");
        } else if (hour < 18) {
            System.out.println("Good afternoon");
        } else {
            System.out.println("Good evening");
        }
        System.out.println();
        
        // Example 3: Multi-way selection with compound conditions
        System.out.println("Example 3: Multi-way selection with compound conditions");
        int age = 25;
        boolean isStudent = true;
        
        System.out.println("Age: " + age);
        System.out.println("Is student? " + isStudent);
        
        if (age < 18) {
            System.out.println("Youth discount applies");
        } else if (age >= 65) {
            System.out.println("Senior discount applies");
        } else if (isStudent) {
            System.out.println("Student discount applies");
        } else {
            System.out.println("Regular price applies");
        }
        System.out.println();
        
        // Example 4: Multi-way selection with method calls
        System.out.println("Example 4: Multi-way selection with method calls");
        String input = "Hello123";
        
        System.out.println("Analyzing input: " + input);
        if (isNumeric(input)) {
            System.out.println("Input is numeric");
        } else if (isAlphabetic(input)) {
            System.out.println("Input is alphabetic");
        } else if (isAlphanumeric(input)) {
            System.out.println("Input is alphanumeric");
        } else {
            System.out.println("Input contains special characters");
        }
        System.out.println();
        
        // Example 5: Multi-way selection with ranges
        System.out.println("Example 5: Multi-way selection with ranges");
        double bmi = 27.5;
        
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30.0) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obesity");
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Multi-Way Selection ---");
        System.out.println("1. Multi-way selection uses if-else-if-else structure");
        System.out.println("2. Conditions are evaluated in order from top to bottom");
        System.out.println("3. Only the code block for the first true condition executes");
        System.out.println("4. If no condition is true, the final else block executes (if present)");
        System.out.println("5. Multi-way selection is useful for handling multiple distinct cases");
    }
    
    // Helper methods for Example 4
    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean isAlphabetic(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean isAlphanumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
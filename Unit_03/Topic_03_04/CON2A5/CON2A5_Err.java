/**
 * CON2A5_Err.java
 * 
 * This program demonstrates common errors related to multi-way selection using if-else-if statements.
 * Knowledge Point: CON-2.A.5 - A multi-way selection is written when there are a series of conditions
 * with different statements for each condition. Multi-way selection is performed using if-else-if statements
 * such that exactly one section of code is executed based on the first condition that evaluates to true.
 */
public class CON2A5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with multi-way selection using if-else-if statements:\n");
        
        // Example 1: Incorrect condition order
        System.out.println("Example 1: Incorrect condition order");
        int score = 85;
        
        // Error 1: Conditions in wrong order - more general condition first
        System.out.println("Student score: " + score);
        if (score >= 60) {
            System.out.println("Student passed (60 or above)"); // This executes
        } else if (score >= 80) {
            System.out.println("Student did well (80 or above)"); // This never executes
        } else if (score >= 90) {
            System.out.println("Student did excellent (90 or above)"); // This never executes
        } else {
            System.out.println("Student failed (below 60)");
        }
        
        System.out.println("\nCorrect version with conditions in proper order:");
        if (score >= 90) {
            System.out.println("Student did excellent (90 or above)");
        } else if (score >= 80) {
            System.out.println("Student did well (80 or above)"); // This executes
        } else if (score >= 60) {
            System.out.println("Student passed (60 or above)");
        } else {
            System.out.println("Student failed (below 60)");
        }
        System.out.println();
        
        // Example 2: Missing final else
        System.out.println("Example 2: Missing final else");
        int dayOfWeek = 8; // Invalid day
        
        // Error 2: No default case for unexpected values
        System.out.println("Day of week: " + dayOfWeek);
        if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("Sunday");
        }
        // No output for invalid day!
        
        System.out.println("\nCorrect version with final else as default case:");
        if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day"); // Handles unexpected values
        }
        System.out.println();
        
        // Example 3: Redundant conditions
        System.out.println("Example 3: Redundant conditions");
        int age = 25;
        
        // Error 3: Redundant and overlapping conditions
        System.out.println("Age: " + age);
        if (age >= 18) {
            System.out.println("Person is an adult"); // This executes
        } else if (age >= 21) {
            System.out.println("Person can drink alcohol in the US"); // This never executes
        } else if (age < 18) {
            System.out.println("Person is a minor"); // This is redundant with the first condition
        }
        
        System.out.println("\nCorrect version with non-redundant conditions:");
        if (age >= 21) {
            System.out.println("Person can drink alcohol in the US");
        } else if (age >= 18) {
            System.out.println("Person is an adult but cannot drink alcohol in the US");
        } else {
            System.out.println("Person is a minor");
        }
        System.out.println();
        
        // Example 4: Using multiple if statements instead of if-else-if
        System.out.println("Example 4: Using multiple if statements instead of if-else-if");
        int number = 15;
        
        // Error 4: Using separate if statements when conditions are mutually exclusive
        System.out.println("Number: " + number);
        if (number > 10) {
            System.out.println("Number is greater than 10"); // This executes
        }
        if (number > 5) {
            System.out.println("Number is greater than 5"); // This also executes
        }
        if (number > 0) {
            System.out.println("Number is positive"); // This also executes
        }
        
        System.out.println("\nCorrect version using if-else-if for mutually exclusive categorization:");
        if (number > 10) {
            System.out.println("Number is greater than 10");
        } else if (number > 5) {
            System.out.println("Number is greater than 5 but not greater than 10");
        } else if (number > 0) {
            System.out.println("Number is positive but not greater than 5");
        } else {
            System.out.println("Number is zero or negative");
        }
        System.out.println();
        
        // Example 5: Forgetting break in switch (alternative to if-else-if)
        System.out.println("Example 5: Forgetting break in switch (alternative to if-else-if)");
        char grade = 'B';
        
        // Error 5: Missing break statements in switch
        System.out.println("Grade: " + grade);
        System.out.println("Switch without break statements:");
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                // Missing break
            case 'B':
                System.out.println("Good"); // This executes
                // Missing break
            case 'C':
                System.out.println("Satisfactory"); // This also executes due to fall-through
                // Missing break
            case 'D':
                System.out.println("Needs improvement"); // This also executes due to fall-through
                // Missing break
            case 'F':
                System.out.println("Failed"); // This also executes due to fall-through
                // Missing break
            default:
                System.out.println("Invalid grade");
        }
        
        System.out.println("\nCorrect version with break statements:");
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Satisfactory");
                break;
            case 'D':
                System.out.println("Needs improvement");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Common Errors with Multi-Way Selection ---");
        System.out.println("1. Order conditions from most specific to most general");
        System.out.println("2. Always include a final else as a default case for unexpected values");
        System.out.println("3. Avoid redundant or overlapping conditions");
        System.out.println("4. Use if-else-if for mutually exclusive conditions, not separate if statements");
        System.out.println("5. When using switch as an alternative, don't forget break statements");
    }
}
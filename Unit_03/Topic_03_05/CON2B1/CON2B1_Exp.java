/**
 * CON2B1_Exp.java
 * 
 * This program demonstrates the use of nested if statements in Java.
 * Knowledge Point: CON-2.B.1 - Nested if statements consist of if statements within if statements.
 */
public class CON2B1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating nested if statements:\n");
        
        // Example 1: Basic nested if statements
        System.out.println("Example 1: Basic nested if statements");
        int age = 18;
        boolean hasLicense = true;
        
        System.out.println("Person's age: " + age);
        System.out.println("Has driver's license: " + hasLicense);
        
        if (age >= 16) { // Outer if statement
            System.out.println("Person is old enough to drive");
            
            if (hasLicense) { // Nested if statement
                System.out.println("Person has a license and can legally drive");
            } else { // Nested else statement
                System.out.println("Person is old enough but doesn't have a license");
            }
        } else { // Outer else statement
            System.out.println("Person is too young to drive");
        }
        System.out.println();
        
        // Example 2: Multiple levels of nesting
        System.out.println("Example 2: Multiple levels of nesting");
        int score = 85;
        boolean isHonorsStudent = true;
        
        System.out.println("Student's score: " + score);
        System.out.println("Is honors student: " + isHonorsStudent);
        
        if (score >= 60) { // First level if
            System.out.println("Student passed the test");
            
            if (score >= 80) { // Second level if
                System.out.println("Student earned a high score");
                
                if (isHonorsStudent) { // Third level if
                    System.out.println("Honors student with high score - eligible for award");
                } else { // Third level else
                    System.out.println("Regular student with high score - good job!");
                }
            } else { // Second level else
                System.out.println("Student passed but did not earn a high score");
            }
        } else { // First level else
            System.out.println("Student failed the test");
        }
        System.out.println();
        
        // Example 3: Nested if statements for categorization
        System.out.println("Example 3: Nested if statements for categorization");
        char grade = 'B';
        
        System.out.println("Student's grade: " + grade);
        
        if (grade == 'A' || grade == 'B') {
            System.out.println("Student is doing well");
            
            if (grade == 'A') {
                System.out.println("Student has excellent performance");
            } else { // grade is 'B'
                System.out.println("Student has good performance");
            }
        } else { // grade is not 'A' or 'B'
            System.out.println("Student needs improvement");
            
            if (grade == 'C') {
                System.out.println("Student has average performance");
            } else { // grade is 'D' or 'F'
                System.out.println("Student has poor performance");
            }
        }
        System.out.println();
        
        // Example 4: Nested if statements with complex conditions
        System.out.println("Example 4: Nested if statements with complex conditions");
        int temperature = 75;
        boolean isRaining = false;
        boolean isWeekend = true;
        
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Is it raining: " + isRaining);
        System.out.println("Is it weekend: " + isWeekend);
        
        if (isWeekend) {
            System.out.println("It's the weekend");
            
            if (temperature > 70) {
                System.out.println("It's warm outside");
                
                if (!isRaining) {
                    System.out.println("Perfect day for outdoor activities!");
                } else {
                    System.out.println("It's warm but raining - indoor activities recommended");
                }
            } else {
                System.out.println("It's cool outside");
                
                if (!isRaining) {
                    System.out.println("Good day for a light jacket and outdoor activities");
                } else {
                    System.out.println("Cool and raining - stay inside");
                }
            }
        } else {
            System.out.println("It's a weekday");
            // Further nested conditions could be added here
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Nested if Statements ---");
        System.out.println("1. Nested if statements are if statements within if statements");
        System.out.println("2. They allow for more complex decision-making logic");
        System.out.println("3. Each level of nesting represents a more specific condition");
        System.out.println("4. Indentation helps visualize the structure of nested statements");
        System.out.println("5. Both the if and else clauses can contain nested if statements");
    }
}
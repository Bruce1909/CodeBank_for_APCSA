/**
 * CON2B1_Err.java
 * 
 * This program demonstrates common errors related to nested if statements in Java.
 * Knowledge Point: CON-2.B.1 - Nested if statements consist of if statements within if statements.
 */
public class CON2B1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with nested if statements:\n");
        
        // Example 1: Improper indentation making code hard to read
        System.out.println("Example 1: Improper indentation making code hard to read");
        int age = 17;
        boolean hasPermission = true;
        
        System.out.println("Person's age: " + age);
        System.out.println("Has parental permission: " + hasPermission);
        
        // Error 1: Poor indentation makes the nesting structure unclear
        if (age >= 16) {
        System.out.println("Person is old enough to drive with restrictions");
        if (hasPermission) {
        System.out.println("Person has permission to drive");
        } else {
        System.out.println("Person needs parental permission");
        }
        } else {
        System.out.println("Person is too young to drive");
        }
        
        System.out.println("\nCorrect version with proper indentation:");
        if (age >= 16) {
            System.out.println("Person is old enough to drive with restrictions");
            if (hasPermission) {
                System.out.println("Person has permission to drive");
            } else {
                System.out.println("Person needs parental permission");
            }
        } else {
            System.out.println("Person is too young to drive");
        }
        System.out.println();
        
        // Example 2: Misplaced curly braces changing the logic
        System.out.println("Example 2: Misplaced curly braces changing the logic");
        int score = 75;
        boolean isExtraCredit = true;
        
        System.out.println("Student's score: " + score);
        System.out.println("Is extra credit assignment: " + isExtraCredit);
        
        // Error 2: Misplaced curly braces change the intended logic
        System.out.println("\nIncorrect nested if with misplaced braces:");
        if (score >= 70) {
            System.out.println("Student is passing");
        } // Missing closing brace here
            if (isExtraCredit) {
                System.out.println("This is an extra credit assignment"); // Always executes if isExtraCredit is true
            }
        // The above code doesn't properly nest the second if inside the first
        
        System.out.println("\nCorrect version with proper nesting:");
        if (score >= 70) {
            System.out.println("Student is passing");
            if (isExtraCredit) {
                System.out.println("This is an extra credit assignment");
            }
        }
        System.out.println();
        
        // Example 3: Confusing nested if with else
        System.out.println("Example 3: Confusing nested if with else");
        boolean isRaining = true;
        boolean hasUmbrella = false;
        
        System.out.println("Is it raining: " + isRaining);
        System.out.println("Has umbrella: " + hasUmbrella);
        
        // Error 3: Ambiguous else clause without braces
        System.out.println("\nAmbiguous nested if-else without braces:");
        if (isRaining)
            if (hasUmbrella)
                System.out.println("You can go outside with your umbrella");
            else
                System.out.println("You should stay inside"); // Which if does this else belong to?
        
        System.out.println("\nClear version with braces showing else belongs to inner if:");
        if (isRaining) {
            if (hasUmbrella) {
                System.out.println("You can go outside with your umbrella");
            } else {
                System.out.println("You should stay inside"); // Clearly belongs to inner if
            }
        }
        
        System.out.println("\nAlternative version with else belonging to outer if:");
        if (isRaining) {
            if (hasUmbrella) {
                System.out.println("You can go outside with your umbrella");
            }
        } else {
            System.out.println("The weather is nice"); // Belongs to outer if
        }
        System.out.println();
        
        // Example 4: Excessive nesting making code hard to follow
        System.out.println("Example 4: Excessive nesting making code hard to follow");
        int temperature = 68;
        boolean isWeekend = true;
        boolean hasMoney = false;
        
        // Error 4: Too many levels of nesting make code hard to read and maintain
        System.out.println("\nExcessively nested if statements:");
        if (isWeekend) {
            if (temperature > 70) {
                if (hasMoney) {
                    if (isRaining) {
                        System.out.println("Go to the mall");
                    } else {
                        System.out.println("Go to the park");
                    }
                } else {
                    if (isRaining) {
                        System.out.println("Stay home and watch TV");
                    } else {
                        System.out.println("Go for a walk");
                    }
                }
            } else {
                if (hasMoney) {
                    System.out.println("Go to the movies");
                } else {
                    System.out.println("Stay home and read a book");
                }
            }
        } else {
            System.out.println("It's a weekday, go to work or school");
        }
        
        System.out.println("\nBetter approach using compound conditions to reduce nesting:");
        if (!isWeekend) {
            System.out.println("It's a weekday, go to work or school");
        } else if (temperature <= 70 && hasMoney) {
            System.out.println("Go to the movies");
        } else if (temperature <= 70 && !hasMoney) {
            System.out.println("Stay home and read a book");
        } else if (hasMoney && isRaining) {
            System.out.println("Go to the mall");
        } else if (hasMoney && !isRaining) {
            System.out.println("Go to the park");
        } else if (!hasMoney && isRaining) {
            System.out.println("Stay home and watch TV");
        } else {
            System.out.println("Go for a walk");
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Common Errors with Nested if Statements ---");
        System.out.println("1. Always use proper indentation to make nested structure clear");
        System.out.println("2. Be careful with placement of curly braces to maintain intended logic");
        System.out.println("3. Use curly braces to clarify which if an else belongs to");
        System.out.println("4. Avoid excessive nesting that makes code hard to read and maintain");
        System.out.println("5. Consider using compound conditions or early returns to reduce nesting");
    }
}
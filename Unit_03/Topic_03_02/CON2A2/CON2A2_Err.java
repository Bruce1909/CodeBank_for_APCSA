/**
 * CON2A2_Err.java
 * 
 * This program demonstrates common errors related to if statements and Boolean expressions.
 * Knowledge Point: CON-2.A.2 - if statements affect the flow of control by executing different statements
 * based on the value of a Boolean expression.
 */
public class CON2A2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with if statements and Boolean expressions:\n");
        
        // Example 1: Assignment instead of comparison
        System.out.println("Example 1: Assignment instead of comparison");
        int x = 5;
        
        // Error 1: Using = (assignment) instead of == (comparison)
        // if (x = 10) { // This would cause a compilation error in Java
        //     System.out.println("x is 10");
        // }
        System.out.println("Error 1: if (x = 10) // Using assignment instead of comparison");
        System.out.println("Correct version: if (x == 10) // Using comparison operator");
        System.out.println();
        
        // Example 2: Confusing && and || operators
        System.out.println("Example 2: Confusing && and || operators");
        int age = 25;
        boolean hasLicense = false;
        
        // Error 2: Using && when || is needed
        if (age >= 18 && hasLicense) {
            System.out.println("Person can drive"); // This won't execute because hasLicense is false
        }
        
        System.out.println("Current state: age = " + age + ", hasLicense = " + hasLicense);
        System.out.println("Error 2: if (age >= 18 && hasLicense) // Both conditions must be true");
        System.out.println("If the intent was to check if the person is either an adult OR has a license:");
        System.out.println("Correct version: if (age >= 18 || hasLicense) // Either condition can be true");
        System.out.println();
        
        // Example 3: Incorrect use of Boolean variables
        System.out.println("Example 3: Incorrect use of Boolean variables");
        boolean isRaining = true;
        
        // Error 3: Redundant comparison with boolean variables
        if (isRaining == true) {
            System.out.println("It is raining (redundant comparison)");
        }
        
        System.out.println("Error 3: if (isRaining == true) // Redundant comparison");
        System.out.println("Correct version: if (isRaining) // Direct use of boolean variable");
        
        // Error 4: Incorrect negation
        if (isRaining != true) { // This is more complex than needed
            System.out.println("It is not raining (complex negation)"); // Won't execute
        }
        
        System.out.println("Error 4: if (isRaining != true) // Complex negation");
        System.out.println("Correct version: if (!isRaining) // Simple negation");
        System.out.println();
        
        // Example 4: Misunderstanding operator precedence
        System.out.println("Example 4: Misunderstanding operator precedence");
        int a = 5, b = 10, c = 15;
        
        // Error 5: Missing parentheses leading to unexpected results
        if (a > b || b > c && a < c) {
            // This condition is true because && has higher precedence than ||
            // It's evaluated as: (a > b) || ((b > c) && (a < c))
            // (5 > 10) || ((10 > 15) && (5 < 15))
            // false || (false && true)
            // false || false
            // false
            System.out.println("This won't execute due to operator precedence");
        }
        
        System.out.println("Error 5: if (a > b || b > c && a < c) // Unexpected precedence");
        System.out.println("Values: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Correct version with explicit parentheses: if ((a > b || b > c) && a < c)");
        System.out.println();
        
        // Example 5: Off-by-one errors in comparisons
        System.out.println("Example 5: Off-by-one errors in comparisons");
        int score = 70;
        
        // Error 6: Incorrect boundary conditions
        if (score > 70) {
            System.out.println("Score is above 70"); // Won't execute when score is exactly 70
        }
        
        System.out.println("Current score: " + score);
        System.out.println("Error 6: if (score > 70) // Excludes the value 70");
        System.out.println("Correct version if 70 should be included: if (score >= 70)");
        System.out.println();
        
        // Example 6: String comparison errors
        System.out.println("Example 6: String comparison errors");
        String name1 = "John";
        String name2 = new String("John");
        
        // Error 7: Using == for string content comparison
        if (name1 == name2) {
            System.out.println("Names are the same (using ==)"); // Won't execute
        }
        
        System.out.println("Error 7: if (name1 == name2) // Compares references, not content");
        System.out.println("Correct version: if (name1.equals(name2)) // Compares string content");
        
        if (name1.equals(name2)) {
            System.out.println("Names are the same (using equals)"); // Will execute
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Common Errors with if Statements and Boolean Expressions ---");
        System.out.println("1. Use == for comparison, not = (assignment) in conditions");
        System.out.println("2. Understand the difference between && (AND) and || (OR) operators");
        System.out.println("3. Use boolean variables directly without comparing to true/false");
        System.out.println("4. Be aware of operator precedence and use parentheses when needed");
        System.out.println("5. Be careful with boundary conditions (> vs >=, < vs <=)");
        System.out.println("6. Use equals() method for string content comparison, not ==");
    }
}
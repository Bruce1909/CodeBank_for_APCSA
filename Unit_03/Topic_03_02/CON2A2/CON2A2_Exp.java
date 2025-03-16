/**
 * CON2A2_Exp.java
 * 
 * This program demonstrates how if statements affect the flow of control based on Boolean expressions.
 * Knowledge Point: CON-2.A.2 - if statements affect the flow of control by executing different statements
 * based on the value of a Boolean expression.
 */
public class CON2A2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how if statements affect flow of control based on Boolean expressions:\n");
        
        // Example 1: Simple Boolean variable
        System.out.println("Example 1: Simple Boolean variable");
        boolean isRaining = true;
        
        System.out.println("Before if statement");
        if (isRaining) {
            System.out.println("It is raining - bring an umbrella");
        }
        System.out.println("After if statement");
        System.out.println();
        
        // Example 2: Boolean expression with comparison operator
        System.out.println("Example 2: Boolean expression with comparison operator");
        int temperature = 85;
        
        System.out.println("Temperature is " + temperature + " degrees");
        if (temperature > 80) {
            System.out.println("It's hot outside - wear light clothing");
        }
        System.out.println();
        
        // Example 3: Boolean expression with logical operators
        System.out.println("Example 3: Boolean expression with logical operators");
        boolean isSunny = true;
        boolean isWeekend = false;
        
        System.out.println("Is it sunny? " + isSunny);
        System.out.println("Is it the weekend? " + isWeekend);
        
        // Using AND operator (&&)
        if (isSunny && isWeekend) {
            System.out.println("Perfect day for a picnic!"); // This won't execute
        }
        
        // Using OR operator (||)
        if (isSunny || isWeekend) {
            System.out.println("At least one condition is true - it's sunny but not the weekend");
        }
        System.out.println();
        
        // Example 4: Complex Boolean expressions
        System.out.println("Example 4: Complex Boolean expressions");
        int age = 25;
        boolean hasLicense = true;
        
        System.out.println("Age: " + age);
        System.out.println("Has license? " + hasLicense);
        
        if ((age >= 16 && hasLicense) || age >= 21) {
            System.out.println("Person can legally drive");
        }
        
        // Using NOT operator (!)
        if (!hasLicense) {
            System.out.println("Person does not have a license"); // This won't execute
        }
        System.out.println();
        
        // Example 5: Boolean expressions with method calls
        System.out.println("Example 5: Boolean expressions with method calls");
        String password = "secure123";
        
        if (isValidPassword(password)) {
            System.out.println("Password meets security requirements");
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about if Statements and Boolean Expressions ---");
        System.out.println("1. if statements execute their body only when the Boolean expression evaluates to true");
        System.out.println("2. Boolean expressions can be simple variables or complex conditions");
        System.out.println("3. Comparison operators (>, <, >=, <=, ==, !=) produce Boolean results");
        System.out.println("4. Logical operators (&&, ||, !) combine or negate Boolean expressions");
        System.out.println("5. Method calls that return boolean values can be used in if conditions");
    }
    
    // Helper method for Example 5
    private static boolean isValidPassword(String password) {
        // Simple validation: password must be at least 8 characters
        return password != null && password.length() >= 8;
    }
}
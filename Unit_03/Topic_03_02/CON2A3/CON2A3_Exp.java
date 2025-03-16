/**
 * CON2A3_Exp.java
 * 
 * This program demonstrates one-way selection using if statements.
 * Knowledge Point: CON-2.A.3 - A one-way selection (if statement) is written when there is a set of statements
 * to execute under a certain condition. In this case, the body is executed only when the Boolean condition is true.
 */
public class CON2A3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating one-way selection using if statements:\n");
        
        // Example 1: Basic one-way selection
        System.out.println("Example 1: Basic one-way selection");
        int temperature = 32;
        
        System.out.println("Temperature is " + temperature + " degrees");
        if (temperature <= 32) {
            System.out.println("Warning: Freezing temperature detected!");
            System.out.println("Take precautions against ice and frost.");
        }
        System.out.println("Temperature check complete.");
        System.out.println();
        
        // Example 2: One-way selection with a method call in the condition
        System.out.println("Example 2: One-way selection with a method call in the condition");
        String password = "weak";
        
        System.out.println("Checking password strength...");
        if (isWeakPassword(password)) {
            System.out.println("Security alert: Your password is too weak.");
            System.out.println("Please consider using a stronger password.");
        }
        System.out.println("Password check complete.");
        System.out.println();
        
        // Example 3: One-way selection with compound condition
        System.out.println("Example 3: One-way selection with compound condition");
        int age = 17;
        boolean hasParentalConsent = true;
        
        System.out.println("Age: " + age);
        System.out.println("Has parental consent: " + hasParentalConsent);
        
        if (age < 18 && hasParentalConsent) {
            System.out.println("Minor with parental consent - special handling required.");
            System.out.println("Please prepare the consent documentation.");
        }
        System.out.println("Age verification complete.");
        System.out.println();
        
        // Example 4: One-way selection with boolean variable
        System.out.println("Example 4: One-way selection with boolean variable");
        boolean isHoliday = true;
        
        System.out.println("Is today a holiday? " + isHoliday);
        if (isHoliday) {
            System.out.println("Happy Holiday!");
            System.out.println("The office is closed today.");
        }
        System.out.println("Schedule check complete.");
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about One-Way Selection ---");
        System.out.println("1. One-way selection uses a single 'if' statement without an 'else' clause");
        System.out.println("2. The code in the if block executes only when the condition is true");
        System.out.println("3. When the condition is false, the if block is skipped entirely");
        System.out.println("4. After the if block, execution continues with the next statement");
        System.out.println("5. One-way selection is useful when you only need to take action in one specific case");
    }
    
    // Helper method for Example 2
    private static boolean isWeakPassword(String password) {
        // Simple check: password is weak if length < 8
        return password == null || password.length() < 8;
    }
}
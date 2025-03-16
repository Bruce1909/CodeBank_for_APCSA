/**
 * CON2C5_Exp.java
 * 
 * This program demonstrates how executing a return statement inside an iteration statement
 * will halt the loop and exit the method or constructor.
 * Knowledge Point: CON-2.C.5 - Executing a return statement inside an iteration statement 
 * will halt the loop and exit the method or constructor.
 */
public class CON2C5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how return statements affect loops:\n");
        
        // Example 1: Basic return from a loop
        System.out.println("Example 1: Basic return from a loop");
        int result = findFirstMultipleOfSeven(1, 50);
        System.out.println("The first multiple of 7 between 1 and 50 is: " + result);
        System.out.println();
        
        // Example 2: Return from nested loops
        System.out.println("Example 2: Return from nested loops");
        int[] numbers = {4, 8, 15, 16, 23, 42};
        boolean found = containsValue(numbers, 23);
        System.out.println("Array contains 23: " + found);
        
        found = containsValue(numbers, 99);
        System.out.println("Array contains 99: " + found);
        System.out.println();
        
        // Example 3: Return different values based on conditions
        System.out.println("Example 3: Return different values based on conditions");
        String password = "Secure123";
        String validationResult = validatePassword(password);
        System.out.println("Password validation result: " + validationResult);
        
        password = "weak";
        validationResult = validatePassword(password);
        System.out.println("Password validation result: " + validationResult);
        System.out.println();
        
        // Example 4: Early return for optimization
        System.out.println("Example 4: Early return for optimization");
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
        int sum = sumUntilThreshold(primes, 20);
        System.out.println("Sum until threshold: " + sum);
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Return Statements in Loops ---");
        System.out.println("1. A return statement immediately exits the entire method, not just the loop");
        System.out.println("2. This is different from break, which only exits the current loop");
        System.out.println("3. Return statements can provide early termination for efficiency");
        System.out.println("4. Return statements can be used to indicate when a specific condition is met");
        System.out.println("5. When a return executes, any remaining loop iterations are skipped");
    }
    
    /**
     * Finds the first multiple of 7 in the given range.
     * Demonstrates returning from a loop when a condition is met.
     */
    private static int findFirstMultipleOfSeven(int start, int end) {
        System.out.println("Searching for the first multiple of 7 between " + start + " and " + end);
        
        int current = start;
        while (current <= end) {
            System.out.println("Checking " + current);
            
            if (current % 7 == 0) {
                System.out.println("Found multiple of 7: " + current);
                return current; // Immediately exits the loop and the method
            }
            
            current++;
        }
        
        // This code only executes if no multiple of 7 is found
        System.out.println("No multiple of 7 found in the range");
        return -1;
    }
    
    /**
     * Checks if an array contains a specific value.
     * Demonstrates returning from a loop when a value is found.
     */
    private static boolean containsValue(int[] array, int target) {
        System.out.println("Searching for " + target + " in array");
        
        int index = 0;
        while (index < array.length) {
            System.out.println("Checking index " + index + ": " + array[index]);
            
            if (array[index] == target) {
                System.out.println("Found " + target + " at index " + index);
                return true; // Immediately exits the loop and returns true
            }
            
            index++;
        }
        
        // This code only executes if the target is not found
        System.out.println("Did not find " + target + " in the array");
        return false;
    }
    
    /**
     * Validates a password against multiple criteria.
     * Demonstrates returning different values from a loop based on conditions.
     */
    private static String validatePassword(String password) {
        System.out.println("Validating password: " + password);
        
        // Check minimum length
        if (password.length() < 8) {
            return "Password too short"; // Early return for failed validation
        }
        
        // Check for various character types
        boolean hasUppercase = false;
        boolean hasDigit = false;
        
        int i = 0;
        while (i < password.length()) {
            char c = password.charAt(i);
            System.out.println("Checking character: " + c);
            
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            
            // If we've found both requirements, return early
            if (hasUppercase && hasDigit) {
                return "Password valid"; // Early return when all criteria are met
            }
            
            i++;
        }
        
        // This code executes if we've checked all characters but didn't meet all criteria
        if (!hasUppercase) {
            return "Password needs an uppercase letter";
        }
        
        if (!hasDigit) {
            return "Password needs a digit";
        }
        
        return "Password valid"; // This line should never execute in this implementation
    }
    
    /**
     * Sums array elements until a threshold is reached.
     * Demonstrates using return for optimization to avoid unnecessary calculations.
     */
    private static int sumUntilThreshold(int[] array, int threshold) {
        System.out.println("Summing array elements until threshold " + threshold + " is reached");
        
        int sum = 0;
        int i = 0;
        
        while (i < array.length) {
            System.out.println("Current sum: " + sum + ", Adding: " + array[i]);
            sum += array[i];
            
            if (sum >= threshold) {
                System.out.println("Threshold reached! Sum: " + sum);
                return sum; // Return early once threshold is reached
            }
            
            i++;
        }
        
        System.out.println("Processed all elements without reaching threshold");
        return sum;
    }
}
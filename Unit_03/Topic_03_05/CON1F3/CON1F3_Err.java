/**
 * CON1F3_Err.java
 * 
 * This program demonstrates common errors related to short-circuit evaluation of logical operators.
 * Knowledge Point: CON-1.F.3 - When the result of a logical expression using && or || can be determined
 * by evaluating only the first Boolean operand, the second is not evaluated. This is known as short-circuited evaluation.
 */
public class CON1F3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Short-Circuit Evaluation:\n");
        
        // Example 1: Confusing short-circuit operators with non-short-circuit operators
        System.out.println("Example 1: Confusing short-circuit operators with non-short-circuit operators");
        
        int x = 10;
        
        // Error 1: Using & instead of && when short-circuit behavior is needed
        System.out.println("Error 1: Using & instead of && when short-circuit behavior is needed");
        
        // This would cause a NullPointerException if executed
        String str = null;
        // boolean result1 = (str != null) & (str.length() > 0);  // Error: NullPointerException
        System.out.println("boolean result1 = (str != null) & (str.length() > 0); // NullPointerException");
        System.out.println("The & operator evaluates both sides, causing NullPointerException");
        
        // Correct approach using &&
        boolean result2 = (str != null) && (str.length() > 0);  // Safe: short-circuit prevents NullPointerException
        System.out.println("boolean result2 = (str != null) && (str.length() > 0); // Safe with short-circuit");
        System.out.println("Result: " + result2);
        System.out.println();
        
        // Example 2: Relying on side effects in short-circuited expressions
        System.out.println("Example 2: Relying on side effects in short-circuited expressions");
        
        // Error 2: Relying on side effects that might not execute
        int count = 0;
        
        // The increment might not happen due to short-circuit evaluation
        boolean result3 = false && (++count > 0);
        System.out.println("boolean result3 = false && (++count > 0); // Side effect doesn't occur");
        System.out.println("count after expression: " + count + " (not incremented due to short-circuit)");
        
        // Using | to ensure the side effect happens
        boolean result4 = false | (++count > 0);
        System.out.println("boolean result4 = false | (++count > 0); // Side effect occurs");
        System.out.println("count after expression: " + count + " (incremented because | evaluates both sides)");
        System.out.println();
        
        // Example 3: Incorrect order in short-circuit expressions
        System.out.println("Example 3: Incorrect order in short-circuit expressions");
        
        // Error 3: Putting the potential error condition second in &&
        int divisor = 0;
        
        // This would cause ArithmeticException if executed
        // boolean result5 = true && (10 / divisor > 0);  // Error: ArithmeticException
        System.out.println("Error 3: boolean result5 = true && (10 / divisor > 0); // ArithmeticException");
        System.out.println("The first condition is true, so the second is evaluated, causing division by zero");
        
        // Correct approach: check for zero first
        boolean result6 = (divisor != 0) && (10 / divisor > 0);
        System.out.println("boolean result6 = (divisor != 0) && (10 / divisor > 0); // Safe with correct order");
        System.out.println("Result: " + result6);
        System.out.println();
        
        // Example 4: Misunderstanding short-circuit behavior in complex expressions
        System.out.println("Example 4: Misunderstanding short-circuit behavior in complex expressions");
        
        // Error 4: Assuming all parts of a complex expression are evaluated
        boolean condition1 = false;
        boolean condition2 = true;
        boolean condition3 = true;
        
        boolean result7 = condition1 && condition2 && condition3;
        System.out.println("boolean result7 = condition1 && condition2 && condition3; // Only condition1 is evaluated");
        System.out.println("Result: " + result7);
        System.out.println("Since condition1 is false, condition2 and condition3 are not evaluated");
        
        boolean result8 = condition1 || condition2 || condition3;
        System.out.println("\nboolean result8 = condition1 || condition2 || condition3; // condition1 and condition2 are evaluated");
        System.out.println("Result: " + result8);
        System.out.println("Since condition2 is true, condition3 is not evaluated");
        System.out.println();
        
        // Example 5: Forgetting that method calls might not execute
        System.out.println("Example 5: Forgetting that method calls might not execute");
        
        // Error 5: Assuming all method calls in an expression will execute
        System.out.println("Error 5: Assuming all method calls in an expression will execute");
        
        boolean result9 = false && methodWithSideEffect();
        System.out.println("boolean result9 = false && methodWithSideEffect(); // Method is not called");
        System.out.println("Notice that the side effect message was not printed");
        
        boolean result10 = true || methodWithSideEffect();
        System.out.println("\nboolean result10 = true || methodWithSideEffect(); // Method is not called");
        System.out.println("Notice that the side effect message was not printed");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Short-Circuit Evaluation Errors ---");
        System.out.println("1. Don't confuse short-circuit operators (&&, ||) with non-short-circuit operators (&, |)");
        System.out.println("2. Don't rely on side effects in expressions that might be short-circuited");
        System.out.println("3. Put potential error conditions first in && expressions to avoid exceptions");
        System.out.println("4. Remember that in complex expressions, evaluation stops as soon as the result is determined");
        System.out.println("5. Be aware that method calls in short-circuited expressions might not execute");
    }
    
    // Helper method with a side effect
    public static boolean methodWithSideEffect() {
        System.out.println("SIDE EFFECT: This method was called!");
        return true;
    }
}
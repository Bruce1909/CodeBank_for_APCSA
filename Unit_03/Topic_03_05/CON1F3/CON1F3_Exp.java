/**
 * CON1F3_Exp.java
 * 
 * This program demonstrates short-circuit evaluation of logical operators in Java.
 * Knowledge Point: CON-1.F.3 - When the result of a logical expression using && or || can be determined
 * by evaluating only the first Boolean operand, the second is not evaluated. This is known as short-circuited evaluation.
 */
public class CON1F3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Short-Circuit Evaluation of Logical Operators:\n");
        
        // Example 1: Short-circuit evaluation with && operator
        System.out.println("Example 1: Short-circuit evaluation with && operator");
        
        System.out.println("Case 1: When first operand is false, second operand is not evaluated");
        boolean result1 = evaluateFalse() && evaluateWithSideEffect();
        System.out.println("false && evaluateWithSideEffect() = " + result1);
        System.out.println("Notice that the side effect message was not printed because the second operand was not evaluated");
        System.out.println();
        
        System.out.println("Case 2: When first operand is true, second operand must be evaluated");
        boolean result2 = evaluateTrue() && evaluateWithSideEffect();
        System.out.println("true && evaluateWithSideEffect() = " + result2);
        System.out.println("Notice that the side effect message was printed because the second operand was evaluated");
        System.out.println();
        
        // Example 2: Short-circuit evaluation with || operator
        System.out.println("Example 2: Short-circuit evaluation with || operator");
        
        System.out.println("Case 1: When first operand is true, second operand is not evaluated");
        boolean result3 = evaluateTrue() || evaluateWithSideEffect();
        System.out.println("true || evaluateWithSideEffect() = " + result3);
        System.out.println("Notice that the side effect message was not printed because the second operand was not evaluated");
        System.out.println();
        
        System.out.println("Case 2: When first operand is false, second operand must be evaluated");
        boolean result4 = evaluateFalse() || evaluateWithSideEffect();
        System.out.println("false || evaluateWithSideEffect() = " + result4);
        System.out.println("Notice that the side effect message was printed because the second operand was evaluated");
        System.out.println();
        
        // Example 3: Practical use of short-circuit evaluation to avoid errors
        System.out.println("Example 3: Practical use of short-circuit evaluation to avoid errors");
        
        String str = null;
        
        // Using short-circuit to avoid NullPointerException
        System.out.println("Using short-circuit to avoid NullPointerException:");
        if (str != null && str.length() > 5) {
            System.out.println("String is not null and has more than 5 characters");
        } else {
            System.out.println("String is either null or has 5 or fewer characters");
        }
        
        // Without short-circuit, this would cause a NullPointerException
        System.out.println("\nIf we had written: if (str.length() > 5 && str != null)");
        System.out.println("It would have caused a NullPointerException because str is null");
        System.out.println();
        
        // Example 4: Short-circuit evaluation in complex expressions
        System.out.println("Example 4: Short-circuit evaluation in complex expressions");
        
        int divisor = 0;
        
        // Using short-circuit to avoid division by zero
        boolean result5 = (divisor != 0) && (10 / divisor > 5);
        System.out.println("(divisor != 0) && (10 / divisor > 5) = " + result5);
        System.out.println("No ArithmeticException occurred because the second operand was not evaluated");
        
        // Using short-circuit in a more complex expression
        boolean result6 = evaluateFalse() && evaluateTrue() && evaluateWithSideEffect();
        System.out.println("\nevaluateFalse() && evaluateTrue() && evaluateWithSideEffect() = " + result6);
        System.out.println("Notice that the side effect message was not printed because evaluation stopped at the first false");
        System.out.println();
        
        // Example 5: Comparison with non-short-circuit operators
        System.out.println("Example 5: Comparison with non-short-circuit operators");
        
        System.out.println("Using non-short-circuit bitwise operators & and |:");
        System.out.println("These operators always evaluate both operands");
        
        System.out.println("\nCase 1: Using & (bitwise AND)");
        // This will evaluate both operands, even though the first is false
        boolean result7 = evaluateFalse() & evaluateWithSideEffect();
        System.out.println("evaluateFalse() & evaluateWithSideEffect() = " + result7);
        System.out.println("Notice that the side effect message was printed even though the first operand was false");
        
        System.out.println("\nCase 2: Using | (bitwise OR)");
        // This will evaluate both operands, even though the first is true
        boolean result8 = evaluateTrue() | evaluateWithSideEffect();
        System.out.println("evaluateTrue() | evaluateWithSideEffect() = " + result8);
        System.out.println("Notice that the side effect message was printed even though the first operand was true");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Short-Circuit Evaluation ---");
        System.out.println("1. When the result of a logical expression using && or || can be determined by evaluating only");
        System.out.println("   the first Boolean operand, the second is not evaluated (CON-1.F.3)");
        System.out.println("2. For &&, if the first operand is false, the result is false regardless of the second operand");
        System.out.println("3. For ||, if the first operand is true, the result is true regardless of the second operand");
        System.out.println("4. Short-circuit evaluation can be used to avoid errors like NullPointerException or division by zero");
        System.out.println("5. Bitwise operators & and | always evaluate both operands (no short-circuit)");
    }
    
    // Helper methods to demonstrate short-circuit evaluation
    
    // Always returns false
    public static boolean evaluateFalse() {
        System.out.println("Evaluating false...");
        return false;
    }
    
    // Always returns true
    public static boolean evaluateTrue() {
        System.out.println("Evaluating true...");
        return true;
    }
    
    // Returns true but also prints a side effect message
    public static boolean evaluateWithSideEffect() {
        System.out.println("SIDE EFFECT: This method was evaluated!");
        return true;
    }
}
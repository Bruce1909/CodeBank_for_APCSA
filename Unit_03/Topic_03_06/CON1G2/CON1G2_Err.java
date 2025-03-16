/**
 * CON1G2_Err.java
 * 
 * This program demonstrates common errors when using truth tables to prove Boolean identities.
 * Knowledge Point: CON-1.G.2 - Truth tables can be used to prove Boolean identities.
 */
public class CON1G2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Truth Tables for Boolean Identities:\n");
        
        // Example 1: Incomplete truth table (missing combinations)
        System.out.println("Example 1: Incomplete truth table (missing combinations)");
        System.out.println("Error: Only testing some input combinations instead of all possible combinations");
        
        boolean a = true;
        boolean b = true;
        
        // Testing only when both variables are true
        boolean expr1 = a && b;
        boolean expr2 = a || b;
        
        System.out.println("When a = " + a + " and b = " + b + ":");
        System.out.println("a && b = " + expr1);
        System.out.println("a || b = " + expr2);
        System.out.println("Are they equivalent? " + (expr1 == expr2));
        System.out.println("Error: This single test case suggests they might be equivalent, but a complete truth table would show they are not");
        System.out.println();
        
        // Example 2: Incorrect conclusion from truth table
        System.out.println("Example 2: Incorrect conclusion from truth table");
        System.out.println("A\tB\tA && B\tA || B\tEquivalent?");
        System.out.println("------------------------------------------");
        
        // Complete truth table for A && B vs A || B
        displayRow(true, true, true && true, true || true);
        displayRow(true, false, true && false, true || false);
        displayRow(false, true, false && true, false || true);
        displayRow(false, false, false && false, false || false);
        
        System.out.println("Error: Incorrectly concluding that A && B and A || B are equivalent");
        System.out.println("The truth table clearly shows they are different for 3 out of 4 cases");
        System.out.println();
        
        // Example 3: Computational errors in truth table
        System.out.println("Example 3: Computational errors in truth table");
        System.out.println("A\tB\tA && B\tA || B\tA && !B\tIncorrect Result\tCorrect Result");
        System.out.println("-------------------------------------------------------------------------");
        
        // Row with computational error
        boolean aVal = true;
        boolean bVal = false;
        boolean correctResult = (aVal && bVal) || (aVal && !bVal);  // Correct: (A && B) || (A && !B) = A
        boolean incorrectResult = aVal && bVal;                     // Incorrect computation
        
        System.out.println(aVal + "\t" + bVal + "\t" + (aVal && bVal) + "\t\t" + (aVal || bVal) + "\t\t" + 
                           (aVal && !bVal) + "\t\t" + incorrectResult + "\t\t\t" + correctResult);
        
        System.out.println("Error: Computational mistake in evaluating (A && B) || (A && !B)");
        System.out.println("The correct result should be " + correctResult + ", not " + incorrectResult);
        System.out.println();
        
        // Example 4: Misinterpreting operator precedence
        System.out.println("Example 4: Misinterpreting operator precedence");
        
        // Expression: A || B && C
        // Error: Assuming A || (B && C) instead of (A || B) && C
        System.out.println("Expression: A || B && C");
        System.out.println("Error: Incorrectly evaluating as A || (B && C) instead of (A || B) && C");
        
        boolean c = true;
        boolean incorrectEvaluation = a || (b && c);  // Incorrect: A || (B && C)
        boolean correctEvaluation = (a || b) && c;    // Correct: (A || B) && C
        
        System.out.println("When a = " + a + ", b = " + b + ", and c = " + c + ":");
        System.out.println("Incorrect evaluation (A || (B && C)): " + incorrectEvaluation);
        System.out.println("Correct evaluation ((A || B) && C): " + correctEvaluation);
        System.out.println("Note: In Java, && has higher precedence than ||, so A || B && C is interpreted as A || (B && C)");
        System.out.println();
        
        // Example 5: Confusing logical equivalence with equality
        System.out.println("Example 5: Confusing logical equivalence with equality");
        
        // Error: Using == to check if two expressions are logically equivalent
        System.out.println("Error: Using == to check if two Boolean expressions are logically equivalent");
        System.out.println("Logical equivalence means two expressions have the same truth table,");
        System.out.println("not that they are the same expression or have the same value for a specific input");
        
        boolean p = true;
        boolean q = true;
        
        boolean expr3 = p && q;      // Expression 1: P && Q
        boolean expr4 = p;           // Expression 2: P
        
        System.out.println("When p = " + p + " and q = " + q + ":");
        System.out.println("p && q = " + expr3);
        System.out.println("p = " + expr4);
        System.out.println("Are they equal for this input? " + (expr3 == expr4));
        System.out.println("Error: Concluding they are logically equivalent based on a single test case");
        System.out.println("A complete truth table would show they are not equivalent for all inputs");
        System.out.println();
        
        // Summary of common errors
        System.out.println("--- Common Errors When Using Truth Tables ---");
        System.out.println("1. Not including all possible combinations of input values");
        System.out.println("2. Drawing incorrect conclusions from the truth table results");
        System.out.println("3. Making computational errors when evaluating expressions");
        System.out.println("4. Misinterpreting operator precedence in complex expressions");
        System.out.println("5. Confusing logical equivalence with equality for specific inputs");
        System.out.println("6. Remember: Two expressions are logically equivalent only if they produce");
        System.out.println("   the same output for ALL possible input combinations");
    }
    
    // Helper method to display a row in the truth table
    private static void displayRow(boolean a, boolean b, boolean expr1, boolean expr2) {
        boolean equivalent = (expr1 == expr2);
        System.out.println(a + "\t" + b + "\t" + expr1 + "\t\t" + expr2 + "\t\t" + equivalent);
    }
}
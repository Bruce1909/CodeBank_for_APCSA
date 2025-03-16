/**
 * CON1G3_Err.java
 * 
 * This program demonstrates common errors when working with equivalent Boolean expressions.
 * Knowledge Point: CON-1.G.3 - Equivalent Boolean expressions will evaluate to the same value in all cases.
 */
public class CON1G3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Equivalent Boolean Expressions:\n");
        
        // Example 1: Mistaking similar expressions for equivalent expressions
        System.out.println("Example 1: Mistaking similar expressions for equivalent expressions");
        boolean a = true;
        boolean b = false;
        
        // Error 1: Assuming A && B is equivalent to B && A (which is true)
        // but then incorrectly extending this to A && B is equivalent to A || B (which is false)
        boolean expr1 = a && b;      // A && B
        boolean expr2 = b && a;      // B && A (commutative property applies - these are equivalent)
        boolean expr3 = a || b;      // A || B (not equivalent to A && B)
        
        System.out.println("When a = " + a + " and b = " + b + ":");
        System.out.println("a && b = " + expr1);
        System.out.println("b && a = " + expr2);
        System.out.println("a || b = " + expr3);
        System.out.println("Is a && b equivalent to b && a? " + (expr1 == expr2) + " (Correct: they are equivalent)");
        System.out.println("Is a && b equivalent to a || b? " + (expr1 == expr3) + " (Correct: they are NOT equivalent)");
        System.out.println("Error: Assuming all operations are commutative and associative in the same way");
        System.out.println();
        
        // Example 2: Partial testing leading to incorrect conclusions
        System.out.println("Example 2: Partial testing leading to incorrect conclusions");
        
        // Error 2: Testing equivalence with only some values
        boolean c = true;
        
        // These expressions are only equivalent when c is true
        boolean expr4 = c && (a || b);     // C && (A || B)
        boolean expr5 = (c && a) || b;     // (C && A) || B
        
        System.out.println("When a = " + a + ", b = " + b + ", and c = " + c + ":");
        System.out.println("c && (a || b) = " + expr4);
        System.out.println("(c && a) || b = " + expr5);
        System.out.println("Are they equivalent for these values? " + (expr4 == expr5));
        System.out.println("Error: Concluding equivalence based on limited test cases");
        
        // Let's change c to false to show they're not equivalent
        c = false;
        expr4 = c && (a || b);     // C && (A || B)
        expr5 = (c && a) || b;     // (C && A) || B
        
        System.out.println("\nWhen a = " + a + ", b = " + b + ", and c = " + c + ":");
        System.out.println("c && (a || b) = " + expr4);
        System.out.println("(c && a) || b = " + expr5);
        System.out.println("Are they equivalent for these values? " + (expr4 == expr5));
        System.out.println("Correct conclusion: These expressions are NOT equivalent in all cases");
        System.out.println();
        
        // Example 3: Misapplying transformation rules
        System.out.println("Example 3: Misapplying transformation rules");
        
        // Error 3: Incorrectly applying De Morgan's Laws
        boolean expr6 = !(a || b || c);        // Correct expression
        boolean expr7 = !a && !b && !c;        // Correct transformation using De Morgan's Law
        boolean expr8 = !a || !b || !c;        // Incorrect transformation
        
        System.out.println("When a = " + a + ", b = " + b + ", and c = " + true + ":");
        System.out.println("!(a || b || c) = " + expr6);
        System.out.println("!a && !b && !c = " + expr7 + " (Correct transformation)");
        System.out.println("!a || !b || !c = " + expr8 + " (Incorrect transformation)");
        System.out.println("Is the correct transformation equivalent? " + (expr6 == expr7));
        System.out.println("Is the incorrect transformation equivalent? " + (expr6 == expr8));
        System.out.println("Error: Incorrectly changing AND to OR when applying De Morgan's Law");
        System.out.println();
        
        // Example 4: Confusing implication with equivalence
        System.out.println("Example 4: Confusing implication with equivalence");
        
        // Error 4: Assuming A implies B means A is equivalent to B
        int age = 25;
        
        // These are implications, not equivalences
        boolean isAdult = age >= 18;                // Being 18 or older implies being an adult
        boolean canVote = age >= 18;                // Being 18 or older implies ability to vote
        boolean canDrink = age >= 21;               // Being 21 or older implies ability to drink (in US)
        
        System.out.println("When age = " + age + ":");
        System.out.println("isAdult = " + isAdult);
        System.out.println("canVote = " + canVote);
        System.out.println("canDrink = " + canDrink);
        System.out.println("Is isAdult equivalent to canVote? " + (isAdult == canVote) + " (for this age value)");
        System.out.println("Is isAdult equivalent to canDrink? " + (isAdult == canDrink) + " (for this age value)");
        System.out.println("Error: Just because two expressions have the same value for some inputs");
        System.out.println("doesn't mean they are equivalent for all possible inputs");
        System.out.println();
        
        // Example 5: Misunderstanding short-circuit evaluation
        System.out.println("Example 5: Misunderstanding short-circuit evaluation");
        
        // Error 5: Assuming expressions with side effects are equivalent
        int counter1 = 0;
        int counter2 = 0;
        
        // These expressions have different behaviors due to short-circuit evaluation
        boolean expr9 = (a || (++counter1 > 0));    // Short-circuits when a is true
        boolean expr10 = ((++counter2 > 0) || a);   // Evaluates first part regardless
        
        System.out.println("When a = " + a + ":");
        System.out.println("(a || (++counter1 > 0)) = " + expr9 + ", counter1 = " + counter1);
        System.out.println("((++counter2 > 0) || a) = " + expr10 + ", counter2 = " + counter2);
        System.out.println("Do they have the same boolean result? " + (expr9 == expr10));
        System.out.println("Do they have the same side effects? " + (counter1 == counter2));
        System.out.println("Error: Expressions with side effects may not be truly equivalent");
        System.out.println("even if they evaluate to the same boolean result");
        System.out.println();
        
        // Summary of common errors
        System.out.println("--- Common Errors with Equivalent Boolean Expressions ---");
        System.out.println("1. Mistaking similar expressions for equivalent expressions");
        System.out.println("2. Drawing conclusions about equivalence from limited test cases");
        System.out.println("3. Misapplying transformation rules like De Morgan's Laws");
        System.out.println("4. Confusing implication with equivalence");
        System.out.println("5. Ignoring side effects when comparing expressions");
        System.out.println("6. Remember: Equivalent expressions must evaluate to the same value");
        System.out.println("   for ALL possible input combinations");
    }
}
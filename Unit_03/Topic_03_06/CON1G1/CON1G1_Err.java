/**
 * CON1G1_Err.java
 * 
 * This program demonstrates common errors when applying De Morgan's Laws to Boolean expressions.
 * Knowledge Point: CON-1.G.1 - De Morgan's Laws can be applied to Boolean expressions.
 */
public class CON1G1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with De Morgan's Laws:\n");
        
        // Example 1: Incorrect application of De Morgan's First Law
        System.out.println("Example 1: Incorrect application of De Morgan's First Law");
        boolean a = true;
        boolean b = false;
        
        // Error 1: Forgetting to negate the variables
        // !(a && b) is NOT equivalent to a || b (missing negations)
        boolean correctTransformation = !a || !b;      // Correct: !(a && b) = !a || !b
        boolean incorrectTransformation = a || b;      // Incorrect: missing negations
        
        System.out.println("When a = " + a + " and b = " + b + ":");
        System.out.println("!(a && b) = " + !(a && b));
        System.out.println("Correct transformation (!a || !b) = " + correctTransformation);
        System.out.println("Incorrect transformation (a || b) = " + incorrectTransformation);
        System.out.println("Is the incorrect transformation equivalent? " + (!(a && b) == incorrectTransformation));
        System.out.println();
        
        // Example 2: Incorrect application of De Morgan's Second Law
        System.out.println("Example 2: Incorrect application of De Morgan's Second Law");
        
        // Error 2: Forgetting to change the operator
        // !(a || b) is NOT equivalent to !a || !b (wrong operator)
        boolean correctTransformation2 = !a && !b;      // Correct: !(a || b) = !a && !b
        boolean incorrectTransformation2 = !a || !b;    // Incorrect: wrong operator
        
        System.out.println("When a = " + a + " and b = " + b + ":");
        System.out.println("!(a || b) = " + !(a || b));
        System.out.println("Correct transformation (!a && !b) = " + correctTransformation2);
        System.out.println("Incorrect transformation (!a || !b) = " + incorrectTransformation2);
        System.out.println("Is the incorrect transformation equivalent? " + (!(a || b) == incorrectTransformation2));
        System.out.println();
        
        // Example 3: Incorrect application to complex expressions
        System.out.println("Example 3: Incorrect application to complex expressions");
        boolean c = true;
        
        // Error 3: Partial application of De Morgan's Laws
        // !((a && b) || c) is NOT equivalent to !(a && b) && !c (partial application)
        boolean correctTransformation3 = (!a || !b) && !c;  // Correct: !((a && b) || c) = (!a || !b) && !c
        boolean incorrectTransformation3 = !(a && b) && !c; // Incorrect: partial application
        
        System.out.println("When a = " + a + ", b = " + b + ", and c = " + c + ":");
        System.out.println("!((a && b) || c) = " + !((a && b) || c));
        System.out.println("Correct transformation ((!a || !b) && !c) = " + correctTransformation3);
        System.out.println("Incorrect transformation (!(a && b) && !c) = " + incorrectTransformation3);
        System.out.println("Is the incorrect transformation equivalent? " + (!((a && b) || c) == incorrectTransformation3));
        System.out.println();
        
        // Example 4: Incorrect application in conditional logic
        System.out.println("Example 4: Incorrect application in conditional logic");
        int age = 25;
        boolean hasLicense = true;
        
        // Error 4: Forgetting to negate the relational expression
        // !(age >= 18 && hasLicense) is NOT equivalent to age >= 18 || !hasLicense
        boolean correctTransformation4 = !(age >= 18) || !hasLicense;  // Correct
        boolean incorrectTransformation4 = age >= 18 || !hasLicense;   // Incorrect: missing negation
        
        System.out.println("Person: age = " + age + ", has license = " + hasLicense);
        System.out.println("!(age >= 18 && hasLicense) = " + !(age >= 18 && hasLicense));
        System.out.println("Correct transformation (!(age >= 18) || !hasLicense) = " + correctTransformation4);
        System.out.println("Incorrect transformation (age >= 18 || !hasLicense) = " + incorrectTransformation4);
        System.out.println("Is the incorrect transformation equivalent? " + (!(age >= 18 && hasLicense) == incorrectTransformation4));
        System.out.println();
        
        // Example 5: Incorrect application with parentheses
        System.out.println("Example 5: Incorrect application with parentheses");
        boolean d = false;
        
        // Error 5: Incorrect placement of parentheses
        // !(a && (b || c)) is NOT equivalent to !a || !(b || c)
        boolean correctTransformation5 = !a || (!b && !c);  // Correct: !(a && (b || c)) = !a || (!b && !c)
        boolean incorrectTransformation5 = !a || !(b || c); // Incorrect: wrong parentheses handling
        
        System.out.println("When a = " + a + ", b = " + b + ", and c = " + c + ":");
        System.out.println("!(a && (b || c)) = " + !(a && (b || c)));
        System.out.println("Correct transformation (!a || (!b && !c)) = " + correctTransformation5);
        System.out.println("Incorrect transformation (!a || !(b || c)) = " + incorrectTransformation5);
        System.out.println("Is the incorrect transformation equivalent? " + (!(a && (b || c)) == incorrectTransformation5));
        System.out.println();
        
        // Summary of common errors
        System.out.println("--- Common Errors When Applying De Morgan's Laws ---");
        System.out.println("1. Forgetting to negate the variables: !(a && b) ≠ a || b");
        System.out.println("2. Using the wrong operator: !(a || b) ≠ !a || !b");
        System.out.println("3. Applying the laws partially to complex expressions");
        System.out.println("4. Forgetting to negate relational expressions: !(x > y) = x <= y");
        System.out.println("5. Incorrect handling of parentheses in nested expressions");
        System.out.println("6. Remember: De Morgan's Laws state that:");
        System.out.println("   - !(A && B) = !A || !B");
        System.out.println("   - !(A || B) = !A && !B");
    }
}
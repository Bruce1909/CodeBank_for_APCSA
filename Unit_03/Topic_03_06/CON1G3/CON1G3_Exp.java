/**
 * CON1G3_Exp.java
 * 
 * This program demonstrates how equivalent Boolean expressions evaluate to the same value in all cases.
 * Knowledge Point: CON-1.G.3 - Equivalent Boolean expressions will evaluate to the same value in all cases.
 */
public class CON1G3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Equivalent Boolean Expressions:\n");
        
        // Example 1: Equivalent expressions using De Morgan's Laws
        System.out.println("Example 1: Equivalent expressions using De Morgan's Laws");
        System.out.println("A\tB\t!(A && B)\t!A || !B\tEquivalent?");
        System.out.println("--------------------------------------------------");
        verifyEquivalence1(true, true);
        verifyEquivalence1(true, false);
        verifyEquivalence1(false, true);
        verifyEquivalence1(false, false);
        System.out.println();
        
        // Example 2: Equivalent expressions using distributive property
        System.out.println("Example 2: Equivalent expressions using distributive property");
        System.out.println("A\tB\tC\tA && (B || C)\t(A && B) || (A && C)\tEquivalent?");
        System.out.println("------------------------------------------------------------------");
        verifyEquivalence2(true, true, true);
        verifyEquivalence2(true, true, false);
        verifyEquivalence2(true, false, true);
        verifyEquivalence2(true, false, false);
        verifyEquivalence2(false, true, true);
        verifyEquivalence2(false, true, false);
        verifyEquivalence2(false, false, true);
        verifyEquivalence2(false, false, false);
        System.out.println();
        
        // Example 3: Equivalent expressions using double negation
        System.out.println("Example 3: Equivalent expressions using double negation");
        System.out.println("A\t!!A\tEquivalent?");
        System.out.println("------------------------");
        verifyEquivalence3(true);
        verifyEquivalence3(false);
        System.out.println();
        
        // Example 4: Equivalent expressions using absorption laws
        System.out.println("Example 4: Equivalent expressions using absorption laws");
        System.out.println("A\tB\tA || (A && B)\tA\tEquivalent?");
        System.out.println("------------------------------------------");
        verifyEquivalence4(true, true);
        verifyEquivalence4(true, false);
        verifyEquivalence4(false, true);
        verifyEquivalence4(false, false);
        System.out.println();
        
        // Example 5: Equivalent expressions in conditional logic
        System.out.println("Example 5: Equivalent expressions in conditional logic");
        int x = 10;
        int y = 20;
        
        // Two equivalent ways to check if x is between 0 and y
        boolean expr1 = (x >= 0) && (x <= y);  // Standard way
        boolean expr2 = (0 <= x) && (x <= y);  // Equivalent expression
        
        System.out.println("When x = " + x + " and y = " + y + ":");
        System.out.println("(x >= 0) && (x <= y) = " + expr1);
        System.out.println("(0 <= x) && (x <= y) = " + expr2);
        System.out.println("Are they equivalent? " + (expr1 == expr2));
        System.out.println();
        
        // Example 6: Practical application with equivalent expressions
        System.out.println("Example 6: Practical application with equivalent expressions");
        boolean isWeekend = true;
        boolean isHoliday = false;
        
        // Two equivalent ways to check if it's a day off
        boolean expr3 = isWeekend || isHoliday;                  // Direct way
        boolean expr4 = !(!isWeekend && !isHoliday);             // Using De Morgan's Law
        
        System.out.println("When isWeekend = " + isWeekend + " and isHoliday = " + isHoliday + ":");
        System.out.println("isWeekend || isHoliday = " + expr3);
        System.out.println("!(!isWeekend && !isHoliday) = " + expr4);
        System.out.println("Are they equivalent? " + (expr3 == expr4));
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Equivalent Boolean Expressions ---");
        System.out.println("1. Equivalent Boolean expressions evaluate to the same value in all cases (CON-1.G.3)");
        System.out.println("2. Equivalence can be proven using truth tables");
        System.out.println("3. Common equivalences include:");
        System.out.println("   - De Morgan's Laws: !(A && B) = !A || !B and !(A || B) = !A && !B");
        System.out.println("   - Double negation: !!A = A");
        System.out.println("   - Distributive property: A && (B || C) = (A && B) || (A && C)");
        System.out.println("   - Absorption laws: A || (A && B) = A and A && (A || B) = A");
        System.out.println("4. Equivalent expressions can be used to simplify complex conditions");
        System.out.println("5. Choosing the right equivalent expression can make code more readable");
    }
    
    // Helper method to verify equivalence: !(A && B) = !A || !B
    private static void verifyEquivalence1(boolean a, boolean b) {
        boolean expr1 = !(a && b);    // Expression 1: !(A && B)
        boolean expr2 = !a || !b;     // Expression 2: !A || !B
        boolean equivalent = (expr1 == expr2);
        System.out.println(a + "\t" + b + "\t" + expr1 + "\t\t" + expr2 + "\t\t" + equivalent);
    }
    
    // Helper method to verify equivalence: A && (B || C) = (A && B) || (A && C)
    private static void verifyEquivalence2(boolean a, boolean b, boolean c) {
        boolean expr1 = a && (b || c);           // Expression 1: A && (B || C)
        boolean expr2 = (a && b) || (a && c);    // Expression 2: (A && B) || (A && C)
        boolean equivalent = (expr1 == expr2);
        System.out.println(a + "\t" + b + "\t" + c + "\t" + expr1 + "\t\t\t" + expr2 + "\t\t\t" + equivalent);
    }
    
    // Helper method to verify equivalence: !!A = A
    private static void verifyEquivalence3(boolean a) {
        boolean expr1 = !!a;    // Expression 1: !!A (double negation)
        boolean expr2 = a;      // Expression 2: A
        boolean equivalent = (expr1 == expr2);
        System.out.println(a + "\t" + expr1 + "\t" + equivalent);
    }
    
    // Helper method to verify equivalence: A || (A && B) = A
    private static void verifyEquivalence4(boolean a, boolean b) {
        boolean expr1 = a || (a && b);    // Expression 1: A || (A && B)
        boolean expr2 = a;                // Expression 2: A
        boolean equivalent = (expr1 == expr2);
        System.out.println(a + "\t" + b + "\t" + expr1 + "\t\t\t" + expr2 + "\t\t" + equivalent);
    }
}
/**
 * CON1G1_Exp.java
 * 
 * This program demonstrates how De Morgan's Laws can be applied to Boolean expressions.
 * Knowledge Point: CON-1.G.1 - De Morgan's Laws can be applied to Boolean expressions.
 */
public class CON1G1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating De Morgan's Laws for Boolean Expressions:\n");
        
        // Example 1: De Morgan's First Law - NOT (A AND B) = NOT A OR NOT B
        System.out.println("Example 1: De Morgan's First Law - NOT (A AND B) = NOT A OR NOT B");
        boolean a = true;
        boolean b = false;
        
        boolean leftSide1 = !(a && b);           // NOT (A AND B)
        boolean rightSide1 = !a || !b;           // NOT A OR NOT B
        
        System.out.println("When a = " + a + " and b = " + b + ":");
        System.out.println("!(a && b) = " + leftSide1);
        System.out.println("!a || !b = " + rightSide1);
        System.out.println("Are they equivalent? " + (leftSide1 == rightSide1));
        System.out.println();
        
        // Example 2: De Morgan's Second Law - NOT (A OR B) = NOT A AND NOT B
        System.out.println("Example 2: De Morgan's Second Law - NOT (A OR B) = NOT A AND NOT B");
        
        boolean leftSide2 = !(a || b);           // NOT (A OR B)
        boolean rightSide2 = !a && !b;           // NOT A AND NOT B
        
        System.out.println("When a = " + a + " and b = " + b + ":");
        System.out.println("!(a || b) = " + leftSide2);
        System.out.println("!a && !b = " + rightSide2);
        System.out.println("Are they equivalent? " + (leftSide2 == rightSide2));
        System.out.println();
        
        // Example 3: Verifying De Morgan's Laws with different values
        System.out.println("Example 3: Verifying De Morgan's Laws with different values");
        
        System.out.println("\nTesting De Morgan's First Law: !(A && B) = !A || !B");
        System.out.println("A\tB\t!(A && B)\t!A || !B\tEquivalent?");
        System.out.println("--------------------------------------------------");
        verifyDeMorgansFirstLaw(true, true);
        verifyDeMorgansFirstLaw(true, false);
        verifyDeMorgansFirstLaw(false, true);
        verifyDeMorgansFirstLaw(false, false);
        
        System.out.println("\nTesting De Morgan's Second Law: !(A || B) = !A && !B");
        System.out.println("A\tB\t!(A || B)\t!A && !B\tEquivalent?");
        System.out.println("--------------------------------------------------");
        verifyDeMorgansSecondLaw(true, true);
        verifyDeMorgansSecondLaw(true, false);
        verifyDeMorgansSecondLaw(false, true);
        verifyDeMorgansSecondLaw(false, false);
        System.out.println();
        
        // Example 4: Applying De Morgan's Laws to complex expressions
        System.out.println("Example 4: Applying De Morgan's Laws to complex expressions");
        boolean c = true;
        
        boolean complex1 = !((a && b) || c);      // NOT ((A AND B) OR C)
        boolean complex2 = (!a || !b) && !c;      // (NOT A OR NOT B) AND NOT C
        
        System.out.println("When a = " + a + ", b = " + b + ", and c = " + c + ":");
        System.out.println("!((a && b) || c) = " + complex1);
        System.out.println("(!a || !b) && !c = " + complex2);
        System.out.println("Are they equivalent? " + (complex1 == complex2));
        System.out.println();
        
        // Example 5: Practical application in conditional logic
        System.out.println("Example 5: Practical application in conditional logic");
        int age = 25;
        boolean hasLicense = true;
        
        // Original condition: NOT (age >= 18 AND hasLicense)
        boolean cannotDrive1 = !(age >= 18 && hasLicense);
        
        // Equivalent using De Morgan's Law: NOT age >= 18 OR NOT hasLicense
        boolean cannotDrive2 = !(age >= 18) || !hasLicense;
        
        System.out.println("Person: age = " + age + ", has license = " + hasLicense);
        System.out.println("!(age >= 18 && hasLicense) = " + cannotDrive1);
        System.out.println("!(age >= 18) || !hasLicense = " + cannotDrive2);
        System.out.println("Are they equivalent? " + (cannotDrive1 == cannotDrive2));
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about De Morgan's Laws ---");
        System.out.println("1. De Morgan's Laws can be applied to Boolean expressions (CON-1.G.1)");
        System.out.println("2. De Morgan's First Law: !(A && B) = !A || !B");
        System.out.println("3. De Morgan's Second Law: !(A || B) = !A && !B");
        System.out.println("4. These laws help simplify and transform complex Boolean expressions");
        System.out.println("5. De Morgan's Laws are useful for rewriting conditions in programming");
        System.out.println("6. The laws work for any Boolean values and can be verified with truth tables");
    }
    
    // Helper method to verify De Morgan's First Law
    private static void verifyDeMorgansFirstLaw(boolean a, boolean b) {
        boolean leftSide = !(a && b);
        boolean rightSide = !a || !b;
        boolean equivalent = (leftSide == rightSide);
        System.out.println(a + "\t" + b + "\t" + leftSide + "\t\t" + rightSide + "\t\t" + equivalent);
    }
    
    // Helper method to verify De Morgan's Second Law
    private static void verifyDeMorgansSecondLaw(boolean a, boolean b) {
        boolean leftSide = !(a || b);
        boolean rightSide = !a && !b;
        boolean equivalent = (leftSide == rightSide);
        System.out.println(a + "\t" + b + "\t" + leftSide + "\t\t" + rightSide + "\t\t" + equivalent);
    }
}
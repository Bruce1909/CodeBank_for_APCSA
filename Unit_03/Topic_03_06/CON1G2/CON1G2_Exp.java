/**
 * CON1G2_Exp.java
 * 
 * This program demonstrates how truth tables can be used to prove Boolean identities.
 * Knowledge Point: CON-1.G.2 - Truth tables can be used to prove Boolean identities.
 */
public class CON1G2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Truth Tables for Boolean Identities:\n");
        
        // Example 1: Using truth tables to prove the identity: A && (A || B) = A
        System.out.println("Example 1: Using truth tables to prove A && (A || B) = A");
        System.out.println("A\tB\tA || B\tA && (A || B)\tResult = A?");
        System.out.println("--------------------------------------------------");
        verifyIdentity1(true, true);
        verifyIdentity1(true, false);
        verifyIdentity1(false, true);
        verifyIdentity1(false, false);
        System.out.println();
        
        // Example 2: Using truth tables to prove the identity: A || (A && B) = A
        System.out.println("Example 2: Using truth tables to prove A || (A && B) = A");
        System.out.println("A\tB\tA && B\tA || (A && B)\tResult = A?");
        System.out.println("--------------------------------------------------");
        verifyIdentity2(true, true);
        verifyIdentity2(true, false);
        verifyIdentity2(false, true);
        verifyIdentity2(false, false);
        System.out.println();
        
        // Example 3: Using truth tables to prove the identity: (A && B) || (A && !B) = A
        System.out.println("Example 3: Using truth tables to prove (A && B) || (A && !B) = A");
        System.out.println("A\tB\t!B\tA && B\tA && !B\t(A && B) || (A && !B)\tResult = A?");
        System.out.println("-------------------------------------------------------------------------");
        verifyIdentity3(true, true);
        verifyIdentity3(true, false);
        verifyIdentity3(false, true);
        verifyIdentity3(false, false);
        System.out.println();
        
        // Example 4: Using truth tables to prove the distributive property: A && (B || C) = (A && B) || (A && C)
        System.out.println("Example 4: Using truth tables to prove A && (B || C) = (A && B) || (A && C)");
        System.out.println("A\tB\tC\tB || C\tA && (B || C)\tA && B\tA && C\t(A && B) || (A && C)\tEquivalent?");
        System.out.println("-----------------------------------------------------------------------------------------");
        verifyDistributiveProperty(true, true, true);
        verifyDistributiveProperty(true, true, false);
        verifyDistributiveProperty(true, false, true);
        verifyDistributiveProperty(true, false, false);
        verifyDistributiveProperty(false, true, true);
        verifyDistributiveProperty(false, true, false);
        verifyDistributiveProperty(false, false, true);
        verifyDistributiveProperty(false, false, false);
        System.out.println();
        
        // Example 5: Using truth tables to prove the XOR operation: (A || B) && !(A && B) = A XOR B
        System.out.println("Example 5: Using truth tables to prove (A || B) && !(A && B) = A XOR B");
        System.out.println("A\tB\tA || B\tA && B\t!(A && B)\t(A || B) && !(A && B)\tA XOR B\tEquivalent?");
        System.out.println("---------------------------------------------------------------------------------");
        verifyXorEquivalence(true, true);
        verifyXorEquivalence(true, false);
        verifyXorEquivalence(false, true);
        verifyXorEquivalence(false, false);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Truth Tables ---");
        System.out.println("1. Truth tables can be used to prove Boolean identities (CON-1.G.2)");
        System.out.println("2. A truth table lists all possible combinations of input values");
        System.out.println("3. For each combination, the output of the expressions is calculated");
        System.out.println("4. If two expressions produce the same output for all inputs, they are equivalent");
        System.out.println("5. Truth tables are a systematic way to verify Boolean identities");
        System.out.println("6. Common Boolean identities include:");
        System.out.println("   - A && (A || B) = A");
        System.out.println("   - A || (A && B) = A");
        System.out.println("   - (A && B) || (A && !B) = A");
        System.out.println("   - A && (B || C) = (A && B) || (A && C) (Distributive property)");
    }
    
    // Helper method to verify the identity: A && (A || B) = A
    private static void verifyIdentity1(boolean a, boolean b) {
        boolean orResult = a || b;
        boolean leftSide = a && orResult;  // A && (A || B)
        boolean rightSide = a;             // A
        boolean equivalent = (leftSide == rightSide);
        System.out.println(a + "\t" + b + "\t" + orResult + "\t\t" + leftSide + "\t\t\t" + equivalent);
    }
    
    // Helper method to verify the identity: A || (A && B) = A
    private static void verifyIdentity2(boolean a, boolean b) {
        boolean andResult = a && b;
        boolean leftSide = a || andResult;  // A || (A && B)
        boolean rightSide = a;              // A
        boolean equivalent = (leftSide == rightSide);
        System.out.println(a + "\t" + b + "\t" + andResult + "\t\t" + leftSide + "\t\t\t" + equivalent);
    }
    
    // Helper method to verify the identity: (A && B) || (A && !B) = A
    private static void verifyIdentity3(boolean a, boolean b) {
        boolean notB = !b;
        boolean andResult1 = a && b;
        boolean andResult2 = a && notB;
        boolean leftSide = andResult1 || andResult2;  // (A && B) || (A && !B)
        boolean rightSide = a;                        // A
        boolean equivalent = (leftSide == rightSide);
        System.out.println(a + "\t" + b + "\t" + notB + "\t" + andResult1 + "\t\t" + andResult2 + "\t\t" + leftSide + "\t\t\t" + equivalent);
    }
    
    // Helper method to verify the distributive property: A && (B || C) = (A && B) || (A && C)
    private static void verifyDistributiveProperty(boolean a, boolean b, boolean c) {
        boolean orResult = b || c;
        boolean leftSide = a && orResult;       // A && (B || C)
        
        boolean andResult1 = a && b;
        boolean andResult2 = a && c;
        boolean rightSide = andResult1 || andResult2;  // (A && B) || (A && C)
        
        boolean equivalent = (leftSide == rightSide);
        System.out.println(a + "\t" + b + "\t" + c + "\t" + orResult + "\t\t" + leftSide + "\t\t\t" + 
                           andResult1 + "\t\t" + andResult2 + "\t\t" + rightSide + "\t\t\t" + equivalent);
    }
    
    // Helper method to verify the XOR equivalence: (A || B) && !(A && B) = A XOR B
    private static void verifyXorEquivalence(boolean a, boolean b) {
        boolean orResult = a || b;
        boolean andResult = a && b;
        boolean notAndResult = !andResult;
        boolean leftSide = orResult && notAndResult;  // (A || B) && !(A && B)
        boolean rightSide = a ^ b;                    // A XOR B
        boolean equivalent = (leftSide == rightSide);
        System.out.println(a + "\t" + b + "\t" + orResult + "\t\t" + andResult + "\t\t" + notAndResult + "\t\t" + 
                           leftSide + "\t\t\t" + rightSide + "\t\t" + equivalent);
    }
}
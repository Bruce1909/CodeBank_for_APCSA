/**
 * VAR1C3_Exp - Primitive Value Storage Example
 * 
 * This program demonstrates the concept that the memory associated with a variable
 * of a primitive type holds an actual primitive value as specified in VAR-1.C.3.
 */
public class VAR1C3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Primitive Value Storage:\n");
        
        // Example 1: Primitive variables store actual values
        System.out.println("Example 1: Primitive variables store actual values");
        
        int num = 42;        // Memory directly holds the value 42
        double pi = 3.14159; // Memory directly holds the value 3.14159
        boolean flag = true; // Memory directly holds the value true
        
        System.out.println("num: " + num + " (memory directly holds this value)");
        System.out.println("pi: " + pi + " (memory directly holds this value)");
        System.out.println("flag: " + flag + " (memory directly holds this value)");
        System.out.println();
        
        // Example 2: Assigning primitive variables copies the value
        System.out.println("Example 2: Assigning primitive variables copies the value");
        
        int a = 10;
        int b = a; // The value 10 is copied from a's memory to b's memory
        
        System.out.println("Initial values: a = " + a + ", b = " + b);
        
        // Change the value of a
        a = 20;
        System.out.println("After changing a to 20: a = " + a + ", b = " + b);
        System.out.println("Note that b still has the original value because it received a copy of the value, not a reference");
        System.out.println();
        
        // Example 3: Primitive values in expressions
        System.out.println("Example 3: Primitive values in expressions");
        
        int x = 5;
        int y = 7;
        int sum = x + y; // The actual values 5 and 7 are used in the calculation
        
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("sum = x + y = " + sum);
        System.out.println("The calculation uses the actual values stored in memory, not references");
        System.out.println();
        
        // Example 4: Comparing primitive values
        System.out.println("Example 4: Comparing primitive values");
        
        int p = 100;
        int q = 100;
        
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("p == q: " + (p == q));
        System.out.println("For primitives, == compares the actual values stored in memory");
        System.out.println("This is different from reference types where == compares references");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Primitive Value Storage ---");
        System.out.println("1. Primitive variables store the actual value directly in memory");
        System.out.println("2. When assigning one primitive variable to another, the value is copied");
        System.out.println("3. Changing one primitive variable doesn't affect others that were assigned its value");
        System.out.println("4. Expressions with primitives operate on the actual values");
        System.out.println("5. Comparing primitives with == compares their actual values");
    }
}
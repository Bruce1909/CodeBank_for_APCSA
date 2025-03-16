/**
 * VAR1C3_Err - Primitive Value Storage Error Demonstration
 * 
 * This program demonstrates common errors and misconceptions about primitive value
 * storage as specified in VAR-1.C.3.
 */
public class VAR1C3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Misconceptions about Primitive Value Storage:\n");
        
        // ERROR 1: Misconception that primitive variables store references
        System.out.println("ERROR 1: Misconception that primitive variables store references");
        
        int a = 10;
        int b = a;
        
        System.out.println("Initial values: a = " + a + ", b = " + b);
        
        // Change the value of a
        a = 20;
        System.out.println("After changing a to 20: a = " + a + ", b = " + b);
        System.out.println("Note that b still has the original value because primitives store actual values, not references");
        System.out.println("This is different from how reference types work in Java");
        
        // Demonstrate how reference types work differently
        System.out.println("\nFor comparison, here's how reference types work:");
        int[] arrayA = {1, 2, 3};
        int[] arrayB = arrayA; // arrayB references the same array as arrayA
        
        System.out.println("Initial array values: arrayA[0] = " + arrayA[0] + ", arrayB[0] = " + arrayB[0]);
        
        // Change the value in arrayA
        arrayA[0] = 99;
        System.out.println("After changing arrayA[0] to 99: arrayA[0] = " + arrayA[0] + ", arrayB[0] = " + arrayB[0]);
        System.out.println("Note that arrayB[0] also changed because arrays are reference types");
        System.out.println();
        
        // ERROR 2: Misconception about primitive value comparison
        System.out.println("ERROR 2: Misconception about primitive value comparison");
        
        int x = 100;
        int y = 100;
        
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x == y: " + (x == y) + " (compares actual values for primitives)");
        
        // Demonstrate how this differs from reference type comparison
        Integer boxedX = new Integer(100); // Using constructor for demonstration (deprecated in newer Java)
        Integer boxedY = new Integer(100); // Using constructor for demonstration (deprecated in newer Java)
        
        System.out.println("\nboxedX = " + boxedX + ", boxedY = " + boxedY);
        System.out.println("boxedX == boxedY: " + (boxedX == boxedY) + " (compares references, not values)");
        System.out.println("boxedX.equals(boxedY): " + boxedX.equals(boxedY) + " (compares values)");
        System.out.println("This shows that == behaves differently for primitives vs reference types");
        System.out.println();
        
        // ERROR 3: Misconception about memory usage
        System.out.println("ERROR 3: Misconception about memory usage");
        
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        
        System.out.println("Each boolean variable (flag1, flag2, flag3) has its own memory");
        System.out.println("Even though they all store the same value (true)");
        System.out.println("This is different from string literals, which can be interned and shared");
        System.out.println();
        
        // ERROR 4: Misconception about primitive wrapper classes
        System.out.println("ERROR 4: Misconception about primitive wrapper classes");
        
        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        
        System.out.println("primitiveInt: " + primitiveInt + " (directly stores the value 42)");
        System.out.println("wrappedInt: " + wrappedInt + " (stores a reference to an Integer object containing 42)");
        System.out.println("Wrapper classes like Integer are reference types, not primitive types");
        System.out.println("They store references to objects, not the actual primitive values");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Primitive Value Storage Misconceptions ---");
        System.out.println("1. Primitive variables store actual values, not references to values");
        System.out.println("2. Assigning one primitive variable to another copies the value, not the reference");
        System.out.println("3. The == operator compares actual values for primitives, but references for objects");
        System.out.println("4. Each primitive variable has its own memory space, even if they store the same value");
        System.out.println("5. Primitive wrapper classes (Integer, Double, Boolean) are reference types, not primitives");
    }
}
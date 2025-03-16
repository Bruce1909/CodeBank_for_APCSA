/**
 * CON1C5_Exp.java
 * 
 * This program demonstrates how integer values in Java are represented with a finite amount of memory.
 * Knowledge Point: CON-1.C.5 - Integer values in Java are represented by values of type int, which are stored using a finite amount (4 bytes) of memory. Therefore, an int value must be in the range from Integer.MIN_VALUE to Integer.MAX_VALUE inclusive.
 */
public class CON1C5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Integer Value Ranges in Java:\n");
        
        // Example 1: Integer limits in Java
        System.out.println("Example 1: Integer limits in Java");
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        
        System.out.println("Integer.MIN_VALUE = " + minIntValue + " (approximately -2.1 billion)");
        System.out.println("Integer.MAX_VALUE = " + maxIntValue + " (approximately 2.1 billion)");
        System.out.println("Note: These limits exist because int uses 4 bytes (32 bits) of memory");
        System.out.println();
        
        // Example 2: Binary representation of integers
        System.out.println("Example 2: Binary representation of integers");
        int smallPositive = 42;
        int smallNegative = -42;
        
        System.out.println("int smallPositive = " + smallPositive);
        System.out.println("Binary representation: " + Integer.toBinaryString(smallPositive));
        System.out.println("int smallNegative = " + smallNegative);
        System.out.println("Binary representation: " + Integer.toBinaryString(smallNegative));
        System.out.println("Note: Negative numbers use two's complement representation");
        System.out.println();
        
        // Example 3: Memory size of different integer types
        System.out.println("Example 3: Memory size of different integer types");
        System.out.println("Type\t\tSize\t\tMinimum Value\t\tMaximum Value");
        System.out.println("byte\t\t1 byte\t\t" + Byte.MIN_VALUE + "\t\t\t" + Byte.MAX_VALUE);
        System.out.println("short\t\t2 bytes\t\t" + Short.MIN_VALUE + "\t\t\t" + Short.MAX_VALUE);
        System.out.println("int\t\t4 bytes\t\t" + Integer.MIN_VALUE + "\t\t" + Integer.MAX_VALUE);
        System.out.println("long\t\t8 bytes\t\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        System.out.println();
        
        // Example 4: Working with values near the limits
        System.out.println("Example 4: Working with values near the limits");
        int nearMax = Integer.MAX_VALUE - 10;
        int nearMin = Integer.MIN_VALUE + 10;
        
        System.out.println("int nearMax = Integer.MAX_VALUE - 10 = " + nearMax);
        System.out.println("int nearMin = Integer.MIN_VALUE + 10 = " + nearMin);
        
        // Counting up from near maximum
        System.out.println("\nCounting up from near maximum:");
        for (int i = 0; i < 5; i++) {
            System.out.println("nearMax + " + i + " = " + (nearMax + i));
        }
        
        // Counting down from near minimum
        System.out.println("\nCounting down from near minimum:");
        for (int i = 0; i < 5; i++) {
            System.out.println("nearMin - " + i + " = " + (nearMin - i));
        }
        System.out.println();
        
        // Example 5: Using larger integer types when needed
        System.out.println("Example 5: Using larger integer types when needed");
        long largeValue = 3_000_000_000L;  // This value is too large for int
        
        System.out.println("long largeValue = 3_000_000_000L = " + largeValue);
        System.out.println("Note: The 'L' suffix indicates a long literal");
        System.out.println("This value is outside the range of int but within the range of long");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Integer Value Ranges ---");
        System.out.println("1. Integer values in Java are represented by values of type int, which are stored using 4 bytes of memory (CON-1.C.5)");
        System.out.println("2. An int value must be in the range from Integer.MIN_VALUE (" + Integer.MIN_VALUE + ") to Integer.MAX_VALUE (" + Integer.MAX_VALUE + ") inclusive");
        System.out.println("3. The limits exist because of the finite memory allocation (32 bits) for int values");
        System.out.println("4. Java provides other integer types (byte, short, long) with different ranges");
        System.out.println("5. For values outside the int range, use the long type (8 bytes, 64 bits)");
        System.out.println("6. Understanding these limits is important to prevent integer overflow");
    }
}
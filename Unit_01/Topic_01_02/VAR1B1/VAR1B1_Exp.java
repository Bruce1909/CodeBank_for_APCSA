/**
 * This program demonstrates VAR-1.B.1: A type is a set of values (a domain) and a set of operations on them.
 * It shows different data types in Java and the operations that can be performed on each type.
 */
public class VAR1B1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Data Types and Their Operations:\n");
        
        // Integer type demonstration
        System.out.println("1. Integer Type (int) - A set of whole numbers");
        int num1 = 10;
        int num2 = 3;
        System.out.println("Values: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Operations on integers:");
        System.out.println("  Addition: num1 + num2 = " + (num1 + num2));
        System.out.println("  Subtraction: num1 - num2 = " + (num1 - num2));
        System.out.println("  Multiplication: num1 * num2 = " + (num1 * num2));
        System.out.println("  Division: num1 / num2 = " + (num1 / num2) + " (integer division truncates)");
        System.out.println("  Modulus: num1 % num2 = " + (num1 % num2) + " (remainder)");
        System.out.println();
        
        // Double type demonstration
        System.out.println("2. Double Type (double) - A set of floating-point numbers");
        double d1 = 10.5;
        double d2 = 2.5;
        System.out.println("Values: d1 = " + d1 + ", d2 = " + d2);
        System.out.println("Operations on doubles:");
        System.out.println("  Addition: d1 + d2 = " + (d1 + d2));
        System.out.println("  Subtraction: d1 - d2 = " + (d1 - d2));
        System.out.println("  Multiplication: d1 * d2 = " + (d1 * d2));
        System.out.println("  Division: d1 / d2 = " + (d1 / d2) + " (floating-point division)");
        System.out.println();
        
        // Boolean type demonstration
        System.out.println("3. Boolean Type (boolean) - A set of truth values: true and false");
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("Values: b1 = " + b1 + ", b2 = " + b2);
        System.out.println("Operations on booleans:");
        System.out.println("  Logical AND: b1 && b2 = " + (b1 && b2));
        System.out.println("  Logical OR: b1 || b2 = " + (b1 || b2));
        System.out.println("  Logical NOT: !b1 = " + (!b1) + ", !b2 = " + (!b2));
        System.out.println();
        
        // Character type demonstration
        System.out.println("4. Character Type (char) - A set of Unicode characters");
        char c1 = 'A';
        char c2 = '1';
        System.out.println("Values: c1 = '" + c1 + "', c2 = '" + c2 + "'");
        System.out.println("Operations on characters:");
        System.out.println("  Character arithmetic: c1 + 1 = " + (char)(c1 + 1) + " (increments to next character)");
        System.out.println("  Comparison: c1 > c2 is " + (c1 > c2) + " (based on Unicode values)");
        System.out.println("  Casting to int: (int)c1 = " + (int)c1 + " (Unicode value of 'A')");
        System.out.println();
        
        // String type demonstration (reference type)
        System.out.println("5. String Type (String) - A set of character sequences");
        String s1 = "Hello";
        String s2 = "World";
        System.out.println("Values: s1 = \"" + s1 + "\", s2 = \"" + s2 + "\"");
        System.out.println("Operations on strings:");
        System.out.println("  Concatenation: s1 + s2 = \"" + (s1 + s2) + "\"");
        System.out.println("  Length: s1.length() = " + s1.length());
        System.out.println("  Character access: s1.charAt(1) = '" + s1.charAt(1) + "'");
        System.out.println("  Substring: s1.substring(1, 4) = \"" + s1.substring(1, 4) + "\"");
        System.out.println("  Comparison: s1.equals(s2) is " + s1.equals(s2));
        System.out.println();
        
        // Summary
        System.out.println("Summary of Types and Operations:");
        System.out.println("1. Each data type defines a domain (set of possible values):");
        System.out.println("   - int: whole numbers within a specific range");
        System.out.println("   - double: floating-point numbers with decimal precision");
        System.out.println("   - boolean: logical values (true/false)");
        System.out.println("   - char: single Unicode characters");
        System.out.println("   - String: sequences of characters");
        System.out.println("2. Each data type has specific operations that can be performed on its values");
        System.out.println("3. The operations available depend on the data type");
        System.out.println("4. Understanding the domain and operations of each type helps in selecting");
        System.out.println("   the appropriate type for a particular specification");
    }
}
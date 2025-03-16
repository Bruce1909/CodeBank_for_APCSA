/**
 * This program demonstrates common errors related to VAR-1.B.1: A type is a set of values (a domain) and a set of operations on them.
 * It shows mistakes that can occur when using different data types and their operations.
 */
public class VAR1B1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Data Types and Their Operations:\n");
        
        // ERROR 1: Using operations not supported by a type
        System.out.println("ERROR 1: Using operations not supported by a type");
        try {
            String str = "Hello";
            // Attempting to use arithmetic operations on a String
            System.out.println("Attempting to use arithmetic on a String: str - 'H' would cause a compilation error");
            // String result = str - "H"; // This would cause a compilation error
            System.out.println("Strings support concatenation (+) but not other arithmetic operations");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 2: Type mismatch in operations
        System.out.println("ERROR 2: Type mismatch in operations");
        try {
            int num = 10;
            boolean flag = true;
            // Attempting to combine incompatible types
            System.out.println("Attempting to combine int and boolean would cause a compilation error");
            // int result = num + flag; // This would cause a compilation error
            System.out.println("Each type has its own set of compatible operations");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 3: Misunderstanding operation behavior for a type
        System.out.println("ERROR 3: Misunderstanding operation behavior for a type");
        int a = 5;
        int b = 2;
        System.out.println("Integer division: a / b = " + (a / b) + " (truncates decimal part)");
        System.out.println("This is not a bug but a defined behavior for integer division");
        System.out.println("To get floating-point result, at least one operand must be a floating-point type:");
        System.out.println("(double)a / b = " + ((double)a / b));
        System.out.println();
        
        // ERROR 4: Exceeding the domain of a type
        System.out.println("ERROR 4: Exceeding the domain of a type");
        try {
            int maxInt = Integer.MAX_VALUE; // 2,147,483,647
            System.out.println("Maximum int value: " + maxInt);
            int overflow = maxInt + 1;
            System.out.println("maxInt + 1 = " + overflow + " (unexpected negative result due to overflow)");
            System.out.println("This happens because the result exceeds the domain of int type");
            System.out.println("Solution: Use a type with a larger domain (long) for big integers");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 5: Misunderstanding char operations
        System.out.println("ERROR 5: Misunderstanding char operations");
        char c1 = 'A';
        char c2 = '1';
        System.out.println("Chars are actually numeric types with Unicode values");
        System.out.println("c1 = '" + c1 + "' has numeric value: " + (int)c1);
        System.out.println("c2 = '" + c2 + "' has numeric value: " + (int)c2);
        System.out.println("c1 + c2 = " + (c1 + c2) + " (adds the Unicode values, not the characters)");
        System.out.println("This is often unexpected for beginners");
        System.out.println();
        
        // ERROR 6: Misunderstanding boolean operations
        System.out.println("ERROR 6: Misunderstanding boolean operations");
        boolean x = true;
        boolean y = false;
        System.out.println("Boolean operations are logical, not arithmetic");
        System.out.println("Attempting to use arithmetic on booleans would cause a compilation error");
        // boolean result = x + y; // This would cause a compilation error
        System.out.println("Correct boolean operations: &&, ||, !");
        System.out.println("x && y = " + (x && y));
        System.out.println();
        
        // ERROR 7: Misunderstanding String operations
        System.out.println("ERROR 7: Misunderstanding String operations");
        String s1 = "10";
        String s2 = "20";
        System.out.println("s1 = \"" + s1 + "\", s2 = \"" + s2 + "\"");
        System.out.println("s1 + s2 = \"" + (s1 + s2) + "\" (concatenation, not addition)");
        System.out.println("To perform arithmetic, convert Strings to numeric types first:");
        System.out.println("Integer.parseInt(s1) + Integer.parseInt(s2) = " + (Integer.parseInt(s1) + Integer.parseInt(s2)));
        System.out.println();
        
        // Summary
        System.out.println("Summary of Common Errors with Types and Operations:");
        System.out.println("1. Using operations not supported by a particular type");
        System.out.println("2. Mixing incompatible types in operations");
        System.out.println("3. Misunderstanding the behavior of operations for a specific type");
        System.out.println("4. Exceeding the domain (range of values) of a type");
        System.out.println("5. Forgetting that char is a numeric type that uses Unicode values");
        System.out.println("6. Attempting to use arithmetic operations on boolean values");
        System.out.println("7. Confusing String concatenation with numeric addition");
        System.out.println("8. Not understanding that each type has its own set of valid operations");
    }
}
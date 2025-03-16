/**
 * CON1F2_Exp.java
 * 
 * This program demonstrates how expressions involving logical operators evaluate to Boolean values.
 * Knowledge Point: CON-1.F.2 - An expression involving logical operators evaluates to a Boolean value.
 */
public class CON1F2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Boolean Expressions with Logical Operators:\n");
        
        // Example 1: Simple Boolean expressions with logical operators
        System.out.println("Example 1: Simple Boolean expressions with logical operators");
        boolean a = true;
        boolean b = false;
        
        // Each expression evaluates to a Boolean value
        boolean result1 = !a;           // NOT operator
        boolean result2 = a && b;       // AND operator
        boolean result3 = a || b;       // OR operator
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("!a = " + result1 + " (Boolean value)");
        System.out.println("a && b = " + result2 + " (Boolean value)");
        System.out.println("a || b = " + result3 + " (Boolean value)");
        System.out.println();
        
        // Example 2: Complex Boolean expressions
        System.out.println("Example 2: Complex Boolean expressions");
        boolean c = true;
        boolean d = false;
        
        // Complex expressions still evaluate to a single Boolean value
        boolean result4 = !c && d;          // Combination of NOT and AND
        boolean result5 = c || !d;          // Combination of OR and NOT
        boolean result6 = !(c && d) || b;   // Combination of NOT, AND, and OR
        
        System.out.println("c = " + c + ", d = " + d + ", b = " + b);
        System.out.println("!c && d = " + result4 + " (Boolean value)");
        System.out.println("c || !d = " + result5 + " (Boolean value)");
        System.out.println("!(c && d) || b = " + result6 + " (Boolean value)");
        System.out.println();
        
        // Example 3: Using Boolean expressions in control structures
        System.out.println("Example 3: Using Boolean expressions in control structures");
        int x = 10;
        int y = 20;
        
        // Comparison operators in Boolean expressions
        boolean isXGreaterThanY = x > y;
        boolean isXLessThanY = x < y;
        boolean areEqual = x == y;
        
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x > y = " + isXGreaterThanY + " (Boolean value)");
        System.out.println("x < y = " + isXLessThanY + " (Boolean value)");
        System.out.println("x == y = " + areEqual + " (Boolean value)");
        
        // Using Boolean expressions in if statements
        System.out.println("\nUsing Boolean expressions in if statements:");
        if (isXLessThanY) {
            System.out.println("x is less than y");
        }
        
        // Combining comparison and logical operators
        boolean complexCondition = (x < y) && (x > 0) || (y == 20);
        System.out.println("(x < y) && (x > 0) || (y == 20) = " + complexCondition + " (Boolean value)");
        System.out.println();
        
        // Example 4: Boolean expressions in method calls
        System.out.println("Example 4: Boolean expressions in method calls");
        
        printResult("!true", !true);
        printResult("false || true", false || true);
        printResult("true && false", true && false);
        printResult("(5 > 3) && (10 <= 10)", (5 > 3) && (10 <= 10));
        System.out.println();
        
        // Example 5: Boolean expressions as return values
        System.out.println("Example 5: Boolean expressions as return values");
        
        boolean returnValue1 = isPositive(10);
        boolean returnValue2 = isPositive(-5);
        boolean returnValue3 = isInRange(15, 10, 20);
        boolean returnValue4 = isInRange(25, 10, 20);
        
        System.out.println("isPositive(10) = " + returnValue1 + " (Boolean value)");
        System.out.println("isPositive(-5) = " + returnValue2 + " (Boolean value)");
        System.out.println("isInRange(15, 10, 20) = " + returnValue3 + " (Boolean value)");
        System.out.println("isInRange(25, 10, 20) = " + returnValue4 + " (Boolean value)");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Boolean Expressions ---");
        System.out.println("1. An expression involving logical operators evaluates to a Boolean value (CON-1.F.2)");
        System.out.println("2. Boolean expressions can be simple (a single operator) or complex (multiple operators)");
        System.out.println("3. Boolean expressions can be used in variable assignments");
        System.out.println("4. Boolean expressions can be used in control structures like if statements");
        System.out.println("5. Boolean expressions can be passed as arguments to methods");
        System.out.println("6. Boolean expressions can be returned from methods");
    }
    
    // Helper method to print expression and its result
    public static void printResult(String expression, boolean result) {
        System.out.println(expression + " = " + result + " (Boolean value)");
    }
    
    // Helper method that returns a Boolean value
    public static boolean isPositive(int number) {
        return number > 0; // This expression evaluates to a Boolean value
    }
    
    // Helper method with a complex Boolean expression
    public static boolean isInRange(int value, int min, int max) {
        return value >= min && value <= max; // Complex expression evaluates to a Boolean value
    }
}
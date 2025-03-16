/**
 * CON1F2_Err.java
 * 
 * This program demonstrates common errors related to Boolean expressions with logical operators.
 * Knowledge Point: CON-1.F.2 - An expression involving logical operators evaluates to a Boolean value.
 */
public class CON1F2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Boolean Expressions:\n");
        
        // Example 1: Attempting to use logical expressions for non-Boolean purposes
        System.out.println("Example 1: Attempting to use logical expressions for non-Boolean purposes");
        
        boolean a = true;
        boolean b = false;
        
        // Error 1: Trying to use a logical expression as a number
        // int result = a && b;  // Error: Cannot convert from boolean to int
        System.out.println("Error 1: int result = a && b; // Cannot convert from boolean to int");
        
        // Error 2: Trying to use a logical expression in arithmetic
        // double calculation = 5.0 * (a || b);  // Error: Cannot convert from boolean to double
        System.out.println("Error 2: double calculation = 5.0 * (a || b); // Cannot convert from boolean to double");
        System.out.println();
        
        // Example 2: Confusing assignment (=) with equality comparison (==)
        System.out.println("Example 2: Confusing assignment (=) with equality comparison (==)");
        
        int x = 10;
        int y = 20;
        
        // Error 3: Using assignment instead of comparison in a Boolean context
        // if (x = y) {  // Error: Type mismatch - cannot convert from int to boolean
        //     System.out.println("This won't compile in Java");
        // }
        System.out.println("Error 3: if (x = y) { // Type mismatch - cannot convert from int to boolean");
        
        // This would work in some languages like C/C++ but not in Java
        System.out.println("In Java, assignments return the assigned value, not a Boolean");
        System.out.println("In some other languages, this might evaluate to true if y is non-zero");
        System.out.println();
        
        // Example 3: Incorrect Boolean expressions in method returns
        System.out.println("Example 3: Incorrect Boolean expressions in method returns");
        
        // Error 4: Returning non-Boolean from a method declared to return boolean
        System.out.println("Error 4: Returning non-Boolean from a method declared to return boolean");
        System.out.println("public static boolean incorrectReturn() {");
        System.out.println("    return 1;  // Error: Cannot convert from int to boolean");
        System.out.println("}");
        
        // Error 5: Using numeric comparisons where Boolean expressions are expected
        System.out.println("\nError 5: Using numeric comparisons where Boolean expressions are expected");
        System.out.println("if (isPositive) {  // Correct: isPositive is a boolean");
        System.out.println("if (value) {       // Error: 'value' is not a boolean expression");
        System.out.println();
        
        // Example 4: Misunderstanding Boolean expression evaluation
        System.out.println("Example 4: Misunderstanding Boolean expression evaluation");
        
        boolean p = true;
        boolean q = false;
        
        // Error 6: Assuming Boolean expressions return values other than true/false
        System.out.println("Error 6: Assuming Boolean expressions return values other than true/false");
        
        // In some languages, logical operators might return one of the operands
        // In JavaScript: true || 'anything' returns true
        // In JavaScript: false || 'anything' returns 'anything'
        System.out.println("In Java, p || q always returns either true or false: " + (p || q));
        System.out.println("In Java, p && q always returns either true or false: " + (p && q));
        System.out.println();
        
        // Example 5: Incorrect Boolean expression in conditional statements
        System.out.println("Example 5: Incorrect Boolean expression in conditional statements");
        
        int age = 25;
        
        // Error 7: Using a range check incorrectly
        // if (18 <= age <= 65) {  // Error: Cannot convert from int to boolean
        //     System.out.println("Working age");
        // }
        System.out.println("Error 7: if (18 <= age <= 65) { // This doesn't work in Java");
        System.out.println("Correct way: if (age >= 18 && age <= 65) {");
        
        // Error 8: Incorrect use of logical operators with non-Boolean values
        String name = "John";
        // if (name && name.length() > 3) {  // Error: name is not a Boolean
        //     System.out.println("Valid name");
        // }
        System.out.println("\nError 8: if (name && name.length() > 3) { // 'name' is not a Boolean");
        System.out.println("Correct way: if (name != null && name.length() > 3) {");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Boolean Expression Errors ---");
        System.out.println("1. An expression involving logical operators always evaluates to a Boolean value (true or false)");
        System.out.println("2. Boolean expressions cannot be used where numeric values are expected (without conversion)");
        System.out.println("3. Don't confuse assignment (=) with equality comparison (==) in Boolean contexts");
        System.out.println("4. Methods declared to return boolean must return true or false");
        System.out.println("5. Conditional statements (if, while) require Boolean expressions");
        System.out.println("6. Range checks must use the correct logical operator syntax (a <= b && b <= c)");
        System.out.println("7. Non-Boolean values cannot be used directly with logical operators");
    }
    
    // This method would cause a compilation error
    /*
    public static boolean incorrectReturn() {
        return 1;  // Error: Cannot convert from int to boolean
    }
    */
    
    // Correct version of the method
    public static boolean correctReturn() {
        return true;  // Returns a Boolean value
    }
}
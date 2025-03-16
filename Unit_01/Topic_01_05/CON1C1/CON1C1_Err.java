/**
 * CON1C1_Err.java
 * 
 * This program demonstrates common errors when using casting operators (int) and (double) in Java.
 * Knowledge Point: CON-1.C.1 - The casting operators (int) and (double) can be used to create a temporary value converted to a different data type.
 */
public class CON1C1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Casting Operators in Java:\n");
        
        // Example 1: Forgetting to cast when needed
        System.out.println("Example 1: Forgetting to cast when needed");
        
        // Error 1: Integer division stored in double without casting
        int a = 5;
        int b = 2;
        double result = a / b;  // Integer division happens first, then stored as double
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("double result = a / b; // Result: " + result);
        System.out.println("Error: Expected 2.5, but got 2.0 because integer division occurred before storing in double");
        System.out.println("Correction: double result = (double) a / b; // Result: " + ((double) a / b));
        System.out.println();
        
        // Example 2: Incorrect placement of cast operator
        System.out.println("Example 2: Incorrect placement of cast operator");
        
        // Error 2: Casting the result of integer division instead of operands
        double incorrectCast = (double) (a / b);  // Division happens first, then cast
        double correctCast = (double) a / b;      // Cast happens first, then division
        
        System.out.println("double incorrectCast = (double) (a / b); // Result: " + incorrectCast);
        System.out.println("Error: Casting after division doesn't change the fact that integer division already occurred");
        System.out.println("Correction: double correctCast = (double) a / b; // Result: " + correctCast);
        System.out.println();
        
        // Example 3: Misunderstanding temporary nature of casting
        System.out.println("Example 3: Misunderstanding temporary nature of casting");
        
        // Error 3: Assuming casting changes the original variable
        double x = 7.8;
        System.out.println("Original value of x: " + x);
        
        System.out.println("(int) x; // This statement alone doesn't change x");
        // (int) x;  // This cast is temporary and doesn't affect x
        System.out.println("Value of x after (int) x statement: " + x + " (unchanged)");
        System.out.println("Correction: x = (int) x; // This assigns the cast value back to x");
        System.out.println();
        
        // Example 4: Casting to wrong type
        System.out.println("Example 4: Casting to wrong type");
        
        // Error 4: Trying to cast incompatible types directly
        // String str = "123";
        // int num = (int) str;  // Error: Cannot cast String to int
        System.out.println("String str = \"123\";");
        System.out.println("int num = (int) str;  // Error: Cannot cast String to int");
        System.out.println("Error: Direct casting only works between compatible numeric types");
        System.out.println("Correction: int num = Integer.parseInt(str); // Use conversion methods instead");
        System.out.println();
        
        // Example 5: Unnecessary casting
        System.out.println("Example 5: Unnecessary casting");
        
        // Error 5: Redundant casting
        int i = 10;
        double d = (double) i;  // Necessary cast
        int j = (int) i;        // Unnecessary cast
        
        System.out.println("int i = 10;");
        System.out.println("double d = (double) i;  // Necessary cast");
        System.out.println("int j = (int) i;        // Unnecessary cast");
        System.out.println("Error: Casting a value to its own type is redundant");
        System.out.println("Correction: int j = i;  // No cast needed");
        System.out.println();
        
        // Example 6: Forgetting that casting truncates
        System.out.println("Example 6: Forgetting that casting truncates");
        
        // Error 6: Expecting rounding instead of truncation
        double price = 9.99;
        int dollars = (int) price;
        
        System.out.println("double price = " + price);
        System.out.println("int dollars = (int) price; // Result: " + dollars);
        System.out.println("Error: Casting with (int) truncates (removes decimal part) rather than rounds");
        System.out.println("For rounding: int dollars = (int) (price + 0.5); // Result: " + (int) (price + 0.5));
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Casting Operator Errors ---");
        System.out.println("1. Remember to cast before division to get floating-point results with integer operands");
        System.out.println("2. Casting after an operation is too late - the operation has already been performed");
        System.out.println("3. Casting creates a temporary value; to change a variable, you must reassign");
        System.out.println("4. Direct casting only works between compatible numeric types");
        System.out.println("5. Avoid unnecessary casting to the same type");
        System.out.println("6. Remember that (int) casting truncates rather than rounds");
    }
}
/**
 * VAR1E4_Err.java
 * 
 * This program demonstrates common errors related to concatenation of primitive values with String objects.
 * 
 * Knowledge Point: VAR-1.E.4
 * - Primitive values can be concatenated with a String object. This causes implicit conversion of the values to String objects.
 */
public class VAR1E4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with primitive-to-String concatenation:\n");
        
        // ERROR 1: Misunderstanding operator precedence in concatenation
        System.out.println("ERROR 1: Misunderstanding operator precedence in concatenation");
        int a = 5;
        int b = 10;
        int c = 15;
        
        // Common mistake: expecting arithmetic operations to happen before concatenation
        String result1 = "Result: " + a + b + c;
        System.out.println("result1 = \"Result: \" + a + b + c: \"" + result1 + "\"");
        System.out.println("Expected: \"Result: 30\" but got \"Result: 51015\"");
        System.out.println("The expression is evaluated left to right, so it concatenates each value as a string");
        
        // Correct approach: use parentheses to control evaluation order
        String result2 = "Result: " + (a + b + c);
        System.out.println("result2 = \"Result: \" + (a + b + c): \"" + result2 + "\"");
        System.out.println("Using parentheses ensures the addition happens before concatenation");
        System.out.println();
        
        // ERROR 2: Confusion with mixed operations
        System.out.println("ERROR 2: Confusion with mixed operations");
        int x = 10;
        int y = 20;
        
        // This can be confusing
        System.out.println("x + y = " + x + y); // Outputs "x + y = 1020"
        System.out.println("The above line outputs \"x + y = 1020\" instead of \"x + y = 30\"");
        
        // Correct approach
        System.out.println("x + y = " + (x + y)); // Outputs "x + y = 30"
        System.out.println("Using parentheses: \"x + y = \" + (x + y) correctly outputs \"x + y = 30\"");
        System.out.println();
        
        // ERROR 3: Misunderstanding type conversion in expressions
        System.out.println("ERROR 3: Misunderstanding type conversion in expressions");
        int num = 5;
        
        // This doesn't perform the addition
        String str1 = num + " + 3 = " + num + 3;
        System.out.println("str1 = num + \" + 3 = \" + num + 3: \"" + str1 + "\"");
        System.out.println("Expected: \"5 + 3 = 8\" but got \"5 + 3 = 53\"");
        
        // Correct approach
        String str2 = num + " + 3 = " + (num + 3);
        System.out.println("str2 = num + \" + 3 = \" + (num + 3): \"" + str2 + "\"");
        System.out.println();
        
        // ERROR 4: Forgetting that concatenation with null produces "null"
        System.out.println("ERROR 4: Forgetting that concatenation with null produces \"null\"");
        String nullString = null;
        int value = 42;
        
        String result3 = "Value: " + nullString + value;
        System.out.println("result3 = \"Value: \" + nullString + value: \"" + result3 + "\"");
        System.out.println("Expected: error or empty string, but got \"Value: null42\"");
        System.out.println("When null is concatenated with a String, it becomes the string \"null\"");
        System.out.println();
        
        // ERROR 5: Confusion with boolean concatenation
        System.out.println("ERROR 5: Confusion with boolean concatenation");
        boolean isActive = true;
        boolean isAdmin = false;
        
        // This doesn't perform a logical AND operation
        String status = "Status: " + isActive + isAdmin;
        System.out.println("status = \"Status: \" + isActive + isAdmin: \"" + status + "\"");
        System.out.println("Expected: result of logical operation, but got \"Status: truefalse\"");
        
        // Correct approach for showing logical operation result
        String correctStatus = "Status: " + (isActive && isAdmin);
        System.out.println("correctStatus = \"Status: \" + (isActive && isAdmin): \"" + correctStatus + "\"");
        System.out.println();
        
        // ERROR 6: Unexpected formatting of numeric values
        System.out.println("ERROR 6: Unexpected formatting of numeric values");
        double price = 9.99;
        int quantity = 3;
        
        // This doesn't format the price as currency
        String total = "Total: $" + price * quantity;
        System.out.println("total = \"Total: $\" + price * quantity: \"" + total + "\"");
        System.out.println("The decimal places might not be what you expect");
        
        // Better approach using formatting
        String formattedTotal = String.format("Total: $%.2f", price * quantity);
        System.out.println("Using String.format: \"" + formattedTotal + "\"");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Common Errors with Primitive-to-String Concatenation ---");
        System.out.println("1. Forgetting that concatenation evaluates left to right");
        System.out.println("2. Not using parentheses to control evaluation order");
        System.out.println("3. Confusion with mixed arithmetic and string operations");
        System.out.println("4. Forgetting that null becomes \"null\" in string concatenation");
        System.out.println("5. Expecting logical operations in boolean concatenation");
        System.out.println("6. Not considering formatting needs for numeric values");
    }
}
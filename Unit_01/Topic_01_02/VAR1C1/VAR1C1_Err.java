/**
 * VAR1C1_Err - Primitive Data Types Error Demonstration
 * 
 * This program demonstrates common errors and misconceptions when working with
 * the three primitive data types used in AP Computer Science A as specified in VAR-1.C.1:
 * - int: for integer values
 * - double: for floating-point values
 * - boolean: for true/false values
 */
public class VAR1C1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Primitive Data Types:\n");
        
        // ERROR 1: Type mismatch errors with int
        System.out.println("ERROR 1: Type mismatch errors with int");
        
        try {
            System.out.println("Attempting to assign a decimal value to an int variable...");
            // Uncommenting the next line would cause a compilation error
            // int score = 85.5; // Error: incompatible types: possible lossy conversion from double to int
            System.out.println("This would cause a compilation error because int cannot store decimal values");
            System.out.println("Correct approach: Use explicit casting or assign an integer value");
            int score1 = (int)85.5; // Explicit casting (truncates decimal part)
            int score2 = 85;        // Assigning an integer value
            System.out.println("score1 (with casting): " + score1);
            System.out.println("score2 (integer value): " + score2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 2: Integer division misconceptions
        System.out.println("ERROR 2: Integer division misconceptions");
        
        int x = 5;
        int y = 2;
        int result = x / y;
        System.out.println("5 / 2 = " + result + " (not 2.5 as expected)");
        System.out.println("This happens because integer division truncates the decimal part");
        System.out.println("Correct approach: Use double variables or cast to double");
        double correctResult = (double)x / y;
        System.out.println("(double)5 / 2 = " + correctResult);
        System.out.println();
        
        // ERROR 3: Type mismatch errors with double
        System.out.println("ERROR 3: Type mismatch errors with double");
        
        double price = 19.99;
        // Uncommenting the next line would cause a compilation error
        // int exactPrice = price; // Error: incompatible types: possible lossy conversion from double to int
        System.out.println("Assigning a double to an int without casting causes a compilation error");
        System.out.println("Correct approach: Use explicit casting if precision loss is acceptable");
        int approximatePrice = (int)price;
        System.out.println("Original price (double): " + price);
        System.out.println("Approximate price (int): " + approximatePrice + " (decimal part is lost)");
        System.out.println();
        
        // ERROR 4: Boolean type misconceptions
        System.out.println("ERROR 4: Boolean type misconceptions");
        
        try {
            System.out.println("Attempting to use non-boolean values for boolean variables...");
            // Uncommenting the next lines would cause compilation errors
            // boolean test1 = 1;      // Error: incompatible types: int cannot be converted to boolean
            // boolean test2 = "true"; // Error: incompatible types: String cannot be converted to boolean
            System.out.println("Unlike some other languages, Java does not automatically convert");
            System.out.println("integers or strings to boolean values");
            System.out.println("Correct approach: Use true or false literals, or boolean expressions");
            boolean test1 = true;
            boolean test2 = 5 > 3; // Boolean expression
            System.out.println("test1: " + test1);
            System.out.println("test2 (5 > 3): " + test2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 5: Precision issues with floating-point types
        System.out.println("ERROR 5: Precision issues with floating-point types");
        
        double a = 0.1;
        double b = 0.2;
        double sum = a + b;
        System.out.println("0.1 + 0.2 = " + sum + " (not exactly 0.3)");
        System.out.println("This happens because of how floating-point numbers are represented in binary");
        System.out.println("For money calculations, consider using BigDecimal instead of double");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Primitive Data Type Errors ---");
        System.out.println("1. int cannot store decimal values without casting (and losing precision)");
        System.out.println("2. Integer division (int/int) truncates the decimal part of the result");
        System.out.println("3. Assigning double to int requires explicit casting");
        System.out.println("4. Java boolean values are strictly true or false, not 1/0 or strings");
        System.out.println("5. Floating-point calculations may have precision issues");
    }
}
/**
 * CON1C1_Exp.java
 * 
 * This program demonstrates the use of casting operators (int) and (double) in Java.
 * Knowledge Point: CON-1.C.1 - The casting operators (int) and (double) can be used to create a temporary value converted to a different data type.
 */
public class CON1C1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Casting Operators in Java:\n");
        
        // Example 1: Casting double to int
        System.out.println("Example 1: Casting double to int");
        double doubleValue = 9.75;
        int intFromDouble = (int) doubleValue;  // Using (int) casting operator
        
        System.out.println("Original double value: " + doubleValue);
        System.out.println("After casting to int: " + intFromDouble);
        System.out.println("Note: The decimal portion is truncated when casting from double to int");
        System.out.println();
        
        // Example 2: Casting int to double
        System.out.println("Example 2: Casting int to double");
        int intValue = 42;
        double doubleFromInt = (double) intValue;  // Using (double) casting operator
        
        System.out.println("Original int value: " + intValue);
        System.out.println("After casting to double: " + doubleFromInt);
        System.out.println("Note: Casting from int to double adds a decimal point with zero");
        System.out.println();
        
        // Example 3: Casting in expressions
        System.out.println("Example 3: Casting in expressions");
        int a = 5;
        int b = 2;
        
        // Without casting - integer division
        double resultWithoutCast = a / b;
        // With casting - floating-point division
        double resultWithCast = (double) a / b;
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a / b without casting: " + resultWithoutCast + " (integer division occurs first)");
        System.out.println("(double) a / b with casting: " + resultWithCast + " (a is cast to double before division)");
        System.out.println();
        
        // Example 4: Casting one operand affects the whole expression
        System.out.println("Example 4: Casting one operand affects the whole expression");
        int c = 10;
        int d = 3;
        
        double result1 = c / d;           // Integer division occurs first
        double result2 = (double) c / d;  // c is cast to double, so floating-point division occurs
        double result3 = c / (double) d;  // d is cast to double, so floating-point division occurs
        
        System.out.println("c = " + c + ", d = " + d);
        System.out.println("c / d (stored in double): " + result1 + " (integer division occurs first)");
        System.out.println("(double) c / d: " + result2 + " (c is cast to double before division)");
        System.out.println("c / (double) d: " + result3 + " (d is cast to double before division)");
        System.out.println();
        
        // Example 5: Temporary nature of casting
        System.out.println("Example 5: Temporary nature of casting");
        double x = 7.8;
        System.out.println("Original value of x: " + x);
        
        // Using cast in print statement doesn't change the original variable
        System.out.println("Printing (int) x: " + (int) x);
        System.out.println("Value of x after casting in print statement: " + x + " (unchanged)");
        
        // To permanently change the value, you must reassign
        x = (int) x;
        System.out.println("Value of x after x = (int) x: " + x + " (now changed)");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Casting Operators ---");
        System.out.println("1. The casting operators (int) and (double) create temporary values converted to a different data type (CON-1.C.1)");
        System.out.println("2. Casting with (int) or (double) does not permanently change the original variable unless reassigned");
        System.out.println("3. Casting a double to an int truncates the decimal portion (doesn't round)");
        System.out.println("4. Casting an int to a double adds a decimal point with zero");
        System.out.println("5. Casting one operand in an expression can change the behavior of the entire expression");
        System.out.println("6. Casting is often used to force floating-point division with integer operands");
    }
}
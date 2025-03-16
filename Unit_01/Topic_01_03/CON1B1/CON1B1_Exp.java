/**
 * CON1B1_Exp.java
 * 
 * This program demonstrates the assignment operator in Java.
 * Knowledge Point: CON-1.B.1 - The assignment operator (=) allows a program to initialize 
 * or change the value stored in a variable. The value of the expression on the right 
 * is stored in the variable on the left.
 */
public class CON1B1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating the Assignment Operator (=):\n");
        
        // Example 1: Basic variable initialization with assignment operator
        System.out.println("Example 1: Basic variable initialization");
        int score = 85;  // Initialize score with the value 85
        double price = 29.99;  // Initialize price with the value 29.99
        char grade = 'B';  // Initialize grade with the character 'B'
        boolean isPassed = true;  // Initialize isPassed with the value true
        
        System.out.println("Initial score: " + score);
        System.out.println("Initial price: " + price);
        System.out.println("Initial grade: " + grade);
        System.out.println("Initial isPassed: " + isPassed);
        System.out.println();
        
        // Example 2: Changing variable values with assignment operator
        System.out.println("Example 2: Changing variable values");
        score = 92;  // Change the value of score to 92
        price = 24.50;  // Change the value of price to 24.50
        grade = 'A';  // Change the value of grade to 'A'
        isPassed = false;  // Change the value of isPassed to false
        
        System.out.println("Updated score: " + score);
        System.out.println("Updated price: " + price);
        System.out.println("Updated grade: " + grade);
        System.out.println("Updated isPassed: " + isPassed);
        System.out.println();
        
        // Example 3: Assigning values from expressions
        System.out.println("Example 3: Assigning values from expressions");
        int a = 10;
        int b = 5;
        int sum = a + b;  // Assign the result of the expression a + b to sum
        int product = a * b;  // Assign the result of the expression a * b to product
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("sum = a + b = " + sum);
        System.out.println("product = a * b = " + product);
        System.out.println();
        
        // Example 4: Chained assignment
        System.out.println("Example 4: Chained assignment");
        int x, y, z;  // Declare multiple variables
        x = y = z = 100;  // Assign the value 100 to all three variables
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println();
        
        // Example 5: Assignment with type conversion
        System.out.println("Example 5: Assignment with type conversion");
        int intValue = 42;
        double doubleValue = intValue;  // Implicit conversion from int to double
        
        System.out.println("intValue = " + intValue);
        System.out.println("doubleValue = " + doubleValue);
        
        double pi = 3.14159;
        int roundedPi = (int) pi;  // Explicit conversion (casting) from double to int
        
        System.out.println("pi = " + pi);
        System.out.println("roundedPi = " + roundedPi + " (decimal part is truncated)");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about the Assignment Operator ---");
        System.out.println("1. The assignment operator (=) stores the value of the right-side expression in the left-side variable (CON-1.B.1)");
        System.out.println("2. Assignment can be used for both initialization and changing variable values");
        System.out.println("3. The right side can be a literal, another variable, or a complex expression");
        System.out.println("4. Multiple variables can be assigned the same value using chained assignment");
        System.out.println("5. Assignment may involve implicit or explicit type conversion");
    }
}
/**
 * VAR1C1_Exp - Primitive Data Types Example
 * 
 * This program demonstrates the correct usage of the three primitive data types
 * used in AP Computer Science A as specified in VAR-1.C.1:
 * - int: for integer values
 * - double: for floating-point values
 * - boolean: for true/false values
 */
public class VAR1C1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Primitive Data Types in Java:\n");
        
        // Example 1: int data type for integer values
        System.out.println("Example 1: int data type");
        int studentCount = 25;
        int maxScore = 100;
        int minScore = 0;
        
        System.out.println("Student count: " + studentCount);
        System.out.println("Maximum score: " + maxScore);
        System.out.println("Minimum score: " + minScore);
        
        // Demonstrating integer arithmetic
        int sum = maxScore + minScore;
        int difference = maxScore - minScore;
        int product = studentCount * 2;
        int quotient = maxScore / studentCount;
        int remainder = maxScore % studentCount;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println();
        
        // Example 2: double data type for floating-point values
        System.out.println("Example 2: double data type");
        double averageScore = 85.5;
        double pi = 3.14159;
        double temperature = -2.7;
        
        System.out.println("Average score: " + averageScore);
        System.out.println("Value of pi: " + pi);
        System.out.println("Temperature: " + temperature + " degrees");
        
        // Demonstrating floating-point arithmetic
        double sum2 = averageScore + pi;
        double product2 = averageScore * 2;
        double quotient2 = averageScore / studentCount;
        
        System.out.println("Sum: " + sum2);
        System.out.println("Product: " + product2);
        System.out.println("Quotient: " + quotient2);
        System.out.println();
        
        // Example 3: boolean data type for true/false values
        System.out.println("Example 3: boolean data type");
        boolean isPassing = true;
        boolean isComplete = false;
        
        System.out.println("Is passing: " + isPassing);
        System.out.println("Is complete: " + isComplete);
        
        // Demonstrating boolean operations
        boolean andResult = isPassing && isComplete; // Logical AND
        boolean orResult = isPassing || isComplete;  // Logical OR
        boolean notResult = !isPassing;             // Logical NOT
        
        System.out.println("AND result: " + andResult);
        System.out.println("OR result: " + orResult);
        System.out.println("NOT result: " + notResult);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Primitive Data Types ---");
        System.out.println("1. int: Used for integer values (whole numbers)");
        System.out.println("2. double: Used for floating-point values (numbers with decimal points)");
        System.out.println("3. boolean: Used for true/false values");
        System.out.println("4. Each primitive type has a specific range of values it can represent");
        System.out.println("5. Each primitive type supports specific operations");
    }
}
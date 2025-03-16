/**
 * VAR1E4_Exp.java
 * 
 * This program demonstrates concatenation of primitive values with String objects.
 * 
 * Knowledge Point: VAR-1.E.4
 * - Primitive values can be concatenated with a String object. This causes implicit conversion of the values to String objects.
 */
public class VAR1E4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Primitive-to-String Concatenation:\n");
        
        // Example 1: Basic concatenation of primitives with strings
        System.out.println("Example 1: Basic concatenation of primitives with strings");
        int age = 25;
        double height = 5.9;
        boolean isStudent = true;
        char grade = 'A';
        
        // Concatenating different primitive types with strings
        String ageInfo = "Age: " + age;
        String heightInfo = "Height: " + height;
        String studentInfo = "Is student: " + isStudent;
        String gradeInfo = "Grade: " + grade;
        
        System.out.println(ageInfo);
        System.out.println(heightInfo);
        System.out.println(studentInfo);
        System.out.println(gradeInfo);
        System.out.println();
        
        // Example 2: Combining multiple primitives in a single string
        System.out.println("Example 2: Combining multiple primitives in a single string");
        String profile = "Profile - Age: " + age + ", Height: " + height + ", Student: " + isStudent + ", Grade: " + grade;
        System.out.println(profile);
        System.out.println();
        
        // Example 3: Demonstrating operator precedence with primitives and strings
        System.out.println("Example 3: Operator precedence with primitives and strings");
        int a = 5;
        int b = 10;
        
        // Without parentheses - concatenation happens left to right
        String result1 = "Sum: " + a + b;
        System.out.println("Without parentheses: " + result1);
        
        // With parentheses - addition happens before concatenation
        String result2 = "Sum: " + (a + b);
        System.out.println("With parentheses: " + result2);
        System.out.println();
        
        // Example 4: Concatenation with different numeric types
        System.out.println("Example 4: Concatenation with different numeric types");
        byte byteVal = 10;
        short shortVal = 100;
        long longVal = 1000000L;
        float floatVal = 3.14f;
        
        String numericConcatenation = "Byte: " + byteVal + ", Short: " + shortVal + ", Long: " + longVal + ", Float: " + floatVal;
        System.out.println(numericConcatenation);
        System.out.println();
        
        // Example 5: Concatenation in expressions
        System.out.println("Example 5: Concatenation in expressions");
        int score = 85;
        
        // Using concatenation in a conditional expression
        System.out.println("Your score is " + score + ". " + (score >= 70 ? "You passed!" : "You failed."));
        
        // Using concatenation in a loop
        System.out.println("\nCounting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        System.out.println();
        
        // Example 6: Implicit vs. explicit conversion
        System.out.println("Example 6: Implicit vs. explicit conversion");
        double pi = 3.14159;
        
        // Implicit conversion through concatenation
        String implicitConversion = "Pi is approximately " + pi;
        System.out.println("Implicit conversion: " + implicitConversion);
        
        // Explicit conversion using String.valueOf()
        String explicitConversion = "Pi is approximately " + String.valueOf(pi);
        System.out.println("Explicit conversion: " + explicitConversion);
        
        // Both produce the same result
        System.out.println("Both methods produce the same result");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Primitive-to-String Concatenation ---");
        System.out.println("1. When a primitive value is concatenated with a String, the primitive is automatically converted to a String");
        System.out.println("2. The + operator performs concatenation when one operand is a String");
        System.out.println("3. Concatenation is evaluated left to right, so use parentheses to control evaluation order");
        System.out.println("4. All primitive types (int, double, boolean, char, etc.) can be concatenated with Strings");
        System.out.println("5. Concatenation provides a simple way to create formatted output strings");
    }
}
/**
 * CON1B2_Exp.java
 * 
 * This program demonstrates how expressions are evaluated to produce a single value.
 * Knowledge Point: CON-1.B.2 - During execution, expressions are evaluated to produce a single value.
 */
public class CON1B2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Expression Evaluation:\n");
        
        // Example 1: Arithmetic expressions
        System.out.println("Example 1: Arithmetic expressions");
        int result1 = 5 + 3 * 2;  // Multiplication has higher precedence than addition
        int result2 = (5 + 3) * 2;  // Parentheses change the order of evaluation
        
        System.out.println("5 + 3 * 2 = " + result1 + " (multiplication before addition)");
        System.out.println("(5 + 3) * 2 = " + result2 + " (parentheses change precedence)");
        System.out.println();
        
        // Example 2: Complex arithmetic expressions
        System.out.println("Example 2: Complex arithmetic expressions");
        int a = 10, b = 5, c = 2;
        int complexResult = a + b * c - (a / c);  // Follows operator precedence rules
        
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("a + b * c - (a / c) = " + complexResult);
        System.out.println("Evaluation steps:");
        System.out.println("1. b * c = " + (b * c));
        System.out.println("2. a / c = " + (a / c));
        System.out.println("3. a + (b * c) - (a / c) = " + (a + (b * c) - (a / c)));
        System.out.println();
        
        // Example 3: String concatenation expressions
        System.out.println("Example 3: String concatenation expressions");
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;  // String concatenation
        
        System.out.println("firstName = \"" + firstName + "\"");
        System.out.println("lastName = \"" + lastName + "\"");
        System.out.println("firstName + \" \" + lastName = \"" + fullName + "\"");
        System.out.println();
        
        // Example 4: Mixed type expressions
        System.out.println("Example 4: Mixed type expressions");
        int num = 10;
        String message = "Count: " + num;  // int is converted to String during concatenation
        
        System.out.println("num = " + num);
        System.out.println("\"Count: \" + num = \"" + message + "\"");
        System.out.println();
        
        // Example 5: Boolean expressions
        System.out.println("Example 5: Boolean expressions");
        boolean isAdult = true;
        boolean hasLicense = false;
        boolean canDrive = isAdult && hasLicense;  // Logical AND
        
        System.out.println("isAdult = " + isAdult);
        System.out.println("hasLicense = " + hasLicense);
        System.out.println("isAdult && hasLicense = " + canDrive);
        System.out.println();
        
        // Example 6: Complex boolean expressions
        System.out.println("Example 6: Complex boolean expressions");
        int age = 25;
        double income = 50000.0;
        boolean isEligible = (age >= 21) && (income > 30000.0);  // Compound boolean expression
        
        System.out.println("age = " + age);
        System.out.println("income = " + income);
        System.out.println("(age >= 21) && (income > 30000.0) = " + isEligible);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Expression Evaluation ---");
        System.out.println("1. During execution, expressions are evaluated to produce a single value (CON-1.B.2)");
        System.out.println("2. Expressions are evaluated according to operator precedence rules");
        System.out.println("3. Parentheses can be used to change the order of evaluation");
        System.out.println("4. String concatenation expressions combine strings");
        System.out.println("5. Mixed type expressions may involve automatic type conversion");
        System.out.println("6. Boolean expressions evaluate to either true or false");
    }
}
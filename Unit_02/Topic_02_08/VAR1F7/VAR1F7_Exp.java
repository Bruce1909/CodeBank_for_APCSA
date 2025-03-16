/**
 * VAR1F7_Exp - Unboxing Application Example
 * 
 * This program demonstrates VAR-1.F.7:
 * The Java compiler applies unboxing when a wrapper class object is:
 * - Passed as a parameter to a method that expects a value of the corresponding primitive type.
 * - Assigned to a variable of the corresponding primitive type.
 */
public class VAR1F7_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.F.7: When Java applies unboxing\n");
        
        // Example 1: Unboxing when assigning to a primitive variable
        System.out.println("Example 1: Unboxing when assigning to a primitive variable");
        
        // Creating wrapper objects
        Integer boxedInt = new Integer(42);  // Using constructor (deprecated but in AP exam)
        Double boxedDouble = Double.valueOf(3.14159);
        
        // Unboxing when assigning to primitive variables
        int primitiveInt = boxedInt;  // Unboxing occurs here
        double primitiveDouble = boxedDouble;  // Unboxing occurs here
        
        System.out.println("Integer boxedInt = new Integer(42);");
        System.out.println("int primitiveInt = boxedInt;  // Unboxing occurs");
        System.out.println("primitiveInt = " + primitiveInt);
        
        System.out.println("\nDouble boxedDouble = Double.valueOf(3.14159);");
        System.out.println("double primitiveDouble = boxedDouble;  // Unboxing occurs");
        System.out.println("primitiveDouble = " + primitiveDouble);
        System.out.println();
        
        // Example 2: Unboxing when passing parameters to methods
        System.out.println("Example 2: Unboxing when passing parameters to methods");
        
        // Creating wrapper objects
        Integer number = Integer.valueOf(100);
        Double pi = Double.valueOf(3.14159);
        
        // Passing wrapper objects to methods expecting primitives
        System.out.println("Calling calculateSquare(number): ");
        int square = calculateSquare(number);  // number is unboxed to int
        System.out.println("Square of " + number + " is " + square);
        
        System.out.println("\nCalling calculateArea(pi, 10.0): ");
        double area = calculateArea(pi, 10.0);  // pi is unboxed to double
        System.out.println("Area of circle with radius 10.0 is " + area);
        System.out.println();
        
        // Example 3: Unboxing in arithmetic expressions
        System.out.println("Example 3: Unboxing in arithmetic expressions");
        
        Integer a = 10;
        Integer b = 20;
        
        // Both a and b are unboxed for the addition
        int sum = a + b;  // Unboxing occurs for both a and b
        
        System.out.println("Integer a = 10;");
        System.out.println("Integer b = 20;");
        System.out.println("int sum = a + b;  // Both a and b are unboxed");
        System.out.println("sum = " + sum);
        
        // Mixed expressions with primitives and wrappers
        int product = a * 5;  // a is unboxed for multiplication
        System.out.println("\nint product = a * 5;  // a is unboxed");
        System.out.println("product = " + product);
        System.out.println();
        
        // Example 4: Unboxing in control statements
        System.out.println("Example 4: Unboxing in control statements");
        
        Integer count = 5;
        
        // count is unboxed for the comparison
        System.out.println("Integer count = 5;");
        System.out.println("Using count in a loop condition (unboxing occurs):");
        
        System.out.println("for (int i = 0; i < count; i++) { ... }");
        for (int i = 0; i < count; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // Example 5: Behind the scenes
        System.out.println("Example 5: Behind the scenes");
        System.out.println("When you write: int x = integerObj;");
        System.out.println("The compiler actually does: int x = integerObj.intValue();");
        
        System.out.println("\nWhen you write: calculateSquare(integerObj);");
        System.out.println("The compiler actually does: calculateSquare(integerObj.intValue());");
        System.out.println();
        
        // Example 6: Null safety concerns
        System.out.println("Example 6: Null safety concerns");
        
        Integer nullableInteger = null;
        
        System.out.println("Integer nullableInteger = null;");
        System.out.println("Before unboxing a nullable wrapper, always check for null:");
        System.out.println("if (nullableInteger != null) {");
        System.out.println("    int value = nullableInteger;  // Safe unboxing");
        System.out.println("}");
        
        // Summary
        System.out.println("\n--- Key Points about When Unboxing Applies ---");
        System.out.println("1. When assigning wrapper objects to primitive variables");
        System.out.println("2. When passing wrapper objects to methods expecting primitives");
        System.out.println("3. When using wrapper objects in arithmetic expressions");
        System.out.println("4. When using wrapper objects in control statements");
        System.out.println("5. Always check for null before unboxing to avoid NullPointerException");
    }
    
    // Method that expects primitive int parameter
    public static int calculateSquare(int num) {
        System.out.println("Inside calculateSquare(int): " + num);
        System.out.println("Behind the scenes: calculateSquare(number.intValue())");
        return num * num;
    }
    
    // Method that expects primitive double parameters
    public static double calculateArea(double pi, double radius) {
        System.out.println("Inside calculateArea(double, double): pi=" + pi + ", radius=" + radius);
        System.out.println("Behind the scenes: calculateArea(pi.doubleValue(), radius)");
        return pi * radius * radius;
    }
}
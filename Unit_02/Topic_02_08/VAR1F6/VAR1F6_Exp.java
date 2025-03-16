/**
 * VAR1F6_Exp - Unboxing Example
 * 
 * This program demonstrates VAR-1.F.6:
 * Unboxing is the automatic conversion that the Java compiler makes from the wrapper class 
 * to the primitive type. This includes converting an Integer to an int and a Double to a double.
 */
public class VAR1F6_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.F.6: Unboxing\n");
        
        // Example 1: Basic unboxing with Integer
        System.out.println("Example 1: Basic unboxing with Integer");
        
        // Creating Integer objects
        Integer num1 = new Integer(42);  // Using constructor (deprecated but in AP exam)
        Integer num2 = Integer.valueOf(100);  // Using valueOf method
        Integer num3 = 200;  // Using autoboxing
        
        // Unboxing - converting Integer to int
        int primitive1 = num1;  // Automatic unboxing
        int primitive2 = num2;  // Automatic unboxing
        int primitive3 = num3;  // Automatic unboxing
        
        System.out.println("Integer num1 = new Integer(42);");
        System.out.println("int primitive1 = num1;  // Automatic unboxing");
        System.out.println("primitive1 = " + primitive1);
        System.out.println();
        
        // Example 2: Basic unboxing with Double
        System.out.println("Example 2: Basic unboxing with Double");
        
        // Creating Double objects
        Double dbl1 = new Double(3.14);  // Using constructor (deprecated but in AP exam)
        Double dbl2 = Double.valueOf(2.718);  // Using valueOf method
        Double dbl3 = 9.81;  // Using autoboxing
        
        // Unboxing - converting Double to double
        double primitiveDouble1 = dbl1;  // Automatic unboxing
        double primitiveDouble2 = dbl2;  // Automatic unboxing
        double primitiveDouble3 = dbl3;  // Automatic unboxing
        
        System.out.println("Double dbl1 = new Double(3.14);");
        System.out.println("double primitiveDouble1 = dbl1;  // Automatic unboxing");
        System.out.println("primitiveDouble1 = " + primitiveDouble1);
        System.out.println();
        
        // Example 3: Unboxing in expressions
        System.out.println("Example 3: Unboxing in expressions");
        
        Integer sum = 50;
        int result = sum + 25;  // sum is unboxed to int, then addition occurs
        System.out.println("Integer sum = 50;");
        System.out.println("int result = sum + 25;  // sum is unboxed to int");
        System.out.println("result = " + result);
        
        Double pi = 3.14159;
        double area = pi * 10 * 10;  // pi is unboxed to double, then multiplication occurs
        System.out.println("\nDouble pi = 3.14159;");
        System.out.println("double area = pi * 10 * 10;  // pi is unboxed to double");
        System.out.println("area = " + area);
        System.out.println();
        
        // Example 4: Unboxing in method calls
        System.out.println("Example 4: Unboxing in method calls");
        
        Integer boxedValue = 42;
        System.out.println("Integer boxedValue = 42;");
        System.out.println("Calling calculateSquare(boxedValue):  // boxedValue is unboxed");
        int square = calculateSquare(boxedValue);  // boxedValue is unboxed to int
        System.out.println("Square: " + square);
        
        Double boxedDouble = 2.5;
        System.out.println("\nDouble boxedDouble = 2.5;");
        System.out.println("Calling calculateDouble(boxedDouble):  // boxedDouble is unboxed");
        double doubled = calculateDouble(boxedDouble);  // boxedDouble is unboxed to double
        System.out.println("Doubled: " + doubled);
        System.out.println();
        
        // Example 5: Behind the scenes
        System.out.println("Example 5: Behind the scenes");
        System.out.println("When you write: int x = integerObj;");
        System.out.println("The compiler actually does: int x = integerObj.intValue();");
        System.out.println("\nWhen you write: double y = doubleObj;");
        System.out.println("The compiler actually does: double y = doubleObj.doubleValue();");
        System.out.println();
        
        // Example 6: Unboxing with other wrapper types
        System.out.println("Example 6: Unboxing with other wrapper types");
        
        Boolean flag = Boolean.TRUE;
        boolean primitiveFlag = flag;  // Unboxing Boolean to boolean
        System.out.println("Boolean flag = Boolean.TRUE;");
        System.out.println("boolean primitiveFlag = flag;  // Unboxing");
        System.out.println("primitiveFlag = " + primitiveFlag);
        
        Character ch = Character.valueOf('A');
        char primitiveChar = ch;  // Unboxing Character to char
        System.out.println("\nCharacter ch = Character.valueOf('A');");
        System.out.println("char primitiveChar = ch;  // Unboxing");
        System.out.println("primitiveChar = " + primitiveChar);
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about Unboxing ---");
        System.out.println("1. Unboxing is the automatic conversion from wrapper classes to primitive types");
        System.out.println("2. It makes code cleaner and more readable");
        System.out.println("3. It works with all wrapper classes and their corresponding primitive types");
        System.out.println("4. Behind the scenes, unboxing calls methods like intValue() or doubleValue()");
        System.out.println("5. Unboxing occurs in assignments, expressions, and method arguments");
    }
    
    // Method that takes a primitive int parameter
    public static int calculateSquare(int num) {
        return num * num;
    }
    
    // Method that takes a primitive double parameter
    public static double calculateDouble(double num) {
        return num * 2;
    }
}
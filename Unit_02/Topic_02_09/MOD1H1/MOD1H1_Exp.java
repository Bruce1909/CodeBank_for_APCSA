/**
 * MOD1H1_Exp.java
 * 
 * This program demonstrates calling static methods with the dot operator
 * along with the class name, as well as calling static methods defined in the enclosing class.
 * 
 * Knowledge Point: MOD-1.H.1
 * Static methods are called using the dot operator along with the class name
 * unless they are defined in the enclosing class.
 */
public class MOD1H1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating calling static methods:\n");
        
        // Example 1: Calling a static method defined in the enclosing class
        System.out.println("Example 1: Calling a static method defined in the enclosing class");
        System.out.println("Calling greetUser() directly:");
        greetUser();
        System.out.println();
        
        // Example 2: Calling a static method from the enclosing class using class name
        System.out.println("Example 2: Calling a static method from the enclosing class using class name");
        System.out.println("Calling MOD1H1_Exp.greetUser():");
        MOD1H1_Exp.greetUser(); // This is also valid but not necessary for methods in the same class
        System.out.println();
        
        // Example 3: Calling a static method from another class
        System.out.println("Example 3: Calling a static method from another class");
        System.out.println("Calling Math.max(10, 20):");
        int maxValue = Math.max(10, 20);
        System.out.println("The maximum value is: " + maxValue);
        System.out.println();
        
        // Example 4: Calling multiple static methods from the same external class
        System.out.println("Example 4: Calling multiple static methods from the same external class");
        System.out.println("Calling Math.min(5, 8) and Math.abs(-15):");
        int minValue = Math.min(5, 8);
        int absoluteValue = Math.abs(-15);
        System.out.println("The minimum value is: " + minValue);
        System.out.println("The absolute value is: " + absoluteValue);
        System.out.println();
        
        // Example 5: Calling a static method with the result of another static method
        System.out.println("Example 5: Calling a static method with the result of another static method");
        System.out.println("Calling Math.sqrt(Math.pow(3, 2)):");
        double result = Math.sqrt(Math.pow(3, 2));
        System.out.println("The square root of 3 squared is: " + result);
        System.out.println();
        
        // Example 6: Calling static methods from a utility class we've defined
        System.out.println("Example 6: Calling static methods from a utility class we've defined");
        System.out.println("Calling MathUtils.add(5, 7) and MathUtils.multiply(4, 6):");
        int sum = MathUtils.add(5, 7);
        int product = MathUtils.multiply(4, 6);
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println();
        
        // Example 7: Calling a static method that calls another static method
        System.out.println("Example 7: Calling a static method that calls another static method");
        System.out.println("Calling calculateArea(5):");
        double area = calculateArea(5);
        System.out.println("The area of a circle with radius 5 is: " + area);
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Calling Static Methods ---");
        System.out.println("1. Static methods can be called directly if they are in the same class");
        System.out.println("2. Static methods from other classes must be called using ClassName.methodName()");
        System.out.println("3. Static methods can be called without creating an instance of the class");
        System.out.println("4. Static methods can call other static methods");
        System.out.println("5. Static methods cannot directly access non-static members of the class");
    }
    
    // Static method defined in the enclosing class
    public static void greetUser() {
        System.out.println("Hello, User!");
    }
    
    // Static method that calls another static method
    public static double calculateArea(double radius) {
        // This static method calls another static method (Math.PI and Math.pow)
        return Math.PI * Math.pow(radius, 2);
    }
}

// A utility class with static methods
class MathUtils {
    // Static method for addition
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Static method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }
}
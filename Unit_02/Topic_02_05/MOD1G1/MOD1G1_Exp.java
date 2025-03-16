/**
 * MOD1G1_Exp.java
 * 
 * This program demonstrates calling non-static non-void methods with or without parameters
 * and how to use their return values.
 * 
 * Knowledge Point: MOD-1.G.1
 * Non-void methods return a value that is the same type as the return type in the signature.
 * To use the return value when calling a non-void method, it must be stored in a variable
 * or used as part of an expression.
 */
public class MOD1G1_Exp {
    public static void main(String[] args) {
        // Create an instance of the class to call non-static methods
        MOD1G1_Exp demo = new MOD1G1_Exp();
        
        System.out.println("Demonstrating non-static non-void methods:\n");
        
        // Example 1: Calling a non-void method with no parameters and storing the return value
        System.out.println("Example 1: Calling a non-void method with no parameters");
        int randomNumber = demo.getRandomNumber();
        System.out.println("Random number returned: " + randomNumber);
        System.out.println();
        
        // Example 2: Calling a non-void method with parameters and storing the return value
        System.out.println("Example 2: Calling a non-void method with parameters");
        int sum = demo.add(5, 7);
        System.out.println("Sum of 5 and 7: " + sum);
        System.out.println();
        
        // Example 3: Using the return value directly in an expression
        System.out.println("Example 3: Using the return value directly in an expression");
        System.out.println("Double the sum: " + (demo.add(10, 20) * 2));
        System.out.println();
        
        // Example 4: Using the return value as a parameter to another method
        System.out.println("Example 4: Using the return value as a parameter to another method");
        String message = demo.createMessage(demo.getName());
        System.out.println(message);
        System.out.println();
        
        // Example 5: Chaining method calls (using the return value of one method as input to another)
        System.out.println("Example 5: Chaining method calls");
        int result = demo.multiply(demo.add(3, 4), 2);
        System.out.println("Result of (3 + 4) * 2: " + result);
        System.out.println();
        
        // Example 6: Using return values in conditional statements
        System.out.println("Example 6: Using return values in conditional statements");
        if (demo.isEven(42)) {
            System.out.println("42 is an even number");
        } else {
            System.out.println("42 is an odd number");
        }
        System.out.println();
        
        // Example 7: Using return values in loops
        System.out.println("Example 7: Using return values in loops");
        int factorial = demo.calculateFactorial(5);
        System.out.println("Factorial of 5: " + factorial);
        System.out.println();
        
        // Example 8: Ignoring the return value (not recommended but possible)
        System.out.println("Example 8: Ignoring the return value (not recommended)");
        demo.add(100, 200); // Return value is not used (not recommended)
        System.out.println("The return value was not used in the previous method call");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Non-Void Methods ---");
        System.out.println("1. Non-void methods always return a value of the specified return type");
        System.out.println("2. The return value can be stored in a variable of compatible type");
        System.out.println("3. The return value can be used directly in expressions");
        System.out.println("4. The return value can be passed as an argument to other methods");
        System.out.println("5. Method calls can be chained when methods return compatible types");
        System.out.println("6. Return values can be used in control structures (if, loops, etc.)");
        System.out.println("7. Return values should generally be used, not ignored");
    }
    
    // Non-void method with no parameters
    public int getRandomNumber() {
        // Returns a "random" number between 1 and 100
        // (not truly random for demonstration purposes)
        return 42;
    }
    
    // Non-void method with parameters
    public int add(int a, int b) {
        return a + b;
    }
    
    // Non-void method that returns a String
    public String getName() {
        return "John Doe";
    }
    
    // Non-void method that takes a parameter and returns a String
    public String createMessage(String name) {
        return "Hello, " + name + "!";
    }
    
    // Non-void method for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Non-void method that returns a boolean
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    // Non-void method with a loop
    public int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
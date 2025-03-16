/**
 * MOD2D5_Err.java
 * This program demonstrates common errors related to the return keyword (MOD-2.D.5).
 * 
 * @author AP CSA
 */
public class MOD2D5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to the return keyword:\n");
        
        // ERROR 1: Missing return statement in a non-void method
        System.out.println("ERROR 1: Missing return statement in a non-void method");
        System.out.println("The following method would cause a compilation error if uncommented:");
        /*
        public int missingReturn() {
            int x = 5;
            // No return statement - compilation error
        }
        */
        System.out.println("All code paths in a non-void method must have a return statement\n");
        
        // ERROR 2: Unreachable code after return
        System.out.println("ERROR 2: Unreachable code after return");
        System.out.println("The following method has unreachable code:");
        unreachableCodeExample();
        System.out.println("Code after a return statement is never executed\n");
        
        // ERROR 3: Returning a value from a void method
        System.out.println("ERROR 3: Returning a value from a void method");
        System.out.println("The following method would cause a compilation error if uncommented:");
        /*
        public void returnValueFromVoid() {
            return 5; // Error: cannot return a value from a void method
        }
        */
        System.out.println("Void methods cannot return a value\n");
        
        // ERROR 4: Missing return in some code paths
        System.out.println("ERROR 4: Missing return in some code paths");
        System.out.println("The following method would cause a compilation error if uncommented:");
        /*
        public int incompleteReturn(int value) {
            if (value > 0) {
                return value * 2;
            }
            // Missing return statement for value <= 0
        }
        */
        System.out.println("All possible code paths must have a return statement\n");
        
        // ERROR 5: Return type mismatch
        System.out.println("ERROR 5: Return type mismatch");
        System.out.println("The following method would cause a compilation error if uncommented:");
        /*
        public int typeMismatch() {
            return "Hello"; // Error: incompatible types: String cannot be converted to int
        }
        */
        System.out.println("The return value must match the declared return type\n");
        
        System.out.println("Key points about return keyword errors:");
        System.out.println("- Non-void methods must have a return statement in all code paths");
        System.out.println("- Code after a return statement is unreachable and will not execute");
        System.out.println("- Void methods cannot return a value");
        System.out.println("- The return type must match the declared method return type");
        System.out.println("- Return immediately transfers control back to the caller");
    }
    
    /**
     * Demonstrates unreachable code after a return statement.
     */
    public static void unreachableCodeExample() {
        System.out.println("Inside unreachableCodeExample method");
        
        return; // Method execution ends here
        
        // The following line would cause a compilation error if uncommented
        // System.out.println("This line will never execute"); // Error: unreachable statement
    }
    
    /**
     * ERROR: Demonstrates incorrect use of return in a recursive method.
     * This method has a logical error (missing base case).
     */
    public static int badRecursion(int n) {
        // This would cause a StackOverflowError if called
        // Missing base case
        return n * badRecursion(n - 1); // Infinite recursion
    }
    
    /**
     * ERROR: Demonstrates incorrect early return that causes a logical error.
     */
    public static int sumArray(int[] array) {
        int sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            
            if (array[i] < 0) {
                // Logical error: returns early if any negative number is found
                // This means the sum will be incomplete
                return sum;
            }
        }
        
        return sum;
    }
}
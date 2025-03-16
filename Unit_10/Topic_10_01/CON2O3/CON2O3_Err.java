/**
 * CON-2.O.3: Each recursive call has its own set of local variables, including the formal parameters.
 *
 * This example demonstrates common errors related to misunderstanding how local variables
 * work in recursive methods.
 */
public class CON2O3_Err {
    // A class variable that will be used to demonstrate a common error
    private static int sharedCounter = 0;
    
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with local variables in recursive methods:\n");
        
        System.out.println("Example 1: Incorrectly using a class variable instead of local variables");
        System.out.println("Calculating sum of numbers from 1 to 5:");
        int result = sumNumbersWithSharedVariable(5);
        System.out.println("Result using shared variable: " + result);
        System.out.println("The shared counter is now: " + sharedCounter);
        
        // Reset the shared counter
        sharedCounter = 0;
        
        System.out.println("\nExample 2: Misunderstanding variable scope in recursion");
        try {
            System.out.println("Attempting to access a variable outside its scope:");
            int value = accessOutOfScopeVariable(3);
            System.out.println("Result: " + value); // This won't execute due to compilation error
        } catch (Exception e) {
            System.out.println("Error occurred: Variables from one recursive call are not accessible in another");
        }
        
        System.out.println("\n--- Common Errors with Local Variables in Recursive Methods ---");
        System.out.println("1. Using class/static variables instead of local variables for recursion state");
        System.out.println("2. Attempting to access variables from a different recursive call");
        System.out.println("3. Not understanding that each recursive call has its own separate variables");
        System.out.println("4. Assuming changes to parameters in one call affect other calls");
    }
    
    /**
     * A recursive method that incorrectly uses a shared class variable.
     * This demonstrates the error of not using local variables properly.
     * 
     * @param n The upper bound of the sum
     * @return The sum of numbers from 1 to n
     */
    public static int sumNumbersWithSharedVariable(int n) {
        System.out.println("Entering sumNumbersWithSharedVariable with n = " + n);
        
        // Base case
        if (n <= 0) {
            return sharedCounter;
        }
        
        // Error: Using a shared variable instead of local variables and return values
        // This will cause incorrect results if the method is called multiple times
        // or if we need to calculate multiple sums in parallel
        sharedCounter += n;
        System.out.println("Added " + n + " to shared counter, now: " + sharedCounter);
        
        // Make the recursive call
        return sumNumbersWithSharedVariable(n - 1);
    }
    
    /**
     * A recursive method that demonstrates the error of trying to access variables
     * from a different recursive call.
     * 
     * Note: This code would not actually compile due to the error, but it illustrates
     * a common misconception about variable scope in recursion.
     * 
     * @param n The parameter for recursion
     * @return A value calculated from recursion
     */
    public static int accessOutOfScopeVariable(int n) {
        System.out.println("Entering accessOutOfScopeVariable with n = " + n);
        
        // Create a local variable for this call
        int localValue = n * 10;
        System.out.println("Created local variable localValue = " + localValue);
        
        // Base case
        if (n <= 1) {
            System.out.println("Base case reached, returning localValue = " + localValue);
            return localValue;
        }
        
        // Make a recursive call
        int result = accessOutOfScopeVariable(n - 1);
        
        // Error: This is a conceptual error - we can't access localValue from the recursive call
        // The following line represents a common misconception and would not compile
        // System.out.println("Trying to access localValue from recursive call: " + ???);
        
        // The correct way is to use the returned value
        System.out.println("Received result from recursive call: " + result);
        
        return localValue + result;
    }
}
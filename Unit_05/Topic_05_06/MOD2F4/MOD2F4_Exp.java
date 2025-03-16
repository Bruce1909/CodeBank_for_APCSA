/**
 * MOD-2.F.4 Example
 * 
 * This program demonstrates that when an actual parameter is a primitive value,
 * the formal parameter is initialized with a copy of that value. Changes to the
 * formal parameter have no effect on the corresponding actual parameter.
 */
public class MOD2F4_Exp {
    
    /**
     * This method demonstrates that changes to primitive formal parameters
     * do not affect the original actual parameters.
     * 
     * @param number A primitive int parameter
     */
    public static void modifyPrimitive(int number) {
        System.out.println("Inside method, before modification: number = " + number);
        
        // Modify the formal parameter
        number = number * 2;
        
        System.out.println("Inside method, after modification: number = " + number);
        // The change only affects the local copy, not the original value
    }
    
    /**
     * This method demonstrates that primitive parameters are passed by value
     * by attempting to swap two numbers.
     * 
     * @param a First number
     * @param b Second number
     * @return A string describing the swap attempt
     */
    public static String attemptPrimitiveSwap(int a, int b) {
        System.out.println("Inside swap method, before swap: a = " + a + ", b = " + b);
        
        // Attempt to swap values
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("Inside swap method, after swap: a = " + a + ", b = " + b);
        
        return "Swap attempted";
    }
    
    /**
     * This method demonstrates returning a new value instead of
     * trying to modify the parameter.
     * 
     * @param value A primitive value
     * @return A new value (doubled)
     */
    public static int doubleValue(int value) {
        // Instead of trying to modify the parameter, return a new value
        return value * 2;
    }
    
    public static void main(String[] args) {
        // Demonstrate that changes to primitive parameters don't affect the original
        int originalNumber = 10;
        System.out.println("Before method call: originalNumber = " + originalNumber);
        
        modifyPrimitive(originalNumber);
        
        System.out.println("After method call: originalNumber = " + originalNumber);
        System.out.println("Notice that the original value is unchanged!\n");
        
        // Demonstrate that primitive swap doesn't affect original values
        int x = 5;
        int y = 10;
        System.out.println("Before swap method: x = " + x + ", y = " + y);
        
        attemptPrimitiveSwap(x, y);
        
        System.out.println("After swap method: x = " + x + ", y = " + y);
        System.out.println("Notice that the original values are unchanged!\n");
        
        // Demonstrate the proper way to work with primitive values
        int original = 15;
        System.out.println("Original value: " + original);
        
        // Get a new value by calling a method that returns the result
        int doubled = doubleValue(original);
        
        System.out.println("Original value after method call: " + original);
        System.out.println("New doubled value: " + doubled);
    }
}
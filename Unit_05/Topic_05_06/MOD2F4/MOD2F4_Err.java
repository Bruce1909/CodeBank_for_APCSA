/**
 * MOD-2.F.4 Error Example
 * 
 * This program demonstrates common errors and misconceptions related to primitive parameters,
 * such as attempting to modify the original value through the parameter.
 */
public class MOD2F4_Err {
    
    /**
     * ERROR: This method incorrectly attempts to modify the original primitive value
     * by changing the parameter. This won't work because primitive parameters are passed by value.
     * 
     * @param number A primitive int parameter
     */
    public static void tryToModifyOriginal(int number) {
        System.out.println("Inside method, before modification: number = " + number);
        
        // Attempt to modify the original value (won't work)
        number = number * 2;
        
        System.out.println("Inside method, after modification: number = " + number);
        System.out.println("ERROR: The original value outside this method will remain unchanged");
    }
    
    /**
     * ERROR: This method incorrectly attempts to swap two primitive values
     * by modifying the parameters. This won't work because primitive parameters are passed by value.
     * 
     * @param a First number
     * @param b Second number
     */
    public static void tryToSwapPrimitives(int a, int b) {
        System.out.println("Inside swap method, before swap: a = " + a + ", b = " + b);
        
        // Attempt to swap values (won't affect original variables)
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("Inside swap method, after swap: a = " + a + ", b = " + b);
        System.out.println("ERROR: The original values outside this method will remain unchanged");
    }
    
    /**
     * ERROR: This method incorrectly assumes that the parameter can be used
     * to return a value to the caller. This won't work for primitive types.
     * 
     * @param result A primitive that we incorrectly try to use to return a value
     */
    public static void tryToUseParameterAsReturnValue(int result) {
        // Attempt to use the parameter to return a computed value (won't work)
        result = 42;
        
        System.out.println("Inside method: result = " + result);
        System.out.println("ERROR: The original variable outside this method will remain unchanged");
        // The correct approach would be to return the value or use an object reference
    }
    
    public static void main(String[] args) {
        // Demonstrate the error of trying to modify the original primitive value
        int originalNumber = 10;
        System.out.println("Before method call: originalNumber = " + originalNumber);
        
        tryToModifyOriginal(originalNumber);
        
        System.out.println("After method call: originalNumber = " + originalNumber);
        System.out.println("Notice that the original value is unchanged despite the attempt to modify it\n");
        
        // Demonstrate the error of trying to swap primitive values through parameters
        int x = 5;
        int y = 10;
        System.out.println("Before swap method: x = " + x + ", y = " + y);
        
        tryToSwapPrimitives(x, y);
        
        System.out.println("After swap method: x = " + x + ", y = " + y);
        System.out.println("Notice that the original values are unchanged despite the attempt to swap them\n");
        
        // Demonstrate the error of trying to use a parameter to return a value
        int resultValue = 0;
        System.out.println("Before method call: resultValue = " + resultValue);
        
        tryToUseParameterAsReturnValue(resultValue);
        
        System.out.println("After method call: resultValue = " + resultValue);
        System.out.println("Notice that the original value is unchanged despite the attempt to set it");
        System.out.println("The correct approach would be to return the value from the method");
    }
}
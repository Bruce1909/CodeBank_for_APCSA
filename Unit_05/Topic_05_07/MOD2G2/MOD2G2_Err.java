/**
 * MOD-2.G.2 Error Example
 * 
 * This program demonstrates common errors related to the 'static' keyword in method headers,
 * such as placing it in the wrong position or omitting it.
 */
public class MOD2G2_Err {
    
    /**
     * ERROR: Incorrect placement of the 'static' keyword.
     * The 'static' keyword should come before the return type.
     */
    // Uncommenting the next line would cause a compilation error
    // public String static incorrectStaticMethodPlacement() {
    //     return "This method has the 'static' keyword in the wrong position.";
    // }
    
    /**
     * The correct placement of the 'static' keyword for comparison.
     */
    public static String correctStaticMethodPlacement() {
        return "This method has the 'static' keyword in the correct position.";
    }
    
    /**
     * ERROR: Missing the 'static' keyword but trying to use it as a static method.
     * This is actually an instance method, not a static method.
     */
    public String missingStaticKeyword() {
        return "This method is missing the 'static' keyword.";
    }
    
    /**
     * ERROR: Trying to use 'static' as a variable name.
     * 'static' is a reserved keyword and cannot be used as an identifier.
     */
    public static void reservedKeywordError() {
        // Uncommenting the next line would cause a compilation error
        // int static = 10; // Cannot use 'static' as a variable name
        System.out.println("Cannot use 'static' as a variable name because it's a reserved keyword.");
    }
    
    public static void main(String[] args) {
        // Demonstrate the correct way to call a static method
        System.out.println("Correctly calling a static method:");
        System.out.println(correctStaticMethodPlacement());
        
        // ERROR: Attempting to call an instance method as if it were static
        System.out.println("\nERROR: Attempting to call an instance method as if it were static:");
        // Uncommenting the next line would cause a compilation error
        // System.out.println(MOD2G2_Err.missingStaticKeyword());
        System.out.println("The above line would cause a compilation error because");
        System.out.println("'missingStaticKeyword()' is an instance method, not a static method.");
        System.out.println("It's missing the 'static' keyword in its declaration.");
        
        // The correct way to call an instance method
        System.out.println("\nThe correct way to call an instance method:");
        MOD2G2_Err instance = new MOD2G2_Err();
        System.out.println(instance.missingStaticKeyword());
        
        // ERROR: Common syntax errors with the 'static' keyword
        System.out.println("\nERROR: Common syntax errors with the 'static' keyword:");
        System.out.println("1. Placing 'static' after the return type: public String static method()");
        System.out.println("2. Placing 'static' after the access modifier and before 'void': public static void method()");
        System.out.println("3. Using 'static' as a variable name: int static = 10;");
        
        // Call the method that demonstrates the reserved keyword error
        System.out.println("\nDemonstrating reserved keyword error:");
        reservedKeywordError();
    }
}
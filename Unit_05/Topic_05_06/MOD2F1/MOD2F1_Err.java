/**
 * MOD-2.F.1 Error Example
 * 
 * This program demonstrates the error that occurs when trying to access
 * private data and methods of a parameter that is a reference to an object
 * when the parameter is NOT the same type as the method's enclosing class.
 */
public class MOD2F1_Err {
    private int value;
    
    public MOD2F1_Err(int value) {
        this.value = value;
    }
    
    /**
     * This method demonstrates the error when trying to access private data
     * of an object that is not the same type as this class.
     * 
     * @param helper A HelperClass object
     * @return Would return the sum of values if it could compile
     */
    public int tryToAccessPrivateData(HelperClass helper) {
        // ERROR: Cannot access private field 'secretValue' from class 'HelperClass'
        // This will not compile because 'helper' is not the same type as MOD2F1_Err
        return this.value + helper.secretValue; // Compilation error here
    }
    
    /**
     * This method demonstrates the error when trying to access private methods
     * of an object that is not the same type as this class.
     * 
     * @param helper A HelperClass object
     * @return Would return a combined string if it could compile
     */
    public String tryToAccessPrivateMethod(HelperClass helper) {
        // ERROR: Cannot access private method 'getSecretMessage()' from class 'HelperClass'
        // This will not compile because 'helper' is not the same type as MOD2F1_Err
        return "My value: " + this.value + ", Helper's message: " + helper.getSecretMessage(); // Compilation error here
    }
    
    public static void main(String[] args) {
        MOD2F1_Err obj = new MOD2F1_Err(10);
        HelperClass helper = new HelperClass(20, "Secret message");
        
        // The following lines would cause compilation errors
        // int result = obj.tryToAccessPrivateData(helper);
        // String message = obj.tryToAccessPrivateMethod(helper);
        
        System.out.println("This program will not compile due to access violations.");
        System.out.println("Methods can only access private data and methods of parameters");
        System.out.println("that are the same type as the method's enclosing class.");
    }
}

/**
 * A helper class with private data and methods that MOD2F1_Err tries to access
 */
class HelperClass {
    private int secretValue;
    private String secretMessage;
    
    public HelperClass(int secretValue, String secretMessage) {
        this.secretValue = secretValue;
        this.secretMessage = secretMessage;
    }
    
    private String getSecretMessage() {
        return secretMessage;
    }
    
    // Public methods that properly expose the private data
    public int getSecretValue() {
        return secretValue;
    }
    
    public String getPublicMessage() {
        return getSecretMessage();
    }
}
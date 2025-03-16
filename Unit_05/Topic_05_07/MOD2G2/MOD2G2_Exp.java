/**
 * MOD-2.G.2 Example
 * 
 * This program demonstrates that static methods include the keyword 'static'
 * in the header before the method name.
 */
public class MOD2G2_Exp {
    
    /**
     * A static method with the 'static' keyword in the header before the method name.
     * This method belongs to the class, not to instances of the class.
     * 
     * @return A message about static methods
     */
    public static String staticMethodExample() {
        return "This is a static method with the 'static' keyword in the header.";
    }
    
    /**
     * Another static method with different access modifier.
     * Note that the 'static' keyword still comes before the method name.
     * 
     * @param value A value to process
     * @return The processed value
     */
    private static int processValue(int value) {
        return value * 2;
    }
    
    /**
     * A static method with parameters and a different return type.
     * The order of modifiers is: access modifier, then 'static', then return type.
     * 
     * @param firstName The first name
     * @param lastName The last name
     * @return The full name
     */
    public static String formatName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    
    /**
     * A non-static (instance) method for comparison.
     * Note the absence of the 'static' keyword in the header.
     * 
     * @return A message about instance methods
     */
    public String instanceMethodExample() {
        return "This is an instance method without the 'static' keyword.";
    }
    
    public static void main(String[] args) {
        // Demonstrate calling static methods
        System.out.println("Calling static methods with the 'static' keyword in the header:");
        System.out.println(staticMethodExample());
        
        // Demonstrate calling a private static method
        int result = processValue(5);
        System.out.println("\nResult from private static method: " + result);
        
        // Demonstrate calling a static method with parameters
        String fullName = formatName("John", "Doe");
        System.out.println("\nFormatted name from static method: " + fullName);
        
        // Demonstrate the syntax difference between static and instance methods
        System.out.println("\nSyntax comparison:");
        System.out.println("Static method declaration:    public static String staticMethodExample()");
        System.out.println("Instance method declaration: public String instanceMethodExample()");
        
        // Demonstrate calling an instance method (requires an instance)
        MOD2G2_Exp instance = new MOD2G2_Exp();
        System.out.println("\nCalling an instance method (requires an instance):");
        System.out.println(instance.instanceMethodExample());
    }
}
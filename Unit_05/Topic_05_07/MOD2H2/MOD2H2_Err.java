/**
 * MOD-2.H.2 Error Example
 * 
 * This program demonstrates common errors related to static variable declaration
 * and access modifiers.
 */
public class MOD2H2_Err {
    
    // ERROR: Missing static keyword (this would be an instance variable, not static)
    // private int incorrectStaticDeclaration = 0;
    
    // Correct static variable declaration
    private static int correctStaticDeclaration = 0;
    
    // ERROR: Attempting to initialize a static variable with an instance variable
    private String name;
    // private static String errorMessage = "Error for " + name; // Would cause compilation error
    
    // Instance variable for demonstration
    private int instanceValue = 10;
    
    /**
     * Constructor that initializes instance variables
     * 
     * @param name The name for this instance
     */
    public MOD2H2_Err(String name) {
        this.name = name;
        correctStaticDeclaration++;
    }
    
    /**
     * ERROR: This method incorrectly tries to modify a final static variable
     */
    public static void attemptToModifyConstant() {
        // Uncommenting the next line would cause a compilation error
        // CONSTANT_VALUE = 4.0; // Error: Cannot assign a value to final variable
        
        System.out.println("ERROR: Cannot modify a final static variable.");
        System.out.println("Once initialized, final static variables cannot be changed.");
    }
    
    /**
     * ERROR: This method incorrectly tries to declare a static variable inside a method
     */
    public void incorrectLocalStaticVariable() {
        // Uncommenting the next line would cause a compilation error
        // static int localCounter = 0; // Error: Static variables cannot be declared in a method
        
        System.out.println("ERROR: Cannot declare static variables inside methods.");
        System.out.println("Static variables must be declared at the class level.");
    }
    
    // Static final variable (constant) - correctly declared
    public static final double CONSTANT_VALUE = 3.14;
    
    public static void main(String[] args) {
        // Demonstrate errors with static variable declaration
        System.out.println("Demonstrating errors with static variable declaration:\n");
        
        // ERROR: Demonstrate the error of missing the static keyword
        System.out.println("ERROR: Missing the static keyword:");
        System.out.println("If 'incorrectStaticDeclaration' were declared without the 'static' keyword,");
        System.out.println("it would be an instance variable, not a static variable.");
        System.out.println("Each instance would have its own copy instead of sharing one value.");
        
        // ERROR: Demonstrate the error of initializing static variables with instance variables
        System.out.println("\nERROR: Initializing static variables with instance variables:");
        System.out.println("Static variables are initialized when the class is loaded,");
        System.out.println("before any instances are created. Therefore, they cannot");
        System.out.println("be initialized with instance variables or methods.");
        
        // ERROR: Demonstrate the error of modifying final static variables
        System.out.println("\nERROR: Attempting to modify a final static variable:");
        attemptToModifyConstant();
        
        // Create an instance and demonstrate the error of local static variables
        MOD2H2_Err instance = new MOD2H2_Err("Test");
        System.out.println("\nERROR: Attempting to declare a static variable inside a method:");
        instance.incorrectLocalStaticVariable();
        
        // Explain the correct way to declare static variables
        System.out.println("\nThe correct way to declare static variables:");
        System.out.println("1. Use the 'static' keyword before the type.");
        System.out.println("2. Declare them at the class level, not inside methods.");
        System.out.println("3. Use appropriate access modifiers (public, private, etc.).");
        System.out.println("4. Add 'final' if the variable should not be changed.");
        System.out.println("5. Initialize with constant values or static methods, not instance-dependent values.");
    }
}
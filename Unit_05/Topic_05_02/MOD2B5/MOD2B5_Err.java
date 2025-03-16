/**
 * MOD2B5_Err.java
 * 
 * This program demonstrates common errors related to default constructors as described in
 * MOD-2.B.5: When no constructor is written, Java provides a no-argument constructor,
 * and the instance variables are set to default values.
 */
public class MOD2B5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with default constructors (MOD-2.B.5):\n");
        
        // ERROR 1: Relying on default values without understanding them
        System.out.println("ERROR 1: Relying on default values without understanding them");
        DefaultConstructorErrorDemo obj1 = new DefaultConstructorErrorDemo();
        System.out.println("\nObject created with default constructor:");
        obj1.displayInfo(); // Default values may not be appropriate for the application
        obj1.performCalculation(); // Using default values can lead to errors
        
        // ERROR 2: Assuming a default constructor exists when custom constructors are defined
        System.out.println("\nERROR 2: Assuming a default constructor exists when custom constructors are defined");
        System.out.println("Attempting to create a NoDefaultConstructor object with no arguments:");
        System.out.println("// NoDefaultConstructor obj2 = new NoDefaultConstructor(); // Compilation error");
        System.out.println("// The above line would cause a compilation error because no default constructor exists");
        
        // We can only create this object using the defined constructor
        NoDefaultConstructor obj2 = new NoDefaultConstructor("Required Parameter");
        System.out.println("\nObject created with the only available constructor:");
        obj2.displayInfo();
        
        // ERROR 3: Not initializing reference variables before use
        System.out.println("\nERROR 3: Not initializing reference variables before use");
        NullReferenceErrorDemo obj3 = new NullReferenceErrorDemo();
        System.out.println("\nAttempting to use uninitialized reference variables:");
        obj3.attemptToUseReferences(); // Will cause NullPointerException (shown in output)
        
        // ERROR 4: Forgetting that instance variables are automatically initialized
        System.out.println("\nERROR 4: Forgetting that instance variables are automatically initialized");
        RedundantInitializationDemo obj4 = new RedundantInitializationDemo();
        System.out.println("\nObject with redundant initialization in constructor:");
        obj4.displayInfo();
        
        System.out.println("\n--- Common Errors with Default Constructors ---");
        System.out.println("1. Relying on default values without understanding them");
        System.out.println("2. Assuming a default constructor exists when custom constructors are defined");
        System.out.println("3. Not checking if reference variables are null before using them");
        System.out.println("4. Redundantly initializing variables to their default values");
        System.out.println("5. Not providing a no-argument constructor when needed for frameworks/libraries");
    }
}

/**
 * Class that demonstrates errors with relying on default values
 */
class DefaultConstructorErrorDemo {
    // Instance variables with no explicit initialization
    private String name;    // Default value: null
    private int divisor;    // Default value: 0
    private double rate;    // Default value: 0.0
    private boolean initialized; // Default value: false
    
    // ERROR: No constructor defined - relying on default constructor
    // This means all instance variables get default values which may not be appropriate
    
    // Method that uses the instance variables without checking their values
    public void performCalculation() {
        try {
            // ERROR: Using default values without validation can cause runtime errors
            System.out.println("  Attempting calculation with default values:");
            double result = 100 / divisor; // Will cause ArithmeticException (division by zero)
            System.out.println("  Result: " + result); // This line will not execute
        } catch (ArithmeticException e) {
            System.out.println("  ERROR: " + e.getMessage() + " (divisor is 0 by default)");
        }
        
        // ERROR: Using a null reference without checking
        if (name != null) {
            System.out.println("  Name length: " + name.length());
        } else {
            System.out.println("  ERROR: Cannot get length of name (name is null by default)");
        }
    }
    
    // Method to display the current state
    public void displayInfo() {
        System.out.println("  Name: " + name + " (default null)");
        System.out.println("  Divisor: " + divisor + " (default 0)");
        System.out.println("  Rate: " + rate + " (default 0.0)");
        System.out.println("  Initialized: " + initialized + " (default false)");
    }
}

/**
 * Class that demonstrates errors with assuming a default constructor exists
 */
class NoDefaultConstructor {
    private String requiredParameter;
    
    // A custom constructor is defined, so Java does NOT provide a default constructor
    public NoDefaultConstructor(String requiredParameter) {
        this.requiredParameter = requiredParameter;
    }
    
    // ERROR: No default (no-argument) constructor is defined
    // Attempting to create an instance without arguments will cause a compilation error:
    // NoDefaultConstructor obj = new NoDefaultConstructor(); // Error!
    
    public void displayInfo() {
        System.out.println("  Required Parameter: " + requiredParameter);
    }
}

/**
 * Class that demonstrates errors with null references
 */
class NullReferenceErrorDemo {
    // Instance variables with no explicit initialization
    private String text;    // Default value: null
    private int[] numbers;  // Default value: null
    private Object object;  // Default value: null
    
    // ERROR: No constructor defined - relying on default constructor
    // This means all reference variables are null
    
    // Method that attempts to use the null references
    public void attemptToUseReferences() {
        try {
            // ERROR: Using null references without checking
            System.out.println("  Attempting to use text reference:");
            System.out.println("  Text uppercase: " + text.toUpperCase()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("  ERROR: NullPointerException (text is null by default)");
        }
        
        try {
            System.out.println("  Attempting to use numbers array:");
            System.out.println("  First number: " + numbers[0]); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("  ERROR: NullPointerException (numbers array is null by default)");
        }
        
        try {
            System.out.println("  Attempting to use object reference:");
            System.out.println("  Object toString: " + object.toString()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("  ERROR: NullPointerException (object is null by default)");
        }
    }
}

/**
 * Class that demonstrates redundant initialization
 */
class RedundantInitializationDemo {
    // Instance variables
    private int number;     // Default value: 0
    private double value;   // Default value: 0.0
    private boolean flag;   // Default value: false
    private String text;    // Default value: null
    
    // Constructor with redundant initializations
    public RedundantInitializationDemo() {
        // ERROR: Redundant initializations to default values
        this.number = 0;    // Redundant - already 0 by default
        this.value = 0.0;   // Redundant - already 0.0 by default
        this.flag = false;  // Redundant - already false by default
        this.text = null;   // Redundant - already null by default
        
        System.out.println("Constructor called with redundant initializations");
    }
    
    public void displayInfo() {
        System.out.println("  Number: " + number + " (redundantly initialized to 0)");
        System.out.println("  Value: " + value + " (redundantly initialized to 0.0)");
        System.out.println("  Flag: " + flag + " (redundantly initialized to false)");
        System.out.println("  Text: " + text + " (redundantly initialized to null)");
    }
}
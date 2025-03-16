/**
 * VAR1F5_Exp - Autoboxing Application Example
 * 
 * This program demonstrates VAR-1.F.5:
 * The Java compiler applies autoboxing when a primitive value is:
 * - Passed as a parameter to a method that expects an object of the corresponding wrapper class.
 * - Assigned to a variable of the corresponding wrapper class.
 */
public class VAR1F5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.F.5: When Java applies autoboxing\n");
        
        // Example 1: Autoboxing when assigning to a wrapper class variable
        System.out.println("Example 1: Autoboxing when assigning to a wrapper class variable");
        
        // Primitive int assigned to Integer variable (autoboxing)
        int primitiveInt = 42;
        Integer boxedInt = primitiveInt;  // Autoboxing occurs here
        
        System.out.println("int primitiveInt = 42;");
        System.out.println("Integer boxedInt = primitiveInt;  // Autoboxing occurs");
        System.out.println("boxedInt = " + boxedInt);
        
        // Primitive double assigned to Double variable (autoboxing)
        double primitiveDouble = 3.14159;
        Double boxedDouble = primitiveDouble;  // Autoboxing occurs here
        
        System.out.println("\ndouble primitiveDouble = 3.14159;");
        System.out.println("Double boxedDouble = primitiveDouble;  // Autoboxing occurs");
        System.out.println("boxedDouble = " + boxedDouble);
        System.out.println();
        
        // Example 2: Autoboxing when passing parameters to methods
        System.out.println("Example 2: Autoboxing when passing parameters to methods");
        
        // Passing primitive int to a method expecting Integer
        System.out.println("Calling processInteger(100): ");
        processInteger(100);  // 100 is autoboxed to Integer
        
        // Passing primitive double to a method expecting Double
        System.out.println("\nCalling processDouble(2.71828): ");
        processDouble(2.71828);  // 2.71828 is autoboxed to Double
        System.out.println();
        
        // Example 3: Autoboxing in collections
        System.out.println("Example 3: Autoboxing when adding to collections");
        
        // Creating a list that holds Integer objects
        System.out.println("Adding primitive ints to a List<Integer>:");
        java.util.List<Integer> numbers = new java.util.ArrayList<>();
        
        // Adding primitive ints to the list (autoboxing)
        numbers.add(10);  // 10 is autoboxed to Integer
        numbers.add(20);  // 20 is autoboxed to Integer
        numbers.add(30);  // 30 is autoboxed to Integer
        
        System.out.println("numbers.add(10);  // 10 is autoboxed to Integer");
        System.out.println("numbers.add(20);  // 20 is autoboxed to Integer");
        System.out.println("numbers.add(30);  // 30 is autoboxed to Integer");
        System.out.println("List contents: " + numbers);
        System.out.println();
        
        // Example 4: Autoboxing in conditional expressions
        System.out.println("Example 4: Autoboxing in conditional expressions");
        
        Integer nullableInteger = null;
        Integer validInteger = 42;
        
        // Using wrapper in conditional (safe because validInteger is not null)
        if (validInteger > 0) {  // validInteger is unboxed to int for comparison
            System.out.println("validInteger > 0 is true  // validInteger is unboxed for comparison");
        }
        
        // Safer way to check nullable wrappers
        System.out.println("\nSafe way to check nullable wrappers:");
        if (nullableInteger != null && nullableInteger > 0) {
            System.out.println("nullableInteger is positive");
        } else {
            System.out.println("nullableInteger is null or not positive");
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Key Points about When Autoboxing Applies ---");
        System.out.println("1. When assigning primitive values to wrapper class variables");
        System.out.println("2. When passing primitive values to methods expecting wrapper classes");
        System.out.println("3. When adding primitive values to collections of wrapper types");
        System.out.println("4. In expressions where wrapper objects are expected");
    }
    
    // Method that expects an Integer object
    public static void processInteger(Integer num) {
        System.out.println("Received Integer object with value: " + num);
        System.out.println("Behind the scenes: processInteger(Integer.valueOf(100))");
    }
    
    // Method that expects a Double object
    public static void processDouble(Double num) {
        System.out.println("Received Double object with value: " + num);
        System.out.println("Behind the scenes: processDouble(Double.valueOf(2.71828))");
    }
}
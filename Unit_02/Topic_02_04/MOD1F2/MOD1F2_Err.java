/**
 * MOD1F2_Err.java
 * 
 * This program demonstrates common errors related to parameter correspondence with method signatures.
 * 
 * Knowledge Point: MOD-1.F.2
 * Values provided in the parameter list need to correspond to the order and type in the method signature.
 */
public class MOD1F2_Err {
    public static void main(String[] args) {
        // Create an instance of the class to call non-static methods
        MOD1F2_Err demo = new MOD1F2_Err();
        
        System.out.println("Demonstrating common errors with parameter correspondence:\n");
        
        // ERROR 1: Providing parameters in the wrong order
        System.out.println("ERROR 1: Providing parameters in the wrong order");
        System.out.println("Method signature: displayPersonInfo(String name, int age)");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // demo.displayPersonInfo(25, "Alice"); // Error: incompatible types: int cannot be converted to String
        System.out.println();
        
        // ERROR 2: Providing incorrect number of parameters
        System.out.println("ERROR 2: Providing incorrect number of parameters");
        System.out.println("Method signature: displayPersonInfo(String name, int age)");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // demo.displayPersonInfo("Alice"); // Error: method displayPersonInfo(String) not found
        System.out.println();
        
        // ERROR 3: Providing parameters of incorrect types
        System.out.println("ERROR 3: Providing parameters of incorrect types");
        System.out.println("Method signature: calculateSum(int a, int b)");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // demo.calculateSum("5", "3"); // Error: incompatible types: String cannot be converted to int
        System.out.println();
        
        // ERROR 4: Attempting to use incompatible types without proper conversion
        System.out.println("ERROR 4: Attempting to use incompatible types without proper conversion");
        System.out.println("Method signature: displayDouble(double value)");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // demo.displayDouble("3.14"); // Error: incompatible types: String cannot be converted to double
        System.out.println();
        
        // ERROR 5: Forgetting that Java is strongly typed
        System.out.println("ERROR 5: Forgetting that Java is strongly typed");
        System.out.println("Method signature: processData(int id, String name)");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // demo.processData(1001, 1001); // Error: incompatible types: int cannot be converted to String
        System.out.println();
        
        // ERROR 6: Confusion with type promotion
        System.out.println("ERROR 6: Confusion with type promotion");
        System.out.println("Method signature: showValue(long value)");
        System.out.println("The following works because int can be promoted to long:");
        demo.showValue(42); // int can be promoted to long
        System.out.println("\nMethod signature: showValue(int value)");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // long bigNumber = 9876543210L;
        // demo.showValue(bigNumber); // Error: incompatible types: long cannot be converted to int
        System.out.println();
        
        // ERROR 7: Confusion with null values
        System.out.println("ERROR 7: Confusion with null values");
        System.out.println("Method signature: processString(String text)");
        System.out.println("The following works because null can be assigned to any reference type:");
        demo.processString(null); // This works
        System.out.println("\nMethod signature: processInt(int value)");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // demo.processInt(null); // Error: incompatible types: <null> cannot be converted to int
        System.out.println();
        
        // ERROR 8: Confusion with method overloading
        System.out.println("ERROR 8: Confusion with method overloading");
        System.out.println("Method signatures: process(int) and process(String)");
        System.out.println("The following calls are ambiguous when using null without casting:");
        // Uncommenting would cause a compilation error due to ambiguity
        // demo.process(null); // Error: reference to process is ambiguous
        System.out.println("To fix this, we need to cast the null value:");
        demo.process((String)null); // This works by specifying which overloaded method to call
        System.out.println();
        
        // Correct method calls for reference
        System.out.println("Correct method calls for reference:");
        demo.displayPersonInfo("Alice", 25);
        demo.calculateSum(5, 3);
        demo.displayDouble(3.14);
    }
    
    // Method with String and int parameters in specific order
    public void displayPersonInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    // Method that expects two int parameters
    public void calculateSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    
    // Method that expects a double parameter
    public void displayDouble(double value) {
        System.out.println("Double value: " + value);
    }
    
    // Method that expects specific types
    public void processData(int id, String name) {
        System.out.println("Processing data for ID: " + id + ", Name: " + name);
    }
    
    // Method that expects a long parameter (demonstrates widening conversion)
    public void showValue(long value) {
        System.out.println("Long value: " + value);
    }
    
    // Method that expects an int parameter (demonstrates no automatic narrowing)
    public void showValue(int value) {
        System.out.println("Int value: " + value);
    }
    
    // Method that expects a String parameter
    public void processString(String text) {
        if (text == null) {
            System.out.println("Processing null string");
        } else {
            System.out.println("Processing: " + text);
        }
    }
    
    // Method that expects an int parameter
    public void processInt(int value) {
        System.out.println("Processing int: " + value);
    }
    
    // Overloaded methods that can cause ambiguity with null
    public void process(String text) {
        if (text == null) {
            System.out.println("Processing null as String");
        } else {
            System.out.println("Processing String: " + text);
        }
    }
    
    public void process(Integer number) {
        if (number == null) {
            System.out.println("Processing null as Integer");
        } else {
            System.out.println("Processing Integer: " + number);
        }
    }
}
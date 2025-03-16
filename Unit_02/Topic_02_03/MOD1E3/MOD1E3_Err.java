/**
 * MOD1E3_Err.java
 * 
 * This program demonstrates common errors related to method signatures for methods without parameters.
 * 
 * Knowledge Point: MOD-1.E.3
 * A method signature for a method without parameters consists of the method name and an empty parameter list.
 */
public class MOD1E3_Err {
    public static void main(String[] args) {
        // Create an instance of the class to call non-static methods
        MOD1E3_Err demo = new MOD1E3_Err();
        
        System.out.println("Demonstrating common errors with method signatures for methods without parameters:\n");
        
        // ERROR 1: Trying to call a method with parameters when it doesn't accept any
        System.out.println("ERROR 1: Trying to call a method with parameters when it doesn't accept any");
        System.out.println("The following line would cause a compilation error:");
        // demo.greet("Hello");  // Error: method greet() in MOD1E3_Err cannot be applied to given types
        System.out.println("The method signature for greet() doesn't include any parameters.\n");
        
        // ERROR 2: Confusing method signatures with method names
        System.out.println("ERROR 2: Confusing method signatures with method names");
        System.out.println("Incorrect understanding: Thinking that 'greet' alone is the method signature");
        System.out.println("Correct understanding: The method signature is 'greet()'\n");
        
        // ERROR 3: Trying to call a method with the wrong signature
        System.out.println("ERROR 3: Trying to call a method with the wrong signature");
        System.out.println("The following line would cause a compilation error:");
        // demo.makeNoise();  // Error: cannot find symbol method makeNoise()
        System.out.println("The method signature makeNoise() doesn't exist, but makeSound() does.\n");
        
        // ERROR 4: Forgetting to include parentheses when calling a method
        System.out.println("ERROR 4: Forgetting to include parentheses when calling a method");
        System.out.println("The following line would cause a compilation error:");
        // demo.greet;  // Error: ';' expected
        System.out.println("Even for methods with no parameters, the empty parentheses are required.\n");
        
        // Demonstrate correct method calls
        System.out.println("Correct method calls with proper signatures:");
        demo.greet();        // Correct: matches the signature greet()
        demo.makeSound();    // Correct: matches the signature makeSound()
    }
    
    // Method with signature: greet()
    public void greet() {
        System.out.println("Hello! This is a method with no parameters.");
    }
    
    // Method with signature: makeSound()
    public void makeSound() {
        System.out.println("Beep! This is a sound made by a method with no parameters.");
    }
    
    // Method with a different signature: greet(String)
    // This is a different method than greet() because the signature is different
    public void greet(String name) {
        System.out.println("Hello, " + name + "! This is a method WITH a parameter.");
    }
}
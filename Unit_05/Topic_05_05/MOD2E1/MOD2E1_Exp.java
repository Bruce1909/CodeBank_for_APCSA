/**
 * MOD2E1_Exp.java
 * This program demonstrates void methods that do not return values (MOD-2.E.1).
 * 
 * @author AP CSA
 */
public class MOD2E1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating void methods that do not return values:\n");
        
        // Example 1: Basic void method with no parameters
        System.out.println("Example 1: Basic void method with no parameters");
        MessagePrinter printer = new MessagePrinter();
        System.out.println("Calling a void method with no parameters:");
        printer.printWelcome(); // Void method with no parameters
        System.out.println();
        
        // Example 2: Void method with parameters
        System.out.println("Example 2: Void method with parameters");
        System.out.println("Calling a void method with parameters:");
        printer.printCustomMessage("Hello, Java programmer!"); // Void method with a parameter
        System.out.println();
        
        // Example 3: Void method that modifies object state
        System.out.println("Example 3: Void method that modifies object state");
        Counter counter = new Counter();
        System.out.println("Initial count: " + counter.getCount());
        System.out.println("Calling increment() void method:");
        counter.increment(); // Void method that changes object state
        System.out.println("Count after increment(): " + counter.getCount());
        System.out.println("Calling incrementBy(5) void method:");
        counter.incrementBy(5); // Void method with parameter that changes object state
        System.out.println("Count after incrementBy(5): " + counter.getCount());
        System.out.println();
        
        // Example 4: Void method in a utility class
        System.out.println("Example 4: Void method in a utility class");
        System.out.println("Before calling TextFormatter.printCentered():");
        TextFormatter.printCentered("Centered Text", 30); // Static void method with parameters
        System.out.println("After calling TextFormatter.printCentered()");
        System.out.println();
        
        // Example 5: Void method calling other void methods
        System.out.println("Example 5: Void method calling other void methods");
        UserInterface ui = new UserInterface();
        System.out.println("Calling displayMenu() which calls other void methods:");
        ui.displayMenu(); // Void method that calls other void methods
        System.out.println();
        
        System.out.println("Key points about void methods:");
        System.out.println("- Void methods do not return any value");
        System.out.println("- The method header contains the keyword 'void' before the method name");
        System.out.println("- Void methods are often used to perform actions or modify object state");
        System.out.println("- Void methods can have parameters to receive input");
        System.out.println("- Void methods can call other methods, including other void methods");
        System.out.println("- The 'return' statement in a void method (if present) must not return a value");
    }
}

/**
 * A class that demonstrates basic void methods for printing messages.
 */
class MessagePrinter {
    /**
     * A void method with no parameters that prints a welcome message.
     * Note the 'void' keyword in the method header.
     */
    public void printWelcome() {
        System.out.println("Welcome to the Void Method Demonstration!");
    }
    
    /**
     * A void method with a parameter that prints a custom message.
     * 
     * @param message the message to print
     */
    public void printCustomMessage(String message) {
        System.out.println("Custom message: " + message);
    }
}

/**
 * A class that demonstrates void methods that modify object state.
 */
class Counter {
    private int count = 0;
    
    /**
     * A non-void method that returns the current count.
     * 
     * @return the current count
     */
    public int getCount() {
        return count;
    }
    
    /**
     * A void method that increments the count by 1.
     * This method modifies the object's state but doesn't return a value.
     */
    public void increment() {
        count++;
        // Note: No return statement is needed in a void method
    }
    
    /**
     * A void method with a parameter that increments the count by a specified amount.
     * 
     * @param amount the amount to increment by
     */
    public void incrementBy(int amount) {
        count += amount;
        // A void method can include a return statement without a value to exit early
        if (count > 100) {
            System.out.println("Count exceeded 100, resetting to 100.");
            count = 100;
            return; // Early exit from the method (no value is returned)
        }
    }
}

/**
 * A utility class with static void methods.
 */
class TextFormatter {
    /**
     * A static void method that prints centered text.
     * 
     * @param text the text to center
     * @param width the total width of the line
     */
    public static void printCentered(String text, int width) {
        int padding = (width - text.length()) / 2;
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.println(text);
    }
}

/**
 * A class that demonstrates void methods calling other void methods.
 */
class UserInterface {
    /**
     * A void method that calls other void methods to display a complete menu.
     */
    public void displayMenu() {
        displayHeader();
        displayOptions();
        displayFooter();
    }
    
    /**
     * A private void method that displays the header of the menu.
     */
    private void displayHeader() {
        System.out.println("===== MENU =====");
    }
    
    /**
     * A private void method that displays the options of the menu.
     */
    private void displayOptions() {
        System.out.println("1. Option One");
        System.out.println("2. Option Two");
        System.out.println("3. Option Three");
    }
    
    /**
     * A private void method that displays the footer of the menu.
     */
    private void displayFooter() {
        System.out.println("===============");
    }
}
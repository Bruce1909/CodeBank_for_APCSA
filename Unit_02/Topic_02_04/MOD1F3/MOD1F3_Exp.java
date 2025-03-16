/**
 * MOD1F3_Exp.java
 * 
 * This program demonstrates method overloading, where multiple methods have the same name
 * but different signatures.
 * 
 * Knowledge Point: MOD-1.F.3
 * Methods are said to be overloaded when there are multiple methods with the same name but a different signature.
 */
public class MOD1F3_Exp {
    public static void main(String[] args) {
        // Create an instance of the class to call non-static methods
        MOD1F3_Exp demo = new MOD1F3_Exp();
        
        System.out.println("Demonstrating method overloading:\n");
        
        // Example 1: Calling overloaded methods with different number of parameters
        System.out.println("Example 1: Overloaded methods with different number of parameters");
        System.out.println("Method signatures: display(), display(String), display(String, int)");
        demo.display(); // Calls display()
        demo.display("Hello"); // Calls display(String)
        demo.display("Hello", 42); // Calls display(String, int)
        System.out.println();
        
        // Example 2: Calling overloaded methods with different parameter types
        System.out.println("Example 2: Overloaded methods with different parameter types");
        System.out.println("Method signatures: calculate(int, int), calculate(double, double)");
        demo.calculate(5, 3); // Calls calculate(int, int)
        demo.calculate(5.5, 3.3); // Calls calculate(double, double)
        System.out.println();
        
        // Example 3: Calling overloaded methods with different parameter order
        System.out.println("Example 3: Overloaded methods with different parameter order");
        System.out.println("Method signatures: combine(String, int), combine(int, String)");
        demo.combine("Count: ", 10); // Calls combine(String, int)
        demo.combine(20, " items"); // Calls combine(int, String)
        System.out.println();
        
        // Example 4: Automatic type promotion with overloaded methods
        System.out.println("Example 4: Automatic type promotion with overloaded methods");
        System.out.println("Method signatures: showValue(int), showValue(long), showValue(double)");
        int intValue = 10;
        long longValue = 1000L;
        double doubleValue = 3.14159;
        
        System.out.println("Calling with int value:");
        demo.showValue(intValue); // Calls showValue(int)
        
        System.out.println("\nCalling with long value:");
        demo.showValue(longValue); // Calls showValue(long)
        
        System.out.println("\nCalling with double value:");
        demo.showValue(doubleValue); // Calls showValue(double)
        
        System.out.println("\nCalling with int when no exact match exists:");
        demo.showValueNoInt(intValue); // Calls showValueNoInt(long) through type promotion
        System.out.println();
        
        // Example 5: Overloaded methods with different return types
        System.out.println("Example 5: Overloaded methods with different return types");
        System.out.println("Note: Methods cannot be overloaded based on return type alone.");
        System.out.println("The parameter list must be different for overloading to work.");
        System.out.println();
        
        // Example 6: Practical example of method overloading with a Rectangle class
        System.out.println("Example 6: Practical example with Rectangle class");
        System.out.println("Method signatures: createRectangle(), createRectangle(int), createRectangle(int, int)");
        
        Rectangle rect1 = demo.createRectangle(); // Default rectangle
        System.out.println("Default rectangle: " + rect1.getWidth() + " x " + rect1.getHeight());
        
        Rectangle rect2 = demo.createRectangle(5); // Square with width and height = 5
        System.out.println("Square: " + rect2.getWidth() + " x " + rect2.getHeight());
        
        Rectangle rect3 = demo.createRectangle(8, 4); // Rectangle with width = 8, height = 4
        System.out.println("Custom rectangle: " + rect3.getWidth() + " x " + rect3.getHeight());
    }
    
    // Overloaded methods with different number of parameters
    public void display() {
        System.out.println("No parameters");
    }
    
    public void display(String message) {
        System.out.println("One parameter: " + message);
    }
    
    public void display(String message, int number) {
        System.out.println("Two parameters: " + message + ", " + number);
    }
    
    // Overloaded methods with different parameter types
    public void calculate(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of integers: " + a + " + " + b + " = " + sum);
    }
    
    public void calculate(double a, double b) {
        double sum = a + b;
        System.out.println("Sum of doubles: " + a + " + " + b + " = " + sum);
    }
    
    // Overloaded methods with different parameter order
    public void combine(String text, int number) {
        System.out.println("String then int: " + text + number);
    }
    
    public void combine(int number, String text) {
        System.out.println("Int then String: " + number + text);
    }
    
    // Overloaded methods demonstrating type promotion
    public void showValue(int value) {
        System.out.println("showValue(int): " + value);
    }
    
    public void showValue(long value) {
        System.out.println("showValue(long): " + value);
    }
    
    public void showValue(double value) {
        System.out.println("showValue(double): " + value);
    }
    
    // Overloaded methods without an int version to demonstrate promotion
    public void showValueNoInt(long value) {
        System.out.println("showValueNoInt(long): " + value + " (int was promoted to long)");
    }
    
    public void showValueNoInt(double value) {
        System.out.println("showValueNoInt(double): " + value);
    }
    
    // Overloaded methods for creating rectangles
    public Rectangle createRectangle() {
        // Default rectangle with width=1, height=1
        return new Rectangle(1, 1);
    }
    
    public Rectangle createRectangle(int size) {
        // Square with equal width and height
        return new Rectangle(size, size);
    }
    
    public Rectangle createRectangle(int width, int height) {
        // Rectangle with custom width and height
        return new Rectangle(width, height);
    }
    
    // Inner class for the Rectangle example
    class Rectangle {
        private int width;
        private int height;
        
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
        
        public int getWidth() {
            return width;
        }
        
        public int getHeight() {
            return height;
        }
    }
}
/**
 * MOD1F2_Exp.java
 * 
 * This program demonstrates how parameter values need to correspond to the order and type in the method signature.
 * 
 * Knowledge Point: MOD-1.F.2
 * Values provided in the parameter list need to correspond to the order and type in the method signature.
 */
public class MOD1F2_Exp {
    public static void main(String[] args) {
        // Create an instance of the class to call non-static methods
        MOD1F2_Exp demo = new MOD1F2_Exp();
        
        System.out.println("Demonstrating parameter correspondence with method signatures:\n");
        
        // Example 1: Calling a method with a single parameter
        System.out.println("Example 1: Calling a method with a single parameter");
        String name = "Alice";
        System.out.println("Parameter value: " + name + " (type: String)");
        System.out.println("Method signature: greet(String)");
        demo.greet(name);
        System.out.println();
        
        // Example 2: Calling a method with multiple parameters in correct order
        System.out.println("Example 2: Calling a method with multiple parameters in correct order");
        String studentName = "Bob";
        int studentAge = 20;
        double studentGPA = 3.85;
        System.out.println("Parameter values: " + studentName + " (type: String), " + 
                           studentAge + " (type: int), " + studentGPA + " (type: double)");
        System.out.println("Method signature: displayStudentInfo(String, int, double)");
        demo.displayStudentInfo(studentName, studentAge, studentGPA);
        System.out.println();
        
        // Example 3: Calling a method with parameters of different types
        System.out.println("Example 3: Calling a method with parameters of different types");
        int productId = 1001;
        String productName = "Laptop";
        double productPrice = 999.99;
        boolean inStock = true;
        System.out.println("Parameter values: " + productId + " (type: int), " + 
                           productName + " (type: String), " + productPrice + " (type: double), " +
                           inStock + " (type: boolean)");
        System.out.println("Method signature: displayProductInfo(int, String, double, boolean)");
        demo.displayProductInfo(productId, productName, productPrice, inStock);
        System.out.println();
        
        // Example 4: Automatic type conversion for compatible types
        System.out.println("Example 4: Automatic type conversion for compatible types");
        int intValue = 5;
        System.out.println("Parameter value: " + intValue + " (type: int)");
        System.out.println("Method signature: showDoubleValue(double)");
        System.out.println("Note: int can be automatically converted to double");
        demo.showDoubleValue(intValue); // int is automatically converted to double
        System.out.println();
        
        // Example 5: Using expressions as parameters
        System.out.println("Example 5: Using expressions as parameters");
        System.out.println("Expression: 5 + 3 (evaluates to 8, type: int)");
        System.out.println("Method signature: displayNumber(int)");
        demo.displayNumber(5 + 3); // Expression evaluates to 8
        System.out.println();
        
        // Example 6: Using method return values as parameters
        System.out.println("Example 6: Using method return values as parameters");
        System.out.println("Method call: getGreeting() returns a String");
        System.out.println("Method signature: printMessage(String)");
        demo.printMessage(demo.getGreeting()); // Using return value of getGreeting() as parameter
        System.out.println();
        
        // Example 7: Using null for reference type parameters
        System.out.println("Example 7: Using null for reference type parameters");
        System.out.println("Parameter value: null");
        System.out.println("Method signature: greet(String)");
        demo.greet(null); // null can be used for any reference type
        System.out.println();
    }
    
    // Method with a single String parameter
    public void greet(String name) {
        if (name == null) {
            System.out.println("Hello, anonymous person!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
    
    // Method with multiple parameters
    public void displayStudentInfo(String name, int age, double gpa) {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
    
    // Method with parameters of different types
    public void displayProductInfo(int id, String name, double price, boolean available) {
        System.out.println("Product Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("In Stock: " + (available ? "Yes" : "No"));
    }
    
    // Method that takes a double parameter
    public void showDoubleValue(double value) {
        System.out.println("The double value is: " + value);
    }
    
    // Method that takes an int parameter
    public void displayNumber(int num) {
        System.out.println("The number is: " + num);
    }
    
    // Method that returns a String
    public String getGreeting() {
        return "Welcome to Java Programming!";
    }
    
    // Method that takes a String parameter
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }
}
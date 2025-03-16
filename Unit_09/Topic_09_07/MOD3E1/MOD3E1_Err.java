/**
 * MOD3E1_Err.java
 * This program demonstrates common errors when working with Object as the superclass.
 * 
 * MOD-3.E.1: The Object class is the superclass of all other classes in Java.
 */

public class MOD3E1_Err {
    public static void main(String[] args) {
        // Create instances of different classes
        String str = "Hello";
        Integer num = 42;
        ErrorClass errorObj = new ErrorClass();
        
        System.out.println("Demonstrating common errors with Object as superclass:\n");
        
        // ERROR 1: Trying to access specific methods through Object reference without casting
        Object obj1 = str;
        // The following line would cause a compilation error because
        // Object class doesn't have a length() method
        // System.out.println("String length: " + obj1.length());
        System.out.println("ERROR 1: Cannot access String's length() method through Object reference");
        System.out.println("Correct way: String length: " + ((String)obj1).length());
        
        // ERROR 2: Assuming all objects can be cast to any type
        Object obj2 = num;
        try {
            // This will cause a ClassCastException at runtime
            String strFromNum = (String)obj2;
            System.out.println("This line won't execute");
        } catch (ClassCastException e) {
            System.out.println("\nERROR 2: ClassCastException when casting Integer to String");
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Correct way: First check type with instanceof");
        }
        
        // ERROR 3: Forgetting that primitive types are not Objects
        int primitive = 100;
        // The following line would cause a compilation error
        // Object objPrimitive = primitive; // Cannot convert from int to Object directly
        System.out.println("\nERROR 3: Cannot store primitive directly in Object reference");
        System.out.println("Correct way: Use wrapper class: Object objPrimitive = Integer.valueOf(primitive);");
        
        // ERROR 4: Incorrect implementation of toString() method
        Object errorObject = new ErrorClass();
        System.out.println("\nERROR 4: Incorrect toString() implementation:");
        System.out.println("toString() result: " + errorObject.toString());
        System.out.println("This returns the default Object.toString() implementation");
        System.out.println("because ErrorClass.toString() doesn't use @Override and has wrong signature");
    }
}

/**
 * A class with errors in overriding Object methods
 */
class ErrorClass {
    private String name = "Error Object";
    
    // ERROR: Incorrect method signature for toString
    // Missing @Override annotation and wrong parameter
    public String toString(String param) {
        return name;
    }
    
    // The correct implementation would be:
    /*
    @Override
    public String toString() {
        return name;
    }
    */
}
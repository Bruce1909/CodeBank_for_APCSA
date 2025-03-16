/**
 * MOD3E1_Exp.java
 * This program demonstrates that the Object class is the superclass of all other classes in Java.
 * 
 * MOD-3.E.1: The Object class is the superclass of all other classes in Java.
 */

public class MOD3E1_Exp {
    public static void main(String[] args) {
        // Create instances of different classes
        String str = "Hello";
        Integer num = 42;
        MOD3E1_Exp thisClass = new MOD3E1_Exp();
        CustomClass custom = new CustomClass();
        
        // Demonstrate that all classes inherit from Object
        System.out.println("Demonstrating that all classes inherit from Object:\n");
        
        // Check if String is an instance of Object
        System.out.println("Is String an instance of Object? " + (str instanceof Object));
        
        // Check if Integer is an instance of Object
        System.out.println("Is Integer an instance of Object? " + (num instanceof Object));
        
        // Check if our custom class is an instance of Object
        System.out.println("Is CustomClass an instance of Object? " + (custom instanceof Object));
        
        // Check if this class is an instance of Object
        System.out.println("Is MOD3E1_Exp an instance of Object? " + (thisClass instanceof Object));
        
        // Demonstrate that we can store any object in a variable of type Object
        Object obj1 = str;      // String to Object
        Object obj2 = num;      // Integer to Object
        Object obj3 = custom;   // CustomClass to Object
        Object obj4 = thisClass; // MOD3E1_Exp to Object
        
        System.out.println("\nStoring different objects in Object variables:");
        System.out.println("obj1 (String): " + obj1);
        System.out.println("obj2 (Integer): " + obj2);
        System.out.println("obj3 (CustomClass): " + obj3);
        System.out.println("obj4 (MOD3E1_Exp): " + obj4);
        
        // Show that Object is at the top of the inheritance hierarchy
        System.out.println("\nInheritance hierarchy for CustomClass:");
        printClassHierarchy(custom.getClass());
    }
    
    /**
     * Prints the inheritance hierarchy of a class up to Object
     * @param clazz The class to print the hierarchy for
     */
    public static void printClassHierarchy(Class<?> clazz) {
        if (clazz == null) {
            return;
        }
        
        System.out.println(clazz.getName());
        
        // Get the superclass and print it
        Class<?> superClass = clazz.getSuperclass();
        if (superClass != null) {
            System.out.print(" extends ");
            printClassHierarchy(superClass);
        }
    }
}

/**
 * A simple custom class to demonstrate inheritance from Object
 */
class CustomClass {
    private String name = "Custom Object";
    
    @Override
    public String toString() {
        return name;
    }
}
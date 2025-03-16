/**
 * VAR1C2_Exp - Variable Memory Association Example
 * 
 * This program demonstrates the concept that each variable has associated memory
 * that is used to hold its value as specified in VAR-1.C.2.
 */
public class VAR1C2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Variable Memory Association:\n");
        
        // Example 1: Declaring variables allocates memory
        System.out.println("Example 1: Declaring variables allocates memory");
        
        int count;      // Memory is allocated for an integer value
        double price;   // Memory is allocated for a double-precision floating-point value
        boolean flag;   // Memory is allocated for a boolean value
        
        // Initialize the variables
        count = 42;
        price = 19.99;
        flag = true;
        
        System.out.println("count: " + count + " (stored in memory allocated for an int)");
        System.out.println("price: " + price + " (stored in memory allocated for a double)");
        System.out.println("flag: " + flag + " (stored in memory allocated for a boolean)");
        System.out.println();
        
        // Example 2: Changing variable values updates the memory
        System.out.println("Example 2: Changing variable values updates the memory");
        
        System.out.println("Original values:");
        System.out.println("count: " + count);
        System.out.println("price: " + price);
        System.out.println("flag: " + flag);
        
        // Update the values (changing what's stored in memory)
        count = 100;
        price = 29.95;
        flag = false;
        
        System.out.println("\nAfter updating:");
        System.out.println("count: " + count + " (memory now contains this new value)");
        System.out.println("price: " + price + " (memory now contains this new value)");
        System.out.println("flag: " + flag + " (memory now contains this new value)");
        System.out.println();
        
        // Example 3: Different variables have separate memory
        System.out.println("Example 3: Different variables have separate memory");
        
        int x = 5;
        int y = 10;
        
        System.out.println("x: " + x + " (stored in memory location for x)");
        System.out.println("y: " + y + " (stored in different memory location for y)");
        
        // Changing one variable doesn't affect the other
        x = 20;
        System.out.println("\nAfter changing x to 20:");
        System.out.println("x: " + x + " (memory for x is updated)");
        System.out.println("y: " + y + " (memory for y remains unchanged)");
        System.out.println();
        
        // Example 4: Memory size depends on the data type
        System.out.println("Example 4: Memory size depends on the data type");
        
        System.out.println("Different primitive types use different amounts of memory:");
        System.out.println("- boolean: 1 bit of information (conceptually), implementation-dependent");
        System.out.println("- int: 32 bits (4 bytes) of memory");
        System.out.println("- double: 64 bits (8 bytes) of memory");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Variable Memory Association ---");
        System.out.println("1. Each variable declaration allocates memory appropriate for its type");
        System.out.println("2. The memory holds the current value of the variable");
        System.out.println("3. When a variable's value changes, its memory is updated");
        System.out.println("4. Different variables use separate memory locations");
        System.out.println("5. The amount of memory used depends on the variable's data type");
    }
}
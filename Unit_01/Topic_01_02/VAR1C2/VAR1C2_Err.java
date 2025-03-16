/**
 * VAR1C2_Err - Variable Memory Association Error Demonstration
 * 
 * This program demonstrates common errors and misconceptions about variable memory
 * association as specified in VAR-1.C.2.
 */
public class VAR1C2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Misconceptions about Variable Memory:\n");
        
        // ERROR 1: Misconception that variables share memory
        System.out.println("ERROR 1: Misconception that variables share memory");
        
        int a = 5;
        int b = a; // b gets a copy of a's value, not a reference to a's memory
        
        System.out.println("Initial values: a = " + a + ", b = " + b);
        
        // Change the value of a
        a = 10;
        System.out.println("After changing a to 10: a = " + a + ", b = " + b);
        System.out.println("Note that b still has the original value because it has its own memory");
        System.out.println("This is different from reference types where variables can share memory");
        System.out.println();
        
        // ERROR 2: Misconception about variable initialization
        System.out.println("ERROR 2: Misconception about variable initialization");
        
        try {
            System.out.println("Attempting to use an uninitialized variable...");
            int uninitializedVar; // Memory is allocated but no value is assigned
            // Uncommenting the next line would cause a compilation error
            // System.out.println("Value: " + uninitializedVar); // Error: variable might not have been initialized
            System.out.println("This would cause a compilation error because the variable has memory");
            System.out.println("allocated but no value has been assigned to that memory");
            System.out.println("Correct approach: Initialize the variable before using it");
            int initializedVar = 0; // Memory is allocated and a value is assigned
            System.out.println("Value of initialized variable: " + initializedVar);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 3: Misconception about memory size and overflow
        System.out.println("ERROR 3: Misconception about memory size and overflow");
        
        try {
            int maxInt = Integer.MAX_VALUE; // 2^31 - 1
            System.out.println("Maximum int value: " + maxInt);
            
            // Attempting to exceed the memory capacity of an int
            System.out.println("Adding 1 to maximum int value: " + (maxInt + 1));
            System.out.println("This causes overflow, wrapping around to the minimum int value");
            System.out.println("This happens because an int has fixed memory (32 bits)");
            System.out.println("Correct approach: Use a larger data type like long when needed");
            long largeValue = (long)maxInt + 1;
            System.out.println("Using long: " + largeValue);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // ERROR 4: Misconception about memory and variable scope
        System.out.println("ERROR 4: Misconception about memory and variable scope");
        
        try {
            // Demonstrate block scope
            {
                int blockVar = 100; // Memory is allocated
                System.out.println("Inside block: blockVar = " + blockVar);
            } // Memory for blockVar is released when the block ends
            
            // Uncommenting the next line would cause a compilation error
            // System.out.println("Outside block: blockVar = " + blockVar); // Error: cannot find symbol
            System.out.println("Attempting to access blockVar outside its block would cause an error");
            System.out.println("This is because the memory associated with blockVar is no longer accessible");
            System.out.println("Correct approach: Declare variables in the appropriate scope");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Variable Memory Misconceptions ---");
        System.out.println("1. Primitive variables have their own memory; changing one doesn't affect others");
        System.out.println("2. Variables must be initialized before their memory can be accessed");
        System.out.println("3. Each primitive type has a fixed amount of memory and can overflow");
        System.out.println("4. Memory for variables is only accessible within their scope");
    }
}
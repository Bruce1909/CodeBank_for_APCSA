/**
 * VAR-2.D.5 Example
 * ArrayList<E> is preferred over ArrayList because it allows the compiler to find errors 
 * that would otherwise be found at run-time.
 * 
 * This program demonstrates the advantages of using generic ArrayList<E> over raw ArrayList.
 */
import java.util.ArrayList;

public class VAR2D5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating the advantages of ArrayList<E> over raw ArrayList:\n");
        
        // Using generic ArrayList<String>
        System.out.println("1. Using generic ArrayList<String>:");
        ArrayList<String> typedList = new ArrayList<String>();
        typedList.add("Hello");
        typedList.add("World");
        
        // Compile-time type checking prevents adding wrong types
        System.out.println("Compile-time type checking prevents adding wrong types:");
        System.out.println("// typedList.add(42); // This would not compile");
        
        // No casting needed when retrieving elements
        String firstElement = typedList.get(0); // No cast needed
        System.out.println("Retrieved element without casting: " + firstElement);
        
        // Using the elements is type-safe
        System.out.println("Using elements is type-safe:");
        for (String s : typedList) {
            System.out.println("  String length: " + s.length()); // Safe to call String methods
        }
        
        // Using raw ArrayList (not recommended)
        System.out.println("\n2. Using raw ArrayList (not recommended):");
        ArrayList rawList = new ArrayList();
        rawList.add("Hello");
        rawList.add(123); // Can add any type (no compile-time checking)
        
        System.out.println("Raw list can contain mixed types: " + rawList);
        
        // Need explicit casting when retrieving elements
        System.out.println("\nNeed explicit casting when retrieving elements:");
        String firstRawElement = (String) rawList.get(0); // Cast required
        System.out.println("Retrieved first element with casting: " + firstRawElement);
        
        // Risk of runtime errors
        System.out.println("\nRisk of runtime errors with raw ArrayList:");
        try {
            // This will cause a ClassCastException
            String secondRawElement = (String) rawList.get(1); // Runtime error!
            System.out.println("This line won't execute");
        } catch (ClassCastException e) {
            System.out.println("Runtime error caught: " + e.getMessage());
            System.out.println("This error would have been caught at compile-time with ArrayList<String>");
        }
        
        // Demonstrating type safety with a method
        System.out.println("\n3. Demonstrating type safety with methods:");
        
        // This is safe - compiler ensures we only pass ArrayList<String>
        processStrings(typedList);
        
        // This would cause a compile-time error if uncommented
        System.out.println("The following would not compile:");
        System.out.println("// processStrings(rawList); // Compiler error: unchecked conversion");
        
        // This would compile but could cause runtime errors
        System.out.println("\nThe following compiles but is unsafe:");
        processRawList(rawList); // Works but is not type-safe
        processRawList(typedList); // Also works - can pass ArrayList<String> to raw ArrayList parameter
    }
    
    // Method that expects ArrayList<String>
    public static void processStrings(ArrayList<String> strings) {
        System.out.println("Processing strings safely:");
        for (String s : strings) {
            System.out.println("  Processing: " + s.toUpperCase()); // Safe to call String methods
        }
    }
    
    // Method that accepts raw ArrayList
    @SuppressWarnings("rawtypes")
    public static void processRawList(ArrayList list) {
        System.out.println("Processing raw list (unsafe):");
        try {
            for (Object obj : list) {
                // Unsafe - assumes all elements are Strings
                String s = (String) obj;
                System.out.println("  Processing: " + s.toUpperCase());
            }
        } catch (ClassCastException e) {
            System.out.println("  Error: " + e.getMessage());
            System.out.println("  This error would have been caught at compile-time with generics");
        }
    }
}
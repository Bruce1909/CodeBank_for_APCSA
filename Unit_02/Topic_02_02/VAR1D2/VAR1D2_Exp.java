/**
 * This program demonstrates the correct use of reference data types
 * VAR-1.D.2: The memory associated with a variable of a reference type holds an object reference value or,
 * if there is no object, null. This value is the memory address of the referenced object.
 */
public class VAR1D2_Exp {
    public static void main(String[] args) {
        // Creating reference variables
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        // Demonstrating that str1 and str2 reference the same object in memory
        // (String literals with the same value are typically interned)
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str1 == str2: " + (str1 == str2)); // true - same reference
        
        // str3 is a different object in memory, even though it has the same value
        System.out.println("\nstr3: " + str3);
        System.out.println("str1 == str3: " + (str1 == str3)); // false - different reference
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true - same content
        
        // Demonstrating reference assignment
        System.out.println("\nAssigning str3 to str4:");
        String str4 = str3; // str4 now references the same object as str3
        System.out.println("str4: " + str4);
        System.out.println("str3 == str4: " + (str3 == str4)); // true - same reference
        
        // Changing the object through one reference
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = sb1; // sb2 references the same object as sb1
        
        System.out.println("\nInitial values:");
        System.out.println("sb1: " + sb1);
        System.out.println("sb2: " + sb2);
        
        // Modifying the object through sb2 reference
        sb2.append(" World");
        
        System.out.println("\nAfter modifying through sb2:");
        System.out.println("sb1: " + sb1); // Also changed because sb1 and sb2 reference the same object
        System.out.println("sb2: " + sb2);
        
        // Setting a reference to null
        System.out.println("\nSetting sb1 to null:");
        sb1 = null;
        System.out.println("sb1: " + sb1);
        System.out.println("sb2: " + sb2); // sb2 still references the object
    }
}
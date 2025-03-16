/**
 * VAR2A3_Exp.java
 * This program demonstrates that arrays can store either primitive data
 * or object reference data (VAR-2.A.3).
 */
public class VAR2A3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating arrays storing primitive and reference data:\n");
        
        // Example 1: Arrays of primitive data types
        System.out.println("Example 1: Arrays of primitive data types");
        
        // Integer array (primitive)
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.println("Created an int[] array (primitive type)");
        
        // Double array (primitive)
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Created a double[] array (primitive type)");
        
        // Boolean array (primitive)
        boolean[] booleanArray = {true, false, true, true, false};
        System.out.println("Created a boolean[] array (primitive type)");
        
        // Character array (primitive)
        char[] charArray = {'J', 'a', 'v', 'a'};
        System.out.println("Created a char[] array (primitive type)");
        
        // Display primitive arrays
        System.out.print("\nint array contents: ");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        
        System.out.print("\ndouble array contents: ");
        for (double value : doubleArray) {
            System.out.print(value + " ");
        }
        
        System.out.print("\nboolean array contents: ");
        for (boolean value : booleanArray) {
            System.out.print(value + " ");
        }
        
        System.out.print("\nchar array contents: ");
        for (char value : charArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        // Example 2: Arrays of object references
        System.out.println("\nExample 2: Arrays of object references");
        
        // String array (reference type)
        String[] stringArray = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        System.out.println("Created a String[] array (reference type)");
        
        // Integer wrapper class array (reference type)
        Integer[] integerArray = {new Integer(100), new Integer(200), new Integer(300)};
        System.out.println("Created an Integer[] array (reference type)");
        
        // Custom object array
        Student[] studentArray = new Student[3];
        studentArray[0] = new Student("Alice", 95);
        studentArray[1] = new Student("Bob", 87);
        studentArray[2] = new Student("Charlie", 91);
        System.out.println("Created a Student[] array (custom reference type)");
        
        // Display reference type arrays
        System.out.print("\nString array contents: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        
        System.out.print("\nInteger array contents: ");
        for (Integer value : integerArray) {
            System.out.print(value + " ");
        }
        
        System.out.println("\nStudent array contents:");
        for (Student student : studentArray) {
            System.out.println("  " + student);
        }
        
        // Key differences
        System.out.println("\nKey differences between primitive and reference arrays:");
        System.out.println("1. Primitive arrays store the actual values");
        System.out.println("2. Reference arrays store references (addresses) to objects");
        System.out.println("3. Elements in reference arrays can be null");
        System.out.println("4. Modifying an object through one reference affects all references to that object");
    }
}

/**
 * A simple Student class for demonstrating arrays of custom objects
 */
class Student {
    private String name;
    private int score;
    
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
    @Override
    public String toString() {
        return "Student[name=" + name + ", score=" + score + "]";
    }
}
/**
 * VAR2A4_Exp.java
 * This program demonstrates how arrays are initialized with default values
 * when created using the keyword 'new' (VAR-2.A.4).
 */
public class VAR2A4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating default initialization of arrays:\n");
        
        // Example 1: int array initialization
        System.out.println("Example 1: int array initialization");
        int[] intArray = new int[5];
        System.out.println("Created an int array with 5 elements using 'new int[5]'");
        
        System.out.print("Default values: ");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nElements of type int are initialized to 0");
        
        // Example 2: double array initialization
        System.out.println("\nExample 2: double array initialization");
        double[] doubleArray = new double[5];
        System.out.println("Created a double array with 5 elements using 'new double[5]'");
        
        System.out.print("Default values: ");
        for (double value : doubleArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nElements of type double are initialized to 0.0");
        
        // Example 3: boolean array initialization
        System.out.println("\nExample 3: boolean array initialization");
        boolean[] booleanArray = new boolean[5];
        System.out.println("Created a boolean array with 5 elements using 'new boolean[5]'");
        
        System.out.print("Default values: ");
        for (boolean value : booleanArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nElements of type boolean are initialized to false");
        
        // Example 4: reference type array initialization
        System.out.println("\nExample 4: reference type array initialization");
        String[] stringArray = new String[5];
        System.out.println("Created a String array with 5 elements using 'new String[5]'");
        
        System.out.print("Default values: ");
        for (String value : stringArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nElements of reference type are initialized to null");
        
        // Example 5: custom object array initialization
        System.out.println("\nExample 5: custom object array initialization");
        Student[] studentArray = new Student[3];
        System.out.println("Created a Student array with 3 elements using 'new Student[3]'");
        
        System.out.println("Default values:");
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("studentArray[" + i + "] = " + studentArray[i]);
        }
        System.out.println("Elements of reference type are initialized to null");
        System.out.println("No Student objects are automatically created");
        
        // Initializing the Student objects explicitly
        System.out.println("\nAfter explicitly creating Student objects:");
        studentArray[0] = new Student("Alice", 95);
        studentArray[1] = new Student("Bob", 87);
        studentArray[2] = new Student("Charlie", 91);
        
        for (Student student : studentArray) {
            System.out.println(student);
        }
        
        // Summary
        System.out.println("\nSummary of default initialization:");
        System.out.println("1. int arrays: initialized to 0");
        System.out.println("2. double arrays: initialized to 0.0");
        System.out.println("3. boolean arrays: initialized to false");
        System.out.println("4. Reference type arrays: initialized to null");
        System.out.println("5. For reference types, you must explicitly create the objects");
    }
}

/**
 * A simple Student class for demonstrating reference array initialization
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
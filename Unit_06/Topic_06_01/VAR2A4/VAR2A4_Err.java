/**
 * VAR2A4_Err.java
 * This program demonstrates common errors related to array initialization
 * with default values when using the keyword 'new' (VAR-2.A.4).
 */
public class VAR2A4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors related to array initialization:\n");
        
        // ERROR 1: Assuming non-zero default values for primitive arrays
        System.out.println("ERROR 1: Assuming non-zero default values for primitive arrays");
        int[] scores = new int[5];
        System.out.println("Created an int array with 5 elements using 'new int[5]'");
        
        // Common misconception: assuming elements have random or non-zero values
        System.out.println("Common misconception: assuming elements have random or non-zero values");
        System.out.print("Actual values: ");
        for (int score : scores) {
            System.out.print(score + " "); // All zeros
        }
        System.out.println("\nCorrect understanding: int arrays are initialized to 0");
        
        // ERROR 2: Forgetting to initialize reference type arrays before use
        System.out.println("\nERROR 2: Forgetting to initialize reference type arrays before use");
        String[] names = new String[3];
        System.out.println("Created a String array with 3 elements using 'new String[3]'");
        
        System.out.println("Common error: trying to use methods on uninitialized elements");
        System.out.println("// String firstNameUpper = names[0].toUpperCase(); // NullPointerException");
        
        // Correct approach: check for null before using methods
        System.out.println("Correct approach: check for null before using methods");
        System.out.println("if (names[0] != null) {");
        System.out.println("    String firstNameUpper = names[0].toUpperCase();");
        System.out.println("}");
        
        // ERROR 3: Confusing array of objects creation with object creation
        System.out.println("\nERROR 3: Confusing array of objects creation with object creation");
        Student[] students = new Student[3];
        System.out.println("Created a Student array with 3 elements using 'new Student[3]'");
        
        System.out.println("Common misconception: thinking that 'new Student[3]' creates Student objects");
        System.out.print("Actual values: ");
        for (Student student : students) {
            System.out.print(student + " "); // All nulls
        }
        System.out.println();
        
        // ERROR 4: Forgetting that different types have different default values
        System.out.println("\nERROR 4: Forgetting that different types have different default values");
        System.out.println("int[] -> 0");
        System.out.println("double[] -> 0.0");
        System.out.println("boolean[] -> false");
        System.out.println("char[] -> '\\u0000' (null character)");
        System.out.println("Reference types[] -> null");
        
        // ERROR 5: Trying to initialize array elements in a loop without bounds checking
        System.out.println("\nERROR 5: Trying to initialize array elements in a loop without bounds checking");
        int[] data = new int[5];
        System.out.println("int[] data = new int[5];");
        
        System.out.println("Dangerous code: not checking array bounds in a loop");
        System.out.println("for (int i = 0; i <= data.length; i++) { // Note the <= instead of <");
        System.out.println("    data[i] = i * 10; // ArrayIndexOutOfBoundsException at i=5");
        System.out.println("}");
        
        System.out.println("\nCorrect approach: use proper bounds checking");
        System.out.println("for (int i = 0; i < data.length; i++) { // Note the < operator");
        System.out.println("    data[i] = i * 10; // Safe");
        System.out.println("}");
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
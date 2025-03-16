/**
 * VAR2A5_Err.java
 * This program demonstrates common errors when using initializer lists
 * to create and initialize arrays (VAR-2.A.5).
 */
public class VAR2A5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors with array initializer lists:\n");
        
        // ERROR 1: Trying to use initializer list after declaration
        System.out.println("ERROR 1: Trying to use initializer list after declaration");
        int[] numbers;
        // numbers = {10, 20, 30, 40, 50}; // ERROR: Cannot use array initializer in assignment
        System.out.println("The following code will not compile:");
        System.out.println("int[] numbers;");
        System.out.println("numbers = {10, 20, 30, 40, 50}; // Compilation error");
        
        System.out.println("\nCorrect approaches:");
        System.out.println("1. Declare and initialize in one statement: int[] numbers = {10, 20, 30, 40, 50};");
        System.out.println("2. Use new with array type: numbers = new int[] {10, 20, 30, 40, 50};");
        
        // Correct way to initialize after declaration
        numbers = new int[] {10, 20, 30, 40, 50};
        
        // ERROR 2: Mixing declaration styles
        System.out.println("\nERROR 2: Mixing declaration styles");
        System.out.println("The following declarations are equivalent but mixing styles can be confusing:");
        System.out.println("int[] array1 = {1, 2, 3}; // Preferred style");
        System.out.println("int array2[] = {1, 2, 3}; // Less common style");
        
        // ERROR 3: Forgetting that initializer lists create fixed-size arrays
        System.out.println("\nERROR 3: Forgetting that initializer lists create fixed-size arrays");
        int[] fixedArray = {1, 2, 3};
        System.out.println("Created array with initializer list: int[] fixedArray = {1, 2, 3};");
        System.out.println("Array length: " + fixedArray.length);
        System.out.println("Common misconception: thinking you can add more elements later");
        System.out.println("// fixedArray[3] = 4; // ERROR: ArrayIndexOutOfBoundsException");
        
        // ERROR 4: Trying to specify size with initializer list
        System.out.println("\nERROR 4: Trying to specify size with initializer list");
        System.out.println("The following code will not compile:");
        System.out.println("// int[5] wrongArray = {1, 2, 3, 4, 5}; // ERROR: Cannot specify size with initializer");
        System.out.println("Correct: int[] correctArray = {1, 2, 3, 4, 5}; // Size is determined by the initializer");
        
        // ERROR 5: Forgetting to initialize all elements in a reference array
        System.out.println("\nERROR 5: Forgetting to initialize all elements in a reference array");
        Student[] students = new Student[3];
        students[0] = new Student("Alice", 95);
        // Forgot to initialize students[1] and students[2]
        
        System.out.println("Created Student array but only initialized the first element:");
        System.out.println("students[0] = " + students[0]);
        System.out.println("students[1] = " + students[1]); // null
        System.out.println("students[2] = " + students[2]); // null
        
        System.out.println("\nBetter approach using initializer list:");
        System.out.println("Student[] students = {");
        System.out.println("    new Student(\"Alice\", 95),");
        System.out.println("    new Student(\"Bob\", 87),");
        System.out.println("    new Student(\"Charlie\", 91)");
        System.out.println("};");
        
        // ERROR 6: Trying to create a multi-dimensional array with inconsistent sizes
        System.out.println("\nERROR 6: Creating a multi-dimensional array with inconsistent initializers");
        System.out.println("The following code compiles but may be confusing:");
        int[][] irregular = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        System.out.println("Created irregular 2D array with different row lengths");
        
        System.out.println("Row 0 length: " + irregular[0].length); // 3
        System.out.println("Row 1 length: " + irregular[1].length); // 2
        System.out.println("Row 2 length: " + irregular[2].length); // 4
        System.out.println("This can lead to confusion and potential errors if not handled carefully");
    }
}

/**
 * A simple Student class for demonstrating array initialization with objects
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
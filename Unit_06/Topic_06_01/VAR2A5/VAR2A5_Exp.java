/**
 * VAR2A5_Exp.java
 * This program demonstrates how initializer lists can be used
 * to create and initialize arrays (VAR-2.A.5).
 */
public class VAR2A5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating array initialization using initializer lists:\n");
        
        // Example 1: Basic initializer list for primitive array
        System.out.println("Example 1: Basic initializer list for primitive array");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Created and initialized an int array using: int[] numbers = {10, 20, 30, 40, 50};");
        
        System.out.print("Array contents: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Example 2: Initializer list for String array
        System.out.println("\nExample 2: Initializer list for String array");
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        System.out.println("Created and initialized a String array using: String[] fruits = {\"Apple\", \"Banana\", ...};");
        
        System.out.print("Array contents: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        // Example 3: Empty initializer list
        System.out.println("\nExample 3: Empty initializer list");
        double[] emptyArray = {};
        System.out.println("Created an empty array using: double[] emptyArray = {};");
        System.out.println("Array length: " + emptyArray.length);
        
        // Example 4: Initializer list with expressions
        System.out.println("\nExample 4: Initializer list with expressions");
        int base = 5;
        int[] calculated = {base, base * 2, base * 3, base * 4, base * 5};
        System.out.println("Created an array with calculated values: int[] calculated = {base, base * 2, ...};");
        
        System.out.print("Array contents: ");
        for (int value : calculated) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        // Example 5: Initializer list for custom objects
        System.out.println("\nExample 5: Initializer list for custom objects");
        Student[] students = {
            new Student("Alice", 95),
            new Student("Bob", 87),
            new Student("Charlie", 91)
        };
        System.out.println("Created and initialized a Student array using initializer list");
        
        System.out.println("Array contents:");
        for (Student student : students) {
            System.out.println("  " + student);
        }
        
        // Example 6: Alternative syntax with type on the right
        System.out.println("\nExample 6: Alternative syntax with type on the right");
        // This syntax is less common but valid
        int scores[] = {95, 87, 91, 82, 88};
        System.out.println("Created an array using alternative syntax: int scores[] = {95, 87, ...};");
        
        System.out.print("Array contents: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        
        // Key points about initializer lists
        System.out.println("\nKey points about initializer lists:");
        System.out.println("1. Initializer lists create and initialize arrays in one step");
        System.out.println("2. The size of the array is determined by the number of elements in the list");
        System.out.println("3. You don't need to specify the size when using an initializer list");
        System.out.println("4. Initializer lists can contain expressions, not just literals");
        System.out.println("5. You can create empty arrays with {}");
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
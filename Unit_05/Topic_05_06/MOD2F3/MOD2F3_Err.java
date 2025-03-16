/**
 * MOD-2.F.3 Error Example
 * 
 * This program demonstrates bad programming practice by modifying
 * mutable objects that are passed as parameters when not required by the specification.
 */
public class MOD2F3_Err {
    
    /**
     * ERROR: This method modifies the array parameter when it doesn't need to.
     * This is bad practice as it causes unexpected side effects.
     * 
     * @param numbers An array of integers
     * @return The average of the numbers in the array
     */
    public static double calculateAverageWithSideEffect(int[] numbers) {
        // Bad practice: Unnecessarily modifying the parameter
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            numbers[i] = 0; // ERROR: Unnecessarily modifying the parameter
        }
        
        return sum / numbers.length;
    }
    
    /**
     * ERROR: This method modifies the original list parameter instead of
     * creating a new list with the filtered results.
     * 
     * @param values A list of integers
     * @return The same list with only even numbers (modified in place)
     */
    public static int[] filterEvenNumbersWithSideEffect(int[] values) {
        // Bad practice: Modifying the parameter in place
        int evenCount = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                values[evenCount] = values[i];
                evenCount++;
            }
        }
        
        // Truncate the array (still modifying the original)
        for (int i = evenCount; i < values.length; i++) {
            values[i] = 0; // Zero out the rest of the array
        }
        
        return values; // Returns the modified original array
    }
    
    /**
     * ERROR: This method modifies a Student object parameter when it doesn't need to.
     * 
     * @param student A Student object
     * @return The student's grade point average
     */
    public static double calculateGPA(Student student) {
        double sum = 0;
        int[] grades = student.getGrades();
        
        for (int grade : grades) {
            sum += grade;
        }
        
        double gpa = sum / grades.length;
        
        // Bad practice: Unnecessarily modifying the parameter object
        student.setName(student.getName() + " (GPA: " + gpa + ")"); // ERROR: Modifying the object unnecessarily
        
        return gpa;
    }
    
    public static void main(String[] args) {
        int[] originalArray = {5, 2, 8, 1, 9};
        
        System.out.println("Original array before calculateAverageWithSideEffect:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        
        // Demonstrate bad practice - modifying the parameter
        double average = calculateAverageWithSideEffect(originalArray);
        
        System.out.println("\nAverage: " + average);
        System.out.println("Original array AFTER calculateAverageWithSideEffect:");
        for (int num : originalArray) {
            System.out.print(num + " "); // Array has been modified unexpectedly
        }
        
        // Demonstrate bad practice with filtering
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("\n\nOriginal array before filtering:");
        for (int num : numberArray) {
            System.out.print(num + " ");
        }
        
        int[] filteredArray = filterEvenNumbersWithSideEffect(numberArray);
        
        System.out.println("\nFiltered array (even numbers only):");
        for (int num : filteredArray) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nOriginal array after filtering (same as filtered array):");
        for (int num : numberArray) {
            System.out.print(num + " "); // Original array has been modified
        }
        
        // Demonstrate bad practice with object modification
        Student student = new Student("John Doe", new int[]{85, 90, 78, 92, 88});
        
        System.out.println("\n\nStudent before GPA calculation: " + student.getName());
        
        double gpa = calculateGPA(student);
        
        System.out.println("Student's GPA: " + gpa);
        System.out.println("Student after GPA calculation: " + student.getName());
        System.out.println("Notice that the student's name has been unexpectedly modified!");
    }
}

/**
 * A simple Student class for demonstration
 */
class Student {
    private String name;
    private int[] grades;
    
    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int[] getGrades() {
        return grades;
    }
}
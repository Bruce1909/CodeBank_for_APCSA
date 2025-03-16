/**
 * MOD-2.F.6 Error Example
 * 
 * This program demonstrates common errors and misconceptions related to parameter aliasing,
 * such as not understanding that formal and actual parameters are aliases.
 */
public class MOD2F6_Err {
    
    /**
     * ERROR: This method incorrectly assumes that the parameter is a separate copy
     * of the array, not an alias to the original array.
     * 
     * @param numbers An array of integers
     */
    public static void modifyArrayWithoutWarning(int[] numbers) {
        // Bad practice: Modifying the array without documenting this behavior
        // The method name and documentation don't indicate that the array will be modified
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * -1; // Negate all values
        }
        
        // ERROR: No documentation or warning that this method modifies the original array
    }
    
    /**
     * ERROR: This method incorrectly assumes that creating a defensive copy
     * of a reference parameter will protect the original object.
     * 
     * @param student A Student object
     */
    public static void incorrectDefensiveCopy(Student student) {
        // Attempt to create a defensive copy (but it's not really defensive)
        Student copy = student;
        
        // ERROR: This still modifies the original object because 'copy' is just another
        // alias to the same object, not a true copy
        copy.setGrade(0);
        
        System.out.println("Inside method, after modification through 'copy': " + copy);
        System.out.println("ERROR: The original student object is also modified because");
        System.out.println("'copy' is just another alias to the same object");
    }
    
    /**
     * ERROR: This method incorrectly assumes that modifying a local array
     * created from the parameter's elements won't affect the original.
     * 
     * @param original An array of Student objects
     */
    public static void shallowCopyMisconception(Student[] original) {
        // Create a new array (but not new Student objects)
        Student[] copy = new Student[original.length];
        
        // Copy references (not objects) to the new array
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i]; // Just copying references, not creating new Student objects
        }
        
        // ERROR: This still modifies the original objects because we only copied references
        for (int i = 0; i < copy.length; i++) {
            copy[i].setGrade(copy[i].getGrade() - 10); // Decrease grades
        }
        
        System.out.println("ERROR: The original Student objects are modified even though");
        System.out.println("we created a new array, because the array elements are still");
        System.out.println("aliases to the same Student objects");
    }
    
    public static void main(String[] args) {
        // Demonstrate the error of modifying an array without warning
        int[] numbers = {5, 10, 15, 20, 25};
        
        System.out.println("Original array before method call:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        modifyArrayWithoutWarning(numbers);
        
        System.out.println("Original array after method call:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nNotice that the original array was unexpectedly modified!\n");
        
        // Demonstrate the error of incorrect defensive copying
        Student alice = new Student("Alice", 90);
        System.out.println("Original student before method call: " + alice);
        
        incorrectDefensiveCopy(alice);
        
        System.out.println("Original student after method call: " + alice);
        System.out.println("Notice that the original student was modified despite the attempt\n" +
                         "to create a 'defensive copy'!\n");
        
        // Demonstrate the error of shallow copy misconception
        Student[] students = {
            new Student("Bob", 85),
            new Student("Charlie", 90),
            new Student("David", 78)
        };
        
        System.out.println("Original students before method call:");
        for (Student s : students) {
            System.out.println("  " + s);
        }
        
        shallowCopyMisconception(students);
        
        System.out.println("Original students after method call:");
        for (Student s : students) {
            System.out.println("  " + s);
        }
        System.out.println("Notice that the original Student objects were modified despite\n" +
                         "creating a new array in the method!");
    }
}

/**
 * A simple Student class for demonstration
 */
class Student {
    private String name;
    private int grade;
    
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    
    public String getName() {
        return name;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    @Override
    public String toString() {
        return name + " (Grade: " + grade + ")";
    }
}
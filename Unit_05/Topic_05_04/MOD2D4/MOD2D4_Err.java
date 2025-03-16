/**
 * MOD2D4_Err.java
 * This program demonstrates common errors related to returning object references (MOD-2.D.4).
 * 
 * @author AP CSA
 */
public class MOD2D4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to returning object references:\n");
        
        // ERROR 1: Assuming that returning a reference creates a copy of the object
        System.out.println("ERROR 1: Assuming that returning a reference creates a copy of the object");
        DataContainerWithErrors container = new DataContainerWithErrors();
        
        int[] numbers = container.getNumbers();
        System.out.println("Original array: " + arrayToString(numbers));
        
        // Modifying the array through the returned reference
        numbers[0] = 100;
        
        System.out.println("Modified array: " + arrayToString(numbers));
        System.out.println("Array in container: " + arrayToString(container.getNumbers()));
        System.out.println("The original array was modified because a reference was returned,");
        System.out.println("not a copy of the array itself\n");
        
        // ERROR 2: Not protecting mutable objects in accessor methods
        System.out.println("ERROR 2: Not protecting mutable objects in accessor methods");
        System.out.println("The getNumbers() method returns a direct reference to the internal array");
        System.out.println("This violates encapsulation by allowing external code to modify internal state\n");
        
        // ERROR 3: Confusing reference copying with object copying
        System.out.println("ERROR 3: Confusing reference copying with object copying");
        StudentWithErrors student1 = container.getStudent();
        System.out.println("Original student: " + student1);
        
        // Modifying the Student object through the returned reference
        student1.setGrade("F");
        
        StudentWithErrors student2 = container.getStudent(); // Gets the same reference
        System.out.println("Student from second get: " + student2);
        System.out.println("The change is visible through both references because they point to the same object\n");
        
        // ERROR 4: Assuming String objects behave like other mutable objects
        System.out.println("ERROR 4: Assuming String objects behave like other mutable objects");
        String name = container.getName();
        System.out.println("Original name: " + name);
        
        // This doesn't modify the original String (Strings are immutable)
        name = name.toUpperCase();
        
        System.out.println("Modified name variable: " + name);
        System.out.println("Name in container: " + container.getName());
        System.out.println("The original String is unchanged because Strings are immutable\n");
        
        // ERROR 5: Incorrect attempt at defensive copying
        System.out.println("ERROR 5: Incorrect attempt at defensive copying");
        int[] badCopy = container.getBadNumbersCopy();
        System.out.println("Original 'bad copy' array: " + arrayToString(badCopy));
        
        // Modifying the array through the returned reference
        badCopy[0] = 999;
        
        System.out.println("Modified 'bad copy': " + arrayToString(badCopy));
        System.out.println("Array in container: " + arrayToString(container.getNumbers()));
        System.out.println("The original array was still modified because the copy was shallow\n");
        
        System.out.println("Key points about object reference errors:");
        System.out.println("- Returning an object reference does not create a copy of the object");
        System.out.println("- Accessor methods should protect mutable objects with defensive copies");
        System.out.println("- Reference copying is not the same as object copying");
        System.out.println("- Immutable objects like String behave differently than mutable objects");
        System.out.println("- Proper encapsulation requires careful handling of returned references");
    }
    
    /**
     * Converts an array to a string representation.
     * 
     * @param array the array to convert
     * @return a string representation of the array
     */
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

/**
 * A class with errors related to returning object references.
 */
class DataContainerWithErrors {
    private int[] numbers = {1, 2, 3, 4, 5};
    private StudentWithErrors student = new StudentWithErrors("Alice", "A");
    private String name = "John Doe";
    
    /**
     * ERROR: Returns a direct reference to a mutable internal object.
     * This violates encapsulation by allowing external code to modify the internal array.
     * 
     * @return a reference to the internal numbers array
     */
    public int[] getNumbers() {
        return numbers; // Error: returns a reference to the internal array
    }
    
    /**
     * ERROR: Returns a direct reference to a mutable internal object.
     * This violates encapsulation by allowing external code to modify the internal Student object.
     * 
     * @return a reference to the internal Student object
     */
    public StudentWithErrors getStudent() {
        return student; // Error: returns a reference to the internal Student object
    }
    
    /**
     * Returns a reference to the name String.
     * This is generally safe because Strings are immutable.
     * 
     * @return a reference to the name String
     */
    public String getName() {
        return name; // Safe because Strings are immutable
    }
    
    /**
     * ERROR: Incorrect attempt at defensive copying.
     * This method tries to create a copy but actually returns the same array reference.
     * 
     * @return a supposed copy of the numbers array
     */
    public int[] getBadNumbersCopy() {
        // This is incorrect - it doesn't actually create a copy
        int[] badCopy = numbers; // Just copies the reference, not the array contents
        return badCopy; // Returns a reference to the same array
    }
}

/**
 * A class representing a student with errors.
 */
class StudentWithErrors {
    private String name;
    private String grade;
    
    /**
     * Constructor to initialize student data.
     */
    public StudentWithErrors(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
    
    /**
     * Sets the student's grade.
     * 
     * @param grade the new grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    /**
     * Returns a string representation of the student.
     * 
     * @return a string representation of the student
     */
    @Override
    public String toString() {
        return name + " (Grade: " + grade + ")";
    }
}
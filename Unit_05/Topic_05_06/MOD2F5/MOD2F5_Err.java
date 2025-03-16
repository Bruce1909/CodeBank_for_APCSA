/**
 * MOD-2.F.5 Error Example
 * 
 * This program demonstrates common errors related to object references as parameters,
 * such as misunderstanding how reference parameters work.
 */
public class MOD2F5_Err {
    
    /**
     * ERROR: This method incorrectly assumes that reassigning the parameter
     * will affect the original reference outside the method.
     * 
     * @param list An array of integers
     */
    public static void tryToReplaceArray(int[] list) {
        System.out.println("Inside method, before reassignment");
        
        // Attempt to replace the original array (won't work)
        list = new int[]{100, 200, 300};
        
        System.out.println("Inside method, after reassignment:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("ERROR: The original reference outside this method will remain unchanged");
    }
    
    /**
     * ERROR: This method incorrectly assumes that setting the parameter to null
     * will affect the original reference.
     * 
     * @param student A Student object
     */
    public static void tryToNullifyReference(Student student) {
        System.out.println("Inside method, before nullifying: " + student);
        
        // Attempt to nullify the original reference (won't work)
        student = null;
        
        System.out.println("Inside method, after nullifying: " + student);
        System.out.println("ERROR: The original reference outside this method will remain unchanged");
    }
    
    /**
     * ERROR: This method incorrectly assumes that String objects are mutable
     * and can be modified through the parameter reference.
     * 
     * @param name A String object (which is immutable)
     */
    public static void tryToModifyString(String name) {
        System.out.println("Inside method, before attempted modification: " + name);
        
        // Attempt to modify the String (won't work because Strings are immutable)
        name = name.toUpperCase();
        
        System.out.println("Inside method, after attempted modification: " + name);
        System.out.println("ERROR: The original String outside this method will remain unchanged");
        System.out.println("This is because Strings are immutable, and the reassignment only affects the local reference");
    }
    
    public static void main(String[] args) {
        // Demonstrate the error of trying to replace an array through a parameter
        int[] originalArray = {1, 2, 3, 4, 5};
        
        System.out.println("Original array before method call:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        tryToReplaceArray(originalArray);
        
        System.out.println("Original array after method call:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nNotice that the original array reference is unchanged!\n");
        
        // Demonstrate the error of trying to nullify a reference through a parameter
        Student alice = new Student("Alice", 85);
        System.out.println("Original student before method call: " + alice);
        
        tryToNullifyReference(alice);
        
        System.out.println("Original student after method call: " + alice);
        System.out.println("Notice that the original reference is still valid!\n");
        
        // Demonstrate the error of trying to modify an immutable String
        String originalName = "John Doe";
        System.out.println("Original string before method call: " + originalName);
        
        tryToModifyString(originalName);
        
        System.out.println("Original string after method call: " + originalName);
        System.out.println("Notice that the original String is unchanged!");
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
/**
 * MOD2D6_Err.java
 * This program demonstrates common errors related to the toString method (MOD-2.D.6).
 * 
 * @author AP CSA
 */
public class MOD2D6_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to the toString method:\n");
        
        // ERROR 1: Not overriding toString method
        System.out.println("ERROR 1: Not overriding toString method");
        BookWithErrors book1 = new BookWithErrors("The Great Gatsby", "F. Scott Fitzgerald", 180);
        System.out.println("Book without toString override: " + book1);
        System.out.println("The default toString method from Object class only shows class name and hash code");
        System.out.println("This doesn't provide useful information about the object's state\n");
        
        // ERROR 2: Incomplete toString method that omits important instance variables
        System.out.println("ERROR 2: Incomplete toString method that omits important instance variables");
        RectangleWithErrors rectangle = new RectangleWithErrors(5.0, 3.0);
        System.out.println("Rectangle with incomplete toString: " + rectangle);
        System.out.println("The toString method omits the width, which is an important property");
        System.out.println("This provides incomplete information about the object's state\n");
        
        // ERROR 3: toString method with incorrect format
        System.out.println("ERROR 3: toString method with incorrect format");
        StudentWithErrors student = new StudentWithErrors("John Smith", 16);
        student.addGrade(95);
        student.addGrade(88);
        System.out.println("Student with poorly formatted toString: " + student);
        System.out.println("The toString method uses poor formatting that makes it hard to read");
        System.out.println("Well-formatted output is important for readability\n");
        
        // ERROR 4: toString method that doesn't handle special cases
        System.out.println("ERROR 4: toString method that doesn't handle special cases");
        StudentWithErrors emptyStudent = new StudentWithErrors("Jane Doe", 15);
        System.out.println("Student with no grades: " + emptyStudent);
        System.out.println("The toString method doesn't handle the case when there are no grades");
        System.out.println("This can lead to confusing or misleading output\n");
        
        // ERROR 5: Forgetting that toString is called automatically in string concatenation
        System.out.println("ERROR 5: Forgetting that toString is called automatically in string concatenation");
        BookWithErrors book2 = new BookWithErrors("1984", "George Orwell", 328);
        System.out.println("The following two lines produce the same output:");
        System.out.println("Using toString explicitly: " + book2.toString());
        System.out.println("In string concatenation: " + book2);
        System.out.println("Some programmers forget that toString is called automatically in string concatenation\n");
        
        System.out.println("Key points about toString method errors:");
        System.out.println("- Not overriding toString results in unhelpful default output");
        System.out.println("- toString should include all relevant instance variables");
        System.out.println("- toString should use clear, consistent formatting");
        System.out.println("- toString should handle special cases appropriately");
        System.out.println("- toString is called automatically in string concatenation");
    }
}

/**
 * A class representing a book that doesn't override toString.
 */
class BookWithErrors {
    private String title;
    private String author;
    private int pages;
    
    /**
     * Constructor to initialize book data.
     */
    public BookWithErrors(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    // ERROR: No toString method override
    // The default toString from Object class will be used
    // This will output something like: "BookWithErrors@7852e922"
}

/**
 * A class representing a rectangle with an incomplete toString method.
 */
class RectangleWithErrors {
    private double length;
    private double width;
    
    /**
     * Constructor to initialize rectangle data.
     */
    public RectangleWithErrors(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    /**
     * ERROR: Incomplete toString method that omits important instance variables.
     * This method only includes the length but omits the width.
     * 
     * @return an incomplete string representation of the rectangle
     */
    @Override
    public String toString() {
        return "Rectangle(length=" + length + ")"; // Missing width information
    }
}

/**
 * A class representing a student with a poorly formatted toString method.
 */
class StudentWithErrors {
    private String name;
    private int age;
    private int[] grades;
    private int gradeCount;
    
    /**
     * Constructor to initialize student data.
     */
    public StudentWithErrors(String name, int age) {
        this.name = name;
        this.age = age;
        this.grades = new int[10]; // Space for up to 10 grades
        this.gradeCount = 0;
    }
    
    /**
     * Adds a grade to the student's record.
     * 
     * @param grade the grade to add
     */
    public void addGrade(int grade) {
        if (gradeCount < grades.length) {
            grades[gradeCount] = grade;
            gradeCount++;
        }
    }
    
    /**
     * ERROR: Poorly formatted toString method that is hard to read.
     * This method also doesn't handle the special case when there are no grades.
     * 
     * @return a poorly formatted string representation of the student
     */
    @Override
    public String toString() {
        // Poor formatting with no spaces and inconsistent separators
        String result = name + "|" + age + "|"; 
        
        // Doesn't handle the case when there are no grades
        for (int i = 0; i < gradeCount; i++) {
            result += grades[i];
            if (i < gradeCount - 1) {
                result += ",";
            }
        }
        
        return result; // Hard to read and interpret
    }
}
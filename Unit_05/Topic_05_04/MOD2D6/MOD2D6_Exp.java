/**
 * MOD2D6_Exp.java
 * This program demonstrates how the toString method is an overridden method
 * that provides a description of a specific object (MOD-2.D.6).
 * 
 * @author AP CSA
 */
public class MOD2D6_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating the toString method in Java:\n");
        
        // Example 1: Basic toString method in a class
        System.out.println("Example 1: Basic toString method in a class");
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        System.out.println("Book object: " + book);
        System.out.println("The toString method is called automatically when an object is concatenated with a string\n");
        
        // Example 2: toString method with formatted output
        System.out.println("Example 2: toString method with formatted output");
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle object: " + rectangle);
        System.out.println("The toString method can format the output in a readable way\n");
        
        // Example 3: toString method in a complex object
        System.out.println("Example 3: toString method in a complex object");
        Student student = new Student("John Smith", 16);
        student.addGrade(95);
        student.addGrade(88);
        student.addGrade(92);
        System.out.println("Student object: " + student);
        System.out.println("The toString method can include all relevant instance data\n");
        
        // Example 4: Explicit call to toString
        System.out.println("Example 4: Explicit call to toString");
        System.out.println("Explicit call: " + book.toString());
        System.out.println("Implicit call: " + book);
        System.out.println("Both calls produce the same result\n");
        
        System.out.println("Key points about the toString method:");
        System.out.println("- The toString method is inherited from the Object class");
        System.out.println("- It is commonly overridden to provide a meaningful description of an object");
        System.out.println("- It should include the values stored in the instance variables");
        System.out.println("- It is automatically called when an object is used in string concatenation");
        System.out.println("- It helps with debugging by providing a readable representation of objects");
    }
}

/**
 * A class representing a book with a toString method.
 */
class Book {
    private String title;
    private String author;
    private int pages;
    
    /**
     * Constructor to initialize book data.
     */
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    /**
     * Overrides the toString method to provide a description of the book.
     * 
     * @return a string representation of the book
     */
    @Override
    public String toString() {
        return "Book[title=\"" + title + "\", author=\"" + author + "\", pages=" + pages + "]";
    }
}

/**
 * A class representing a rectangle with a formatted toString method.
 */
class Rectangle {
    private double length;
    private double width;
    
    /**
     * Constructor to initialize rectangle data.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    /**
     * Calculates the area of the rectangle.
     * 
     * @return the area of the rectangle
     */
    public double getArea() {
        return length * width;
    }
    
    /**
     * Overrides the toString method to provide a formatted description of the rectangle.
     * 
     * @return a string representation of the rectangle
     */
    @Override
    public String toString() {
        return String.format("Rectangle(length=%.1f, width=%.1f, area=%.1f)", length, width, getArea());
    }
}

/**
 * A class representing a student with a complex toString method.
 */
class Student {
    private String name;
    private int age;
    private int[] grades;
    private int gradeCount;
    
    /**
     * Constructor to initialize student data.
     */
    public Student(String name, int age) {
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
     * Calculates the average of the student's grades.
     * 
     * @return the average grade, or 0 if no grades exist
     */
    public double getAverageGrade() {
        if (gradeCount == 0) {
            return 0;
        }
        
        int sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        
        return (double) sum / gradeCount;
    }
    
    /**
     * Overrides the toString method to provide a detailed description of the student.
     * 
     * @return a string representation of the student
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student[name=\"" + name + "\", age=" + age);
        
        sb.append(", grades=[");
        for (int i = 0; i < gradeCount; i++) {
            sb.append(grades[i]);
            if (i < gradeCount - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        
        sb.append(", average=" + String.format("%.1f", getAverageGrade()));
        sb.append("]");
        
        return sb.toString();
    }
}
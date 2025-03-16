/**
 * MOD1B1_Exp.java
 * 
 * This program demonstrates the concept that an object is a specific instance
 * of a class with defined attributes.
 * 
 * Knowledge Point: MOD-1.B.1
 * An object is a specific instance of a class with defined attributes.
 */
public class MOD1B1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Objects as Instances of Classes:\n");
        
        // Creating multiple Student objects (instances) from the same Student class
        System.out.println("Example 1: Creating multiple objects from the same class");
        Student student1 = new Student("Alice", "Smith", 15, 10);
        Student student2 = new Student("Bob", "Johnson", 16, 11);
        Student student3 = new Student("Charlie", "Brown", 17, 12);
        
        // Each object has its own set of attributes
        System.out.println("\nEach object has its own set of attributes:");
        System.out.println("Student 1: " + student1.getFullInfo());
        System.out.println("Student 2: " + student2.getFullInfo());
        System.out.println("Student 3: " + student3.getFullInfo());
        
        // Modifying attributes of one object doesn't affect other objects
        System.out.println("\nExample 2: Modifying one object doesn't affect others");
        System.out.println("Before modification:");
        System.out.println("Student 1 grade: " + student1.getGradeLevel());
        System.out.println("Student 2 grade: " + student2.getGradeLevel());
        
        // Modify student1's grade level
        student1.setGradeLevel(11);
        
        System.out.println("\nAfter modifying only Student 1's grade:");
        System.out.println("Student 1 grade: " + student1.getGradeLevel());
        System.out.println("Student 2 grade: " + student2.getGradeLevel()); // Unchanged
        
        // Creating objects of different classes
        System.out.println("\nExample 3: Creating objects of different classes");
        Teacher teacher = new Teacher("Mr. Davis", "Mathematics");
        Course course = new Course("Algebra II", teacher);
        
        System.out.println("Teacher: " + teacher.getName() + ", Subject: " + teacher.getSubject());
        System.out.println("Course: " + course.getName() + ", Taught by: " + course.getTeacher().getName());
        
        // Enrolling students in a course (object interactions)
        System.out.println("\nExample 4: Object interactions");
        course.enrollStudent(student1);
        course.enrollStudent(student2);
        
        System.out.println("Students enrolled in " + course.getName() + ":");
        course.printEnrolledStudents();
    }
}

// Student class definition
class Student {
    // Attributes (instance variables)
    private String firstName;
    private String lastName;
    private int age;
    private int gradeLevel;
    
    // Constructor
    public Student(String firstName, String lastName, int age, int gradeLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gradeLevel = gradeLevel;
    }
    
    // Methods to access and modify attributes
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getGradeLevel() {
        return gradeLevel;
    }
    
    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    
    public String getFullInfo() {
        return firstName + " " + lastName + ", Age: " + age + ", Grade: " + gradeLevel;
    }
}

// Teacher class definition
class Teacher {
    private String name;
    private String subject;
    
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSubject() {
        return subject;
    }
}

// Course class definition
class Course {
    private String name;
    private Teacher teacher;
    private Student[] enrolledStudents;
    private int studentCount;
    
    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.enrolledStudents = new Student[30]; // Maximum 30 students
        this.studentCount = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public Teacher getTeacher() {
        return teacher;
    }
    
    public void enrollStudent(Student student) {
        if (studentCount < enrolledStudents.length) {
            enrolledStudents[studentCount] = student;
            studentCount++;
        }
    }
    
    public void printEnrolledStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println("  - " + enrolledStudents[i].getFullInfo());
        }
    }
}
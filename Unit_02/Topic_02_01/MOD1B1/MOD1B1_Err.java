/**
 * MOD1B1_Err.java
 * 
 * This program demonstrates common errors and mistakes when working with objects
 * as instances of classes.
 * 
 * Knowledge Point: MOD-1.B.1
 * An object is a specific instance of a class with defined attributes.
 */
public class MOD1B1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating Common Errors with Objects as Instances of Classes:\n");
        
        // ERROR 1: Trying to use a class without instantiating an object
        System.out.println("ERROR 1: Trying to use a class without instantiating an object");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // String name = Student.firstName; // Error: non-static variable firstName cannot be referenced from a static context
        System.out.println("You must create an object instance to access instance variables\n");
        
        // ERROR 2: Forgetting to use the 'new' keyword when creating an object
        System.out.println("ERROR 2: Forgetting to use the 'new' keyword when creating an object");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // Student student1 = Student("Alice", "Smith", 15, 10); // Error: missing 'new' keyword
        System.out.println("Correct approach: Student student1 = new Student(\"Alice\", \"Smith\", 15, 10);\n");
        
        // Creating a valid Student object for further examples
        Student student1 = new Student("Alice", "Smith", 15, 10);
        
        // ERROR 3: Trying to access private attributes directly
        System.out.println("ERROR 3: Trying to access private attributes directly");
        System.out.println("Uncommenting the following line would cause a compilation error:");
        // System.out.println("First name: " + student1.firstName); // Error: firstName has private access
        System.out.println("You must use getter methods to access private attributes");
        System.out.println("Correct approach: student1.getFirstName()\n");
        
        // ERROR 4: Confusing an object reference with the object itself
        System.out.println("ERROR 4: Confusing an object reference with the object itself");
        Student student2 = student1; // This creates a second reference to the same object, not a new object
        student2.setGradeLevel(11);
        
        System.out.println("student1 grade level: " + student1.getGradeLevel());
        System.out.println("student2 grade level: " + student2.getGradeLevel());
        System.out.println("Both changed because student1 and student2 reference the same object\n");
        
        // ERROR 5: Null reference exception
        System.out.println("ERROR 5: Null reference exception");
        Student nullStudent = null;
        System.out.println("Uncommenting the following line would cause a NullPointerException at runtime:");
        // System.out.println(nullStudent.getFullInfo()); // Runtime Error: NullPointerException
        System.out.println("Always check if an object reference is null before using it\n");
        
        // ERROR 6: Forgetting that objects are passed by reference
        System.out.println("ERROR 6: Forgetting that objects are passed by reference");
        Student student3 = new Student("Bob", "Johnson", 16, 10);
        System.out.println("Before modifyStudent: " + student3.getGradeLevel());
        modifyStudent(student3);
        System.out.println("After modifyStudent: " + student3.getGradeLevel());
        System.out.println("The original object was modified because objects are passed by reference\n");
        
        // ERROR 7: Comparing objects using == instead of equals
        System.out.println("ERROR 7: Comparing objects using == instead of equals");
        Student student4 = new Student("Charlie", "Brown", 17, 12);
        Student student5 = new Student("Charlie", "Brown", 17, 12);
        
        System.out.println("student4 == student5: " + (student4 == student5)); // False, different objects
        System.out.println("This compares object references, not the content of the objects");
        System.out.println("For content comparison, classes should override the equals method\n");
        
        // ERROR 8: Forgetting that instance variables have default values
        System.out.println("ERROR 8: Forgetting that instance variables have default values");
        IncompleteStudent incompleteStudent = new IncompleteStudent();
        System.out.println("Default values: name = '" + incompleteStudent.getName() + 
                           "', age = " + incompleteStudent.getAge() + 
                           ", isEnrolled = " + incompleteStudent.isEnrolled());
        System.out.println("Reference types default to null, numeric types to 0, boolean to false\n");
        
        // ERROR 9: Confusing static and instance members
        System.out.println("ERROR 9: Confusing static and instance members");
        School school1 = new School("High School 1");
        School school2 = new School("High School 2");
        
        System.out.println("school1 name: " + school1.getName());
        System.out.println("school2 name: " + school2.getName());
        
        school1.setSchoolDistrict("District A");
        System.out.println("After setting district through school1:");
        System.out.println("school1 district: " + school1.getSchoolDistrict());
        System.out.println("school2 district: " + school2.getSchoolDistrict());
        System.out.println("Both changed because schoolDistrict is static (shared among all instances)\n");
        
        // ERROR 10: Not understanding object lifecycle and garbage collection
        System.out.println("ERROR 10: Not understanding object lifecycle and garbage collection");
        createTemporaryObject();
        System.out.println("The temporary object is eligible for garbage collection after the method returns");
        System.out.println("Java automatically reclaims memory when objects are no longer referenced");
    }
    
    // Method that modifies a Student object
    public static void modifyStudent(Student student) {
        student.setGradeLevel(12); // This modifies the original object
    }
    
    // Method that creates a temporary object
    public static void createTemporaryObject() {
        Student temp = new Student("Temporary", "Student", 15, 10);
        System.out.println("Created temporary student: " + temp.getFullInfo());
        // The temp reference goes out of scope when this method returns
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

// Class with uninitialized instance variables to demonstrate default values
class IncompleteStudent {
    private String name; // Defaults to null
    private int age;     // Defaults to 0
    private boolean isEnrolled; // Defaults to false
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public boolean isEnrolled() {
        return isEnrolled;
    }
}

// Class with static member to demonstrate shared state
class School {
    private String name; // Instance variable - unique to each object
    private static String schoolDistrict; // Static variable - shared among all instances
    
    public School(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setSchoolDistrict(String district) {
        schoolDistrict = district; // Modifies the shared static variable
    }
    
    public String getSchoolDistrict() {
        return schoolDistrict;
    }
}
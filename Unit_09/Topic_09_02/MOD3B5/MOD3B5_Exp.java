/**
 * MOD3B5_Exp.java
 * 
 * This program demonstrates MOD-3.B.5: Constructors are not inherited.
 */
public class MOD3B5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating that constructors are not inherited (MOD-3.B.5):\n");
        
        // Create instances using different constructors
        System.out.println("Creating a Person object:");
        Person person = new Person("John Doe", 30);
        person.displayInfo();
        System.out.println();
        
        System.out.println("Creating a Student object using Student's constructor:");
        Student student = new Student("Jane Smith", 20, "Computer Science", 3.8);
        student.displayInfo();
        System.out.println();
        
        // The following would cause a compilation error if uncommented:
        // Student studentError = new Student("Error Student", 22);
        // This fails because Student does not inherit Person's constructor
        
        System.out.println("Creating a GraduateStudent object using GraduateStudent's constructor:");
        GraduateStudent gradStudent = new GraduateStudent("Bob Johnson", 25, "Physics", 3.9, "Quantum Mechanics");
        gradStudent.displayInfo();
        
        System.out.println("\n--- Key Points about Constructors Not Being Inherited ---");
        System.out.println("1. Constructors are not inherited from superclasses");
        System.out.println("2. Each class must define its own constructors");
        System.out.println("3. A subclass cannot directly use a superclass's constructor");
        System.out.println("4. Subclass constructors can call superclass constructors using 'super()'");
        System.out.println("5. If a subclass constructor doesn't explicitly call a superclass constructor,");
        System.out.println("   Java automatically inserts a call to the superclass's no-argument constructor");
    }
}

/**
 * Superclass with multiple constructors
 */
class Person {
    private String name;
    private int age;
    
    // Constructor with parameters
    public Person(String name, int age) {
        System.out.println("Executing Person(String, int) constructor");
        this.name = name;
        this.age = age;
    }
    
    // No-argument constructor
    public Person() {
        System.out.println("Executing Person() constructor");
        this.name = "Unknown";
        this.age = 0;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}

/**
 * Subclass that must define its own constructors
 */
class Student extends Person {
    private String major;
    private double gpa;
    
    // Student constructor that calls the superclass constructor
    public Student(String name, int age, String major, double gpa) {
        // Call to superclass constructor must be the first statement
        super(name, age);
        System.out.println("Executing Student(String, int, String, double) constructor");
        this.major = major;
        this.gpa = gpa;
    }
    
    // No-argument constructor that calls the superclass no-argument constructor
    public Student() {
        // If super() is not explicitly called, Java inserts it automatically
        super(); // This calls Person()
        System.out.println("Executing Student() constructor");
        this.major = "Undeclared";
        this.gpa = 0.0;
    }
    
    // Note: Student does NOT inherit Person(String, int) constructor
    // The following constructor would need to be explicitly defined:
    // public Student(String name, int age) {
    //     super(name, age);
    //     this.major = "Undeclared";
    //     this.gpa = 0.0;
    // }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
    
    // Getters and setters
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

/**
 * Subclass of Student that must define its own constructors
 */
class GraduateStudent extends Student {
    private String researchArea;
    
    // GraduateStudent constructor that calls the superclass constructor
    public GraduateStudent(String name, int age, String major, double gpa, String researchArea) {
        super(name, age, major, gpa);
        System.out.println("Executing GraduateStudent constructor");
        this.researchArea = researchArea;
    }
    
    // Note: GraduateStudent does NOT inherit any constructors from Student or Person
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Area: " + researchArea);
    }
    
    // Getter and setter
    public String getResearchArea() {
        return researchArea;
    }
    
    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }
}
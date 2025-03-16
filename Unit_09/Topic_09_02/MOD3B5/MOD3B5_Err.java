/**
 * MOD3B5_Err.java
 * 
 * This program demonstrates errors related to MOD-3.B.5: Misunderstanding that constructors
 * are not inherited.
 */
public class MOD3B5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors related to constructors not being inherited (MOD-3.B.5):\n");
        
        // Create a Person object
        System.out.println("Creating a Person object:");
        PersonWithError person = new PersonWithError("John Doe", 30);
        person.displayInfo();
        System.out.println();
        
        // ERROR 1: Attempting to use a constructor that is not inherited
        System.out.println("ERROR 1: Attempting to use a constructor that is not inherited");
        System.out.println("The following code would not compile in Java:");
        System.out.println("StudentWithError student = new StudentWithError(\"Jane Smith\", 20);");
        System.out.println("This fails because StudentWithError does not inherit PersonWithError's constructor\n");
        
        // Create a StudentWithError object using the only available constructor
        System.out.println("Creating a StudentWithError object using its only constructor:");
        StudentWithError student = new StudentWithError("Jane Smith", 20, "Computer Science");
        student.displayInfo();
        System.out.println();
        
        // ERROR 2: Missing super() call in constructor
        System.out.println("ERROR 2: Missing super() call in constructor");
        System.out.println("The following code would cause runtime errors:");
        System.out.println("class BadStudent extends Person {\n  public BadStudent() {\n    // No super() call\n    // Instance variables not initialized\n  }\n}");
        System.out.println("This fails because the superclass constructor is not called\n");
        
        // ERROR 3: Implicit call to no-argument constructor that doesn't exist
        System.out.println("ERROR 3: Implicit call to no-argument constructor that doesn't exist");
        System.out.println("The following code would not compile in Java:");
        System.out.println("class GradStudentWithError extends StudentWithNoDefaultConstructor {\n  public GradStudentWithError() {\n    // Implicit call to super() fails\n  }\n}");
        System.out.println("This fails because StudentWithNoDefaultConstructor has no no-argument constructor\n");
        
        // Demonstrate a correct implementation
        System.out.println("Correct implementation - explicitly calling available constructor:");
        GraduateStudentWithError gradStudent = new GraduateStudentWithError("Bob Johnson", 25, "Physics", "Quantum Mechanics");
        gradStudent.displayInfo();
        
        System.out.println("\n--- Problems with Misunderstanding Constructor Inheritance ---");
        System.out.println("1. Assuming constructors are inherited leads to compilation errors");
        System.out.println("2. Forgetting to call super() can cause initialization problems");
        System.out.println("3. Implicit calls to non-existent no-argument constructors cause compilation errors");
        System.out.println("4. Each class must define its own constructors");
        System.out.println("5. Subclass constructors must explicitly call available superclass constructors");
    }
}

/**
 * Superclass with only parameterized constructor
 */
class PersonWithError {
    private String name;
    private int age;
    
    // Constructor with parameters
    public PersonWithError(String name, int age) {
        System.out.println("Executing PersonWithError(String, int) constructor");
        this.name = name;
        this.age = age;
    }
    
    // Note: No no-argument constructor defined
    
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
 * ERROR: Subclass that doesn't define a constructor matching the superclass's signature
 * This means we can't create a StudentWithError with just name and age
 */
class StudentWithError extends PersonWithError {
    private String major;
    
    // Only constructor available
    public StudentWithError(String name, int age, String major) {
        super(name, age); // Must call available superclass constructor
        System.out.println("Executing StudentWithError(String, int, String) constructor");
        this.major = major;
    }
    
    // Note: StudentWithError does NOT inherit PersonWithError(String, int) constructor
    // The following would need to be explicitly defined to allow:
    // StudentWithError student = new StudentWithError("Jane Smith", 20);
    //
    // public StudentWithError(String name, int age) {
    //     super(name, age);
    //     this.major = "Undeclared";
    // }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }
    
    // Getter and setter
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
}

/**
 * ERROR: Class with constructor that doesn't call super()
 * This would cause compilation errors if uncommented
 */
// class BadStudentWithError extends PersonWithError {
//     private String major;
//     
//     // ERROR: No call to super()
//     public BadStudentWithError(String major) {
//         // Missing super(name, age) call
//         // Java would try to insert super() but PersonWithError has no no-arg constructor
//         this.major = major;
//     }
// }

/**
 * Class with no default constructor
 */
class StudentWithNoDefaultConstructor extends PersonWithError {
    private String major;
    
    // Only constructor available
    public StudentWithNoDefaultConstructor(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }
}

/**
 * Subclass that correctly calls available superclass constructor
 */
class GraduateStudentWithError extends StudentWithError {
    private String researchArea;
    
    // Constructor that calls available superclass constructor
    public GraduateStudentWithError(String name, int age, String major, String researchArea) {
        super(name, age, major); // Must call available constructor
        System.out.println("Executing GraduateStudentWithError constructor");
        this.researchArea = researchArea;
    }
    
    // Note: The following would cause a compilation error if uncommented
    // public GraduateStudentWithError() {
    //     // Implicit call to super() would fail because there is no no-arg constructor in StudentWithError
    // }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Area: " + researchArea);
    }
}
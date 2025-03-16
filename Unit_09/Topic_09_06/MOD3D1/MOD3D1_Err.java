/**
 * This program demonstrates common errors when utilizing the Object class through inheritance (MOD-3.D.1).
 * It shows mistakes when overriding Object methods like equals(), hashCode(), and clone().
 */
public class MOD3D1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with Object class inheritance (MOD-3.D.1):\n");
        
        // Create instances of our custom classes
        StudentWithBadEquals student1 = new StudentWithBadEquals("John", 101);
        StudentWithBadEquals student2 = new StudentWithBadEquals("John", 101);
        StudentWithBadEquals student3 = new StudentWithBadEquals("Alice", 102);
        
        // ERROR 1: Overriding equals() without overriding hashCode()
        System.out.println("--- ERROR 1: Overriding equals() without overriding hashCode() ---");
        System.out.println("student1.equals(student2): " + student1.equals(student2));
        System.out.println("student1.hashCode(): " + student1.hashCode());
        System.out.println("student2.hashCode(): " + student2.hashCode());
        System.out.println("Problem: Equal objects should have equal hash codes, but they don't here.");
        System.out.println("This breaks the hashCode() contract and causes problems with HashSet, HashMap, etc.");
        
        // ERROR 2: Incorrect equals() implementation
        System.out.println("\n--- ERROR 2: Incorrect equals() implementation ---");
        IncorrectEquals obj1 = new IncorrectEquals("Test");
        String obj2 = "Test";
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // Should be false, but returns true
        System.out.println("Problem: This equals() implementation doesn't check for object type");
        System.out.println("and will cause ClassCastException when used with collections.");
        
        // ERROR 3: Incorrect clone() implementation
        System.out.println("\n--- ERROR 3: Incorrect clone() implementation ---");
        try {
            BadCloneable original = new BadCloneable("Original", new int[]{1, 2, 3});
            BadCloneable cloned = (BadCloneable) original.clone();
            
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
            
            // Modify the array in the cloned object
            cloned.getData()[0] = 999;
            
            System.out.println("\nAfter modifying cloned object's array:");
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
            System.out.println("Problem: The array in the original object was also modified");
            System.out.println("because clone() didn't create a deep copy of the mutable field.");
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }
        
        // ERROR 4: Not implementing Cloneable interface
        System.out.println("\n--- ERROR 4: Not implementing Cloneable interface ---");
        try {
            NotCloneable notCloneable = new NotCloneable("Test");
            NotCloneable cloned = (NotCloneable) notCloneable.clone();
            System.out.println("This line won't execute");
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            System.out.println("Problem: Classes must implement the Cloneable interface to use clone().");
        }
        
        // ERROR 5: Incorrect toString() implementation
        System.out.println("\n--- ERROR 5: Incorrect toString() implementation ---");
        BadToString badToString = new BadToString("Test", 123);
        System.out.println("badToString: " + badToString);
        System.out.println("Problem: This toString() implementation doesn't include the class name");
        System.out.println("and doesn't properly format the object's state.");
        
        // Summary of errors
        System.out.println("\n--- Common Errors When Using Object Class Methods ---");
        System.out.println("1. Overriding equals() without overriding hashCode()");
        System.out.println("2. Incorrect equals() implementation (not checking object type)");
        System.out.println("3. Shallow clone instead of deep clone for mutable fields");
        System.out.println("4. Attempting to clone without implementing Cloneable");
        System.out.println("5. Poor toString() implementation");
    }
}

/**
 * This class overrides equals() but not hashCode(), which is a common error.
 */
class StudentWithBadEquals {
    private String name;
    private int id;
    
    public StudentWithBadEquals(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    // Override equals() but NOT hashCode() - this is a mistake!
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        StudentWithBadEquals student = (StudentWithBadEquals) obj;
        return id == student.id && 
               (name == null ? student.name == null : name.equals(student.name));
    }
    
    // hashCode() is not overridden, so it uses Object's implementation
    // which is based on memory address
}

/**
 * This class has an incorrect equals() implementation that doesn't check object type.
 */
class IncorrectEquals {
    private String value;
    
    public IncorrectEquals(String value) {
        this.value = value;
    }
    
    // Incorrect equals() implementation - doesn't check object type
    @Override
    public boolean equals(Object obj) {
        // ERROR: Missing null check and type check
        try {
            // This will cause ClassCastException if obj is not a String
            return value.equals(((String) obj));
        } catch (ClassCastException e) {
            return false; // Catching the exception is also not a good practice here
        }
    }
}

/**
 * This class demonstrates incorrect clone() implementation (shallow copy).
 */
class BadCloneable implements Cloneable {
    private String name;
    private int[] data; // Mutable field
    
    public BadCloneable(String name, int[] data) {
        this.name = name;
        this.data = data;
    }
    
    public int[] getData() {
        return data;
    }
    
    // Incorrect clone implementation - doesn't create deep copy of mutable fields
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Only creates a shallow copy
        
        // Correct implementation would be:
        // BadCloneable cloned = (BadCloneable) super.clone();
        // cloned.data = data.clone();
        // return cloned;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BadCloneable[name=" + name + ", data=");
        sb.append("[");
        for (int i = 0; i < data.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(data[i]);
        }
        sb.append("]");
        sb.append("]");
        return sb.toString();
    }
}

/**
 * This class attempts to use clone() without implementing Cloneable.
 */
class NotCloneable {
    private String name;
    
    public NotCloneable(String name) {
        this.name = name;
    }
    
    // Will throw CloneNotSupportedException because class doesn't implement Cloneable
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // This will throw CloneNotSupportedException
    }
}

/**
 * This class has a poor toString() implementation.
 */
class BadToString {
    private String name;
    private int value;
    
    public BadToString(String name, int value) {
        this.name = name;
        this.value = value;
    }
    
    // Poor toString() implementation
    @Override
    public String toString() {
        // Doesn't include class name, making it hard to identify the object type
        // Doesn't use a consistent format
        return name + " - " + value;
    }
}
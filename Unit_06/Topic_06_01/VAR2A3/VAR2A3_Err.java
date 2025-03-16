/**
 * VAR2A3_Err.java
 * This program demonstrates common errors when working with arrays
 * that store primitive or object reference data (VAR-2.A.3).
 */
public class VAR2A3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors with primitive and reference arrays:\n");
        
        // ERROR 1: Confusing primitive arrays with reference arrays
        System.out.println("ERROR 1: Confusing primitive arrays with reference arrays");
        
        // Primitive array
        int[] primitiveArray = new int[3];
        primitiveArray[0] = 10;
        primitiveArray[1] = 20;
        primitiveArray[2] = 30;
        
        // Reference array
        Integer[] referenceArray = new Integer[3];
        // ERROR: Forgetting to initialize objects in a reference array
        // The following line would cause a NullPointerException if uncommented:
        // System.out.println(referenceArray[0] + 5); // NullPointerException
        
        System.out.println("Primitive array elements are automatically initialized to 0:");
        System.out.println("int[] newPrimitiveArray = new int[3];");
        int[] newPrimitiveArray = new int[3];
        System.out.println("newPrimitiveArray[0] = " + newPrimitiveArray[0]); // 0
        
        System.out.println("\nReference array elements are automatically initialized to null:");
        System.out.println("Integer[] newReferenceArray = new Integer[3];");
        Integer[] newReferenceArray = new Integer[3];
        System.out.println("newReferenceArray[0] = " + newReferenceArray[0]); // null
        
        // ERROR 2: Mixing primitive and reference arrays
        System.out.println("\nERROR 2: Mixing primitive and reference arrays");
        System.out.println("// int[] cannot be assigned to Integer[] and vice versa");
        System.out.println("// Integer[] wrapperArray = primitiveArray; // Compilation error");
        System.out.println("// int[] primitiveArray2 = referenceArray; // Compilation error");
        
        // ERROR 3: Forgetting that reference arrays store references
        System.out.println("\nERROR 3: Forgetting that reference arrays store references");
        Person[] people = new Person[3];
        people[0] = new Person("Alice");
        people[1] = new Person("Bob");
        people[2] = people[0]; // Same reference as people[0]
        
        System.out.println("people[0] = " + people[0]);
        System.out.println("people[2] = " + people[2]);
        System.out.println("people[0] and people[2] refer to the same object");
        
        // Modifying the object through one reference affects all references
        System.out.println("\nChanging name through people[2] affects people[0]:");
        people[2].setName("Alice Modified");
        System.out.println("After people[2].setName(\"Alice Modified\"):");
        System.out.println("people[0] = " + people[0]);
        System.out.println("people[2] = " + people[2]);
        
        // ERROR 4: Not understanding array of objects creation
        System.out.println("\nERROR 4: Not understanding array of objects creation");
        System.out.println("Creating an array of objects requires two steps:");
        System.out.println("1. Create the array: Person[] team = new Person[3];");
        System.out.println("2. Create each object: team[0] = new Person(\"John\");");
        System.out.println("The following does NOT create any Person objects:");
        System.out.println("// Person[] team = new Person[3]; // Only creates array, not Person objects");
    }
}

/**
 * A simple Person class for demonstrating reference array issues
 */
class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Person[name=" + name + "]";
    }
}
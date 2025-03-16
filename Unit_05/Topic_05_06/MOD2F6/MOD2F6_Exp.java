/**
 * MOD-2.F.6 Example
 * 
 * This program demonstrates that passing a reference parameter results in the formal parameter
 * and the actual parameter being aliases. They both refer to the same object.
 */
public class MOD2F6_Exp {
    
    /**
     * This method demonstrates that the formal parameter and the actual parameter
     * are aliases - they both refer to the same object.
     * 
     * @param list An array of integers
     */
    public static void demonstrateAliasing(int[] list) {
        System.out.println("Inside method, before modification");
        System.out.println("Parameter reference identity (memory address): " + System.identityHashCode(list));
        
        // Modify the object through the parameter reference
        list[0] = 100;
        
        System.out.println("Inside method, after modification");
        // The original object is modified because both references point to the same object
    }
    
    /**
     * This method demonstrates aliasing with a custom object.
     * 
     * @param person A Person object
     */
    public static void modifyPerson(Person person) {
        System.out.println("Inside method, parameter reference identity: " + System.identityHashCode(person));
        System.out.println("Inside method, before modification: " + person);
        
        // Modify the object through the parameter reference
        person.setName(person.getName() + " (Modified)");
        person.setAge(person.getAge() + 5);
        
        System.out.println("Inside method, after modification: " + person);
        // The original object is modified because both references are aliases
    }
    
    /**
     * This method demonstrates that even though we create a new array inside the method,
     * the original array and the parameter are still aliases until the reassignment.
     * 
     * @param data An array of integers
     */
    public static void aliasUntilReassignment(int[] data) {
        System.out.println("Inside method, initial parameter identity: " + System.identityHashCode(data));
        
        // At this point, data and the original array are aliases
        data[0] = 999; // This affects the original array
        
        // After reassignment, they are no longer aliases
        data = new int[]{-1, -2, -3};
        System.out.println("Inside method, after reassignment identity: " + System.identityHashCode(data));
        
        // Modifications to data no longer affect the original array
        data[0] = -999; // This does NOT affect the original array
    }
    
    public static void main(String[] args) {
        // Demonstrate aliasing with an array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array reference identity: " + System.identityHashCode(numbers));
        
        System.out.println("Original array before method call:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        demonstrateAliasing(numbers);
        
        System.out.println("Original array after method call:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nNotice that the original array has been modified because both references\n" +
                         "are aliases - they refer to the same object!\n");
        
        // Demonstrate aliasing with a custom object
        Person john = new Person("John", 30);
        System.out.println("Original person reference identity: " + System.identityHashCode(john));
        System.out.println("Original person before method call: " + john);
        
        modifyPerson(john);
        
        System.out.println("Original person after method call: " + john);
        System.out.println("Notice that the original person object has been modified because\n" +
                         "both references are aliases - they refer to the same object!\n");
        
        // Demonstrate aliasing until reassignment
        int[] data = {10, 20, 30, 40, 50};
        System.out.println("Original data array reference identity: " + System.identityHashCode(data));
        
        System.out.println("Original data array before method call:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        aliasUntilReassignment(data);
        
        System.out.println("Original data array after method call:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println("\nNotice that only the first element was modified (to 999) because\n" +
                         "after reassignment in the method, the parameter was no longer an alias\n" +
                         "to the original array!");
    }
}

/**
 * A simple Person class for demonstration
 */
class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
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
    
    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}
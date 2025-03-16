/**
 * MOD-2.F.1 Example
 * 
 * This program demonstrates how methods can access the private data and methods
 * of a parameter that is a reference to an object when the parameter is the same
 * type as the method's enclosing class.
 */
public class MOD2F1_Exp {
    private int value;
    private String name;
    
    public MOD2F1_Exp(int value, String name) {
        this.value = value;
        this.name = name;
    }
    
    /**
     * This method demonstrates accessing private data of another object
     * of the same class type passed as a parameter.
     * 
     * @param other Another MOD2F1_Exp object
     * @return The sum of this object's value and the other object's value
     */
    public int combineValues(MOD2F1_Exp other) {
        // Since 'other' is the same type as this class (MOD2F1_Exp),
        // we can directly access its private data
        return this.value + other.value;
    }
    
    /**
     * This method demonstrates accessing private methods of another object
     * of the same class type passed as a parameter.
     * 
     * @param other Another MOD2F1_Exp object
     * @return A combined string using private methods
     */
    public String combineNames(MOD2F1_Exp other) {
        // We can call private methods on the parameter object
        return this.getFormattedName() + " and " + other.getFormattedName();
    }
    
    /**
     * A private helper method that can be accessed by other instances
     * of the same class.
     * 
     * @return A formatted version of the name
     */
    private String getFormattedName() {
        return name.toUpperCase();
    }
    
    public static void main(String[] args) {
        MOD2F1_Exp obj1 = new MOD2F1_Exp(10, "Alice");
        MOD2F1_Exp obj2 = new MOD2F1_Exp(20, "Bob");
        
        // Demonstrate accessing private data of another object
        int combinedValue = obj1.combineValues(obj2);
        System.out.println("Combined value: " + combinedValue);
        
        // Demonstrate accessing private methods of another object
        String combinedNames = obj1.combineNames(obj2);
        System.out.println("Combined names: " + combinedNames);
    }
}
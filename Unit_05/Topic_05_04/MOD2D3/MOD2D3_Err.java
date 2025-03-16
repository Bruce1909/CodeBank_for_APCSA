/**
 * MOD2D3_Err.java
 * This program demonstrates common errors related to return by value (MOD-2.D.3).
 * 
 * @author AP CSA
 */
public class MOD2D3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to return by value:\n");
        
        // ERROR 1: Assuming that modifying a returned primitive value affects the original
        System.out.println("ERROR 1: Assuming that modifying a returned primitive value affects the original");
        NumberProcessorWithErrors processor = new NumberProcessorWithErrors();
        
        System.out.println("Counter before: " + processor.getCounter());
        int counterCopy = processor.getCounter();
        counterCopy = 100; // Modifying the copy, not the original
        System.out.println("Modified copy: " + counterCopy);
        System.out.println("Counter after: " + processor.getCounter());
        System.out.println("The original counter is unchanged because Java returns a copy of primitive values\n");
        
        // ERROR 2: Confusing return by value with pass by reference
        System.out.println("ERROR 2: Confusing return by value with pass by reference");
        System.out.println("The following code would not work as expected if uncommented:");
        /*
        // This would not work as expected
        int x = 5;
        x = doubleAndModify(x); // This actually returns a new value, not modifying x directly
        */
        System.out.println("Java always returns a copy of the value, not a reference to the original value\n");
        
        // ERROR 3: Assuming that changing a returned value affects the instance variable
        System.out.println("ERROR 3: Assuming that changing a returned value affects the instance variable");
        System.out.println("Score before: " + processor.getScore());
        
        int score = processor.getScore();
        score += 10; // This only modifies the local copy
        
        System.out.println("Modified local score: " + score);
        System.out.println("Score in object: " + processor.getScore());
        System.out.println("The instance variable is unchanged because a copy was returned\n");
        
        // ERROR 4: Trying to modify a returned immutable object
        System.out.println("ERROR 4: Trying to modify a returned immutable object");
        String name = processor.getName();
        System.out.println("Original name: " + name);
        
        // Strings are immutable, so this creates a new String object
        name = name.toUpperCase();
        
        System.out.println("Modified name: " + name);
        System.out.println("Name in object: " + processor.getName());
        System.out.println("The original String is unchanged because Strings are immutable\n");
        
        System.out.println("Key points about return by value errors:");
        System.out.println("- Modifying a returned primitive value never affects the original value");
        System.out.println("- Java always returns copies of primitive values, not references to them");
        System.out.println("- Return by value is different from pass by reference");
        System.out.println("- Changing a returned value does not affect the source instance variable");
        System.out.println("- Understanding return by value is essential for proper data manipulation");
    }
}

/**
 * A class with methods demonstrating return by value errors.
 */
class NumberProcessorWithErrors {
    private int counter = 1;
    private int score = 75;
    private String name = "John Doe";
    
    /**
     * Returns the current counter value.
     * 
     * @return a copy of the counter value
     */
    public int getCounter() {
        return counter; // Returns a copy of the counter value
    }
    
    /**
     * Returns the current score value.
     * 
     * @return a copy of the score value
     */
    public int getScore() {
        return score; // Returns a copy of the score value
    }
    
    /**
     * Returns the name.
     * 
     * @return a reference to the name String
     */
    public String getName() {
        return name; // Returns a reference to the String object
    }
    
    /**
     * ERROR: Attempting to modify a value and expecting the original to change.
     * This method demonstrates a common misconception about return by value.
     * 
     * @param value the value to double
     * @return the doubled value
     */
    public int doubleAndModify(int value) {
        // This returns a new value, not a reference to the original
        return value * 2;
        
        // The following comment shows the misconception:
        // The caller might incorrectly assume that the original value is modified
    }
}
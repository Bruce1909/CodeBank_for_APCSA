/**
 * MOD2B4_Err.java
 * 
 * This program demonstrates common errors related to mutable objects as constructor parameters
 * as described in MOD-2.B.4: When a mutable object is a constructor parameter, the instance
 * variable should be initialized with a copy of the referenced object. In this way, the
 * instance variable is not an alias of the original object, and methods are prevented from
 * modifying the state of the original object.
 */
public class MOD2B4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with mutable objects as constructor parameters (MOD-2.B.4):\n");
        
        // ERROR 1: Not creating a defensive copy of a mutable array
        System.out.println("ERROR 1: Not creating a defensive copy of a mutable array");
        int[] originalScores = {95, 88, 75, 91, 84};
        System.out.println("Original scores array created:");
        displayArray("originalScores", originalScores);
        
        // Create a StudentRecordWithErrors using the array as a parameter
        System.out.println("\nCreating a StudentRecordWithErrors without defensive copying:");
        StudentRecordWithErrors student1 = new StudentRecordWithErrors("John Smith", originalScores);
        student1.displayInfo();
        
        // Modify the original array to demonstrate the aliasing problem
        System.out.println("\nModifying the original array after creating the StudentRecordWithErrors:");
        originalScores[0] = 65; // Change the first score
        displayArray("originalScores (after modification)", originalScores);
        
        // Show that the StudentRecordWithErrors's scores are also changed
        System.out.println("\nStudentRecordWithErrors's scores are also changed (aliasing problem):");
        student1.displayInfo();
        
        // ERROR 2: Not creating a defensive copy of a mutable object
        System.out.println("\nERROR 2: Not creating a defensive copy of a mutable object");
        CalendarWithErrors originalCalendar = new CalendarWithErrors(2023, 5, 15);
        System.out.println("Original calendar created:");
        originalCalendar.displayInfo();
        
        // Create an EventWithErrors using the Calendar as a parameter
        System.out.println("\nCreating an EventWithErrors without defensive copying:");
        EventWithErrors event1 = new EventWithErrors("Conference", "Main Hall", originalCalendar);
        event1.displayInfo();
        
        // Modify the original Calendar to demonstrate the aliasing problem
        System.out.println("\nModifying the original Calendar after creating the EventWithErrors:");
        originalCalendar.setMonth(6);
        originalCalendar.setDay(20);
        originalCalendar.displayInfo();
        
        // Show that the EventWithErrors's calendar is also changed
        System.out.println("\nEventWithErrors's calendar is also changed (aliasing problem):");
        event1.displayInfo();
        
        // ERROR 3: Returning a reference to a mutable object
        System.out.println("\nERROR 3: Returning a reference to a mutable object");
        StudentRecordWithErrors student2 = new StudentRecordWithErrors("Emma Johnson", new int[]{90, 92, 88, 95});
        System.out.println("\nCreated another student record:");
        student2.displayInfo();
        
        // Get the scores array and modify it directly
        System.out.println("\nGetting and modifying the scores array directly:");
        int[] scores = student2.getScoresWithError();
        scores[0] = 60; // Modify the first score
        displayArray("Modified scores array", scores);
        
        // Show that the StudentRecordWithErrors's internal state was changed
        System.out.println("\nStudentRecordWithErrors's internal state was changed:");
        student2.displayInfo();
        
        System.out.println("\n--- Common Errors with Mutable Objects as Constructor Parameters ---");
        System.out.println("1. Not creating defensive copies of mutable objects in constructors");
        System.out.println("2. Creating an alias to the original object, allowing external changes to affect internal state");
        System.out.println("3. Returning references to mutable internal objects, breaking encapsulation");
        System.out.println("4. Not using copy constructors or deep copying when needed");
        System.out.println("5. Assuming that all objects are immutable like String");
    }
    
    // Helper method to display an array
    private static void displayArray(String name, int[] array) {
        System.out.print("  " + name + ": [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

/**
 * Class that demonstrates errors with mutable array parameters
 */
class StudentRecordWithErrors {
    private String name;
    private int[] scores; // Mutable object (array)
    
    // ERROR: Not creating a defensive copy of the mutable array
    public StudentRecordWithErrors(String name, int[] scores) {
        this.name = name;
        
        // ERROR: Direct assignment creates an alias to the original array
        // Any changes to the original array will affect this object's state
        this.scores = scores; // Should create a defensive copy instead
        
        System.out.println("StudentRecordWithErrors created for " + name);
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("  Student: " + name);
        System.out.print("  Scores: [");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // ERROR: Returning a reference to the internal mutable object
    public int[] getScoresWithError() {
        // ERROR: This returns a reference to the internal array
        // Allowing external code to modify the internal state
        return scores; // Should return a defensive copy instead
    }
}

/**
 * A mutable Calendar class to demonstrate aliasing problems
 */
class CalendarWithErrors {
    private int year;
    private int month;
    private int day;
    
    public CalendarWithErrors(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    // Accessor methods
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }
    
    // Mutator methods
    public void setYear(int year) { this.year = year; }
    public void setMonth(int month) { this.month = month; }
    public void setDay(int day) { this.day = day; }
    
    public void displayInfo() {
        System.out.println("  Date: " + year + "-" + month + "-" + day);
    }
}

/**
 * Class that demonstrates errors with mutable object parameters
 */
class EventWithErrors {
    private String name;
    private String location;
    private CalendarWithErrors date; // Mutable object
    
    // ERROR: Not creating a defensive copy of the mutable object
    public EventWithErrors(String name, String location, CalendarWithErrors date) {
        this.name = name;
        this.location = location;
        
        // ERROR: Direct assignment creates an alias to the original object
        // Any changes to the original object will affect this object's state
        this.date = date; // Should create a defensive copy instead
        
        System.out.println("EventWithErrors created: " + name);
    }
    
    // Method to display event information
    public void displayInfo() {
        System.out.println("  Event: " + name);
        System.out.println("  Location: " + location);
        date.displayInfo();
    }
    
    // ERROR: Returning a reference to the internal mutable object
    public CalendarWithErrors getDateWithError() {
        // ERROR: This returns a reference to the internal object
        // Allowing external code to modify the internal state
        return date; // Should return a defensive copy instead
    }
}
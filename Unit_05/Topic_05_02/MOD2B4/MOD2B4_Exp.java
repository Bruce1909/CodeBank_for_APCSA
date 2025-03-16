/**
 * MOD2B4_Exp.java
 * 
 * This program demonstrates the correct usage of mutable objects as constructor parameters
 * as described in MOD-2.B.4: When a mutable object is a constructor parameter, the instance
 * variable should be initialized with a copy of the referenced object. In this way, the
 * instance variable is not an alias of the original object, and methods are prevented from
 * modifying the state of the original object.
 */
public class MOD2B4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating mutable objects as constructor parameters (MOD-2.B.4):\n");
        
        // Create a mutable object (array) to pass to constructors
        int[] originalScores = {95, 88, 75, 91, 84};
        System.out.println("Original scores array created:");
        displayArray("originalScores", originalScores);
        
        // Create a StudentRecord using the array as a parameter
        System.out.println("\nCreating a StudentRecord with proper defensive copying:");
        StudentRecord student1 = new StudentRecord("John Smith", originalScores);
        student1.displayInfo();
        
        // Modify the original array to demonstrate that the StudentRecord has a copy
        System.out.println("\nModifying the original array after creating the StudentRecord:");
        originalScores[0] = 65; // Change the first score
        displayArray("originalScores (after modification)", originalScores);
        
        // Show that the StudentRecord's scores are unchanged
        System.out.println("\nStudentRecord's scores remain unchanged (defensive copy worked):");
        student1.displayInfo();
        
        // Create a Calendar object (mutable) to pass to constructors
        System.out.println("\nCreating a mutable Calendar object:");
        Calendar originalCalendar = new Calendar(2023, 5, 15);
        originalCalendar.displayInfo();
        
        // Create an Event using the Calendar as a parameter
        System.out.println("\nCreating an Event with proper defensive copying:");
        Event event1 = new Event("Conference", "Main Hall", originalCalendar);
        event1.displayInfo();
        
        // Modify the original Calendar to demonstrate that the Event has a copy
        System.out.println("\nModifying the original Calendar after creating the Event:");
        originalCalendar.setMonth(6);
        originalCalendar.setDay(20);
        originalCalendar.displayInfo();
        
        // Show that the Event's calendar is unchanged
        System.out.println("\nEvent's calendar remains unchanged (defensive copy worked):");
        event1.displayInfo();
        
        System.out.println("\n--- Key Points about Mutable Objects as Constructor Parameters ---");
        System.out.println("1. Always create defensive copies of mutable objects in constructors");
        System.out.println("2. This prevents the instance variable from being an alias to the original object");
        System.out.println("3. Without defensive copying, changes to the original object would affect the object's state");
        System.out.println("4. Defensive copying maintains encapsulation and prevents unexpected side effects");
        System.out.println("5. Immutable objects (like String) don't need defensive copying");
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
 * Class that demonstrates proper handling of mutable array parameters
 */
class StudentRecord {
    private String name;
    private int[] scores; // Mutable object (array)
    
    // Constructor with proper defensive copying
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        
        // CORRECT: Create a defensive copy of the mutable array
        // This prevents the instance variable from being an alias to the original array
        if (scores != null) {
            this.scores = new int[scores.length]; // Create a new array of the same size
            for (int i = 0; i < scores.length; i++) {
                this.scores[i] = scores[i]; // Copy each element
            }
        } else {
            this.scores = new int[0]; // Empty array if null is passed
        }
        
        System.out.println("StudentRecord created for " + name + " with a defensive copy of scores");
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
    
    // Method to get a copy of the scores (defensive copying in accessor method too)
    public int[] getScores() {
        // CORRECT: Return a defensive copy, not the original array
        int[] copy = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            copy[i] = scores[i];
        }
        return copy;
    }
}

/**
 * A mutable Calendar class to demonstrate defensive copying
 */
class Calendar {
    private int year;
    private int month;
    private int day;
    
    public Calendar(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    // Copy constructor - creates a new Calendar with the same values
    public Calendar(Calendar other) {
        this.year = other.year;
        this.month = other.month;
        this.day = other.day;
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
 * Class that demonstrates proper handling of mutable object parameters
 */
class Event {
    private String name;
    private String location;
    private Calendar date; // Mutable object
    
    // Constructor with proper defensive copying
    public Event(String name, String location, Calendar date) {
        this.name = name;
        this.location = location;
        
        // CORRECT: Create a defensive copy of the mutable Calendar object
        // This prevents the instance variable from being an alias to the original object
        if (date != null) {
            // Use the copy constructor to create a new Calendar object
            this.date = new Calendar(date);
        } else {
            this.date = new Calendar(2023, 1, 1); // Default date if null is passed
        }
        
        System.out.println("Event created: " + name + " with a defensive copy of the calendar");
    }
    
    // Method to display event information
    public void displayInfo() {
        System.out.println("  Event: " + name);
        System.out.println("  Location: " + location);
        date.displayInfo();
    }
    
    // Method to get a copy of the date (defensive copying in accessor method too)
    public Calendar getDate() {
        // CORRECT: Return a defensive copy, not the original Calendar object
        return new Calendar(date);
    }
}
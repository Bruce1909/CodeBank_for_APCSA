/**
 * VAR2A1_Exp.java
 * This program demonstrates how arrays allow multiple related items
 * to be represented using a single variable (VAR-2.A.1).
 */
public class VAR2A1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how arrays represent collections of related data:\n");
        
        // Example 1: Using an array to store student grades
        System.out.println("Example 1: Student test scores");
        int[] testScores = {95, 89, 78, 92, 84};
        System.out.println("Created a single array variable 'testScores' that stores 5 related values");
        
        System.out.print("Test scores: ");
        for (int i = 0; i < testScores.length; i++) {
            System.out.print(testScores[i] + " ");
        }
        System.out.println();
        
        // Example 2: Using an array to store days of the week
        System.out.println("\nExample 2: Days of the week");
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Created a single array variable 'daysOfWeek' that stores 7 related String values");
        
        System.out.println("Days of the week:");
        for (String day : daysOfWeek) {
            System.out.println("  " + day);
        }
        
        // Example 3: Using an array to store boolean values
        System.out.println("\nExample 3: Attendance record");
        boolean[] attendance = {true, true, false, true, false};
        System.out.println("Created a single array variable 'attendance' that stores 5 related boolean values");
        
        System.out.println("Attendance for 5 days:");
        for (int i = 0; i < attendance.length; i++) {
            System.out.println("  Day " + (i + 1) + ": " + (attendance[i] ? "Present" : "Absent"));
        }
        
        // Benefits of using arrays
        System.out.println("\nBenefits of using arrays:");
        System.out.println("1. We can use a single variable name to represent multiple related values");
        System.out.println("2. We can access individual elements using an index");
        System.out.println("3. We can iterate through all elements using loops");
        System.out.println("4. We can perform operations on all elements efficiently");
    }
}
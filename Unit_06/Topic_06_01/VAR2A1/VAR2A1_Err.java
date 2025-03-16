/**
 * VAR2A1_Err.java
 * This program demonstrates common errors when trying to represent
 * multiple related items without using arrays (VAR-2.A.1).
 */
public class VAR2A1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating errors when not using arrays for related data:\n");
        
        // ERROR 1: Using separate variables for related data
        System.out.println("ERROR 1: Using separate variables for related data");
        int testScore1 = 95;
        int testScore2 = 89;
        int testScore3 = 78;
        int testScore4 = 92;
        int testScore5 = 84;
        
        System.out.println("Created 5 separate variables for test scores: " + 
                           testScore1 + ", " + testScore2 + ", " + 
                           testScore3 + ", " + testScore4 + ", " + 
                           testScore5);
        
        System.out.println("Problems with this approach:");
        System.out.println("1. Code becomes verbose and hard to maintain");
        System.out.println("2. Cannot easily iterate through the values");
        System.out.println("3. Cannot easily perform operations on all values");
        System.out.println("4. Adding more values requires adding more variables");
        
        // ERROR 2: Trying to calculate average without arrays
        System.out.println("\nERROR 2: Calculating average without arrays");
        double average = (testScore1 + testScore2 + testScore3 + testScore4 + testScore5) / 5.0;
        System.out.println("Average: " + average);
        System.out.println("Problem: Code becomes more complex as the number of items increases");
        
        // ERROR 3: Trying to find maximum without arrays
        System.out.println("\nERROR 3: Finding maximum without arrays");
        int max = testScore1;
        if (testScore2 > max) max = testScore2;
        if (testScore3 > max) max = testScore3;
        if (testScore4 > max) max = testScore4;
        if (testScore5 > max) max = testScore5;
        System.out.println("Maximum: " + max);
        System.out.println("Problem: Code becomes repetitive and error-prone");
        
        // ERROR 4: Trying to represent days of week without arrays
        System.out.println("\nERROR 4: Representing days of week without arrays");
        String day1 = "Monday";
        String day2 = "Tuesday";
        String day3 = "Wednesday";
        // ... and so on
        System.out.println("Days: " + day1 + ", " + day2 + ", " + day3 + ", ...");
        System.out.println("Problem: Cannot easily process all days in a loop");
        
        // Better solution: Use arrays
        System.out.println("\nBetter solution: Use arrays to represent related data");
        System.out.println("int[] testScores = {95, 89, 78, 92, 84};");
        System.out.println("String[] daysOfWeek = {\"Monday\", \"Tuesday\", ...};");
    }
}
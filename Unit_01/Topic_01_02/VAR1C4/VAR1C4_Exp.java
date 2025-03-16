/**
 * VAR1C4_Exp - Final Variables Example
 * 
 * This program demonstrates the concept that when a variable is declared final,
 * its value cannot be changed once it is initialized as specified in VAR-1.C.4.
 */
public class VAR1C4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Final Variables in Java:\n");
        
        // Example 1: Basic final variable declaration and initialization
        System.out.println("Example 1: Basic final variable declaration and initialization");
        
        final int MAX_SCORE = 100;
        final double PI = 3.14159;
        final boolean DEBUG_MODE = true;
        
        System.out.println("MAX_SCORE: " + MAX_SCORE);
        System.out.println("PI: " + PI);
        System.out.println("DEBUG_MODE: " + DEBUG_MODE);
        System.out.println("These values cannot be changed because they are declared as final");
        System.out.println();
        
        // Example 2: Using final variables in calculations
        System.out.println("Example 2: Using final variables in calculations");
        
        final double RADIUS = 5.0;
        double area = PI * RADIUS * RADIUS;
        double circumference = 2 * PI * RADIUS;
        
        System.out.println("Circle with radius " + RADIUS + ":");
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
        System.out.println();
        
        // Example 3: Final variables as constants
        System.out.println("Example 3: Final variables as constants");
        
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;
        final int HOURS_PER_DAY = 24;
        
        int secondsPerDay = SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY;
        
        System.out.println("Constants used for time conversion:");
        System.out.println("SECONDS_PER_MINUTE: " + SECONDS_PER_MINUTE);
        System.out.println("MINUTES_PER_HOUR: " + MINUTES_PER_HOUR);
        System.out.println("HOURS_PER_DAY: " + HOURS_PER_DAY);
        System.out.println("Seconds per day: " + secondsPerDay);
        System.out.println();
        
        // Example 4: Declaring final variables in different ways
        System.out.println("Example 4: Declaring final variables in different ways");
        
        // Declaration and initialization in one statement
        final String SCHOOL_NAME = "Java High School";
        
        // Declaration first, then initialization (only allowed once)
        final int GRADUATION_YEAR;
        GRADUATION_YEAR = 2023; // This is allowed because it's the first initialization
        
        System.out.println("SCHOOL_NAME: " + SCHOOL_NAME);
        System.out.println("GRADUATION_YEAR: " + GRADUATION_YEAR);
        System.out.println("Once initialized, these values cannot be changed");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Final Variables ---");
        System.out.println("1. Final variables cannot be changed once they are initialized");
        System.out.println("2. Final variables can be initialized at declaration or later (but only once)");
        System.out.println("3. Final variables are often used as constants and named with ALL_CAPS");
        System.out.println("4. Final variables can be of any primitive or reference type");
        System.out.println("5. Using final variables can make code more readable and maintainable");
    }
}
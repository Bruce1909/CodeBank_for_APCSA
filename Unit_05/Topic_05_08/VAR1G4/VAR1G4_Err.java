/**
 * VAR1G4_Err - Method Decomposition Error Examples
 * 
 * This program demonstrates common errors related to VAR-1.G.4:
 * Problems that arise when method decomposition is not properly implemented
 * or is missing entirely.
 */
public class VAR1G4_Err {
    // Instance variables
    private int[] numbers;
    private String[] names;
    
    // Constructor
    public VAR1G4_Err(int[] numbers, String[] names) {
        this.numbers = numbers;
        this.names = names;
    }
    
    // ERROR 1: Monolithic method without decomposition
    public void processDataWithoutDecomposition() {
        System.out.println("\nERROR 1: Monolithic method without decomposition");
        System.out.println("This method tries to do everything at once without breaking down the problem:");
        
        // Calculate statistics on numbers
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int num : numbers) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }
        
        double average = (double) sum / numbers.length;
        
        // Process text data
        int totalLength = 0;
        String longest = "";
        
        for (String name : names) {
            totalLength += name.length();
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        
        // Generate report
        System.out.println("=== DATA ANALYSIS REPORT ===");
        System.out.println("Date: " + java.time.LocalDate.now());
        System.out.println("Number of numeric data points: " + numbers.length);
        System.out.println("Number of text data points: " + names.length);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Total length of all names: " + totalLength);
        System.out.println("Longest name: " + longest);
        System.out.println("=== END OF REPORT ===");
        
        System.out.println("\nProblems with this approach:");
        System.out.println("1. Code is difficult to read and understand");
        System.out.println("2. Hard to maintain or modify specific parts");
        System.out.println("3. Cannot reuse individual components");
        System.out.println("4. Difficult to test specific functionality");
        System.out.println("5. More prone to bugs and errors");
    }
    
    // ERROR 2: Improper method decomposition (methods too large)
    public void improperDecomposition() {
        System.out.println("\nERROR 2: Improper method decomposition (methods too large)");
        
        // This method still tries to do too much
        calculateAllStatistics();
        
        // This method also tries to do too much
        generateCompleteReport();
        
        System.out.println("\nProblems with this approach:");
        System.out.println("1. Methods are still too large and complex");
        System.out.println("2. Limited reusability of specific functionality");
        System.out.println("3. Still difficult to test individual components");
    }
    
    // Method that does too much - should be further decomposed
    private void calculateAllStatistics() {
        System.out.println("Calculating all statistics at once:");
        
        // Calculate all statistics in one method
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int totalLength = 0;
        String longest = "";
        
        // Process numbers
        for (int num : numbers) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }
        
        double average = (double) sum / numbers.length;
        
        // Process text in the same method
        for (String name : names) {
            totalLength += name.length();
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        
        System.out.println("  Average: " + average);
        System.out.println("  Maximum: " + max);
        System.out.println("  Minimum: " + min);
        System.out.println("  Total length of all names: " + totalLength);
        System.out.println("  Longest name: " + longest);
    }
    
    // Another method that does too much
    private void generateCompleteReport() {
        System.out.println("Generating complete report at once:");
        System.out.println("  === DATA ANALYSIS REPORT ===");
        System.out.println("  Date: " + java.time.LocalDate.now());
        System.out.println("  Number of numeric data points: " + numbers.length);
        System.out.println("  Number of text data points: " + names.length);
        System.out.println("  === END OF REPORT ===");
    }
    
    // ERROR 3: Excessive decomposition (methods too small/fragmented)
    public void excessiveDecomposition() {
        System.out.println("\nERROR 3: Excessive decomposition (methods too small/fragmented)");
        
        // Too many tiny methods can also be problematic
        printReportTitle();
        printCurrentDate();
        printNumberCount();
        printTextCount();
        printReportEnd();
        
        System.out.println("\nProblems with this approach:");
        System.out.println("1. Too many tiny methods can make code flow hard to follow");
        System.out.println("2. Excessive method calls can impact performance");
        System.out.println("3. Can lead to overly complex class structure");
    }
    
    // Excessively small methods
    private void printReportTitle() {
        System.out.println("  === DATA ANALYSIS REPORT ===");
    }
    
    private void printCurrentDate() {
        System.out.println("  Date: " + java.time.LocalDate.now());
    }
    
    private void printNumberCount() {
        System.out.println("  Number of numeric data points: " + numbers.length);
    }
    
    private void printTextCount() {
        System.out.println("  Number of text data points: " + names.length);
    }
    
    private void printReportEnd() {
        System.out.println("  === END OF REPORT ===");
    }
    
    // ERROR 4: Poor method naming and organization
    public void poorMethodNaming() {
        System.out.println("\nERROR 4: Poor method naming and organization");
        
        // Methods with unclear names
        doStuff1();
        doStuff2();
        process();
        
        System.out.println("\nProblems with this approach:");
        System.out.println("1. Method names don't clearly indicate their purpose");
        System.out.println("2. Hard to understand what each method does without examining its code");
        System.out.println("3. Makes code maintenance and collaboration difficult");
    }
    
    // Methods with poor, non-descriptive names
    private void doStuff1() {
        System.out.println("  Calculating average of numbers: " + 
            ((double) java.util.Arrays.stream(numbers).sum() / numbers.length));
    }
    
    private void doStuff2() {
        System.out.println("  Finding longest name in the list");
        String longest = "";
        for (String name : names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        System.out.println("  Longest name: " + longest);
    }
    
    private void process() {
        System.out.println("  Processing something...");
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.G.4 Errors: Method Decomposition");
        
        // Sample data
        int[] sampleNumbers = {45, 22, 87, 12, 90, 33, 65};
        String[] sampleNames = {"Alice", "Bob", "Charlie", "David", "Elizabeth"};
        
        // Create an instance of the class
        VAR1G4_Err example = new VAR1G4_Err(sampleNumbers, sampleNames);
        
        // Demonstrate different errors in method decomposition
        example.processDataWithoutDecomposition();
        example.improperDecomposition();
        example.excessiveDecomposition();
        example.poorMethodNaming();
        
        // Summary
        System.out.println("\n--- Common Errors with Method Decomposition ---");
        System.out.println("1. No decomposition: Monolithic methods that try to do everything");
        System.out.println("2. Improper decomposition: Methods still too large and complex");
        System.out.println("3. Excessive decomposition: Too many tiny, fragmented methods");
        System.out.println("4. Poor method naming: Unclear what methods do based on their names");
        System.out.println("5. Inconsistent levels of abstraction in method calls");
    }
}
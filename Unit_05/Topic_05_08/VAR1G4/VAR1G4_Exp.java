/**
 * VAR1G4_Exp - Method Decomposition Example
 * 
 * This program demonstrates VAR-1.G.4:
 * Through method decomposition, a programmer breaks down a large problem
 * into smaller subproblems by creating methods to solve each individual subproblem.
 */
public class VAR1G4_Exp {
    // Instance variables
    private int[] numbers;
    private String[] names;
    
    // Constructor
    public VAR1G4_Exp(int[] numbers, String[] names) {
        this.numbers = numbers;
        this.names = names;
    }
    
    // Main problem: Process and analyze data
    public void processAndAnalyzeData() {
        System.out.println("Processing and analyzing data...");
        System.out.println("Breaking down the problem into smaller subproblems:\n");
        
        // Instead of writing all the code here, we decompose the problem
        // into smaller, more manageable subproblems (methods)
        
        // Subproblem 1: Calculate statistics on numbers
        calculateStatistics();
        
        // Subproblem 2: Process text data
        processTextData();
        
        // Subproblem 3: Generate report
        generateReport();
        
        System.out.println("\nAll data processing and analysis complete!");
    }
    
    // Subproblem 1: Calculate statistics on numbers
    private void calculateStatistics() {
        System.out.println("Subproblem 1: Calculating statistics on numbers");
        
        // Further decomposition into even smaller subproblems
        double average = calculateAverage();
        int max = findMaximum();
        int min = findMinimum();
        
        System.out.println("  Average: " + average);
        System.out.println("  Maximum: " + max);
        System.out.println("  Minimum: " + min);
    }
    
    // Sub-subproblem 1.1: Calculate average
    private double calculateAverage() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    
    // Sub-subproblem 1.2: Find maximum value
    private int findMaximum() {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    // Sub-subproblem 1.3: Find minimum value
    private int findMinimum() {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    // Subproblem 2: Process text data
    private void processTextData() {
        System.out.println("\nSubproblem 2: Processing text data");
        
        // Further decomposition
        int totalLength = calculateTotalLength();
        String longest = findLongestName();
        
        System.out.println("  Total length of all names: " + totalLength);
        System.out.println("  Longest name: " + longest);
    }
    
    // Sub-subproblem 2.1: Calculate total length of all strings
    private int calculateTotalLength() {
        int totalLength = 0;
        for (String name : names) {
            totalLength += name.length();
        }
        return totalLength;
    }
    
    // Sub-subproblem 2.2: Find the longest string
    private String findLongestName() {
        String longest = "";
        for (String name : names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        return longest;
    }
    
    // Subproblem 3: Generate report
    private void generateReport() {
        System.out.println("\nSubproblem 3: Generating report");
        
        // Further decomposition
        System.out.println("  Report Header:");
        generateReportHeader();
        
        System.out.println("  Report Body:");
        generateReportBody();
        
        System.out.println("  Report Footer:");
        generateReportFooter();
    }
    
    // Sub-subproblem 3.1: Generate report header
    private void generateReportHeader() {
        System.out.println("    === DATA ANALYSIS REPORT ===");
        System.out.println("    Date: " + java.time.LocalDate.now());
    }
    
    // Sub-subproblem 3.2: Generate report body
    private void generateReportBody() {
        System.out.println("    Number of numeric data points: " + numbers.length);
        System.out.println("    Number of text data points: " + names.length);
    }
    
    // Sub-subproblem 3.3: Generate report footer
    private void generateReportFooter() {
        System.out.println("    === END OF REPORT ===");
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating VAR-1.G.4: Method Decomposition\n");
        
        // Sample data
        int[] sampleNumbers = {45, 22, 87, 12, 90, 33, 65};
        String[] sampleNames = {"Alice", "Bob", "Charlie", "David", "Elizabeth"};
        
        // Create an instance of the class
        VAR1G4_Exp example = new VAR1G4_Exp(sampleNumbers, sampleNames);
        
        // Process and analyze data using method decomposition
        example.processAndAnalyzeData();
        
        // Summary
        System.out.println("\n--- Key Points about Method Decomposition ---");
        System.out.println("1. Method decomposition breaks down complex problems into smaller, manageable subproblems");
        System.out.println("2. Each method should solve one specific subproblem");
        System.out.println("3. Methods can call other methods to solve even smaller subproblems");
        System.out.println("4. Method decomposition improves code readability and maintainability");
        System.out.println("5. Method decomposition facilitates debugging and testing");
    }
}
/**
 * This program demonstrates common errors in informal run-time comparison of iterative statements (CON-2.H)
 * It shows mistakes that can occur when comparing the efficiency of different iterative approaches.
 */
public class CON2H2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors in run-time comparison of iterative statements:\n");
        
        // Example 1: Error - Inaccurate timing due to insufficient iterations
        System.out.println("Example 1: Error - Inaccurate timing due to insufficient iterations");
        System.out.println("This demonstrates how small sample sizes can lead to misleading conclusions:");
        
        // ERROR: Using too few iterations for meaningful timing
        final int SMALL_SIZE = 10; // Too small for accurate timing
        long startTime, endTime;
        
        System.out.println("INCORRECT: Using only " + SMALL_SIZE + " iterations for timing comparison");
        
        // First approach timing with too few iterations
        startTime = System.nanoTime();
        int sum1 = 0;
        
        for (int i = 0; i < SMALL_SIZE; i++) {
            sum1 += i;
        }
        
        endTime = System.nanoTime();
        long approach1Time = endTime - startTime;
        System.out.println("Approach 1 time: " + approach1Time + " nanoseconds");
        
        // Second approach timing with too few iterations
        startTime = System.nanoTime();
        int sum2 = 0;
        
        for (int i = 0; i < SMALL_SIZE; i++) {
            sum2 = sum2 + i; // Functionally identical to sum1 += i
        }
        
        endTime = System.nanoTime();
        long approach2Time = endTime - startTime;
        System.out.println("Approach 2 time: " + approach2Time + " nanoseconds");
        
        // The timing results with small iterations are likely to be inconsistent
        System.out.println("Ratio: " + (double)approach2Time/approach1Time + "x difference");
        System.out.println("CORRECT approach: Use larger number of iterations (e.g., 1,000,000) for more reliable timing\n");
        
        // Example 2: Error - Not accounting for JVM warmup
        System.out.println("Example 2: Error - Not accounting for JVM warmup");
        System.out.println("This demonstrates how JVM warmup can affect timing results:");
        
        System.out.println("INCORRECT: Running performance-sensitive code without warmup");
        
        // ERROR: First run will be slower due to JVM warmup, class loading, etc.
        startTime = System.nanoTime();
        int sumA = 0;
        for (int i = 0; i < 100000; i++) {
            sumA += i;
        }
        endTime = System.nanoTime();
        long firstRunTime = endTime - startTime;
        System.out.println("First run time: " + firstRunTime + " nanoseconds");
        
        // Second run of the same code will likely be faster
        startTime = System.nanoTime();
        int sumB = 0;
        for (int i = 0; i < 100000; i++) {
            sumB += i;
        }
        endTime = System.nanoTime();
        long secondRunTime = endTime - startTime;
        System.out.println("Second run time: " + secondRunTime + " nanoseconds");
        
        System.out.println("Ratio: " + (double)firstRunTime/secondRunTime + "x difference");
        System.out.println("CORRECT approach: Perform warmup iterations before timing or use multiple runs\n");
        
        // Example 3: Error - Ignoring statement execution count in performance analysis
        System.out.println("Example 3: Error - Ignoring statement execution count in performance analysis");
        System.out.println("This demonstrates how focusing only on time without considering execution count is misleading:");
        
        // Setup for comparison
        int[] smallArray = new int[100];
        int[] largeArray = new int[10000];
        for (int i = 0; i < smallArray.length; i++) {
            smallArray[i] = i;
        }
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i;
        }
        
        // ERROR: Comparing algorithms with different input sizes without normalizing
        startTime = System.nanoTime();
        int smallSum = 0;
        for (int i = 0; i < smallArray.length; i++) {
            smallSum += smallArray[i];
        }
        endTime = System.nanoTime();
        long smallArrayTime = endTime - startTime;
        
        startTime = System.nanoTime();
        int largeSum = 0;
        for (int i = 0; i < largeArray.length; i++) {
            largeSum += largeArray[i];
        }
        endTime = System.nanoTime();
        long largeArrayTime = endTime - startTime;
        
        System.out.println("INCORRECT analysis:");
        System.out.println("Small array (100 elements) time: " + smallArrayTime + " nanoseconds");
        System.out.println("Large array (10000 elements) time: " + largeArrayTime + " nanoseconds");
        System.out.println("Conclusion: Large array processing is " + (double)largeArrayTime/smallArrayTime + "x slower");
        
        System.out.println("\nCORRECT analysis:");
        System.out.println("Small array: " + smallArrayTime + " ns for 100 elements = " + (smallArrayTime / 100.0) + " ns per element");
        System.out.println("Large array: " + largeArrayTime + " ns for 10000 elements = " + (largeArrayTime / 10000.0) + " ns per element");
        System.out.println("Normalized comparison accounts for different execution counts\n");
        
        // Summary
        System.out.println("--- Common Errors in Run-time Comparison ---");
        System.out.println("1. Using too few iterations, leading to unreliable timing results");
        System.out.println("2. Not accounting for JVM warmup and optimization effects");
        System.out.println("3. Comparing algorithms without normalizing for different input sizes");
        System.out.println("4. Focusing only on time without considering statement execution count");
        System.out.println("5. Drawing conclusions from a single run instead of averaging multiple runs");
    }
}
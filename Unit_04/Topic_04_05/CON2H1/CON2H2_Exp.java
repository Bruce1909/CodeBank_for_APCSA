/**
 * This program demonstrates informal run-time comparison of iterative statements (CON-2.H)
 * It shows how to compare the efficiency of different iterative approaches.
 */
public class CON2H2_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating informal run-time comparison of iterative statements:\n");
        
        // Example 1: Comparing single loop vs nested loop
        System.out.println("Example 1: Single Loop vs Nested Loop");
        System.out.println("Comparing execution time of different loop structures:");
        
        final int SIZE = 1000;
        long startTime, endTime;
        
        // Single loop approach
        startTime = System.nanoTime();
        int singleLoopSum = 0;
        
        for (int i = 0; i < SIZE; i++) {
            singleLoopSum += i;
        }
        
        endTime = System.nanoTime();
        long singleLoopTime = endTime - startTime;
        System.out.println("Single loop time: " + singleLoopTime + " nanoseconds");
        System.out.println("Single loop statement execution count: " + SIZE);
        
        // Nested loop approach (unnecessarily complex for this task)
        startTime = System.nanoTime();
        int nestedLoopSum = 0;
        
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < 1; j++) { // Unnecessary inner loop
                nestedLoopSum += i;
            }
        }
        
        endTime = System.nanoTime();
        long nestedLoopTime = endTime - startTime;
        System.out.println("Nested loop time: " + nestedLoopTime + " nanoseconds");
        System.out.println("Nested loop statement execution count: " + SIZE);
        System.out.println("Ratio: " + (double)nestedLoopTime/singleLoopTime + "x slower\n");
        
        // Example 2: Comparing different loop termination conditions
        System.out.println("Example 2: Different Loop Termination Conditions");
        System.out.println("Comparing loops with different termination strategies:");
        
        // Approach 1: Standard loop with precalculated size
        startTime = System.nanoTime();
        int sum1 = 0;
        int arraySize = 10000;
        
        for (int i = 0; i < arraySize; i++) {
            sum1 += i;
        }
        
        endTime = System.nanoTime();
        long approach1Time = endTime - startTime;
        System.out.println("Precalculated size loop time: " + approach1Time + " nanoseconds");
        
        // Approach 2: Loop with condition check on each iteration
        startTime = System.nanoTime();
        int sum2 = 0;
        int[] array = new int[10000];
        
        for (int i = 0; i < array.length; i++) { // Length checked each time
            sum2 += i;
        }
        
        endTime = System.nanoTime();
        long approach2Time = endTime - startTime;
        System.out.println("Length check each iteration time: " + approach2Time + " nanoseconds");
        System.out.println("Ratio: " + (double)approach2Time/approach1Time + "x difference\n");
        
        // Example 3: Comparing early termination vs full iteration
        System.out.println("Example 3: Early Termination vs Full Iteration");
        System.out.println("Comparing search with early termination vs full iteration:");
        
        int[] searchArray = new int[100000];
        // Initialize array with target at position 50
        for (int i = 0; i < searchArray.length; i++) {
            searchArray[i] = i;
        }
        int target = 50;
        
        // Approach 1: Full iteration (always checks all elements)
        startTime = System.nanoTime();
        boolean found1 = false;
        
        for (int i = 0; i < searchArray.length; i++) {
            if (searchArray[i] == target) {
                found1 = true;
                // No break - continues checking all elements
            }
        }
        
        endTime = System.nanoTime();
        long fullIterationTime = endTime - startTime;
        System.out.println("Full iteration time: " + fullIterationTime + " nanoseconds");
        System.out.println("Full iteration statement execution count: " + searchArray.length);
        
        // Approach 2: Early termination (stops once found)
        startTime = System.nanoTime();
        boolean found2 = false;
        int iterations = 0;
        
        for (int i = 0; i < searchArray.length; i++) {
            iterations++;
            if (searchArray[i] == target) {
                found2 = true;
                break; // Stops once target is found
            }
        }
        
        endTime = System.nanoTime();
        long earlyTerminationTime = endTime - startTime;
        System.out.println("Early termination time: " + earlyTerminationTime + " nanoseconds");
        System.out.println("Early termination statement execution count: " + iterations);
        System.out.println("Ratio: " + (double)fullIterationTime/earlyTerminationTime + "x difference");
        
        // Summary
        System.out.println("\n--- Key Points about Run-time Comparison ---");
        System.out.println("1. Statement execution count directly impacts run-time efficiency");
        System.out.println("2. Nested loops generally have higher execution counts than single loops");
        System.out.println("3. Unnecessary computations in loop conditions can impact performance");
        System.out.println("4. Early termination can significantly reduce execution count and time");
        System.out.println("5. Optimizing loops is important for performance-critical applications");
    }
}
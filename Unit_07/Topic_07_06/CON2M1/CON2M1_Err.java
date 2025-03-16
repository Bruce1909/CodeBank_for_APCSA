public class CON2M1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when comparing algorithm efficiency:\n");
        
        // Create arrays for testing
        int[] smallArray = createRandomArray(10);
        int[] mediumArray = createRandomArray(100);
        
        // Error 1: Inconsistent measurement - counting different operations
        System.out.println("--- Error 1: Inconsistent Measurement ---");
        System.out.println("Bubble Sort (counting comparisons):");
        int bubbleComparisonCount = bubbleSortCountingComparisons(copyArray(smallArray));
        System.out.println("Comparison count: " + bubbleComparisonCount);
        
        System.out.println("\nSelection Sort (counting swaps):");
        int selectionSwapCount = selectionSortCountingSwaps(copyArray(smallArray));
        System.out.println("Swap count: " + selectionSwapCount);
        
        System.out.println("\nERROR: Comparing different operations (comparisons vs swaps) leads to");
        System.out.println("invalid conclusions about algorithm efficiency.");
        
        // Error 2: Not accounting for input characteristics
        System.out.println("\n--- Error 2: Not Accounting for Input Characteristics ---");
        int[] sortedArray = createSortedArray(100);
        int[] reversedArray = createReversedArray(100);
        
        System.out.println("Bubble Sort on already sorted array:");
        int bubbleSortedCount = bubbleSortCountingComparisons(copyArray(sortedArray));
        System.out.println("Comparison count: " + bubbleSortedCount);
        
        System.out.println("\nBubble Sort on reversed array:");
        int bubbleReversedCount = bubbleSortCountingComparisons(copyArray(reversedArray));
        System.out.println("Comparison count: " + bubbleReversedCount);
        
        System.out.println("\nERROR: Not considering input characteristics (sorted, reversed, random)");
        System.out.println("can lead to misleading performance conclusions.");
        
        // Error 3: Using wall clock time instead of operation counts
        System.out.println("\n--- Error 3: Using Wall Clock Time Instead of Operation Counts ---");
        System.out.println("Measuring bubble sort with System.currentTimeMillis():");
        
        long startTime = System.currentTimeMillis();
        bubbleSort(copyArray(mediumArray)); // Not capturing operation count
        long endTime = System.currentTimeMillis();
        
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
        System.out.println("\nERROR: Wall clock time is affected by system load, JVM state, and other factors.");
        System.out.println("It's less reliable than counting operations for algorithm comparison.");
        
        // Error 4: Not considering algorithm's best/worst/average cases
        System.out.println("\n--- Error 4: Not Considering Best/Worst/Average Cases ---");
        System.out.println("ERROR: Drawing conclusions based on a single run or single input type");
        System.out.println("doesn't account for an algorithm's varying performance characteristics.");
        
        // Error 5: Incorrect growth rate calculation
        System.out.println("\n--- Error 5: Incorrect Growth Rate Calculation ---");
        int[] tiny = createRandomArray(10);
        int[] small = createRandomArray(20);
        
        int tinyCount = bubbleSortCountingComparisons(copyArray(tiny));
        int smallCount = bubbleSortCountingComparisons(copyArray(small));
        
        // Incorrect: Linear growth assumption
        System.out.println("Tiny array (10 elements) count: " + tinyCount);
        System.out.println("Small array (20 elements) count: " + smallCount);
        System.out.println("Input size increased by: 2x");
        System.out.println("Operation count increased by: " + String.format("%.2f", (double)smallCount / tinyCount) + "x");
        System.out.println("Incorrect conclusion: Growth appears to be approximately linear");
        System.out.println("\nERROR: Need larger input sizes and more data points to accurately determine");
        System.out.println("the growth rate (which is actually quadratic for bubble sort).");
        
        // Summary
        System.out.println("\n--- Common Errors When Comparing Algorithm Efficiency ---");
        System.out.println("1. Counting different operations across algorithms");
        System.out.println("2. Not accounting for input characteristics (sorted, reversed, random)");
        System.out.println("3. Using wall clock time instead of operation counts");
        System.out.println("4. Not considering best/worst/average cases");
        System.out.println("5. Drawing conclusions from insufficient data points");
        System.out.println("6. Not normalizing counts for fair comparison");
        System.out.println("7. Focusing only on speed while ignoring memory usage");
    }
    
    /**
     * Bubble Sort implementation that counts comparisons
     * ERROR: Only counting comparisons, not other operations
     */
    private static int bubbleSortCountingComparisons(int[] arr) {
        int comparisonCount = 0;
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisonCount++; // Count each comparison
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // Not counting swap operations
                }
            }
        }
        
        return comparisonCount;
    }
    
    /**
     * Selection Sort implementation that counts swaps
     * ERROR: Only counting swaps, not comparisons
     */
    private static int selectionSortCountingSwaps(int[] arr) {
        int swapCount = 0;
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Not counting comparisons
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the element at index i
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swapCount++; // Count each swap
            }
        }
        
        return swapCount;
    }
    
    /**
     * Standard bubble sort without any counting
     * ERROR: Not measuring algorithm efficiency
     */
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    /**
     * Creates an array of the specified size filled with random integers
     */
    private static int[] createRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }
        return arr;
    }
    
    /**
     * Creates a sorted array of the specified size
     */
    private static int[] createSortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }
    
    /**
     * Creates a reversed (descending) array of the specified size
     */
    private static int[] createReversedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i - 1;
        }
        return arr;
    }
    
    /**
     * Creates a copy of the given array
     */
    private static int[] copyArray(int[] original) {
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }
}
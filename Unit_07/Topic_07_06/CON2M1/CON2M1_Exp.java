public class CON2M1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating informal run-time comparison using statement execution counts:\n");
        
        // Create arrays for testing
        int[] smallArray = createRandomArray(10);
        int[] mediumArray = createRandomArray(100);
        int[] largeArray = createRandomArray(1000);
        
        System.out.println("--- Bubble Sort Performance ---");
        System.out.println("Small array (10 elements):");
        int bubbleSmallCount = bubbleSort(copyArray(smallArray));
        System.out.println("Statement execution count: " + bubbleSmallCount);
        
        System.out.println("\nMedium array (100 elements):");
        int bubbleMediumCount = bubbleSort(copyArray(mediumArray));
        System.out.println("Statement execution count: " + bubbleMediumCount);
        
        System.out.println("\nLarge array (1000 elements):");
        int bubbleLargeCount = bubbleSort(copyArray(largeArray));
        System.out.println("Statement execution count: " + bubbleLargeCount);
        
        System.out.println("\n--- Selection Sort Performance ---");
        System.out.println("Small array (10 elements):");
        int selectionSmallCount = selectionSort(copyArray(smallArray));
        System.out.println("Statement execution count: " + selectionSmallCount);
        
        System.out.println("\nMedium array (100 elements):");
        int selectionMediumCount = selectionSort(copyArray(mediumArray));
        System.out.println("Statement execution count: " + selectionMediumCount);
        
        System.out.println("\nLarge array (1000 elements):");
        int selectionLargeCount = selectionSort(copyArray(largeArray));
        System.out.println("Statement execution count: " + selectionLargeCount);
        
        // Compare the algorithms
        System.out.println("\n--- Comparison Summary ---");
        System.out.println("Bubble Sort vs Selection Sort statement execution counts:");
        System.out.println("Small array (10 elements): " + bubbleSmallCount + " vs " + selectionSmallCount);
        System.out.println("Medium array (100 elements): " + bubbleMediumCount + " vs " + selectionMediumCount);
        System.out.println("Large array (1000 elements): " + bubbleLargeCount + " vs " + selectionLargeCount);
        
        // Calculate and display the growth rate
        System.out.println("\n--- Growth Rate Analysis ---");
        System.out.println("Bubble Sort growth from small to medium: " + 
                           String.format("%.2f", (double)bubbleMediumCount / bubbleSmallCount) + "x");
        System.out.println("Bubble Sort growth from medium to large: " + 
                           String.format("%.2f", (double)bubbleLargeCount / bubbleMediumCount) + "x");
        System.out.println("Selection Sort growth from small to medium: " + 
                           String.format("%.2f", (double)selectionMediumCount / selectionSmallCount) + "x");
        System.out.println("Selection Sort growth from medium to large: " + 
                           String.format("%.2f", (double)selectionLargeCount / selectionMediumCount) + "x");
        
        // Key points summary
        System.out.println("\n--- Key Points about Statement Execution Counts ---");
        System.out.println("1. Statement execution counts provide an informal way to compare algorithm efficiency");
        System.out.println("2. Counting key operations (comparisons, swaps) helps quantify algorithm performance");
        System.out.println("3. The growth rate of execution counts as input size increases reveals time complexity");
        System.out.println("4. Bubble Sort typically has O(n²) complexity with ~n²/2 comparisons in average case");
        System.out.println("5. Selection Sort always performs exactly (n²-n)/2 comparisons regardless of input");
        System.out.println("6. Statement counts help identify which algorithm is more efficient for specific inputs");
    }
    
    /**
     * Implementation of Bubble Sort with statement execution counter
     * Returns the number of key statement executions (comparisons)
     */
    private static int bubbleSort(int[] arr) {
        int statementCount = 0; // Counter for statement executions
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                statementCount++; // Count each comparison
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no swapping occurred in this pass, array is sorted
            if (!swapped) {
                break;
            }
        }
        
        return statementCount;
    }
    
    /**
     * Implementation of Selection Sort with statement execution counter
     * Returns the number of key statement executions (comparisons)
     */
    private static int selectionSort(int[] arr) {
        int statementCount = 0; // Counter for statement executions
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                statementCount++; // Count each comparison
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the element at index i
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        
        return statementCount;
    }
    
    /**
     * Creates an array of the specified size filled with random integers
     */
    private static int[] createRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 1000); // Random integers between 0 and 999
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
/**
 * This program demonstrates standard algorithms that utilize array traversals (CON-2.I.1)
 * It shows various common array operations like finding min/max, computing sum/average,
 * checking properties, accessing consecutive pairs, finding duplicates, and counting elements.
 */
public class CON2I1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating standard array traversal algorithms (CON-2.I.1):\n");
        
        // Sample array for demonstrations
        int[] numbers = {7, 2, 8, 3, 5, 2, 9, 4, 6, 1};
        System.out.println("Working with array: [7, 2, 8, 3, 5, 2, 9, 4, 6, 1]\n");
        
        // Example 1: Determine minimum and maximum values
        System.out.println("Example 1: Finding minimum and maximum values");
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println();
        
        // Example 2: Compute sum, average, and mode
        System.out.println("Example 2: Computing sum, average, and mode");
        int sum = 0;
        
        // Calculate sum
        for (int num : numbers) {
            sum += num;
        }
        
        // Calculate average
        double average = (double) sum / numbers.length;
        
        // Find mode (most frequent element)
        int mode = findMode(numbers);
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Mode: " + mode);
        System.out.println();
        
        // Example 3: Determine if at least one element has a particular property
        System.out.println("Example 3: Checking if at least one element has a property");
        boolean hasEven = false;
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                hasEven = true;
                break; // We can stop once we find one
            }
        }
        
        System.out.println("Contains at least one even number: " + hasEven);
        System.out.println();
        
        // Example 4: Determine if all elements have a particular property
        System.out.println("Example 4: Checking if all elements have a property");
        boolean allPositive = true;
        
        for (int num : numbers) {
            if (num <= 0) {
                allPositive = false;
                break; // We can stop once we find a counter-example
            }
        }
        
        System.out.println("All numbers are positive: " + allPositive);
        System.out.println();
        
        // Example 5: Access all consecutive pairs of elements
        System.out.println("Example 5: Accessing consecutive pairs of elements");
        System.out.println("Consecutive pairs:");
        
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("Pair: (" + numbers[i] + ", " + numbers[i + 1] + ")");
        }
        System.out.println();
        
        // Example 6: Determine presence of duplicate elements
        System.out.println("Example 6: Checking for duplicate elements");
        boolean hasDuplicates = false;
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    hasDuplicates = true;
                    System.out.println("Found duplicate: " + numbers[i]);
                    break;
                }
            }
            if (hasDuplicates) {
                break;
            }
        }
        
        System.out.println("Array contains duplicates: " + hasDuplicates);
        System.out.println();
        
        // Example 7: Count elements meeting specific criteria
        System.out.println("Example 7: Counting elements meeting specific criteria");
        int countEven = 0;
        int countGreaterThan5 = 0;
        
        for (int num : numbers) {
            // Count even numbers
            if (num % 2 == 0) {
                countEven++;
            }
            
            // Count numbers greater than 5
            if (num > 5) {
                countGreaterThan5++;
            }
        }
        
        System.out.println("Count of even numbers: " + countEven);
        System.out.println("Count of numbers greater than 5: " + countGreaterThan5);
        System.out.println();
        
        // Summary
        System.out.println("--- Standard Array Traversal Algorithms ---");
        System.out.println("1. Finding minimum/maximum values");
        System.out.println("2. Computing sum, average, and mode");
        System.out.println("3. Checking if at least one element has a property");
        System.out.println("4. Checking if all elements have a property");
        System.out.println("5. Accessing consecutive pairs of elements");
        System.out.println("6. Determining presence of duplicates");
        System.out.println("7. Counting elements meeting specific criteria");
    }
    
    // Helper method to find the mode (most frequent element) in an array
    private static int findMode(int[] arr) {
        int mode = arr[0];
        int maxFrequency = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            int frequency = 0;
            
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == currentValue) {
                    frequency++;
                }
            }
            
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = currentValue;
            }
        }
        
        return mode;
    }
}
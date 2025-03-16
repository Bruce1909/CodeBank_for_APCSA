/**
 * This program demonstrates common errors when implementing standard array traversal algorithms (CON-2.I.1)
 * It shows mistakes that can occur when finding min/max, computing sum/average,
 * checking properties, accessing consecutive pairs, finding duplicates, and counting elements.
 */
public class CON2I1_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors in array traversal algorithms (CON-2.I.1):\n");
        
        // Sample array for demonstrations
        int[] numbers = {7, 2, 8, 3, 5, 2, 9, 4, 6, 1};
        System.out.println("Working with array: [7, 2, 8, 3, 5, 2, 9, 4, 6, 1]\n");
        
        // Example 1: ERROR - Incorrect initialization when finding minimum and maximum values
        System.out.println("Example 1: ERROR - Incorrect initialization for min/max");
        // ERROR: Initializing min/max with arbitrary values instead of first element
        int min = Integer.MAX_VALUE; // This is acceptable but not necessary
        int max = 0; // ERROR: This is incorrect - what if all values are negative?
        
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Minimum value (correct): " + min);
        System.out.println("Maximum value (potentially incorrect): " + max);
        System.out.println("If all values were negative, max would remain 0 incorrectly");
        System.out.println();
        
        // Example 2: ERROR - Incorrect average calculation
        System.out.println("Example 2: ERROR - Incorrect average calculation");
        int sum = 0;
        
        for (int num : numbers) {
            sum += num;
        }
        
        // ERROR: Integer division truncates decimal part
        int incorrectAverage = sum / numbers.length;
        // Correct way: Cast to double before division
        double correctAverage = (double) sum / numbers.length;
        
        System.out.println("Sum: " + sum);
        System.out.println("Incorrect average (integer division): " + incorrectAverage);
        System.out.println("Correct average: " + correctAverage);
        System.out.println();
        
        // Example 3: ERROR - Inefficient property checking
        System.out.println("Example 3: ERROR - Inefficient property checking");
        boolean hasEven = false;
        
        // ERROR: Not breaking the loop after finding a match
        System.out.println("Inefficient approach (not using break):");
        for (int num : numbers) {
            if (num % 2 == 0) {
                hasEven = true;
                // Missing break statement - continues checking unnecessarily
                System.out.println("  Found even number: " + num + " but continuing to check...");
            }
        }
        
        System.out.println("Contains at least one even number: " + hasEven);
        System.out.println();
        
        // Example 4: ERROR - Incorrect logic for checking all elements
        System.out.println("Example 4: ERROR - Incorrect logic for checking all elements");
        boolean allLessThan10 = false; // ERROR: Should initialize to true
        
        for (int num : numbers) {
            if (num < 10) {
                allLessThan10 = true; // ERROR: This should set to false if condition fails
            }
        }
        
        System.out.println("Incorrect result - All numbers less than 10: " + allLessThan10);
        System.out.println("The correct approach would initialize to true and set to false if condition fails");
        System.out.println();
        
        // Example 5: ERROR - Off-by-one error when accessing consecutive pairs
        System.out.println("Example 5: ERROR - Off-by-one error when accessing consecutive pairs");
        System.out.println("Incorrect approach (includes out of bounds access):");
        
        try {
            // ERROR: Loop bound should be length-1 to avoid ArrayIndexOutOfBoundsException
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Pair: (" + numbers[i] + ", " + numbers[i + 1] + ")");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: ArrayIndexOutOfBoundsException - Tried to access element beyond array bounds");
            System.out.println("The correct loop should be: for (int i = 0; i < numbers.length - 1; i++)");
        }
        System.out.println();
        
        // Example 6: ERROR - Inefficient duplicate checking
        System.out.println("Example 6: ERROR - Inefficient duplicate checking");
        boolean hasDuplicates = false;
        int comparisons = 0;
        
        // ERROR: Inefficient approach checking all pairs, including redundant checks
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                comparisons++;
                if (i != j && numbers[i] == numbers[j]) {
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
        System.out.println("Inefficient approach used " + comparisons + " comparisons");
        System.out.println("More efficient approach would only check each pair once");
        System.out.println();
        
        // Example 7: ERROR - Logic error in counting elements
        System.out.println("Example 7: ERROR - Logic error in counting elements");
        int countEven = 0;
        int countOdd = 0;
        
        for (int num : numbers) {
            // Count even numbers
            if (num % 2 == 0) {
                countEven++;
            }
            // ERROR: This should be an else clause - current logic double counts
            if (num % 2 != 0) { // Should be else if or else
                countOdd++;
            }
        }
        
        System.out.println("Count of even numbers: " + countEven);
        System.out.println("Count of odd numbers: " + countOdd);
        System.out.println("Sum of counts: " + (countEven + countOdd) + " (should equal array length: " + numbers.length + ")");
        System.out.println("The correct approach would use an else clause to ensure each element is counted exactly once");
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors in Array Traversal Algorithms ---");
        System.out.println("1. Incorrect initialization of variables (e.g., min/max values)");
        System.out.println("2. Integer division when calculating averages");
        System.out.println("3. Not using break when appropriate, leading to inefficient code");
        System.out.println("4. Incorrect logic for 'all elements' checks");
        System.out.println("5. Off-by-one errors when accessing consecutive elements");
        System.out.println("6. Inefficient algorithms for finding duplicates");
        System.out.println("7. Logic errors in counting elements meeting specific criteria");
    }
}
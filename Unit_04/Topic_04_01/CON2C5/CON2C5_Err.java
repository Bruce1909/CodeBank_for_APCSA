/**
 * CON2C5_Err.java
 * 
 * This program demonstrates common errors related to return statements inside iteration statements.
 * Knowledge Point: CON-2.C.5 - Executing a return statement inside an iteration statement 
 * will halt the loop and exit the method or constructor.
 */
public class CON2C5_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with return statements in loops:\n");
        
        // Example 1: Misunderstanding the difference between return and break
        System.out.println("Example 1: Misunderstanding the difference between return and break");
        int[] numbers = {3, 7, 12, 19, 21, 44};
        
        System.out.println("Finding the first multiple of 7 in the array");
        int result = findFirstMultipleOfSevenIncorrect(numbers);
        System.out.println("Result from incorrect method: " + result);
        
        result = findFirstMultipleOfSevenCorrect(numbers);
        System.out.println("Result from correct method: " + result);
        System.out.println();
        
        // Example 2: Forgetting that return exits the entire method
        System.out.println("Example 2: Forgetting that return exits the entire method");
        System.out.println("Processing a list of transactions");
        
        System.out.println("\nIncorrect approach (code shown but not executed):");
        System.out.println("void processTransactions(Transaction[] transactions) {");
        System.out.println("    int i = 0;");
        System.out.println("    while (i < transactions.length) {");
        System.out.println("        if (transactions[i].isInvalid()) {");
        System.out.println("            System.out.println(\"Invalid transaction found. Stopping processing.\");");
        System.out.println("            return; // Error: This exits the method entirely");
        System.out.println("        }");
        System.out.println("        i++;");
        System.out.println("    }");
        System.out.println("    System.out.println(\"All transactions processed successfully\"); // Never executes if any invalid transaction");
        System.out.println("}");
        
        System.out.println("\nDemonstration with simulated transactions:");
        processTransactionsIncorrect();
        System.out.println("\nCorrect approach (using a flag instead of return):");
        processTransactionsCorrect();
        System.out.println();
        
        // Example 3: Unreachable code after return
        System.out.println("Example 3: Unreachable code after return");
        System.out.println("Checking if a number is prime");
        
        System.out.println("\nIncorrect approach with unreachable code:");
        System.out.println("boolean isPrimeIncorrect(int num) {");
        System.out.println("    if (num <= 1) {");
        System.out.println("        return false;");
        System.out.println("    }");
        System.out.println("    int i = 2;");
        System.out.println("    while (i <= Math.sqrt(num)) {");
        System.out.println("        if (num % i == 0) {");
        System.out.println("            return false; // Exits the method if divisor found");
        System.out.println("            i++; // Error: This line is unreachable");
        System.out.println("        }");
        System.out.println("        i++;");
        System.out.println("    }");
        System.out.println("    return true;");
        System.out.println("}");
        
        System.out.println("\nDemonstration with sample numbers:");
        System.out.println("Is 7 prime? " + isPrimeCorrect(7));
        System.out.println("Is 10 prime? " + isPrimeCorrect(10));
        System.out.println();
        
        // Example 4: Misplaced return causing early method exit
        System.out.println("Example 4: Misplaced return causing early method exit");
        int[] values = {5, 10, 15, 20, 25};
        
        System.out.println("\nIncorrect approach (early return in the wrong place):");
        System.out.println("int sumValuesAboveThresholdIncorrect(int[] values, int threshold) {");
        System.out.println("    int sum = 0;");
        System.out.println("    int i = 0;");
        System.out.println("    while (i < values.length) {");
        System.out.println("        if (values[i] > threshold) {");
        System.out.println("            sum += values[i];");
        System.out.println("            return sum; // Error: Returns after finding first value above threshold");
        System.out.println("        }");
        System.out.println("        i++;");
        System.out.println("    }");
        System.out.println("    return sum;");
        System.out.println("}");
        
        System.out.println("\nDemonstration with threshold = 12:");
        int threshold = 12;
        int sumIncorrect = sumValuesAboveThresholdIncorrect(values, threshold);
        System.out.println("Incorrect sum of values above " + threshold + ": " + sumIncorrect);
        
        int sumCorrect = sumValuesAboveThresholdCorrect(values, threshold);
        System.out.println("Correct sum of values above " + threshold + ": " + sumCorrect);
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors with Return Statements in Loops ---");
        System.out.println("1. Confusing return with break (return exits the method, break exits only the loop)");
        System.out.println("2. Forgetting that code after a return statement is unreachable");
        System.out.println("3. Misplacing return statements causing premature method exit");
        System.out.println("4. Not considering all execution paths when using returns in loops");
        System.out.println("5. Using return when a flag variable would be more appropriate");
    }
    
    /**
     * Incorrect implementation that confuses break and return.
     * The method should return the first multiple of 7, but incorrectly uses break.
     */
    private static int findFirstMultipleOfSevenIncorrect(int[] numbers) {
        System.out.println("\nIncorrect implementation (using break instead of return):");
        int result = -1;
        int i = 0;
        
        while (i < numbers.length) {
            System.out.println("Checking " + numbers[i]);
            if (numbers[i] % 7 == 0) {
                System.out.println("Found multiple of 7: " + numbers[i]);
                result = numbers[i];
                break; // This exits the loop but not the method
            }
            i++;
        }
        
        // This code always executes, potentially overwriting the found result
        System.out.println("Loop finished, setting result to last checked number");
        if (i < numbers.length) {
            result = numbers[i]; // Error: This might overwrite our found multiple of 7
        }
        
        return result;
    }
    
    /**
     * Correct implementation that properly uses return to exit the method.
     */
    private static int findFirstMultipleOfSevenCorrect(int[] numbers) {
        System.out.println("\nCorrect implementation (using return to exit method):");
        int i = 0;
        
        while (i < numbers.length) {
            System.out.println("Checking " + numbers[i]);
            if (numbers[i] % 7 == 0) {
                System.out.println("Found multiple of 7: " + numbers[i]);
                return numbers[i]; // Immediately exits the method with the result
            }
            i++;
        }
        
        System.out.println("No multiple of 7 found");
        return -1; // Return default value if no multiple found
    }
    
    /**
     * Simulates processing transactions with incorrect return usage.
     */
    private static void processTransactionsIncorrect() {
        boolean[] validFlags = {true, true, false, true}; // Simulated transaction validity
        
        int i = 0;
        while (i < validFlags.length) {
            System.out.println("Processing transaction " + (i + 1));
            
            if (!validFlags[i]) {
                System.out.println("Invalid transaction found. Stopping processing.");
                return; // Error: This exits the method entirely
            }
            
            System.out.println("Transaction " + (i + 1) + " processed successfully");
            i++;
        }
        
        System.out.println("All transactions processed successfully"); // Never executes if any invalid transaction
    }
    
    /**
     * Simulates processing transactions with correct approach using a flag.
     */
    private static void processTransactionsCorrect() {
        boolean[] validFlags = {true, true, false, true}; // Simulated transaction validity
        boolean encounteredInvalid = false;
        
        int i = 0;
        while (i < validFlags.length) {
            System.out.println("Processing transaction " + (i + 1));
            
            if (!validFlags[i]) {
                System.out.println("Invalid transaction found. Marking as invalid but continuing.");
                encounteredInvalid = true;
                // No return here, just set a flag and continue
            } else {
                System.out.println("Transaction " + (i + 1) + " processed successfully");
            }
            
            i++;
        }
        
        if (encounteredInvalid) {
            System.out.println("Processing completed with some invalid transactions");
        } else {
            System.out.println("All transactions processed successfully");
        }
    }
    
    /**
     * Correct implementation of a prime number checker.
     */
    private static boolean isPrimeCorrect(int num) {
        if (num <= 1) {
            return false;
        }
        
        int i = 2;
        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                return false; // Exits the method if divisor found
            }
            i++;
        }
        
        return true;
    }
    
    /**
     * Incorrect implementation that returns after finding the first value above threshold.
     */
    private static int sumValuesAboveThresholdIncorrect(int[] values, int threshold) {
        int sum = 0;
        int i = 0;
        
        while (i < values.length) {
            System.out.println("Checking value: " + values[i]);
            if (values[i] > threshold) {
                System.out.println(values[i] + " is above threshold, adding to sum");
                sum += values[i];
                System.out.println("Current sum: " + sum);
                return sum; // Error: Returns after finding first value above threshold
            }
            i++;
        }
        
        return sum;
    }
    
    /**
     * Correct implementation that sums all values above threshold.
     */
    private static int sumValuesAboveThresholdCorrect(int[] values, int threshold) {
        int sum = 0;
        int i = 0;
        
        while (i < values.length) {
            System.out.println("Checking value: " + values[i]);
            if (values[i] > threshold) {
                System.out.println(values[i] + " is above threshold, adding to sum");
                sum += values[i];
                System.out.println("Current sum: " + sum);
            }
            i++;
        }
        
        return sum; // Return sum after checking all values
    }
}
/**
 * CON2C4_Err.java
 * 
 * This program demonstrates common errors related to the behavior of while loops
 * when the Boolean expression evaluates to false initially.
 * Knowledge Point: CON-2.C.4 - If the Boolean expression evaluates to false initially, the loop body is not executed at all.
 */
public class CON2C4_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with initially false conditions in while loops:\n");
        
        // Example 1: Assuming the loop body will execute at least once
        System.out.println("Example 1: Assuming the loop body will execute at least once");
        int count = 10;
        int sum = 0;
        
        System.out.println("Initial count value: " + count);
        System.out.println("Loop condition: count < 5");
        
        System.out.println("\nIncorrect assumption:");
        System.out.println("// Assuming this will initialize sum with at least one value");
        System.out.println("while (count < 5) {");
        System.out.println("    sum += count;");
        System.out.println("    count++;");
        System.out.println("}");
        System.out.println("// Expecting sum to have some value here");
        
        // Demonstrate the actual behavior
        while (count < 5) {
            sum += count;
            count++;
        }
        
        System.out.println("\nActual result: sum = " + sum);
        System.out.println("The loop body was never executed because count (10) was not less than 5");
        
        System.out.println("\nCorrect approach using do-while if at least one execution is needed:");
        count = 10; // Reset count
        sum = 0;    // Reset sum
        
        do {
            sum += count;
            count++;
        } while (count < 5);
        
        System.out.println("Using do-while: sum = " + sum + " (loop body executed once)");
        System.out.println();
        
        // Example 2: Forgetting to initialize variables that should be set in the loop
        System.out.println("Example 2: Forgetting to initialize variables that should be set in the loop");
        boolean found = false;
        int searchValue = 10;
        int[] numbers = {20, 30, 40};
        int foundIndex = -1; // Should be initialized to a default value
        
        System.out.println("Searching for " + searchValue + " in array: [20, 30, 40]");
        
        System.out.println("\nPotentially problematic code:");
        System.out.println("int foundIndex; // No initialization");
        System.out.println("while (index < numbers.length && !found) {");
        System.out.println("    if (numbers[index] == searchValue) {");
        System.out.println("        foundIndex = index;");
        System.out.println("        found = true;");
        System.out.println("    }");
        System.out.println("    index++;");
        System.out.println("}");
        System.out.println("// Using foundIndex here could be problematic if loop never executes");
        
        int index = 0;
        while (index < numbers.length && !found) {
            if (numbers[index] == searchValue) {
                foundIndex = index;
                found = true;
            }
            index++;
        }
        
        System.out.println("\nResult: foundIndex = " + foundIndex);
        if (foundIndex == -1) {
            System.out.println("Value not found, using default value (-1) because loop may not execute");
        }
        System.out.println();
        
        // Example 3: Misunderstanding the difference between while and do-while
        System.out.println("Example 3: Misunderstanding the difference between while and do-while");
        boolean condition = false;
        
        System.out.println("Initial condition: " + condition);
        
        System.out.println("\nIncorrect expectation:");
        System.out.println("// Expecting this to print 'Processing...' at least once");
        System.out.println("while (condition) {");
        System.out.println("    System.out.println(\"Processing...\");");
        System.out.println("    // Do some work");
        System.out.println("}");
        
        System.out.println("\nActual behavior of while loop:");
        while (condition) {
            System.out.println("Processing..."); // This never executes
        }
        System.out.println("Nothing was printed because the condition was false initially");
        
        System.out.println("\nCorrect usage of do-while when at least one execution is needed:");
        do {
            System.out.println("Processing..."); // This executes once
        } while (condition);
        System.out.println();
        
        // Example 4: Incorrect validation logic
        System.out.println("Example 4: Incorrect validation logic");
        String[] userInputs = {""};  // Simulating an empty user input
        
        System.out.println("Validating user input: \"\" (empty string)");
        
        System.out.println("\nIncorrect validation approach:");
        System.out.println("// Expecting to prompt user for input if initial input is empty");
        System.out.println("String userInput = \"\"; // Empty initial input");
        System.out.println("while (userInput.isEmpty()) {");
        System.out.println("    System.out.println(\"Input cannot be empty. Please enter a value:\");");
        System.out.println("    userInput = getNextInput(); // Get next input");
        System.out.println("}");
        
        System.out.println("\nSimulation of the above code:");
        index = 0;
        String userInput = userInputs[0]; // Start with empty input
        
        while (userInput.isEmpty()) {
            System.out.println("Input cannot be empty. Please enter a value:");
            // In a real program, we would get user input here
            // For simulation, we'll just use a non-empty value
            userInput = "Valid Input";
            System.out.println("User entered: " + userInput);
        }
        
        System.out.println("\nNote: In a console application, this works as expected.");
        System.out.println("However, in other contexts (like GUI applications), you might need to");
        System.out.println("validate the initial input before entering the loop.");
        
        // Summary
        System.out.println("\n--- Common Errors with Initially False Conditions ---");
        System.out.println("1. Assuming the loop body will execute at least once");
        System.out.println("2. Forgetting to initialize variables that should be set in the loop");
        System.out.println("3. Using while when do-while would be more appropriate");
        System.out.println("4. Not considering the case where the loop body never executes");
        System.out.println("5. Relying on side effects from the loop body when it might not execute");
    }
}
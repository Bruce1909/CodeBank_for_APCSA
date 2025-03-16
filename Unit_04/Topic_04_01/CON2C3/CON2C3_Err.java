/**
 * CON2C3_Err.java
 * 
 * This program demonstrates common errors related to infinite loops in Java.
 * Knowledge Point: CON-2.C.3 - A loop is an infinite loop when the Boolean expression always evaluates to true.
 */
public class CON2C3_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors with infinite loops:\n");
        
        // Example 1: Unintentional infinite loop due to incorrect condition
        System.out.println("Example 1: Unintentional infinite loop due to incorrect condition");
        int count = 10;
        
        System.out.println("Initial count value: " + count);
        System.out.println("Intended loop: Count down from 10 to 1");
        
        System.out.println("\nIncorrect loop (commented out to prevent infinite loop):");
        System.out.println("while (count > 0) {");
        System.out.println("    System.out.println(\"Count: \" + count);");
        System.out.println("    count++; // Error: Incrementing instead of decrementing");
        System.out.println("}");
        
        System.out.println("\nThis creates an infinite loop because count keeps increasing and will always be > 0");
        System.out.println("Correct version:");
        count = 10; // Reset count
        while (count > 0) {
            System.out.println("Count: " + count);
            count--; // Decrement to eventually reach the termination condition
        }
        System.out.println();
        
        // Example 2: Infinite loop due to logical error in condition update
        System.out.println("Example 2: Infinite loop due to logical error in condition update");
        int target = 100;
        count = 1;
        
        System.out.println("Initial values: count = " + count + ", target = " + target);
        System.out.println("Intended behavior: Double count until it exceeds target");
        
        System.out.println("\nIncorrect loop (commented out to prevent infinite loop):");
        System.out.println("while (count < target) {");
        System.out.println("    System.out.println(\"Count: \" + count);");
        System.out.println("    if (count > 50) {");
        System.out.println("        count = count / 2; // Error: Dividing instead of multiplying when count > 50");
        System.out.println("    } else {");
        System.out.println("        count = count * 2;");
        System.out.println("    }");
        System.out.println("}");
        
        System.out.println("\nThis creates an infinite loop because once count exceeds 50,");
        System.out.println("it will be divided by 2, keeping it below target indefinitely");
        
        System.out.println("\nCorrect version:");
        count = 1; // Reset count
        while (count < target) {
            System.out.println("Count: " + count);
            count = count * 2; // Always double the count to eventually exceed target
        }
        System.out.println("Final count: " + count);
        System.out.println();
        
        // Example 3: Infinite loop due to floating-point precision issues
        System.out.println("Example 3: Infinite loop due to floating-point precision issues");
        
        System.out.println("Incorrect loop with floating-point comparison (commented out):");
        System.out.println("double value = 0.0;");
        System.out.println("while (value != 1.0) { // Error: Exact equality with floating-point");
        System.out.println("    value = value + 0.1;");
        System.out.println("    System.out.println(\"Value: \" + value);");
        System.out.println("}");
        
        System.out.println("\nThis creates an infinite loop because 0.1 cannot be exactly represented in binary,");
        System.out.println("so adding it 10 times will not result in exactly 1.0");
        
        System.out.println("\nDemonstration of floating-point precision issue:");
        double value = 0.0;
        int iterations = 0;
        while (iterations < 10) {
            value = value + 0.1;
            iterations++;
            System.out.println("After adding 0.1 " + iterations + " times: " + value);
        }
        System.out.println("Is value exactly 1.0? " + (value == 1.0));
        
        System.out.println("\nCorrect version using a threshold or counter:");
        value = 0.0;
        iterations = 0;
        while (iterations < 10) {
            value = value + 0.1;
            iterations++;
            System.out.println("Iteration " + iterations + ": value = " + value);
        }
        System.out.println();
        
        // Example 4: Infinite loop due to off-by-one error
        System.out.println("Example 4: Infinite loop due to off-by-one error");
        int[] numbers = {1, 2, 3, 4, 5};
        int index = 0;
        
        System.out.println("Incorrect loop (commented out to prevent infinite loop):");
        System.out.println("while (index <= numbers.length) { // Error: Should be < not <=");
        System.out.println("    System.out.println(\"Number: \" + numbers[index]);");
        System.out.println("    index++;");
        System.out.println("}");
        
        System.out.println("\nThis would cause an ArrayIndexOutOfBoundsException when index = 5,");
        System.out.println("but if the exception were caught and ignored, it would be an infinite loop");
        
        System.out.println("\nCorrect version:");
        index = 0;
        while (index < numbers.length) {
            System.out.println("Number: " + numbers[index]);
            index++;
        }
        System.out.println();
        
        // Summary
        System.out.println("--- Common Errors Leading to Infinite Loops ---");
        System.out.println("1. Updating loop variables in the wrong direction");
        System.out.println("2. Logical errors that prevent the condition from ever becoming false");
        System.out.println("3. Floating-point precision issues when using exact equality");
        System.out.println("4. Off-by-one errors in array or collection processing");
        System.out.println("5. Forgetting to update the loop control variable");
        System.out.println("6. Resetting the loop control variable inappropriately");
    }
}
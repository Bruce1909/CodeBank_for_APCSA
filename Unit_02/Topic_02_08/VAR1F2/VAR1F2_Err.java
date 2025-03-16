/**
 * VAR1F2_Err - Integer Methods and Constructors Error Example
 * 
 * This program demonstrates common errors related to VAR-1.F.2:
 * The Integer methods and constructors that are part of the Java Quick Reference.
 */
public class VAR1F2_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors related to VAR-1.F.2\n");
        
        // ERROR 1: Misunderstanding Integer constructor deprecation
        System.out.println("ERROR 1: Misunderstanding Integer constructor deprecation");
        System.out.println("Integer constructors are deprecated in newer Java versions");
        System.out.println("but are still part of the AP exam Java Quick Reference");
        
        // Showing the deprecated constructor (still valid for AP exam)
        Integer num1 = new Integer(42);
        System.out.println("Using deprecated constructor: " + num1);
        
        // Better modern alternatives
        System.out.println("Modern alternatives:");
        System.out.println("- Integer.valueOf(42): " + Integer.valueOf(42));
        System.out.println("- Autoboxing: Integer num = 42");
        System.out.println();
        
        // ERROR 2: Confusion between MIN_VALUE/MAX_VALUE and other boundary values
        System.out.println("ERROR 2: Confusion between MIN_VALUE/MAX_VALUE and other boundary values");
        
        // Common misconception
        System.out.println("Common misconception: Integer.MIN_VALUE is 0 or -1");
        System.out.println("Actual Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        
        System.out.println("Common misconception: Integer.MAX_VALUE is 255 or 65535");
        System.out.println("Actual Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println();
        
        // ERROR 3: Not handling overflow correctly
        System.out.println("ERROR 3: Not handling overflow correctly");
        
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE: " + maxInt);
        
        // This will overflow without warning
        int overflowResult = maxInt + 1;
        System.out.println("After adding 1: " + overflowResult);
        System.out.println("This demonstrates silent overflow - the result wraps to a negative number");
        
        // Better approach: check before operation
        System.out.println("\nBetter approach - check before operation:");
        if (maxInt == Integer.MAX_VALUE) {
            System.out.println("Cannot add more without overflow");
            // Use long or BigInteger for larger values
            long largeResult = (long)maxInt + 1;
            System.out.println("Using long instead: " + largeResult);
        }
        System.out.println();
        
        // ERROR 4: Misusing intValue() method
        System.out.println("ERROR 4: Misusing intValue() method");
        
        // Unnecessary use of intValue()
        Integer num2 = new Integer(100);
        int primitiveInt = num2.intValue();  // Explicit unboxing
        int result = primitiveInt + 5;
        
        System.out.println("Unnecessarily verbose code:");
        System.out.println("Integer num2 = new Integer(100);");
        System.out.println("int primitiveInt = num2.intValue();  // Explicit unboxing");
        System.out.println("int result = primitiveInt + 5;");
        
        System.out.println("\nMore concise with automatic unboxing:");
        System.out.println("Integer num2 = 100;  // Using autoboxing");
        System.out.println("int result = num2 + 5;  // Automatic unboxing");
        System.out.println();
        
        // ERROR 5: NullPointerException with intValue()
        System.out.println("ERROR 5: NullPointerException with intValue()");
        
        Integer nullInteger = null;
        try {
            // This will throw NullPointerException
            int value = nullInteger.intValue();
            System.out.println("Value: " + value);  // This line won't execute
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Cannot call intValue() on null Integer");
        }
        
        // Summary
        System.out.println("\n--- Common Errors with Integer Methods and Constants ---");
        System.out.println("1. Not knowing that Integer constructors are deprecated but still in AP exam");
        System.out.println("2. Confusing MIN_VALUE/MAX_VALUE with other common boundary values");
        System.out.println("3. Not handling integer overflow correctly");
        System.out.println("4. Using intValue() unnecessarily when automatic unboxing would work");
        System.out.println("5. Calling methods on null Integer objects");
    }
}
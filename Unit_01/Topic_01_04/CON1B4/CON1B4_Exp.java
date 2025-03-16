/**
 * CON1B4_Exp.java
 * 
 * This program demonstrates compound assignment operators in Java.
 * Knowledge Point: CON-1.B.4 - Compound assignment operators (+=, −=, *=, /=, %=) 
 * can be used in place of the assignment operator.
 */
public class CON1B4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating Compound Assignment Operators:\n");
        
        // Example 1: Addition assignment operator (+=)
        System.out.println("Example 1: Addition assignment operator (+=)");
        int score = 85;
        System.out.println("Initial score: " + score);
        
        score += 10;  // Equivalent to: score = score + 10;
        System.out.println("After score += 10: " + score);
        System.out.println();
        
        // Example 2: Subtraction assignment operator (-=)
        System.out.println("Example 2: Subtraction assignment operator (-=)");
        double balance = 100.50;
        System.out.println("Initial balance: $" + balance);
        
        balance -= 25.75;  // Equivalent to: balance = balance - 25.75;
        System.out.println("After balance -= 25.75: $" + balance);
        System.out.println();
        
        // Example 3: Multiplication assignment operator (*=)
        System.out.println("Example 3: Multiplication assignment operator (*=)");
        int quantity = 5;
        System.out.println("Initial quantity: " + quantity);
        
        quantity *= 3;  // Equivalent to: quantity = quantity * 3;
        System.out.println("After quantity *= 3: " + quantity);
        System.out.println();
        
        // Example 4: Division assignment operator (/=)
        System.out.println("Example 4: Division assignment operator (/=)");
        double price = 120.0;
        System.out.println("Initial price: $" + price);
        
        price /= 4;  // Equivalent to: price = price / 4;
        System.out.println("After price /= 4: $" + price);
        
        int items = 10;
        System.out.println("Initial items: " + items);
        
        items /= 3;  // Equivalent to: items = items / 3; (integer division)
        System.out.println("After items /= 3: " + items + " (integer division truncates the decimal part)");
        System.out.println();
        
        // Example 5: Modulus assignment operator (%=)
        System.out.println("Example 5: Modulus assignment operator (%=)");
        int number = 17;
        System.out.println("Initial number: " + number);
        
        number %= 5;  // Equivalent to: number = number % 5;
        System.out.println("After number %= 5: " + number + " (remainder of division by 5)");
        System.out.println();
        
        // Example 6: Compound assignment with expressions
        System.out.println("Example 6: Compound assignment with expressions");
        int a = 10;
        int b = 5;
        System.out.println("a = " + a + ", b = " + b);
        
        a += b * 2;  // Equivalent to: a = a + (b * 2);
        System.out.println("After a += b * 2: " + a);
        System.out.println();
        
        // Example 7: Compound assignment with type conversion
        System.out.println("Example 7: Compound assignment with type conversion");
        int intValue = 10;
        double doubleValue = 2.5;
        System.out.println("intValue = " + intValue + ", doubleValue = " + doubleValue);
        
        // intValue += doubleValue;  // Equivalent to: intValue = (int)(intValue + doubleValue);
        // The compound assignment operator performs an implicit cast
        intValue += doubleValue;  // This works because += includes an implicit cast
        System.out.println("After intValue += doubleValue: " + intValue + " (implicit cast occurs)");
        System.out.println();
        
        // Summary of key points
        System.out.println("--- Key Points about Compound Assignment Operators ---");
        System.out.println("1. Compound assignment operators (+=, -=, *=, /=, %=) can be used in place of the assignment operator (CON-1.B.4)");
        System.out.println("2. They perform the operation and assignment in one step");
        System.out.println("3. They are more concise than using the regular assignment operator");
        System.out.println("4. The expression on the right is evaluated first, then the operation is performed");
        System.out.println("5. Compound assignment operators include an implicit cast when needed");
    }
}
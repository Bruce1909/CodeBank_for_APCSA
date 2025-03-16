/**
 * VAR-2.E.1 Example
 * Iteration statements can be used to access all the elements in an ArrayList.
 * This is called traversing the ArrayList.
 * 
 * This program demonstrates different ways to traverse an ArrayList.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class VAR2E1_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating different ways to traverse an ArrayList:\n");
        
        // Create and populate an ArrayList
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Sydney");
        
        System.out.println("Original ArrayList: " + cities);
        
        // Method 1: Using a standard for loop with index
        System.out.println("\n1. Traversing with a standard for loop:");
        for (int i = 0; i < cities.size(); i++) {
            String city = cities.get(i);
            System.out.println("  Index " + i + ": " + city);
        }
        
        // Method 2: Using an enhanced for loop (for-each)
        System.out.println("\n2. Traversing with an enhanced for loop:");
        for (String city : cities) {
            System.out.println("  City: " + city);
        }
        
        // Method 3: Using a while loop with index
        System.out.println("\n3. Traversing with a while loop:");
        int index = 0;
        while (index < cities.size()) {
            String city = cities.get(index);
            System.out.println("  Index " + index + ": " + city);
            index++;
        }
        
        // Method 4: Using an Iterator
        System.out.println("\n4. Traversing with an Iterator:");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println("  City: " + city);
        }
        
        // Demonstrating processing during traversal
        System.out.println("\n5. Processing elements during traversal:");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        
        System.out.println("  Original numbers: " + numbers);
        
        // Calculate sum using standard for loop
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("  Sum of all numbers: " + sum);
        
        // Find maximum using enhanced for loop
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("  Maximum number: " + max);
        
        // Count elements meeting a condition using while loop
        int count = 0;
        int i = 0;
        while (i < numbers.size()) {
            if (numbers.get(i) > 15) {
                count++;
            }
            i++;
        }
        System.out.println("  Count of numbers greater than 15: " + count);
    }
}
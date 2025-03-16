/**
 * VAR-2.D.6 Error Example
 * The ArrayList class is part of the java.util package. An import statement can be used
 * to make this class available for use in the program.
 * 
 * This program demonstrates common errors related to importing and using the ArrayList class.
 */
// Note: The import statement is intentionally commented out to demonstrate the error
// import java.util.ArrayList;

public class VAR2D6_Err {
    public static void main(String[] args) {
        System.out.println("Demonstrating common errors when importing and using ArrayList:\n");
        
        // ERROR 1: Forgetting to import java.util.ArrayList
        System.out.println("Error 1: Forgetting to import java.util.ArrayList");
        System.out.println("The following code would not compile if uncommented:");
        System.out.println("// ArrayList<String> list = new ArrayList<String>(); // Error: cannot find symbol");
        
        // Correct way: Use the fully qualified name when not importing
        System.out.println("\nCorrect way without import: Use the fully qualified name");
        java.util.ArrayList<String> list1 = new java.util.ArrayList<String>();
        list1.add("Hello");
        list1.add("World");
        System.out.println("list1 using fully qualified name: " + list1);
        
        // ERROR 2: Incorrect import statement
        System.out.println("\nError 2: Incorrect import statement");
        System.out.println("The following import statements would cause errors:");
        System.out.println("// import ArrayList; // Error: cannot find symbol");
        System.out.println("// import java.ArrayList; // Error: package java does not exist");
        System.out.println("// import java.util.arraylist; // Error: cannot find symbol (case sensitive)");
        
        // ERROR 3: Using ArrayList without consistent qualification
        System.out.println("\nError 3: Using ArrayList without consistent qualification");
        System.out.println("The following code would not compile if uncommented:");
        System.out.println("// java.util.ArrayList<String> list2 = new ArrayList<String>(); // Error: cannot find symbol");
        
        // Correct way: Be consistent with qualification
        System.out.println("\nCorrect way: Be consistent with qualification");
        java.util.ArrayList<Integer> list3 = new java.util.ArrayList<Integer>();
        list3.add(10);
        list3.add(20);
        System.out.println("list3 with consistent qualification: " + list3);
        
        // ERROR 4: Confusing ArrayList with other collection classes
        System.out.println("\nError 4: Confusing ArrayList with other collection classes");
        System.out.println("The following code would not compile if uncommented:");
        System.out.println("// import java.util.List; // This imports the List interface, not ArrayList");
        System.out.println("// List<String> list4 = new List<String>(); // Error: List is an interface, cannot be instantiated");
        
        // Correct way: Import both List and ArrayList if using List as a reference type
        System.out.println("\nCorrect way when using List interface:");
        System.out.println("// import java.util.List;");
        System.out.println("// import java.util.ArrayList;");
        System.out.println("// List<String> list5 = new ArrayList<String>(); // Correct: List is interface, ArrayList is implementation");
        
        // ERROR 5: Importing the wrong package
        System.out.println("\nError 5: Importing the wrong package");
        System.out.println("The following import statements would not help:");
        System.out.println("// import java.awt.List; // This imports a different List class from AWT");
        System.out.println("// import javax.swing.JList; // This imports JList, not ArrayList");
        
        // Summary of correct import approaches
        System.out.println("\nSummary of correct approaches:");
        System.out.println("1. import java.util.ArrayList; // Import just ArrayList");
        System.out.println("2. import java.util.*; // Import all classes from java.util");
        System.out.println("3. Use fully qualified name: java.util.ArrayList<Type>");
    }
}
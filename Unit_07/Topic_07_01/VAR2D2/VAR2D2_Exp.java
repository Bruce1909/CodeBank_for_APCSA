/**
 * VAR-2.D.2 Example
 * The ArrayList constructor ArrayList() constructs an empty list.
 * 
 * This program demonstrates how to create an empty ArrayList using the
 * default constructor and how to work with it.
 */
import java.util.ArrayList;

public class VAR2D2_Exp {
    public static void main(String[] args) {
        // Demonstrate creating an empty ArrayList using the default constructor
        System.out.println("Creating an empty ArrayList using the default constructor:");
        ArrayList<String> emptyList = new ArrayList<String>();
        
        // Check if the list is empty
        System.out.println("\nIs the list empty? " + (emptyList.size() == 0));
        System.out.println("Current size of the list: " + emptyList.size());
        
        // Add elements to the initially empty list
        System.out.println("\nAdding elements to the initially empty list:");
        emptyList.add("First");
        emptyList.add("Second");
        emptyList.add("Third");
        
        // Display the list after adding elements
        System.out.println("List after adding elements: " + emptyList);
        System.out.println("Current size of the list: " + emptyList.size());
        
        // Demonstrate creating empty ArrayLists of different types
        System.out.println("\nCreating empty ArrayLists of different types:");
        
        // ArrayList of Integer objects
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Empty ArrayList<Integer> created, size: " + numbers.size());
        
        // ArrayList of Double objects
        ArrayList<Double> decimals = new ArrayList<Double>();
        System.out.println("Empty ArrayList<Double> created, size: " + decimals.size());
        
        // ArrayList of custom objects
        ArrayList<Book> books = new ArrayList<Book>();
        System.out.println("Empty ArrayList<Book> created, size: " + books.size());
        
        // Add elements to the books ArrayList
        books.add(new Book("Java Programming", "John Smith"));
        books.add(new Book("Data Structures", "Jane Doe"));
        
        // Display the books list
        System.out.println("\nBooks after adding elements:");
        for (Book book : books) {
            System.out.println(book);
        }
        
        // Demonstrate creating an ArrayList with initial capacity
        System.out.println("\nCreating an ArrayList with initial capacity:");
        // Note: This still creates an empty list, but with space pre-allocated for efficiency
        ArrayList<String> withCapacity = new ArrayList<String>(10);
        System.out.println("Is the list with capacity empty? " + (withCapacity.size() == 0));
        System.out.println("Size of the list with capacity: " + withCapacity.size());
    }
}

// A simple Book class for demonstration
class Book {
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}
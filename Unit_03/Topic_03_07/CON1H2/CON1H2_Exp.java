/**
 * CON-1.H.2: Object reference values can be compared, using `==` and `!=`, to identify aliases.
 *
 * This example demonstrates how to use == and != operators to compare object references
 * and identify when two references are aliases (point to the same object).
 */
public class CON1H2_Exp {
    public static void main(String[] args) {
        // Create a Book object
        Book book1 = new Book("Java Programming", "John Smith");
        
        // Create an alias to the same Book object
        Book book2 = book1;
        
        // Create a different Book object with the same values
        Book book3 = new Book("Java Programming", "John Smith");
        
        // Using == to identify aliases
        System.out.println("Comparing references using == operator:");
        System.out.println("book1 == book2: " + (book1 == book2));
        System.out.println("book1 == book3: " + (book1 == book3));
        
        // Using != to identify non-aliases
        System.out.println("\nComparing references using != operator:");
        System.out.println("book1 != book2: " + (book1 != book2));
        System.out.println("book1 != book3: " + (book1 != book3));
        
        // Demonstrate that changes to an alias affect the original object
        System.out.println("\nInitial values:");
        System.out.println("book1: " + book1.getTitle() + " by " + book1.getAuthor());
        System.out.println("book2: " + book2.getTitle() + " by " + book2.getAuthor());
        
        // Modify through the alias
        book2.setTitle("Advanced Java Programming");
        
        // Show that both references reflect the change
        System.out.println("\nAfter modifying through book2:");
        System.out.println("book1: " + book1.getTitle() + " by " + book1.getAuthor());
        System.out.println("book2: " + book2.getTitle() + " by " + book2.getAuthor());
        
        // Demonstrate that changes to a non-alias don't affect other objects
        System.out.println("\nModifying book3 (not an alias):");
        book3.setTitle("Java Fundamentals");
        System.out.println("book1: " + book1.getTitle() + " by " + book1.getAuthor());
        System.out.println("book3: " + book3.getTitle() + " by " + book3.getAuthor());
    }
}

/**
 * A simple Book class to demonstrate object references
 */
class Book {
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
}
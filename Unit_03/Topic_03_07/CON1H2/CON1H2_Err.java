/**
 * CON-1.H.2: Object reference values can be compared, using `==` and `!=`, to identify aliases.
 *
 * This example demonstrates common errors when using == and != operators with object references.
 * It shows the misconception of using these operators to compare object content rather than references.
 */
public class CON1H2_Err {
    public static void main(String[] args) {
        // Create two Book objects with the same content
        Book book1 = new Book("Data Structures", "Jane Doe");
        Book book2 = new Book("Data Structures", "Jane Doe");
        
        // MISCONCEPTION: Using == to check if two objects have the same content
        System.out.println("Comparing objects with the same content using ==:");
        System.out.println("book1 == book2: " + (book1 == book2));
        System.out.println("The result is false because == compares references, not content.");
        
        // MISCONCEPTION: Thinking that == compares object values
        System.out.println("\nMISCONCEPTION: book1 and book2 should be equal because they have the same title and author.");
        System.out.println("Reality: == checks if they are the same object in memory, not if they have the same content.");
        
        // CORRECT APPROACH: Using equals() method to compare content
        System.out.println("\nCORRECT APPROACH: Using equals() to compare content:");
        System.out.println("book1.equals(book2): " + book1.equals(book2));
        System.out.println("Note: This returns false because we haven't overridden equals() in the Book class.");
        
        // Demonstrate correct use of == for aliases
        Book book3 = book1; // book3 is an alias of book1
        
        System.out.println("\nCORRECT USAGE: Using == to check for aliases:");
        System.out.println("book1 == book3: " + (book1 == book3));
        System.out.println("This returns true because book1 and book3 reference the same object.");
        
        // Demonstrate that modifying through one reference affects all aliases
        book3.setTitle("Advanced Data Structures");
        System.out.println("\nAfter modifying through book3:");
        System.out.println("book1.getTitle(): " + book1.getTitle());
        System.out.println("book3.getTitle(): " + book3.getTitle());
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
    
    // Note: We intentionally don't override equals() here to demonstrate the misconception
}
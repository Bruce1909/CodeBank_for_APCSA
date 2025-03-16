/**
 * CON-1.H.4: Often classes have their own `equals` method, which can be used to determine whether two objects of the class are equivalent.
 *
 * This example demonstrates common errors when implementing and using the equals method.
 * It shows the consequences of incorrectly overriding equals or not overriding it at all.
 */
public class CON1H4_Err {
    public static void main(String[] args) {
        // Create two Item objects with the same values
        ItemWithoutEquals item1 = new ItemWithoutEquals("Book", 19.99);
        ItemWithoutEquals item2 = new ItemWithoutEquals("Book", 19.99);
        
        // MISCONCEPTION: Expecting default equals() to compare content
        System.out.println("MISCONCEPTION: Using default equals() to compare content:");
        System.out.println("item1.equals(item2): " + item1.equals(item2));
        System.out.println("This returns false because the default equals() compares references, not content.\n");
        
        // Create two items with a poorly implemented equals method
        ItemWithBadEquals badItem1 = new ItemWithBadEquals("Pen", 2.99);
        ItemWithBadEquals badItem2 = new ItemWithBadEquals("Pen", 2.99);
        ItemWithBadEquals badItem3 = new ItemWithBadEquals("Pen", 3.99);
        
        // MISCONCEPTION: Implementing equals() without following all requirements
        System.out.println("MISCONCEPTION: Using a poorly implemented equals() method:");
        System.out.println("badItem1.equals(badItem2): " + badItem1.equals(badItem2));
        System.out.println("badItem2.equals(badItem1): " + badItem2.equals(badItem1));
        System.out.println("The equals method violates symmetry: A.equals(B) != B.equals(A)\n");
        
        // MISCONCEPTION: Not handling null or different types correctly
        System.out.println("MISCONCEPTION: Not handling null or different types correctly:");
        try {
            System.out.println("badItem1.equals(null): " + badItem1.equals(null));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: The equals method doesn't handle null properly.");
        }
        
        try {
            String stringObj = "Pen";
            System.out.println("badItem1.equals(stringObj): " + badItem1.equals(stringObj));
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: The equals method doesn't check object types properly.");
        }
        
        // MISCONCEPTION: Not overriding hashCode() when overriding equals()
        System.out.println("\nMISCONCEPTION: Not overriding hashCode() when overriding equals():");
        System.out.println("This can cause problems when using hash-based collections like HashMap or HashSet.");
        System.out.println("badItem1.hashCode(): " + badItem1.hashCode());
        System.out.println("badItem2.hashCode(): " + badItem2.hashCode());
        System.out.println("Even though badItem1.equals(badItem2) is true, their hash codes are different.");
        System.out.println("This violates the contract that equal objects must have equal hash codes.");
    }
}

/**
 * A class that doesn't override equals() - uses the default implementation from Object
 */
class ItemWithoutEquals {
    private String name;
    private double price;
    
    public ItemWithoutEquals(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    // No equals() override - will use Object.equals() which compares references
}

/**
 * A class with a poorly implemented equals() method that violates the equals contract
 */
class ItemWithBadEquals {
    private String name;
    private double price;
    
    public ItemWithBadEquals(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // BAD equals implementation - violates several requirements
    @Override
    public boolean equals(Object obj) {
        // Doesn't check for null - can cause NullPointerException
        // Doesn't check for same class - can cause ClassCastException
        
        // Directly casts without checking - unsafe!
        ItemWithBadEquals other = (ItemWithBadEquals) obj;
        
        // Only compares name, ignores price
        // This implementation is not symmetric if another implementation compares both fields
        return this.name.equals(other.name);
    }
    
    // No hashCode() override - violates the contract that equal objects must have equal hash codes
}
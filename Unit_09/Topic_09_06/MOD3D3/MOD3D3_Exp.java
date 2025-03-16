/**
 * This program demonstrates how at run-time, the method in the actual object type
 * is executed for a non-static method call (MOD-3.D.3).
 */
public class MOD3D3_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating runtime method execution (MOD-3.D.3):\n");
        
        // Create objects with different actual types but same declared type
        System.out.println("--- Creating objects with different actual types ---");
        Instrument instrument1 = new Piano();       // Piano object with Instrument reference
        Instrument instrument2 = new Guitar();      // Guitar object with Instrument reference
        Instrument instrument3 = new Trumpet();     // Trumpet object with Instrument reference
        
        // Demonstrate runtime polymorphism
        System.out.println("\n--- Demonstrating runtime polymorphism ---");
        System.out.println("Calling play() on each instrument:");
        
        System.out.println("\ninstrument1 (actual type: " + instrument1.getClass().getSimpleName() + "):");
        instrument1.play();  // Calls Piano's play() method at runtime
        
        System.out.println("\ninstrument2 (actual type: " + instrument2.getClass().getSimpleName() + "):");
        instrument2.play();  // Calls Guitar's play() method at runtime
        
        System.out.println("\ninstrument3 (actual type: " + instrument3.getClass().getSimpleName() + "):");
        instrument3.play();  // Calls Trumpet's play() method at runtime
        
        // Demonstrate with an array of objects
        System.out.println("\n--- Demonstrating with an array of objects ---");
        Instrument[] orchestra = new Instrument[3];
        orchestra[0] = new Piano();
        orchestra[1] = new Guitar();
        orchestra[2] = new Trumpet();
        
        System.out.println("Playing all instruments in the orchestra:");
        for (int i = 0; i < orchestra.length; i++) {
            System.out.println("\nInstrument " + (i + 1) + " (" + orchestra[i].getClass().getSimpleName() + "):");
            orchestra[i].play();  // The appropriate play() method is called based on actual type
        }
        
        // Demonstrate with method parameters
        System.out.println("\n--- Demonstrating with method parameters ---");
        System.out.println("Calling playInstrument() with different actual types:");
        
        playInstrument(new Piano());
        playInstrument(new Guitar());
        playInstrument(new Trumpet());
        
        // Explanation
        System.out.println("\n--- Explanation ---");
        System.out.println("1. At compile time, Java checks if the method exists in the declared type");
        System.out.println("2. At runtime, Java calls the method implementation in the actual object type");
        System.out.println("3. This is known as dynamic method dispatch or runtime polymorphism");
        System.out.println("4. The JVM determines which method to call based on the actual object type");
        System.out.println("5. This allows for flexible and extensible code");
        System.out.println("6. Static methods do not follow this rule - they are bound at compile time");
    }
    
    // Method that accepts an Instrument parameter
    public static void playInstrument(Instrument instrument) {
        System.out.println("Playing a " + instrument.getClass().getSimpleName() + ":");
        instrument.play();  // Calls the appropriate play() method based on actual type
    }
}

// Instrument class hierarchy
class Instrument {
    public void play() {
        System.out.println("Playing a generic instrument sound");
    }
}

class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing piano: Plink, plink, plink!");
    }
}

class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing guitar: Strum, strum, strum!");
    }
}

class Trumpet extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing trumpet: Toot, toot, toot!");
    }
}
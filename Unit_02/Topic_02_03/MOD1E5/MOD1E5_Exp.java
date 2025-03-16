/**
 * MOD1E5_Exp.java
 * 
 * This program demonstrates that non-static methods are called through objects of the class.
 * 
 * Knowledge Point: MOD-1.E.5
 * Non-static methods are called through objects of the class.
 */
public class MOD1E5_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating that non-static methods are called through objects:\n");
        
        // Create objects of different classes
        MOD1E5_Exp demo = new MOD1E5_Exp();
        Calculator calc = new Calculator();
        MusicPlayer player = new MusicPlayer();
        
        // Call non-static methods through the objects
        System.out.println("Calling non-static methods through the demo object:");
        demo.displayMessage();  // Called through the demo object
        
        System.out.println("\nCalling non-static methods through the calc object:");
        calc.add(5, 3);         // Called through the calc object
        calc.subtract(10, 4);   // Called through the calc object
        
        System.out.println("\nCalling non-static methods through the player object:");
        player.play();          // Called through the player object
        player.pause();         // Called through the player object
        player.stop();          // Called through the player object
        
        // Demonstrate that different objects of the same class have their own method instances
        System.out.println("\nDemonstrating that different objects have their own method instances:");
        Counter counter1 = new Counter("Counter 1");
        Counter counter2 = new Counter("Counter 2");
        
        counter1.increment();  // Increments counter1's count
        counter1.increment();  // Increments counter1's count again
        counter2.increment();  // Increments counter2's count
        
        counter1.displayCount();  // Shows counter1's count (2)
        counter2.displayCount();  // Shows counter2's count (1)
        
        // Demonstrate calling a static method for comparison
        System.out.println("\nFor comparison, calling a static method (not through an object):");
        staticMethod();  // Called directly, not through an object
    }
    
    // Non-static method - must be called through an object
    public void displayMessage() {
        System.out.println("This is a non-static method called through an object.");
    }
    
    // Static method - called directly, not through an object
    public static void staticMethod() {
        System.out.println("This is a static method called directly, not through an object.");
    }
}

// Calculator class with non-static methods
class Calculator {
    // Non-static methods - must be called through Calculator objects
    public void add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    
    public void subtract(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }
}

// MusicPlayer class with non-static methods
class MusicPlayer {
    private boolean isPlaying = false;
    
    // Non-static methods - must be called through MusicPlayer objects
    public void play() {
        isPlaying = true;
        System.out.println("Music is playing.");
    }
    
    public void pause() {
        if (isPlaying) {
            System.out.println("Music is paused.");
        } else {
            System.out.println("Nothing is playing to pause.");
        }
    }
    
    public void stop() {
        isPlaying = false;
        System.out.println("Music is stopped.");
    }
}

// Counter class to demonstrate that different objects have their own method instances
class Counter {
    private String name;
    private int count = 0;
    
    public Counter(String name) {
        this.name = name;
    }
    
    // Non-static method - each Counter object has its own increment method
    public void increment() {
        count++;
    }
    
    // Non-static method - each Counter object has its own displayCount method
    public void displayCount() {
        System.out.println(name + " count: " + count);
    }
}
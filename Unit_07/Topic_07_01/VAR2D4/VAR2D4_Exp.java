/**
 * VAR-2.D.4 Example
 * When ArrayList<E> is specified, the types of the reference parameters and return type
 * when using the methods are type E.
 * 
 * This program demonstrates how the generic type E affects method parameters and return types.
 */
import java.util.ArrayList;

public class VAR2D4_Exp {
    public static void main(String[] args) {
        System.out.println("Demonstrating how generic type E affects method parameters and return types:\n");
        
        // Create an ArrayList of String objects
        System.out.println("1. ArrayList<String> - all methods use String type");
        ArrayList<String> stringList = new ArrayList<String>();
        
        // add(E obj) - parameter is type String
        String stringToAdd = "Hello";
        stringList.add(stringToAdd); // Parameter is String
        stringList.add("World");     // Parameter is String literal
        System.out.println("After adding Strings: " + stringList);
        
        // get(int index) - return type is String
        String retrievedString = stringList.get(0); // Return type is String, no casting needed
        System.out.println("Retrieved String: " + retrievedString);
        
        // set(int index, E obj) - parameter is String, return type is String
        String oldString = stringList.set(1, "Java"); // Parameter is String, return is String
        System.out.println("Replaced '" + oldString + "' with 'Java': " + stringList);
        
        // Create an ArrayList of Integer objects
        System.out.println("\n2. ArrayList<Integer> - all methods use Integer type");
        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        // add(E obj) - parameter is type Integer
        Integer intToAdd = 10;
        intList.add(intToAdd);  // Parameter is Integer object
        intList.add(20);       // Parameter is auto-boxed to Integer
        System.out.println("After adding Integers: " + intList);
        
        // get(int index) - return type is Integer
        Integer retrievedInt = intList.get(0); // Return type is Integer, no casting needed
        System.out.println("Retrieved Integer: " + retrievedInt);
        
        // set(int index, E obj) - parameter is Integer, return type is Integer
        Integer oldInt = intList.set(1, 25); // Parameter is auto-boxed, return is Integer
        System.out.println("Replaced " + oldInt + " with 25: " + intList);
        
        // Create an ArrayList of a custom class
        System.out.println("\n3. ArrayList<Vehicle> - all methods use Vehicle type");
        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
        
        // add(E obj) - parameter is type Vehicle
        Vehicle car = new Vehicle("Car", 4);
        vehicleList.add(car);                      // Parameter is Vehicle object
        vehicleList.add(new Vehicle("Motorcycle", 2)); // Parameter is Vehicle object
        
        System.out.println("After adding Vehicles:");
        for (Vehicle v : vehicleList) {
            System.out.println("  " + v);
        }
        
        // get(int index) - return type is Vehicle
        Vehicle retrievedVehicle = vehicleList.get(0); // Return type is Vehicle, no casting needed
        System.out.println("\nRetrieved Vehicle: " + retrievedVehicle);
        
        // set(int index, E obj) - parameter is Vehicle, return type is Vehicle
        Vehicle oldVehicle = vehicleList.set(1, new Vehicle("Truck", 6));
        System.out.println("\nReplaced " + oldVehicle.getName() + " with Truck:");
        for (Vehicle v : vehicleList) {
            System.out.println("  " + v);
        }
    }
}

// A simple Vehicle class for demonstration
class Vehicle {
    private String name;
    private int wheels;
    
    public Vehicle(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Vehicle{name='" + name + "', wheels=" + wheels + "}";
    }
}
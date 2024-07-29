package ca.nl.cna.java2.utilities;
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        // Create a hashtable
        Hashtable<String, Integer> numbers = new Hashtable<>();

        // Add key-value pairs to the hashtable
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        // Retrieve a value
        int value = numbers.get("Two");  // Output: 2
        System.out.printf("Two: %d\n", value);

        // Check if a key exists
        boolean containsKey = numbers.containsKey("Three");  // Output: true
        System.out.printf("Contains key 'Three': %s\n", containsKey);

        // Remove a key-value pair
        numbers.remove("One");

        // Check if a value exists
        boolean containsValue = numbers.containsValue(1);  // Output: false
        System.out.printf("Contains value 'One' after removal: %s\n", containsValue);
    }
}

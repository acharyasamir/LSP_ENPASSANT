package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * Driver class to test the MapUtilities class.
 */
public class MapUtilitiesDriver {
    public static void main(String[] args) {
        // Create the first HashMap and add some key/value pairs
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Mary", "Ecstatic");
        map1.put("Bob", "Happy");
        map1.put("Felix", "Fine");
        map1.put("George", "Content");

        // Create the second HashMap and add some key/value pairs
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Mary", "Ecstatic");
        map2.put("Bob", "Happy");
        map2.put("Felix", "Sad");
        map2.put("Alice", "Fine");

        // Test the commonKeyValuePairs method
        int commonPairs = MapUtilities.commonKeyValuePairs(map1, map2);
        System.out.println("Number of common key/value pairs is: " + commonPairs);  // Expected output: 2
    }
}

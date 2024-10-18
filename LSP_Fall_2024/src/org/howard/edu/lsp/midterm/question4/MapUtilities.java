package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * Utility class that contains methods for comparing HashMaps.
 */
public class MapUtilities {

    /**
     * This method compares two HashMaps and returns the number of common key/value pairs.
     * 
     * @param map1 The first HashMap
     * @param map2 The second HashMap
     * @return The number of common key/value pairs between the two HashMaps
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Return 0 if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        // Counter to keep track of common key/value pairs
        int count = 0;

        // Loop through the first map
        for (String key : map1.keySet()) {
            // Check if the second map contains the same key and if the values are the same
            if (map2.containsKey(key) && map2.get(key).equals(map1.get(key))) {
                count++;  // Increment count if key/value pair is common
            }
        }

        // Return the count of common key/value pairs
        return count;
    }
}

package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // Read the "words.txt" file
        InputStream inputStream = WordCounter.class.getResourceAsStream("words.txt");

        // Store word frequencies in the map data structure
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"))) {
            System.out.println("Input file content:");
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);  // Display the content of the file

                // Split the line into words (ignoring non-letter characters)
                String[] words = currentLine.split("[^a-zA-Z]+");
                for (String currentWord : words) {
                    currentWord = currentWord.toLowerCase();  // Make it case-insensitive

                    // Only count words longer than 3 characters
                    if (currentWord.length() > 3) {
                        wordCountMap.put(currentWord, wordCountMap.getOrDefault(currentWord, 0) + 1);
                    }
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();  // Handle any file reading issues
        }

        // Display the word frequencies
        System.out.println("\nWord counts:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
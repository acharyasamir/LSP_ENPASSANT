package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a voting machine that can keep track of candidates and votes.
 * It allows adding candidates, casting votes, and showing results.
 */
public class VotingMachine {
    // Store candidates and their votes in a HashMap
    private Map<String, Integer> candidates;

    /**
     * Constructor to initialize an empty list of candidates.
     */
    public VotingMachine() {
        candidates = new HashMap<>();  // Using a HashMap to keep track of votes
    }

    /**
     * Adds a candidate by name. If the candidate is already in the list, nothing happens.
     * 
     * @param name the name of the candidate to add
     */
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0);  // Add the candidate with 0 initial votes
        }
    }

    /**
     * Casts a vote for the candidate with the given name. If the candidate doesn't exist, nothing happens.
     * 
     * @param name the name of the candidate to vote for
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);  // Increment the vote count by 1
        }
    }

    /**
     * Returns a string showing all candidates and their vote counts.
     * 
     * @return a string with the candidates and their votes
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();  // Using StringBuilder for efficiency
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();  // Return the formatted string
    }
}



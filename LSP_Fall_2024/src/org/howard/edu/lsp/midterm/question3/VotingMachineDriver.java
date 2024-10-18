package org.howard.edu.lsp.midterm.question3;

/**
 * A driver class to test the VotingMachine class by adding candidates and casting votes.
 */
public class VotingMachineDriver {
    public static void main(String[] args) {
        // Creating a new VotingMachine object
        VotingMachine vm = new VotingMachine();

        // Adding candidates and casting votes
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");

        // Printing the results
        System.out.println(vm.toString());  // Expected output: Alsobrooks: 1 votes, Hogan: 0 votes
    }
}

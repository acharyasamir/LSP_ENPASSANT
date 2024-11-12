package org.howard.edu.lsp.assignment6;

/**
 * Custom exception for handling errors specific to IntegerSet operations.
 */
public class IntegerSetException extends Exception {

    /**
     * Constructor that accepts a custom error message.
     * @param message the error message associated with the exception
     */
    public IntegerSetException(String message) {
        super(message);
    }
}

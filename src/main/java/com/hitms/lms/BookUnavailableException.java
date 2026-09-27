package com.hitms.lms;

/**
 * Thrown when a book cannot be issued because no copy of it is available.
 */
public class BookUnavailableException extends Exception {

    /**
     * Creates the exception with a message explaining the failure.
     *
     * @param message the message shown to the user
     */
    public BookUnavailableException(String message) {
        super(message);
    }
}

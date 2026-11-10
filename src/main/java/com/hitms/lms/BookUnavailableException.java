package com.hitms.lms;

/**
 * Thrown when a book cannot be issued because no copy of it is available.
 */
public class BookUnavailableException extends Exception {

    /** Fixed so the class keeps a stable form when it is
     *  serialised by a framework. */
    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception with a message explaining the failure.
     *
     * @param message the message shown to the user
     */
    public BookUnavailableException(String message) {
        super(message);
    }
}

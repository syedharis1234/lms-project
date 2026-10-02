/**
 * Thrown when a title has no copy left to issue.
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

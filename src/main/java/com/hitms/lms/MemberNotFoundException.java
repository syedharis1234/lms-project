package com.hitms.lms;

/**
 * Thrown when a member cannot be found in the member register.
 */
public class MemberNotFoundException extends Exception {

    /** Fixed so the class keeps a stable form when it is
     *  serialised by a framework. */
    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception with a message explaining the failure.
     *
     * @param memberId the card number that was searched for
     */
    public MemberNotFoundException(int memberId) {
        super("No member on file with card number " + memberId + ".");
    }
}

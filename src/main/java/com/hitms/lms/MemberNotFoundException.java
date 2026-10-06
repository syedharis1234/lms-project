package com.hitms.lms;

/**
 * Thrown when a member cannot be found in the member register.
 */
public class MemberNotFoundException extends Exception {

    /**
     * Creates the exception with a message explaining the failure.
     *
     * @param memberId the card number that was searched for
     */
    public MemberNotFoundException(int memberId) {
        super("No member on file with card number " + memberId + ".");
    }
}

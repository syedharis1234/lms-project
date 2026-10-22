package com.hitms.lms;

/**
 * Something that wants to hear when a loan goes overdue.
 */
@FunctionalInterface
public interface LoanObserver {

    /**
     * Called when the loan being watched has passed its due date.
     *
     * @param item the item that is overdue
     * @param memberName the member who borrowed it
     */
    void onOverdue(LibraryItem item, String memberName);
}

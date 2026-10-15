package com.hitms.lms;

/**
 * A printed book, lent for a fortnight.
 */
public class Book extends LibraryItem {

    /**
     * Creates a book.
     *
     * @param title the title shown on the spine
     * @param itemId the catalogue code for this copy
     */
    public Book(String title, String itemId) {
        super(title, itemId);
    }

    /**
     * Returns the loan period for a book.
     *
     * @return 14 days
     */
    @Override
    public int getLoanPeriodDays() {
        return 14;
    }
}

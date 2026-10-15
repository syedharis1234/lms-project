package com.hitms.lms;

/**
 * A periodical, lent for three days only.
 */
public class Magazine extends LibraryItem {

    /**
     * Creates a periodical.
     *
     * @param title the title on the cover
     * @param itemId the catalogue code for this copy
     */
    public Magazine(String title, String itemId) {
        super(title, itemId);
    }

    /**
     * Returns the loan period for a periodical.
     *
     * @return 3 days
     */
    @Override
    public int getLoanPeriodDays() {
        return 3;
    }
}

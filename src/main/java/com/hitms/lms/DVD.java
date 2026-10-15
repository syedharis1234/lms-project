package com.hitms.lms;

/**
 * A disc, lent for a week.
 */
public class DVD extends LibraryItem {

    /**
     * Creates a disc.
     *
     * @param title the title on the case
     * @param itemId the catalogue code for this copy
     */
    public DVD(String title, String itemId) {
        super(title, itemId);
    }

    /**
     * Returns the loan period for a disc.
     *
     * @return 7 days
     */
    @Override
    public int getLoanPeriodDays() {
        return 7;
    }
}

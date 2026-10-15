package com.hitms.lms;

/**
 * Common parent for everything the library lends out.
 *
 * <p>An item is identified by a title and an item id, and knows how long it
 * may be borrowed for. Subclasses decide that period.</p>
 */
public abstract class LibraryItem {

    /** The title shown on the spine. */
    protected final String title;

    /** The catalogue code for this copy. */
    protected final String itemId;

    /**
     * Stores the parts every item type has.
     *
     * @param title the title shown on the spine
     * @param itemId the catalogue code for this copy
     */
    protected LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    /**
     * Returns how many days this item type may be borrowed for.
     *
     * @return the loan period in days
     */
    public abstract int getLoanPeriodDays();

    /**
     * Returns the title and the catalogue code.
     *
     * @return a readable form of the item
     */
    @Override
    public String toString() {
        return title + " (" + itemId + ")";
    }
}

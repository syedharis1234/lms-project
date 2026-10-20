package com.hitms.lms;

/**
 * Builds the right {@link LibraryItem} subclass from a type name.
 *
 * <p>Factory: callers ask for a "dvd" and get a {@link DVD}, without ever
 * naming the class themselves.</p>
 */
public class LibraryItemFactory {

    private LibraryItemFactory() {
        // Utility class, never built.
    }

    /**
     * Creates the item subtype named by itemType.
     *
     * @param itemType the type to build, for example book, dvd or magazine
     * @param title the title shown on the item
     * @param itemId the catalogue code for this copy
     * @return the matching LibraryItem instance
     * @throws IllegalArgumentException when the type is not one we stock
     */
    public static LibraryItem createLibraryItem(String itemType, String title,
                                                String itemId) {
        return switch (itemType.toLowerCase()) {
            case "book" -> new Book(title, itemId);
            case "dvd" -> new DVD(title, itemId);
            case "magazine" -> new Magazine(title, itemId);
            default -> throw new IllegalArgumentException("Unknown item type: " + itemType);
        };
    }

    /**
     * Builds one item and reports what came back.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        LibraryItem item = createLibraryItem("dvd", "The Matrix", "D-014");
        System.out.println(item.getClass().getSimpleName()
                + " -> " + item.getLoanPeriodDays() + " days");
    }
}

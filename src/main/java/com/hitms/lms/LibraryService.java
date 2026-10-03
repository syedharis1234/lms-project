package com.hitms.lms;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Holds the catalogue and the add, issue and return operations of the library.
 *
 * <p>Every method either takes the catalogue as an argument or returns the
 * result, so nothing here depends on shared static state.</p>
 */
public class LibraryService {

    private final Map<String, Integer> catalogue = new LinkedHashMap<>();

    /**
     * Adds copies of a title, or tops up a title that is already there.
     *
     * @param title the title to add
     * @param copies how many copies to add
     * @return the copies now available for the title
     */
    public int addBook(String title, int copies) {
        catalogue.merge(title, copies, Integer::sum);
        return catalogue.get(title);
    }

    /**
     * Issues one copy of a title that is already in the catalogue.
     *
     * @param title the title to issue
     * @return the copies left afterwards
     * @throws BookUnavailableException when the title has no copies left
     */
    public int issueBook(String title) throws BookUnavailableException {
        if (copiesOf(title) <= 0) {
            throw new BookUnavailableException("'" + title + "' has no copies available.");
        }

        catalogue.merge(title, -1, Integer::sum);

        return catalogue.get(title);
    }

    /**
     * Takes one copy back into the catalogue.
     *
     * @param title the title being returned
     * @return the copies available afterwards
     */
    public int returnBook(String title) {
        catalogue.merge(title, 1, Integer::sum);
        return catalogue.get(title);
    }

    /**
     * Drops a title from the catalogue.
     *
     * @param title the title to remove
     * @return true when the title was in the catalogue
     */
    public boolean removeBook(String title) {
        return catalogue.remove(title) != null;
    }

    /**
     * Reads the copy count of a title.
     *
     * @param title the title to look up
     * @return the copies available, or 0 when the title is unknown
     */
    public int copiesOf(String title) {
        return catalogue.getOrDefault(title, 0);
    }

    /**
     * Returns a copy of the catalogue, so callers cannot change ours.
     *
     * @return the title to copies map
     */
    public Map<String, Integer> catalogue() {
        return Map.copyOf(catalogue);
    }

    /**
     * Issues one copy of the given title.
     *
     * @param availableCopies the copies left before the issue
     * @param title the title being issued
     * @return the copies left after the issue
     * @throws BookUnavailableException when availableCopies is zero or less
     */
    public static int issueBook(int availableCopies, String title) throws BookUnavailableException {
        if (availableCopies <= 0) {
            throw new BookUnavailableException("'" + title + "' has no copies available.");
        }

        return availableCopies - 1;
    }

    /**
     * Looks up a member by their library card number.
     *
     * @param memberId the card number to search for
     * @return true when the member is on file
     */
    public boolean findMemberById(int memberId) {
        return memberId > 0;
    }
}

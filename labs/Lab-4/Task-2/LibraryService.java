/**
 * Issues books and refuses the issue when no copy is left.
 */
public class LibraryService {

    /**
     * Returns the copy count after issuing one copy of the given title.
     *
     * @param availableCopies the copies left before the issue
     * @param title the title being issued
     * @return the copies left afterwards
     * @throws BookUnavailableException when availableCopies is 0
     */
    public static int issueBook(int availableCopies, String title) throws BookUnavailableException {
        if (availableCopies <= 0) {
            throw new BookUnavailableException("'" + title + "' has no copies available.");
        }
        return availableCopies - 1;
    }

    /**
     * Shows one issue that works and one that raises the exception.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        try {
            System.out.println("Remaining copies: " + issueBook(3, "Clean Code"));
            issueBook(0, "Clean Code");
        } catch (BookUnavailableException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}

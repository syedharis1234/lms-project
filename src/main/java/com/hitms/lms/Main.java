package com.hitms.lms;

import com.hitms.lms.util.LibraryUtils;

/**
 * Entry point of the library application.
 */
public class Main {

    /**
     * Loads the catalogue, issues a book and reports the failures.
     *
     * @param args not used
     * @throws BookUnavailableException when a demo issue has no copy left
     */
    public static void main(String[] args) throws BookUnavailableException {
        LibraryService library = new LibraryService();

        library.addBook("Clean Code", 3);
        library.addBook("The Pragmatic Programmer", 2);

        System.out.println("Catalogue:");
        library.catalogue().forEach((title, count) -> System.out.println("  " + title + ": " + count));
        System.out.println("Copies of Clean Code: " + library.copiesOf("Clean Code"));
        System.out.println("Formatted title: " + LibraryUtils.formatTitle(" the great gatsby "));

        System.out.println("Copies left after issuing: " + library.issueBook("Clean Code"));
        System.out.println("Copies left after the static issue: " + LibraryService.issueBook(3, "Clean Code"));

        try {
            LibraryService.issueBook(0, "Clean Code");
        } catch (BookUnavailableException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}

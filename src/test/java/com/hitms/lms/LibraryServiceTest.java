package com.hitms.lms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Covers the catalogue operations of {@link LibraryService}.
 */
class LibraryServiceTest {

    @Test
    void addBookIncreasesCopies() {
        LibraryService service = new LibraryService();
        assertEquals(3, service.addBook("Clean Code", 3));
    }

    @Test
    void issueBookDecreasesCopies() throws BookUnavailableException {
        LibraryService service = new LibraryService();
        service.addBook("Clean Code", 2);
        assertEquals(1, service.issueBook("Clean Code"));
    }

    @Test
    void returnBookIncreasesCopies() throws BookUnavailableException {
        LibraryService service = new LibraryService();
        service.addBook("Clean Code", 1);
        service.issueBook("Clean Code");
        assertEquals(1, service.returnBook("Clean Code"));
    }

    @Test
    void staticIssueBookTakesOneAway() throws BookUnavailableException {
        assertEquals(2, LibraryService.issueBook(3, "Clean Code"));
    }

    @Test
    void issueBookThrowsWhenNoCopiesAreLeft() {
        LibraryService service = new LibraryService();
        service.addBook("Clean Code", 0);
        assertThrows(BookUnavailableException.class, () -> service.issueBook("Clean Code"));
    }

    @Test
    void issueUnknownTitleThrows() {
        LibraryService service = new LibraryService();
        assertThrows(BookUnavailableException.class, () -> service.issueBook("Never Added"));
    }

    @Test
    void addBookRejectsANegativeCount() {
        LibraryService service = new LibraryService();
        assertThrows(IllegalArgumentException.class, () -> service.addBook("Clean Code", -2));
    }

    @Test
    void issueBookReportsTheCopiesLeft() throws BookUnavailableException {
        LibraryService service = new LibraryService();
        service.addBook("Clean Code", 3);
        assertEquals(3, service.issueBook("Clean Code"));
    }

    @Test
    void removeBookDropsTheTitle() {
        LibraryService service = new LibraryService();
        service.addBook("Clean Code", 1);
        assertTrue(service.removeBook("Clean Code"));
        assertEquals(0, service.copiesOf("Clean Code"));
    }
}

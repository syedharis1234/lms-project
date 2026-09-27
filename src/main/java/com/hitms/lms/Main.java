package com.hitms.lms;

import com.hitms.lms.util.LibraryUtils;

/**
 * Entry point of the library application.
 */
public class Main {

    /**
     * Loads the catalogue and prints what is in it.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        LibraryService library = new LibraryService();

        library.addBook("Clean Code", 3);
        library.addBook("The Pragmatic Programmer", 2);

        System.out.println("Catalogue:");
        library.catalogue().forEach((title, count) -> System.out.println("  " + title + ": " + count));
        System.out.println("Copies of Clean Code: " + library.copiesOf("Clean Code"));
        System.out.println("Formatted title: " + LibraryUtils.formatTitle(" the great gatsby "));
    }
}

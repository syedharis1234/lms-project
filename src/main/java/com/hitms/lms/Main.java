package com.hitms.lms;

public class Main {

    public static void main(String[] args) {
        LibraryService library = new LibraryService();

        library.addBook("Clean Code", 3);
        library.addBook("The Pragmatic Programmer", 2);

        System.out.println("Catalogue:");
        library.catalogue().forEach((title, count) -> System.out.println("  " + title + ": " + count));
        System.out.println("Copies of Clean Code: " + library.copiesOf("Clean Code"));
    }
}

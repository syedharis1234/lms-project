package com.hitms.lms;

import java.util.List;

/**
 * Shows one list holding three different item types.
 *
 * <p>The loop only ever calls the abstract method, so each element behaves
 * according to the class it really is.</p>
 */
public class PolymorphismDemo {

    /**
     * Prints the loan period of every item in a mixed catalogue.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        List<LibraryItem> catalogue = List.of(
                new Book("Clean Code", "B-001"),
                new DVD("The Matrix", "D-014"),
                new Magazine("National Geographic", "M-102"));

        for (LibraryItem item : catalogue) {
            System.out.println(item + ": loan period = "
                    + item.getLoanPeriodDays() + " days");
        }

        // The next line is left commented out on purpose:
        // LibraryItem untyped = new LibraryItem("Untyped Item", "X-000");
        // Compiler error: "LibraryItem is abstract; cannot be instantiated"
    }
}

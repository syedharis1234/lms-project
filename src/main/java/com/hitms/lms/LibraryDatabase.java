package com.hitms.lms;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A single, shared in-memory "connection" to the library catalogue.
 *
 * <p>Singleton: however many times {@link #getInstance()} is called it hands
 * back the same object, so the whole application sees one catalogue.</p>
 */
public class LibraryDatabase {

    /** The one and only instance, created on first use. */
    private static LibraryDatabase instance;

    /** Item code to title, shared by everything using this instance. */
    public final Map<String, String> records = new LinkedHashMap<>();

    private LibraryDatabase() {
        // Private so nobody can build a second one.
    }

    /**
     * Returns the shared instance, building it if this is the first call.
     *
     * @return the one shared instance
     */
    public static synchronized LibraryDatabase getInstance() {
        if (instance == null) {
            instance = new LibraryDatabase();
        }
        return instance;
    }

    /**
     * Shows that both calls really did return the same object.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        LibraryDatabase db1 = LibraryDatabase.getInstance();
        LibraryDatabase db2 = LibraryDatabase.getInstance();

        db1.records.put("B-001", "Clean Code");

        System.out.println(db2.records);  // the other handle sees it too
        System.out.println(db1 == db2);    // true -- same object
    }
}

package com.hitms.lms.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Helper methods shared by the library classes.
 */
public class LibraryUtils {

    private LibraryUtils() {
        // Utility class, never built.
    }

    /**
     * Puts a title into title case and trims the ends.
     *
     * @param title the raw title
     * @return the trimmed title in title case
     */
    public static String formatTitle(String title) {
        String trimmed = title.strip().toLowerCase();
        String[] words = trimmed.split(" ");
        StringBuilder result = new StringBuilder();

        for (String w : words) {
            if (!w.isEmpty()) {
                result.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
            }
        }

        return result.toString().strip();
    }

    /**
     * Counts the whole days between two dates.
     *
     * @param date1 the first date
     * @param date2 the second date
     * @return the number of days between them, always positive
     */
    public static long daysBetween(LocalDate date1, LocalDate date2) {
        return Math.abs(ChronoUnit.DAYS.between(date1, date2));
    }
}

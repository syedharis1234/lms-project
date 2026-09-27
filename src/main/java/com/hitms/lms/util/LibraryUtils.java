package com.hitms.lms.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryUtils {

    public static String formatTitle(String title) {
        String trimmed = title.strip().toLowerCase();
        StringBuilder result = new StringBuilder();

        for (String word : trimmed.split(" ")) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");
            }
        }

        return result.toString().strip();
    }

    public static long daysBetween(LocalDate date1, LocalDate date2) {
        return Math.abs(ChronoUnit.DAYS.between(date1, date2));
    }
}

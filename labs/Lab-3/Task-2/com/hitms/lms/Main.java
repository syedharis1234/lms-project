package com.hitms.lms;

import java.time.LocalDate;

import com.hitms.lms.util.LibraryUtils;

/**
 * Driver that imports the util module and calls into it.
 */
public class Main {

    /**
     * Calls both of the util methods and prints what they return.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println(LibraryUtils.formatTitle(" the great gatsby "));
        System.out.println(LibraryUtils.daysBetween(
                LocalDate.of(2026, 1, 1), LocalDate.of(2026, 1, 15)));
    }
}

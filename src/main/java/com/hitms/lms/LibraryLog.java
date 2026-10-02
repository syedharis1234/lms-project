package com.hitms.lms;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Writes the progress of a long run to a log file.
 */
public class LibraryLog {

    private static final Logger LOGGER = Logger.getLogger(LibraryLog.class.getName());

    /**
     * Points the logger at library.log and reports the current level.
     *
     * @param args not used
     * @throws IOException when the log file cannot be opened
     */
    public static void start(String logFile) throws IOException {
        FileHandler handler = new FileHandler(logFile, true);
        handler.setFormatter(new SimpleFormatter());

        LOGGER.addHandler(handler);
        LOGGER.setLevel(Level.INFO);

        LOGGER.info("Starting the library run...");
    }

    /**
     * Records one completed step.
     *
     * @param step the step that just finished
     */
    public static void step(String step) {
        LOGGER.info("Step completed: " + step);
    }
}

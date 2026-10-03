import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Reports progress through a logger that writes to app.log.
 */
public class AppLogger {

    private static final Logger LOGGER = Logger.getLogger(AppLogger.class.getName());

    /**
     * Sends the progress messages to the log file.
     *
     * @param args not used
     * @throws IOException if the log file cannot be opened
     */
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("app.log", true);
        fileHandler.setFormatter(new SimpleFormatter());

        LOGGER.addHandler(fileHandler);
        LOGGER.setLevel(Level.INFO);

        LOGGER.info("Starting process...");
        LOGGER.info("Step completed");
    }
}

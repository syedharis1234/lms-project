import java.util.ArrayList;
import java.util.List;

/**
 * Version B: the catalogue is passed in and the result is returned.
 */
public class CatalogueB {

    /**
     * Adds a title to the catalogue that was passed in.
     *
     * @param catalogue the catalogue to add to
     * @param title the title to add
     * @return the same catalogue, now holding the new title
     */
    public static List<String> addItem(List<String> catalogue, String title) {
        catalogue.add(title);
        return catalogue;
    }

    /**
     * Counts what the catalogue that was passed in holds.
     *
     * @param catalogue the catalogue to measure
     * @return the number of titles
     */
    public static int itemCount(List<String> catalogue) {
        return catalogue.size();
    }

    /**
     * Builds a fresh catalogue and adds two titles to it.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        List<String> catalogue = new ArrayList<>();
        addItem(catalogue, "Clean Code");
        addItem(catalogue, "The Pragmatic Programmer");
        System.out.println("itemCount = " + itemCount(catalogue));

        // A second, empty catalogue proves the methods carry no shared state.
        List<String> other = new ArrayList<>();
        System.out.println("itemCount of the fresh catalogue = " + itemCount(other));
    }
}

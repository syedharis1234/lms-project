/**
 * Version A: the count sits in a shared static field.
 *
 * <p>Kept only so the coupling can be compared with Version B.</p>
 */
public class Catalogue {

    static int catalogueCount = 0;

    /**
     * Adds a title by bumping the shared counter.
     *
     * @param title the title to add
     */
    public static void addItem(String title) {
        catalogueCount++;
    }

    /**
     * Prints the shared counter.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        addItem("Clean Code");
        addItem("The Pragmatic Programmer");
        System.out.println("catalogueCount = " + catalogueCount);
    }
}

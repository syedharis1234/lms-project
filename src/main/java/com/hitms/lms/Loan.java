package com.hitms.lms;

import java.util.ArrayList;
import java.util.List;

/**
 * One borrowing, which tells its observers when it goes overdue.
 *
 * <p>Observer: the loan keeps a list of listeners and pings all of them.</p>
 */
public class Loan {

    /** What was borrowed. */
    private final LibraryItem item;

    /** Who borrowed it. */
    private final String memberName;

    /** Everyone who wants to hear about this loan. */
    private final List<LoanObserver> observers = new ArrayList<>();

    /**
     * Records a borrowing.
     *
     * @param item what was borrowed
     * @param memberName who borrowed it
     */
    public Loan(LibraryItem item, String memberName) {
        this.item = item;
        this.memberName = memberName;
    }

    /**
     * Registers a listener for this loan.
     *
     * @param observer the listener to add
     */
    public void addObserver(LoanObserver observer) {
        observers.add(observer);
    }

    /**
     * Tells every registered listener that the loan is overdue.
     */
    public void notifyOverdue() {
        for (LoanObserver observer : observers) {
            observer.onOverdue(item, memberName);
        }
    }

    /**
     * Wires the singleton, the factory and the observer together.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        LibraryDatabase db = LibraryDatabase.getInstance();
        LibraryItem dvd = LibraryItemFactory.createLibraryItem("dvd", "The Matrix", "D-014");
        db.records.put(dvd.itemId, dvd.title);

        Loan loan = new Loan(dvd, "Aisha Khan");
        loan.addObserver((item, memberName) ->
                System.out.println("[EMAIL] " + memberName
                        + ", please return '" + item + "' -- it is overdue."));

        loan.notifyOverdue();
    }
}
